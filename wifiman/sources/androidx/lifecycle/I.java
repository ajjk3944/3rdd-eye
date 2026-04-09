package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import q2.C7416d;

/* loaded from: classes.dex */
public final class I implements C7416d.c {

    /* renamed from: a, reason: collision with root package name */
    private final C7416d f31608a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31609b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f31610c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f31611d;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f31612a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(S s10) {
            super(0);
            this.f31612a = s10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J invoke() {
            return H.e(this.f31612a);
        }
    }

    public I(C7416d savedStateRegistry, S viewModelStoreOwner) {
        AbstractC6492s.i(savedStateRegistry, "savedStateRegistry");
        AbstractC6492s.i(viewModelStoreOwner, "viewModelStoreOwner");
        this.f31608a = savedStateRegistry;
        this.f31611d = Yg.n.b(new a(viewModelStoreOwner));
    }

    private final J c() {
        return (J) this.f31611d.getValue();
    }

    @Override // q2.C7416d.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f31610c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().X().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((E) entry.getValue()).g().a();
            if (!AbstractC6492s.d(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f31609b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        AbstractC6492s.i(key, "key");
        d();
        Bundle bundle = this.f31610c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f31610c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f31610c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f31610c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f31609b) {
            return;
        }
        Bundle bundleB = this.f31608a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f31610c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f31610c = bundle;
        this.f31609b = true;
        c();
    }
}
