package h2;

import android.content.Context;
import androidx.work.k;
import i2.c;
import i2.e;
import i2.f;
import i2.g;
import i2.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class d implements c.a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f21387d = k.f("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final c f21388a;

    /* renamed from: b, reason: collision with root package name */
    public final i2.c[] f21389b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21390c;

    public d(Context context, o2.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f21388a = cVar;
        this.f21389b = new i2.c[]{new i2.a(applicationContext, aVar), new i2.b(applicationContext, aVar), new h(applicationContext, aVar), new i2.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f21390c = new Object();
    }

    @Override // i2.c.a
    public void a(List list) {
        synchronized (this.f21390c) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (c(str)) {
                        k.c().a(f21387d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                c cVar = this.f21388a;
                if (cVar != null) {
                    cVar.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i2.c.a
    public void b(List list) {
        synchronized (this.f21390c) {
            try {
                c cVar = this.f21388a;
                if (cVar != null) {
                    cVar.b(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f21390c) {
            try {
                for (i2.c cVar : this.f21389b) {
                    if (cVar.d(str)) {
                        k.c().a(f21387d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Iterable iterable) {
        synchronized (this.f21390c) {
            try {
                for (i2.c cVar : this.f21389b) {
                    cVar.g(null);
                }
                for (i2.c cVar2 : this.f21389b) {
                    cVar2.e(iterable);
                }
                for (i2.c cVar3 : this.f21389b) {
                    cVar3.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f21390c) {
            try {
                for (i2.c cVar : this.f21389b) {
                    cVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
