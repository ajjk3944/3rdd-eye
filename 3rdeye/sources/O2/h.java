package O2;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import h3.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config f10189j = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final j f10190a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<Bitmap.Config> f10191b;

    /* renamed from: c, reason: collision with root package name */
    public final a f10192c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10193d;

    /* renamed from: e, reason: collision with root package name */
    public long f10194e;

    /* renamed from: f, reason: collision with root package name */
    public int f10195f;

    /* renamed from: g, reason: collision with root package name */
    public int f10196g;

    /* renamed from: h, reason: collision with root package name */
    public int f10197h;
    public int i;

    /* compiled from: LruBitmapPool.java */
    public static final class a {
    }

    public h(long j4) {
        j jVar = new j();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f10193d = j4;
        this.f10190a = jVar;
        this.f10191b = setUnmodifiableSet;
        this.f10192c = new a();
    }

    @Override // O2.b
    public final Bitmap a(int i, int i10, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i10, config);
        if (bitmapG != null) {
            return bitmapG;
        }
        if (config == null) {
            config = f10189j;
        }
        return Bitmap.createBitmap(i, i10, config);
    }

    @Override // O2.b
    public final synchronized void b(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f10190a.getClass();
                if (l.c(bitmap) <= this.f10193d && this.f10191b.contains(bitmap.getConfig())) {
                    this.f10190a.getClass();
                    int iC = l.c(bitmap);
                    this.f10190a.e(bitmap);
                    this.f10192c.getClass();
                    this.f10197h++;
                    this.f10194e += iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f10190a.getClass();
                        sb.append(j.c(l.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        f();
                    }
                    h(this.f10193d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f10190a.getClass();
                sb2.append(j.c(l.c(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f10191b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // O2.b
    public final Bitmap c(int i, int i10, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i10, config);
        if (bitmapG != null) {
            bitmapG.eraseColor(0);
            return bitmapG;
        }
        if (config == null) {
            config = f10189j;
        }
        return Bitmap.createBitmap(i, i10, config);
    }

    @Override // O2.b
    @SuppressLint({"InlinedApi"})
    public final void d(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            com.google.android.gms.measurement.internal.a.i(i, "trimMemory, level=", "LruBitmapPool");
        }
        if (i >= 40 || i >= 20) {
            e();
        } else if (i >= 20 || i == 15) {
            h(this.f10193d / 2);
        }
    }

    @Override // O2.b
    public final void e() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0L);
    }

    public final void f() {
        Log.v("LruBitmapPool", "Hits=" + this.f10195f + ", misses=" + this.f10196g + ", puts=" + this.f10197h + ", evictions=" + this.i + ", currentSize=" + this.f10194e + ", maxSize=" + this.f10193d + "\nStrategy=" + this.f10190a);
    }

    public final synchronized Bitmap g(int i, int i10, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f10190a.b(i, i10, config != null ? config : f10189j);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f10190a.getClass();
                    sb.append(j.c(l.d(config) * i * i10, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f10196g++;
            } else {
                this.f10195f++;
                long j4 = this.f10194e;
                this.f10190a.getClass();
                this.f10194e = j4 - l.c(bitmapB);
                this.f10192c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f10190a.getClass();
                sb2.append(j.c(l.d(config) * i * i10, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void h(long j4) {
        while (this.f10194e > j4) {
            try {
                j jVar = this.f10190a;
                Bitmap bitmapC = jVar.f10204b.c();
                if (bitmapC != null) {
                    jVar.a(Integer.valueOf(l.c(bitmapC)), bitmapC);
                }
                if (bitmapC == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        f();
                    }
                    this.f10194e = 0L;
                    return;
                }
                this.f10192c.getClass();
                long j10 = this.f10194e;
                this.f10190a.getClass();
                this.f10194e = j10 - l.c(bitmapC);
                this.i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f10190a.getClass();
                    sb.append(j.c(l.c(bitmapC), bitmapC.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    f();
                }
                bitmapC.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
