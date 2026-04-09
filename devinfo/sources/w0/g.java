package w0;

import ek.i;
import g2.e1;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends i implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36400a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f36401b;

    /* renamed from: c, reason: collision with root package name */
    public int f36402c;

    /* renamed from: d, reason: collision with root package name */
    public int f36403d;

    /* renamed from: e, reason: collision with root package name */
    public int f36404e;

    /* renamed from: f, reason: collision with root package name */
    public int f36405f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public int f36406h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f36407i;
    public Object j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f36408k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, ck.c cVar, int i4) {
        super(2, cVar);
        this.f36400a = i4;
        this.f36408k = obj;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f36400a) {
            case 0:
                g gVar = new g((h) this.f36408k, cVar, 0);
                gVar.f36407i = obj;
                return gVar;
            case 1:
                g gVar2 = new g((x.g) this.f36408k, cVar, 1);
                gVar2.f36407i = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((x.g) this.f36408k, cVar, 2);
                gVar3.f36407i = obj;
                return gVar3;
            default:
                g gVar4 = new g((e1) this.f36408k, cVar, 3);
                gVar4.f36407i = obj;
                return gVar4;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        uk.h hVar = (uk.h) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f36400a) {
        }
        return ((g) create(hVar, cVar)).invokeSuspend(u.f37649a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0280  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0059 -> B:23:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:16:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0075 -> B:20:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f5 -> B:46:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f7 -> B:39:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0111 -> B:43:0x0130). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x018f -> B:69:0x01e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0191 -> B:62:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01ac -> B:66:0x01d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x023a -> B:92:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x023c -> B:85:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0256 -> B:89:0x0275). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
