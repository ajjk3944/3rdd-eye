package b1;

import f1.C5492a;
import f1.C5493b;
import f1.C5494c;
import g1.AbstractC5844b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: b1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4052i {

    /* renamed from: a, reason: collision with root package name */
    private final List f32732a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final androidx.constraintlayout.core.parser.d f32733b;

    /* renamed from: c, reason: collision with root package name */
    private int f32734c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32735d;

    /* renamed from: e, reason: collision with root package name */
    private int f32736e;

    /* renamed from: b1.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f32737a;

        /* renamed from: b, reason: collision with root package name */
        private final x f32738b;

        public a(Object obj, x xVar) {
            this.f32737a = obj;
            this.f32738b = xVar;
        }

        public final Object a() {
            return this.f32737a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f32737a, aVar.f32737a) && AbstractC6492s.d(this.f32738b, aVar.f32738b);
        }

        public int hashCode() {
            return (this.f32737a.hashCode() * 31) + this.f32738b.hashCode();
        }

        public String toString() {
            return "BaselineAnchor(id=" + this.f32737a + ", reference=" + this.f32738b + ')';
        }
    }

    /* renamed from: b1.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Object f32739a;

        /* renamed from: b, reason: collision with root package name */
        private final int f32740b;

        /* renamed from: c, reason: collision with root package name */
        private final x f32741c;

        public b(Object obj, int i10, x xVar) {
            this.f32739a = obj;
            this.f32740b = i10;
            this.f32741c = xVar;
        }

        public final Object a() {
            return this.f32739a;
        }

        public final int b() {
            return this.f32740b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f32739a, bVar.f32739a) && this.f32740b == bVar.f32740b && AbstractC6492s.d(this.f32741c, bVar.f32741c);
        }

        public int hashCode() {
            return (((this.f32739a.hashCode() * 31) + Integer.hashCode(this.f32740b)) * 31) + this.f32741c.hashCode();
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.f32739a + ", index=" + this.f32740b + ", reference=" + this.f32741c + ')';
        }
    }

    /* renamed from: b1.i$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f32742a;

        /* renamed from: b, reason: collision with root package name */
        private final int f32743b;

        /* renamed from: c, reason: collision with root package name */
        private final x f32744c;

        public c(Object obj, int i10, x xVar) {
            this.f32742a = obj;
            this.f32743b = i10;
            this.f32744c = xVar;
        }

        public final Object a() {
            return this.f32742a;
        }

        public final int b() {
            return this.f32743b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f32742a, cVar.f32742a) && this.f32743b == cVar.f32743b && AbstractC6492s.d(this.f32744c, cVar.f32744c);
        }

        public int hashCode() {
            return (((this.f32742a.hashCode() * 31) + Integer.hashCode(this.f32743b)) * 31) + this.f32744c.hashCode();
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.f32742a + ", index=" + this.f32743b + ", reference=" + this.f32744c + ')';
        }
    }

    public AbstractC4052i(androidx.constraintlayout.core.parser.d dVar) {
        androidx.constraintlayout.core.parser.d dVarG0;
        this.f32733b = (dVar == null || (dVarG0 = dVar.clone()) == null) ? new androidx.constraintlayout.core.parser.d(new char[0]) : dVarG0;
        this.f32735d = 1000;
        this.f32736e = 1000;
    }

    private final int d() {
        int i10 = this.f32736e;
        this.f32736e = i10 + 1;
        return i10;
    }

    private final void g(int i10) {
        this.f32734c = ((this.f32734c * 1009) + i10) % 1000000007;
    }

    public final void a(C4040B c4040b) {
        AbstractC5844b.v(this.f32733b, c4040b, new AbstractC5844b.d());
    }

    public final androidx.constraintlayout.core.parser.d b(x xVar) {
        String string = xVar.a().toString();
        if (this.f32733b.Q(string) == null) {
            this.f32733b.a0(string, new androidx.constraintlayout.core.parser.d(new char[0]));
        }
        return this.f32733b.O(string);
    }

    public final c c(float f10) {
        y yVar = new y(Integer.valueOf(d()));
        C5492a c5492a = new C5492a(new char[0]);
        c5492a.x(C5494c.x("start"));
        c5492a.x(new C5493b(f10));
        androidx.constraintlayout.core.parser.d dVarB = b(yVar);
        dVarB.e0("type", "vGuideline");
        dVarB.a0("percent", c5492a);
        g(3);
        g(Float.hashCode(f10));
        return new c(yVar.a(), 0, yVar);
    }

    public final int e() {
        return this.f32734c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC4052i) {
            return AbstractC6492s.d(this.f32733b, ((AbstractC4052i) obj).f32733b);
        }
        return false;
    }

    public void f() {
        this.f32733b.clear();
        this.f32736e = this.f32735d;
        this.f32734c = 0;
    }

    public int hashCode() {
        return this.f32733b.hashCode();
    }
}
