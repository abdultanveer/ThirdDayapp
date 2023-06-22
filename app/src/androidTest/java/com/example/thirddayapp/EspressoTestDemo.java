package com.example.thirddayapp;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class EspressoTestDemo {


    @Rule
    public ActivityScenarioRule<EspressoActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(EspressoActivity.class);


    @Test
    public void espressoActivityTest() {
        //enter abdul in edittext
        onView(withId(R.id.etTest))
                .perform(typeText("bosch"), closeSoftKeyboard());
        //click the button with test label
        onView(withId(R.id.btnTest)).perform(click());
        //check if the textview has abdul on it
        onView(withId(R.id.tvTest))
                .check(matches(withText("bosch")));

    }
}
