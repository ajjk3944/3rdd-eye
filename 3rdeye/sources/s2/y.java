package s2;

import android.graphics.PointF;
import java.io.IOException;
import t2.AbstractC5601b;

/* compiled from: PointFParser.java */
/* loaded from: classes.dex */
public final class y implements K<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final y f46016a = new y();

    @Override // s2.K
    public final PointF a(AbstractC5601b abstractC5601b, float f10) throws IOException {
        AbstractC5601b.EnumC0535b enumC0535bF = abstractC5601b.F();
        if (enumC0535bF == AbstractC5601b.EnumC0535b.BEGIN_ARRAY) {
            return r.b(abstractC5601b, f10);
        }
        if (enumC0535bF == AbstractC5601b.EnumC0535b.BEGIN_OBJECT) {
            return r.b(abstractC5601b, f10);
        }
        if (enumC0535bF != AbstractC5601b.EnumC0535b.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + enumC0535bF);
        }
        PointF pointF = new PointF(((float) abstractC5601b.A()) * f10, ((float) abstractC5601b.A()) * f10);
        while (abstractC5601b.l()) {
            abstractC5601b.p0();
        }
        return pointF;
    }
}
