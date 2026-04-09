package wv;

import br.l;
import ir.d;
import ir.f0;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f24681a = new ConcurrentHashMap();

    public static final String a(d dVar) {
        l.e(dVar, "<this>");
        ConcurrentHashMap concurrentHashMap = f24681a;
        String str = (String) concurrentHashMap.get(dVar);
        if (str != null) {
            return str;
        }
        String name = f0.D(dVar).getName();
        concurrentHashMap.put(dVar, name);
        return name;
    }
}
