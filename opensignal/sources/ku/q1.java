package ku;

/* loaded from: classes.dex */
public final class q1 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f14602a = new q1();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f14603b = new v0("kotlin.uuid.Uuid", iu.c.f12996l);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        String strConcat;
        String strN = cVar.n();
        br.l.e(strN, "uuidString");
        int length = strN.length();
        if (length == 32) {
            long jB = tt.d.b(strN, 0, 16);
            long jB2 = tt.d.b(strN, 16, 32);
            if (jB != 0 || jB2 != 0) {
                return new vt.a(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (strN.length() <= 64) {
                    strConcat = strN;
                } else {
                    String strSubstring = strN.substring(0, 64);
                    br.l.d(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb2.append(strConcat);
                sb2.append("\" of length ");
                sb2.append(strN.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            long jB3 = tt.d.b(strN, 0, 8);
            xu.d.h(8, strN);
            long jB4 = tt.d.b(strN, 9, 13);
            xu.d.h(13, strN);
            long jB5 = tt.d.b(strN, 14, 18);
            xu.d.h(18, strN);
            long jB6 = tt.d.b(strN, 19, 23);
            xu.d.h(23, strN);
            long j = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = tt.d.b(strN, 24, 36) | (jB6 << 48);
            if (j != 0 || jB7 != 0) {
                return new vt.a(j, jB7);
            }
        }
        return vt.a.f23968g;
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14603b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        vt.a aVar = (vt.a) obj;
        br.l.e(aVar, "value");
        dVar.r(aVar.toString());
    }
}
