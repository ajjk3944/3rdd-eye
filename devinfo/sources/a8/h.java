package a8;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import t8.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements b {
    public static final Bitmap.Config j = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final l f234a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f235b;

    /* renamed from: c, reason: collision with root package name */
    public final b7.h f236c;

    /* renamed from: d, reason: collision with root package name */
    public final long f237d;

    /* renamed from: e, reason: collision with root package name */
    public long f238e;

    /* renamed from: f, reason: collision with root package name */
    public int f239f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f240h;

    /* renamed from: i, reason: collision with root package name */
    public int f241i;

    public h(long j8) {
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i4 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i4 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.f237d = j8;
        this.f234a = lVar;
        this.f235b = setUnmodifiableSet;
        this.f236c = new b7.h(2);
    }

    @Override // a8.b
    public final Bitmap a(int i4, int i10, Bitmap.Config config) {
        Bitmap bitmapC = c(i4, i10, config);
        if (bitmapC != null) {
            return bitmapC;
        }
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i4, i10, config);
    }

    public final void b() {
        Log.v("LruBitmapPool", "Hits=" + this.f239f + ", misses=" + this.g + ", puts=" + this.f240h + ", evictions=" + this.f241i + ", currentSize=" + this.f238e + ", maxSize=" + this.f237d + "\nStrategy=" + this.f234a);
    }

    public final synchronized Bitmap c(int i4, int i10, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f234a.b(i4, i10, config != null ? config : j);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                    this.f234a.getClass();
                    sb2.append(l.c(m.d(config) * i4 * i10, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.g++;
            } else {
                this.f239f++;
                long j8 = this.f238e;
                this.f234a.getClass();
                this.f238e = j8 - m.c(bitmapB);
                this.f236c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Get bitmap=");
                this.f234a.getClass();
                sb3.append(l.c(m.d(config) * i4 * i10, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapB;
    }

    @Override // a8.b
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f234a.getClass();
                if (m.c(bitmap) <= this.f237d && this.f235b.contains(bitmap.getConfig())) {
                    this.f234a.getClass();
                    int iC = m.c(bitmap);
                    this.f234a.e(bitmap);
                    this.f236c.getClass();
                    this.f240h++;
                    this.f238e += iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder("Put bitmap in pool=");
                        this.f234a.getClass();
                        sb2.append(l.c(m.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        b();
                    }
                    f(this.f237d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f234a.getClass();
                sb3.append(l.c(m.c(bitmap), bitmap.getConfig()));
                sb3.append(", is mutable: ");
                sb3.append(bitmap.isMutable());
                sb3.append(", is allowed config: ");
                sb3.append(this.f235b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb3.toString());
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // a8.b
    public final Bitmap e(int i4, int i10, Bitmap.Config config) {
        Bitmap bitmapC = c(i4, i10, config);
        if (bitmapC != null) {
            bitmapC.eraseColor(0);
            return bitmapC;
        }
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i4, i10, config);
    }

    public final synchronized void f(long j8) {
        while (this.f238e > j8) {
            try {
                l lVar = this.f234a;
                Bitmap bitmap = (Bitmap) lVar.f251b.Q();
                if (bitmap != null) {
                    lVar.a(Integer.valueOf(m.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        b();
                    }
                    this.f238e = 0L;
                    return;
                }
                this.f236c.getClass();
                long j9 = this.f238e;
                this.f234a.getClass();
                this.f238e = j9 - m.c(bitmap);
                this.f241i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Evicting bitmap=");
                    this.f234a.getClass();
                    sb2.append(l.c(m.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    b();
                }
                bitmap.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.b
    public final void i(int i4) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i4);
        }
        if (i4 >= 40 || i4 >= 20) {
            j();
        } else if (i4 >= 20 || i4 == 15) {
            f(this.f237d / 2);
        }
    }

    @Override // a8.b
    public final void j() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        f(0L);
    }
}
