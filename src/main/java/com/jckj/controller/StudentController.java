package com.jckj.controller;

import com.jckj.dto.LayUiDto;
import com.jckj.model.Student;
import com.jckj.service.StudentService;
import com.jckj.vo.JsonResult;
import com.jckj.vo.MapVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/20
 * @Description:
 */
@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("go")
    public String go(){
        return "student-table";
    }
    /**
     * 列表
     */
    @RequestMapping("list")
    @ResponseBody
    public MapVo list(LayUiDto dto){
        MapVo map = studentService.list(dto);
        return map;
    }

    /**
     * 详情
     * @param id
     * @param model
     */
    @RequestMapping("info")
    @ResponseBody
    public void info(Integer id,Model model){
        Student student = studentService.info(id);
        model.addAttribute("student",student);
    }
    @RequestMapping("infos")
    @ResponseBody
    public void infos(@RequestParam("ids[]") Integer[] ids,Model model){
        Student student = studentService.infos(ids);
        model.addAttribute("student",student);
    }
    @RequestMapping("goedit")
    public String goedit(){
        return "student-edit";
    }
    @RequestMapping("edit")
    @ResponseBody
    public JsonResult edit(Student student){
        Integer update = studentService.update(student);
        JsonResult success = JsonResult.success(update);
        return success;
    }
    @RequestMapping("removemore")
    @ResponseBody
    public JsonResult removemore(@RequestParam("ids[]")Integer[] ids){
        Integer remove = studentService.removeMore(ids);
        JsonResult success = JsonResult.success(remove);
        return success;
    }
    @RequestMapping("remove")
    @ResponseBody
    public JsonResult remove(Integer id){
        Integer remove = studentService.remove(id);
        JsonResult success = JsonResult.success(remove);
        return success;
    }
    @RequestMapping("goadd")
    public String goadd(){
        return "student-add";
    }
    @RequestMapping("add")
    @ResponseBody
    public JsonResult add(Student student){
        Integer add = studentService.add(student);
        JsonResult success = JsonResult.success(add);
        return success;
    }
}
