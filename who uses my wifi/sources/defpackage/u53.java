package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u53 implements n53 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final ArrayList j;
    public final String k;
    public final String l;
    public final boolean m;
    public final long n;
    public final boolean o;
    public final String p;
    public final int q;
    public final String r;

    public u53(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, String str3, String str4, boolean z6, long j, boolean z7, String str5, int i, String str6, String str7, String str8) {
        String str9 = Build.FINGERPRINT;
        String str10 = Build.MODEL;
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = str2;
        this.h = str6;
        this.j = arrayList;
        this.k = str3;
        this.l = str4;
        this.m = z6;
        this.n = j;
        this.o = z7;
        this.p = str5;
        this.q = i;
        this.r = str8;
        this.i = str7;
    }

    @Override // defpackage.n53
    public final void c(Object obj) {
        String str;
        Bundle bundle = ((jm2) obj).a;
        bundle.putBoolean("cog", this.a);
        bundle.putBoolean("coh", this.b);
        bundle.putString("gl", this.c);
        bundle.putBoolean("simulator", this.d);
        bundle.putBoolean("is_latchsky", this.e);
        bundle.putInt("build_api_level", this.q);
        iz1 iz1Var = mz1.Pb;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (!((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f);
        }
        bundle.putString("hl", this.g);
        if (((Boolean) kz1Var2.a(mz1.fe)).booleanValue() || ((Boolean) kz1Var2.a(mz1.ge)).booleanValue()) {
            bundle.putString("dlc", this.h);
        }
        ArrayList<String> arrayList = this.j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.k);
        bundle.putString("submodel", Build.MODEL);
        Bundle bundleY = i30.Y(bundle, "device");
        bundle.putBundle("device", bundleY);
        bundleY.putString("build", Build.FINGERPRINT);
        bundleY.putLong("remaining_data_partition_space", this.n);
        Bundle bundleY2 = i30.Y(bundleY, "browser");
        bundleY.putBundle("browser", bundleY2);
        bundleY2.putBoolean("is_browser_custom_tabs_capable", this.m);
        String str3 = this.l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle bundleY3 = i30.Y(bundleY, "play_store");
            bundleY.putBundle("play_store", bundleY3);
            bundleY3.putString("package_version", str3);
        }
        if (((Boolean) kz1Var2.a(mz1.fc)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.o);
        }
        String str4 = this.p;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) kz1Var2.a(mz1.Zb)).booleanValue()) {
            i30.n0(bundle, "gotmt_l", true, ((Boolean) kz1Var2.a(mz1.Wb)).booleanValue());
            i30.n0(bundle, "gotmt_i", true, ((Boolean) kz1Var2.a(mz1.Vb)).booleanValue());
        }
        if (!((Boolean) kz1Var2.a(mz1.Oe)).booleanValue() || (str = this.r) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        Bundle bundle = ((jm2) obj).b;
        bundle.putBoolean("simulator", this.d);
        bundle.putInt("build_api_level", this.q);
        ArrayList<String> arrayList = this.j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", Build.MODEL);
    }
}
