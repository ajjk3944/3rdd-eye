package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k53 implements n53 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;

    public k53(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3, String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = str2;
    }

    @Override // defpackage.n53
    public final void c(Object obj) {
        Bundle bundle = ((jm2) obj).a;
        bundle.putString("js", this.c);
        bundle.putBoolean("is_nonagon", true);
        iz1 iz1Var = mz1.d4;
        tw1 tw1Var = tw1.e;
        bundle.putString("extra_caps", (String) tw1Var.c.a(iz1Var));
        bundle.putInt("target_api", this.e);
        bundle.putInt("dv", this.f);
        bundle.putInt("lv", this.g);
        if (((Boolean) tw1Var.c.a(mz1.p6)).booleanValue()) {
            String str = this.h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleY = i30.Y(bundle, "sdk_env");
        bundleY.putBoolean("mf", ((Boolean) s02.e.w()).booleanValue());
        bundleY.putBoolean("instant_app", this.a);
        bundleY.putBoolean("lite", this.b);
        bundleY.putBoolean("is_privileged_process", this.d);
        bundle.putBundle("sdk_env", bundleY);
        Bundle bundleY2 = i30.Y(bundleY, "build_meta");
        bundleY2.putString("cl", "811902923");
        bundleY2.putString("rapid_rc", "dev");
        bundleY2.putString("rapid_rollup", "HEAD");
        bundleY.putBundle("build_meta", bundleY2);
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        Bundle bundle = ((jm2) obj).b;
        bundle.putString("js", this.c);
        bundle.putInt("target_api", this.e);
    }
}
