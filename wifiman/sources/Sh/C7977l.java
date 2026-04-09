package sh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: sh.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7977l extends AbstractC7975j implements InterfaceC7971f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f61640e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final C7977l f61641f = new C7977l(1, 0);

    /* renamed from: sh.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7977l a() {
            return C7977l.f61641f;
        }

        private a() {
        }
    }

    public C7977l(long j10, long j11) {
        super(j10, j11, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7977l) {
            if (!isEmpty() || !((C7977l) obj).isEmpty()) {
                C7977l c7977l = (C7977l) obj;
                if (i() != c7977l.i() || j() != c7977l.j()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (i() ^ (i() >>> 32))) + (j() ^ (j() >>> 32)));
    }

    @Override // sh.InterfaceC7971f
    public boolean isEmpty() {
        return i() > j();
    }

    @Override // sh.InterfaceC7971f
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Long g() {
        return Long.valueOf(j());
    }

    public String toString() {
        return i() + ".." + j();
    }

    @Override // sh.InterfaceC7971f
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Long e() {
        return Long.valueOf(i());
    }
}
