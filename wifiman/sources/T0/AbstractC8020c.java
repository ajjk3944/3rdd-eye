package t0;

import Y0.h;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import m0.AbstractC6697d0;
import m0.AbstractC6713l0;
import m0.AbstractC6715m0;
import m0.AbstractC6737x0;
import m0.C6733v0;
import m0.W0;
import m0.j1;
import m0.k1;
import m0.l1;
import org.conscrypt.PSKKeyManager;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.C7868d;
import s0.i;
import s0.n;
import v1.d;
import v1.k;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8020c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f61708a = 0;

    public static final C7868d.a a(C8018a c8018a, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jE;
        int iZ;
        ColorStateList colorStateListE;
        C8019b c8019b = C8019b.f61682a;
        TypedArray typedArrayK = c8018a.k(resources, theme, attributeSet, c8019b.F());
        boolean zD = c8018a.d(typedArrayK, "autoMirrored", c8019b.a(), false);
        float fG = c8018a.g(typedArrayK, "viewportWidth", c8019b.H(), 0.0f);
        float fG2 = c8018a.g(typedArrayK, "viewportHeight", c8019b.G(), 0.0f);
        if (fG <= 0.0f) {
            throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fG2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float fA = c8018a.a(typedArrayK, c8019b.I(), 0.0f);
        float fA2 = c8018a.a(typedArrayK, c8019b.n(), 0.0f);
        if (typedArrayK.hasValue(c8019b.D())) {
            TypedValue typedValue = new TypedValue();
            typedArrayK.getValue(c8019b.D(), typedValue);
            jE = (typedValue.type == 2 || (colorStateListE = c8018a.e(typedArrayK, theme, "tint", c8019b.D())) == null) ? C6733v0.f52951b.e() : AbstractC6737x0.b(colorStateListE.getDefaultColor());
        } else {
            jE = C6733v0.f52951b.e();
        }
        long j10 = jE;
        int iC = c8018a.c(typedArrayK, c8019b.E(), -1);
        if (iC == -1) {
            iZ = AbstractC6697d0.f52884a.z();
        } else if (iC == 3) {
            iZ = AbstractC6697d0.f52884a.B();
        } else if (iC == 5) {
            iZ = AbstractC6697d0.f52884a.z();
        } else if (iC != 9) {
            switch (iC) {
                case 14:
                    iZ = AbstractC6697d0.f52884a.q();
                    break;
                case 15:
                    iZ = AbstractC6697d0.f52884a.v();
                    break;
                case 16:
                    iZ = AbstractC6697d0.f52884a.t();
                    break;
                default:
                    iZ = AbstractC6697d0.f52884a.z();
                    break;
            }
        } else {
            iZ = AbstractC6697d0.f52884a.y();
        }
        int i10 = iZ;
        float fJ = h.j(fA / resources.getDisplayMetrics().density);
        float fJ2 = h.j(fA2 / resources.getDisplayMetrics().density);
        typedArrayK.recycle();
        return new C7868d.a(null, fJ, fJ2, fG, fG2, j10, i10, zD, 1, null);
    }

    private static final int b(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : k1.f52924a.c() : k1.f52924a.b() : k1.f52924a.a();
    }

    private static final int c(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : l1.f52930a.a() : l1.f52930a.c() : l1.f52930a.b();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    private static final AbstractC6713l0 e(d dVar) {
        if (!dVar.l()) {
            return null;
        }
        Shader shaderF = dVar.f();
        return shaderF != null ? AbstractC6715m0.a(shaderF) : new j1(AbstractC6737x0.b(dVar.e()), null);
    }

    public static final void f(C8018a c8018a, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C7868d.a aVar) {
        C8019b c8019b = C8019b.f61682a;
        TypedArray typedArrayK = c8018a.k(resources, theme, attributeSet, c8019b.b());
        String strI = c8018a.i(typedArrayK, c8019b.c());
        if (strI == null) {
            strI = "";
        }
        String str = strI;
        String strI2 = c8018a.i(typedArrayK, c8019b.d());
        List listD = strI2 == null ? n.d() : i.b(c8018a.f61669c, strI2, null, 2, null);
        typedArrayK.recycle();
        aVar.a((254 & 1) != 0 ? "" : str, (254 & 2) != 0 ? 0.0f : 0.0f, (254 & 4) != 0 ? 0.0f : 0.0f, (254 & 8) != 0 ? 0.0f : 0.0f, (254 & 16) != 0 ? 1.0f : 0.0f, (254 & 32) == 0 ? 0.0f : 1.0f, (254 & 64) != 0 ? 0.0f : 0.0f, (254 & 128) == 0 ? 0.0f : 0.0f, (254 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? n.d() : listD);
    }

    public static final int g(C8018a c8018a, Resources resources, AttributeSet attributeSet, Resources.Theme theme, C7868d.a aVar, int i10) throws XmlPullParserException {
        int eventType = c8018a.j().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !AbstractC6492s.d("group", c8018a.j().getName())) {
                return i10;
            }
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                aVar.f();
            }
            return 0;
        }
        String name = c8018a.j().getName();
        if (name == null) {
            return i10;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i10;
            }
            f(c8018a, resources, theme, attributeSet, aVar);
            return i10 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i10;
            }
            i(c8018a, resources, theme, attributeSet, aVar);
            return i10;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i10;
        }
        h(c8018a, resources, theme, attributeSet, aVar);
        return i10;
    }

    public static final void h(C8018a c8018a, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C7868d.a aVar) {
        C8019b c8019b = C8019b.f61682a;
        TypedArray typedArrayK = c8018a.k(resources, theme, attributeSet, c8019b.e());
        float fG = c8018a.g(typedArrayK, "rotation", c8019b.i(), 0.0f);
        float fB = c8018a.b(typedArrayK, c8019b.g(), 0.0f);
        float fB2 = c8018a.b(typedArrayK, c8019b.h(), 0.0f);
        float fG2 = c8018a.g(typedArrayK, "scaleX", c8019b.j(), 1.0f);
        float fG3 = c8018a.g(typedArrayK, "scaleY", c8019b.k(), 1.0f);
        float fG4 = c8018a.g(typedArrayK, "translateX", c8019b.l(), 0.0f);
        float fG5 = c8018a.g(typedArrayK, "translateY", c8019b.m(), 0.0f);
        String strI = c8018a.i(typedArrayK, c8019b.f());
        if (strI == null) {
            strI = "";
        }
        typedArrayK.recycle();
        aVar.a(strI, fG, fB, fB2, fG2, fG3, fG4, fG5, n.d());
    }

    public static final void i(C8018a c8018a, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C7868d.a aVar) {
        C8019b c8019b = C8019b.f61682a;
        TypedArray typedArrayK = c8018a.k(resources, theme, attributeSet, c8019b.o());
        if (!k.h(c8018a.j(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strI = c8018a.i(typedArrayK, c8019b.r());
        if (strI == null) {
            strI = "";
        }
        String str = strI;
        String strI2 = c8018a.i(typedArrayK, c8019b.s());
        List listD = strI2 == null ? n.d() : i.b(c8018a.f61669c, strI2, null, 2, null);
        d dVarF = c8018a.f(typedArrayK, theme, "fillColor", c8019b.q(), 0);
        float fG = c8018a.g(typedArrayK, "fillAlpha", c8019b.p(), 1.0f);
        int iB = b(c8018a.h(typedArrayK, "strokeLineCap", c8019b.v(), -1), k1.f52924a.a());
        int iC = c(c8018a.h(typedArrayK, "strokeLineJoin", c8019b.w(), -1), l1.f52930a.a());
        float fG2 = c8018a.g(typedArrayK, "strokeMiterLimit", c8019b.x(), 1.0f);
        d dVarF2 = c8018a.f(typedArrayK, theme, "strokeColor", c8019b.u(), 0);
        float fG3 = c8018a.g(typedArrayK, "strokeAlpha", c8019b.t(), 1.0f);
        float fG4 = c8018a.g(typedArrayK, "strokeWidth", c8019b.y(), 1.0f);
        float fG5 = c8018a.g(typedArrayK, "trimPathEnd", c8019b.z(), 1.0f);
        float fG6 = c8018a.g(typedArrayK, "trimPathOffset", c8019b.B(), 0.0f);
        float fG7 = c8018a.g(typedArrayK, "trimPathStart", c8019b.C(), 0.0f);
        int iH = c8018a.h(typedArrayK, "fillType", c8019b.A(), f61708a);
        typedArrayK.recycle();
        AbstractC6713l0 abstractC6713l0E = e(dVarF);
        AbstractC6713l0 abstractC6713l0E2 = e(dVarF2);
        W0.a aVar2 = W0.f52862a;
        aVar.c(listD, iH == 0 ? aVar2.b() : aVar2.a(), str, abstractC6713l0E, fG, abstractC6713l0E2, fG3, fG4, iB, iC, fG2, fG7, fG5, fG6);
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
