package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class c4 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final c4 f17714a = new c4();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17715b = "trimLeft";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17716c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17717d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17718e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17716c = E.u.G(new a7.j(enumC1667d, false));
        f17717d = enumC1667d;
        f17718e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        CharSequence charSequenceSubSequence;
        int i = 0;
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        int length = str.length();
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!com.google.gson.internal.c.t(str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17716c;
    }

    @Override // a7.g
    public final String c() {
        return f17715b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17717d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17718e;
    }
}
