package q2;

import A2.C0117e;
import D4.b;
import G.c;
import Y2.C0200b;
import Y2.C0203e;
import Y2.C0204f;
import Y2.C0207i;
import Y2.C0210l;
import Y2.C0214p;
import a3.C0272a;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.apm.insight.R;
import com.lefan.base.pdf.PdfReadActivity;
import e.C2284a;
import e.InterfaceC2285b;
import f.C2314a;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import q2.C2834o;
import q5.i;
import u2.C2954d;

/* renamed from: q2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2834o implements O0.a, Y2.N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23251a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23252b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23253c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23254d;

    /* renamed from: e, reason: collision with root package name */
    public Object f23255e;

    /* renamed from: f, reason: collision with root package name */
    public Object f23256f;

    /* renamed from: g, reason: collision with root package name */
    public Object f23257g;

    public /* synthetic */ C2834o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f23251a = i;
        this.f23252b = obj;
        this.f23253c = obj2;
        this.f23254d = obj3;
        this.f23255e = obj4;
        this.f23256f = obj5;
        this.f23257g = obj6;
    }

    public static boolean b(int[] iArr, int i) {
        for (int i3 : iArr) {
            if (i3 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList c(Context context, int i) {
        int iC = o.W0.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{o.W0.f22463b, o.W0.f22465d, o.W0.f22464c, o.W0.f22467f}, new int[]{o.W0.b(context, R.attr.colorButtonNormal), J.a.c(iC, i), J.a.c(iC, i), i});
    }

    public static LayerDrawable d(o.I0 i02, Context context, int i) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableF = i02.f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableF2 = i02.f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void f(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = o.r.f22621b;
        }
        drawableMutate.setColorFilter(o.r.c(i, mode));
    }

    public static void h(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        r rVar = r.f23260g;
        u2.f fVar = rVar.f23261a;
        String str2 = rVar.f23264d.f23784a;
        fVar.getClass();
        u2.f.a(context, str2, bundle, new C2954d(fVar, context));
    }

    @Override // Y2.O
    public Object a() {
        switch (this.f23251a) {
            case 5:
                Application application = (Application) ((Y2.O) this.f23252b).a();
                return new C0207i(application, (C0214p) ((Y2.O) this.f23254d).a(), (C0204f) ((Y2.O) this.f23255e).a(), (C0210l) ((A0.e) this.f23256f).f73b, (V2.h) this.f23257g);
            default:
                return g();
        }
    }

    public ColorStateList e(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return G.c.b(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230826) {
            return G.c.b(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return c(context, o.W0.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return c(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return c(context, o.W0.c(context, R.attr.colorAccent));
            }
            if (i == 2131230821 || i == R.drawable.abc_spinner_textfield_background_material) {
                return G.c.b(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.f23253c, i)) {
                return o.W0.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.f23256f, i)) {
                return G.c.b(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f23257g, i)) {
                return G.c.b(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return G.c.b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = o.W0.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = o.W0.f22463b;
            iArr2[0] = o.W0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = o.W0.f22466e;
            iArr2[1] = o.W0.c(context, R.attr.colorControlActivated);
            iArr[2] = o.W0.f22467f;
            iArr2[2] = o.W0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = o.W0.f22463b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = o.W0.f22466e;
            iArr2[1] = o.W0.c(context, R.attr.colorControlActivated);
            iArr[2] = o.W0.f22467f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public C0200b g() {
        Application application = (Application) ((Y2.O) this.f23252b).a();
        C0214p c0214p = (C0214p) ((Y2.O) this.f23253c).a();
        Handler handler = Y2.z.f4385a;
        Y2.A.c(handler);
        Y2.y yVar = Y2.z.f4386b;
        Y2.A.c(yVar);
        return new C0200b(application, c0214p, handler, yVar, (Y2.P) ((Y2.O) this.f23254d).a(), ((C0203e) ((Y2.O) this.f23255e)).a(), (C0207i) ((C0117e) this.f23256f).a(), (C0204f) ((Y2.O) this.f23257g).a(), 2);
    }

    @Override // O0.a
    public View getRoot() {
        switch (this.f23251a) {
            case 3:
                return (LinearLayout) this.f23252b;
            case 9:
                return (LinearLayoutCompat) this.f23252b;
            default:
                return (LinearLayout) this.f23252b;
        }
    }

    public C2834o(Context context, String str) {
        String strConcat;
        this.f23251a = 8;
        this.f23252b = context.getApplicationContext();
        this.f23253c = str;
        this.f23254d = new TreeMap();
        String packageName = context.getPackageName();
        try {
            String str2 = R2.b.a(context).h(0, context.getPackageName()).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            strConcat = sb.toString();
        } catch (PackageManager.NameNotFoundException e6) {
            u2.k.f("Unable to get package version name for reporting", e6);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f23257g = strConcat;
    }

    public C2834o(Set set, String str, String str2) {
        this.f23251a = 4;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f23252b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f23254d = str;
        this.f23255e = str2;
        this.f23256f = C0272a.f4677b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f23253c = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw A.f.f(it);
    }

    public C2834o(PdfReadActivity pdfReadActivity) {
        this.f23251a = 1;
        this.f23252b = pdfReadActivity;
        final int i = 0;
        this.f23256f = pdfReadActivity.p(new C2314a(2), new InterfaceC2285b(this) { // from class: E4.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2834o f1371b;

            {
                this.f1371b = this;
            }

            @Override // e.InterfaceC2285b
            public final void b(Object obj) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
                switch (i) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C2834o c2834o = this.f1371b;
                        if (zBooleanValue) {
                            b bVar = (b) c2834o.f23253c;
                            if (bVar != null) {
                                bVar.f(Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                        String str = (String) c2834o.f23255e;
                        if (str == null) {
                            i.g("permission");
                            throw null;
                        }
                        if (c.h((PdfReadActivity) c2834o.f23252b, str)) {
                            b bVar2 = (b) c2834o.f23253c;
                            if (bVar2 != null) {
                                bVar2.f(Boolean.FALSE);
                                return;
                            }
                            return;
                        }
                        D4.c cVar = (D4.c) c2834o.f23254d;
                        if (cVar != null) {
                            cVar.b();
                            return;
                        }
                        return;
                    default:
                        i.e((C2284a) obj, "it");
                        C2834o c2834o2 = this.f1371b;
                        PdfReadActivity pdfReadActivity2 = (PdfReadActivity) c2834o2.f23252b;
                        String str2 = (String) c2834o2.f23255e;
                        if (str2 == null) {
                            i.g("permission");
                            throw null;
                        }
                        if (c.a(pdfReadActivity2, str2) == 0) {
                            b bVar3 = (b) c2834o2.f23253c;
                            if (bVar3 != null) {
                                bVar3.f(Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                        b bVar4 = (b) c2834o2.f23253c;
                        if (bVar4 != null) {
                            bVar4.f(Boolean.FALSE);
                            return;
                        }
                        return;
                }
            }
        });
        final int i3 = 1;
        this.f23257g = pdfReadActivity.p(new C2314a(3), new InterfaceC2285b(this) { // from class: E4.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2834o f1371b;

            {
                this.f1371b = this;
            }

            @Override // e.InterfaceC2285b
            public final void b(Object obj) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
                switch (i3) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        C2834o c2834o = this.f1371b;
                        if (zBooleanValue) {
                            b bVar = (b) c2834o.f23253c;
                            if (bVar != null) {
                                bVar.f(Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                        String str = (String) c2834o.f23255e;
                        if (str == null) {
                            i.g("permission");
                            throw null;
                        }
                        if (c.h((PdfReadActivity) c2834o.f23252b, str)) {
                            b bVar2 = (b) c2834o.f23253c;
                            if (bVar2 != null) {
                                bVar2.f(Boolean.FALSE);
                                return;
                            }
                            return;
                        }
                        D4.c cVar = (D4.c) c2834o.f23254d;
                        if (cVar != null) {
                            cVar.b();
                            return;
                        }
                        return;
                    default:
                        i.e((C2284a) obj, "it");
                        C2834o c2834o2 = this.f1371b;
                        PdfReadActivity pdfReadActivity2 = (PdfReadActivity) c2834o2.f23252b;
                        String str2 = (String) c2834o2.f23255e;
                        if (str2 == null) {
                            i.g("permission");
                            throw null;
                        }
                        if (c.a(pdfReadActivity2, str2) == 0) {
                            b bVar3 = (b) c2834o2.f23253c;
                            if (bVar3 != null) {
                                bVar3.f(Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                        b bVar4 = (b) c2834o2.f23253c;
                        if (bVar4 != null) {
                            bVar4.f(Boolean.FALSE);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public C2834o() {
        this.f23251a = 7;
        this.f23252b = new int[]{2131230836, 2131230834, 2131230760};
        this.f23253c = new int[]{2131230784, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f23254d = new int[]{2131230833, 2131230835, 2131230777, R.drawable.abc_text_cursor_material, 2131230830, 2131230831, 2131230832};
        this.f23255e = new int[]{2131230809, R.drawable.abc_cab_background_internal_bg, 2131230808};
        this.f23256f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f23257g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }
}
