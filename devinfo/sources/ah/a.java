package ah;

import al.b1;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import p4.j0;
import u0.o1;
import xk.v;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f370b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4, ck.c cVar, int i10) {
        super(i4, cVar);
        this.f370b = i10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f370b) {
            case 0:
                return new a(this.f371c, cVar);
            case 1:
                a aVar = new a(2, cVar, 1);
                aVar.f371c = obj;
                return aVar;
            case 2:
                a aVar2 = new a(2, cVar, 2);
                aVar2.f371c = ((yj.l) obj).f37641a;
                return aVar2;
            case 3:
                a aVar3 = new a(2, cVar, 3);
                aVar3.f371c = obj;
                return aVar3;
            case 4:
                a aVar4 = new a(2, cVar, 4);
                aVar4.f371c = obj;
                return aVar4;
            default:
                a aVar5 = new a(2, cVar, 5);
                aVar5.f371c = obj;
                return aVar5;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f370b) {
            case 0:
                a aVar = (a) create((v) obj, (ck.c) obj2);
                u uVar = u.f37649a;
                aVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                return ((a) create((b1) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
            case 2:
                Object obj3 = ((yj.l) obj).f37641a;
                a aVar2 = new a(2, (ck.c) obj2, 2);
                aVar2.f371c = obj3;
                u uVar2 = u.f37649a;
                aVar2.invokeSuspend(uVar2);
                return uVar2;
            case 3:
                return ((a) create((p4.b1) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
            case 4:
                a aVar3 = (a) create((String) obj, (ck.c) obj2);
                u uVar3 = u.f37649a;
                aVar3.invokeSuspend(uVar3);
                return uVar3;
            default:
                return ((a) create((o1) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f370b;
        u uVar = u.f37649a;
        switch (i4) {
            case 0:
                ci.b.D(obj);
                Iterator it = this.f371c.iterator();
                while (it.hasNext()) {
                    ((si.c) it.next()).getClass();
                }
                return uVar;
            case 1:
                ci.b.D(obj);
                return Boolean.valueOf(((b1) this.f371c) != b1.f483a);
            case 2:
                Object obj2 = this.f371c;
                ci.b.D(obj);
                if (obj2 instanceof yj.k) {
                    obj2 = null;
                }
                return uVar;
            case 3:
                ci.b.D(obj);
                return Boolean.valueOf(!(((p4.b1) this.f371c) instanceof j0));
            case 4:
                ci.b.D(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f371c));
                return uVar;
            default:
                ci.b.D(obj);
                return Boolean.valueOf(((o1) this.f371c) == o1.f34892a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List list, ck.c cVar) {
        super(2, cVar);
        this.f370b = 0;
        this.f371c = list;
    }
}
