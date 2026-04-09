package a1;

import V0.m;
import android.content.Context;
import b1.d;
import b1.e;
import c1.C0397a;
import c1.C0398b;
import c1.C0401e;
import c1.f;
import c1.g;
import h1.InterfaceC2361a;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: a1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264c implements b1.b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f4649d = m.h("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0263b f4650a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.c[] f4651b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4652c;

    public C0264c(Context context, InterfaceC2361a interfaceC2361a, InterfaceC0263b interfaceC0263b) {
        Context applicationContext = context.getApplicationContext();
        this.f4650a = interfaceC0263b;
        this.f4651b = new b1.c[]{new b1.a((C0397a) g.u(applicationContext, interfaceC2361a).f5896b, 0), new b1.a((C0398b) g.u(applicationContext, interfaceC2361a).f5897c, 1), new b1.a((f) g.u(applicationContext, interfaceC2361a).f5899e, 4), new b1.a((C0401e) g.u(applicationContext, interfaceC2361a).f5898d, 2), new b1.a((C0401e) g.u(applicationContext, interfaceC2361a).f5898d, 3), new e((C0401e) g.u(applicationContext, interfaceC2361a).f5898d), new d((C0401e) g.u(applicationContext, interfaceC2361a).f5898d)};
        this.f4652c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f4652c) {
            try {
                for (b1.c cVar : this.f4651b) {
                    Object obj = cVar.f5711b;
                    if (obj != null && cVar.b(obj) && cVar.f5710a.contains(str)) {
                        m.f().a(f4649d, "Work " + str + " constrained by " + cVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList) {
        synchronized (this.f4652c) {
            try {
                InterfaceC0263b interfaceC0263b = this.f4650a;
                if (interfaceC0263b != null) {
                    interfaceC0263b.a(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Collection collection) {
        synchronized (this.f4652c) {
            try {
                for (b1.c cVar : this.f4651b) {
                    if (cVar.f5713d != null) {
                        cVar.f5713d = null;
                        cVar.d(null, cVar.f5711b);
                    }
                }
                for (b1.c cVar2 : this.f4651b) {
                    cVar2.c(collection);
                }
                for (b1.c cVar3 : this.f4651b) {
                    if (cVar3.f5713d != this) {
                        cVar3.f5713d = this;
                        cVar3.d(this, cVar3.f5711b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f4652c) {
            try {
                for (b1.c cVar : this.f4651b) {
                    ArrayList arrayList = cVar.f5710a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cVar.f5712c.b(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
