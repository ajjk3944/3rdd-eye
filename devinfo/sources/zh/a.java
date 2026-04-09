package zh;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.widget.ImageView;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f38282a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f38283b;

    static {
        HashSet hashSet = new HashSet();
        f38282a = hashSet;
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_red_200)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_red_300)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_red_400)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_pink_200)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_pink_300)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_pink_400)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_purple_300)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_purple_400)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_deep_purple_200)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_deep_purple_300)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_deep_purple_400)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_indigo_200)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_indigo_300)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_indigo_400)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_blue_300)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_blue_400)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_blue_500)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_light_blue_300)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_light_blue_400)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_light_blue_500)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_cyan_300)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_cyan_400)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_cyan_500)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_cyan_600)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_teal_300)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_teal_400)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_green_300)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_green_400)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_amber_400)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_amber_500)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_amber_600)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_orange_400)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_orange_500)));
        hashSet.add(Integer.valueOf(deviceInfoApp.getColor(R.color.md_blue_grey_400)));
        f38283b = DesugarCollections.unmodifiableList(Arrays.asList(new b(DeviceInfoApp.f21145f.getString(R.string.string_default), a(R.color.colorPrimary), a(R.color.colorAccent)), new b(DeviceInfoApp.f21145f.getString(R.string.theme_colors_xkh), a(R.color.md_blue_grey_600), a(R.color.md_cyan_500)), new b(DeviceInfoApp.f21145f.getString(R.string.theme_colors_ysl), a(R.color.md_cyan_800), a(R.color.md_light_blue_500)), new b(DeviceInfoApp.f21145f.getString(R.string.theme_colors_kfz), a(R.color.md_brown_600), a(R.color.md_orange_500)), new b(DeviceInfoApp.f21145f.getString(R.string.theme_colors_mwz), a(R.color.md_indigo_300), a(R.color.md_light_blue_500))));
    }

    public static int a(int i4) {
        return DeviceInfoApp.f21145f.getResources().getColor(i4);
    }

    public static void b(ImageView imageView, int i4) {
        Drawable drawable = imageView.getDrawable();
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i4);
        gradientDrawable.setStroke((int) TypedValue.applyDimension(1, 2.0f, imageView.getResources().getDisplayMetrics()), Color.rgb((Color.red(i4) * 192) / 256, (Color.green(i4) * 192) / 256, (Color.blue(i4) * 192) / 256));
        imageView.setImageDrawable(gradientDrawable);
    }

    public static int[] c(int i4, Context context) {
        return i4 == context.getColor(R.color.default_theme_color) ? new int[]{context.getColor(R.color.default_theme_color_1), context.getColor(R.color.default_theme_color), context.getColor(R.color.default_theme_color_4), context.getColor(R.color.default_theme_color_5), context.getColor(R.color.default_theme_color_6)} : i4 == context.getColor(R.color.md_red_500) ? new int[]{context.getColor(R.color.md_red_200), context.getColor(R.color.md_red_300), context.getColor(R.color.md_red_400), context.getColor(R.color.md_red_500), context.getColor(R.color.md_red_600), context.getColor(R.color.md_red_700), context.getColor(R.color.md_red_800), context.getColor(R.color.md_red_900)} : i4 == context.getColor(R.color.md_pink_500) ? new int[]{context.getColor(R.color.md_pink_200), context.getColor(R.color.md_pink_300), context.getColor(R.color.md_pink_400), context.getColor(R.color.md_pink_500), context.getColor(R.color.md_pink_600), context.getColor(R.color.md_pink_700), context.getColor(R.color.md_pink_800), context.getColor(R.color.md_pink_900)} : i4 == context.getColor(R.color.md_purple_500) ? new int[]{context.getColor(R.color.md_purple_200), context.getColor(R.color.md_purple_300), context.getColor(R.color.md_purple_400), context.getColor(R.color.md_purple_500), context.getColor(R.color.md_purple_600), context.getColor(R.color.md_purple_700), context.getColor(R.color.md_purple_800), context.getColor(R.color.md_purple_900)} : i4 == context.getColor(R.color.md_deep_purple_500) ? new int[]{context.getColor(R.color.md_deep_purple_200), context.getColor(R.color.md_deep_purple_300), context.getColor(R.color.md_deep_purple_400), context.getColor(R.color.md_deep_purple_500), context.getColor(R.color.md_deep_purple_600), context.getColor(R.color.md_deep_purple_700), context.getColor(R.color.md_deep_purple_800), context.getColor(R.color.md_deep_purple_900)} : i4 == context.getColor(R.color.md_indigo_500) ? new int[]{context.getColor(R.color.md_indigo_200), context.getColor(R.color.md_indigo_300), context.getColor(R.color.md_indigo_400), context.getColor(R.color.md_indigo_500), context.getColor(R.color.md_indigo_600), context.getColor(R.color.md_indigo_700), context.getColor(R.color.md_indigo_800), context.getColor(R.color.md_indigo_900)} : i4 == context.getColor(R.color.md_blue_500) ? new int[]{context.getColor(R.color.md_blue_200), context.getColor(R.color.md_blue_300), context.getColor(R.color.md_blue_400), context.getColor(R.color.md_blue_500), context.getColor(R.color.md_blue_600), context.getColor(R.color.md_blue_700), context.getColor(R.color.md_blue_800), context.getColor(R.color.md_blue_900)} : i4 == context.getColor(R.color.md_light_blue_500) ? new int[]{context.getColor(R.color.md_light_blue_200), context.getColor(R.color.md_light_blue_300), context.getColor(R.color.md_light_blue_400), context.getColor(R.color.md_light_blue_500), context.getColor(R.color.md_light_blue_600), context.getColor(R.color.md_light_blue_700), context.getColor(R.color.md_light_blue_800), context.getColor(R.color.md_light_blue_900)} : i4 == context.getColor(R.color.md_cyan_500) ? new int[]{context.getColor(R.color.md_cyan_200), context.getColor(R.color.md_cyan_300), context.getColor(R.color.md_cyan_400), context.getColor(R.color.md_cyan_500), context.getColor(R.color.md_cyan_600), context.getColor(R.color.md_cyan_700), context.getColor(R.color.md_cyan_800), context.getColor(R.color.md_cyan_900)} : i4 == context.getColor(R.color.md_teal_500) ? new int[]{context.getColor(R.color.md_teal_200), context.getColor(R.color.md_teal_300), context.getColor(R.color.md_teal_400), context.getColor(R.color.md_teal_500), context.getColor(R.color.md_teal_600), context.getColor(R.color.md_teal_700), context.getColor(R.color.md_teal_800), context.getColor(R.color.md_teal_900)} : i4 == context.getColor(R.color.md_green_500) ? new int[]{context.getColor(R.color.md_green_400), context.getColor(R.color.md_green_500), context.getColor(R.color.md_green_600), context.getColor(R.color.md_green_700), context.getColor(R.color.md_green_800), context.getColor(R.color.md_green_900)} : i4 == context.getColor(R.color.md_light_green_500) ? new int[]{context.getColor(R.color.md_light_green_400), context.getColor(R.color.md_light_green_500), context.getColor(R.color.md_light_green_600), context.getColor(R.color.md_light_green_700), context.getColor(R.color.md_light_green_800), context.getColor(R.color.md_light_green_900)} : i4 == context.getColor(R.color.md_lime_500) ? new int[]{context.getColor(R.color.md_lime_500), context.getColor(R.color.md_lime_600), context.getColor(R.color.md_lime_700), context.getColor(R.color.md_lime_800), context.getColor(R.color.md_lime_900)} : i4 == context.getColor(R.color.md_yellow_500) ? new int[]{context.getColor(R.color.md_yellow_500), context.getColor(R.color.md_yellow_600), context.getColor(R.color.md_yellow_700), context.getColor(R.color.md_yellow_800), context.getColor(R.color.md_yellow_900)} : i4 == context.getColor(R.color.md_amber_500) ? new int[]{context.getColor(R.color.md_amber_400), context.getColor(R.color.md_amber_500), context.getColor(R.color.md_amber_600), context.getColor(R.color.md_amber_700), context.getColor(R.color.md_amber_800), context.getColor(R.color.md_amber_900)} : i4 == context.getColor(R.color.md_orange_500) ? new int[]{context.getColor(R.color.md_orange_300), context.getColor(R.color.md_orange_400), context.getColor(R.color.md_orange_500), context.getColor(R.color.md_orange_600), context.getColor(R.color.md_orange_700), context.getColor(R.color.md_orange_800), context.getColor(R.color.md_orange_900)} : i4 == context.getColor(R.color.md_deep_orange_500) ? new int[]{context.getColor(R.color.md_deep_orange_300), context.getColor(R.color.md_deep_orange_400), context.getColor(R.color.md_deep_orange_500), context.getColor(R.color.md_deep_orange_600), context.getColor(R.color.md_deep_orange_700), context.getColor(R.color.md_deep_orange_800), context.getColor(R.color.md_deep_orange_900)} : i4 == context.getColor(R.color.md_brown_500) ? new int[]{context.getColor(R.color.md_brown_300), context.getColor(R.color.md_brown_400), context.getColor(R.color.md_brown_500), context.getColor(R.color.md_brown_600), context.getColor(R.color.md_brown_700)} : i4 == context.getColor(R.color.md_grey_500) ? new int[]{context.getColor(R.color.md_grey_400), context.getColor(R.color.md_grey_500), context.getColor(R.color.md_grey_600), context.getColor(R.color.md_grey_700), context.getColor(R.color.md_grey_800)} : new int[]{context.getColor(R.color.md_blue_grey_400), context.getColor(R.color.md_blue_grey_500), context.getColor(R.color.md_blue_grey_600), context.getColor(R.color.md_blue_grey_700), context.getColor(R.color.md_blue_grey_800)};
    }
}
