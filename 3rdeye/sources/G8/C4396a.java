package g8;

import A8.k;
import A8.n;
import android.app.Application;
import androidx.lifecycle.Q;
import com.zipoapps.premiumhelper.e;
import f8.AbstractC4342e;
import f8.EnumC4341d;
import kotlin.jvm.internal.l;

/* compiled from: RelaunchViewModel.kt */
/* renamed from: g8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4396a extends AbstractC4342e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4396a(Application application, Q savedStateHandle) {
        super(application, savedStateHandle, EnumC4341d.RELAUNCH);
        l.f(application, "application");
        l.f(savedStateHandle, "savedStateHandle");
    }

    @Override // f8.AbstractC4342e
    public final void g() {
        if (l.b(h(), "relaunch")) {
            e.f37006D.getClass();
            k kVar = e.a.a().f37010B;
            kVar.getClass();
            kVar.f135a.registerActivityLifecycleCallbacks(new n(kVar));
        }
        this.f37841l.i(AbstractC4342e.a.C0454a.f37845a);
    }
}
