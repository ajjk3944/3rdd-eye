package j2;

import android.content.Context;
import androidx.work.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f21721f = k.f("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final o2.a f21722a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f21723b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21724c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Set f21725d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f21726e;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f21727a;

        public a(List list) {
            this.f21727a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f21727a.iterator();
            while (it.hasNext()) {
                ((h2.a) it.next()).a(d.this.f21726e);
            }
        }
    }

    public d(Context context, o2.a aVar) {
        this.f21723b = context.getApplicationContext();
        this.f21722a = aVar;
    }

    public void a(h2.a aVar) {
        synchronized (this.f21724c) {
            try {
                if (this.f21725d.add(aVar)) {
                    if (this.f21725d.size() == 1) {
                        this.f21726e = b();
                        k.c().a(f21721f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f21726e), new Throwable[0]);
                        e();
                    }
                    aVar.a(this.f21726e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Object b();

    public void c(h2.a aVar) {
        synchronized (this.f21724c) {
            try {
                if (this.f21725d.remove(aVar) && this.f21725d.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Object obj) {
        synchronized (this.f21724c) {
            try {
                Object obj2 = this.f21726e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f21726e = obj;
                    this.f21722a.a().execute(new a(new ArrayList(this.f21725d)));
                }
            } finally {
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
