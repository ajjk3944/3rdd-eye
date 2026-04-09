package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class s1 {

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f1052c;

    /* renamed from: d, reason: collision with root package name */
    public static final p1 f1053d;

    /* renamed from: e, reason: collision with root package name */
    public static final q1 f1054e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ s1[] f1055f;

    /* renamed from: a, reason: collision with root package name */
    public final t1 f1056a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1057b;

    /* JADX INFO: Fake field, exist only in values array */
    s1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    s1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    s1 EF2;

    static {
        s1 s1Var = new s1("DOUBLE", 0, t1.DOUBLE, 1);
        s1 s1Var2 = new s1("FLOAT", 1, t1.FLOAT, 5);
        t1 t1Var = t1.LONG;
        s1 s1Var3 = new s1("INT64", 2, t1Var, 0);
        s1 s1Var4 = new s1("UINT64", 3, t1Var, 0);
        t1 t1Var2 = t1.INT;
        s1 s1Var5 = new s1("INT32", 4, t1Var2, 0);
        s1 s1Var6 = new s1("FIXED64", 5, t1Var, 1);
        s1 s1Var7 = new s1("FIXED32", 6, t1Var2, 5);
        s1 s1Var8 = new s1("BOOL", 7, t1.BOOLEAN, 0);
        o1 o1Var = new o1("STRING", 8, t1.STRING, 2);
        f1052c = o1Var;
        t1 t1Var3 = t1.MESSAGE;
        p1 p1Var = new p1("GROUP", 9, t1Var3, 3);
        f1053d = p1Var;
        q1 q1Var = new q1("MESSAGE", 10, t1Var3, 2);
        f1054e = q1Var;
        f1055f = new s1[]{s1Var, s1Var2, s1Var3, s1Var4, s1Var5, s1Var6, s1Var7, s1Var8, o1Var, p1Var, q1Var, new r1("BYTES", 11, t1.BYTE_STRING, 2), new s1("UINT32", 12, t1Var2, 0), new s1("ENUM", 13, t1.ENUM, 0), new s1("SFIXED32", 14, t1Var2, 5), new s1("SFIXED64", 15, t1Var, 1), new s1("SINT32", 16, t1Var2, 0), new s1("SINT64", 17, t1Var, 0)};
    }

    public s1(String str, int i4, t1 t1Var, int i10) {
        this.f1056a = t1Var;
        this.f1057b = i10;
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) f1055f.clone();
    }
}
