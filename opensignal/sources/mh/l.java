package mh;

import android.os.Looper;
import ch.n;
import java.nio.channels.DatagramChannel;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f16753a;

    /* renamed from: b, reason: collision with root package name */
    public final b f16754b;

    /* renamed from: c, reason: collision with root package name */
    public k f16755c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f16756d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f16757e;

    /* renamed from: i, reason: collision with root package name */
    public DatagramChannel f16761i;
    public CountDownLatch j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public long f16762l;

    /* renamed from: n, reason: collision with root package name */
    public final yh.c f16764n;

    /* renamed from: o, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f16765o;

    /* renamed from: p, reason: collision with root package name */
    public final String f16766p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f16767q;

    /* renamed from: r, reason: collision with root package name */
    public mi.f f16768r;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f16758f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f16759g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f16760h = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public mi.f f16763m = null;

    public l(b bVar, yh.c cVar, io.sentry.internal.debugmeta.c cVar2, ThreadFactory threadFactory, String str, boolean z10) {
        this.f16766p = null;
        StringBuilder sb2 = new StringBuilder("UdpTest() called with: udpConfig = [");
        sb2.append(bVar);
        sb2.append("] From thread: ");
        sb2.append(Thread.currentThread().getId());
        sb2.append(" isMainThread [");
        sb2.append(Looper.myLooper() == Looper.getMainLooper());
        sb2.append("]");
        n.b("UdpTest", sb2.toString());
        this.f16753a = threadFactory;
        this.f16754b = bVar;
        this.f16764n = cVar;
        this.f16765o = cVar2;
        this.j = new CountDownLatch(0);
        this.f16762l = 0L;
        this.f16766p = str;
        this.f16767q = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Type inference failed for: r12v4, types: [mh.a, mi.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.l.a():void");
    }
}
