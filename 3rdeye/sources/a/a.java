package A;

import A2.l;
import B.h;
import C.S;
import C.r;
import androidx.camera.core.impl.I;
import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import v.C5666v;
import v.H;
import v.P;
import w.C5687a;
import w.C5704r;

/* compiled from: Camera2CameraCoordinator.java */
/* loaded from: classes.dex */
public final class a implements D.a {

    /* renamed from: e, reason: collision with root package name */
    public int f4e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f3d = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f0a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2c = new ArrayList();

    public a(C5704r c5704r) {
        Set<Set<String>> hashSet = new HashSet<>();
        try {
            hashSet = c5704r.f47151a.e();
        } catch (C5687a unused) {
            S.b("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator<Set<String>> it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (P.a(str, c5704r) && P.a(str2, c5704r)) {
                        this.f3d.add(new HashSet(Arrays.asList(str, str2)));
                        HashMap map = this.f1b;
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        ((List) map.get(str)).add((String) arrayList.get(1));
                        ((List) map.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (C.P unused2) {
                    S.a("Camera2CameraCoordinator", Oo.h("Concurrent camera id pair: (", str, ", ", str2, ") is not backward compatible"));
                }
            }
        }
    }

    public final String a(String str) {
        h hVar;
        HashMap map = this.f1b;
        if (map.containsKey(str)) {
            for (String str2 : (List) map.get(str)) {
                Iterator it = this.f2c.iterator();
                while (it.hasNext()) {
                    r rVar = (r) it.next();
                    if (rVar instanceof H) {
                        ((H) rVar).getClass();
                        hVar = null;
                    } else {
                        I iE = ((I) rVar).e();
                        l.k("CameraInfo doesn't contain Camera2 implementation.", iE instanceof C5666v);
                        hVar = ((C5666v) iE).f46925c;
                    }
                    if (str2.equals(hVar.f325a.f46923a)) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }
}
