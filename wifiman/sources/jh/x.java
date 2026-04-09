package Jh;

import Rh.C3484l;
import Rh.EnumC3483k;
import Zg.AbstractC3689v;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private static final List f10210a;

    /* renamed from: b, reason: collision with root package name */
    private static final List f10211b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f10212c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f10213d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map f10214e;

    static {
        EnumC3109c enumC3109c = EnumC3109c.FIELD;
        EnumC3109c enumC3109c2 = EnumC3109c.METHOD_RETURN_TYPE;
        EnumC3109c enumC3109c3 = EnumC3109c.VALUE_PARAMETER;
        List listO = AbstractC3689v.o(enumC3109c, enumC3109c2, enumC3109c3, EnumC3109c.TYPE_PARAMETER_BOUNDS, EnumC3109c.TYPE_USE);
        f10210a = listO;
        List listE = AbstractC3689v.e(enumC3109c3);
        f10211b = listE;
        Zh.c cVarK = J.k();
        EnumC3483k enumC3483k = EnumC3483k.NOT_NULL;
        Map mapK = Zg.U.k(Yg.z.a(cVarK, new w(new C3484l(enumC3483k, false, 2, null), listO, false)), Yg.z.a(J.i(), new w(new C3484l(enumC3483k, false, 2, null), listO, false)), Yg.z.a(J.j(), new w(new C3484l(EnumC3483k.FORCE_FLEXIBILITY, false, 2, null), listO, false, 4, null)));
        f10212c = mapK;
        Map mapK2 = Zg.U.k(Yg.z.a(J.d(), new w(new C3484l(enumC3483k, false, 2, null), listE, false, 4, null)), Yg.z.a(J.e(), new w(new C3484l(EnumC3483k.NULLABLE, false, 2, null), listE, false, 4, null)));
        f10213d = mapK2;
        f10214e = Zg.U.n(mapK, mapK2);
    }

    public static final Map a() {
        return f10214e;
    }

    public static final Map b() {
        return f10212c;
    }
}
