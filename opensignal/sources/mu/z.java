package mu;

import java.util.Set;
import ku.f1;
import ku.i1;
import ku.l1;
import ku.o1;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f17057a = mq.l.B0(new iu.e[]{i1.f14565b, l1.f14577b, f1.f14550b, o1.f14592b});

    public static final boolean a(iu.e eVar) {
        br.l.e(eVar, "<this>");
        return eVar.g() && f17057a.contains(eVar);
    }
}
