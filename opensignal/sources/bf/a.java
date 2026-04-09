package bf;

import android.util.Log;
import androidx.media3.common.Metadata;
import androidx.media3.common.e1;
import androidx.media3.common.g0;
import androidx.media3.common.h1;
import androidx.media3.common.q0;
import com.google.android.exoplayer2.d1;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.p0;
import d5.w;
import io.sentry.android.core.i0;
import io.sentry.android.core.n0;
import io.sentry.android.core.o0;
import io.sentry.f6;
import io.sentry.g6;
import io.sentry.h4;
import io.sentry.i6;
import io.sentry.j6;
import io.sentry.k1;
import io.sentry.l6;
import io.sentry.m5;
import io.sentry.r3;
import io.sentry.t6;
import io.sentry.z0;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements f, qb.h, qb.i, a5.j, ca.c, eg.a, m5, dd.a, l6, r3, io.sentry.util.runtime.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2694a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2695d;

    public /* synthetic */ a(int i10, Object obj) {
        this.f2694a = i10;
        this.f2695d = obj;
    }

    @Override // qb.h, a5.j
    public void a(Object obj) {
        switch (this.f2694a) {
            case 1:
                ((d1) obj).onMediaMetadataChanged((p0) this.f2695d);
                break;
            case 2:
            default:
                ((q0) obj).onVideoSizeChanged((h1) this.f2695d);
                break;
            case 3:
                ((q0) obj).onMediaMetadataChanged((g0) this.f2695d);
                break;
            case 4:
                ((q0) obj).onAudioAttributesChanged((androidx.media3.common.f) this.f2695d);
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                ((q0) obj).onTrackSelectionParametersChanged((e1) this.f2695d);
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((q0) obj).onCues((z4.c) this.f2695d);
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((q0) obj).onMediaMetadataChanged(((w) this.f2695d).f7095a.f7125n0);
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                ((q0) obj).onMetadata((Metadata) this.f2695d);
                break;
            case 9:
                ((q0) obj).onCues((List) this.f2695d);
                break;
            case 10:
                ((q0) obj).onDeviceInfoChanged((androidx.media3.common.m) this.f2695d);
                break;
        }
    }

    @Override // ca.c
    public long b(long j) {
        return qb.v.j((j * r0.f3495e) / 1000000, 0L, ((ca.q) this.f2695d).j - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.t4 c(io.sentry.t4 r6, io.sentry.h0 r7) {
        /*
            r5 = this;
            java.lang.Object r7 = r5.f2695d
            cj.a r7 = (cj.a) r7
            java.lang.Object r0 = r7.f3977x
            java.util.List r0 = (java.util.List) r0
            java.lang.String r1 = "MODEL"
            r2 = 1
            if (r0 == 0) goto L14
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L14
            goto L30
        L14:
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = android.os.Build.MODEL
            br.l.d(r4, r1)
            boolean r3 = tt.s.n0(r4, r3, r2)
            if (r3 == 0) goto L18
            goto L8d
        L30:
            java.lang.Object r0 = r7.f3976r
            xh.a r0 = (xh.a) r0
            java.util.concurrent.atomic.AtomicReference r0 = r0.f25310b
            java.lang.Object r0 = r0.get()
            java.lang.String r3 = "get(...)"
            br.l.d(r0, r3)
            java.util.List r0 = (java.util.List) r0
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L48
            goto L64
        L48:
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L64
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = android.os.Build.MODEL
            br.l.d(r4, r1)
            boolean r3 = tt.s.n0(r4, r3, r2)
            if (r3 == 0) goto L4c
            goto L8d
        L64:
            java.lang.Object r7 = r7.f3978y
            java.util.List r7 = (java.util.List) r7
            java.lang.String r0 = android.os.Build.ID
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L8e
            java.lang.Throwable r7 = r6.a()
            boolean r7 = r7 instanceof java.lang.IllegalStateException
            if (r7 == 0) goto L8e
            java.lang.Throwable r7 = r6.a()
            if (r7 == 0) goto L8e
            java.lang.String r7 = r7.getMessage()
            if (r7 == 0) goto L8e
            java.lang.String r0 = "Maximum limit of concurrent alarms"
            r1 = 0
            boolean r7 = tt.l.q0(r7, r0, r1)
            if (r7 != r2) goto L8e
        L8d:
            r6 = 0
        L8e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.a.c(io.sentry.t4, io.sentry.h0):io.sentry.t4");
    }

    @Override // qb.i
    public void d(Object obj, qb.f fVar) {
        ((d1) obj).onEvents((g1) this.f2695d, new com.google.android.exoplayer2.e1(fVar));
    }

    @Override // io.sentry.l6
    public void e(j6 j6Var) {
        g6 g6Var = (g6) this.f2695d;
        io.sentry.l lVar = g6Var.f12289q;
        if (lVar != null) {
            lVar.b(j6Var);
        }
        f6 f6Var = g6Var.f12280f;
        t6 t6Var = g6Var.f12290r;
        if (t6Var.f12743g == null) {
            if (f6Var.f12253a) {
                g6Var.x(f6Var.f12254b, null);
                return;
            }
            return;
        }
        if (t6Var.f12742f) {
            ListIterator listIterator = g6Var.f12277c.listIterator();
            while (listIterator.hasNext()) {
                j6 j6Var2 = (j6) listIterator.next();
                if (!j6Var2.f12392g && j6Var2.f12387b == null) {
                    return;
                }
            }
        }
        g6Var.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03cf  */
    @Override // bf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(h9.r2 r54) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.a.f(h9.r2):java.lang.Object");
    }

    public void g(eb.j jVar) {
        switch (this.f2694a) {
            case 15:
                eb.c cVar = (eb.c) this.f2695d;
                synchronized (cVar.f8072b) {
                    jVar.f3295d = 0;
                    jVar.f8084r = null;
                    z9.f[] fVarArr = (z9.f[]) cVar.k;
                    int i10 = cVar.f8076f;
                    cVar.f8076f = i10 + 1;
                    fVarArr[i10] = jVar;
                    if (!cVar.f8073c.isEmpty() && cVar.f8076f > 0) {
                        cVar.f8072b.notify();
                    }
                }
                return;
            default:
                fb.j jVar2 = (fb.j) this.f2695d;
                fb.i iVar = (fb.i) jVar;
                iVar.f3295d = 0;
                iVar.f8084r = null;
                jVar2.f8814c.add(iVar);
                return;
        }
    }

    @Override // io.sentry.r3
    public void i(z0 z0Var) {
        i6 i6VarR;
        switch (this.f2694a) {
            case 22:
                z0Var.G(new androidx.media3.exoplayer.trackselection.h((k1) this.f2695d, 18, z0Var));
                break;
            case 23:
            case 24:
            case 25:
            default:
                androidx.fragment.app.b bVar = (androidx.fragment.app.b) this.f2695d;
                br.l.e(z0Var, "it");
                String canonicalName = bVar.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = bVar.getClass().getSimpleName();
                }
                z0Var.x(canonicalName);
                break;
            case 26:
                AtomicLong atomicLong = ((o0) this.f2695d).f11708a;
                if (atomicLong.get() == 0 && (i6VarR = z0Var.r()) != null) {
                    Date date = i6VarR.f12324a;
                    if ((date == null ? null : (Date) date.clone()) != null) {
                        atomicLong.set((date != null ? (Date) date.clone() : null).getTime());
                        break;
                    }
                }
                break;
            case 27:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f2695d;
                i6 i6VarR2 = z0Var.r();
                if (i6VarR2 != null) {
                    Date date2 = i6VarR2.f12324a;
                    if ((date2 == null ? null : (Date) date2.clone()) != null) {
                        atomicBoolean.set(true);
                        break;
                    }
                }
                break;
            case 28:
                z0Var.G(new androidx.media3.exoplayer.trackselection.h((io.sentry.android.core.internal.gestures.f) this.f2695d, 23, z0Var));
                break;
        }
    }

    @Override // dd.a
    public Object j(dd.r rVar) {
        ((CountDownLatch) this.f2695d).countDown();
        return null;
    }

    @Override // eg.a
    public void k(eg.b bVar) {
        switch (this.f2694a) {
            case 16:
                ef.a aVar = (ef.a) this.f2695d;
                aVar.getClass();
                Log.isLoggable("FirebaseCrashlytics", 3);
                aVar.f8185b.set((ef.a) bVar.get());
                break;
            default:
                ef.b bVar2 = (ef.b) this.f2695d;
                js.e eVar = ((og.j) ((rg.a) bVar.get())).a().k;
                ((Set) eVar.f13797d).add(bVar2);
                dd.r rVarB = ((pg.c) eVar.f13798g).b();
                rVarB.d((Executor) eVar.f13800x, new h4(eVar, rVarB, bVar2, 9));
                Log.isLoggable("FirebaseCrashlytics", 3);
                break;
        }
    }

    @Override // io.sentry.util.runtime.a
    public Object run() {
        switch (this.f2694a) {
            case 23:
                return n0.a(((io.sentry.android.core.v) this.f2695d).f11780a);
            case 24:
                return n0.a(((io.sentry.android.core.g0) this.f2695d).f11576a);
            default:
                return n0.a(((i0) this.f2695d).f11593a);
        }
    }

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f2694a = i10;
        this.f2695d = obj2;
    }
}
