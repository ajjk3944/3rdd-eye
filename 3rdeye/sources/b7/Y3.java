package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class Y3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final Y3 f17635a = new Y3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17636b = "testRegex";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17637c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17638d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17639e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17637c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17638d = EnumC1667d.BOOLEAN;
        f17639e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
        try {
            return Boolean.valueOf(Pattern.compile((String) obj2).matcher(str).find());
        } catch (PatternSyntaxException unused) {
            List<? extends Object> list2 = list;
            ArrayList arrayList = new ArrayList(C2092m.T(list2, 10));
            for (Object objX : list2) {
                if (objX instanceof String) {
                    objX = y9.n.X((String) objX, "\\", "\\\\");
                }
                arrayList.add(objX);
            }
            C1666c.d(f17636b, arrayList, "Invalid regular expression.", null);
            throw null;
        }
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17637c;
    }

    @Override // a7.g
    public final String c() {
        return f17636b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17638d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17639e;
    }
}
