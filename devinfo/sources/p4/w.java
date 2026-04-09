package p4;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w extends ek.j implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31336b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f31337c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f31338d;

    /* renamed from: e, reason: collision with root package name */
    public Object f31339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f31340f;
    public final /* synthetic */ Serializable g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(nk.u uVar, z zVar, nk.s sVar, ck.c cVar) {
        super(1, cVar);
        this.f31340f = uVar;
        this.f31338d = zVar;
        this.g = sVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ek.j, mk.e] */
    @Override // ek.a
    public final ck.c create(ck.c cVar) {
        switch (this.f31336b) {
            case 0:
                return new w((nk.u) this.f31340f, this.f31338d, (nk.s) this.g, cVar);
            default:
                return new w(this.f31338d, (ck.h) this.f31340f, (mk.e) this.g, cVar);
        }
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        ck.c cVar = (ck.c) obj;
        switch (this.f31336b) {
        }
        return ((w) create(cVar)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Type inference failed for: r7v3, types: [ek.j, mk.e] */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(z zVar, ck.h hVar, mk.e eVar, ck.c cVar) {
        super(1, cVar);
        this.f31338d = zVar;
        this.f31340f = hVar;
        this.g = (ek.j) eVar;
    }
}
