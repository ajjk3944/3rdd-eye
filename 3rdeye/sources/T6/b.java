package T6;

import H6.C0675l;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.l;
import m6.InterfaceC5331d;

/* compiled from: InputFocusTracker.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference<View> f12299d;

    /* renamed from: a, reason: collision with root package name */
    public Object f12300a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12301b;

    /* renamed from: c, reason: collision with root package name */
    public final a f12302c;

    /* compiled from: InputFocusTracker.kt */
    public final class a implements InterfaceC5331d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f12303a;

        public a() {
        }

        @Override // m6.InterfaceC5331d
        public final void a() {
            b bVar = b.this;
            bVar.f12301b = false;
            if (this.f12303a) {
                return;
            }
            bVar.f12300a = null;
        }

        @Override // m6.InterfaceC5331d
        public final void b() {
            b.this.f12301b = true;
            this.f12303a = false;
        }
    }

    public b(C0675l div2View, B7.e eVar) {
        l.f(div2View, "div2View");
        a aVar = new a();
        this.f12302c = aVar;
        synchronized (div2View.f2167K) {
            div2View.f2201z.b(aVar);
        }
    }
}
