package app;

import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class RequesterController {

  @RequestMapping("/getLocale")
  @ResponseBody
  public String handleRequest(Locale locale) {
    return String.format(
        "Language: %s, Country: %s %n", locale.getDisplayLanguage(), locale.getDisplayCountry());
  }
}
