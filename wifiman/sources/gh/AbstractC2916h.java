package Gh;

import Qh.InterfaceC3445b;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Gh.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2916h implements InterfaceC3445b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7478b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Zh.f f7479a;

    /* renamed from: Gh.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC2916h a(Object value, Zh.f fVar) {
            AbstractC6492s.i(value, "value");
            return AbstractC2914f.l(value.getClass()) ? new v(fVar, (Enum) value) : value instanceof Annotation ? new i(fVar, (Annotation) value) : value instanceof Object[] ? new l(fVar, (Object[]) value) : value instanceof Class ? new r(fVar, (Class) value) : new x(fVar, value);
        }

        private a() {
        }
    }

    public /* synthetic */ AbstractC2916h(Zh.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // Qh.InterfaceC3445b
    public Zh.f getName() {
        return this.f7479a;
    }

    private AbstractC2916h(Zh.f fVar) {
        this.f7479a = fVar;
    }
}
