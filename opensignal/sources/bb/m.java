package bb;

import androidx.media3.common.j0;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.trackselection.v;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pb.o0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2540a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2541b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2542c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2543d;

    /* renamed from: e, reason: collision with root package name */
    public int f2544e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2545f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2546g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2547h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2548i;
    public final Object j;
    public final Object[] k;

    /* renamed from: l, reason: collision with root package name */
    public Object f2549l;

    /* renamed from: m, reason: collision with root package name */
    public Object f2550m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f2551n;

    /* JADX WARN: Type inference failed for: r0v0, types: [bb.m, java.lang.Object] */
    public m(o0 o0Var, cb.c cVar, a aVar, int i10, int[] iArr, ob.f fVar, int i11, pb.n nVar, long j, boolean z10, ArrayList arrayList, q qVar) {
        ca.k iVar;
        ?? obj = new Object();
        obj.f2546g = o0Var;
        obj.f2550m = cVar;
        obj.f2547h = aVar;
        obj.f2541b = iArr;
        obj.f2549l = fVar;
        obj.f2542c = i11;
        obj.f2548i = nVar;
        obj.f2544e = i10;
        obj.f2543d = j;
        obj.j = qVar;
        long jE = cVar.e(i10);
        ArrayList arrayListA = obj.a();
        int[] iArr2 = ((ob.c) fVar).f19230c;
        obj.k = new k[iArr2.length];
        int i12 = 0;
        int i13 = 0;
        m mVar = obj;
        while (i13 < ((k[]) mVar.k).length) {
            Representation representation = (Representation) arrayListA.get(iArr2[i13]);
            cb.b bVarC = aVar.c(representation.baseUrls);
            k[] kVarArr = (k[]) mVar.k;
            int i14 = i13;
            bVarC = bVarC == null ? (cb.b) representation.baseUrls.get(i12) : bVarC;
            Format format = representation.format;
            String str = format.G;
            ab.e eVar = null;
            if (qb.m.i(str)) {
                if ("application/x-rawcc".equals(str)) {
                    iVar = new la.a(format);
                } else {
                    kVarArr[i14] = new k(jE, representation, bVarC, eVar, 0L, representation.getIndex(), 0);
                    i13 = i14 + 1;
                    mVar = this;
                    i12 = 0;
                }
            } else if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                iVar = new ha.e(1);
            } else {
                iVar = new ja.i(z10 ? 4 : 0, null, arrayList, qVar);
            }
            eVar = new ab.e(iVar, i11, format);
            kVarArr[i14] = new k(jE, representation, bVarC, eVar, 0L, representation.getIndex(), 0);
            i13 = i14 + 1;
            mVar = this;
            i12 = 0;
        }
    }

    public final ArrayList a() {
        switch (this.f2540a) {
            case 0:
                List list = ((cb.c) this.f2550m).c(this.f2544e).f3561c;
                ArrayList arrayList = new ArrayList();
                for (int i10 : this.f2541b) {
                    arrayList.addAll(((cb.a) list.get(i10)).f3526c);
                }
                return arrayList;
            default:
                List list2 = ((h5.c) this.f2550m).b(this.f2544e).f9934c;
                ArrayList arrayList2 = new ArrayList();
                for (int i11 : this.f2541b) {
                    arrayList2.addAll(((h5.a) list2.get(i11)).f9900c);
                }
                return arrayList2;
        }
    }

    public k b(int i10) {
        k[] kVarArr = (k[]) this.k;
        k kVar = kVarArr[i10];
        h5.b bVarC = ((g5.a) this.f2547h).c(((h5.l) kVar.f2536e).f9948d);
        if (bVarC == null || bVarC.equals((h5.b) kVar.f2537f)) {
            return kVar;
        }
        k kVar2 = new k(kVar.f2533b, (h5.l) kVar.f2536e, bVarC, (p5.f) kVar.f2535d, kVar.f2534c, (DashSegmentIndex) kVar.f2538g, 1);
        kVarArr[i10] = kVar2;
        return kVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bb.m, java.lang.Object] */
    public m(r5.o oVar, h5.c cVar, g5.a aVar, int i10, int[] iArr, v vVar, int i11, b5.h hVar, long j, boolean z10, ArrayList arrayList, g5.n nVar) {
        u5.k hVar2;
        ?? obj = new Object();
        obj.f2546g = oVar;
        obj.f2550m = cVar;
        obj.f2547h = aVar;
        obj.f2541b = iArr;
        obj.f2549l = vVar;
        obj.f2542c = i11;
        obj.f2548i = hVar;
        obj.f2544e = i10;
        obj.f2543d = j;
        obj.j = nVar;
        long jD = cVar.d(i10);
        ArrayList arrayListA = obj.a();
        obj.k = new k[vVar.length()];
        int i12 = 0;
        int i13 = 0;
        m mVar = obj;
        while (i13 < ((k[]) mVar.k).length) {
            h5.l lVar = (h5.l) arrayListA.get(vVar.getIndexInTrackGroup(i13));
            h5.b bVarC = aVar.c(lVar.f9948d);
            k[] kVarArr = (k[]) mVar.k;
            int i14 = i13;
            bVarC = bVarC == null ? (h5.b) lVar.f9948d.get(i12) : bVarC;
            androidx.media3.common.r rVar = lVar.f9947a;
            String str = rVar.G;
            p5.d dVar = null;
            if (!j0.i(str)) {
                if (str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
                    hVar2 = new l6.h(z10 ? 4 : 0, null, arrayList, nVar);
                } else {
                    hVar2 = new j6.c(1);
                }
                dVar = new p5.d(hVar2, i11, rVar);
            }
            kVarArr[i14] = new k(jD, lVar, bVarC, dVar, 0L, lVar.b(), 1);
            i13 = i14 + 1;
            mVar = this;
            i12 = 0;
        }
    }
}
