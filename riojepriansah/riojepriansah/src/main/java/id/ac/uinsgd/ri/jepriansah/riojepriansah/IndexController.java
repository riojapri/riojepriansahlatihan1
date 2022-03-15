package id.ac.uinsgd.ri.jepriansah.riojepriansah;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class IndexController {
    @GetMapping("/hello")
    public String index(@RequestParam String nama) {
        return "Selamat belajar spring boot! " + nama;
    }
}
