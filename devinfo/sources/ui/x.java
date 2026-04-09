package ui;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.e80;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x extends b5.z {
    public y Z;

    /* renamed from: a0, reason: collision with root package name */
    public e80 f35478a0;

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        nk.k.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.appi_appinfo_general, viewGroup, false);
        int i4 = R.id.app_name;
        TextView textView = (TextView) wb.e.s(R.id.app_name, viewInflate);
        if (textView != null) {
            i4 = R.id.content;
            LinearLayout linearLayout = (LinearLayout) wb.e.s(R.id.content, viewInflate);
            if (linearLayout != null) {
                i4 = R.id.icon;
                ImageView imageView = (ImageView) wb.e.s(R.id.icon, viewInflate);
                if (imageView != null) {
                    i4 = R.id.pkg_name;
                    TextView textView2 = (TextView) wb.e.s(R.id.pkg_name, viewInflate);
                    if (textView2 != null) {
                        i4 = R.id.tag_aab;
                        ImageView imageView2 = (ImageView) wb.e.s(R.id.tag_aab, viewInflate);
                        if (imageView2 != null) {
                            i4 = R.id.tag_api;
                            TextView textView3 = (TextView) wb.e.s(R.id.tag_api, viewInflate);
                            if (textView3 != null) {
                                i4 = R.id.tag_bit;
                                TextView textView4 = (TextView) wb.e.s(R.id.tag_bit, viewInflate);
                                if (textView4 != null) {
                                    i4 = R.id.tag_flutter;
                                    ImageView imageView3 = (ImageView) wb.e.s(R.id.tag_flutter, viewInflate);
                                    if (imageView3 != null) {
                                        i4 = R.id.tag_gradle;
                                        ImageView imageView4 = (ImageView) wb.e.s(R.id.tag_gradle, viewInflate);
                                        if (imageView4 != null) {
                                            i4 = R.id.tag_kotlin;
                                            ImageView imageView5 = (ImageView) wb.e.s(R.id.tag_kotlin, viewInflate);
                                            if (imageView5 != null) {
                                                i4 = R.id.tag_react_native;
                                                ImageView imageView6 = (ImageView) wb.e.s(R.id.tag_react_native, viewInflate);
                                                if (imageView6 != null) {
                                                    i4 = R.id.tag_unity;
                                                    ImageView imageView7 = (ImageView) wb.e.s(R.id.tag_unity, viewInflate);
                                                    if (imageView7 != null) {
                                                        i4 = R.id.tag_unreal_engine;
                                                        ImageView imageView8 = (ImageView) wb.e.s(R.id.tag_unreal_engine, viewInflate);
                                                        if (imageView8 != null) {
                                                            i4 = R.id.tags_container;
                                                            if (((LinearLayout) wb.e.s(R.id.tags_container, viewInflate)) != null) {
                                                                i4 = R.id.tags_scroller;
                                                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) wb.e.s(R.id.tags_scroller, viewInflate);
                                                                if (horizontalScrollView != null) {
                                                                    i4 = R.id.version_info;
                                                                    TextView textView5 = (TextView) wb.e.s(R.id.version_info, viewInflate);
                                                                    if (textView5 != null) {
                                                                        ScrollView scrollView = (ScrollView) viewInflate;
                                                                        this.f35478a0 = new e80(scrollView, textView, linearLayout, imageView, textView2, imageView2, textView3, textView4, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, horizontalScrollView, textView5);
                                                                        nk.k.d(scrollView, "getRoot(...)");
                                                                        dj.b.n(scrollView, (z2.k) a.a.f3c.f189b);
                                                                        e80 e80Var = this.f35478a0;
                                                                        nk.k.b(e80Var);
                                                                        TextView textView6 = (TextView) e80Var.g;
                                                                        Object obj = a.a.f3c.f189b;
                                                                        e80 e80Var2 = this.f35478a0;
                                                                        nk.k.b(e80Var2);
                                                                        textView6.setBackgroundTintList(dj.b.c(zh.i.c(((ScrollView) e80Var2.f10729a).getContext())));
                                                                        e80 e80Var3 = this.f35478a0;
                                                                        nk.k.b(e80Var3);
                                                                        TextView textView7 = (TextView) e80Var3.f10735h;
                                                                        Object obj2 = a.a.f3c.f189b;
                                                                        e80 e80Var4 = this.f35478a0;
                                                                        nk.k.b(e80Var4);
                                                                        textView7.setBackgroundTintList(dj.b.c(zh.i.c(((ScrollView) e80Var4.f10729a).getContext())));
                                                                        c0();
                                                                        e80 e80Var5 = this.f35478a0;
                                                                        nk.k.b(e80Var5);
                                                                        ScrollView scrollView2 = (ScrollView) e80Var5.f10729a;
                                                                        nk.k.d(scrollView2, "getRoot(...)");
                                                                        return scrollView2;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    public final void c0() {
        y yVar;
        String strC0;
        e80 e80Var = this.f35478a0;
        if (e80Var == null || (yVar = this.Z) == null) {
            return;
        }
        ImageView imageView = (ImageView) e80Var.j;
        ((TextView) e80Var.f10730b).setText(yVar.f35479a);
        ((TextView) e80Var.f10733e).setText(yVar.f35480b);
        ((TextView) e80Var.f10742p).setText(yVar.f35482d + "(" + yVar.f35483e + ")");
        ((TextView) e80Var.f10735h).setText(yVar.f35499w ? "64 BIT" : "32 BIT");
        ((TextView) e80Var.g).setText("API " + yVar.f35485h);
        y.b((ImageView) e80Var.f10736i, R.string.appi_flutter_used, R.string.appi_flutter_summary, yVar.f35501y);
        int i4 = yVar.f35501y;
        String[] strArr = yVar.f35489m;
        boolean z3 = (strArr != null ? strArr.length : 0) > 0;
        ImageView imageView2 = (ImageView) e80Var.f10734f;
        if (strArr == null || (strC0 = zj.m.c0(strArr, "\n", new sl.b(8), 30)) == null) {
            strC0 = "";
        }
        y.c(imageView2, z3, "App Bundles", strC0);
        if (z3) {
            String str = yVar.f35479a;
            String[] strArr2 = yVar.f35489m;
            Log.d("LiuZh-AAB", str + " : " + (strArr2 != null ? zj.m.c0(strArr2, "\n", null, 62) : null));
        }
        if (z3) {
            i4++;
        }
        y.b((ImageView) e80Var.f10738l, R.string.appi_react_native_used, R.string.appi_react_native_summary, yVar.B);
        int i10 = i4;
        if (yVar.B) {
            i10 = i4 + 1;
        }
        y.b((ImageView) e80Var.f10737k, R.string.appi_kotlin_used, R.string.appi_kotlin_summary, yVar.f35500x);
        int i11 = i10;
        if (yVar.f35500x) {
            i11 = i10 + 1;
        }
        y.b((ImageView) e80Var.f10739m, R.string.appi_unity_used, R.string.appi_unity_summary, yVar.f35502z);
        int i12 = i11;
        if (yVar.f35502z) {
            i12 = i11 + 1;
        }
        y.b((ImageView) e80Var.f10740n, R.string.appi_unreal_engine_used, R.string.appi_unreal_engine_summary, yVar.A);
        int i13 = i12;
        if (yVar.A) {
            i13 = i12 + 1;
        }
        boolean zIsEmpty = TextUtils.isEmpty(yVar.C);
        String strConcat = "Android Gradle Plugin ".concat(yVar.C);
        String string = imageView.getContext().getString(R.string.appi_gradle_summary);
        nk.k.d(string, "getString(...)");
        y.c(imageView, !zIsEmpty, strConcat, string);
        int i14 = i13;
        if (!zIsEmpty) {
            i14 = i13 + 1;
        }
        ((HorizontalScrollView) e80Var.f10741o).setVisibility(i14 > 0 ? 0 : 8);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(((ScrollView) e80Var.f10729a).getContext());
        LinearLayout linearLayout = (LinearLayout) e80Var.f10731c;
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_application_name_str, yVar.f35479a, R.string.appi_application_name_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_package_name, yVar.f35480b, R.string.appi_package_name_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_system_application, String.valueOf(yVar.f35484f), R.string.appi_system_application_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_version_code, String.valueOf(yVar.f35483e), R.string.appi_version_code_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_version_name, yVar.f35482d, R.string.appi_version_name_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_apk_size, yVar.f35492p, R.string.appi_apk_size_description);
        int i15 = yVar.f35485h;
        if (i15 != 0) {
            r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_target_sdk, String.valueOf(i15), R.string.appi_target_sdk_description);
        }
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_target_version, yVar.j, R.string.appi_target_version_description);
        int i16 = yVar.f35486i;
        if (i16 != 0) {
            r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_min_sdk, String.valueOf(i16), R.string.appi_min_sdk_description);
        }
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_min_version, yVar.f35487k, R.string.appi_min_version_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_native_lib, yVar.f35498v, R.string.appi_native_lib_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_process_name, yVar.f35481c, R.string.appi_process_name_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_first_install, yVar.f35493q, R.string.appi_first_install_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_last_update, yVar.f35494r, R.string.appi_last_update_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_app_source, yVar.g, R.string.appi_app_source_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_app_installer, yVar.f35496t, R.string.appi_app_installer_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_uid, yVar.f35497u, R.string.appi_uid_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_apk_path, yVar.f35488l, R.string.appi_apk_path_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_data_path, yVar.f35490n, R.string.appi_data_path_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_install_loc, yVar.f35491o, R.string.appi_install_loc_description);
        ((ImageView) e80Var.f10732d).setImageDrawable(yVar.f35495s);
    }
}
