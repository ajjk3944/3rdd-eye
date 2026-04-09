package au;

import android.net.Uri;
import android.view.InputEvent;
import d4.c0;
import h9.r2;
import java.io.File;
import java.util.LinkedHashSet;
import lq.b0;
import n0.n1;
import n0.u0;
import n0.x0;
import wt.e0;

/* loaded from: classes.dex */
public final class e extends rq.j implements ar.n {
    public Object B;
    public Object D;
    public final /* synthetic */ Object E;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2322x;

    /* renamed from: y, reason: collision with root package name */
    public int f2323y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(c0 c0Var, ar.n nVar, pq.c cVar) {
        super(2, cVar);
        this.f2322x = 3;
        this.D = c0Var;
        this.E = (rq.j) nVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ar.a, br.k] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ar.n, rq.j] */
    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f2322x) {
            case 0:
                e eVar = new e((zt.g) this.D, (f) this.E, cVar, 0);
                eVar.B = obj;
                return eVar;
            case 1:
                return new e((r2) this.B, (LinkedHashSet) this.D, (ar.a) this.E, cVar);
            case 2:
                e eVar2 = new e((c0) this.E, cVar, 2);
                eVar2.B = obj;
                return eVar2;
            case 3:
                e eVar3 = new e((c0) this.D, (ar.n) this.E, cVar);
                eVar3.B = obj;
                return eVar3;
            case 4:
                e eVar4 = new e((File) this.E, cVar, 4);
                eVar4.B = obj;
                return eVar4;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new e((d7.a) this.B, (Uri) this.D, (InputEvent) this.E, cVar, 5);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                e eVar5 = new e((b9.e) this.E, cVar, 6);
                eVar5.B = obj;
                return eVar5;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                e eVar6 = new e((n1) this.D, (u0) this.E, cVar, 7);
                eVar6.B = obj;
                return eVar6;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                e eVar7 = new e((ar.n) this.D, (x0) this.E, cVar, 8);
                eVar7.B = obj;
                return eVar7;
            case 9:
                e eVar8 = new e((pq.h) this.D, (zt.f) this.E, cVar, 9);
                eVar8.B = obj;
                return eVar8;
            case 10:
                return new e((uf.b) this.B, (h4.e) this.D, (Long) this.E, cVar, 10);
            case 11:
                return new e((a0.i) this.B, (a0.k) this.D, (y.h) this.E, cVar, 11);
            case 12:
                return new e((a0.i) this.B, (a0.h) this.D, (e0) this.E, cVar, 12);
            default:
                return new e((yt.c) this.E, cVar, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[Catch: all -> 0x001e, TryCatch #3 {all -> 0x001e, blocks: (B:8:0x001a, B:19:0x0043, B:21:0x004b, B:22:0x0058, B:29:0x0068, B:16:0x0036, B:31:0x006b, B:33:0x0070, B:34:0x0071, B:15:0x0030, B:23:0x0059, B:25:0x005f), top: B:282:0x000e, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Type inference failed for: r2v5, types: [ar.a, br.k] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v11, types: [yt.q] */
    /* JADX WARN: Type inference failed for: r3v13, types: [yt.c] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [yt.q] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r8v15, types: [ar.n, rq.j] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x0235 -> B:136:0x0238). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0040 -> B:19:0x0043). Please report as a decompilation issue!!! */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.e.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f2322x) {
        }
        return ((e) o((wt.t) obj, (pq.c) obj2)).q(b0.f15562a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(r2 r2Var, LinkedHashSet linkedHashSet, ar.a aVar, pq.c cVar) {
        super(2, cVar);
        this.f2322x = 1;
        this.B = r2Var;
        this.D = linkedHashSet;
        this.E = (br.k) aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3, pq.c cVar, int i10) {
        super(2, cVar);
        this.f2322x = i10;
        this.B = obj;
        this.D = obj2;
        this.E = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, pq.c cVar, int i10) {
        super(2, cVar);
        this.f2322x = i10;
        this.D = obj;
        this.E = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, pq.c cVar, int i10) {
        super(2, cVar);
        this.f2322x = i10;
        this.E = obj;
    }
}
