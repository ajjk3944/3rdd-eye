package nk;

/* loaded from: classes.dex */
public final class l0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18419a;

    public /* synthetic */ l0(int i10) {
        this.f18419a = i10;
    }

    @Override // nk.r
    public final Object fromJson(w wVar) {
        switch (this.f18419a) {
            case 0:
                return wVar.Z();
            case 1:
                return Boolean.valueOf(wVar.y());
            case 2:
                return Byte.valueOf((byte) p0.g(wVar, "a byte", -128, 255));
            case 3:
                String strZ = wVar.Z();
                if (strZ.length() <= 1) {
                    return Character.valueOf(strZ.charAt(0));
                }
                throw new bf.n("Expected a char but was " + h0.b.g('\"', "\"", strZ) + " at path " + wVar.q());
            case 4:
                return Double.valueOf(wVar.G());
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                float fG = (float) wVar.G();
                if (wVar.f18451x || !Float.isInfinite(fG)) {
                    return Float.valueOf(fG);
                }
                throw new bf.n("JSON forbids NaN and infinities: " + fG + " at path " + wVar.q());
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return Integer.valueOf(wVar.L());
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return Long.valueOf(wVar.R());
            default:
                return Short.valueOf((short) p0.g(wVar, "a short", -32768, 32767));
        }
    }

    @Override // nk.r
    public final void toJson(c0 c0Var, Object obj) {
        switch (this.f18419a) {
            case 0:
                c0Var.i0((String) obj);
                break;
            case 1:
                c0Var.n0(((Boolean) obj).booleanValue());
                break;
            case 2:
                c0Var.Z(((Byte) obj).intValue() & 255);
                break;
            case 3:
                c0Var.i0(((Character) obj).toString());
                break;
            case 4:
                c0Var.Y(((Double) obj).doubleValue());
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                Float f10 = (Float) obj;
                f10.getClass();
                c0Var.f0(f10);
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                c0Var.Z(((Integer) obj).intValue());
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                c0Var.Z(((Long) obj).longValue());
                break;
            default:
                c0Var.Z(((Short) obj).intValue());
                break;
        }
    }

    public final String toString() {
        switch (this.f18419a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return "JsonAdapter(Float)";
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "JsonAdapter(Integer)";
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
