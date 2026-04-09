package lr;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b extends br.n implements ar.k {
    public static final b B;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;

    /* renamed from: g, reason: collision with root package name */
    public static final b f15596g;

    /* renamed from: r, reason: collision with root package name */
    public static final b f15597r;

    /* renamed from: x, reason: collision with root package name */
    public static final b f15598x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f15599y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15600d;

    static {
        int i10 = 1;
        f15596g = new b(i10, 0);
        f15597r = new b(i10, 1);
        f15598x = new b(i10, 2);
        f15599y = new b(i10, 3);
        B = new b(i10, 4);
        D = new b(i10, 5);
        E = new b(i10, 6);
        F = new b(i10, 7);
        G = new b(i10, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f15600d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f15600d) {
            case 0:
                Class cls = (Class) obj;
                br.l.e(cls, "it");
                return new z(cls);
            case 1:
                Class cls2 = (Class) obj;
                br.l.e(cls2, "it");
                return new r0(cls2);
            case 2:
                Class<?> returnType = ((Method) obj).getReturnType();
                br.l.d(returnType, "it.returnType");
                return xr.d.b(returnType);
            case 3:
                Class cls3 = (Class) obj;
                br.l.d(cls3, "it");
                return xr.d.b(cls3);
            case 4:
                rr.u uVar = (rr.u) obj;
                br.l.e(uVar, "descriptor");
                return ss.j.f22245e.w(uVar) + " | " + x1.c(uVar).i();
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                rr.m0 m0Var = (rr.m0) obj;
                br.l.e(m0Var, "descriptor");
                return ss.j.f22245e.w(m0Var) + " | " + x1.b(m0Var).i();
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ss.j jVar = w1.f15712a;
                ht.x type = ((ur.q0) obj).getType();
                br.l.d(type, "it.type");
                return w1.d(type);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ss.j jVar2 = w1.f15712a;
                ht.x type2 = ((ur.q0) obj).getType();
                br.l.d(type2, "it.type");
                return w1.d(type2);
            default:
                Class cls4 = (Class) obj;
                br.l.d(cls4, "it");
                return xr.d.b(cls4);
        }
    }
}
