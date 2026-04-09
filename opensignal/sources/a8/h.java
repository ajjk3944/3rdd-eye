package a8;

import ak.j1;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.compose.material.ripple.RippleNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import ar.n;
import d4.c0;
import h9.r2;
import java.util.LinkedHashSet;
import java.util.List;
import kg.r;
import lq.b0;
import n0.h1;
import n0.o1;
import tg.a1;
import tg.f0;
import tg.t0;
import wt.t;
import y1.m1;
import zt.m0;

/* loaded from: classes.dex */
public final class h extends rq.j implements n {
    public Object B;
    public final /* synthetic */ Object D;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f203x;

    /* renamed from: y, reason: collision with root package name */
    public int f204y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, int i10, LinearLayoutManager linearLayoutManager, pq.c cVar) {
        super(2, cVar);
        this.f203x = 10;
        this.B = context;
        this.f204y = i10;
        this.D = linearLayoutManager;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [ar.n, rq.j] */
    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f203x) {
            case 0:
                return new h((l) this.B, (l8.j) this.D, cVar, 0);
            case 1:
                h hVar = new h((au.f) this.D, cVar, 1);
                hVar.B = obj;
                return hVar;
            case 2:
                h hVar2 = new h((au.g) this.D, cVar, 2);
                hVar2.B = obj;
                return hVar2;
            case 3:
                h hVar3 = new h((zt.g) this.D, cVar, 3);
                hVar3.B = obj;
                return hVar3;
            case 4:
                return new h((of.b) this.B, (LinkedHashSet) this.D, cVar, 4);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                h hVar4 = new h((List) this.D, cVar, 5);
                hVar4.B = obj;
                return hVar4;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new h((n) this.B, (d4.c) this.D, cVar);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                h hVar5 = new h((c0) this.D, cVar, 7);
                hVar5.B = obj;
                return hVar5;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new h((r) this.D, cVar, 8);
            case 9:
                return new h((d7.a) this.B, (Uri) this.D, cVar, 9);
            case 10:
                return new h((Context) this.B, this.f204y, (LinearLayoutManager) this.D, cVar);
            case 11:
                h hVar6 = new h((RippleNode) this.D, cVar, 11);
                hVar6.B = obj;
                return hVar6;
            case 12:
                return new h((g1.f) this.B, (w.f) this.D, cVar, 12);
            case 13:
                return new h((zt.f) this.B, (h1) this.D, cVar, 13);
            case 14:
                return new h((r2) this.B, (j1) this.D, cVar, 14);
            case 15:
                return new h((tg.n) this.B, (t0) this.D, cVar, 15);
            case 16:
                return new h((a1) this.B, (f0) this.D, cVar, 16);
            case 17:
                h hVar7 = new h((js.e) this.D, cVar, 17);
                hVar7.B = obj;
                return hVar7;
            case 18:
                return new h((uf.b) this.B, (ar.k) this.D, cVar, 18);
            case 19:
                return new h((uf.b) this.B, (h4.e) this.D, cVar, 19);
            case 20:
                h hVar8 = new h((wg.c) this.D, cVar, 20);
                hVar8.B = obj;
                return hVar8;
            case 21:
                return new h((a0.i) this.B, (a0.f) this.D, cVar, 21);
            case 22:
                return new h((a0.i) this.B, (a0.g) this.D, cVar, 22);
            case 23:
                return new h((o1) this.B, (View) this.D, cVar, 23);
            case 24:
                return new h((m0) this.B, (m1) this.D, cVar, 24);
            default:
                h hVar9 = new h((yt.r) this.D, cVar, 25);
                hVar9.B = obj;
                return hVar9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x03cd, code lost:
    
        if (r3.b(r19) == r4) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0711, code lost:
    
        if (r3.w(r2, r19) != r0) goto L406;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:561:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v110, types: [tg.a1] */
    /* JADX WARN: Type inference failed for: r2v26, types: [ar.n, rq.j] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35, types: [tg.w0] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r6v0, types: [pq.c] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r8v25, types: [tg.f0] */
    /* JADX WARN: Type inference failed for: r8v26, types: [tg.f0] */
    /* JADX WARN: Type inference failed for: r8v29, types: [tg.p0] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:404:0x0711 -> B:406:0x0715). Please report as a decompilation issue!!! */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) throws Throwable {
        switch (this.f203x) {
            case 10:
                h hVar = (h) o((t) obj, (pq.c) obj2);
                b0 b0Var = b0.f15562a;
                hVar.q(b0Var);
                break;
        }
        return ((h) o((t) obj, (pq.c) obj2)).q(b0.f15562a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(n nVar, d4.c cVar, pq.c cVar2) {
        super(2, cVar2);
        this.f203x = 6;
        this.B = (rq.j) nVar;
        this.D = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, pq.c cVar, int i10) {
        super(2, cVar);
        this.f203x = i10;
        this.B = obj;
        this.D = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, pq.c cVar, int i10) {
        super(2, cVar);
        this.f203x = i10;
        this.D = obj;
    }
}
