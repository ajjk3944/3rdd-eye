package Bh;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class H extends q0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f1753a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f1754b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(List underlyingPropertyNamesToTypes) {
        super(null);
        AbstractC6492s.i(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f1753a = underlyingPropertyNamesToTypes;
        Map mapR = Zg.U.r(c());
        if (mapR.size() != c().size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f1754b = mapR;
    }

    @Override // Bh.q0
    public boolean a(Zh.f name) {
        AbstractC6492s.i(name, "name");
        return this.f1754b.containsKey(name);
    }

    public List c() {
        return this.f1753a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + c() + ')';
    }
}
