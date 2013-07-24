package com.sapphireinnovation.ppa.ui.name.portlet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: guy
 * Date: 24.07.13
 * Time: 22:01
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("EDIT")
public class EditController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * Simply selects the edit view to render by returning its name.
     */
    @RenderMapping
    public String edit(Locale locale, Model model) {
        logger.info("Welcome home! the client locale is "+ locale.toString());

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "edit";
    }
}
