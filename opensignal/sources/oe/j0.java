package oe;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19339a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19340b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19341c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.f19339a = obj;
        this.f19340b = obj2;
        this.f19341c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f19339a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f19340b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f19341c);
        StringBuilder sbS = c7.a.s(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
        sbS.append(" and ");
        sbS.append(strValueOf3);
        sbS.append("=");
        sbS.append(strValueOf4);
        return new IllegalArgumentException(sbS.toString());
    }
}
