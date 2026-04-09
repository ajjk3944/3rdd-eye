package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n1;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.y0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import lf.t1;
import p.l2;
import pb.f0;
import pb.n0;
import pb.u0;
import ya.a0;
import ya.t0;

/* loaded from: classes.dex */
public final class o implements ya.t, db.s, t0 {
    public final f0 B;
    public final a0 D;
    public final pb.b E;
    public final IdentityHashMap F;
    public final w G;
    public final ya.h H;
    public final boolean I;
    public final int J;
    public final boolean K;
    public ya.s L;
    public int M;
    public TrackGroupArray N;
    public u[] O;
    public u[] P;
    public int Q;
    public l2 R;

    /* renamed from: a, reason: collision with root package name */
    public final k f4498a;

    /* renamed from: d, reason: collision with root package name */
    public final db.u f4499d;

    /* renamed from: g, reason: collision with root package name */
    public final j f4500g;

    /* renamed from: r, reason: collision with root package name */
    public final u0 f4501r;

    /* renamed from: x, reason: collision with root package name */
    public final ba.h f4502x;

    /* renamed from: y, reason: collision with root package name */
    public final ba.d f4503y;

    public o(k kVar, db.u uVar, j jVar, u0 u0Var, ba.h hVar, ba.d dVar, f0 f0Var, a0 a0Var, pb.b bVar, ya.h hVar2, boolean z10, int i10, boolean z11) {
        this.f4498a = kVar;
        this.f4499d = uVar;
        this.f4500g = jVar;
        this.f4501r = u0Var;
        this.f4502x = hVar;
        this.f4503y = dVar;
        this.B = f0Var;
        this.D = a0Var;
        this.E = bVar;
        this.H = hVar2;
        this.I = z10;
        this.J = i10;
        this.K = z11;
        ((sm.m) hVar2).getClass();
        this.R = new l2(27, new ya.u0[0]);
        this.F = new IdentityHashMap();
        this.G = new w();
        this.O = new u[0];
        this.P = new u[0];
    }

    public static Format n(Format format, Format format2, boolean z10) {
        String strP;
        Metadata metadata;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        if (format2 != null) {
            strP = format2.E;
            metadata = format2.F;
            i11 = format2.U;
            i10 = format2.f4025r;
            i12 = format2.f4026x;
            str = format2.f4024g;
            str2 = format2.f4023d;
        } else {
            strP = qb.v.p(1, format.E);
            metadata = format.F;
            if (z10) {
                i11 = format.U;
                i10 = format.f4025r;
                i12 = format.f4026x;
                str = format.f4024g;
                str2 = format.f4023d;
            } else {
                i10 = 0;
                str = null;
                i11 = -1;
                i12 = 0;
                str2 = null;
            }
        }
        String strC = qb.m.c(strP);
        int i13 = z10 ? format.f4027y : -1;
        int i14 = z10 ? format.B : -1;
        g0 g0Var = new g0();
        g0Var.f4142a = format.f4020a;
        g0Var.f4143b = str2;
        g0Var.j = format.G;
        g0Var.k = strC;
        g0Var.f4149h = strP;
        g0Var.f4150i = metadata;
        g0Var.f4147f = i13;
        g0Var.f4148g = i14;
        g0Var.f4163x = i11;
        g0Var.f4145d = i10;
        g0Var.f4146e = i12;
        g0Var.f4144c = str;
        return new Format(g0Var);
    }

    @Override // db.s
    public final void a() {
        for (u uVar : this.O) {
            n0 n0Var = uVar.E;
            ArrayList arrayList = uVar.I;
            if (!arrayList.isEmpty()) {
                m mVar = (m) oe.s.i(arrayList);
                int chunkPublicationState = uVar.f4525g.getChunkPublicationState(mVar);
                if (chunkPublicationState == 1) {
                    mVar.f4497g0 = true;
                } else if (chunkPublicationState == 2 && !uVar.f4534o0 && n0Var.d()) {
                    n0Var.b();
                }
            }
        }
        this.L.c(this);
    }

    @Override // ya.t0
    public final void c(ya.u0 u0Var) {
        this.L.c(this);
    }

    @Override // ya.u0
    public final long d() {
        return this.R.d();
    }

