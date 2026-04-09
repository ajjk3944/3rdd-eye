package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.q0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f1169b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static i f1170c;

    /* renamed from: a, reason: collision with root package name */
    public q0 f1171a;

    public class a implements q0.f {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f1172a = {c.e.abc_textfield_search_default_mtrl_alpha, c.e.abc_textfield_default_mtrl_alpha, c.e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b, reason: collision with root package name */
        public final int[] f1173b = {c.e.abc_ic_commit_search_api_mtrl_alpha, c.e.abc_seekbar_tick_mark_material, c.e.abc_ic_menu_share_mtrl_alpha, c.e.abc_ic_menu_copy_mtrl_am_alpha, c.e.abc_ic_menu_cut_mtrl_alpha, c.e.abc_ic_menu_selectall_mtrl_alpha, c.e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c, reason: collision with root package name */
        public final int[] f1174c = {c.e.abc_textfield_activated_mtrl_alpha, c.e.abc_textfield_search_activated_mtrl_alpha, c.e.abc_cab_background_top_mtrl_alpha, c.e.abc_text_cursor_material, c.e.abc_text_select_handle_left_mtrl, c.e.abc_text_select_handle_middle_mtrl, c.e.abc_text_select_handle_right_mtrl};

        /* renamed from: d, reason: collision with root package name */
        public final int[] f1175d = {c.e.abc_popup_background_mtrl_mult, c.e.abc_cab_background_internal_bg, c.e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e, reason: collision with root package name */
        public final int[] f1176e = {c.e.abc_tab_indicator_material, c.e.abc_textfield_search_material};

        /* renamed from: f, reason: collision with root package name */
        public final int[] f1177f = {c.e.abc_btn_check_material, c.e.abc_btn_radio_material, c.e.abc_btn_check_material_anim, c.e.abc_btn_radio_material_anim};

        @Override // androidx.appcompat.widget.q0.f
        public Drawable a(q0 q0Var, Context context, int i10) {
            if (i10 == c.e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{q0Var.j(context, c.e.abc_cab_background_internal_bg), q0Var.j(context, c.e.abc_cab_background_top_mtrl_alpha)});
            }
            if (i10 == c.e.abc_ratingbar_material) {
                return l(q0Var, context, c.d.abc_star_big);
            }
            if (i10 == c.e.abc_ratingbar_indicator_material) {
                return l(q0Var, context, c.d.abc_star_medium);
            }
            if (i10 == c.e.abc_ratingbar_small_material) {
                return l(q0Var, context, c.d.abc_star_small);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.q0.f
        public ColorStateList b(Context context, int i10) {
            if (i10 == c.e.abc_edit_text_material) {
                return d.a.a(context, c.c.abc_tint_edittext);
            }
            if (i10 == c.e.abc_switch_track_mtrl_alpha) {
                return d.a.a(context, c.c.abc_tint_switch_track);
            }
            if (i10 == c.e.abc_switch_thumb_material) {
                return k(context);
            }
            if (i10 == c.e.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (i10 == c.e.abc_btn_borderless_material) {
                return g(context);
            }
            if (i10 == c.e.abc_btn_colored_material) {
                return i(context);
            }
            if (i10 == c.e.abc_spinner_mtrl_am_alpha || i10 == c.e.abc_spinner_textfield_background_material) {
                return d.a.a(context, c.c.abc_tint_spinner);
            }
            if (f(this.f1173b, i10)) {
                return v0.e(context, c.a.colorControlNormal);
            }
            if (f(this.f1176e, i10)) {
                return d.a.a(context, c.c.abc_tint_default);
            }
            if (f(this.f1177f, i10)) {
                return d.a.a(context, c.c.abc_tint_btn_checkable);
            }
            if (i10 == c.e.abc_seekbar_thumb_material) {
                return d.a.a(context, c.c.abc_tint_seek_thumb);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
        @Override // androidx.appcompat.widget.q0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.i.a()
                int[] r1 = r6.f1172a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = c.a.colorControlNormal
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4e
            L15:
                int[] r1 = r6.f1174c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = c.a.colorControlActivated
                goto L11
            L20:
                int[] r1 = r6.f1175d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r8 = r5
            L30:
                r5 = r2
                goto L4e
            L32:
                int r1 = c.e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L45
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r0
                r0 = r8
                r8 = r1
                r1 = r5
                goto L30
            L45:
                int r1 = c.e.abc_dialog_material_background
                if (r8 != r1) goto L4a
                goto L2d
            L4a:
                r1 = r0
                r8 = r3
                r5 = r8
                goto L13
            L4e:
                if (r5 == 0) goto L65
                android.graphics.drawable.Drawable r9 = r9.mutate()
                int r7 = androidx.appcompat.widget.v0.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.i.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L64
                r9.setAlpha(r0)
            L64:
                return r2
            L65:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.q0.f
        public PorterDuff.Mode d(int i10) {
            if (i10 == c.e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.q0.f
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == c.e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = c.a.colorControlNormal;
                m(drawableFindDrawableByLayerId, v0.c(context, i11), i.f1169b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), v0.c(context, i11), i.f1169b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), v0.c(context, c.a.colorControlActivated), i.f1169b);
                return true;
            }
            if (i10 != c.e.abc_ratingbar_material && i10 != c.e.abc_ratingbar_indicator_material && i10 != c.e.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), v0.b(context, c.a.colorControlNormal), i.f1169b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i12 = c.a.colorControlActivated;
            m(drawableFindDrawableByLayerId2, v0.c(context, i12), i.f1169b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), v0.c(context, i12), i.f1169b);
            return true;
        }

        public final boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i10) {
            int iC = v0.c(context, c.a.colorControlHighlight);
            return new ColorStateList(new int[][]{v0.f1361b, v0.f1364e, v0.f1362c, v0.f1368i}, new int[]{v0.b(context, c.a.colorButtonNormal), j0.a.g(iC, i10), j0.a.g(iC, i10), i10});
        }

        public final ColorStateList i(Context context) {
            return h(context, v0.c(context, c.a.colorAccent));
        }

        public final ColorStateList j(Context context) {
            return h(context, v0.c(context, c.a.colorButtonNormal));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = c.a.colorSwitchThumbNormal;
            ColorStateList colorStateListE = v0.e(context, i10);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = v0.f1361b;
                iArr2[0] = v0.b(context, i10);
                iArr[1] = v0.f1365f;
                iArr2[1] = v0.c(context, c.a.colorControlActivated);
                iArr[2] = v0.f1368i;
                iArr2[2] = v0.c(context, i10);
            } else {
                int[] iArr3 = v0.f1361b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = v0.f1365f;
                iArr2[1] = v0.c(context, c.a.colorControlActivated);
                iArr[2] = v0.f1368i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(q0 q0Var, Context context, int i10) throws Resources.NotFoundException {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableJ = q0Var.j(context, c.e.abc_star_black_48dp);
            Drawable drawableJ2 = q0Var.j(context, c.e.abc_star_half_black_48dp);
            if ((drawableJ instanceof BitmapDrawable) && drawableJ.getIntrinsicWidth() == dimensionPixelSize && drawableJ.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableJ;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableJ2 instanceof BitmapDrawable) && drawableJ2.getIntrinsicWidth() == dimensionPixelSize && drawableJ2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableJ2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = i.f1169b;
            }
            drawableMutate.setColorFilter(i.e(i10, mode));
        }
    }

    public static synchronized i b() {
        try {
            if (f1170c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1170c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return q0.l(i10, mode);
    }

    public static synchronized void h() {
        if (f1170c == null) {
            i iVar = new i();
            f1170c = iVar;
            iVar.f1171a = q0.h();
            f1170c.f1171a.u(new a());
        }
    }

    public static void i(Drawable drawable, x0 x0Var, int[] iArr) {
        q0.w(drawable, x0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1171a.j(context, i10);
    }

    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1171a.k(context, i10, z10);
    }

    public synchronized ColorStateList f(Context context, int i10) {
        return this.f1171a.m(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1171a.s(context);
    }
}
