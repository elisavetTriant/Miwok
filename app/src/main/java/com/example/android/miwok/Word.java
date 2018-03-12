package com.example.android.miwok;

/**
 * Created by Eli on 12-Mar-18.
 */

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Word Class Constructor */
    public Word (String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /** Getter for default translation String */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Getter for Miwok translation of the word*/
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}
