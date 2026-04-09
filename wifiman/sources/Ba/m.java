package ba;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AbstractC4003a;
import androidx.lifecycle.E;
import androidx.lifecycle.N;
import com.ui.core.ui.sso.SSOAccountVM;
import kotlin.jvm.internal.AbstractC6492s;
import q2.InterfaceC7418f;

/* loaded from: classes3.dex */
public final class m extends AbstractC4003a {

    /* renamed from: e, reason: collision with root package name */
    private final Application f33050e;

    /* renamed from: f, reason: collision with root package name */
    private final SSOAccountVM f33051f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Application app, SSOAccountVM sessionVM, InterfaceC7418f owner, Bundle bundle) {
        super(owner, bundle);
        AbstractC6492s.i(app, "app");
        AbstractC6492s.i(sessionVM, "sessionVM");
        AbstractC6492s.i(owner, "owner");
        this.f33050e = app;
        this.f33051f = sessionVM;
    }

    @Override // androidx.lifecycle.AbstractC4003a
    protected N f(String key, Class modelClass, E handle) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(handle, "handle");
        if (modelClass.isAssignableFrom(l.class)) {
            return new t(this.f33051f, new ca.d(this.f33050e));
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
