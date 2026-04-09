package Q2;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Set f19146a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Set f19147b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f19148c;

    public boolean a(com.bumptech.glide.request.c cVar) {
        boolean z10 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = this.f19146a.remove(cVar);
        if (!this.f19147b.remove(cVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            cVar.clear();
        }
        return z10;
    }

    public void b() {
        Iterator it = W2.l.j(this.f19146a).iterator();
        while (it.hasNext()) {
            a((com.bumptech.glide.request.c) it.next());
        }
        this.f19147b.clear();
    }

    public void c() {
        this.f19148c = true;
        for (com.bumptech.glide.request.c cVar : W2.l.j(this.f19146a)) {
            if (cVar.isRunning() || cVar.isComplete()) {
                cVar.clear();
                this.f19147b.add(cVar);
            }
        }
    }

    public void d() {
        this.f19148c = true;
        for (com.bumptech.glide.request.c cVar : W2.l.j(this.f19146a)) {
            if (cVar.isRunning()) {
                cVar.e();
                this.f19147b.add(cVar);
            }
        }
    }

    public void e() {
        for (com.bumptech.glide.request.c cVar : W2.l.j(this.f19146a)) {
            if (!cVar.isComplete() && !cVar.g()) {
                cVar.clear();
                if (this.f19148c) {
                    this.f19147b.add(cVar);
                } else {
                    cVar.i();
                }
            }
        }
    }

    public void f() {
        this.f19148c = false;
        for (com.bumptech.glide.request.c cVar : W2.l.j(this.f19146a)) {
            if (!cVar.isComplete() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        this.f19147b.clear();
    }

    public void g(com.bumptech.glide.request.c cVar) {
        this.f19146a.add(cVar);
        if (!this.f19148c) {
            cVar.i();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f19147b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f19146a.size() + ", isPaused=" + this.f19148c + "}";
    }
}
