package androidx.work;

import android.os.Build;
import android.os.Looper;
import b0.C1810a;
import java.util.concurrent.ExecutorService;

/* compiled from: Configuration.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f16865a = E.u.j(false);

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f16866b = E.u.j(true);

    /* renamed from: c, reason: collision with root package name */
    public final B7.d f16867c = new B7.d(16);

    /* renamed from: d, reason: collision with root package name */
    public final x f16868d;

    /* renamed from: e, reason: collision with root package name */
    public final o f16869e;

    /* renamed from: f, reason: collision with root package name */
    public final H7.e f16870f;

    /* renamed from: g, reason: collision with root package name */
    public final C1810a f16871g;

    /* renamed from: h, reason: collision with root package name */
    public final T.a f16872h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16873j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16874k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16875l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16876m;

    /* compiled from: Configuration.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public C1810a f16877a;

        /* renamed from: b, reason: collision with root package name */
        public T.a f16878b;

        /* renamed from: c, reason: collision with root package name */
        public String f16879c;
    }

    /* compiled from: Configuration.kt */
    /* renamed from: androidx.work.b$b, reason: collision with other inner class name */
    public interface InterfaceC0266b {
        b a();
    }

    public b(a aVar) {
        String str = y.f17049a;
        this.f16868d = new x();
        this.f16869e = o.f17017b;
        H7.e eVar = new H7.e();
        eVar.f2291b = G0.i.a(Looper.getMainLooper());
        this.f16870f = eVar;
        this.f16873j = 4;
        this.f16874k = Integer.MAX_VALUE;
        this.f16876m = Build.VERSION.SDK_INT == 23 ? 10 : 20;
        this.f16871g = aVar.f16877a;
        this.f16872h = aVar.f16878b;
        this.i = aVar.f16879c;
        this.f16875l = 8;
    }
}
