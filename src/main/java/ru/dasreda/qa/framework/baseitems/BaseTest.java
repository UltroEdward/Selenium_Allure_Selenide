package ru.dasreda.qa.framework.baseitems;

import org.testng.annotations.Listeners;
import ru.dasreda.qa.framework.listeners.OnFailScreenShotListener;

/**
 * Created by Horseman on 25.10.2017.
 */

@Listeners({OnFailScreenShotListener.class})
public class BaseTest {
}
