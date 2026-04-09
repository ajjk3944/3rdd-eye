package qe;

import android.os.SystemClock;
import android.util.Log;
import androidx.lifecycle.f1;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f32277a;

    /* renamed from: b, reason: collision with root package name */
    public final double f32278b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32279c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32280d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32281e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f32282f;
    public final ThreadPoolExecutor g;

    /* renamed from: h, reason: collision with root package name */
    public final f1 f32283h;

    /* renamed from: i, reason: collision with root package name */
    public final y4.a f32284i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f32285k;

    public c(f1 f1Var, re.a aVar, y4.a aVar2) {
        double d10 = aVar.f32927d;
        double d11 = aVar.f32928e;
        this.f32277a = d10;
        this.f32278b = d11;
        this.f32279c = aVar.f32929f * 1000;
        this.f32283h = f1Var;
        this.f32284i = aVar2;
        this.f32280d = SystemClock.elapsedRealtime();
        int i4 = (int) d10;
        this.f32281e = i4;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i4);
        this.f32282f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.f32285k = 0L;
    }

    public final int a() {
        if (this.f32285k == 0) {
            this.f32285k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f32285k) / this.f32279c);
        int iMin = this.f32282f.size() == this.f32281e ? Math.min(100, this.j + iCurrentTimeMillis) : Math.max(0, this.j - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.f32285k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(je.b bVar, TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + bVar.f27536b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.f32283h.I(new ba.a(bVar.f27535a, ba.c.f2092c), new b(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.f32280d < 2000, bVar));
    }
}
