package bj;

import Vi.InterfaceC3627a;
import Xi.m;
import aj.AbstractC3868b;
import aj.C3873g;
import aj.InterfaceC3875i;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public class E extends Yi.a implements InterfaceC3875i {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3868b f33407b;

    /* renamed from: c, reason: collision with root package name */
    private final M f33408c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4118a f33409d;

    /* renamed from: e, reason: collision with root package name */
    private final cj.e f33410e;

    /* renamed from: f, reason: collision with root package name */
    private int f33411f;

    /* renamed from: g, reason: collision with root package name */
    private a f33412g;

    /* renamed from: h, reason: collision with root package name */
    private final C3873g f33413h;

    /* renamed from: i, reason: collision with root package name */
    private final q f33414i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f33415a;

        public a(String str) {
            this.f33415a = str;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33416a;

        static {
            int[] iArr = new int[M.values().length];
            try {
                iArr[M.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[M.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[M.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[M.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f33416a = iArr;
        }
    }

    public E(AbstractC3868b json, M mode, AbstractC4118a lexer, Xi.f descriptor, a aVar) {
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(mode, "mode");
        AbstractC6492s.i(lexer, "lexer");
        AbstractC6492s.i(descriptor, "descriptor");
        this.f33407b = json;
        this.f33408c = mode;
        this.f33409d = lexer;
        this.f33410e = json.a();
        this.f33411f = -1;
        this.f33412g = aVar;
        C3873g c3873gE = json.e();
        this.f33413h = c3873gE;
        this.f33414i = c3873gE.j() ? null : new q(descriptor);
    }

    private final void L() {
        if (this.f33409d.F() != 4) {
            return;
        }
        AbstractC4118a.z(this.f33409d, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean M(Xi.f fVar, int i10) {
        String strG;
        AbstractC3868b abstractC3868b = this.f33407b;
        boolean zJ = fVar.j(i10);
        Xi.f fVarI = fVar.i(i10);
        if (zJ && !fVarI.c() && this.f33409d.N(true)) {
            return true;
        }
        if (AbstractC6492s.d(fVarI.h(), m.b.f24469a) && ((!fVarI.c() || !this.f33409d.N(false)) && (strG = this.f33409d.G(this.f33413h.q())) != null)) {
            int i11 = t.i(fVarI, abstractC3868b, strG);
            boolean z10 = !abstractC3868b.e().j() && fVarI.c();
            if (i11 == -3 && (zJ || z10)) {
                this.f33409d.q();
                return true;
            }
        }
        return false;
    }

    private final int N() {
        boolean zM = this.f33409d.M();
        if (!this.f33409d.f()) {
            if (!zM || this.f33407b.e().d()) {
                return -1;
            }
            r.f(this.f33409d, "array");
            throw new KotlinNothingValueException();
        }
        int i10 = this.f33411f;
        if (i10 != -1 && !zM) {
            AbstractC4118a.z(this.f33409d, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = i10 + 1;
        this.f33411f = i11;
        return i11;
    }

    private final int O() {
        int i10 = this.f33411f;
        boolean zM = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.f33409d.m(':');
        } else if (i10 != -1) {
            zM = this.f33409d.M();
        }
        if (!this.f33409d.f()) {
            if (!zM || this.f33407b.e().d()) {
                return -1;
            }
            r.g(this.f33409d, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z10) {
            if (this.f33411f == -1) {
                AbstractC4118a abstractC4118a = this.f33409d;
                int i11 = abstractC4118a.f33431a;
                if (zM) {
                    AbstractC4118a.z(abstractC4118a, "Unexpected leading comma", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                AbstractC4118a abstractC4118a2 = this.f33409d;
                int i12 = abstractC4118a2.f33431a;
                if (!zM) {
                    AbstractC4118a.z(abstractC4118a2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i13 = this.f33411f + 1;
        this.f33411f = i13;
        return i13;
    }

    private final int P(Xi.f fVar) {
        int i10;
        boolean zM;
        boolean zM2 = this.f33409d.M();
        while (true) {
            boolean z10 = true;
            if (!this.f33409d.f()) {
                if (zM2 && !this.f33407b.e().d()) {
                    r.g(this.f33409d, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                q qVar = this.f33414i;
                if (qVar != null) {
                    return qVar.d();
                }
                return -1;
            }
            String strQ = Q();
            this.f33409d.m(':');
            i10 = t.i(fVar, this.f33407b, strQ);
            if (i10 == -3) {
                zM = false;
            } else {
                if (!this.f33413h.g() || !M(fVar, i10)) {
                    break;
                }
                zM = this.f33409d.M();
                z10 = false;
            }
            zM2 = z10 ? R(fVar, strQ) : zM;
        }
        q qVar2 = this.f33414i;
        if (qVar2 != null) {
            qVar2.c(i10);
        }
        return i10;
    }

    private final String Q() {
        return this.f33413h.q() ? this.f33409d.t() : this.f33409d.j();
    }

    private final boolean R(Xi.f fVar, String str) {
        if (t.m(fVar, this.f33407b) || T(this.f33412g, str)) {
            this.f33409d.I(this.f33413h.q());
        } else {
            this.f33409d.f33432b.b();
            this.f33409d.A(str);
        }
        return this.f33409d.M();
    }

    private final void S(Xi.f fVar) {
        while (k(fVar) != -1) {
        }
    }

    private final boolean T(a aVar, String str) {
        if (aVar == null || !AbstractC6492s.d(aVar.f33415a, str)) {
            return false;
        }
        aVar.f33415a = null;
        return true;
    }

    @Override // Yi.a, Yi.e
    public byte D() {
        long jN = this.f33409d.n();
        byte b10 = (byte) jN;
        if (jN == b10) {
            return b10;
        }
        AbstractC4118a.z(this.f33409d, "Failed to parse byte for input '" + jN + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // Yi.a, Yi.e
    public short F() {
        long jN = this.f33409d.n();
        short s10 = (short) jN;
        if (jN == s10) {
            return s10;
        }
        AbstractC4118a.z(this.f33409d, "Failed to parse short for input '" + jN + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // Yi.a, Yi.e
    public float G() throws NumberFormatException {
        AbstractC4118a abstractC4118a = this.f33409d;
        String strS = abstractC4118a.s();
        try {
            float f10 = Float.parseFloat(strS);
            if (this.f33407b.e().b() || !(Float.isInfinite(f10) || Float.isNaN(f10))) {
                return f10;
            }
            r.j(this.f33409d, Float.valueOf(f10));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractC4118a.z(abstractC4118a, "Failed to parse type 'float' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // Yi.a, Yi.e
    public double I() throws NumberFormatException {
        AbstractC4118a abstractC4118a = this.f33409d;
        String strS = abstractC4118a.s();
        try {
            double d10 = Double.parseDouble(strS);
            if (this.f33407b.e().b() || !(Double.isInfinite(d10) || Double.isNaN(d10))) {
                return d10;
            }
            r.j(this.f33409d, Double.valueOf(d10));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractC4118a.z(abstractC4118a, "Failed to parse type 'double' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // Yi.c
    public cj.e a() {
        return this.f33410e;
    }

    @Override // Yi.a, Yi.c
    public void b(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (descriptor.e() == 0 && t.m(descriptor, this.f33407b)) {
            S(descriptor);
        }
        if (this.f33409d.M() && !this.f33407b.e().d()) {
            r.f(this.f33409d, "");
            throw new KotlinNothingValueException();
        }
        this.f33409d.m(this.f33408c.end);
        this.f33409d.f33432b.b();
    }

    @Override // Yi.a, Yi.e
    public Yi.c c(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        M mB = N.b(this.f33407b, descriptor);
        this.f33409d.f33432b.c(descriptor);
        this.f33409d.m(mB.begin);
        L();
        int i10 = b.f33416a[mB.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new E(this.f33407b, mB, this.f33409d, descriptor, this.f33412g) : (this.f33408c == mB && this.f33407b.e().j()) ? this : new E(this.f33407b, mB, this.f33409d, descriptor, this.f33412g);
    }

    @Override // aj.InterfaceC3875i
    public final AbstractC3868b d() {
        return this.f33407b;
    }

    @Override // Yi.a, Yi.e
    public int e(Xi.f enumDescriptor) {
        AbstractC6492s.i(enumDescriptor, "enumDescriptor");
        return t.j(enumDescriptor, this.f33407b, s(), " at path " + this.f33409d.f33432b.a());
    }

    @Override // Yi.a, Yi.e
    public boolean f() {
        return this.f33409d.h();
    }

    @Override // Yi.a, Yi.e
    public char g() {
        String strS = this.f33409d.s();
        if (strS.length() == 1) {
            return strS.charAt(0);
        }
        AbstractC4118a.z(this.f33409d, "Expected single char, but got '" + strS + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // Yi.c
    public int k(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        int i10 = b.f33416a[this.f33408c.ordinal()];
        int iN = i10 != 2 ? i10 != 4 ? N() : P(descriptor) : O();
        if (this.f33408c != M.MAP) {
            this.f33409d.f33432b.g(iN);
        }
        return iN;
    }

    @Override // Yi.a, Yi.e
    public Yi.e l(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        return G.b(descriptor) ? new p(this.f33409d, this.f33407b) : super.l(descriptor);
    }

    @Override // aj.InterfaceC3875i
    public aj.j m() {
        return new C(this.f33407b.e(), this.f33409d).e();
    }

    @Override // Yi.a, Yi.e
    public int n() {
        long jN = this.f33409d.n();
        int i10 = (int) jN;
        if (jN == i10) {
            return i10;
        }
        AbstractC4118a.z(this.f33409d, "Failed to parse int for input '" + jN + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // Yi.a, Yi.c
    public Object p(Xi.f descriptor, int i10, InterfaceC3627a deserializer, Object obj) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(deserializer, "deserializer");
        boolean z10 = this.f33408c == M.MAP && (i10 & 1) == 0;
        if (z10) {
            this.f33409d.f33432b.d();
        }
        Object objP = super.p(descriptor, i10, deserializer, obj);
        if (z10) {
            this.f33409d.f33432b.f(objP);
        }
        return objP;
    }

    @Override // Yi.a, Yi.e
    public Void r() {
        return null;
    }

    @Override // Yi.a, Yi.e
    public String s() {
        return this.f33413h.q() ? this.f33409d.t() : this.f33409d.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015a  */
    @Override // Yi.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object t(Vi.InterfaceC3627a r12) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.E.t(Vi.a):java.lang.Object");
    }

    @Override // Yi.a, Yi.e
    public long v() {
        return this.f33409d.n();
    }

    @Override // Yi.a, Yi.e
    public boolean y() {
        q qVar = this.f33414i;
        return ((qVar != null ? qVar.b() : false) || AbstractC4118a.O(this.f33409d, false, 1, null)) ? false : true;
    }
}
