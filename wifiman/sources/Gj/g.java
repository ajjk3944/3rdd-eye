package Gj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public class g implements Ej.a {

    /* renamed from: a, reason: collision with root package name */
    boolean f7533a = false;

    /* renamed from: b, reason: collision with root package name */
    final Map f7534b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final LinkedBlockingQueue f7535c = new LinkedBlockingQueue();

    @Override // Ej.a
    public synchronized Ej.b a(String str) {
        f fVar;
        fVar = (f) this.f7534b.get(str);
        if (fVar == null) {
            fVar = new f(str, this.f7535c, this.f7533a);
            this.f7534b.put(str, fVar);
        }
        return fVar;
    }

    public void b() {
        this.f7534b.clear();
        this.f7535c.clear();
    }

    public LinkedBlockingQueue c() {
        return this.f7535c;
    }

    public List d() {
        return new ArrayList(this.f7534b.values());
    }

    public void e() {
        this.f7533a = true;
    }
}
