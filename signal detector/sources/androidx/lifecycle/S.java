package androidx.lifecycle;

import android.os.Bundle;
import c5.C0410g;
import java.util.Map;

/* loaded from: classes.dex */
public final class S implements F0.e {

    /* renamed from: a, reason: collision with root package name */
    public final F0.f f5213a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5214b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f5215c;

    /* renamed from: d, reason: collision with root package name */
    public final C0410g f5216d;

    public S(F0.f fVar, b0 b0Var) {
        q5.i.e(fVar, "savedStateRegistry");
        this.f5213a = fVar;
        this.f5216d = new C0410g(new C0.y(3, b0Var));
    }

    @Override // F0.e
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5215c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((T) this.f5216d.getValue()).f5217b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((N) entry.getValue()).f5203e.a();
            if (!q5.i.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f5214b = false;
        return bundle;
    }

    public final void b() {
        if (this.f5214b) {
            return;
        }
        Bundle bundleC = this.f5213a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5215c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleC != null) {
            bundle.putAll(bundleC);
        }
        this.f5215c = bundle;
        this.f5214b = true;
    }
}
