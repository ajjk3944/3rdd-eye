package g4;

import java.io.IOException;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public final class j extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20227a;

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        switch (this.f20227a) {
            case 0:
                if (c2762a.B() != 9) {
                    return Double.valueOf(c2762a.s());
                }
                c2762a.x();
                return null;
            case 1:
                if (c2762a.B() != 9) {
                    return Float.valueOf((float) c2762a.s());
                }
                c2762a.x();
                return null;
            default:
                c2762a.H();
                return null;
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        switch (this.f20227a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    m.a(dDoubleValue);
                    c2764c.t(dDoubleValue);
                    break;
                } else {
                    c2764c.o();
                    break;
                }
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    m.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    c2764c.v(numberValueOf);
                    break;
                } else {
                    c2764c.o();
                    break;
                }
            default:
                c2764c.o();
                break;
        }
    }

    public String toString() {
        switch (this.f20227a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
