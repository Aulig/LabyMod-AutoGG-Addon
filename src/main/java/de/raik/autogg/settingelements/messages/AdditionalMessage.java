package de.raik.autogg.settingelements.messages;

import net.labymod.gui.elements.DropDownMenu;
import net.labymod.main.LabyMod;

/**
 * Enum that contains the additional messages
 *
 * @author Raik
 * @version 1.0
 */
public enum AdditionalMessage {
    GOOD_DAY("Have a good day!"),
    HEART("Erniedrigt."),
    LM_CREDIT("I knew you were the imposter when you acted so sussy! ඞඞඞ"),
    SK1ER_CREDIT("GG - Mitte safe, alles safe!");


    private final String message;

    AdditionalMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static DropDownMenu<AdditionalMessage> createDropDownMenu(AdditionalMessage currentValue) {
        DropDownMenu<AdditionalMessage> dropDownMenu = new DropDownMenu<AdditionalMessage>(null, 0, 0, 0, 0)
                .fill(values());
        dropDownMenu.setSelected(currentValue);
        dropDownMenu.setEntryDrawer((entry, x, y, trimmed) ->
            LabyMod.getInstance().getDrawUtils().drawString(((AdditionalMessage)entry).getMessage(), x ,y));

        return dropDownMenu;
    }
}
