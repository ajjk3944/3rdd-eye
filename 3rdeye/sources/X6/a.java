package X6;

import N7.H7;
import android.view.ViewTreeObserver;

/* compiled from: AdaptiveMaxLines.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final O6.q f13572a;

    /* renamed from: b, reason: collision with root package name */
    public b f13573b;

    /* renamed from: c, reason: collision with root package name */
    public c f13574c;

    /* renamed from: d, reason: collision with root package name */
    public C0196a f13575d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13576e;

    /* compiled from: AdaptiveMaxLines.kt */
    /* renamed from: X6.a$a, reason: collision with other inner class name */
    public static final class C0196a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13577a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13578b;

        public C0196a(int i, int i10) {
            this.f13577a = i;
            this.f13578b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0196a)) {
                return false;
            }
            C0196a c0196a = (C0196a) obj;
            return this.f13577a == c0196a.f13577a && this.f13578b == c0196a.f13578b;
        }

        public final int hashCode() {
            return (this.f13577a * 31) + this.f13578b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(maxLines=");
            sb.append(this.f13577a);
            sb.append(", minHiddenLines=");
            return H7.p(sb, this.f13578b, ')');
        }
    }

    public a(O6.q textView) {
        kotlin.jvm.internal.l.f(textView, "textView");
        this.f13572a = textView;
    }

    public final void a() {
        c cVar = this.f13574c;
        if (cVar != null) {
            ViewTreeObserver viewTreeObserver = this.f13572a.getViewTreeObserver();
            kotlin.jvm.internal.l.e(viewTreeObserver, "textView.viewTreeObserver");
            viewTreeObserver.removeOnPreDrawListener(cVar);
        }
        this.f13574c = null;
    }
}
