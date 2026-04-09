package kotlin.reflect.jvm.internal.impl.renderer;

import Bh.s0;
import Zg.d0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import kotlin.reflect.jvm.internal.impl.renderer.InterfaceC6500b;
import kotlin.reflect.jvm.internal.impl.renderer.n;
import kotlin.reflect.jvm.internal.impl.renderer.w;
import mh.InterfaceC6835l;
import ph.AbstractC7332b;
import ph.C7331a;
import pi.S;

/* loaded from: classes4.dex */
public final class z implements w {

    /* renamed from: Z, reason: collision with root package name */
    static final /* synthetic */ th.l[] f52089Z = {O.f(new kotlin.jvm.internal.z(O.b(z.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "withDefinedIn", "getWithDefinedIn()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "modifiers", "getModifiers()Ljava/util/Set;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "startFromName", "getStartFromName()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "debugMode", "getDebugMode()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "verbose", "getVerbose()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "unitReturnType", "getUnitReturnType()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "withoutReturnType", "getWithoutReturnType()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "enhancedTypes", "getEnhancedTypes()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "renderDefaultModality", "getRenderDefaultModality()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "receiverAfterName", "getReceiverAfterName()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), O.f(new kotlin.jvm.internal.z(O.b(z.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    /* renamed from: A, reason: collision with root package name */
    private final ph.d f52090A;

    /* renamed from: B, reason: collision with root package name */
    private final ph.d f52091B;

    /* renamed from: C, reason: collision with root package name */
    private final ph.d f52092C;

    /* renamed from: D, reason: collision with root package name */
    private final ph.d f52093D;

    /* renamed from: E, reason: collision with root package name */
    private final ph.d f52094E;

    /* renamed from: F, reason: collision with root package name */
    private final ph.d f52095F;

    /* renamed from: G, reason: collision with root package name */
    private final ph.d f52096G;

    /* renamed from: H, reason: collision with root package name */
    private final ph.d f52097H;

    /* renamed from: I, reason: collision with root package name */
    private final ph.d f52098I;

    /* renamed from: J, reason: collision with root package name */
    private final ph.d f52099J;

    /* renamed from: K, reason: collision with root package name */
    private final ph.d f52100K;

    /* renamed from: L, reason: collision with root package name */
    private final ph.d f52101L;

    /* renamed from: M, reason: collision with root package name */
    private final ph.d f52102M;

    /* renamed from: N, reason: collision with root package name */
    private final ph.d f52103N;

    /* renamed from: O, reason: collision with root package name */
    private final ph.d f52104O;

    /* renamed from: P, reason: collision with root package name */
    private final ph.d f52105P;

    /* renamed from: Q, reason: collision with root package name */
    private final ph.d f52106Q;

    /* renamed from: R, reason: collision with root package name */
    private final ph.d f52107R;

    /* renamed from: S, reason: collision with root package name */
    private final ph.d f52108S;

    /* renamed from: T, reason: collision with root package name */
    private final ph.d f52109T;

    /* renamed from: U, reason: collision with root package name */
    private final ph.d f52110U;

    /* renamed from: V, reason: collision with root package name */
    private final ph.d f52111V;

    /* renamed from: W, reason: collision with root package name */
    private final ph.d f52112W;

    /* renamed from: X, reason: collision with root package name */
    private final ph.d f52113X;

    /* renamed from: Y, reason: collision with root package name */
    private final ph.d f52114Y;

    /* renamed from: a, reason: collision with root package name */
    private boolean f52115a;

    /* renamed from: b, reason: collision with root package name */
    private final ph.d f52116b = r0(InterfaceC6500b.c.f52049a);

    /* renamed from: c, reason: collision with root package name */
    private final ph.d f52117c;

    /* renamed from: d, reason: collision with root package name */
    private final ph.d f52118d;

    /* renamed from: e, reason: collision with root package name */
    private final ph.d f52119e;

    /* renamed from: f, reason: collision with root package name */
    private final ph.d f52120f;

    /* renamed from: g, reason: collision with root package name */
    private final ph.d f52121g;

    /* renamed from: h, reason: collision with root package name */
    private final ph.d f52122h;

    /* renamed from: i, reason: collision with root package name */
    private final ph.d f52123i;

    /* renamed from: j, reason: collision with root package name */
    private final ph.d f52124j;

    /* renamed from: k, reason: collision with root package name */
    private final ph.d f52125k;

    /* renamed from: l, reason: collision with root package name */
    private final ph.d f52126l;

    /* renamed from: m, reason: collision with root package name */
    private final ph.d f52127m;

    /* renamed from: n, reason: collision with root package name */
    private final ph.d f52128n;

    /* renamed from: o, reason: collision with root package name */
    private final ph.d f52129o;

    /* renamed from: p, reason: collision with root package name */
    private final ph.d f52130p;

    /* renamed from: q, reason: collision with root package name */
    private final ph.d f52131q;

    /* renamed from: r, reason: collision with root package name */
    private final ph.d f52132r;

    /* renamed from: s, reason: collision with root package name */
    private final ph.d f52133s;

    /* renamed from: t, reason: collision with root package name */
    private final ph.d f52134t;

    /* renamed from: u, reason: collision with root package name */
    private final ph.d f52135u;

    /* renamed from: v, reason: collision with root package name */
    private final ph.d f52136v;

    /* renamed from: w, reason: collision with root package name */
    private final ph.d f52137w;

    /* renamed from: x, reason: collision with root package name */
    private final ph.d f52138x;

    /* renamed from: y, reason: collision with root package name */
    private final ph.d f52139y;

    /* renamed from: z, reason: collision with root package name */
    private final ph.d f52140z;

    public static final class a extends AbstractC7332b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f52141b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, z zVar) {
            super(obj);
            this.f52141b = zVar;
        }

        @Override // ph.AbstractC7332b
        protected boolean d(th.l property, Object obj, Object obj2) {
            AbstractC6492s.i(property, "property");
            if (this.f52141b.p0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    public z() {
        Boolean bool = Boolean.TRUE;
        this.f52117c = r0(bool);
        this.f52118d = r0(bool);
        this.f52119e = r0(v.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f52120f = r0(bool2);
        this.f52121g = r0(bool2);
        this.f52122h = r0(bool2);
        this.f52123i = r0(bool2);
        this.f52124j = r0(bool2);
        this.f52125k = r0(bool);
        this.f52126l = r0(bool2);
        this.f52127m = r0(bool2);
        this.f52128n = r0(bool2);
        this.f52129o = r0(bool);
        this.f52130p = r0(bool);
        this.f52131q = r0(bool2);
        this.f52132r = r0(bool2);
        this.f52133s = r0(bool2);
        this.f52134t = r0(bool2);
        this.f52135u = r0(bool2);
        this.f52136v = r0(null);
        this.f52137w = r0(bool2);
        this.f52138x = r0(bool2);
        this.f52139y = r0(x.f52087a);
        this.f52140z = r0(y.f52088a);
        this.f52090A = r0(bool);
        this.f52091B = r0(C.RENDER_OPEN);
        this.f52092C = r0(n.b.a.f52074a);
        this.f52093D = r0(F.PLAIN);
        this.f52094E = r0(D.ALL);
        this.f52095F = r0(bool2);
        this.f52096G = r0(bool2);
        this.f52097H = r0(E.DEBUG);
        this.f52098I = r0(bool2);
        this.f52099J = r0(bool2);
        this.f52100K = r0(d0.e());
        this.f52101L = r0(A.f52044a.a());
        this.f52102M = r0(null);
        this.f52103N = r0(EnumC6499a.NO_ARGUMENTS);
        this.f52104O = r0(bool2);
        this.f52105P = r0(bool);
        this.f52106Q = r0(bool);
        this.f52107R = r0(bool2);
        this.f52108S = r0(bool2);
        this.f52109T = r0(bool);
        this.f52110U = r0(bool);
        this.f52111V = r0(bool2);
        this.f52112W = r0(bool2);
        this.f52113X = r0(bool2);
        this.f52114Y = r0(bool);
    }

    private final ph.d r0(Object obj) {
        C7331a c7331a = C7331a.f58040a;
        return new a(obj, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S s0(S it) {
        AbstractC6492s.i(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v(s0 it) {
        AbstractC6492s.i(it, "it");
        return "...";
    }

    public boolean A() {
        return ((Boolean) this.f52123i.a(this, f52089Z[7])).booleanValue();
    }

    public InterfaceC6500b B() {
        return (InterfaceC6500b) this.f52116b.a(this, f52089Z[0]);
    }

    public InterfaceC6835l C() {
        return (InterfaceC6835l) this.f52140z.a(this, f52089Z[24]);
    }

    public boolean D() {
        return ((Boolean) this.f52099J.a(this, f52089Z[34])).booleanValue();
    }

    public Set E() {
        return (Set) this.f52100K.a(this, f52089Z[35]);
    }

    public boolean F() {
        return ((Boolean) this.f52109T.a(this, f52089Z[44])).booleanValue();
    }

    public boolean G() {
        return ((Boolean) this.f52135u.a(this, f52089Z[19])).booleanValue();
    }

    public boolean H() {
        return ((Boolean) this.f52114Y.a(this, f52089Z[49])).booleanValue();
    }

    public Set I() {
        return (Set) this.f52119e.a(this, f52089Z[3]);
    }

    public boolean J() {
        return ((Boolean) this.f52128n.a(this, f52089Z[12])).booleanValue();
    }

    public C K() {
        return (C) this.f52091B.a(this, f52089Z[26]);
    }

    public D L() {
        return (D) this.f52094E.a(this, f52089Z[29]);
    }

    public boolean M() {
        return ((Boolean) this.f52110U.a(this, f52089Z[45])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.f52112W.a(this, f52089Z[47])).booleanValue();
    }

    public E O() {
        return (E) this.f52097H.a(this, f52089Z[32]);
    }

    public InterfaceC6835l P() {
        return (InterfaceC6835l) this.f52136v.a(this, f52089Z[20]);
    }

    public boolean Q() {
        return ((Boolean) this.f52095F.a(this, f52089Z[30])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.f52108S.a(this, f52089Z[43])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.f52096G.a(this, f52089Z[31])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f52131q.a(this, f52089Z[15])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f52105P.a(this, f52089Z[40])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f52098I.a(this, f52089Z[33])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f52130p.a(this, f52089Z[14])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f52129o.a(this, f52089Z[13])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f52132r.a(this, f52089Z[16])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.f52107R.a(this, f52089Z[42])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void a(Set set) {
        AbstractC6492s.i(set, "<set-?>");
        this.f52101L.b(this, f52089Z[36], set);
    }

    public boolean a0() {
        return ((Boolean) this.f52106Q.a(this, f52089Z[41])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public boolean b() {
        return w.a.b(this);
    }

    public boolean b0() {
        return ((Boolean) this.f52090A.a(this, f52089Z[25])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void c(boolean z10) {
        this.f52120f.b(this, f52089Z[4], Boolean.valueOf(z10));
    }

    public boolean c0() {
        return ((Boolean) this.f52121g.a(this, f52089Z[5])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void d(Set set) {
        AbstractC6492s.i(set, "<set-?>");
        this.f52119e.b(this, f52089Z[3], set);
    }

    public boolean d0() {
        return ((Boolean) this.f52120f.a(this, f52089Z[4])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void e(D d10) {
        AbstractC6492s.i(d10, "<set-?>");
        this.f52094E.b(this, f52089Z[29], d10);
    }

    public F e0() {
        return (F) this.f52093D.a(this, f52089Z[28]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void f(boolean z10) {
        this.f52117c.b(this, f52089Z[1], Boolean.valueOf(z10));
    }

    public InterfaceC6835l f0() {
        return (InterfaceC6835l) this.f52139y.a(this, f52089Z[23]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public boolean g() {
        return ((Boolean) this.f52127m.a(this, f52089Z[11])).booleanValue();
    }

    public boolean g0() {
        return ((Boolean) this.f52134t.a(this, f52089Z[18])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void h(InterfaceC6500b interfaceC6500b) {
        AbstractC6492s.i(interfaceC6500b, "<set-?>");
        this.f52116b.b(this, f52089Z[0], interfaceC6500b);
    }

    public boolean h0() {
        return ((Boolean) this.f52125k.a(this, f52089Z[9])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void i(boolean z10) {
        this.f52138x.b(this, f52089Z[22], Boolean.valueOf(z10));
    }

    public n.b i0() {
        return (n.b) this.f52092C.a(this, f52089Z[27]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void j(boolean z10) {
        this.f52122h.b(this, f52089Z[6], Boolean.valueOf(z10));
    }

    public boolean j0() {
        return ((Boolean) this.f52124j.a(this, f52089Z[8])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void k(boolean z10) {
        this.f52096G.b(this, f52089Z[31], Boolean.valueOf(z10));
    }

    public boolean k0() {
        return ((Boolean) this.f52117c.a(this, f52089Z[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void l(boolean z10) {
        this.f52095F.b(this, f52089Z[30], Boolean.valueOf(z10));
    }

    public boolean l0() {
        return ((Boolean) this.f52118d.a(this, f52089Z[2])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void m(F f10) {
        AbstractC6492s.i(f10, "<set-?>");
        this.f52093D.b(this, f52089Z[28], f10);
    }

    public boolean m0() {
        return ((Boolean) this.f52126l.a(this, f52089Z[10])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public boolean n() {
        return w.a.a(this);
    }

    public boolean n0() {
        return ((Boolean) this.f52138x.a(this, f52089Z[22])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public Set o() {
        return (Set) this.f52101L.a(this, f52089Z[36]);
    }

    public boolean o0() {
        return ((Boolean) this.f52137w.a(this, f52089Z[21])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public boolean p() {
        return ((Boolean) this.f52122h.a(this, f52089Z[6])).booleanValue();
    }

    public final boolean p0() {
        return this.f52115a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public EnumC6499a q() {
        return (EnumC6499a) this.f52103N.a(this, f52089Z[38]);
    }

    public final void q0() {
        this.f52115a = true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void r(boolean z10) {
        this.f52137w.b(this, f52089Z[21], Boolean.valueOf(z10));
    }

    public final z u() {
        z zVar = new z();
        Iterator itA = AbstractC6477c.a(z.class.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                AbstractC7332b abstractC7332b = obj instanceof AbstractC7332b ? (AbstractC7332b) obj : null;
                if (abstractC7332b != null) {
                    String name = field.getName();
                    AbstractC6492s.h(name, "getName(...)");
                    kotlin.text.t.P(name, "is", false, 2, null);
                    th.d dVarB = O.b(z.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    AbstractC6492s.h(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        AbstractC6492s.h(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb2.append(name3);
                    field.set(zVar, zVar.r0(abstractC7332b.a(this, new kotlin.jvm.internal.F(dVarB, name2, sb2.toString()))));
                }
            }
        }
        return zVar;
    }

    public boolean w() {
        return ((Boolean) this.f52133s.a(this, f52089Z[17])).booleanValue();
    }

    public boolean x() {
        return ((Boolean) this.f52104O.a(this, f52089Z[39])).booleanValue();
    }

    public InterfaceC6835l y() {
        return (InterfaceC6835l) this.f52102M.a(this, f52089Z[37]);
    }

    public boolean z() {
        return ((Boolean) this.f52113X.a(this, f52089Z[48])).booleanValue();
    }
}
