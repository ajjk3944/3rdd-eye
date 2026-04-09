package nr;

import as.a0;
import com.google.android.gms.internal.measurement.e5;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import qs.b;
import qs.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f18517a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f18518b;

    static {
        List listI = e5.I(a0.f2166a, a0.f2173h, a0.f2174i, a0.f2168c, a0.f2169d, a0.f2171f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b.j((c) it.next()));
        }
        f18517a = linkedHashSet;
        f18518b = b.j(a0.f2172g);
    }
}
