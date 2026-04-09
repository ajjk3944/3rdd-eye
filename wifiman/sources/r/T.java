package r;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C7033y;

/* loaded from: classes.dex */
public final class T implements D {

    /* renamed from: a, reason: collision with root package name */
    private final b f59538a;

    public static final class a extends S {

        /* renamed from: c, reason: collision with root package name */
        private int f59539c;

        public /* synthetic */ a(Object obj, E e10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, e10, i10);
        }

        public final int d() {
            return this.f59539c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(aVar.b(), b()) && AbstractC6492s.d(aVar.a(), a()) && AbstractC7544t.c(aVar.f59539c, this.f59539c);
        }

        public int hashCode() {
            Object objB = b();
            return ((((objB != null ? objB.hashCode() : 0) * 31) + AbstractC7544t.d(this.f59539c)) * 31) + a().hashCode();
        }

        public /* synthetic */ a(Object obj, E e10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i11 & 2) != 0 ? G.d() : e10, (i11 & 4) != 0 ? AbstractC7544t.f59860a.a() : i10, null);
        }

        private a(Object obj, E e10, int i10) {
            super(obj, e10, null);
            this.f59539c = i10;
        }
    }

    public static final class b extends U {
        public b() {
            super(null);
        }

        public a f(Object obj, int i10) {
            a aVar = new a(obj, null, 0, 6, null);
            c().t(i10, aVar);
            return aVar;
        }
    }

    public T(b bVar) {
        this.f59538a = bVar;
    }

    @Override // r.H, r.InterfaceC7533i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public E0 a(s0 s0Var) {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i10;
        C7033y c7033y = new C7033y(this.f59538a.c().e() + 2);
        o.z zVar = new o.z(this.f59538a.c().e());
        o.z zVarC = this.f59538a.c();
        int[] iArr3 = zVarC.f54982b;
        Object[] objArr = zVarC.f54983c;
        long[] jArr3 = zVarC.f54981a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            a aVar = (a) objArr[i15];
                            c7033y.h(i16);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            zVar.t(i16, new D0((AbstractC7542q) s0Var.a().invoke(aVar.b()), aVar.a(), aVar.d(), null));
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.f59538a.c().a(0)) {
            c7033y.g(0, 0);
        }
        if (!this.f59538a.c().a(this.f59538a.b())) {
            c7033y.h(this.f59538a.b());
        }
        c7033y.n();
        return new E0(c7033y, zVar, this.f59538a.b(), this.f59538a.a(), G.d(), AbstractC7544t.f59860a.a(), null);
    }
}
