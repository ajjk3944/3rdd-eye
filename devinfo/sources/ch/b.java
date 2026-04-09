package ch;

import ek.j;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2854b;

    /* renamed from: c, reason: collision with root package name */
    public int f2855c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2858f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i4, String str2, ck.c cVar) {
        super(2, cVar);
        this.f2854b = i4;
        this.f2857e = str;
        this.f2858f = str2;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2854b) {
            case 0:
                String str = this.f2858f;
                b bVar = new b(this.f2857e, 0, str, cVar);
                bVar.f2856d = obj;
                return bVar;
            case 1:
                String str2 = this.f2858f;
                b bVar2 = new b(this.f2857e, 1, str2, cVar);
                bVar2.f2856d = obj;
                return bVar2;
            case 2:
                String str3 = this.f2858f;
                b bVar3 = new b(this.f2857e, 2, str3, cVar);
                bVar3.f2856d = obj;
                return bVar3;
            default:
                String str4 = this.f2858f;
                b bVar4 = new b(this.f2857e, 3, str4, cVar);
                bVar4.f2856d = obj;
                return bVar4;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        al.i iVar = (al.i) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f2854b) {
        }
        return ((b) create(iVar, cVar)).invokeSuspend(u.f37649a);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
