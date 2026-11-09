package io.github.EXP1;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class MyUtil {

    public static BitmapFont getFont(Color color, int size) {
        // creates a ttf to bitmap font generator
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("BasicFont.ttf"));  // font file name
        FreeTypeFontGenerator.FreeTypeFontParameter fontParam = new FreeTypeFontGenerator.FreeTypeFontParameter();

        fontParam.size = size;         // font size
        fontParam.color = color;       // font color

        return generator.generateFont(fontParam); // takes params with ttf font to generate bitmap font
    }
}
