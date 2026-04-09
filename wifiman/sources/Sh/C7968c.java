package sh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: sh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7968c extends AbstractC7966a implements InterfaceC7971f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f61618e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final C7968c f61619f = new C7968c(1, 0);

    /* renamed from: sh.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C7968c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7968c) {
            if (!isEmpty() || !((C7968c) obj).isEmpty()) {
                C7968c c7968c = (C7968c) obj;
                if (i() != c7968c.i() || j() != c7968c.j()) {
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
        return (i() * 31) + j();
    }

    @Override // sh.InterfaceC7971f
    public boolean isEmpty() {
        return AbstractC6492s.k(i(), j()) > 0;
    }

    @Override // sh.InterfaceC7971f
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Character g() {
        return Character.valueOf(j());
    }

    @Override // sh.InterfaceC7971f
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Character e() {
        return Character.valueOf(i());
    }

    public String toString() {
        return i() + ".." + j();
    }
}
