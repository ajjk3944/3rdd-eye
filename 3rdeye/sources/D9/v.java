package D9;

import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: Zip.kt */
@h9.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class v extends h9.i implements p9.q<InterfaceC0645g<Object>, Object[], InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f1263l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ InterfaceC0645g f1264m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object[] f1265n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h9.i f1266o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(p9.q<Object, Object, ? super InterfaceC4347e<Object>, ? extends Object> qVar, InterfaceC4347e<? super v> interfaceC4347e) {
        super(3, interfaceC4347e);
        this.f1266o = (h9.i) qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [h9.i, p9.q] */
    @Override // p9.q
    public final Object invoke(InterfaceC0645g<Object> interfaceC0645g, Object[] objArr, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        v vVar = new v(this.f1266o, interfaceC4347e);
        vVar.f1264m = interfaceC0645g;
        vVar.f1265n = objArr;
        return vVar.invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [h9.i, p9.q] */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r5.f1263l
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            b9.n.b(r6)
            goto L43
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            D9.g r1 = r5.f1264m
            b9.n.b(r6)
            goto L37
        L1e:
            b9.n.b(r6)
            D9.g r1 = r5.f1264m
            java.lang.Object[] r6 = r5.f1265n
            r4 = 0
            r4 = r6[r4]
            r6 = r6[r3]
            r5.f1264m = r1
            r5.f1263l = r3
            h9.i r3 = r5.f1266o
            java.lang.Object r6 = r3.invoke(r4, r6, r5)
            if (r6 != r0) goto L37
            goto L42
        L37:
            r3 = 0
            r5.f1264m = r3
            r5.f1263l = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L43
        L42:
            return r0
        L43:
            b9.A r6 = b9.C1992A.f18074a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
