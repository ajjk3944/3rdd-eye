package a2;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.location.Location;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/* loaded from: classes.dex */
public abstract class e {
    public static Icon a(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static AutofillId b(View view) {
        return view.getAutofillId();
    }

    public static float c(Location location) {
        return location.getBearingAccuracyDegrees();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float f(Location location) {
        return location.getSpeedAccuracyMetersPerSecond();
    }

    public static float g(Location location) {
        return location.getVerticalAccuracyMeters();
    }

    public static boolean h(Location location) {
        return location.hasBearingAccuracy();
    }

    public static boolean i(Location location) {
        return location.hasSpeedAccuracy();
    }

    public static boolean j(Location location) {
        return location.hasVerticalAccuracy();
    }

    public static boolean k(File file, File file2) throws IOException {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void l(MenuItem menuItem, char c4, int i10) {
        menuItem.setAlphabeticShortcut(c4, i10);
    }

    public static void m(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void n(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void o(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void p(MenuItem menuItem, char c4, int i10) {
        menuItem.setNumericShortcut(c4, i10);
    }

    public static void q(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
