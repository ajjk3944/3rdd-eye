package H0;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import s0.C7868d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f7584a = new HashMap();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C7868d f7585a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7586b;

        public a(C7868d c7868d, int i10) {
            this.f7585a = c7868d;
            this.f7586b = i10;
        }

        public final int a() {
            return this.f7586b;
        }

        public final C7868d b() {
            return this.f7585a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f7585a, aVar.f7585a) && this.f7586b == aVar.f7586b;
        }

        public int hashCode() {
            return (this.f7585a.hashCode() * 31) + Integer.hashCode(this.f7586b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f7585a + ", configFlags=" + this.f7586b + ')';
        }
    }

    /* renamed from: H0.b$b, reason: collision with other inner class name */
    public static final class C0305b {

        /* renamed from: a, reason: collision with root package name */
        private final Resources.Theme f7587a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7588b;

        public C0305b(Resources.Theme theme, int i10) {
            this.f7587a = theme;
            this.f7588b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0305b)) {
                return false;
            }
            C0305b c0305b = (C0305b) obj;
            return AbstractC6492s.d(this.f7587a, c0305b.f7587a) && this.f7588b == c0305b.f7588b;
        }

        public int hashCode() {
            return (this.f7587a.hashCode() * 31) + Integer.hashCode(this.f7588b);
        }

        public String toString() {
            return "Key(theme=" + this.f7587a + ", id=" + this.f7588b + ')';
        }
    }

    public final void a() {
        this.f7584a.clear();
    }

    public final a b(C0305b c0305b) {
        WeakReference weakReference = (WeakReference) this.f7584a.get(c0305b);
        if (weakReference != null) {
            return (a) weakReference.get();
        }
        return null;
    }

    public final void c(int i10) {
        Iterator it = this.f7584a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(i10, aVar.a())) {
                it.remove();
            }
        }
    }

    public final void d(C0305b c0305b, a aVar) {
        this.f7584a.put(c0305b, new WeakReference(aVar));
    }
}
