package li;

import Bh.InterfaceC2495e;
import Ch.a;
import Ch.c;
import Zg.AbstractC3689v;
import com.google.ar.core.ImageMetadata;
import hi.InterfaceC6047a;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.InterfaceC6644v;
import ni.InterfaceC6987s;
import org.snmp4j.transport.TLSTM;
import pi.C7376x;

/* renamed from: li.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6636n {

    /* renamed from: a, reason: collision with root package name */
    private final oi.n f52717a;

    /* renamed from: b, reason: collision with root package name */
    private final Bh.G f52718b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6637o f52719c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6632j f52720d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6627e f52721e;

    /* renamed from: f, reason: collision with root package name */
    private final Bh.N f52722f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6599B f52723g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC6645w f52724h;

    /* renamed from: i, reason: collision with root package name */
    private final Ih.c f52725i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC6646x f52726j;

    /* renamed from: k, reason: collision with root package name */
    private final Iterable f52727k;

    /* renamed from: l, reason: collision with root package name */
    private final Bh.L f52728l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC6635m f52729m;

    /* renamed from: n, reason: collision with root package name */
    private final Ch.a f52730n;

    /* renamed from: o, reason: collision with root package name */
    private final Ch.c f52731o;

    /* renamed from: p, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.f f52732p;

    /* renamed from: q, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.p f52733q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC6047a f52734r;

    /* renamed from: s, reason: collision with root package name */
    private final List f52735s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC6644v f52736t;

    /* renamed from: u, reason: collision with root package name */
    private final C6634l f52737u;

    public C6636n(oi.n storageManager, Bh.G moduleDescriptor, InterfaceC6637o configuration, InterfaceC6632j classDataFinder, InterfaceC6627e annotationAndConstantLoader, Bh.N packageFragmentProvider, InterfaceC6599B localClassifierTypeSettings, InterfaceC6645w errorReporter, Ih.c lookupTracker, InterfaceC6646x flexibleTypeDeserializer, Iterable fictitiousClassDescriptorFactories, Bh.L notFoundClasses, InterfaceC6635m contractDeserializer, Ch.a additionalClassPartsProvider, Ch.c platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.protobuf.f extensionRegistryLite, kotlin.reflect.jvm.internal.impl.types.checker.p kotlinTypeChecker, InterfaceC6047a samConversionResolver, List typeAttributeTranslators, InterfaceC6644v enumEntriesDeserializationSupport) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(moduleDescriptor, "moduleDescriptor");
        AbstractC6492s.i(configuration, "configuration");
        AbstractC6492s.i(classDataFinder, "classDataFinder");
        AbstractC6492s.i(annotationAndConstantLoader, "annotationAndConstantLoader");
        AbstractC6492s.i(packageFragmentProvider, "packageFragmentProvider");
        AbstractC6492s.i(localClassifierTypeSettings, "localClassifierTypeSettings");
        AbstractC6492s.i(errorReporter, "errorReporter");
        AbstractC6492s.i(lookupTracker, "lookupTracker");
        AbstractC6492s.i(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        AbstractC6492s.i(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        AbstractC6492s.i(notFoundClasses, "notFoundClasses");
        AbstractC6492s.i(contractDeserializer, "contractDeserializer");
        AbstractC6492s.i(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC6492s.i(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC6492s.i(extensionRegistryLite, "extensionRegistryLite");
        AbstractC6492s.i(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC6492s.i(samConversionResolver, "samConversionResolver");
        AbstractC6492s.i(typeAttributeTranslators, "typeAttributeTranslators");
        AbstractC6492s.i(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f52717a = storageManager;
        this.f52718b = moduleDescriptor;
        this.f52719c = configuration;
        this.f52720d = classDataFinder;
        this.f52721e = annotationAndConstantLoader;
        this.f52722f = packageFragmentProvider;
        this.f52723g = localClassifierTypeSettings;
        this.f52724h = errorReporter;
        this.f52725i = lookupTracker;
        this.f52726j = flexibleTypeDeserializer;
        this.f52727k = fictitiousClassDescriptorFactories;
        this.f52728l = notFoundClasses;
        this.f52729m = contractDeserializer;
        this.f52730n = additionalClassPartsProvider;
        this.f52731o = platformDependentDeclarationFilter;
        this.f52732p = extensionRegistryLite;
        this.f52733q = kotlinTypeChecker;
        this.f52734r = samConversionResolver;
        this.f52735s = typeAttributeTranslators;
        this.f52736t = enumEntriesDeserializationSupport;
        this.f52737u = new C6634l(this);
    }

    public final C6638p a(Bh.M descriptor, Wh.c nameResolver, Wh.g typeTable, Wh.h versionRequirementTable, Wh.a metadataVersion, InterfaceC6987s interfaceC6987s) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        AbstractC6492s.i(versionRequirementTable, "versionRequirementTable");
        AbstractC6492s.i(metadataVersion, "metadataVersion");
        return new C6638p(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, interfaceC6987s, null, AbstractC3689v.l());
    }

    public final InterfaceC2495e b(Zh.b classId) {
        AbstractC6492s.i(classId, "classId");
        return C6634l.f(this.f52737u, classId, null, 2, null);
    }

    public final Ch.a c() {
        return this.f52730n;
    }

    public final InterfaceC6627e d() {
        return this.f52721e;
    }

    public final InterfaceC6632j e() {
        return this.f52720d;
    }

    public final C6634l f() {
        return this.f52737u;
    }

    public final InterfaceC6637o g() {
        return this.f52719c;
    }

    public final InterfaceC6635m h() {
        return this.f52729m;
    }

    public final InterfaceC6644v i() {
        return this.f52736t;
    }

    public final InterfaceC6645w j() {
        return this.f52724h;
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.f k() {
        return this.f52732p;
    }

    public final Iterable l() {
        return this.f52727k;
    }

    public final InterfaceC6646x m() {
        return this.f52726j;
    }

    public final kotlin.reflect.jvm.internal.impl.types.checker.p n() {
        return this.f52733q;
    }

    public final InterfaceC6599B o() {
        return this.f52723g;
    }

    public final Ih.c p() {
        return this.f52725i;
    }

    public final Bh.G q() {
        return this.f52718b;
    }

    public final Bh.L r() {
        return this.f52728l;
    }

    public final Bh.N s() {
        return this.f52722f;
    }

    public final Ch.c t() {
        return this.f52731o;
    }

    public final oi.n u() {
        return this.f52717a;
    }

    public final List v() {
        return this.f52735s;
    }

    public /* synthetic */ C6636n(oi.n nVar, Bh.G g10, InterfaceC6637o interfaceC6637o, InterfaceC6632j interfaceC6632j, InterfaceC6627e interfaceC6627e, Bh.N n10, InterfaceC6599B interfaceC6599B, InterfaceC6645w interfaceC6645w, Ih.c cVar, InterfaceC6646x interfaceC6646x, Iterable iterable, Bh.L l10, InterfaceC6635m interfaceC6635m, Ch.a aVar, Ch.c cVar2, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, kotlin.reflect.jvm.internal.impl.types.checker.p pVar, InterfaceC6047a interfaceC6047a, List list, InterfaceC6644v interfaceC6644v, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, g10, interfaceC6637o, interfaceC6632j, interfaceC6627e, n10, interfaceC6599B, interfaceC6645w, cVar, interfaceC6646x, iterable, l10, interfaceC6635m, (i10 & 8192) != 0 ? a.C0138a.f2752a : aVar, (i10 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? c.a.f2753a : cVar2, fVar, (65536 & i10) != 0 ? kotlin.reflect.jvm.internal.impl.types.checker.p.f52164b.a() : pVar, interfaceC6047a, (262144 & i10) != 0 ? AbstractC3689v.e(C7376x.f58188a) : list, (i10 & ImageMetadata.LENS_APERTURE) != 0 ? InterfaceC6644v.a.f52758a : interfaceC6644v);
    }
}
