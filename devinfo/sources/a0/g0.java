package a0;

import android.view.View;
import j2.g2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import u0.s1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52b;

    /* renamed from: c, reason: collision with root package name */
    public int f53c;

    /* renamed from: d, reason: collision with root package name */
    public Object f54d;

    /* renamed from: e, reason: collision with root package name */
    public Object f55e;

    /* renamed from: f, reason: collision with root package name */
    public Object f56f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f57h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f58i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(h0 h0Var, mk.c cVar, ck.c cVar2) {
        super(2, cVar2);
        this.f52b = 0;
        this.f57h = h0Var;
        this.f58i = (ek.j) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ek.j, mk.c] */
    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f52b) {
            case 0:
                g0 g0Var = new g0((h0) this.f57h, (mk.c) this.f58i, cVar);
                g0Var.f56f = obj;
                return g0Var;
            case 1:
                g0 g0Var2 = new g0((String) this.f55e, (String) this.f56f, (String) this.g, (String) this.f57h, (String) this.f58i, cVar, 1);
                g0Var2.f54d = obj;
                return g0Var2;
            case 2:
                g0 g0Var3 = new g0((t6.u) this.g, (o8.b) this.f57h, (b7.r) this.f58i, cVar);
                g0Var3.f54d = obj;
                return g0Var3;
            case 3:
                return new g0((String) this.f55e, (String) this.f54d, (String) this.f56f, (String) this.g, (String) this.f57h, (hh.i) this.f58i, cVar);
            case 4:
                g0 g0Var4 = new g0((nk.u) this.f55e, (s1) this.f56f, (androidx.lifecycle.a0) this.g, (g2) this.f57h, (View) this.f58i, cVar, 4);
                g0Var4.f54d = obj;
                return g0Var4;
            default:
                g0 g0Var5 = new g0((List) this.f57h, (ArrayList) this.f58i, cVar);
                g0Var5.f56f = obj;
                return g0Var5;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52b) {
            case 0:
                return ((g0) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 1:
                return ((g0) create((al.i) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 2:
                return ((g0) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 3:
                return ((g0) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 4:
                return ((g0) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                return ((g0) create(obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [mk.c] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a0.h0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a0.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [gl.a] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [xk.y0] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33, types: [xk.y0] */
    /* JADX WARN: Type inference failed for: r2v35, types: [xk.y0] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [gl.a] */
    /* JADX WARN: Type inference failed for: r2v7, types: [a0.f0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [a0.f0] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007a -> B:13:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a3 -> B:13:0x0057). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Serializable serializable, Object obj, Object obj2, Object obj3, Object obj4, ck.c cVar, int i4) {
        super(2, cVar);
        this.f52b = i4;
        this.f55e = serializable;
        this.f56f = obj;
        this.g = obj2;
        this.f57h = obj3;
        this.f58i = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String str, String str2, String str3, String str4, String str5, hh.i iVar, ck.c cVar) {
        super(2, cVar);
        this.f52b = 3;
        this.f55e = str;
        this.f54d = str2;
        this.f56f = str3;
        this.g = str4;
        this.f57h = str5;
        this.f58i = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(List list, ArrayList arrayList, ck.c cVar) {
        super(2, cVar);
        this.f52b = 5;
        this.f57h = list;
        this.f58i = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(t6.u uVar, o8.b bVar, b7.r rVar, ck.c cVar) {
        super(2, cVar);
        this.f52b = 2;
        this.g = uVar;
        this.f57h = bVar;
        this.f58i = rVar;
    }
}
