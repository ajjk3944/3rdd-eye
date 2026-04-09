package T0;

import L0.AbstractC3179i;
import L0.C3174d;
import L0.X;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f21337a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap f21338b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f21339c = new WeakHashMap();

    public final ClickableSpan a(C3174d.c cVar) {
        WeakHashMap weakHashMap = this.f21339c;
        Object jVar = weakHashMap.get(cVar);
        if (jVar == null) {
            jVar = new j((AbstractC3179i) cVar.g());
            weakHashMap.put(cVar, jVar);
        }
        return (ClickableSpan) jVar;
    }

    public final URLSpan b(C3174d.c cVar) {
        WeakHashMap weakHashMap = this.f21338b;
        Object uRLSpan = weakHashMap.get(cVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(((AbstractC3179i.b) cVar.g()).c());
            weakHashMap.put(cVar, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }

    public final URLSpan c(X x10) {
        WeakHashMap weakHashMap = this.f21337a;
        Object uRLSpan = weakHashMap.get(x10);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(x10.a());
            weakHashMap.put(x10, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }
}
