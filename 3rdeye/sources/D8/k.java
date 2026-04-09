package D8;

import A9.E;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: PhSecretSettingsViewModel.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsViewModel$fetchRemoteTotoConfig$1", f = "PhSecretSettingsViewModel.kt", l = {40, 41, 54, 63}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class k extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f1115l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f1116m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, InterfaceC4347e<? super k> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f1116m = iVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new k(this.f1116m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((k) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0136, code lost:
    
        if (b9.C1992A.f18074a != r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014a, code lost:
    
        if (b9.C1992A.f18074a != r2) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:11:0x0025, B:14:0x002d, B:24:0x005c, B:25:0x0084, B:27:0x008a, B:28:0x00ad, B:30:0x00b3, B:31:0x00d6, B:33:0x00dc, B:38:0x00f7, B:40:0x00fb, B:42:0x0103, B:43:0x0111, B:44:0x0117, B:15:0x0033, B:21:0x0047, B:18:0x003a), top: B:52:0x000e }] */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
