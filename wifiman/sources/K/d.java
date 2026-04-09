package K;

import F.w0;
import L0.S;
import L0.T;
import Zg.AbstractC3689v;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final b f10240i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    private static final InterfaceC4182k f10241j = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f10242a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10243b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10244c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10245d;

    /* renamed from: e, reason: collision with root package name */
    private final long f10246e;

    /* renamed from: f, reason: collision with root package name */
    private final long f10247f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10248g;

    /* renamed from: h, reason: collision with root package name */
    private final K.b f10249h;

    public static final class a implements InterfaceC4182k {
        a() {
        }

        @Override // c0.InterfaceC4182k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a(Object obj) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            AbstractC6492s.g(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            AbstractC6492s.g(obj4, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj4;
            Object obj5 = list.get(3);
            AbstractC6492s.g(obj5, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            AbstractC6492s.g(obj6, "null cannot be cast to non-null type kotlin.Int");
            long jB = T.b(iIntValue2, ((Integer) obj6).intValue());
            Object obj7 = list.get(5);
            AbstractC6492s.g(obj7, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue3 = ((Integer) obj7).intValue();
            Object obj8 = list.get(6);
            AbstractC6492s.g(obj8, "null cannot be cast to non-null type kotlin.Int");
            long jB2 = T.b(iIntValue3, ((Integer) obj8).intValue());
            Object obj9 = list.get(7);
            AbstractC6492s.g(obj9, "null cannot be cast to non-null type kotlin.Long");
            return new d(iIntValue, str, str2, jB, jB2, ((Long) obj9).longValue(), false, 64, null);
        }

        @Override // c0.InterfaceC4182k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object b(InterfaceC4184m interfaceC4184m, d dVar) {
            return AbstractC3689v.o(Integer.valueOf(dVar.d()), dVar.h(), dVar.f(), Integer.valueOf(S.n(dVar.g())), Integer.valueOf(S.i(dVar.g())), Integer.valueOf(S.n(dVar.e())), Integer.valueOf(S.i(dVar.e())), Long.valueOf(dVar.j()));
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4182k a() {
            return d.f10241j;
        }

        private b() {
        }
    }

    public /* synthetic */ d(int i10, String str, String str2, long j10, long j11, long j12, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, j10, j11, j12, z10);
    }

    public final boolean b() {
        return this.f10248g;
    }

    public final K.a c() {
        if (this.f10249h == K.b.Delete && S.h(this.f10246e)) {
            return S.h(this.f10245d) ? S.n(this.f10245d) > S.n(this.f10246e) ? K.a.Start : K.a.End : (S.n(this.f10245d) == S.n(this.f10246e) && S.n(this.f10245d) == this.f10242a) ? K.a.Inner : K.a.NotByUser;
        }
        return K.a.NotByUser;
    }

    public final int d() {
        return this.f10242a;
    }

    public final long e() {
        return this.f10246e;
    }

    public final String f() {
        return this.f10244c;
    }

    public final long g() {
        return this.f10245d;
    }

    public final String h() {
        return this.f10243b;
    }

    public final K.b i() {
        return this.f10249h;
    }

    public final long j() {
        return this.f10247f;
    }

    private d(int i10, String str, String str2, long j10, long j11, long j12, boolean z10) {
        this.f10242a = i10;
        this.f10243b = str;
        this.f10244c = str2;
        this.f10245d = j10;
        this.f10246e = j11;
        this.f10247f = j12;
        this.f10248g = z10;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.f10249h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? K.b.Replace : K.b.Delete : K.b.Insert;
    }

    public /* synthetic */ d(int i10, String str, String str2, long j10, long j11, long j12, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, j10, j11, (i11 & 32) != 0 ? w0.a() : j12, (i11 & 64) != 0 ? true : z10, null);
    }
}
