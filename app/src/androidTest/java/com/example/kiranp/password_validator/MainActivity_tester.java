package com.example.kiranp.password_validator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

/**
 * Created by Kiran P on 2/6/2018.
 */
@RunWith(AndroidJUnit4.class)

public class MainActivity_tester {
    @Rule public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test public  void buttonclick_strong(){
        onView(withId(R.id.password_input)).perform(typeText("Kr_68978957"),closeSoftKeyboard());
        onView(withId(R.id.validate_button)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Strong!")));
    }
    @Test public  void buttonclick_notstrong(){
        onView(withId(R.id.password_input)).perform(typeText("password"),closeSoftKeyboard());
        onView(withId(R.id.validate_button)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Not Strong!")));
    }
}
