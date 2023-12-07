//package com.example.info.api.unsecure;
//
//import com.example.info.enity.Team;
//import com.example.info.repository.TeamRepository;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@Controller
//@RequestMapping("/teams")
//public class TeamController {
//    TeamRepository teamDao;
//
//    TeamController(TeamRepository team) {
//        this.teamDao = team;
//    }
//
//    @RequestMapping("")
//    public String search(Model model) {
//        List<Team> teams = teamDao.findAll();
//        model.addAttribute("teams", teams);
//        return "myteams";
//    }
//
//    @RequestMapping("/search")
//    public String search(Model model, @RequestParam(name = "motCle", defaultValue = "") String mc) {
//        List<Team> teams = teamDao.findByNameContainingIgnoreCase(mc);
//        model.addAttribute("teams", teams);
//        return "myteams";
//    }
//
//    @RequestMapping("/add")
//    public String add(Model model, @RequestParam(name = "name", defaultValue = "") String name,
//                      @RequestParam(name = "budget", defaultValue = "0") Float budget) {
//        if (!name.isEmpty()) {
//            model.addAttribute("name", name);
//            model.addAttribute("budget", budget);
//            Team t = new Team(0,name, budget);
//            teamDao.save(t);
//            return "redirect:/teams";
//        }else{
//            return "addTeam";
//        }
//
//    }
//
//    @RequestMapping("/delete")
//    public String delete(Model model, @RequestParam(name = "ref", defaultValue = "") Long idTeam,
//                         @RequestParam(name = "mc", defaultValue = "") String mc) {
//        teamDao.deleteById(idTeam);
//        return "redirect:/teams";
//    }
//
//    @RequestMapping("/edit")
//    public String edit(Model model,
//                       @RequestParam(name = "ref", defaultValue = "") Long idTeam,
//                       @RequestParam(name = "name", defaultValue = "") String name,
//                       @RequestParam(name = "budget", defaultValue = "") Float budget,
//                       @RequestParam(name = "edit", defaultValue = "") int edit,
//                       @RequestParam(name = "mc", defaultValue = "") String mc) {
//        if (edit == 0) {
//            model.addAttribute("idTeam", idTeam);
//            model.addAttribute("name", name);
//            model.addAttribute("budget", budget);
//            model.addAttribute("motCle", mc);
//            return "editTeam";
//        } else {
//            Optional<Team> ot = teamDao.findById(idTeam);
//            if (ot.isPresent()) {
//                Team t = ot.get();
//                t.setName(name);
//                t.setBudget(budget);
//                teamDao.save(t);
//            }
//            return "redirect:/teams";
//        }
//    }
//
//}
//
//
