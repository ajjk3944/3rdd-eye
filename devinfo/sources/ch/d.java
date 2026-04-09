package ch;

import com.liuzh.deviceinfo.pro.account.mode.ApiException;
import ek.j;
import java.util.concurrent.atomic.AtomicBoolean;
import km.s;
import nk.k;
import yj.l;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2864b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2865c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f2867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(mk.c cVar, ck.c cVar2) {
        super(2, cVar2);
        this.f2867e = (j) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ek.j, mk.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ek.j, mk.e] */
    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2864b) {
            case 0:
                d dVar = new d((mk.c) this.f2867e, cVar);
                dVar.f2866d = obj;
                return dVar;
            default:
                d dVar2 = new d((mk.e) this.f2867e, cVar);
                dVar2.f2866d = obj;
                return dVar2;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2864b) {
            case 0:
                return ((d) create((al.i) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
            default:
                return ((d) create((t4.b) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ek.j, mk.e] */
    /* JADX WARN: Type inference failed for: r10v5, types: [ek.j, mk.c] */
    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2864b) {
            case 0:
                al.i iVar = (al.i) this.f2866d;
                int i4 = this.f2865c;
                u uVar = u.f37649a;
                dk.a aVar = dk.a.f22275a;
                try {
                } catch (s e2) {
                    l lVar = new l(ci.b.h(new ApiException(e2.f28456a, e2.f28457b)));
                    this.f2866d = null;
                    this.f2865c = 2;
                    if (iVar.c(lVar, this) != aVar) {
                        return uVar;
                    }
                }
                if (i4 == 0) {
                    ci.b.D(obj);
                    ?? r10 = this.f2867e;
                    this.f2866d = iVar;
                    this.f2865c = 1;
                    obj = r10.invoke(this);
                    if (obj == aVar) {
                    }
                    return aVar;
                }
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3 && i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                fh.e eVar = (fh.e) obj;
                if (eVar.d()) {
                    l lVar2 = new l(eVar);
                    this.f2866d = null;
                    this.f2865c = 3;
                    if (iVar.c(lVar2, this) != aVar) {
                        return uVar;
                    }
                } else {
                    l lVar3 = new l(ci.b.h(eVar.a()));
                    this.f2866d = null;
                    this.f2865c = 4;
                    if (iVar.c(lVar3, this) != aVar) {
                        return uVar;
                    }
                }
                return aVar;
            default:
                int i10 = this.f2865c;
                if (i10 == 0) {
                    ci.b.D(obj);
                    t4.b bVar = (t4.b) this.f2866d;
                    this.f2865c = 1;
                    obj = this.f2867e.invoke(bVar, this);
                    dk.a aVar2 = dk.a.f22275a;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                t4.b bVar2 = (t4.b) obj;
                k.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar2.f34166b.f30011b).set(true);
                return bVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(mk.e eVar, ck.c cVar) {
        super(2, cVar);
        this.f2867e = (j) eVar;
    }
}
