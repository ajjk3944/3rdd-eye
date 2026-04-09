package P9;

import android.os.Bundle;
import androidx.lifecycle.AbstractC4003a;
import androidx.lifecycle.E;
import androidx.lifecycle.N;
import com.ui.core.ui.sso.SSOAccountVM;
import com.ui.sso.api.UiAccountApi;
import kotlin.jvm.internal.AbstractC6492s;
import q2.InterfaceC7418f;

/* loaded from: classes3.dex */
public final class f extends AbstractC4003a {

    /* renamed from: e, reason: collision with root package name */
    private final UiAccountApi.b f18481e;

    /* renamed from: f, reason: collision with root package name */
    private SSOAccountVM f18482f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(UiAccountApi.b uiAccountApiService, k kVar, InterfaceC7418f owner, Bundle bundle) {
        super(owner, bundle);
        AbstractC6492s.i(uiAccountApiService, "uiAccountApiService");
        AbstractC6492s.i(owner, "owner");
        this.f18481e = uiAccountApiService;
    }

    @Override // androidx.lifecycle.AbstractC4003a
    protected N f(String key, Class modelClass, E handle) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(handle, "handle");
        if (modelClass.isAssignableFrom(SSOAccountVM.class)) {
            SSOAccountVM sSOAccountVM = new SSOAccountVM(this.f18481e, handle, null);
            this.f18482f = sSOAccountVM;
            return sSOAccountVM;
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
