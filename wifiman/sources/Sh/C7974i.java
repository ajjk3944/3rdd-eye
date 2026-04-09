package sh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: sh.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7974i extends C7972g implements InterfaceC7971f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f61630e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final C7974i f61631f = new C7974i(1, 0);

    /* renamed from: sh.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7974i a() {
            return C7974i.f61631f;
        }

        private a() {
        }
    }

    public C7974i(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // sh.C7972g
    public boolean equals(Object obj) {
        if (obj instanceof C7974i) {
            if (!isEmpty() || !((C7974i) obj).isEmpty()) {
                C7974i c7974i = (C7974i) obj;
                if (i() != c7974i.i() || j() != c7974i.j()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // sh.C7972g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (i() * 31) + j();
    }

    @Override // sh.C7972g, sh.InterfaceC7971f
    public boolean isEmpty() {
        return i() > j();
    }

    @Override // sh.C7972g
    public String toString() {
        return i() + ".." + j();
    }

    public boolean u(int i10) {
        return i() <= i10 && i10 <= j();
    }

    @Override // sh.InterfaceC7971f
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Integer g() {
        return Integer.valueOf(j());
    }

    @Override // sh.InterfaceC7971f
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Integer e() {
        return Integer.valueOf(i());
    }
}
