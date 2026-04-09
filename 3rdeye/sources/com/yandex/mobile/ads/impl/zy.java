package com.yandex.mobile.ads.impl;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.v42;
import com.yandex.mobile.ads.impl.yj0;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class zy implements xc {

    /* renamed from: a, reason: collision with root package name */
    private final dp f36774a;

    /* renamed from: b, reason: collision with root package name */
    private final v42.b f36775b;

    /* renamed from: c, reason: collision with root package name */
    private final v42.d f36776c;

    /* renamed from: d, reason: collision with root package name */
    private final a f36777d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<ed.a> f36778e;

    /* renamed from: f, reason: collision with root package name */
    private nr0<ed> f36779f;

    /* renamed from: g, reason: collision with root package name */
    private bi1 f36780g;

    /* renamed from: h, reason: collision with root package name */
    private bf0 f36781h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final v42.b f36782a;

        /* renamed from: b, reason: collision with root package name */
        private xj0<jw0.b> f36783b = xj0.h();

        /* renamed from: c, reason: collision with root package name */
        private yj0<jw0.b, v42> f36784c = yj0.g();

        /* renamed from: d, reason: collision with root package name */
        private jw0.b f36785d;

        /* renamed from: e, reason: collision with root package name */
        private jw0.b f36786e;

        /* renamed from: f, reason: collision with root package name */
        private jw0.b f36787f;

        public a(v42.b bVar) {
            this.f36782a = bVar;
        }

        private void a(yj0.a<jw0.b, v42> aVar, jw0.b bVar, v42 v42Var) {
            if (bVar == null) {
                return;
            }
            if (v42Var.a(bVar.f27470a) != -1) {
                aVar.a((yj0.a<jw0.b, v42>) bVar, (jw0.b) v42Var);
                return;
            }
            v42 v42Var2 = this.f36784c.get(bVar);
            if (v42Var2 != null) {
                aVar.a((yj0.a<jw0.b, v42>) bVar, (jw0.b) v42Var2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static jw0.b a(bi1 bi1Var, xj0<jw0.b> xj0Var, jw0.b bVar, v42.b bVar2) {
            v42 currentTimeline = bi1Var.getCurrentTimeline();
            int currentPeriodIndex = bi1Var.getCurrentPeriodIndex();
            Object objA = currentTimeline.c() ? null : currentTimeline.a(currentPeriodIndex);
            int iA = (bi1Var.isPlayingAd() || currentTimeline.c()) ? -1 : currentTimeline.a(currentPeriodIndex, bVar2).a(s82.a(bi1Var.getCurrentPosition()) - bVar2.c());
            for (int i = 0; i < xj0Var.size(); i++) {
                jw0.b bVar3 = xj0Var.get(i);
                if (a(bVar3, objA, bi1Var.isPlayingAd(), bi1Var.getCurrentAdGroupIndex(), bi1Var.getCurrentAdIndexInAdGroup(), iA)) {
                    return bVar3;
                }
            }
            if (xj0Var.isEmpty() && bVar != null && a(bVar, objA, bi1Var.isPlayingAd(), bi1Var.getCurrentAdGroupIndex(), bi1Var.getCurrentAdIndexInAdGroup(), iA)) {
                return bVar;
            }
            return null;
        }

        private static boolean a(jw0.b bVar, Object obj, boolean z10, int i, int i10, int i11) {
            if (!bVar.f27470a.equals(obj)) {
                return false;
            }
            if (z10 && bVar.f27471b == i && bVar.f27472c == i10) {
                return true;
            }
            return !z10 && bVar.f27471b == -1 && bVar.f27474e == i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(v42 v42Var) {
            yj0.a<jw0.b, v42> aVarA = yj0.a();
            if (this.f36783b.isEmpty()) {
                a(aVarA, this.f36786e, v42Var);
                if (!pd1.a(this.f36787f, this.f36786e)) {
                    a(aVarA, this.f36787f, v42Var);
                }
                if (!pd1.a(this.f36785d, this.f36786e) && !pd1.a(this.f36785d, this.f36787f)) {
                    a(aVarA, this.f36785d, v42Var);
                }
            } else {
                for (int i = 0; i < this.f36783b.size(); i++) {
                    a(aVarA, this.f36783b.get(i), v42Var);
                }
                if (!this.f36783b.contains(this.f36785d)) {
                    a(aVarA, this.f36785d, v42Var);
                }
            }
            this.f36784c = aVarA.a();
        }
    }

    public zy(dp dpVar) {
        this.f36774a = (dp) zf.a(dpVar);
        this.f36779f = new nr0<>(s82.c(), dpVar, new J0(12));
        v42.b bVar = new v42.b();
        this.f36775b = bVar;
        this.f36776c = new v42.d();
        this.f36777d = new a(bVar);
        this.f36778e = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ed edVar, vb0 vb0Var) {
    }

    private ed.a b() {
        return a(this.f36777d.f36787f);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void onCues(List<av> list) {
        ed.a aVarA = a();
        a(aVarA, 27, new C.e0(15, aVarA, list));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void onIsLoadingChanged(final boolean z10) {
        final ed.a aVarA = a();
        a(aVarA, 3, new nr0.a() { // from class: com.yandex.mobile.ads.impl.M5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarA;
                boolean z11 = z10;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void onIsPlayingChanged(boolean z10) {
        ed.a aVarA = a();
        a(aVarA, 7, new O5(aVarA, z10));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void onPlayWhenReadyChanged(final boolean z10, final int i) {
        final ed.a aVarA = a();
        a(aVarA, 5, new nr0.a() { // from class: com.yandex.mobile.ads.impl.P5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarA;
                boolean z11 = z10;
                int i10 = i;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void onPlaybackStateChanged(int i) {
        ed.a aVarA = a();
        a(aVarA, 4, new U5(aVarA, i));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final ed.a aVarA = a();
        a(aVarA, 6, new nr0.a() { // from class: com.yandex.mobile.ads.impl.X4
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarA;
                int i10 = i;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void onPlayerStateChanged(final boolean z10, final int i) {
        final ed.a aVarA = a();
        a(aVarA, -1, new nr0.a() { // from class: com.yandex.mobile.ads.impl.V5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarA;
                boolean z11 = z10;
                int i10 = i;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final ed.a aVarB = b();
        a(aVarB, 23, new nr0.a() { // from class: com.yandex.mobile.ads.impl.W4
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarB;
                boolean z11 = z10;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void onSurfaceSizeChanged(final int i, final int i10) {
        final ed.a aVarB = b();
        a(aVarB, 24, new nr0.a() { // from class: com.yandex.mobile.ads.impl.V4
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarB;
                int i11 = i;
                int i12 = i10;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void onVolumeChanged(final float f10) {
        final ed.a aVarB = b();
        a(aVarB, 22, new nr0.a() { // from class: com.yandex.mobile.ads.impl.H5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarB;
                float f11 = f10;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void release() {
        bf0 bf0Var = this.f36781h;
        if (bf0Var == null) {
            throw new IllegalStateException();
        }
        bf0Var.a(new J2(this, 14));
    }

    private ed.a e(int i, jw0.b bVar) {
        this.f36780g.getClass();
        if (bVar != null) {
            return ((v42) this.f36777d.f36784c.get(bVar)) != null ? a(bVar) : a(v42.f34342b, i, bVar);
        }
        v42 currentTimeline = this.f36780g.getCurrentTimeline();
        if (i >= currentTimeline.b()) {
            currentTimeline = v42.f34342b;
        }
        return a(currentTimeline, i, (jw0.b) null);
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void a(bw0 bw0Var) {
        this.f36779f.a((nr0<ed>) bw0Var);
    }

    public final ed.a a() {
        return a(this.f36777d.f36785d);
    }

    @Override // com.yandex.mobile.ads.impl.c40
    public final void d(int i, jw0.b bVar) {
        ed.a aVarE = e(i, bVar);
        a(aVarE, 1026, new I5(aVarE, 0));
    }

    private ed.a a(jw0.b bVar) {
        this.f36780g.getClass();
        v42 v42Var = bVar == null ? null : (v42) this.f36777d.f36784c.get(bVar);
        if (bVar != null && v42Var != null) {
            return a(v42Var, v42Var.a(bVar.f27470a, this.f36775b).f34345d, bVar);
        }
        int currentMediaItemIndex = this.f36780g.getCurrentMediaItemIndex();
        v42 currentTimeline = this.f36780g.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.b()) {
            currentTimeline = v42.f34342b;
        }
        return a(currentTimeline, currentMediaItemIndex, (jw0.b) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(ed.a aVar, int i, long j4, long j10, ed edVar) {
        ((bw0) edVar).a(aVar, i, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(ed.a aVar, ky kyVar, ed edVar) {
        ((bw0) edVar).a(kyVar);
    }

    @Override // com.yandex.mobile.ads.impl.c40
    public final void c(int i, jw0.b bVar) {
        ed.a aVarE = e(i, bVar);
        a(aVarE, 1023, new W5(aVarE, 0));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void d(ky kyVar) {
        ed.a aVarB = b();
        a(aVarB, 1015, new Z4(aVarB, kyVar, 0));
    }

    @Override // com.yandex.mobile.ads.impl.kw0
    public final void c(int i, jw0.b bVar, final rr0 rr0Var, final zv0 zv0Var) {
        final ed.a aVarE = e(i, bVar);
        a(aVarE, 1000, new nr0.a() { // from class: com.yandex.mobile.ads.impl.T5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarE;
                rr0 rr0Var2 = rr0Var;
                zv0 zv0Var2 = zv0Var;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void c(Exception exc) {
        ed.a aVarB = b();
        a(aVarB, 1030, new A5(aVarB, exc, 0));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void c(ky kyVar) {
        ed.a aVarA = a(this.f36777d.f36786e);
        a(aVarA, 1020, new Z4(aVarA, kyVar, 2));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void b(Exception exc) {
        ed.a aVarB = b();
        a(aVarB, 1029, new K5(aVarB, exc, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ed.a aVarA = a();
        a(aVarA, 1028, new U1(aVarA, 7));
        this.f36779f.b();
    }

    public final ed.a a(v42 v42Var, int i, jw0.b bVar) {
        jw0.b bVar2 = v42Var.c() ? null : bVar;
        long jB = this.f36774a.b();
        boolean z10 = v42Var.equals(this.f36780g.getCurrentTimeline()) && i == this.f36780g.getCurrentMediaItemIndex();
        long jB2 = 0;
        if (bVar2 == null || !bVar2.a()) {
            if (z10) {
                jB2 = this.f36780g.getContentPosition();
            } else if (!v42Var.c()) {
                jB2 = s82.b(v42Var.a(i, this.f36776c, 0L).f34369n);
            }
        } else if (z10 && this.f36780g.getCurrentAdGroupIndex() == bVar2.f27471b && this.f36780g.getCurrentAdIndexInAdGroup() == bVar2.f27472c) {
            jB2 = this.f36780g.getCurrentPosition();
        }
        return new ed.a(jB, v42Var, i, bVar2, jB2, this.f36780g.getCurrentTimeline(), this.f36780g.getCurrentMediaItemIndex(), this.f36777d.f36785d, this.f36780g.getCurrentPosition(), this.f36780g.getTotalBufferedDuration());
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void b(final String str, final long j4, final long j10) {
        final ed.a aVarB = b();
        a(aVarB, 1008, new nr0.a() { // from class: com.yandex.mobile.ads.impl.U4
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                String str2 = str;
                long j11 = j10;
                ed.a aVar = aVarB;
                long j12 = j4;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void b(String str) {
        ed.a aVarB = b();
        a(aVarB, 1012, new C.f0(9, aVarB, str));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void b(ky kyVar) {
        ed.a aVarB = b();
        a(aVarB, 1007, new Z4(aVarB, kyVar, 1));
    }

    @Override // com.yandex.mobile.ads.impl.pi.a
    public final void b(final int i, final long j4, final long j10) {
        Object next;
        Object obj;
        jw0.b bVar;
        a aVar = this.f36777d;
        if (aVar.f36783b.isEmpty()) {
            bVar = null;
        } else {
            xj0 xj0Var = aVar.f36783b;
            if (xj0Var != null) {
                if (!xj0Var.isEmpty()) {
                    obj = xj0Var.get(xj0Var.size() - 1);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                Iterator<E> it = xj0Var.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            bVar = (jw0.b) obj;
        }
        final ed.a aVarA = a(bVar);
        a(aVarA, 1006, new nr0.a() { // from class: com.yandex.mobile.ads.impl.T4
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj2) {
                int i10 = i;
                long j11 = j4;
                zy.b(aVarA, i10, j11, j10, (ed) obj2);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void onRenderedFirstFrame() {
    }

    @Override // com.yandex.mobile.ads.impl.c40
    public final void b(int i, jw0.b bVar) {
        ed.a aVarE = e(i, bVar);
        a(aVarE, 1027, new I5(aVarE, 1));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void b(final int i, final long j4) {
        final ed.a aVarA = a(this.f36777d.f36786e);
        a(aVarA, 1018, new nr0.a() { // from class: com.yandex.mobile.ads.impl.R5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarA;
                int i10 = i;
                long j10 = j4;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.kw0
    public final void b(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var) {
        ed.a aVarE = e(i, bVar);
        a(aVarE, 1001, new Q5(aVarE, rr0Var, zv0Var, 0));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void b(h60 h60Var) {
        ed.a aVarA;
        fw0 fw0Var;
        if (h60Var != null && (fw0Var = h60Var.i) != null) {
            aVarA = a(new jw0.b(fw0Var));
        } else {
            aVarA = a();
        }
        a(aVarA, 10, new E5(aVarA, h60Var, 1));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void b(dc0 dc0Var, oy oyVar) {
        ed.a aVarB = b();
        a(aVarB, 1017, new com.applovin.impl.A0(aVarB, dc0Var, oyVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ed.a aVar, zv0 zv0Var, ed edVar) {
        ((bw0) edVar).a(aVar, zv0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ed.a aVar, rr0 rr0Var, zv0 zv0Var, IOException iOException, boolean z10, ed edVar) {
        ((bw0) edVar).a(zv0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ed.a aVar, sh1 sh1Var, ed edVar) {
        ((bw0) edVar).a(sh1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ed.a aVar, int i, bi1.c cVar, bi1.c cVar2, ed edVar) {
        edVar.getClass();
        ((bw0) edVar).a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ed.a aVar, pf2 pf2Var, ed edVar) {
        ((bw0) edVar).a(pf2Var);
        int i = pf2Var.f31730b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(bi1 bi1Var, ed edVar, vb0 vb0Var) {
        ((bw0) edVar).a(bi1Var, new ed.b(vb0Var, this.f36778e));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void a(ky kyVar) {
        ed.a aVarA = a(this.f36777d.f36786e);
        a(aVarA, 1013, new K1(3, aVarA, kyVar));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void a(dc0 dc0Var, oy oyVar) {
        ed.a aVarB = b();
        a(aVarB, 1009, new V7.a(aVarB, dc0Var, oyVar, 5));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void a(final long j4) {
        final ed.a aVarB = b();
        a(aVarB, 1010, new nr0.a() { // from class: com.yandex.mobile.ads.impl.N5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarB;
                long j10 = j4;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void a(Exception exc) {
        ed.a aVarB = b();
        a(aVarB, 1014, new A5(aVarB, exc, 1));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void a(final int i, final long j4, final long j10) {
        final ed.a aVarB = b();
        a(aVarB, 1011, new nr0.a() { // from class: com.yandex.mobile.ads.impl.S5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                int i10 = i;
                long j11 = j4;
                ed.a aVar = aVarB;
                long j12 = j10;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(bi1.a aVar) {
        ed.a aVarA = a();
        a(aVarA, 13, new K1(4, aVarA, aVar));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(cv cvVar) {
        ed.a aVarA = a();
        a(aVarA, 27, new C5(0, aVarA, cvVar));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(d10 d10Var) {
        ed.a aVarA = a();
        a(aVarA, 29, new C.f0(10, aVarA, d10Var));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(final boolean z10, final int i) {
        final ed.a aVarA = a();
        a(aVarA, 30, new nr0.a() { // from class: com.yandex.mobile.ads.impl.D5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarA;
                int i10 = i;
                boolean z11 = z10;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.kw0
    public final void a(int i, jw0.b bVar, zv0 zv0Var) {
        ed.a aVarE = e(i, bVar);
        a(aVarE, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new G5(aVarE, zv0Var, 1));
    }

    @Override // com.yandex.mobile.ads.impl.c40
    public final void a(int i, jw0.b bVar) {
        ed.a aVarE = e(i, bVar);
        a(aVarE, 1025, new W5(aVarE, 1));
    }

    @Override // com.yandex.mobile.ads.impl.c40
    public final void a(int i, jw0.b bVar, int i10) {
        ed.a aVarE = e(i, bVar);
        a(aVarE, 1022, new Y4(i10, 0, aVarE));
    }

    @Override // com.yandex.mobile.ads.impl.c40
    public final void a(int i, jw0.b bVar, Exception exc) {
        ed.a aVarE = e(i, bVar);
        a(aVarE, 1024, new K5(aVarE, exc, 0));
    }

    @Override // com.yandex.mobile.ads.impl.kw0
    public final void a(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var) {
        ed.a aVarE = e(i, bVar);
        a(aVarE, 1002, new Q5(aVarE, rr0Var, zv0Var, 1));
    }

    @Override // com.yandex.mobile.ads.impl.kw0
    public final void a(int i, jw0.b bVar, final rr0 rr0Var, final zv0 zv0Var, final IOException iOException, final boolean z10) {
        final ed.a aVarE = e(i, bVar);
        a(aVarE, 1003, new nr0.a() { // from class: com.yandex.mobile.ads.impl.J5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                zv0 zv0Var2 = zv0Var;
                IOException iOException2 = iOException;
                zy.a(aVarE, rr0Var, zv0Var2, iOException2, z10, (ed) obj);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(final xv0 xv0Var, final int i) {
        final ed.a aVarA = a();
        a(aVarA, 1, new nr0.a() { // from class: com.yandex.mobile.ads.impl.B5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarA;
                xv0 xv0Var2 = xv0Var;
                int i10 = i;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(aw0 aw0Var) {
        ed.a aVarA = a();
        a(aVarA, 14, new G5(aVarA, aw0Var, 2));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(yz0 yz0Var) {
        ed.a aVarA = a();
        a(aVarA, 28, new G5(aVarA, yz0Var, 0));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(vh1 vh1Var) {
        ed.a aVarA = a();
        a(aVarA, 12, new C5(1, aVarA, vh1Var));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(h60 h60Var) {
        ed.a aVarA;
        fw0 fw0Var;
        if (h60Var != null && (fw0Var = h60Var.i) != null) {
            aVarA = a(new jw0.b(fw0Var));
        } else {
            aVarA = a();
        }
        a(aVarA, 10, new E5(aVarA, h60Var, 0));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(final bi1.c cVar, final bi1.c cVar2, final int i) {
        a aVar = this.f36777d;
        bi1 bi1Var = this.f36780g;
        bi1Var.getClass();
        aVar.f36785d = a.a(bi1Var, aVar.f36783b, aVar.f36786e, aVar.f36782a);
        final ed.a aVarA = a();
        a(aVarA, 11, new nr0.a() { // from class: com.yandex.mobile.ads.impl.L5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                int i10 = i;
                bi1.c cVar3 = cVar;
                zy.a(aVarA, i10, cVar3, cVar2, (ed) obj);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void a(Object obj, long j4) {
        ed.a aVarB = b();
        a(aVarB, 26, new F3.j(aVarB, j4, obj));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(int i) {
        a aVar = this.f36777d;
        bi1 bi1Var = this.f36780g;
        bi1Var.getClass();
        aVar.f36785d = a.a(bi1Var, aVar.f36783b, aVar.f36786e, aVar.f36782a);
        aVar.a(bi1Var.getCurrentTimeline());
        ed.a aVarA = a();
        a(aVarA, 0, new Y4(i, 1, aVarA));
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(o62 o62Var) {
        ed.a aVarA = a();
        a(aVarA, 2, new C.e0(13, aVarA, o62Var));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void a(final String str, final long j4, final long j10) {
        final ed.a aVarB = b();
        a(aVarB, 1016, new nr0.a() { // from class: com.yandex.mobile.ads.impl.X5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                String str2 = str;
                long j11 = j10;
                ed.a aVar = aVarB;
                long j12 = j4;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void a(String str) {
        ed.a aVarB = b();
        a(aVarB, 1019, new C.e0(14, aVarB, str));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void a(final int i, final long j4) {
        final ed.a aVarA = a(this.f36777d.f36786e);
        a(aVarA, 1021, new nr0.a() { // from class: com.yandex.mobile.ads.impl.F5
            @Override // com.yandex.mobile.ads.impl.nr0.a
            public final void invoke(Object obj) {
                ed.a aVar = aVarA;
                long j10 = j4;
                int i10 = i;
                ((ed) obj).getClass();
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(pf2 pf2Var) {
        ed.a aVarB = b();
        a(aVarB, 25, new K1(2, aVarB, pf2Var));
    }

    public final void a(ed.a aVar, int i, nr0.a<ed> aVar2) {
        this.f36778e.put(i, aVar);
        nr0<ed> nr0Var = this.f36779f;
        nr0Var.a(i, aVar2);
        nr0Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void a(bi1 bi1Var, Looper looper) {
        if (this.f36780g != null && !this.f36777d.f36783b.isEmpty()) {
            throw new IllegalStateException();
        }
        this.f36780g = bi1Var;
        this.f36781h = this.f36774a.a(looper, null);
        this.f36779f = this.f36779f.a(looper, new C5(2, this, bi1Var));
    }

    @Override // com.yandex.mobile.ads.impl.xc
    public final void a(List<jw0.b> list, jw0.b bVar) {
        a aVar = this.f36777d;
        bi1 bi1Var = this.f36780g;
        bi1Var.getClass();
        aVar.getClass();
        aVar.f36783b = xj0.a((Collection) list);
        if (!list.isEmpty()) {
            aVar.f36786e = list.get(0);
            bVar.getClass();
            aVar.f36787f = bVar;
        }
        if (aVar.f36785d == null) {
            aVar.f36785d = a.a(bi1Var, aVar.f36783b, aVar.f36786e, aVar.f36782a);
        }
        aVar.a(bi1Var.getCurrentTimeline());
    }
}
