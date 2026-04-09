package nb;

import aj.AbstractC3866G;
import aj.AbstractC3874h;
import aj.j;
import aj.k;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;

/* loaded from: classes3.dex */
public final class g extends AbstractC3874h {

    /* renamed from: c, reason: collision with root package name */
    public static final g f54534c = new g();

    private g() {
        super(O.b(C6923f.class));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // aj.AbstractC3874h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Vi.b g(j element) {
        AbstractC3866G abstractC3866GI;
        AbstractC6492s.i(element, "element");
        j jVar = (j) k.h(element).get("event");
        String strB = (jVar == null || (abstractC3866GI = k.i(jVar)) == null) ? null : abstractC3866GI.b();
        if (strB != null) {
            int iHashCode = strB.hashCode();
            if (iHashCode != -1412808770) {
                if (iHashCode != 161627768) {
                    if (iHashCode == 999893848 && strB.equals("icecandidate")) {
                        return C6920c.INSTANCE.serializer();
                    }
                } else if (strB.equals("sdpcomplete")) {
                    return i.INSTANCE.serializer();
                }
            } else if (strB.equals("answer")) {
                return C6918a.INSTANCE.serializer();
            }
        }
        return C6923f.INSTANCE.serializer();
    }
}
