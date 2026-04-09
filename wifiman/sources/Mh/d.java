package Mh;

import Bh.G;
import Bh.j0;
import Jh.A;
import Jh.C3110d;
import Jh.InterfaceC3126u;
import Jh.InterfaceC3127v;
import Rh.e0;
import Sh.D;
import Sh.v;
import hi.InterfaceC6047a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.InterfaceC6645w;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final oi.n f13178a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3126u f13179b;

    /* renamed from: c, reason: collision with root package name */
    private final v f13180c;

    /* renamed from: d, reason: collision with root package name */
    private final Sh.n f13181d;

    /* renamed from: e, reason: collision with root package name */
    private final Kh.o f13182e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6645w f13183f;

    /* renamed from: g, reason: collision with root package name */
    private final Kh.j f13184g;

    /* renamed from: h, reason: collision with root package name */
    private final Kh.i f13185h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC6047a f13186i;

    /* renamed from: j, reason: collision with root package name */
    private final Ph.b f13187j;

    /* renamed from: k, reason: collision with root package name */
    private final n f13188k;

    /* renamed from: l, reason: collision with root package name */
    private final D f13189l;

    /* renamed from: m, reason: collision with root package name */
    private final j0 f13190m;

    /* renamed from: n, reason: collision with root package name */
    private final Ih.c f13191n;

    /* renamed from: o, reason: collision with root package name */
    private final G f13192o;

    /* renamed from: p, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.builtins.n f13193p;

    /* renamed from: q, reason: collision with root package name */
    private final C3110d f13194q;

    /* renamed from: r, reason: collision with root package name */
    private final e0 f13195r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3127v f13196s;

    /* renamed from: t, reason: collision with root package name */
    private final e f13197t;

    /* renamed from: u, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.p f13198u;

    /* renamed from: v, reason: collision with root package name */
    private final Jh.D f13199v;

    /* renamed from: w, reason: collision with root package name */
    private final A f13200w;

    /* renamed from: x, reason: collision with root package name */
    private final gi.f f13201x;

    public d(oi.n storageManager, InterfaceC3126u finder, v kotlinClassFinder, Sh.n deserializedDescriptorResolver, Kh.o signaturePropagator, InterfaceC6645w errorReporter, Kh.j javaResolverCache, Kh.i javaPropertyInitializerEvaluator, InterfaceC6047a samConversionResolver, Ph.b sourceElementFactory, n moduleClassResolver, D packagePartProvider, j0 supertypeLoopChecker, Ih.c lookupTracker, G module, kotlin.reflect.jvm.internal.impl.builtins.n reflectionTypes, C3110d annotationTypeQualifierResolver, e0 signatureEnhancement, InterfaceC3127v javaClassesTracker, e settings, kotlin.reflect.jvm.internal.impl.types.checker.p kotlinTypeChecker, Jh.D javaTypeEnhancementState, A javaModuleResolver, gi.f syntheticPartsProvider) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(finder, "finder");
        AbstractC6492s.i(kotlinClassFinder, "kotlinClassFinder");
        AbstractC6492s.i(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC6492s.i(signaturePropagator, "signaturePropagator");
        AbstractC6492s.i(errorReporter, "errorReporter");
        AbstractC6492s.i(javaResolverCache, "javaResolverCache");
        AbstractC6492s.i(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        AbstractC6492s.i(samConversionResolver, "samConversionResolver");
        AbstractC6492s.i(sourceElementFactory, "sourceElementFactory");
        AbstractC6492s.i(moduleClassResolver, "moduleClassResolver");
        AbstractC6492s.i(packagePartProvider, "packagePartProvider");
        AbstractC6492s.i(supertypeLoopChecker, "supertypeLoopChecker");
        AbstractC6492s.i(lookupTracker, "lookupTracker");
        AbstractC6492s.i(module, "module");
        AbstractC6492s.i(reflectionTypes, "reflectionTypes");
        AbstractC6492s.i(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        AbstractC6492s.i(signatureEnhancement, "signatureEnhancement");
        AbstractC6492s.i(javaClassesTracker, "javaClassesTracker");
        AbstractC6492s.i(settings, "settings");
        AbstractC6492s.i(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC6492s.i(javaTypeEnhancementState, "javaTypeEnhancementState");
        AbstractC6492s.i(javaModuleResolver, "javaModuleResolver");
        AbstractC6492s.i(syntheticPartsProvider, "syntheticPartsProvider");
        this.f13178a = storageManager;
        this.f13179b = finder;
        this.f13180c = kotlinClassFinder;
        this.f13181d = deserializedDescriptorResolver;
        this.f13182e = signaturePropagator;
        this.f13183f = errorReporter;
        this.f13184g = javaResolverCache;
        this.f13185h = javaPropertyInitializerEvaluator;
        this.f13186i = samConversionResolver;
        this.f13187j = sourceElementFactory;
        this.f13188k = moduleClassResolver;
        this.f13189l = packagePartProvider;
        this.f13190m = supertypeLoopChecker;
        this.f13191n = lookupTracker;
        this.f13192o = module;
        this.f13193p = reflectionTypes;
        this.f13194q = annotationTypeQualifierResolver;
        this.f13195r = signatureEnhancement;
        this.f13196s = javaClassesTracker;
        this.f13197t = settings;
        this.f13198u = kotlinTypeChecker;
        this.f13199v = javaTypeEnhancementState;
        this.f13200w = javaModuleResolver;
        this.f13201x = syntheticPartsProvider;
    }

    public final C3110d a() {
        return this.f13194q;
    }

    public final Sh.n b() {
        return this.f13181d;
    }

    public final InterfaceC6645w c() {
        return this.f13183f;
    }

    public final InterfaceC3126u d() {
        return this.f13179b;
    }

    public final InterfaceC3127v e() {
        return this.f13196s;
    }

    public final A f() {
        return this.f13200w;
    }

    public final Kh.i g() {
        return this.f13185h;
    }

    public final Kh.j h() {
        return this.f13184g;
    }

    public final Jh.D i() {
        return this.f13199v;
    }

    public final v j() {
        return this.f13180c;
    }

    public final kotlin.reflect.jvm.internal.impl.types.checker.p k() {
        return this.f13198u;
    }

    public final Ih.c l() {
        return this.f13191n;
    }

    public final G m() {
        return this.f13192o;
    }

    public final n n() {
        return this.f13188k;
    }

    public final D o() {
        return this.f13189l;
    }

    public final kotlin.reflect.jvm.internal.impl.builtins.n p() {
        return this.f13193p;
    }

    public final e q() {
        return this.f13197t;
    }

    public final e0 r() {
        return this.f13195r;
    }

    public final Kh.o s() {
        return this.f13182e;
    }

    public final Ph.b t() {
        return this.f13187j;
    }

    public final oi.n u() {
        return this.f13178a;
    }

    public final j0 v() {
        return this.f13190m;
    }

    public final gi.f w() {
        return this.f13201x;
    }

    public final d x(Kh.j javaResolverCache) {
        AbstractC6492s.i(javaResolverCache, "javaResolverCache");
        return new d(this.f13178a, this.f13179b, this.f13180c, this.f13181d, this.f13182e, this.f13183f, javaResolverCache, this.f13185h, this.f13186i, this.f13187j, this.f13188k, this.f13189l, this.f13190m, this.f13191n, this.f13192o, this.f13193p, this.f13194q, this.f13195r, this.f13196s, this.f13197t, this.f13198u, this.f13199v, this.f13200w, null, 8388608, null);
    }

    public /* synthetic */ d(oi.n nVar, InterfaceC3126u interfaceC3126u, v vVar, Sh.n nVar2, Kh.o oVar, InterfaceC6645w interfaceC6645w, Kh.j jVar, Kh.i iVar, InterfaceC6047a interfaceC6047a, Ph.b bVar, n nVar3, D d10, j0 j0Var, Ih.c cVar, G g10, kotlin.reflect.jvm.internal.impl.builtins.n nVar4, C3110d c3110d, e0 e0Var, InterfaceC3127v interfaceC3127v, e eVar, kotlin.reflect.jvm.internal.impl.types.checker.p pVar, Jh.D d11, A a10, gi.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, interfaceC3126u, vVar, nVar2, oVar, interfaceC6645w, jVar, iVar, interfaceC6047a, bVar, nVar3, d10, j0Var, cVar, g10, nVar4, c3110d, e0Var, interfaceC3127v, eVar, pVar, d11, a10, (i10 & 8388608) != 0 ? gi.f.f47926a.a() : fVar);
    }
}
