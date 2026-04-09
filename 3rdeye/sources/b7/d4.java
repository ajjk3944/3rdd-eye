package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class d4 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final d4 f17735a = new d4();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17736b = "trimRight";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17737c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17738d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17739e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17737c = E.u.G(new a7.j(enumC1667d, false));
        f17738d = enumC1667d;
        f17739e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        CharSequence charSequenceSubSequence;
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!com.google.gson.internal.c.t(str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17737c;
    }

    @Override // a7.g
    public final String c() {
        return f17736b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17738d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17739e;
    }
}
