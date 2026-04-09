package m0;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p0.C7182c;
import p0.C7185f;
import p0.InterfaceC7183d;
import q0.AbstractC7408a;
import q0.C7409b;

/* renamed from: m0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6675K implements InterfaceC6671H0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f52815e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static boolean f52816f = true;

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f52817a;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC7408a f52819c;

    /* renamed from: b, reason: collision with root package name */
    private final Object f52818b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final ComponentCallbacks2 f52820d = null;

    /* renamed from: m0.K$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: m0.K$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f52821a = new b();

        private b() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public C6675K(ViewGroup viewGroup) {
        this.f52817a = viewGroup;
    }

    private final long c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a(view);
        }
        return -1L;
    }

    private final AbstractC7408a d(ViewGroup viewGroup) {
        AbstractC7408a abstractC7408a = this.f52819c;
        if (abstractC7408a != null) {
            return abstractC7408a;
        }
        C7409b c7409b = new C7409b(viewGroup.getContext());
        viewGroup.addView(c7409b);
        this.f52819c = c7409b;
        return c7409b;
    }

    @Override // m0.InterfaceC6671H0
    public void a(C7182c c7182c) {
        synchronized (this.f52818b) {
            c7182c.H();
            Yg.J j10 = Yg.J.f24997a;
        }
    }

    @Override // m0.InterfaceC6671H0
    public C7182c b() {
        InterfaceC7183d e10;
        C7182c c7182c;
        synchronized (this.f52818b) {
            try {
                long jC = c(this.f52817a);
                if (Build.VERSION.SDK_INT >= 29) {
                    e10 = new p0.D(jC, null, null, 6, null);
                } else if (f52816f) {
                    try {
                        e10 = new C7185f(this.f52817a, jC, null, null, 12, null);
                    } catch (Throwable unused) {
                        f52816f = false;
                        e10 = new p0.E(d(this.f52817a), jC, null, null, 12, null);
                    }
                } else {
                    e10 = new p0.E(d(this.f52817a), jC, null, null, 12, null);
                }
                c7182c = new C7182c(e10, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7182c;
    }
}
