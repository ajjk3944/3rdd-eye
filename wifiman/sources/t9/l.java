package T9;

import android.os.Bundle;
import androidx.lifecycle.AbstractC4003a;
import androidx.lifecycle.E;
import androidx.lifecycle.N;
import com.ui.core.ui.sso.SSOAccountVM;
import com.ui.core.ui.sso.login.UiLoginVMImpl;
import ka.InterfaceC6411a;
import kotlin.jvm.internal.AbstractC6492s;
import q2.InterfaceC7418f;

/* loaded from: classes3.dex */
public final class l extends AbstractC4003a {

    /* renamed from: e, reason: collision with root package name */
    private final SSOAccountVM f21510e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6411a f21511f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SSOAccountVM sessionVM, InterfaceC6411a vibrator, InterfaceC7418f owner, Bundle bundle) {
        super(owner, bundle);
        AbstractC6492s.i(sessionVM, "sessionVM");
        AbstractC6492s.i(vibrator, "vibrator");
        AbstractC6492s.i(owner, "owner");
        this.f21510e = sessionVM;
        this.f21511f = vibrator;
    }

    @Override // androidx.lifecycle.AbstractC4003a
    protected N f(String key, Class modelClass, E handle) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(handle, "handle");
        if (modelClass.isAssignableFrom(com.ui.core.ui.sso.login.g.class)) {
            return new UiLoginVMImpl(this.f21510e, handle, this.f21511f);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
