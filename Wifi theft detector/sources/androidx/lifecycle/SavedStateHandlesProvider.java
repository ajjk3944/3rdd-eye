package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;

/* loaded from: classes.dex */
public final class SavedStateHandlesProvider implements a.c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.savedstate.a f3476a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3477b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f3478c;

    /* renamed from: d, reason: collision with root package name */
    public final y8.h f3479d;

    public SavedStateHandlesProvider(androidx.savedstate.a savedStateRegistry, final j0 viewModelStoreOwner) {
        kotlin.jvm.internal.p.e(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.p.e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f3476a = savedStateRegistry;
        this.f3479d = kotlin.b.b(new l9.a() { // from class: androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            {
                super(0);
            }

            @Override // l9.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final a0 invoke() {
                return SavedStateHandleSupport.e(viewModelStoreOwner);
            }
        });
    }

    @Override // androidx.savedstate.a.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3478c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((z) entry.getValue()).c().a();
            if (!kotlin.jvm.internal.p.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f3477b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        kotlin.jvm.internal.p.e(key, "key");
        d();
        Bundle bundle = this.f3478c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f3478c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f3478c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f3478c = null;
        }
        return bundle2;
    }

    public final a0 c() {
        return (a0) this.f3479d.getValue();
    }

    public final void d() {
        if (this.f3477b) {
            return;
        }
        Bundle bundleB = this.f3476a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3478c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f3478c = bundle;
        this.f3477b = true;
        c();
    }
}
