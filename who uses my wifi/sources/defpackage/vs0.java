package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vs0 implements ys0 {
    public final vq2 a;
    public boolean b;
    public Bundle c;
    public final oz0 d;

    public vs0(vq2 vq2Var, r61 r61Var) {
        i30.m(vq2Var, "savedStateRegistry");
        this.a = vq2Var;
        this.d = new oz0(new ga0(1, r61Var));
    }

    @Override // defpackage.ys0
    public final Bundle a() {
        Bundle bundleB = uk2.b((gk0[]) Arrays.copyOf(new gk0[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleB.putAll(bundle);
        }
        for (Map.Entry entry : ((ws0) this.d.a()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((pw) ((qs0) entry.getValue()).a.k).a();
            if (!bundleA.isEmpty()) {
                i30.m(str, "key");
                bundleB.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleB;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleE = this.a.e("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleB = uk2.b((gk0[]) Arrays.copyOf(new gk0[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleB.putAll(bundle);
        }
        if (bundleE != null) {
            bundleB.putAll(bundleE);
        }
        this.c = bundleB;
        this.b = true;
    }
}
