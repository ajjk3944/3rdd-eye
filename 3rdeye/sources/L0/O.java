package L0;

import android.view.View;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: View.kt */
@h9.e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class O extends h9.h implements p9.p<x9.i<? super View>, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: m, reason: collision with root package name */
    public int f3814m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3815n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f3816o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(View view, InterfaceC4347e<? super O> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f3816o = view;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        O o10 = new O(this.f3816o, interfaceC4347e);
        o10.f3815n = obj;
        return o10;
    }

    @Override // p9.p
    public final Object invoke(x9.i<? super View> iVar, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((O) create(iVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r5.f3814m
            android.view.View r2 = r5.f3816o
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            b9.n.b(r6)
            goto L5c
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.f3815n
            x9.i r1 = (x9.i) r1
            b9.n.b(r6)
            goto L35
        L22:
            b9.n.b(r6)
            java.lang.Object r6 = r5.f3815n
            r1 = r6
            x9.i r1 = (x9.i) r1
            r5.f3815n = r1
            r5.f3814m = r4
            g9.a r6 = r1.a(r2, r5)
            if (r6 != r0) goto L35
            goto L5b
        L35:
            boolean r6 = r2 instanceof android.view.ViewGroup
            if (r6 == 0) goto L5c
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6 = 0
            r5.f3815n = r6
            r5.f3814m = r3
            r1.getClass()
            L0.A r6 = new L0.A
            C6.o r3 = new C6.o
            r4 = 1
            r3.<init>(r2, r4)
            L0.M r2 = L0.M.f3813g
            r6.<init>(r3, r2)
            java.lang.Object r6 = r1.c(r6, r5)
            if (r6 != r0) goto L57
            goto L59
        L57:
            b9.A r6 = b9.C1992A.f18074a
        L59:
            if (r6 != r0) goto L5c
        L5b:
            return r0
        L5c:
            b9.A r6 = b9.C1992A.f18074a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.O.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
