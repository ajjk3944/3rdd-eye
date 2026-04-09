package H8;

import A9.E;
import b9.C1992A;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import f9.InterfaceC4347e;
import p9.p;

/* compiled from: PHSplashActivity.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$onSplashConfigurationCompleted$1", f = "PHSplashActivity.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f extends h9.i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public PHSplashActivity f2316l;

    /* renamed from: m, reason: collision with root package name */
    public int f2317m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PHSplashActivity f2318n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PHSplashActivity pHSplashActivity, InterfaceC4347e<? super f> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f2318n = pHSplashActivity;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new f(this.f2318n, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((f) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H8.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
