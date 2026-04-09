package ec;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.f8;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.p9;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.x8;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements v, d8.w, e6.b, g8.e0, ck.g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ x f23116b = new x(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x f23117c = new x(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x f23118d = new x(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ x f23119e = new x(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x f23120f = new x(4);
    public static final /* synthetic */ x g = new x(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ x f23121h = new x(6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ x f23122i = new x(7);
    public static final /* synthetic */ x j = new x(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ x f23123k = new x(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ x f23124l = new x(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ x f23125m = new x(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ x f23126n = new x(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ x f23127o = new x(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ x f23128p = new x(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ x f23129q = new x(15);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ x f23130r = new x(16);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ x f23131s = new x(17);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ x f23132t = new x(18);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ x f23133u = new x(19);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ x f23134v = new x(20);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ x f23135w = new x(21);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ x f23136x = new x(22);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23137a;

    public /* synthetic */ x(int i4) {
        this.f23137a = i4;
    }

    public static final void e(hm.b bVar) {
        t7.m mVar = hm.b.f25162h;
        if (hm.b.f25163i == null) {
            hm.b.f25163i = new hm.b();
            c8.a aVar = new c8.a("Okio Watchdog");
            aVar.setDaemon(true);
            aVar.start();
        }
        long jNanoTime = System.nanoTime();
        long j8 = bVar.f25220c;
        boolean z3 = bVar.f25218a;
        if (j8 != 0 && z3) {
            bVar.g = Math.min(j8, bVar.c() - jNanoTime) + jNanoTime;
        } else if (j8 != 0) {
            bVar.g = jNanoTime + j8;
        } else {
            if (!z3) {
                throw new AssertionError();
            }
            bVar.g = bVar.c();
        }
        t7.m mVar2 = hm.b.f25162h;
        int i4 = mVar2.f34473b + 1;
        mVar2.f34473b = i4;
        hm.b[] bVarArr = (hm.b[]) mVar2.f34474c;
        if (i4 == bVarArr.length) {
            hm.b[] bVarArr2 = new hm.b[i4 * 2];
            zj.m.R(0, 0, 14, bVarArr, bVarArr2);
            mVar2.f34474c = bVarArr2;
        }
        mVar2.p(i4, bVar);
        if (bVar.f25168f == 1) {
            hm.b.f25164k.signal();
        }
    }

    public static hm.b f() throws InterruptedException {
        t7.m mVar = hm.b.f25162h;
        hm.b bVar = ((hm.b[]) mVar.f34474c)[1];
        if (bVar == null) {
            long jNanoTime = System.nanoTime();
            hm.b.f25164k.await(hm.b.f25165l, TimeUnit.MILLISECONDS);
            if (((hm.b[]) mVar.f34474c)[1] != null || System.nanoTime() - jNanoTime < hm.b.f25166m) {
                return null;
            }
            return hm.b.f25163i;
        }
        long jNanoTime2 = bVar.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            hm.b.f25164k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        mVar.u(bVar);
        bVar.f25167e = 2;
        return bVar;
    }

    @Override // g8.e0
    public void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f23137a) {
            case 26:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // ec.v
    public Object b() {
        switch (this.f23137a) {
            case 0:
                List list = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19703o.b()).longValue());
            case 1:
                List list2 = d0.f22616a;
                c7.f19649b.get();
                Long l10 = (Long) e7.H.b();
                l10.getClass();
                return l10;
            case 2:
                List list3 = d0.f22616a;
                c7.f19649b.get();
                return (String) e7.g.b();
            case 3:
                List list4 = d0.f22616a;
                m8.f19831b.get();
                return Integer.valueOf((int) ((Long) o8.f19857d.b()).longValue());
            case 4:
                List list5 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19715u.b()).longValue());
            case 5:
                List list6 = d0.f22616a;
                c7.f19649b.get();
                Long l11 = (Long) e7.f19684d0.b();
                l11.getClass();
                return l11;
            case 6:
                List list7 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19721x.b()).longValue());
            case 7:
                List list8 = d0.f22616a;
                c7.f19649b.get();
                return (String) e7.Y.b();
            case 8:
                List list9 = d0.f22616a;
                c7.f19649b.get();
                return (String) e7.D.b();
            case 9:
                List list10 = d0.f22616a;
                c7.f19649b.get();
                return (String) e7.f19680b0.b();
            case 10:
                List list11 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.W.b()).longValue());
            case 11:
                List list12 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19717v.b()).longValue());
            case 12:
                List list13 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.B.b()).longValue());
            case 13:
                List list14 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19693i0.b()).longValue());
            case 14:
                List list15 = d0.f22616a;
                Boolean bool = (Boolean) p9.f19866a.b();
                bool.getClass();
                return bool;
            case 15:
                List list16 = d0.f22616a;
                Boolean bool2 = (Boolean) t7.f19939a.b();
                bool2.getClass();
                return bool2;
            case 16:
                List list17 = d0.f22616a;
                Boolean bool3 = (Boolean) j9.f19792a.b();
                bool3.getClass();
                return bool3;
            case 17:
                List list18 = d0.f22616a;
                p8.f19864b.get();
                Boolean bool4 = (Boolean) r8.f19903a.b();
                bool4.getClass();
                return bool4;
            case 18:
                List list19 = d0.f22616a;
                p8.f19864b.get();
                Boolean bool5 = (Boolean) r8.f19904b.b();
                bool5.getClass();
                return bool5;
            case 19:
                List list20 = d0.f22616a;
                Boolean bool6 = (Boolean) n7.f19845a.b();
                bool6.getClass();
                return bool6;
            case 20:
                List list21 = d0.f22616a;
                Boolean bool7 = (Boolean) x8.f20038a.b();
                bool7.getClass();
                return bool7;
            case 21:
                return new Boolean(((Boolean) f8.f19746a.b()).booleanValue());
            default:
                return new Boolean(((Boolean) g9.f19761a.b()).booleanValue());
        }
    }

    @Override // e6.b
    public e6.c c(ur0 ur0Var) {
        return new f6.h((Context) ur0Var.f17304d, (String) ur0Var.f17305e, (t7.m) ur0Var.f17306f, ur0Var.f17302b, ur0Var.f17303c);
    }

    @Override // g8.e0
    public void d(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        switch (this.f23137a) {
            case 26:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // d8.w
    public d8.v i(d8.b0 b0Var) {
        return new ei.b(1);
    }

    public String toString() {
        switch (this.f23137a) {
            case 28:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