    @Override // ya.t
    public final void e() throws IOException {
        for (u uVar : this.O) {
            uVar.E.a();
            uVar.f4525g.maybeThrowError();
            if (uVar.f4534o0 && !uVar.Y) {
                throw y0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // ya.t
    public final long f(long j) {
        u[] uVarArr = this.P;
        if (uVarArr.length > 0) {
            boolean zE = uVarArr[0].E(j, false);
            int i10 = 1;
            while (true) {
                u[] uVarArr2 = this.P;
                if (i10 >= uVarArr2.length) {
                    break;
                }
                uVarArr2[i10].E(j, zE);
                i10++;
            }
            if (zE) {
                this.G.f4542a.clear();
            }
        }
        return j;
    }

    @Override // ya.t
    public final void g(long j) throws Throwable {
        for (u uVar : this.P) {
            if (uVar.X && !uVar.A()) {
                int length = uVar.Q.length;
                for (int i10 = 0; i10 < length; i10++) {
                    uVar.Q[i10].g(j, uVar.f4528i0[i10]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    @Override // db.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(android.net.Uri r13, pb.e0 r14, boolean r15) {
        /*
            r12 = this;
            com.google.android.exoplayer2.source.hls.u[] r0 = r12.O
            int r1 = r0.length
            r2 = 1
            r3 = 0
            r5 = r2
            r4 = r3
        L7:
            if (r4 >= r1) goto L47
            r6 = r0[r4]
            com.google.android.exoplayer2.source.hls.HlsChunkSource r7 = r6.f4525g
            boolean r8 = r7.obtainsChunksForPlaylist(r13)
            if (r8 != 0) goto L15
        L13:
            r6 = r2
            goto L43
        L15:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r15 != 0) goto L36
            pb.f0 r6 = r6.D
            ob.f r10 = r7.getTrackSelection()
            pb.d0 r10 = com.google.android.exoplayer2.trackselection.g.a(r10)
            sm.m r6 = (sm.m) r6
            h9.t r6 = r6.o(r10, r14)
            if (r6 == 0) goto L36
            int r10 = r6.f10477a
            r11 = 2
            if (r10 != r11) goto L36
            long r10 = r6.f10478b
            goto L37
        L36:
            r10 = r8
        L37:
            boolean r6 = r7.onPlaylistError(r13, r10)
            if (r6 == 0) goto L42
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 == 0) goto L42
            goto L13
        L42:
            r6 = r3
        L43:
            r5 = r5 & r6
            int r4 = r4 + 1
            goto L7
        L47:
            ya.s r13 = r12.L
            r13.c(r12)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.o.h(android.net.Uri, pb.e0, boolean):boolean");
    }

    @Override // ya.u0
    public final boolean i(long j) {
        if (this.N != null) {
            return this.R.i(j);
        }
        for (u uVar : this.O) {
            if (!uVar.Y) {
                uVar.i(uVar.f4530k0);
            }
        }
        return false;
    }

    @Override // ya.u0
    public final boolean isLoading() {
        return this.R.isLoading();
    }

    public final u j(int i10, Uri[] uriArr, Format[] formatArr, Format format, List list, Map map, long j) {
        return new u(i10, this, new HlsChunkSource(this.f4498a, this.f4499d, uriArr, formatArr, this.f4500g, this.f4501r, this.G, list), map, this.E, j, format, this.f4502x, this.f4503y, this.B, this.D, this.J);
    }

    @Override // ya.t
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // ya.t
    public final TrackGroupArray l() {
        TrackGroupArray trackGroupArray = this.N;
        trackGroupArray.getClass();
        return trackGroupArray;
    }

    @Override // ya.u0
    public final long m() {
        return this.R.m();
    }

    @Override // ya.u0
    public final void o(long j) {
        this.R.o(j);
    }

    @Override // ya.t
    public final long p(long j, n1 n1Var) {
        return j;
    }

    public final void q() {
        int i10 = this.M - 1;
        this.M = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (u uVar : this.O) {
            uVar.b();
            i11 += uVar.f4522d0.f4457a;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i11];
        int i12 = 0;
        for (u uVar2 : this.O) {
            uVar2.b();
            int i13 = uVar2.f4522d0.f4457a;
            int i14 = 0;
            while (i14 < i13) {
                uVar2.b();
                trackGroupArr[i12] = uVar2.f4522d0.f4458d[i14];
                i14++;
                i12++;
            }
        }
        this.N = new TrackGroupArray(trackGroupArr);
        this.L.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0280  */
    @Override // ya.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long s(ob.f[] r39, boolean[] r40, ya.s0[] r41, boolean[] r42, long r43) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.o.s(ob.f[], boolean[], ya.s0[], boolean[], long):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.HashMap] */
    @Override // ya.t
    public final void u(ya.s sVar, long j) {
        ?? map;
        List list;
        boolean z10;
        int i10;
        Format format;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        Format[] formatArr;
        this.L = sVar;
        db.c cVar = (db.c) this.f4499d;
        cVar.getClass();
        cVar.f7209x.add(this);
        db.f fVar = cVar.F;
        fVar.getClass();
        List list2 = fVar.f7223f;
        List list3 = fVar.f7222e;
        if (this.K) {
            List list4 = fVar.k;
            ArrayList arrayList = new ArrayList(list4);
            map = new HashMap();
            int i14 = 0;
            while (i14 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) list4.get(i14);
                String str = drmInitData.f4097g;
                i14++;
                int i15 = i14;
                while (i15 < arrayList.size()) {
                    DrmInitData drmInitData2 = (DrmInitData) arrayList.get(i15);
                    String str2 = drmInitData2.f4097g;
                    if (TextUtils.equals(str2, str)) {
                        String str3 = drmInitData.f4097g;
                        qb.b.j(str3 == null || str2 == null || TextUtils.equals(str3, str2));
                        if (str3 != null) {
                            str2 = str3;
                        }
                        DrmInitData.SchemeData[] schemeDataArr = drmInitData.f4095a;
                        DrmInitData.SchemeData[] schemeDataArr2 = drmInitData2.f4095a;
                        int i16 = qb.v.f20828a;
                        Object[] objArrCopyOf = Arrays.copyOf(schemeDataArr, schemeDataArr.length + schemeDataArr2.length);
                        System.arraycopy(schemeDataArr2, 0, objArrCopyOf, schemeDataArr.length, schemeDataArr2.length);
                        drmInitData = new DrmInitData(str2, true, (DrmInitData.SchemeData[]) objArrCopyOf);
                        arrayList.remove(i15);
                    } else {
                        i15++;
                    }
                }
                map.put(str, drmInitData);
            }
        } else {
            map = Collections.EMPTY_MAP;
        }
        Map map2 = map;
        boolean zIsEmpty = list3.isEmpty();
        List list5 = fVar.f7224g;
        this.M = 0;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z13 = this.I;
        if (zIsEmpty) {
            list = list5;
            z10 = z13;
        } else {
            Format format2 = fVar.f7225h;
            int size = list3.size();
            int[] iArr = new int[size];
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                z10 = z13;
                if (i17 >= list3.size()) {
                    break;
                }
                Format format3 = ((db.e) list3.get(i17)).f7215b;
                int i20 = format3.N;
                String str4 = format3.E;
                if (i20 > 0 || qb.v.p(2, str4) != null) {
                    iArr[i17] = 2;
                    i18++;
                } else if (qb.v.p(1, str4) != null) {
                    iArr[i17] = 1;
                    i19++;
                } else {
                    iArr[i17] = -1;
                }
                i17++;
                z13 = z10;
            }
            if (i18 > 0) {
                i11 = i18;
                z12 = false;
                z11 = true;
                format = format2;
            } else if (i19 < size) {
                format = format2;
                i11 = size - i19;
                z11 = false;
                z12 = true;
            } else {
                format = format2;
                i11 = size;
                z11 = false;
                z12 = false;
            }
            Uri[] uriArr = new Uri[i11];
            boolean z14 = z11;
            Format[] formatArr2 = new Format[i11];
            int[] iArr2 = new int[i11];
            int i21 = 0;
            int i22 = 0;
            while (i21 < list3.size()) {
                if (z14) {
                    formatArr = formatArr2;
                    if (iArr[i21] == 2) {
                    }
                    i21++;
                    formatArr2 = formatArr;
                } else {
                    formatArr = formatArr2;
                }
                if (!z12 || iArr[i21] != 1) {
                    db.e eVar = (db.e) list3.get(i21);
                    uriArr[i22] = eVar.f7214a;
                    formatArr[i22] = eVar.f7215b;
                    iArr2[i22] = i21;
                    i22++;
                }
                i21++;
                formatArr2 = formatArr;
            }
            Format[] formatArr3 = formatArr2;
            String str5 = formatArr3[0].E;
            int iO = qb.v.o(2, str5);
            int iO2 = qb.v.o(1, str5);
            boolean z15 = iO2 <= 1 && iO <= 1 && iO2 + iO > 0;
            if (z14 || iO2 <= 0) {
                i12 = iO;
                i13 = 0;
            } else {
                i12 = iO;
                i13 = 1;
            }
            int i23 = i12;
            list = list5;
            Format[] formatArr4 = formatArr3;
            Format format4 = format;
            u uVarJ = j(i13, uriArr, formatArr4, fVar.f7225h, fVar.f7226i, map2, j);
            arrayList2.add(uVarJ);
            arrayList3.add(iArr2);
            if (z10 && z15) {
                ArrayList arrayList4 = new ArrayList();
                if (i23 > 0) {
                    Format[] formatArr5 = new Format[i11];
                    int i24 = 0;
                    while (i24 < i11) {
                        Format format5 = formatArr4[i24];
                        String strP = qb.v.p(2, format5.E);
                        String strC = qb.m.c(strP);
                        g0 g0Var = new g0();
                        g0Var.f4142a = format5.f4020a;
                        g0Var.f4143b = format5.f4023d;
                        g0Var.j = format5.G;
                        g0Var.k = strC;
                        g0Var.f4149h = strP;
                        g0Var.f4150i = format5.F;
                        g0Var.f4147f = format5.f4027y;
                        g0Var.f4148g = format5.B;
                        g0Var.f4155p = format5.M;
                        g0Var.f4156q = format5.N;
                        g0Var.f4157r = format5.O;
                        g0Var.f4145d = format5.f4025r;
                        g0Var.f4146e = format5.f4026x;
                        formatArr5[i24] = new Format(g0Var);
                        i24++;
                        formatArr4 = formatArr4;
                    }
                    Format[] formatArr6 = formatArr4;
                    arrayList4.add(new TrackGroup(formatArr5));
                    if (iO2 > 0 && (format4 != null || list2.isEmpty())) {
                        arrayList4.add(new TrackGroup(n(formatArr6[0], format4, false)));
                    }
                    List list6 = fVar.f7226i;
                    if (list6 != null) {
                        for (int i25 = 0; i25 < list6.size(); i25++) {
                            arrayList4.add(new TrackGroup((Format) list6.get(i25)));
                        }
                    }
                } else {
                    Format[] formatArr7 = new Format[i11];
                    for (int i26 = 0; i26 < i11; i26++) {
                        formatArr7[i26] = n(formatArr4[i26], format4, true);
                    }
                    arrayList4.add(new TrackGroup(formatArr7));
                }
                g0 g0Var2 = new g0();
                g0Var2.f4142a = "ID3";
                g0Var2.k = "application/id3";
                TrackGroup trackGroup = new TrackGroup(new Format(g0Var2));
                arrayList4.add(trackGroup);
                uVarJ.C((TrackGroup[]) arrayList4.toArray(new TrackGroup[0]), arrayList4.indexOf(trackGroup));
            }
        }
        ArrayList arrayList5 = new ArrayList(list2.size());
        ArrayList arrayList6 = new ArrayList(list2.size());
        ArrayList arrayList7 = new ArrayList(list2.size());
        HashSet hashSet = new HashSet();
        int i27 = 0;
        while (i27 < list2.size()) {
            String str6 = ((db.d) list2.get(i27)).f7213c;
            if (hashSet.add(str6)) {
                arrayList5.clear();
                arrayList6.clear();
                arrayList7.clear();
                boolean z16 = true;
                for (int i28 = 0; i28 < list2.size(); i28++) {
                    String str7 = ((db.d) list2.get(i28)).f7213c;
                    int i29 = qb.v.f20828a;
                    if (str6.equals(str7)) {
                        db.d dVar = (db.d) list2.get(i28);
                        arrayList7.add(Integer.valueOf(i28));
                        Uri uri = dVar.f7211a;
                        Format format6 = dVar.f7212b;
                        arrayList5.add(uri);
                        arrayList6.add(format6);
                        z16 &= qb.v.o(1, format6.E) == 1;
                    }
                }
                int i30 = qb.v.f20828a;
                i10 = i27;
                u uVarJ2 = j(1, (Uri[]) arrayList5.toArray(new Uri[0]), (Format[]) arrayList6.toArray(new Format[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList3.add(t1.H(arrayList7));
                arrayList2.add(uVarJ2);
                if (z10 && z16) {
                    uVarJ2.C(new TrackGroup[]{new TrackGroup((Format[]) arrayList6.toArray(new Format[0]))}, new int[0]);
                }
            } else {
                i10 = i27;
            }
            i27 = i10 + 1;
        }
        this.Q = arrayList2.size();
        for (int i31 = 0; i31 < list.size(); i31++) {
            db.d dVar2 = (db.d) list.get(i31);
            Uri uri2 = dVar2.f7211a;
            Format format7 = dVar2.f7212b;
            u uVarJ3 = j(3, new Uri[]{uri2}, new Format[]{format7}, null, Collections.EMPTY_LIST, map2, j);
            arrayList3.add(new int[]{i31});
            arrayList2.add(uVarJ3);
            uVarJ3.C(new TrackGroup[]{new TrackGroup(format7)}, new int[0]);
        }
        this.O = (u[]) arrayList2.toArray(new u[0]);
        u[] uVarArr = this.O;
        this.M = uVarArr.length;
        uVarArr[0].f4525g.setIsTimestampMaster(true);
        for (u uVar : this.O) {
            if (!uVar.Y) {
                uVar.i(uVar.f4530k0);
            }
        }
        this.P = this.O;
    }
}
