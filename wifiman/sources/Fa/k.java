package fa;

import android.os.Bundle;
import androidx.lifecycle.AbstractC4003a;
import androidx.lifecycle.E;
import androidx.lifecycle.N;
import com.ui.core.ui.sso.SSOAccountVM;
import kotlin.jvm.internal.AbstractC6492s;
import q2.InterfaceC7418f;

/* loaded from: classes3.dex */
public final class k extends AbstractC4003a {

    /* renamed from: e, reason: collision with root package name */
    private final SSOAccountVM f47218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SSOAccountVM sessionVM, InterfaceC7418f owner, Bundle bundle) {
        super(owner, bundle);
        AbstractC6492s.i(sessionVM, "sessionVM");
        AbstractC6492s.i(owner, "owner");
        this.f47218e = sessionVM;
    }

    @Override // androidx.lifecycle.AbstractC4003a
    protected N f(String key, Class modelClass, E handle) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(handle, "handle");
        if (modelClass.isAssignableFrom(j.class)) {
            return new q(this.f47218e);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
