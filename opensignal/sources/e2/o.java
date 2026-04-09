package e2;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import g1.i0;
import java.util.ArrayList;
import java.util.List;
import lq.b0;

/* loaded from: classes.dex */
public final class o extends br.n implements ar.n {
    public static final o B;
    public static final o D;
    public static final o E;
    public static final o F;
    public static final o G;
    public static final o H;
    public static final o I;
    public static final o J;
    public static final o K;
    public static final o L;
    public static final o M;
    public static final o N;
    public static final o O;

    /* renamed from: g, reason: collision with root package name */
    public static final o f7728g;

    /* renamed from: r, reason: collision with root package name */
    public static final o f7729r;

    /* renamed from: x, reason: collision with root package name */
    public static final o f7730x;

    /* renamed from: y, reason: collision with root package name */
    public static final o f7731y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7732d;

    static {
        int i10 = 2;
        f7728g = new o(i10, 0);
        f7729r = new o(i10, 1);
        f7730x = new o(i10, 2);
        f7731y = new o(i10, 3);
        B = new o(i10, 4);
        D = new o(i10, 5);
        E = new o(i10, 6);
        F = new o(i10, 7);
        G = new o(i10, 8);
        H = new o(i10, 9);
        I = new o(i10, 10);
        J = new o(i10, 11);
        K = new o(i10, 12);
        L = new o(i10, 13);
        M = new o(i10, 14);
        N = new o(i10, 15);
        O = new o(i10, 16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i10, int i11) {
        super(i10);
        this.f7732d = i11;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        String str;
        lq.e eVar;
        switch (this.f7732d) {
            case 0:
                return (a1.d) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListR0 = mq.o.R0(list);
                arrayListR0.addAll(list2);
                return arrayListR0;
            case 2:
                return (a1.n) obj;
            case 3:
                return (b0) obj;
            case 4:
                return (b0) obj;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return (b0) obj;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                f fVar = (f) obj;
                int i10 = ((f) obj2).f7685a;
                return fVar;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return (i0) obj;
            case 9:
                return (String) obj;
            case 10:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayListR02 = mq.o.R0(list3);
                arrayListR02.addAll(list4);
                return arrayListR02;
            case 11:
                Float f10 = (Float) obj;
                ((Number) obj2).floatValue();
                return f10;
            case 12:
                return (String) obj;
            case 13:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 14:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f7677a) == null) {
                    str = aVar2.f7677a;
                }
                if (aVar == null || (eVar = aVar.f7678b) == null) {
                    eVar = aVar2.f7678b;
                }
                return new a(str, eVar);
            case 15:
                return obj == null ? obj2 : obj;
            default:
                k kVar = (k) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                SemanticsConfiguration semanticsConfiguration = ((k) obj).f7717d;
                s sVar = p.f7748r;
                Object objG = semanticsConfiguration.f1191a.g(sVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = kVar.f7717d.f1191a.g(sVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
