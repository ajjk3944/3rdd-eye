package q9;

import kotlin.jvm.internal.i;

/* loaded from: classes4.dex */
public final class c extends q9.a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f24092e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final c f24093f = new c(1, 0);

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c a() {
            return c.f24093f;
        }

        public a() {
        }
    }

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // q9.a
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return c() == cVar.c() && d() == cVar.d();
    }

    public boolean h(int i10) {
        return c() <= i10 && i10 <= d();
    }

    @Override // q9.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c() * 31) + d();
    }

    public Integer i() {
        return Integer.valueOf(d());
    }

    @Override // q9.a
    public boolean isEmpty() {
        return c() > d();
    }

    public Integer j() {
        return Integer.valueOf(c());
    }

    @Override // q9.a
    public String toString() {
        return c() + ".." + d();
    }
}
