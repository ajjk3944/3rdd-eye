package i8;

import A9.E;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: PremiumHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$onHappyMoment$1", f = "PremiumHelper.kt", l = {336, 342}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class l extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f38606l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.e f38607m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f38608n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f38609o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.zipoapps.premiumhelper.e eVar, AppCompatActivity appCompatActivity, int i, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f38607m = eVar;
        this.f38608n = appCompatActivity;
        this.f38609o = i;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new l(this.f38607m, this.f38608n, this.f38609o, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((l) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(3:6|29|30)(2:7|8))(1:9))(3:10|(0)|28)|13|31|14|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        va.a.f47104a.c(io.appmetrica.analytics.impl.Oo.h("Invalid remote value for for '", r9.getClass().getSimpleName(), "': ", r8, ". Returning key's default value."), new java.lang.Object[0]);
        r7 = r7.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.l.e(r7, "toUpperCase(...)");
        r10 = java.lang.Enum.valueOf(w8.i.a.class, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010a, code lost:
    
        if (A9.O.a(1000, r14) != r0) goto L29;
     */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
