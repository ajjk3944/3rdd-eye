package B;

import mh.InterfaceC6835l;

/* renamed from: B.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2440d {

    /* renamed from: B.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f936a;

        /* renamed from: b, reason: collision with root package name */
        private final int f937b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f938c;

        public a(int i10, int i11, Object obj) {
            this.f936a = i10;
            this.f937b = i11;
            this.f938c = obj;
            if (i10 < 0) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i10).toString());
            }
            if (i11 > 0) {
                return;
            }
            throw new IllegalArgumentException(("size should be >0, but was " + i11).toString());
        }

        public final int a() {
            return this.f937b;
        }

        public final int b() {
            return this.f936a;
        }

        public final Object c() {
            return this.f938c;
        }
    }

    int a();

    void b(int i10, int i11, InterfaceC6835l interfaceC6835l);

    a get(int i10);
}
