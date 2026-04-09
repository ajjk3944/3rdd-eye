package as;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f2235a = new n();

    public static final g0 a(String str, String str2, String str3, String str4) {
        ArrayList arrayList = j0.f2224a;
        qs.g gVarE = qs.g.e(str2);
        String str5 = str2 + '(' + str3 + ')' + str4;
        br.l.e(str, "internalName");
        br.l.e(str5, "jvmDescriptor");
        return new g0(gVarE, str + '.' + str5);
    }
}
