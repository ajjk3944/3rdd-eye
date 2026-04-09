package M;

import L0.T;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: M.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3243l {

    /* renamed from: a, reason: collision with root package name */
    private final a f12217a;

    /* renamed from: b, reason: collision with root package name */
    private final a f12218b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12219c;

    /* renamed from: M.l$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final W0.i f12220a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12221b;

        /* renamed from: c, reason: collision with root package name */
        private final long f12222c;

        public a(W0.i iVar, int i10, long j10) {
            this.f12220a = iVar;
            this.f12221b = i10;
            this.f12222c = j10;
        }

        public static /* synthetic */ a b(a aVar, W0.i iVar, int i10, long j10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iVar = aVar.f12220a;
            }
            if ((i11 & 2) != 0) {
                i10 = aVar.f12221b;
            }
            if ((i11 & 4) != 0) {
                j10 = aVar.f12222c;
            }
            return aVar.a(iVar, i10, j10);
        }

        public final a a(W0.i iVar, int i10, long j10) {
            return new a(iVar, i10, j10);
        }

        public final int c() {
            return this.f12221b;
        }

        public final long d() {
            return this.f12222c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12220a == aVar.f12220a && this.f12221b == aVar.f12221b && this.f12222c == aVar.f12222c;
        }

        public int hashCode() {
            return (((this.f12220a.hashCode() * 31) + Integer.hashCode(this.f12221b)) * 31) + Long.hashCode(this.f12222c);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.f12220a + ", offset=" + this.f12221b + ", selectableId=" + this.f12222c + ')';
        }
    }

    public C3243l(a aVar, a aVar2, boolean z10) {
        this.f12217a = aVar;
        this.f12218b = aVar2;
        this.f12219c = z10;
    }

    public static /* synthetic */ C3243l b(C3243l c3243l, a aVar, a aVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = c3243l.f12217a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = c3243l.f12218b;
        }
        if ((i10 & 4) != 0) {
            z10 = c3243l.f12219c;
        }
        return c3243l.a(aVar, aVar2, z10);
    }

    public final C3243l a(a aVar, a aVar2, boolean z10) {
        return new C3243l(aVar, aVar2, z10);
    }

    public final a c() {
        return this.f12218b;
    }

    public final boolean d() {
        return this.f12219c;
    }

    public final a e() {
        return this.f12217a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3243l)) {
            return false;
        }
        C3243l c3243l = (C3243l) obj;
        return AbstractC6492s.d(this.f12217a, c3243l.f12217a) && AbstractC6492s.d(this.f12218b, c3243l.f12218b) && this.f12219c == c3243l.f12219c;
    }

    public final long f() {
        return T.b(this.f12217a.c(), this.f12218b.c());
    }

    public int hashCode() {
        return (((this.f12217a.hashCode() * 31) + this.f12218b.hashCode()) * 31) + Boolean.hashCode(this.f12219c);
    }

    public String toString() {
        return "Selection(start=" + this.f12217a + ", end=" + this.f12218b + ", handlesCrossed=" + this.f12219c + ')';
    }
}
