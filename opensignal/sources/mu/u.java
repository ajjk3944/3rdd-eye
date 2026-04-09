package mu;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public String f17037a;

    public static u a(a5.v vVar) {
        String str;
        vVar.F(2);
        int iT = vVar.t();
        int i10 = iT >> 1;
        int iT2 = ((vVar.t() >> 3) & 31) | ((iT & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        String strL = c7.a.l(iT2, iT2 >= 10 ? "." : ".0", sb2);
        u uVar = new u();
        uVar.f17037a = strL;
        return uVar;
    }
}
