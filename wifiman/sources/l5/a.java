package L5;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import W5.b;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import o6.C7093d;
import org.conscrypt.PSKKeyManager;
import t6.C8034b;

/* loaded from: classes3.dex */
public abstract class a {
    public static final C8034b a(long j10, long j11, C7093d c7093d, TextUtils.TruncateAt truncateAt, int i10, float f10, float f11, float f12, float f13, Typeface typeface, Paint.Align align, InterfaceC3540l interfaceC3540l, int i11, int i12, int i13) {
        interfaceC3540l.e(-991576272);
        long jB = (i13 & 1) != 0 ? b.a(interfaceC3540l, 0).a().b() : j10;
        long jG = (i13 & 2) != 0 ? b.a(interfaceC3540l, 0).a().g() : j11;
        C7093d c7093dA = (i13 & 4) != 0 ? b.a(interfaceC3540l, 0).a().a() : c7093d;
        TextUtils.TruncateAt truncateAt2 = (i13 & 8) != 0 ? TextUtils.TruncateAt.END : truncateAt;
        int iE = (i13 & 16) != 0 ? b.a(interfaceC3540l, 0).a().e() : i10;
        float fJ = (i13 & 32) != 0 ? b.a(interfaceC3540l, 0).a().j() : f10;
        float fD = (i13 & 64) != 0 ? b.a(interfaceC3540l, 0).a().d() : f11;
        float fI = (i13 & 128) != 0 ? b.a(interfaceC3540l, 0).a().i() : f12;
        float fC = (i13 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? b.a(interfaceC3540l, 0).a().c() : f13;
        int i14 = iE;
        Typeface typefaceH = (i13 & 512) != 0 ? b.a(interfaceC3540l, 0).a().h() : typeface;
        Paint.Align alignF = (i13 & 1024) != 0 ? b.a(interfaceC3540l, 0).a().f() : align;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-991576272, i11, i12, "com.patrykandpatrick.vico.compose.axis.axisLabelComponent (AxisComponents.kt:60)");
        }
        C8034b c8034bC = P5.a.c(jB, jG, c7093dA, truncateAt2, i14, S5.a.a(fD, fJ), S5.a.a(fC, fI), typefaceH, alignF, interfaceC3540l, (i11 & 57344) | (i11 & 14) | 19137024 | (i11 & 112) | (i11 & 7168) | ((i12 << 24) & 234881024), 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return c8034bC;
    }
}
