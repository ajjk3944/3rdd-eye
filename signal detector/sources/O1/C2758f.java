package o1;

import H1.p;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import b4.C0344i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2758f implements InterfaceC2753a {

    /* renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config f22679j = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final j f22680a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f22681b;

    /* renamed from: c, reason: collision with root package name */
    public final C0344i f22682c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22683d;

    /* renamed from: e, reason: collision with root package name */
    public long f22684e;

    /* renamed from: f, reason: collision with root package name */
    public int f22685f;

    /* renamed from: g, reason: collision with root package name */
    public int f22686g;

    /* renamed from: h, reason: collision with root package name */
    public int f22687h;
    public int i;

    public C2758f(long j6) {
        j jVar = new j();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f22683d = j6;
        this.f22680a = jVar;
        this.f22681b = setUnmodifiableSet;
        this.f22682c = new C0344i(27);
    }

    @Override // o1.InterfaceC2753a
    public final Bitmap a(int i, int i3, Bitmap.Config config) {
        Bitmap bitmapC = c(i, i3, config);
        if (bitmapC != null) {
            return bitmapC;
        }
        if (config == null) {
            config = f22679j;
        }
        return Bitmap.createBitmap(i, i3, config);
    }

    public final void b() {
        Log.v("LruBitmapPool", "Hits=" + this.f22685f + ", misses=" + this.f22686g + ", puts=" + this.f22687h + ", evictions=" + this.i + ", currentSize=" + this.f22684e + ", maxSize=" + this.f22683d + "\nStrategy=" + this.f22680a);
    }

    public final synchronized Bitmap c(int i, int i3, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f22680a.b(i, i3, config != null ? config : f22679j);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f22680a.getClass();
                    sb.append(j.c(p.d(config) * i * i3, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f22686g++;
            } else {
                this.f22685f++;
                long j6 = this.f22684e;
                this.f22680a.getClass();
                this.f22684e = j6 - p.c(bitmapB);
                this.f22682c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f22680a.getClass();
                sb2.append(j.c(p.d(config) * i * i3, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void d(long j6) {
        while (this.f22684e > j6) {
            try {
                j jVar = this.f22680a;
                Bitmap bitmap = (Bitmap) jVar.f22698b.Q();
                if (bitmap != null) {
                    jVar.a(Integer.valueOf(p.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        b();
                    }
                    this.f22684e = 0L;
                    return;
                }
                this.f22682c.getClass();
                long j7 = this.f22684e;
                this.f22680a.getClass();
                this.f22684e = j7 - p.c(bitmap);
                this.i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f22680a.getClass();
                    sb.append(j.c(p.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    b();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o1.InterfaceC2753a
    public final synchronized void e(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f22680a.getClass();
                if (p.c(bitmap) <= this.f22683d && this.f22681b.contains(bitmap.getConfig())) {
                    this.f22680a.getClass();
                    int iC = p.c(bitmap);
                    this.f22680a.e(bitmap);
                    this.f22682c.getClass();
                    this.f22687h++;
                    this.f22684e += iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f22680a.getClass();
                        sb.append(j.c(p.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        b();
                    }
                    d(this.f22683d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f22680a.getClass();
                sb2.append(j.c(p.c(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f22681b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o1.InterfaceC2753a
    public final Bitmap m(int i, int i3, Bitmap.Config config) {
        Bitmap bitmapC = c(i, i3, config);
        if (bitmapC != null) {
            bitmapC.eraseColor(0);
            return bitmapC;
        }
        if (config == null) {
            config = f22679j;
        }
        return Bitmap.createBitmap(i, i3, config);
    }

    @Override // o1.InterfaceC2753a
    public final void n(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            o();
        } else if (i >= 20 || i == 15) {
            d(this.f22683d / 2);
        }
    }

    @Override // o1.InterfaceC2753a
    public final void o() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        d(0L);
    }
}
