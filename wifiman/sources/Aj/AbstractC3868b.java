package aj;

import Vi.InterfaceC3627a;
import bj.C4131n;
import bj.L;
import bj.M;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: aj.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3868b implements Vi.A {

    /* renamed from: d, reason: collision with root package name */
    public static final a f26328d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C3873g f26329a;

    /* renamed from: b, reason: collision with root package name */
    private final cj.e f26330b;

    /* renamed from: c, reason: collision with root package name */
    private final C4131n f26331c;

    /* renamed from: aj.b$a */
    public static final class a extends AbstractC3868b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(new C3873g(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), cj.g.a(), null);
        }
    }

    public /* synthetic */ AbstractC3868b(C3873g c3873g, cj.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3873g, eVar);
    }

    @Override // Vi.l
    public cj.e a() {
        return this.f26330b;
    }

    @Override // Vi.A
    public final Object b(InterfaceC3627a deserializer, String string) {
        AbstractC6492s.i(deserializer, "deserializer");
        AbstractC6492s.i(string, "string");
        bj.H hA = bj.I.a(this, string);
        Object objT = new bj.E(this, M.OBJ, hA, deserializer.a(), null).t(deserializer);
        hA.x();
        return objT;
    }

    @Override // Vi.A
    public final String c(Vi.o serializer, Object obj) {
        AbstractC6492s.i(serializer, "serializer");
        bj.y yVar = new bj.y();
        try {
            bj.x.a(this, yVar, serializer, obj);
            return yVar.toString();
        } finally {
            yVar.h();
        }
    }

    public final Object d(InterfaceC3627a deserializer, j element) {
        AbstractC6492s.i(deserializer, "deserializer");
        AbstractC6492s.i(element, "element");
        return L.a(this, element, deserializer);
    }

    public final C3873g e() {
        return this.f26329a;
    }

    public final C4131n f() {
        return this.f26331c;
    }

    private AbstractC3868b(C3873g c3873g, cj.e eVar) {
        this.f26329a = c3873g;
        this.f26330b = eVar;
        this.f26331c = new C4131n();
    }
}
