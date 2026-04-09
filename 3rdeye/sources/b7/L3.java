package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import y9.C5819a;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class L3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final L3 f17398a = new L3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17399b = "decodeUri";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17400c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17401d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17402e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17400c = E.u.G(new a7.j(enumC1667d, false));
        f17401d = enumC1667d;
        f17402e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws UnsupportedEncodingException {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String strDecode = URLDecoder.decode((String) obj, C5819a.f48359b.name());
        kotlin.jvm.internal.l.e(strDecode, "decode(str, Charsets.UTF_8.name())");
        return strDecode;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17400c;
    }

    @Override // a7.g
    public final String c() {
        return f17399b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17401d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17402e;
    }
}
