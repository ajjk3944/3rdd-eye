package s9;

import ak.a0;
import ak.i0;
import ak.u;
import ak.z;
import android.app.job.JobParameters;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import ca.o;
import ch.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import g4.j;
import io.sentry.instrumentation.file.h;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import qb.v;
import sb.k;
import sb.l;
import ya.l0;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21933a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21934d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f21935g;

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f21933a = i10;
        this.f21934d = obj;
        this.f21935g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f21933a;
        boolean z10 = false;
        Object obj = this.f21935g;
        Object obj2 = this.f21934d;
        switch (i10) {
            case 0:
                int i11 = JobInfoSchedulerService.f4019a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            case 1:
                l lVar = (l) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                SurfaceTexture surfaceTexture2 = lVar.B;
                Surface surface = lVar.D;
                Surface surface2 = new Surface(surfaceTexture);
                lVar.B = surfaceTexture;
                lVar.D = surface2;
                Iterator it = lVar.f21981a.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).onVideoSurfaceCreated(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 2:
                uj.a aVar = (uj.a) obj2;
                i0 i0Var = (i0) obj;
                String str = i0Var.f548b;
                int i12 = i0Var.f547a;
                u uVar = aVar.f23569b.G;
                df.c cVar = aVar.f23570c;
                if (uVar != null) {
                    a0 a0Var = ((ak.g) aVar.f23571d.f20680g).f529f.f450b;
                    if (uVar.c()) {
                        if (uVar.a(cVar, a0Var) < a0Var.f424n) {
                            if (i12 > -1 && str != null && !tt.l.D0(str) && i0Var.f549c > -1) {
                                z10 = true;
                            }
                            if (!z10) {
                                n.b("IpWatcher", "Skipping caching ip with location: invalid public IP.");
                                return;
                            }
                            if (i12 != 1) {
                                n.b("IpWatcher", "Skipping caching ip with location: This is not a Wifi IP.");
                                return;
                            }
                            if (str != null) {
                                double d6 = uVar.f722b;
                                double d10 = uVar.f721a;
                                n.b("IpWatcher", "Caching IP " + str + " with location: " + d10 + ", " + d6);
                                String str2 = i0Var.f548b;
                                z zVar = new z(Math.abs(fr.d.f9050a.d().nextLong()), str2, System.currentTimeMillis(), uVar);
                                n.b("IpWatcher", "Caching IP " + str2 + " with location: " + d10 + ", " + d6);
                                ek.c cVar2 = aVar.f23568a;
                                rj.a aVar2 = (rj.a) cVar2.f8194c.g(zVar);
                                hi.a aVar3 = cVar2.f8193b;
                                cVar2.f8192a.k(aVar3, aVar3.k(aVar2));
                                return;
                            }
                            return;
                        }
                    }
                }
                n.b("IpWatcher", "Skipping caching ip with location: location not fresh enough.");
                return;
            case 3:
                vh.a aVar4 = (vh.a) obj2;
                LinkedList linkedList = (LinkedList) obj;
                try {
                    try {
                        String strConcat = aVar4.f23912a.concat("/logs/");
                        File file = new File(strConcat);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(strConcat + "mlvis-logs.json");
                        long length = file2.length();
                        if (length < ((ak.g) aVar4.f23914c.f20680g).f529f.f463q.f498c) {
                            if (length == 0) {
                                aVar4.f23919h = true;
                            }
                            StringBuilder sbD = aVar4.d(linkedList);
                            h hVar = new h(file2);
                            try {
                                hVar.write(sbD.toString());
                                hVar.close();
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    ic.a.g(hVar, th2);
                                    throw th3;
                                }
                            }
                        }
                    } catch (IOException e4) {
                        cj.a.E(e4, "Exception when logging to MLVis");
                    }
                    linkedList.clear();
                    return;
                } catch (Throwable th4) {
                    linkedList.clear();
                    throw th4;
                }
            case 4:
                u uVar2 = (u) obj2;
                js.e eVar = (js.e) obj;
                if (uVar2.c() && uVar2.d((df.c) eVar.f13798g, ((ak.g) ((q3.a) eVar.f13799r).f20680g).f529f.f450b)) {
                    return;
                }
                n.b("LocationValidator", "Location has expired");
                xi.u uVar3 = (xi.u) eVar.f13797d;
                if (uVar3 != null) {
                    uVar3.q0();
                    return;
                }
                return;
            case j.STRING_FIELD_NUMBER /* 5 */:
                y9.j jVar = (y9.j) ((xr.a) obj2).f25483g;
                int i13 = v.f20828a;
                jVar.onAudioDecoderReleased((String) obj);
                return;
            default:
                l0 l0Var = (l0) obj2;
                ca.u uVar4 = (ca.u) obj;
                l0Var.T = l0Var.M == null ? uVar4 : new o(-9223372036854775807L);
                l0Var.U = uVar4.e();
                if (l0Var.f26095a0 == -1 && uVar4.e() == -9223372036854775807L) {
                    z10 = true;
                }
                l0Var.V = z10;
                l0Var.W = z10 ? 7 : 1;
                l0Var.B.b(l0Var.U, uVar4.b(), l0Var.V);
                if (l0Var.Q) {
                    return;
                }
                l0Var.w();
                return;
        }
    }
}
