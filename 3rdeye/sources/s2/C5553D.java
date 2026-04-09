package s2;

import java.io.IOException;
import t2.AbstractC5601b;

/* compiled from: ScaleXYParser.java */
/* renamed from: s2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5553D implements K<v2.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5553D f45960a = new C5553D();

    @Override // s2.K
    public final v2.c a(AbstractC5601b abstractC5601b, float f10) throws IOException {
        boolean z10 = abstractC5601b.F() == AbstractC5601b.EnumC0535b.BEGIN_ARRAY;
        if (z10) {
            abstractC5601b.a();
        }
        float fA = (float) abstractC5601b.A();
        float fA2 = (float) abstractC5601b.A();
        while (abstractC5601b.l()) {
            abstractC5601b.p0();
        }
        if (z10) {
            abstractC5601b.d();
        }
        return new v2.c((fA / 100.0f) * f10, (fA2 / 100.0f) * f10);
    }
}
