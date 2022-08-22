package com.jckj.controller;

import com.jckj.dto.LayUiDto;
import com.jckj.model.Guardian;
import com.jckj.model.Student;
import com.jckj.service.GuardianService;
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
@RequestMapping("guardian")
public class GuardianController {
    @Autowired
    private GuardianService guardianService;
    @RequestMapping("go")
    public String go(){
        return "guardian-table";
    }
    /**
     * 列表
     */
    @RequestMapping("list")
    @ResponseBody
    public MapVo list(LayUiDto dto){
        MapVo map = guardianService.list(dto);
        return map;
    }

    /**
     * 详情
     * @param guardianid
     * @param model
     */
    @RequestMapping("info")
    @ResponseBody
    public void info(Integer guardianid,Model model){
        Guardian guardian= guardianService.info(guardianid);
        model.addAttribute("guardian",guardian);
    }
    @RequestMapping("infos")
    @ResponseBody
    public void infos(@RequestParam("guardianids[]") Integer[] guardianids,Model model){
        Guardian guardian = guardianService.infos(guardianids);
        model.addAttribute("guardian",guardian);
    }
    @RequestMapping("goedit")
    public String goedit(){
        return "student-edit";
    }
    @RequestMapping("edit")
    @ResponseBody
    public JsonResult edit(Guardian guardian){
        Integer update = guardianService.update(guardian);
        JsonResult success = JsonResult.success(update);
        return success;
    }
    @RequestMapping("removemore")
    @ResponseBody
    public JsonResult removemore(@RequestParam("guardianids[]")Integer[] guardianids){
        Integer remove = guardianService.removeMore(guardianids);
        JsonResult success = JsonResult.success(remove);
        return success;
    }
    @RequestMapping("remove")
    @ResponseBody
    public JsonResult remove(Integer guardianid){
        Integer remove = guardianService.remove(guardianid);
        JsonResult success = JsonResult.success(remove);
        return success;
    }
    @RequestMapping("goadd")
    public String goadd(){
        return "guardian-add";
    }
    @RequestMapping("add")
    @ResponseBody
    public JsonResult add(Guardian guardian){
        Integer add = guardianService.add(guardian);
        JsonResult success = JsonResult.success(add);
        return success;
    }
}
