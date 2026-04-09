package androidx.lifecycle;

import D1.c;
import android.os.Bundle;
import b9.C2001h;
import java.util.Map;
import p9.InterfaceC5480a;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class V implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final D1.c f16104a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16105b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f16106c;

    /* renamed from: d, reason: collision with root package name */
    public final b9.p f16107d;

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<W> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ j0 f16108g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var) {
            super(0);
            this.f16108g = j0Var;
        }

        @Override // p9.InterfaceC5480a
        public final W invoke() {
            return U.c(this.f16108g);
        }
    }

    public V(D1.c savedStateRegistry, j0 j0Var) {
        kotlin.jvm.internal.l.f(savedStateRegistry, "savedStateRegistry");
        this.f16104a = savedStateRegistry;
        this.f16107d = C2001h.b(new a(j0Var));
    }

    @Override // D1.c.b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f16106c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((W) this.f16107d.getValue()).f16109b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((Q) entry.getValue()).f16096e.a();
            if (!kotlin.jvm.internal.l.b(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f16105b = false;
        return bundle;
    }

    public final void b() {
        if (this.f16105b) {
            return;
        }
        Bundle bundleA = this.f16104a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f16106c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.f16106c = bundle;
        this.f16105b = true;
    }
}
