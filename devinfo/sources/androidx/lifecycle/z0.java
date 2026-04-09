package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z0 implements a6.d {

    /* renamed from: a, reason: collision with root package name */
    public final yb.i f1205a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1206b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1207c;

    /* renamed from: d, reason: collision with root package name */
    public final yj.n f1208d;

    public z0(yb.i iVar, k1 k1Var) {
        nk.k.e(iVar, "savedStateRegistry");
        this.f1205a = iVar;
        this.f1208d = a.a.u(new a6.e(2, k1Var));
    }

    @Override // a6.d
    public final Bundle a() {
        Bundle bundleD = com.bumptech.glide.d.d((yj.i[]) Arrays.copyOf(new yj.i[0], 0));
        Bundle bundle = this.f1207c;
        if (bundle != null) {
            bundleD.putAll(bundle);
        }
        for (Map.Entry entry : ((a1) this.f1208d.getValue()).f1096b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((b5.a0) ((v0) entry.getValue()).f1194a.f1138f).a();
            if (!bundleA.isEmpty()) {
                nk.k.e(str, "key");
                bundleD.putBundle(str, bundleA);
            }
        }
        this.f1206b = false;
        return bundleD;
    }

    public final void b() {
        if (this.f1206b) {
            return;
        }
        Bundle bundleL = this.f1205a.l("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleD = com.bumptech.glide.d.d((yj.i[]) Arrays.copyOf(new yj.i[0], 0));
        Bundle bundle = this.f1207c;
        if (bundle != null) {
            bundleD.putAll(bundle);
        }
        if (bundleL != null) {
            bundleD.putAll(bundleL);
        }
        this.f1207c = bundleD;
        this.f1206b = true;
    }
}
