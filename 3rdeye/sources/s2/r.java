package s2;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import t2.AbstractC5601b;

/* compiled from: JsonUtils.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC5601b.a f46000a = AbstractC5601b.a.a("x", "y");

    /* compiled from: JsonUtils.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46001a;

        static {
            int[] iArr = new int[AbstractC5601b.EnumC0535b.values().length];
            f46001a = iArr;
            try {
                iArr[AbstractC5601b.EnumC0535b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46001a[AbstractC5601b.EnumC0535b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46001a[AbstractC5601b.EnumC0535b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static int a(AbstractC5601b abstractC5601b) throws IOException {
        abstractC5601b.a();
        int iA = (int) (abstractC5601b.A() * 255.0d);
        int iA2 = (int) (abstractC5601b.A() * 255.0d);
        int iA3 = (int) (abstractC5601b.A() * 255.0d);
        while (abstractC5601b.l()) {
            abstractC5601b.p0();
        }
        abstractC5601b.d();
        return Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, iA, iA2, iA3);
    }

    public static PointF b(AbstractC5601b abstractC5601b, float f10) throws IOException {
        int i = a.f46001a[abstractC5601b.F().ordinal()];
        if (i == 1) {
            float fA = (float) abstractC5601b.A();
            float fA2 = (float) abstractC5601b.A();
            while (abstractC5601b.l()) {
                abstractC5601b.p0();
            }
            return new PointF(fA * f10, fA2 * f10);
        }
        if (i == 2) {
            abstractC5601b.a();
            float fA3 = (float) abstractC5601b.A();
            float fA4 = (float) abstractC5601b.A();
            while (abstractC5601b.F() != AbstractC5601b.EnumC0535b.END_ARRAY) {
                abstractC5601b.p0();
            }
            abstractC5601b.d();
            return new PointF(fA3 * f10, fA4 * f10);
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unknown point starts with " + abstractC5601b.F());
        }
        abstractC5601b.c();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (abstractC5601b.l()) {
            int iK0 = abstractC5601b.k0(f46000a);
            if (iK0 == 0) {
                fD = d(abstractC5601b);
            } else if (iK0 != 1) {
                abstractC5601b.m0();
                abstractC5601b.p0();
            } else {
                fD2 = d(abstractC5601b);
            }
        }
        abstractC5601b.e();
        return new PointF(fD * f10, fD2 * f10);
    }

    public static ArrayList c(AbstractC5601b abstractC5601b, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        abstractC5601b.a();
        while (abstractC5601b.F() == AbstractC5601b.EnumC0535b.BEGIN_ARRAY) {
            abstractC5601b.a();
            arrayList.add(b(abstractC5601b, f10));
            abstractC5601b.d();
        }
        abstractC5601b.d();
        return arrayList;
    }

    public static float d(AbstractC5601b abstractC5601b) throws IOException {
        AbstractC5601b.EnumC0535b enumC0535bF = abstractC5601b.F();
        int i = a.f46001a[enumC0535bF.ordinal()];
        if (i == 1) {
            return (float) abstractC5601b.A();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + enumC0535bF);
        }
        abstractC5601b.a();
        float fA = (float) abstractC5601b.A();
        while (abstractC5601b.l()) {
            abstractC5601b.p0();
        }
        abstractC5601b.d();
        return fA;
    }
}
