package s2;

import android.graphics.Color;
import java.io.IOException;
import t2.AbstractC5601b;

/* compiled from: ColorParser.java */
/* renamed from: s2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5561g implements K<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5561g f45978a = new C5561g();

    @Override // s2.K
    public final Integer a(AbstractC5601b abstractC5601b, float f10) throws IOException {
        boolean z10 = abstractC5601b.F() == AbstractC5601b.EnumC0535b.BEGIN_ARRAY;
        if (z10) {
            abstractC5601b.a();
        }
        double dA = abstractC5601b.A();
        double dA2 = abstractC5601b.A();
        double dA3 = abstractC5601b.A();
        double dA4 = abstractC5601b.F() == AbstractC5601b.EnumC0535b.NUMBER ? abstractC5601b.A() : 1.0d;
        if (z10) {
            abstractC5601b.d();
        }
        if (dA <= 1.0d && dA2 <= 1.0d && dA3 <= 1.0d) {
            dA *= 255.0d;
            dA2 *= 255.0d;
            dA3 *= 255.0d;
            if (dA4 <= 1.0d) {
                dA4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dA4, (int) dA, (int) dA2, (int) dA3));
    }
}
