package Gh;

import Gh.E;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class H extends E implements Qh.C {

    /* renamed from: b, reason: collision with root package name */
    private final WildcardType f7454b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection f7455c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7456d;

    public H(WildcardType reflectType) {
        AbstractC6492s.i(reflectType, "reflectType");
        this.f7454b = reflectType;
        this.f7455c = AbstractC3689v.l();
    }

    @Override // Qh.C
    public boolean J() {
        AbstractC6492s.h(R().getUpperBounds(), "getUpperBounds(...)");
        return !AbstractC6492s.d(AbstractC3682n.a0(r0), Object.class);
    }

    @Override // Qh.C
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public E B() {
        Type[] upperBounds = R().getUpperBounds();
        Type[] lowerBounds = R().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + R());
        }
        if (lowerBounds.length == 1) {
            E.a aVar = E.f7448a;
            AbstractC6492s.f(lowerBounds);
            Object objQ0 = AbstractC3682n.Q0(lowerBounds);
            AbstractC6492s.h(objQ0, "single(...)");
            return aVar.a((Type) objQ0);
        }
        if (upperBounds.length == 1) {
            AbstractC6492s.f(upperBounds);
            Type type = (Type) AbstractC3682n.Q0(upperBounds);
            if (!AbstractC6492s.d(type, Object.class)) {
                E.a aVar2 = E.f7448a;
                AbstractC6492s.f(type);
                return aVar2.a(type);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Gh.E
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public WildcardType R() {
        return this.f7454b;
    }

    @Override // Qh.InterfaceC3447d
    public Collection getAnnotations() {
        return this.f7455c;
    }

    @Override // Qh.InterfaceC3447d
    public boolean h() {
        return this.f7456d;
    }
}
