package k8;

import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.ArrayList;
import k8.G;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$launchDebugBillingFlow$1$1", f = "Billing.kt", l = {621, 623}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class q extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f43554l;

    /* renamed from: m, reason: collision with root package name */
    public int f43555m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f43556n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G.a f43557o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, G.a aVar, InterfaceC4347e<? super q> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f43556n = tVar;
        this.f43557o = aVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new q(this.f43556n, this.f43557o, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((q) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f0, code lost:
    
        if (r12.emit(r0, r11) != r3) goto L30;
     */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
