package ss;

import br.x;
import br.y;
import ir.v;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class o implements m {
    public static final /* synthetic */ v[] W;
    public final n A;
    public final n B;
    public final n C;
    public final n D;
    public final n E;
    public final n F;
    public final n G;
    public final n H;
    public final n I;
    public final n J;
    public final n K;
    public final n L;
    public final n M;
    public final n N;
    public final n O;
    public final n P;
    public final n Q;
    public final n R;
    public final n S;
    public final n T;
    public final n U;
    public final n V;

    /* renamed from: a, reason: collision with root package name */
    public boolean f22250a;

    /* renamed from: b, reason: collision with root package name */
    public final n f22251b = new n(b.f22229d, this);

    /* renamed from: c, reason: collision with root package name */
    public final n f22252c;

    /* renamed from: d, reason: collision with root package name */
    public final n f22253d;

    /* renamed from: e, reason: collision with root package name */
    public final n f22254e;

    /* renamed from: f, reason: collision with root package name */
    public final n f22255f;

    /* renamed from: g, reason: collision with root package name */
    public final n f22256g;

    /* renamed from: h, reason: collision with root package name */
    public final n f22257h;

    /* renamed from: i, reason: collision with root package name */
    public final n f22258i;
    public final n j;
    public final n k;

    /* renamed from: l, reason: collision with root package name */
    public final n f22259l;

    /* renamed from: m, reason: collision with root package name */
    public final n f22260m;

    /* renamed from: n, reason: collision with root package name */
    public final n f22261n;

    /* renamed from: o, reason: collision with root package name */
    public final n f22262o;

    /* renamed from: p, reason: collision with root package name */
    public final n f22263p;

    /* renamed from: q, reason: collision with root package name */
    public final n f22264q;

    /* renamed from: r, reason: collision with root package name */
    public final n f22265r;

    /* renamed from: s, reason: collision with root package name */
    public final n f22266s;

    /* renamed from: t, reason: collision with root package name */
    public final n f22267t;

    /* renamed from: u, reason: collision with root package name */
    public final n f22268u;

    /* renamed from: v, reason: collision with root package name */
    public final n f22269v;

    /* renamed from: w, reason: collision with root package name */
    public final n f22270w;

    /* renamed from: x, reason: collision with root package name */
    public final n f22271x;

    /* renamed from: y, reason: collision with root package name */
    public final n f22272y;

    /* renamed from: z, reason: collision with root package name */
    public final n f22273z;

    static {
        y yVar = x.f2918a;
        W = new v[]{yVar.d(new br.o(yVar.b(o.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), yVar.d(new br.o(yVar.b(o.class), "withDefinedIn", "getWithDefinedIn()Z")), yVar.d(new br.o(yVar.b(o.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), yVar.d(new br.o(yVar.b(o.class), "modifiers", "getModifiers()Ljava/util/Set;")), yVar.d(new br.o(yVar.b(o.class), "startFromName", "getStartFromName()Z")), yVar.d(new br.o(yVar.b(o.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), yVar.d(new br.o(yVar.b(o.class), "debugMode", "getDebugMode()Z")), yVar.d(new br.o(yVar.b(o.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), yVar.d(new br.o(yVar.b(o.class), "verbose", "getVerbose()Z")), yVar.d(new br.o(yVar.b(o.class), "unitReturnType", "getUnitReturnType()Z")), yVar.d(new br.o(yVar.b(o.class), "withoutReturnType", "getWithoutReturnType()Z")), yVar.d(new br.o(yVar.b(o.class), "enhancedTypes", "getEnhancedTypes()Z")), yVar.d(new br.o(yVar.b(o.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), yVar.d(new br.o(yVar.b(o.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), yVar.d(new br.o(yVar.b(o.class), "renderDefaultModality", "getRenderDefaultModality()Z")), yVar.d(new br.o(yVar.b(o.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), yVar.d(new br.o(yVar.b(o.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), yVar.d(new br.o(yVar.b(o.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), yVar.d(new br.o(yVar.b(o.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), yVar.d(new br.o(yVar.b(o.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), yVar.d(new br.o(yVar.b(o.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), yVar.d(new br.o(yVar.b(o.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), yVar.d(new br.o(yVar.b(o.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), yVar.d(new br.o(yVar.b(o.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), yVar.d(new br.o(yVar.b(o.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), yVar.d(new br.o(yVar.b(o.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), yVar.d(new br.o(yVar.b(o.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), yVar.d(new br.o(yVar.b(o.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), yVar.d(new br.o(yVar.b(o.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), yVar.d(new br.o(yVar.b(o.class), "receiverAfterName", "getReceiverAfterName()Z")), yVar.d(new br.o(yVar.b(o.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), yVar.d(new br.o(yVar.b(o.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), yVar.d(new br.o(yVar.b(o.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), yVar.d(new br.o(yVar.b(o.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), yVar.d(new br.o(yVar.b(o.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), yVar.d(new br.o(yVar.b(o.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), yVar.d(new br.o(yVar.b(o.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), yVar.d(new br.o(yVar.b(o.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), yVar.d(new br.o(yVar.b(o.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), yVar.d(new br.o(yVar.b(o.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), yVar.d(new br.o(yVar.b(o.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), yVar.d(new br.o(yVar.b(o.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), yVar.d(new br.o(yVar.b(o.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), yVar.d(new br.o(yVar.b(o.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), yVar.d(new br.o(yVar.b(o.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), yVar.d(new br.o(yVar.b(o.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), yVar.d(new br.o(yVar.b(o.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), yVar.d(new br.o(yVar.b(o.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public o() {
        Boolean bool = Boolean.TRUE;
        this.f22252c = new n(bool, this);
        this.f22253d = new n(bool, this);
        this.f22254e = new n(l.ALL_EXCEPT_ANNOTATIONS, this);
        Boolean bool2 = Boolean.FALSE;
        this.f22255f = new n(bool2, this);
        this.f22256g = new n(bool2, this);
        this.f22257h = new n(bool2, this);
        this.f22258i = new n(bool2, this);
        this.j = new n(bool2, this);
        this.k = new n(bool, this);
        this.f22259l = new n(bool2, this);
        this.f22260m = new n(bool2, this);
        this.f22261n = new n(bool2, this);
        this.f22262o = new n(bool, this);
        this.f22263p = new n(bool, this);
        this.f22264q = new n(bool2, this);
        this.f22265r = new n(bool2, this);
        this.f22266s = new n(bool2, this);
        this.f22267t = new n(bool2, this);
        this.f22268u = new n(bool2, this);
        this.f22269v = new n(bool2, this);
        this.f22270w = new n(bool2, this);
        this.f22271x = new n(i.f22241y, this);
        this.f22272y = new n(i.f22240x, this);
        this.f22273z = new n(bool, this);
        this.A = new n(r.RENDER_OPEN, this);
        this.B = new n(e.f22232a, this);
        this.C = new n(u.PLAIN, this);
        this.D = new n(s.ALL, this);
        this.E = new n(bool2, this);
        this.F = new n(bool2, this);
        this.G = new n(t.DEBUG, this);
        this.H = new n(bool2, this);
        this.I = new n(bool2, this);
        this.J = new n(mq.y.f16947a, this);
        this.K = new n(p.f22274a, this);
        this.L = new n(null, this);
        this.M = new n(a.NO_ARGUMENTS, this);
        this.N = new n(bool2, this);
        this.O = new n(bool, this);
        this.P = new n(bool, this);
        this.Q = new n(bool2, this);
        this.R = new n(bool, this);
        this.S = new n(bool, this);
        this.T = new n(bool2, this);
        this.U = new n(bool2, this);
        this.V = new n(bool, this);
    }

    @Override // ss.m
    public final void a() {
        this.E.b(W[29], Boolean.TRUE);
    }

    @Override // ss.m
    public final void b() {
        this.f22257h.b(W[6], Boolean.TRUE);
    }

    @Override // ss.m
    public final void c() {
        this.F.b(W[30], Boolean.TRUE);
    }

    @Override // ss.m
    public final void d(Set set) {
        br.l.e(set, "<set-?>");
        this.f22254e.b(W[3], set);
    }

    @Override // ss.m
    public final void e(s sVar) {
        br.l.e(sVar, "<set-?>");
        this.D.b(W[28], sVar);
    }

    @Override // ss.m
    public final void f(LinkedHashSet linkedHashSet) {
        this.K.b(W[35], linkedHashSet);
    }

    @Override // ss.m
    public final void g() {
        this.f22269v.b(W[20], Boolean.TRUE);
    }

    @Override // ss.m
    public final void h(u uVar) {
        br.l.e(uVar, "<set-?>");
        this.C.b(W[27], uVar);
    }

    @Override // ss.m
    public final void i() {
        this.f22255f.b(W[4], Boolean.TRUE);
    }

    @Override // ss.m
    public final void j() {
        this.f22252c.b(W[1], Boolean.FALSE);
    }

    @Override // ss.m
    public final Set k() {
        return (Set) this.K.a(W[35], this);
    }

    @Override // ss.m
    public final void l(c cVar) {
        this.f22251b.b(W[0], cVar);
    }

    @Override // ss.m
    public final void m() {
        this.f22270w.b(W[21], Boolean.TRUE);
    }

    public final boolean n() {
        return ((Boolean) this.f22257h.a(W[6], this)).booleanValue();
    }
}
