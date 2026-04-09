package ag;

import bg.d;
import cg.InterfaceC4257a;
import cg.InterfaceC4258b;
import cg.InterfaceC4259c;
import dg.InterfaceC5372b;
import dg.InterfaceC5373c;
import dg.InterfaceC5374d;
import dg.InterfaceC5375e;
import inet.ipaddr.HostIdentifierException;
import inet.ipaddr.PrefixLenException;
import inet.ipaddr.c;
import inet.ipaddr.j;
import java.math.BigInteger;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

/* renamed from: ag.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3846d implements InterfaceC3847e {

    /* renamed from: g, reason: collision with root package name */
    protected static final Integer f26211g = -1;

    /* renamed from: h, reason: collision with root package name */
    static final BigInteger f26212h = BigInteger.ZERO.not();

    /* renamed from: i, reason: collision with root package name */
    protected static BigInteger f26213i = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: j, reason: collision with root package name */
    static ResourceBundle f26214j;

    /* renamed from: a, reason: collision with root package name */
    protected transient g f26215a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3844b[] f26216b;

    /* renamed from: c, reason: collision with root package name */
    protected Integer f26217c;

    /* renamed from: d, reason: collision with root package name */
    private transient Boolean f26218d;

    /* renamed from: e, reason: collision with root package name */
    private transient BigInteger f26219e;

    /* renamed from: f, reason: collision with root package name */
    protected transient int f26220f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ag.d$a */
    public static class a extends AbstractC3850h implements e {

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC3843a f26221g;

        /* renamed from: h, reason: collision with root package name */
        private Iterator f26222h;

        /* renamed from: i, reason: collision with root package name */
        private InterfaceC3843a f26223i;

        /* renamed from: j, reason: collision with root package name */
        private InterfaceC3843a f26224j;

        /* renamed from: k, reason: collision with root package name */
        protected final InterfaceC1014d f26225k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f26226l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f26227m;

        /* renamed from: n, reason: collision with root package name */
        private Function f26228n;

        /* renamed from: o, reason: collision with root package name */
        private Predicate f26229o;

        /* renamed from: p, reason: collision with root package name */
        private final ToLongFunction f26230p;

        /* renamed from: q, reason: collision with root package name */
        private long f26231q;

        /* renamed from: r, reason: collision with root package name */
        private BigInteger f26232r;

        /* renamed from: s, reason: collision with root package name */
        final Predicate f26233s;

        protected a(InterfaceC3843a interfaceC3843a, Predicate predicate, InterfaceC1014d interfaceC1014d, Function function, Predicate predicate2, ToLongFunction toLongFunction) {
            this(interfaceC3843a, predicate, interfaceC1014d, true, true, function, predicate2, toLongFunction);
            p();
        }

        private BigInteger h() {
            return j().subtract(this.f26257d);
        }

        private long i() {
            return k() - this.f26269a;
        }

        private BigInteger j() {
            BigInteger bigInteger = this.f26232r;
            if (bigInteger != null) {
                return bigInteger;
            }
            BigInteger bigInteger2 = (BigInteger) this.f26228n.apply(this.f26221g);
            this.f26232r = bigInteger2;
            return bigInteger2;
        }

        private long k() {
            long j10 = this.f26231q;
            if (j10 >= 0) {
                return j10;
            }
            long jApplyAsLong = this.f26230p.applyAsLong(this.f26221g);
            this.f26231q = jApplyAsLong;
            return jApplyAsLong;
        }

        private Iterator l() {
            if (this.f26222h == null) {
                this.f26222h = this.f26225k.a(this.f26226l, this.f26227m, this.f26221g);
            }
            return this.f26222h;
        }

        @Override // ag.m, java.util.Spliterator
        public int characteristics() {
            if (this.f26256c) {
                return 4373;
            }
            return super.characteristics();
        }

        @Override // java.util.Spliterator
        public long estimateSize() {
            if (!this.f26256c) {
                return i();
            }
            if (h().compareTo(AbstractC3846d.f26213i) <= 0) {
                return h().longValue();
            }
            return Long.MAX_VALUE;
        }

        protected boolean f() {
            if (this.f26270b) {
                return false;
            }
            if (this.f26256c) {
                if (this.f26257d.compareTo(j().shiftRight(1)) >= 0) {
                    return false;
                }
            } else if (this.f26269a >= (k() >> 1)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            if (this.f26270b) {
                return;
            }
            this.f26270b = true;
            try {
                if (this.f26256c) {
                    e(l(), consumer, j());
                } else {
                    c(l(), consumer, k());
                }
                this.f26270b = false;
            } catch (Throwable th2) {
                this.f26270b = false;
                throw th2;
            }
        }

        protected abstract a g(InterfaceC3843a interfaceC3843a, boolean z10, Function function, Predicate predicate, ToLongFunction toLongFunction);

        @Override // ag.AbstractC3846d.e
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC3843a interfaceC3843a, InterfaceC3843a interfaceC3843a2) {
            this.f26223i = interfaceC3843a;
            this.f26224j = interfaceC3843a2;
        }

        protected boolean n() {
            return this.f26233s.test(this);
        }

        @Override // java.util.Spliterator
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a trySplit() {
            BigInteger bigInteger;
            if (!f() || !n()) {
                return null;
            }
            boolean z10 = true;
            if (!this.f26256c ? this.f26269a <= 0 : this.f26257d.signum() <= 0) {
                z10 = false;
            }
            long jApplyAsLong = -1;
            if (!z10) {
                bigInteger = null;
            } else if (this.f26256c) {
                bigInteger = (BigInteger) this.f26228n.apply(this.f26223i);
                if (this.f26257d.compareTo(bigInteger) >= 0) {
                    return null;
                }
            } else {
                jApplyAsLong = this.f26230p.applyAsLong(this.f26223i);
                if (this.f26269a >= jApplyAsLong) {
                    return null;
                }
                bigInteger = null;
            }
            a aVarG = g(this.f26223i, this.f26226l, this.f26228n, this.f26229o, this.f26230p);
            if (z10) {
                if (this.f26256c) {
                    if (aVarG.f26256c) {
                        aVarG.f26257d = this.f26257d;
                    } else {
                        aVarG.f26269a = this.f26257d.longValue();
                    }
                    this.f26257d = BigInteger.ZERO;
                } else {
                    aVarG.f26269a = this.f26269a;
                    this.f26269a = 0L;
                }
                aVarG.f26222h = this.f26222h;
                this.f26222h = null;
                aVarG.f26232r = bigInteger;
                aVarG.f26231q = jApplyAsLong;
            }
            this.f26221g = this.f26224j;
            this.f26226l = false;
            p();
            return aVarG;
        }

        void p() {
            if (this.f26228n != null) {
                Predicate predicate = this.f26229o;
                boolean z10 = predicate == null || !predicate.test(this.f26221g);
                this.f26256c = z10;
                if (!z10) {
                    this.f26228n = null;
                    this.f26229o = null;
                }
            } else {
                this.f26256c = false;
            }
            this.f26231q = -1L;
            this.f26232r = null;
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            if (this.f26270b) {
                return false;
            }
            if (!this.f26256c ? this.f26269a < k() : !(this.f26257d.signum() > 0 && this.f26257d.compareTo(j()) >= 0)) {
                return false;
            }
            return d(l(), consumer);
        }

        @Override // ag.AbstractC3846d.e
        public InterfaceC3843a a() {
            return this.f26221g;
        }

        protected a(InterfaceC3843a interfaceC3843a, Predicate predicate, InterfaceC1014d interfaceC1014d, boolean z10, boolean z11, Function function, Predicate predicate2, ToLongFunction toLongFunction) {
            this.f26221g = interfaceC3843a;
            this.f26225k = interfaceC1014d;
            this.f26226l = z10;
            this.f26227m = z11;
            this.f26230p = toLongFunction;
            this.f26228n = function;
            this.f26229o = predicate2;
            this.f26233s = predicate;
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ag.d$b */
    public static class b implements InterfaceC5373c, InterfaceC5374d, Cloneable {

        /* renamed from: k, reason: collision with root package name */
        public static final d.i.b f26234k = new d.i.b();

        /* renamed from: b, reason: collision with root package name */
        protected boolean f26236b;

        /* renamed from: d, reason: collision with root package name */
        private int f26238d;

        /* renamed from: e, reason: collision with root package name */
        protected Character f26239e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f26240f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f26241g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f26242h;

        /* renamed from: j, reason: collision with root package name */
        private char f26244j;

        /* renamed from: a, reason: collision with root package name */
        private d.i.b f26235a = f26234k;

        /* renamed from: c, reason: collision with root package name */
        private String f26237c = "";

        /* renamed from: i, reason: collision with root package name */
        private String f26243i = "";

        public b(int i10, Character ch2, boolean z10, char c10) {
            if (i10 < 2 || i10 > 85) {
                throw new IllegalArgumentException();
            }
            this.f26238d = i10;
            this.f26239e = ch2;
            this.f26240f = z10;
            this.f26244j = c10;
        }

        public static void r(int i10, StringBuilder sb2) {
        }

        public Character A() {
            return this.f26239e;
        }

        /* renamed from: B */
        public abstract int c0(InterfaceC4258b interfaceC4258b);

        public int D(InterfaceC4258b interfaceC4258b, CharSequence charSequence) {
            int iC0 = c0(interfaceC4258b);
            return charSequence != null ? iC0 + E(charSequence) : iC0;
        }

        public int E(CharSequence charSequence) {
            if (charSequence == null || charSequence.length() <= 0) {
                return 0;
            }
            return charSequence.length() + 1;
        }

        public boolean F() {
            return this.f26241g;
        }

        public void G(String str) {
            this.f26243i = str;
        }

        public void H(int i10) {
            this.f26238d = i10;
        }

        public void I(boolean z10) {
            this.f26241g = z10;
        }

        public void K(String str) {
            str.getClass();
            this.f26237c = str;
        }

        public void L(Character ch2) {
            this.f26239e = ch2;
        }

        public void M(boolean z10) {
            this.f26242h = z10;
        }

        public void N(boolean z10) {
            this.f26240f = z10;
        }

        public void O(d.i.b bVar) {
            this.f26235a = bVar;
        }

        public void P(char c10) {
            this.f26244j = c10;
        }

        public String Q(InterfaceC4258b interfaceC4258b) {
            return R(interfaceC4258b, null);
        }

        public String R(InterfaceC4258b interfaceC4258b, CharSequence charSequence) {
            int iD = D(interfaceC4258b, charSequence);
            StringBuilder sb2 = new StringBuilder(iD);
            l(sb2, interfaceC4258b, charSequence);
            r(iD, sb2);
            return sb2.toString();
        }

        @Override // dg.InterfaceC5374d
        public boolean b() {
            return this.f26240f;
        }

        @Override // dg.InterfaceC5374d
        public boolean c() {
            return this.f26242h;
        }

        @Override // dg.InterfaceC5374d
        public Character d() {
            return this.f26239e;
        }

        @Override // dg.InterfaceC5374d
        public boolean e() {
            return this.f26241g;
        }

        @Override // dg.InterfaceC5374d
        public d.i.b f() {
            return this.f26235a;
        }

        @Override // dg.InterfaceC5374d
        public int h() {
            return this.f26238d;
        }

        @Override // dg.InterfaceC5374d
        public String i() {
            return this.f26237c;
        }

        public abstract StringBuilder l(StringBuilder sb2, InterfaceC4258b interfaceC4258b, CharSequence charSequence);

        public StringBuilder m(StringBuilder sb2) {
            String strW = w();
            if (strW != null && strW.length() > 0) {
                sb2.append(strW);
            }
            return sb2;
        }

        protected abstract int n(int i10, StringBuilder sb2, InterfaceC4258b interfaceC4258b);

        public StringBuilder o(StringBuilder sb2, InterfaceC4258b interfaceC4258b) {
            int iH = interfaceC4258b.H();
            if (iH != 0) {
                boolean zF = F();
                Character chA = A();
                int i10 = 0;
                while (true) {
                    n(zF ? (iH - i10) - 1 : i10, sb2, interfaceC4258b);
                    i10++;
                    if (i10 == iH) {
                        break;
                    }
                    if (chA != null) {
                        sb2.append(chA);
                    }
                }
            }
            return sb2;
        }

        public int p(InterfaceC4257a interfaceC4257a, StringBuilder sb2) {
            if (sb2 == null) {
                return x() + interfaceC4257a.j(0, this, null);
            }
            m(sb2);
            interfaceC4257a.j(0, this, sb2);
            return 0;
        }

        public StringBuilder q(StringBuilder sb2, CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > 0) {
                sb2.append(this.f26244j);
                sb2.append(charSequence);
            }
            return sb2;
        }

        public b t() {
            try {
                return (b) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        public void u(boolean z10) {
            this.f26236b = z10;
        }

        public String w() {
            return this.f26243i;
        }

        public int x() {
            String strW = w();
            if (strW != null) {
                return strW.length();
            }
            return 0;
        }

        public int z(InterfaceC4258b interfaceC4258b) {
            if (interfaceC4258b.H() == 0) {
                return 0;
            }
            int iH = interfaceC4258b.H();
            int iN = 0;
            for (int i10 = 0; i10 < iH; i10++) {
                iN += n(i10, null, interfaceC4258b);
            }
            return A() != null ? iN + (iH - 1) : iN;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ag.d$c */
    public static class c extends b implements InterfaceC5375e {

        /* renamed from: o, reason: collision with root package name */
        public static final j.g.a f26245o = j.g.a.NETWORK_ONLY;

        /* renamed from: l, reason: collision with root package name */
        private j.g.a f26246l;

        /* renamed from: m, reason: collision with root package name */
        private int[] f26247m;

        /* renamed from: n, reason: collision with root package name */
        private String f26248n;

        public c(int i10, Character ch2, boolean z10) {
            this(i10, ch2, z10, (char) 0);
        }

        public static int a0(cg.d dVar) {
            if (!dVar.i()) {
                return 0;
            }
            int iIntValue = dVar.A().intValue();
            if (iIntValue < 10) {
                return 2;
            }
            return iIntValue < 100 ? 3 : 4;
        }

        @Override // ag.AbstractC3846d.b
        /* renamed from: S */
        public StringBuilder l(StringBuilder sb2, cg.d dVar, CharSequence charSequence) {
            W(q(o(m(sb2), dVar), charSequence));
            if (!F() && !e0()) {
                U(sb2, dVar);
            }
            return sb2;
        }

        public void U(StringBuilder sb2, cg.d dVar) {
            if (dVar.i()) {
                sb2.append('/');
                sb2.append(dVar.A());
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag.AbstractC3846d.b
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public int n(int i10, StringBuilder sb2, cg.d dVar) {
            Integer numG;
            InterfaceC4259c interfaceC4259cM1 = dVar.m1(i10);
            c.b bVarD = dVar.e().d();
            return (bVarD.prefixedSubnetsAreExplicit() || e0() || (numG = interfaceC4259cM1.g()) == null || numG.intValue() >= interfaceC4259cM1.f() || (bVarD.zeroHostsAreSubnets() && !dVar.x()) || c()) ? interfaceC4259cM1.j(i10, this, sb2) : interfaceC4259cM1.u() ? interfaceC4259cM1.v(i10, this, sb2) : interfaceC4259cM1.y(i10, this, sb2);
        }

        public StringBuilder W(StringBuilder sb2) {
            String strY = Y();
            if (strY != null) {
                sb2.append(strY);
            }
            return sb2;
        }

        @Override // 
        /* renamed from: X */
        public c clone() {
            c cVar = (c) super.t();
            int[] iArr = this.f26247m;
            if (iArr != null) {
                cVar.f26247m = (int[]) iArr.clone();
            }
            return cVar;
        }

        public String Y() {
            return this.f26248n;
        }

        public int Z() {
            String strY = Y();
            if (strY != null) {
                return strY.length();
            }
            return 0;
        }

        @Override // ag.AbstractC3846d.b
        public int c0(cg.d dVar) {
            int iZ = z(dVar);
            if (!F() && !e0()) {
                iZ += a0(dVar);
            }
            return iZ + Z() + x();
        }

        public char d0() {
            return this.f26239e.charValue();
        }

        public boolean e0() {
            return this.f26246l == j.g.a.ALL;
        }

        public void f0(String str) {
            this.f26248n = str;
        }

        public void g0(j.g.a aVar) {
            this.f26246l = aVar;
        }

        @Override // dg.InterfaceC5374d
        public int k(int i10) {
            if (this.f26236b) {
                return -1;
            }
            int[] iArr = this.f26247m;
            if (iArr == null || iArr.length <= i10) {
                return 0;
            }
            return iArr[i10];
        }

        public c(int i10, Character ch2, boolean z10, char c10) {
            super(i10, ch2, z10, c10);
            this.f26246l = f26245o;
            this.f26248n = "";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ag.d$d, reason: collision with other inner class name */
    public interface InterfaceC1014d {
        Iterator a(boolean z10, boolean z11, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ag.d$e */
    public interface e {
        Object a();

        void b(Object obj, Object obj2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ag.d$f */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        InterfaceC5373c f26249a;

        protected f() {
        }
    }

    /* renamed from: ag.d$g */
    protected static class g {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f26250a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f26251b;

        /* renamed from: c, reason: collision with root package name */
        public BigInteger f26252c;

        /* renamed from: d, reason: collision with root package name */
        public BigInteger f26253d;

        /* renamed from: e, reason: collision with root package name */
        public InetAddress f26254e;

        protected g() {
        }
    }

    static {
        String str = HostIdentifierException.class.getPackage().getName() + ".IPAddressResources";
        try {
            f26214j = ResourceBundle.getBundle(str);
        } catch (MissingResourceException unused) {
            System.err.println("bundle " + str + " is missing");
        }
    }

    public AbstractC3846d(AbstractC3844b[] abstractC3844bArr) {
        this(abstractC3844bArr, true);
    }

    protected static boolean C(k kVar, int i10) {
        y(kVar, i10);
        boolean zAllPrefixedAddressesAreSubnets = kVar.e().d().allPrefixedAddressesAreSubnets();
        if (zAllPrefixedAddressesAreSubnets && kVar.i() && kVar.F0().intValue() <= i10) {
            return true;
        }
        int iH = kVar.H();
        int i11 = 0;
        int i12 = 0;
        while (i11 < iH) {
            l lVarM1 = kVar.m1(i11);
            int iF = lVarM1.f() + i12;
            if (i10 < iF) {
                if (!lVarM1.B0(Math.max(0, i10 - i12))) {
                    return false;
                }
                if (zAllPrefixedAddressesAreSubnets && lVarM1.i()) {
                    return true;
                }
                for (int i13 = i11 + 1; i13 < iH; i13++) {
                    l lVarM12 = kVar.m1(i13);
                    if (!lVarM12.w()) {
                        return false;
                    }
                    if (zAllPrefixedAddressesAreSubnets && lVarM12.i()) {
                        return true;
                    }
                }
                return true;
            }
            i11++;
            i12 = iF;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static boolean J(ag.k r8, int r9) {
        /*
            y(r8, r9)
            inet.ipaddr.i r0 = r8.e()
            inet.ipaddr.c$b r0 = r0.d()
            boolean r0 = r0.allPrefixedAddressesAreSubnets()
            r1 = 0
            if (r0 == 0) goto L23
            boolean r2 = r8.i()
            if (r2 == 0) goto L23
            java.lang.Integer r2 = r8.F0()
            int r2 = r2.intValue()
            if (r2 >= r9) goto L23
            return r1
        L23:
            int r2 = r8.H()
            r3 = r1
            r4 = r3
        L29:
            r5 = 1
            if (r3 >= r2) goto L71
            ag.l r6 = r8.m1(r3)
            int r7 = r6.f()
            int r7 = r7 + r4
            if (r9 < r7) goto L42
            boolean r4 = r6.A0()
            if (r4 == 0) goto L3e
            return r1
        L3e:
            int r3 = r3 + 1
            r4 = r7
            goto L29
        L42:
            int r9 = r9 - r4
            int r9 = java.lang.Math.max(r1, r9)
            boolean r9 = r6.u0(r9)
            if (r9 != 0) goto L4e
            return r1
        L4e:
            if (r0 == 0) goto L57
            boolean r9 = r6.i()
            if (r9 == 0) goto L57
            return r5
        L57:
            int r3 = r3 + r5
        L58:
            if (r3 >= r2) goto L71
            ag.l r9 = r8.m1(r3)
            boolean r4 = r9.w()
            if (r4 != 0) goto L65
            return r1
        L65:
            if (r0 == 0) goto L6e
            boolean r9 = r9.i()
            if (r9 == 0) goto L6e
            return r5
        L6e:
            int r3 = r3 + 1
            goto L58
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.AbstractC3846d.J(ag.k, int):boolean");
    }

    protected static InterfaceC5373c K0(f fVar) {
        return fVar.f26249a;
    }

    protected static InterfaceC5372b T(Zf.b bVar, Predicate predicate, InterfaceC1014d interfaceC1014d, Function function, Predicate predicate2, ToLongFunction toLongFunction) {
        return new j(bVar, predicate, interfaceC1014d, function, predicate2, toLongFunction);
    }

    protected static String Y0(String str) {
        ResourceBundle resourceBundle = f26214j;
        if (resourceBundle == null) {
            return str;
        }
        try {
            return resourceBundle.getString(str);
        } catch (MissingResourceException unused) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String d1(int i10) {
        return m1(i10).E1();
    }

    protected static void f1(f fVar, InterfaceC5373c interfaceC5373c) {
        fVar.f26249a = interfaceC5373c;
    }

    protected static int j(int i10, long j10, long j11) {
        return AbstractC3844b.C(i10, j10, j11);
    }

    protected static Integer s(int i10) {
        return inet.ipaddr.format.validate.g.a(i10);
    }

    protected static Integer v(k kVar) {
        int iH = kVar.H();
        if (iH <= 0 || (kVar.e().d().allPrefixedAddressesAreSubnets() && !kVar.m1(iH - 1).i())) {
            return null;
        }
        int iF = 0;
        for (int i10 = 0; i10 < iH; i10++) {
            l lVarM1 = kVar.m1(i10);
            Integer numG = lVarM1.g();
            if (numG != null) {
                return inet.ipaddr.format.validate.g.a(iF + numG.intValue());
            }
            iF += lVarM1.f();
        }
        return null;
    }

    protected static void y(InterfaceC3847e interfaceC3847e, int i10) {
        if (i10 < 0 || i10 > interfaceC3847e.f()) {
            throw new PrefixLenException(interfaceC3847e, i10);
        }
    }

    @Override // ag.InterfaceC3847e
    public abstract Integer A();

    @Override // ag.InterfaceC3849g
    public boolean A0() {
        Boolean bool = this.f26218d;
        if (bool != null) {
            return bool.booleanValue();
        }
        for (int iH = H() - 1; iH >= 0; iH--) {
            if (m1(iH).A0()) {
                this.f26218d = Boolean.TRUE;
                return true;
            }
        }
        this.f26218d = Boolean.FALSE;
        return false;
    }

    @Override // cg.InterfaceC4258b
    public int H() {
        return X0().length;
    }

    @Override // ag.InterfaceC3849g
    public boolean H0() {
        int iH = H();
        for (int i10 = 0; i10 < iH; i10++) {
            if (!m1(i10).H0()) {
                return false;
            }
        }
        return true;
    }

    @Override // ag.InterfaceC3849g
    public boolean L() {
        int iH = H();
        for (int i10 = 0; i10 < iH; i10++) {
            if (!m1(i10).L()) {
                return false;
            }
        }
        return true;
    }

    @Override // ag.InterfaceC3849g
    public boolean O() {
        int iH = H();
        for (int i10 = 0; i10 < iH; i10++) {
            if (!m1(i10).O()) {
                return false;
            }
        }
        return true;
    }

    @Override // ag.InterfaceC3849g
    public BigInteger R() {
        if (a1()) {
            g gVar = this.f26215a;
            BigInteger bigInteger = new BigInteger(1, Z0());
            gVar.f26253d = bigInteger;
            if (A0()) {
                return bigInteger;
            }
            gVar.f26252c = bigInteger;
            return bigInteger;
        }
        g gVar2 = this.f26215a;
        BigInteger bigInteger2 = gVar2.f26253d;
        if (bigInteger2 != null) {
            return bigInteger2;
        }
        if (A0()) {
            BigInteger bigInteger3 = new BigInteger(1, Z0());
            gVar2.f26253d = bigInteger3;
            return bigInteger3;
        }
        BigInteger bigInteger4 = gVar2.f26252c;
        if (bigInteger4 != null) {
            gVar2.f26253d = bigInteger4;
            return bigInteger4;
        }
        BigInteger bigInteger5 = new BigInteger(1, Z0());
        gVar2.f26253d = bigInteger5;
        gVar2.f26252c = bigInteger5;
        return bigInteger5;
    }

    protected BigInteger U0() {
        return super.getCount();
    }

    /* renamed from: V0 */
    public AbstractC3844b m1(int i10) {
        return X0()[i10];
    }

    public String[] W0() {
        String[] strArr = new String[H()];
        Arrays.setAll(strArr, new IntFunction() { // from class: ag.c
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return this.f26210a.d1(i10);
            }
        });
        return strArr;
    }

    protected AbstractC3844b[] X0() {
        return this.f26216b;
    }

    protected byte[] Z0() {
        if (a1()) {
            g gVar = this.f26215a;
            byte[] bArrB0 = b0(false);
            gVar.f26251b = bArrB0;
            if (A0()) {
                return bArrB0;
            }
            gVar.f26250a = bArrB0;
            return bArrB0;
        }
        g gVar2 = this.f26215a;
        byte[] bArr = gVar2.f26251b;
        if (bArr == null) {
            if (A0()) {
                byte[] bArrB02 = b0(false);
                gVar2.f26251b = bArrB02;
                return bArrB02;
            }
            bArr = gVar2.f26250a;
            if (bArr == null) {
                byte[] bArrB03 = b0(false);
                gVar2.f26251b = bArrB03;
                gVar2.f26250a = bArrB03;
                return bArrB03;
            }
            gVar2.f26251b = bArr;
        }
        return bArr;
    }

    protected boolean a1() {
        if (this.f26215a != null) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f26215a != null) {
                    return false;
                }
                this.f26215a = new g();
                return true;
            } finally {
            }
        }
    }

    protected abstract byte[] b0(boolean z10);

    protected void b1(Integer num, BigInteger bigInteger) {
        if (num == null) {
            num = f26211g;
        }
        this.f26217c = num;
        this.f26219e = bigInteger;
    }

    @Override // ag.InterfaceC3849g
    public boolean c0() {
        int iH = H();
        for (int i10 = 0; i10 < iH; i10++) {
            if (!m1(i10).c0()) {
                return false;
            }
        }
        return true;
    }

    protected boolean c1(AbstractC3846d abstractC3846d) {
        int iH = H();
        if (iH != abstractC3846d.H()) {
            return false;
        }
        for (int i10 = 0; i10 < iH; i10++) {
            if (!m1(i10).equals(abstractC3846d.m1(i10))) {
                return false;
            }
        }
        return true;
    }

    protected void e1(byte[] bArr) {
        if (this.f26215a == null) {
            this.f26215a = new g();
        }
        this.f26215a.f26250a = bArr;
    }

    protected void g1(InetAddress inetAddress) {
        if (this.f26215a == null) {
            this.f26215a = new g();
        }
        this.f26215a.f26254e = inetAddress;
    }

    @Override // ag.InterfaceC3847e, ag.InterfaceC3849g
    public BigInteger getCount() {
        BigInteger bigInteger = this.f26219e;
        if (bigInteger != null) {
            return bigInteger;
        }
        BigInteger bigIntegerU0 = U0();
        this.f26219e = bigIntegerU0;
        return bigIntegerU0;
    }

    @Override // ag.InterfaceC3849g
    public BigInteger getValue() {
        BigInteger bigInteger;
        if (!a1() && (bigInteger = this.f26215a.f26252c) != null) {
            return bigInteger;
        }
        g gVar = this.f26215a;
        BigInteger bigInteger2 = new BigInteger(1, q0());
        gVar.f26252c = bigInteger2;
        return bigInteger2;
    }

    @Override // ag.InterfaceC3847e
    public boolean i() {
        return A() != null;
    }

    protected byte[] q0() {
        byte[] bArr;
        if (!a1() && (bArr = this.f26215a.f26250a) != null) {
            return bArr;
        }
        g gVar = this.f26215a;
        byte[] bArrB0 = b0(true);
        gVar.f26250a = bArrB0;
        return bArrB0;
    }

    @Override // ag.InterfaceC3849g
    public boolean w() {
        int iH = H();
        for (int i10 = 0; i10 < iH; i10++) {
            if (!m1(i10).w()) {
                return false;
            }
        }
        return true;
    }

    public AbstractC3846d(AbstractC3844b[] abstractC3844bArr, boolean z10) {
        this.f26216b = abstractC3844bArr;
        if (z10) {
            for (AbstractC3844b abstractC3844b : abstractC3844bArr) {
                if (abstractC3844b == null) {
                    throw new NullPointerException(Y0("ipaddress.error.null.segment"));
                }
            }
        }
    }
}
