package da;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AbstractC4003a;
import com.ui.core.ui.sso.SSOAccountVM;
import kotlin.jvm.internal.AbstractC6492s;
import q2.InterfaceC7418f;

/* loaded from: classes3.dex */
public final class v extends AbstractC4003a {

    /* renamed from: e, reason: collision with root package name */
    private final Application f45975e;

    /* renamed from: f, reason: collision with root package name */
    private final SSOAccountVM f45976f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Application app, SSOAccountVM sessionVM, InterfaceC7418f owner, Bundle bundle) {
        super(owner, bundle);
        AbstractC6492s.i(app, "app");
        AbstractC6492s.i(sessionVM, "sessionVM");
        AbstractC6492s.i(owner, "owner");
        this.f45975e = app;
        this.f45976f = sessionVM;
    }

    @Override // androidx.lifecycle.AbstractC4003a
    protected androidx.lifecycle.N f(String key, Class modelClass, androidx.lifecycle.E handle) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(handle, "handle");
        if (modelClass.isAssignableFrom(AbstractC5338u.class)) {
            return new I(this.f45976f, new ca.d(this.f45975e));
        }
        if (modelClass.isAssignableFrom(ea.e.class)) {
            return new ea.h(this.f45976f, new ca.d(this.f45975e));
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
