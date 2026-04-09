package androidx.media3.exoplayer.trackselection;

import android.content.Intent;
import androidx.media3.common.Metadata;
import androidx.media3.common.b1;
import androidx.media3.common.e1;
import androidx.media3.common.g1;
import androidx.media3.common.h1;
import androidx.media3.common.n0;
import androidx.media3.common.o0;
import androidx.media3.common.s0;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.d1;
import h7.r1;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b2;
import io.sentry.b4;
import io.sentry.g6;
import io.sentry.h4;
import io.sentry.k1;
import io.sentry.m3;
import io.sentry.o3;
import io.sentry.r3;
import io.sentry.v1;
import io.sentry.x5;
import io.sentry.z0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements r, eg.a, qb.h, a5.j, a5.k, b4, v1, o3, r3, io.sentry.instrumentation.file.a, m3, dd.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1894a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1895d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1896g;

    public /* synthetic */ h(Object obj, int i10, Object obj2) {
        this.f1894a = i10;
        this.f1895d = obj;
        this.f1896g = obj2;
    }

    @Override // qb.h, a5.j
    public void a(Object obj) {
        switch (this.f1894a) {
            case 3:
                a1 a1Var = (a1) this.f1895d;
                ((d1) obj).onTracksChanged(a1Var.f4055h, (ob.j) this.f1896g);
                break;
            case 4:
                ((e5.c) obj).onPlaybackParametersChanged((e5.a) this.f1895d, (n0) this.f1896g);
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                ((e5.c) obj).onTrackSelectionParametersChanged((e5.a) this.f1895d, (e1) this.f1896g);
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((e5.c) obj).onAvailableCommandsChanged((e5.a) this.f1895d, (o0) this.f1896g);
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                ((e5.c) obj).onCues((e5.a) this.f1895d, (z4.c) this.f1896g);
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                ((e5.c) obj).onAudioAttributesChanged((e5.a) this.f1895d, (androidx.media3.common.f) this.f1896g);
                break;
            case 9:
                ((e5.c) obj).onMetadata((e5.a) this.f1895d, (Metadata) this.f1896g);
                break;
            case 10:
                ((e5.c) obj).onTracksChanged((e5.a) this.f1895d, (g1) this.f1896g);
                break;
            case 11:
                ((e5.c) obj).onCues((e5.a) this.f1895d, (List) this.f1896g);
                break;
            case 12:
                ((e5.c) obj).onDeviceInfoChanged((e5.a) this.f1895d, (androidx.media3.common.m) this.f1896g);
                break;
            case 13:
                DefaultAnalyticsCollector.lambda$onVideoSizeChanged$57((e5.a) this.f1895d, (h1) this.f1896g, (e5.c) obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.r
    public List b(int i10, b1 b1Var, int[] iArr) {
        switch (this.f1894a) {
            case 0:
                return DefaultTrackSelector.lambda$selectVideoTrack$2((l) this.f1895d, (int[]) this.f1896g, i10, b1Var, iArr);
            default:
                return DefaultTrackSelector.lambda$selectTextTrack$4((l) this.f1895d, (String) this.f1896g, i10, b1Var, iArr);
        }
    }

    @Override // io.sentry.b4
    public void c(x5 x5Var) {
        String str = (String) this.f1895d;
        cj.a aVar = (cj.a) this.f1896g;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) x5Var;
        br.l.e(sentryAndroidOptions, "options");
        sentryAndroidOptions.setDsn(str);
        sentryAndroidOptions.setEnvironment("production");
        sentryAndroidOptions.setBeforeSend(new bf.a(18, aVar));
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() throws IOException {
        switch (this.f1894a) {
            case 24:
                return Integer.valueOf(((io.sentry.instrumentation.file.e) this.f1895d).f12343a.read((byte[]) this.f1896g));
            case 25:
                io.sentry.instrumentation.file.e eVar = (io.sentry.instrumentation.file.e) this.f1895d;
                AtomicInteger atomicInteger = (AtomicInteger) this.f1896g;
                int i10 = eVar.f12343a.read();
                atomicInteger.set(i10);
                return Integer.valueOf(i10 != -1 ? 1 : 0);
            default:
                io.sentry.instrumentation.file.f fVar = (io.sentry.instrumentation.file.f) this.f1895d;
                byte[] bArr = (byte[]) this.f1896g;
                fVar.f12345a.write(bArr);
                return Integer.valueOf(bArr.length);
        }
    }

    @Override // io.sentry.o3
    public void d(k1 k1Var) {
        switch (this.f1894a) {
            case 17:
                g6 g6Var = (g6) this.f1895d;
                z0 z0Var = (z0) this.f1896g;
                g6Var.getClass();
                if (k1Var == g6Var) {
                    z0Var.q();
                    break;
                }
                break;
            case 18:
                k1 k1Var2 = (k1) this.f1895d;
                z0 z0Var2 = (z0) this.f1896g;
                if (k1Var == k1Var2) {
                    z0Var2.q();
                    break;
                }
                break;
            default:
                io.sentry.android.core.internal.gestures.f fVar = (io.sentry.android.core.internal.gestures.f) this.f1895d;
                z0 z0Var3 = (z0) this.f1896g;
                if (k1Var == fVar.f11611x) {
                    z0Var3.q();
                    break;
                }
                break;
        }
    }

    @Override // io.sentry.m3
    public void f(io.sentry.k kVar) {
        z0 z0Var = (z0) this.f1895d;
        x5 x5Var = (x5) this.f1896g;
        io.sentry.c cVar = (io.sentry.c) kVar.f12399r;
        if (cVar.f12097f) {
            io.sentry.k kVarV = z0Var.v();
            io.sentry.protocol.t tVarI = z0Var.i();
            cVar.c("sentry-trace_id", ((io.sentry.protocol.t) kVarV.f12397d).toString());
            cVar.c("sentry-public_key", x5Var.retrieveParsedDsn().f12871b);
            cVar.c("sentry-release", x5Var.getRelease());
            cVar.c("sentry-environment", x5Var.getEnvironment());
            if (!io.sentry.protocol.t.f12636d.equals(tVarI)) {
                cVar.c("sentry-replay_id", tVarI.toString());
            }
            cVar.c("sentry-transaction", null);
            if (cVar.f12097f) {
                cVar.f12094c = null;
            }
            cVar.c("sentry-sampled", null);
            cVar.f12097f = false;
        }
    }

    @Override // io.sentry.v1
    public Object g() {
        br.a0 a0Var = (br.a0) this.f1895d;
        b2 b2Var = (b2) this.f1896g;
        a0Var.getClass();
        try {
            try {
                return Integer.valueOf(((io.sentry.vendor.gson.stream.a) b2Var.f12071d).Z());
            } catch (Exception unused) {
                return Long.valueOf(((io.sentry.vendor.gson.stream.a) b2Var.f12071d).f0());
            }
        } catch (Exception unused2) {
            return Double.valueOf(((io.sentry.vendor.gson.stream.a) b2Var.f12071d).Y());
        }
    }

    @Override // a5.k
    public void h(Object obj, androidx.media3.common.p pVar) {
        ((DefaultAnalyticsCollector) this.f1895d).lambda$setPlayer$1((s0) this.f1896g, (e5.c) obj, pVar);
    }

    @Override // io.sentry.r3
    public void i(z0 z0Var) {
        switch (this.f1894a) {
            case 19:
                z0Var.G(new io.sentry.android.core.e((ActivityLifecycleIntegration) this.f1895d, z0Var, (k1) this.f1896g));
                break;
            case 22:
                z0Var.G(new h4((io.sentry.android.core.internal.gestures.f) this.f1895d, z0Var, (k1) this.f1896g, 2));
                break;
            default:
                ((r1) this.f1895d).f10199d = z0Var.E(new h(z0Var, 28, (x5) this.f1896g));
                break;
        }
    }

    @Override // eg.a
    public void k(eg.b bVar) {
        eg.a aVar = (eg.a) this.f1895d;
        eg.a aVar2 = (eg.a) this.f1896g;
        aVar.k(bVar);
        aVar2.k(bVar);
    }

    @Override // dd.c
    public void s(dd.r rVar) {
        ((kg.h) this.f1895d).a((Intent) this.f1896g);
    }
}
