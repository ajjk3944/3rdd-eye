package al;

import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.liuzh.deviceinfo.pro.account.Sku;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f561b;

    /* renamed from: c, reason: collision with root package name */
    public int f562c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f563d;

    /* renamed from: e, reason: collision with root package name */
    public Object f564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f565f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Object obj2, Serializable serializable, ck.c cVar, int i4) {
        super(2, cVar);
        this.f561b = i4;
        this.f564e = obj;
        this.f565f = obj2;
        this.g = serializable;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.io.Serializable, java.lang.String[]] */
    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f561b) {
            case 0:
                m mVar = new m((nk.u) this.f565f, (i) this.g, cVar);
                mVar.f563d = obj;
                return mVar;
            case 1:
                m mVar2 = new m((h) this.f564e, (i1) this.f565f, (Float) this.g, cVar, 1);
                mVar2.f563d = obj;
                return mVar2;
            case 2:
                return new m((f1) this.f564e, (h) this.f565f, (i1) this.f563d, (Float) this.g, cVar, 2);
            case 3:
                return new m((String) this.f564e, (Sku) this.f565f, (si.c) this.f563d, (bh.w) this.g, cVar, 3);
            case 4:
                return new m((t6.u) this.f564e, (b7.r) this.f565f, (c7.r) this.f563d, (Context) this.g, cVar, 4);
            case 5:
                return new m((o8.b) this.f564e, (b7.r) this.f565f, (AtomicInteger) this.f563d, (vd.b) this.g, cVar, 5);
            case 6:
                return new m((ConstraintTrackingWorker) this.f564e, (t6.u) this.f565f, (o8.b) this.f563d, (b7.r) this.g, cVar, 6);
            case 7:
                return new m((o2.c) this.f564e, (ScrollCaptureSession) this.f565f, (Rect) this.f563d, (Consumer) this.g, cVar, 7);
            case 8:
                return new m((sf.d) this.f564e, (Map) this.f563d, (pf.n) this.f565f, (ah.a) this.g, cVar);
            default:
                m mVar3 = new m(this.f564e, this.f565f, (Serializable) this.g, cVar, 9);
                mVar3.f563d = obj;
                return mVar3;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f561b) {
            case 0:
                return ((m) create(new zk.o(((zk.o) obj).f38368a), (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 1:
                return ((m) create((b1) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 2:
                return ((m) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 3:
                return ((m) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 4:
                return ((m) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 5:
                return ((m) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 6:
                return ((m) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 7:
                return ((m) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 8:
                return ((m) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                ((m) create((i) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
                return dk.a.f22275a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00b4 A[EXC_TOP_SPLITTER, PHI: r0 r16
  0x00b4: PHI (r0v103 al.i) = (r0v100 al.i), (r0v102 al.i), (r0v110 al.i) binds: [B:28:0x0091, B:33:0x00b1, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r16v6 long) = (r16v4 long), (r16v5 long), (r16v9 long) binds: [B:28:0x0091, B:33:0x00b1, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:39:0x00da, B:41:0x00de, B:43:0x00ee), top: B:233:0x00da }] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, java.util.Map] */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, ck.c cVar, int i4) {
        super(2, cVar);
        this.f561b = i4;
        this.f564e = obj;
        this.f565f = obj2;
        this.f563d = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(nk.u uVar, i iVar, ck.c cVar) {
        super(2, cVar);
        this.f561b = 0;
        this.f565f = uVar;
        this.g = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(sf.d dVar, Map map, pf.n nVar, ah.a aVar, ck.c cVar) {
        super(2, cVar);
        this.f561b = 8;
        this.f564e = dVar;
        this.f563d = map;
        this.f565f = nVar;
        this.g = aVar;
    }
}
