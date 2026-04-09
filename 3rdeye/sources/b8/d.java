package B8;

import A2.l;
import A9.C0575f;
import A9.E;
import A9.U;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ActivityC1762o;
import b9.C1992A;
import b9.n;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import h9.i;
import p9.p;

/* compiled from: PhSettingsFragment.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.settings.PhSettingsFragment$setupAppVersionSection$1$1$1", f = "PhSettingsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.ui.settings.a f589l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.zipoapps.premiumhelper.ui.settings.a aVar, InterfaceC4347e<? super d> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f589l = aVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new d(this.f589l, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((d) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        n.b(obj);
        ActivityC1762o activityC1762oRequireActivity = this.f589l.requireActivity();
        AppCompatActivity appCompatActivity = activityC1762oRequireActivity instanceof AppCompatActivity ? (AppCompatActivity) activityC1762oRequireActivity : null;
        if (appCompatActivity == null) {
            return C1992A.f18074a;
        }
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        e.a.a().f37011C.getClass();
        C0575f.e(l.y(appCompatActivity), U.f212b, null, new e(appCompatActivity, null), 2);
        return C1992A.f18074a;
    }
}
