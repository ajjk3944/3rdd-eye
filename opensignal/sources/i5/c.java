package i5;

import androidx.media3.common.e0;
import java.util.ArrayList;
import java.util.HashMap;
import mq.o;

/* loaded from: classes.dex */
public final class c implements k, vg.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f11238a;

    public /* synthetic */ c(Object obj) {
        this.f11238a = obj;
    }

    public static c a(Object obj) {
        if (obj != null) {
            return new c(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public static b b(kc.f fVar) {
        new io.sentry.internal.debugmeta.c(5);
        fVar.getClass();
        new HashMap();
        throw null;
    }

    public j c(e0 e0Var) {
        e0Var.f1608d.getClass();
        e0Var.f1608d.getClass();
        return j.f11245a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public void d(uo.b bVar) {
        ?? r02 = this.f11238a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : r02) {
            if (((uo.b) obj).f23616a != bVar.f23616a) {
                arrayList.add(obj);
            }
        }
        this.f11238a = o.F0(arrayList, bVar);
    }

    @Override // kq.a
    public Object get() {
        return this.f11238a;
    }

    public c() {
        this.f11238a = new Object();
    }
}
