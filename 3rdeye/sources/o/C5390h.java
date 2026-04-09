package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import com.github.appintro.R;
import z0.C5848a;

/* compiled from: AppCompatDrawableManager.java */
/* renamed from: o.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5390h {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f44674b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C5390h f44675c;

    /* renamed from: a, reason: collision with root package name */
    public N f44676a;

    /* compiled from: AppCompatDrawableManager.java */
    /* renamed from: o.h$a */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f44677a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b, reason: collision with root package name */
        public final int[] f44678b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_seekbar_tick_mark_material, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_ic_menu_share_mtrl_alpha, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_ic_menu_cut_mtrl_alpha, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_ic_menu_selectall_mtrl_alpha, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c, reason: collision with root package name */
        public final int[] f44679c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d, reason: collision with root package name */
        public final int[] f44680d = {R.drawable.abc_popup_background_mtrl_mult, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e, reason: collision with root package name */
        public final int[] f44681e = {com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_tab_indicator_material, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_textfield_search_material};

        /* renamed from: f, reason: collision with root package name */
        public final int[] f44682f = {com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_btn_check_material, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_btn_radio_material, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_btn_check_material_anim, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i, int[] iArr) {
            for (int i10 : iArr) {
                if (i10 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i) {
            int iC = S.c(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{S.f44596b, S.f44598d, S.f44597c, S.f44600f}, new int[]{S.b(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorButtonNormal), C0.d.c(iC, i), C0.d.c(iC, i), i});
        }

        public static LayerDrawable c(N n9, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableG = n9.g(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_star_black_48dp);
            Drawable drawableG2 = n9.g(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_star_half_black_48dp);
            if ((drawableG instanceof BitmapDrawable) && drawableG.getIntrinsicWidth() == dimensionPixelSize && drawableG.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableG;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableG.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableG.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableG2 instanceof BitmapDrawable) && drawableG2.getIntrinsicWidth() == dimensionPixelSize && drawableG2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableG2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableG2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableG2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C5390h.f44674b;
            }
            drawableMutate.setColorFilter(C5390h.c(i, mode));
        }

        public final ColorStateList d(Context context, int i) {
            if (i == com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_edit_text_material) {
                return C5848a.getColorStateList(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.abc_tint_edittext);
            }
            if (i == 2131230864) {
                return C5848a.getColorStateList(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.abc_tint_switch_track);
            }
            if (i != com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_switch_thumb_material) {
                if (i == com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, S.c(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorButtonNormal));
                }
                if (i == com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_btn_colored_material) {
                    return b(context, S.c(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorAccent));
                }
                if (i == 2131230859 || i == com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_spinner_textfield_background_material) {
                    return C5848a.getColorStateList(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.abc_tint_spinner);
                }
                if (a(i, this.f44678b)) {
                    return S.d(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorControlNormal);
                }
                if (a(i, this.f44681e)) {
                    return C5848a.getColorStateList(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.abc_tint_default);
                }
                if (a(i, this.f44682f)) {
                    return C5848a.getColorStateList(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.abc_tint_btn_checkable);
                }
                if (i == com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.abc_seekbar_thumb_material) {
                    return C5848a.getColorStateList(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = S.d(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorSwitchThumbNormal);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = S.f44596b;
                iArr2[0] = S.b(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorSwitchThumbNormal);
                iArr[1] = S.f44599e;
                iArr2[1] = S.c(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorControlActivated);
                iArr[2] = S.f44600f;
                iArr2[2] = S.c(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = S.f44596b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = S.f44599e;
                iArr2[1] = S.c(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorControlActivated);
                iArr[2] = S.f44600f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized C5390h a() {
        try {
            if (f44675c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f44675c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return N.h(i, mode);
    }

    public static synchronized void d() {
        if (f44675c == null) {
            C5390h c5390h = new C5390h();
            f44675c = c5390h;
            c5390h.f44676a = N.d();
            f44675c.f44676a.m(new a());
        }
    }

    public static void e(Drawable drawable, V v10, int[] iArr) {
        PorterDuff.Mode mode = N.f44572h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = v10.f44606d;
        if (z10 || v10.f44605c) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z10 ? v10.f44603a : null;
            PorterDuff.Mode mode2 = v10.f44605c ? v10.f44604b : N.f44572h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = N.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f44676a.g(context, i);
    }
}
