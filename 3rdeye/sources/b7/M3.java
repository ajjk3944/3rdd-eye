package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import y9.C5819a;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class M3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final M3 f17418a = new M3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17419b = "encodeUri";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17420c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17421d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17422e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17420c = E.u.G(new a7.j(enumC1667d, false));
        f17421d = enumC1667d;
        f17422e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws UnsupportedEncodingException {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String strEncode = URLEncoder.encode((String) obj, C5819a.f48359b.name());
        kotlin.jvm.internal.l.e(strEncode, "encode(str, Charsets.UTF_8.name())");
        return y9.n.X(y9.n.X(y9.n.X(y9.n.X(y9.n.X(y9.n.X(strEncode, "+", "%20"), "%21", "!"), "%7E", "~"), "%27", "'"), "%28", "("), "%29", ")");
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17420c;
    }

    @Override // a7.g
    public final String c() {
        return f17419b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17421d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17422e;
    }
}
