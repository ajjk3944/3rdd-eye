package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;

/* loaded from: classes.dex */
public abstract class c {

    public static class a {
        @DoNotInline
        public static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @DoNotInline
        public static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @DoNotInline
        public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @DoNotInline
        public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    public static class b {
        @DoNotInline
        public static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static Drawable a(CompoundButton compoundButton) {
        return b.a(compoundButton);
    }

    public static ColorStateList b(CompoundButton compoundButton) {
        return a.a(compoundButton);
    }

    public static PorterDuff.Mode c(CompoundButton compoundButton) {
        return a.b(compoundButton);
    }

    public static void d(CompoundButton compoundButton, ColorStateList colorStateList) {
        a.c(compoundButton, colorStateList);
    }

    public static void e(CompoundButton compoundButton, PorterDuff.Mode mode) {
        a.d(compoundButton, mode);
    }
}
