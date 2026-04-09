package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.FontsContractCompat;
import androidx.core.provider.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final FontsContractCompat.FontRequestCallback f2562a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f2563b;

    /* renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    public class RunnableC0018a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FontsContractCompat.FontRequestCallback f2564a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f2565b;

        public RunnableC0018a(FontsContractCompat.FontRequestCallback fontRequestCallback, Typeface typeface) {
            this.f2564a = fontRequestCallback;
            this.f2565b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2564a.b(this.f2565b);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FontsContractCompat.FontRequestCallback f2567a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2568b;

        public b(FontsContractCompat.FontRequestCallback fontRequestCallback, int i10) {
            this.f2567a = fontRequestCallback;
            this.f2568b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2567a.a(this.f2568b);
        }
    }

    public a(FontsContractCompat.FontRequestCallback fontRequestCallback, Handler handler) {
        this.f2562a = fontRequestCallback;
        this.f2563b = handler;
    }

    public final void a(int i10) {
        this.f2563b.post(new b(this.f2562a, i10));
    }

    public void b(c.e eVar) {
        if (eVar.a()) {
            c(eVar.f2587a);
        } else {
            a(eVar.f2588b);
        }
    }

    public final void c(Typeface typeface) {
        this.f2563b.post(new RunnableC0018a(this.f2562a, typeface));
    }
}
