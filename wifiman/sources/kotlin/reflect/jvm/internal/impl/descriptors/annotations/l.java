package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Bh.g0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pi.AbstractC7346d0;
import pi.S;

/* loaded from: classes4.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.builtins.i f51919a;

    /* renamed from: b, reason: collision with root package name */
    private final Zh.c f51920b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f51921c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f51922d;

    /* renamed from: e, reason: collision with root package name */
    private final Yg.m f51923e;

    public l(kotlin.reflect.jvm.internal.impl.builtins.i builtIns, Zh.c fqName, Map allValueArguments, boolean z10) {
        AbstractC6492s.i(builtIns, "builtIns");
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(allValueArguments, "allValueArguments");
        this.f51919a = builtIns;
        this.f51920b = fqName;
        this.f51921c = allValueArguments;
        this.f51922d = z10;
        this.f51923e = Yg.n.a(Yg.q.PUBLICATION, new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7346d0 c(l lVar) {
        return lVar.f51919a.o(lVar.e()).u();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        return this.f51921c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Zh.c e() {
        return this.f51920b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public S getType() {
        Object value = this.f51923e.getValue();
        AbstractC6492s.h(value, "getValue(...)");
        return (S) value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public g0 j() {
        g0 NO_SOURCE = g0.f1784a;
        AbstractC6492s.h(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    public /* synthetic */ l(kotlin.reflect.jvm.internal.impl.builtins.i iVar, Zh.c cVar, Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, cVar, map, (i10 & 8) != 0 ? false : z10);
    }
}
