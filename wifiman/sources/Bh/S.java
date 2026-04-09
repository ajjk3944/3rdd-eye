package Bh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class S {
    public static final void a(N n10, Zh.c fqName, Collection packageFragments) {
        AbstractC6492s.i(n10, "<this>");
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(packageFragments, "packageFragments");
        if (n10 instanceof T) {
            ((T) n10).a(fqName, packageFragments);
        } else {
            packageFragments.addAll(n10.c(fqName));
        }
    }

    public static final boolean b(N n10, Zh.c fqName) {
        AbstractC6492s.i(n10, "<this>");
        AbstractC6492s.i(fqName, "fqName");
        return n10 instanceof T ? ((T) n10).b(fqName) : c(n10, fqName).isEmpty();
    }

    public static final List c(N n10, Zh.c fqName) {
        AbstractC6492s.i(n10, "<this>");
        AbstractC6492s.i(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(n10, fqName, arrayList);
        return arrayList;
    }
}
