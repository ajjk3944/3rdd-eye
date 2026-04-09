package J8;

import A9.C0583j;
import b9.C1992A;
import com.android.installreferrer.api.InstallReferrerClient;
import f9.InterfaceC4347e;

/* compiled from: InstallReferrer.kt */
@h9.e(c = "com.zipoapps.premiumhelper.util.InstallReferrer$get$2", f = "InstallReferrer.kt", l = {21}, m = "invokeSuspend")
/* renamed from: J8.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0706v extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super String>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f2901l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f2902m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0706v(x xVar, InterfaceC4347e<? super C0706v> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f2902m = xVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C0706v(this.f2902m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super String> interfaceC4347e) {
        return ((C0706v) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f2901l;
        if (i == 0) {
            b9.n.b(obj);
            x xVar = this.f2902m;
            String string = xVar.f2907b.f37004a.getString("install_referrer", null);
            if (string != null) {
                return string;
            }
            this.f2901l = 1;
            C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(this));
            c0583j.s();
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(xVar.f2906a).build();
            installReferrerClientBuild.startConnection(new w(installReferrerClientBuild, xVar, c0583j));
            obj = c0583j.r();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return (String) obj;
    }
}
