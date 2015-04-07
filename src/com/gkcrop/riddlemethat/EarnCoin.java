package com.gkcrop.riddlemethat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class EarnCoin {


	public static final String FACEBOOK = "Facebook";
	public static final String TWITTER = "Twitter";
	public static final String YOUTUBE = "Youtube";
	public static final String RATEAPP = "RateApp";
	public static final String SHAREAPP = "ShareApp";
	public static final String MOREAPP = "MoreApp";
	public static final String WEBSITE = "Website";
	
	
	SharedPreferences preferences;
	public EarnCoin(Context context)
    {
      
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
      
    }
	public static Boolean getIfEarnButtonClicked(Context context, String s)
	{
		return Boolean.valueOf(context.getSharedPreferences("earncoin", 0).getBoolean(s, false));
	}

	public static void setIfEarnButtonClicked(Context context, String s, Boolean boolean1)
	{
		Editor editor = context.getSharedPreferences("earncoin", 0).edit();
		editor.putBoolean(s, boolean1.booleanValue());
		editor.commit();
	}
	
	
	public void setStateSound(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("Sound", flag);
        editor.commit();
    }
	
	public boolean isSoundEnabled()
    {
        return preferences.getBoolean("Sound", true);
    }

}
