package D8;

import A9.E;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: PhSecretSettingsViewModel.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsViewModel$fetchCachedTotoConfig$1", f = "PhSecretSettingsViewModel.kt", l = {23, 31}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class j extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f1113l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f1114m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, InterfaceC4347e<? super j> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f1114m = iVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new j(this.f1114m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((j) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        if (b9.C1992A.f18074a == r1) goto L19;
     */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f1113l
            D8.i r3 = r0.f1114m
            D9.J r3 = r3.f1105b
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L23
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            b9.n.b(r18)
            goto La5
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            b9.n.b(r18)
            goto L32
        L23:
            b9.n.b(r18)
            D8.i$b$b r2 = D8.i.b.C0012b.f1108a
            r0.f1113l = r5
            r3.setValue(r2)
            b9.A r2 = b9.C1992A.f18074a
            if (r2 != r1) goto L32
            goto La4
        L32:
            com.zipoapps.premiumhelper.e$a r2 = com.zipoapps.premiumhelper.e.f37006D
            r2.getClass()
            com.zipoapps.premiumhelper.e r2 = com.zipoapps.premiumhelper.e.a.a()
            l8.b r2 = r2.f37020j
            p8.c r2 = r2.f43914f
            java.util.Map r2 = r2.e()
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.HashMap r2 = (java.util.HashMap) r2
            int r7 = r2.size()
            r6.<init>(r7)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L56:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L88
            java.lang.Object r7 = r2.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            D8.n$a r9 = new D8.n$a
            java.lang.Object r10 = r7.getKey()
            java.lang.String r10 = (java.lang.String) r10
            r9.<init>(r10)
            r8.add(r9)
            D8.n$b r9 = new D8.n$b
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            r10 = -1
            r9.<init>(r7, r10, r5)
            r8.add(r9)
            r6.add(r8)
            goto L56
        L88:
            java.util.ArrayList r12 = c9.C2092m.U(r6)
            D8.i$b$c r11 = new D8.i$b$c
            D8.i$a r13 = D8.i.a.LOCAL
            r14 = 0
            r16 = 0
            r11.<init>(r12, r13, r14, r16)
            r0.f1113l = r4
            r3.getClass()
            r2 = 0
            r3.g(r2, r11)
            b9.A r2 = b9.C1992A.f18074a
            if (r2 != r1) goto La5
        La4:
            return r1
        La5:
            b9.A r1 = b9.C1992A.f18074a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
