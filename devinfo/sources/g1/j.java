package g1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends ek.i implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public long[] f24244a;

    /* renamed from: b, reason: collision with root package name */
    public int f24245b;

    /* renamed from: c, reason: collision with root package name */
    public int f24246c;

    /* renamed from: d, reason: collision with root package name */
    public int f24247d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f24248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f24249f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ck.c cVar) {
        super(2, cVar);
        this.f24249f = kVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        j jVar = new j(this.f24249f, cVar);
        jVar.f24248e = obj;
        return jVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((uk.h) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:26:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bd -> B:37:0x00bf). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
