package hh;

import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f25138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(y yVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f25137b = i4;
        this.f25138c = yVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f25137b) {
            case 0:
                return new w(this.f25138c, cVar, 0);
            default:
                return new w(this.f25138c, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        al.i iVar = (al.i) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f25137b) {
            case 0:
                w wVar = (w) create(iVar, cVar);
                yj.u uVar = yj.u.f37649a;
                wVar.invokeSuspend(uVar);
                return uVar;
            default:
                w wVar2 = (w) create(iVar, cVar);
                yj.u uVar2 = yj.u.f37649a;
                wVar2.invokeSuspend(uVar2);
                return uVar2;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25137b) {
            case 0:
                ci.b.D(obj);
                this.f25138c.f25144d.h(new r(hg.e.e(R.string.get_verification_code), false, true));
                break;
            default:
                ci.b.D(obj);
                r5.c.t(true, this.f25138c.f25146f);
                break;
        }
        return yj.u.f37649a;
    }
}
