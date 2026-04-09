package t;

import android.os.Looper;
import androidx.lifecycle.e1;
import androidx.lifecycle.l0;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class s extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public ExecutorService f33854b;

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.f f33855c;

    /* renamed from: d, reason: collision with root package name */
    public se.b f33856d;

    /* renamed from: e, reason: collision with root package name */
    public se.b f33857e;

    /* renamed from: f, reason: collision with root package name */
    public i0.f f33858f;
    public km.n g;

    /* renamed from: h, reason: collision with root package name */
    public r f33859h;

    /* renamed from: i, reason: collision with root package name */
    public String f33860i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f33861k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33862l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33863m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33864n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f33865o;

    /* renamed from: p, reason: collision with root package name */
    public l0 f33866p;

    /* renamed from: q, reason: collision with root package name */
    public l0 f33867q;

    /* renamed from: r, reason: collision with root package name */
    public l0 f33868r;

    /* renamed from: s, reason: collision with root package name */
    public l0 f33869s;

    /* renamed from: t, reason: collision with root package name */
    public l0 f33870t;

    /* renamed from: v, reason: collision with root package name */
    public l0 f33872v;

    /* renamed from: x, reason: collision with root package name */
    public l0 f33874x;

    /* renamed from: y, reason: collision with root package name */
    public l0 f33875y;
    public int j = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f33871u = true;

    /* renamed from: w, reason: collision with root package name */
    public int f33873w = 0;

    public static void j(l0 l0Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            l0Var.j(obj);
        } else {
            l0Var.h(obj);
        }
    }

    public final int e() {
        if (this.f33856d != null) {
            return this.f33857e != null ? 15 : 255;
        }
        return 0;
    }

    public final void f(e eVar) {
        if (this.f33867q == null) {
            this.f33867q = new l0();
        }
        j(this.f33867q, eVar);
    }

    public final void g(CharSequence charSequence) {
        if (this.f33875y == null) {
            this.f33875y = new l0();
        }
        j(this.f33875y, charSequence);
    }

    public final void h(int i4) {
        if (this.f33874x == null) {
            this.f33874x = new l0();
        }
        j(this.f33874x, Integer.valueOf(i4));
    }

    public final void i(boolean z3) {
        if (this.f33870t == null) {
            this.f33870t = new l0();
        }
        j(this.f33870t, Boolean.valueOf(z3));
    }
}
