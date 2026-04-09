package F2;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class j implements d {

    /* renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f5822k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private final k f5823a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f5824b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5825c;

    /* renamed from: d, reason: collision with root package name */
    private final a f5826d;

    /* renamed from: e, reason: collision with root package name */
    private long f5827e;

    /* renamed from: f, reason: collision with root package name */
    private long f5828f;

    /* renamed from: g, reason: collision with root package name */
    private int f5829g;

    /* renamed from: h, reason: collision with root package name */
    private int f5830h;

    /* renamed from: i, reason: collision with root package name */
    private int f5831i;

    /* renamed from: j, reason: collision with root package name */
    private int f5832j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    private static final class b implements a {
        b() {
        }

        @Override // F2.j.a
        public void a(Bitmap bitmap) {
        }

        @Override // F2.j.a
        public void b(Bitmap bitmap) {
        }
    }

    j(long j10, k kVar, Set set) {
        this.f5825c = j10;
        this.f5827e = j10;
        this.f5823a = kVar;
        this.f5824b = set;
        this.f5826d = new b();
    }

    private static void f(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f5822k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f5829g + ", misses=" + this.f5830h + ", puts=" + this.f5831i + ", evictions=" + this.f5832j + ", currentSize=" + this.f5828f + ", maxSize=" + this.f5827e + "\nStrategy=" + this.f5823a);
    }

    private void j() {
        q(this.f5827e);
    }

    private static Set k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    private static k l() {
        return new m();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapD;
        try {
            f(config);
            bitmapD = this.f5823a.d(i10, i11, config != null ? config : f5822k);
            if (bitmapD == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f5823a.a(i10, i11, config));
                }
                this.f5830h++;
            } else {
                this.f5829g++;
                this.f5828f -= this.f5823a.b(bitmapD);
                this.f5826d.a(bitmapD);
                p(bitmapD);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f5823a.a(i10, i11, config));
            }
            h();
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapD;
    }

    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f5828f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f5823a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f5828f = 0L;
                    return;
                }
                this.f5826d.a(bitmapRemoveLast);
                this.f5828f -= this.f5823a.b(bitmapRemoveLast);
                this.f5832j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f5823a.e(bitmapRemoveLast));
                }
                h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // F2.d
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // F2.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // F2.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f5823a.b(bitmap) <= this.f5827e && this.f5824b.contains(bitmap.getConfig())) {
                int iB = this.f5823a.b(bitmap);
                this.f5823a.c(bitmap);
                this.f5826d.b(bitmap);
                this.f5831i++;
                this.f5828f += iB;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f5823a.e(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f5823a.e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f5824b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // F2.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        if (bitmapM == null) {
            return g(i10, i11, config);
        }
        bitmapM.eraseColor(0);
        return bitmapM;
    }

    @Override // F2.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        return bitmapM == null ? g(i10, i11, config) : bitmapM;
    }

    public long n() {
        return this.f5827e;
    }

    public j(long j10) {
        this(j10, l(), k());
    }
}
