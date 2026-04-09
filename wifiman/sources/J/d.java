package J;

import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final a f9371e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final d f9372f = new d(false, C6531g.f52335b.b(), W0.i.Ltr, false, null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9373a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9374b;

    /* renamed from: c, reason: collision with root package name */
    private final W0.i f9375c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9376d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return d.f9372f;
        }

        private a() {
        }
    }

    public /* synthetic */ d(boolean z10, long j10, W0.i iVar, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, j10, iVar, z11);
    }

    public final W0.i b() {
        return this.f9375c;
    }

    public final boolean c() {
        return this.f9376d;
    }

    public final long d() {
        return this.f9374b;
    }

    public final boolean e() {
        return this.f9373a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9373a == dVar.f9373a && C6531g.j(this.f9374b, dVar.f9374b) && this.f9375c == dVar.f9375c && this.f9376d == dVar.f9376d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f9373a) * 31) + C6531g.o(this.f9374b)) * 31) + this.f9375c.hashCode()) * 31) + Boolean.hashCode(this.f9376d);
    }

    public String toString() {
        return "TextFieldHandleState(visible=" + this.f9373a + ", position=" + ((Object) C6531g.t(this.f9374b)) + ", direction=" + this.f9375c + ", handlesCrossed=" + this.f9376d + ')';
    }

    private d(boolean z10, long j10, W0.i iVar, boolean z11) {
        this.f9373a = z10;
        this.f9374b = j10;
        this.f9375c = iVar;
        this.f9376d = z11;
    }
}
