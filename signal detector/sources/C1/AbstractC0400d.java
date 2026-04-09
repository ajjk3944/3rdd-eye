package c1;

import V0.m;
import android.content.Context;
import c3.i;
import h1.InterfaceC2361a;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: c1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0400d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f5884f = m.h("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2361a f5885a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5886b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5887c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f5888d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f5889e;

    public AbstractC0400d(Context context, InterfaceC2361a interfaceC2361a) {
        this.f5886b = context.getApplicationContext();
        this.f5885a = interfaceC2361a;
    }

    public abstract Object a();

    public final void b(b1.c cVar) {
        synchronized (this.f5887c) {
            try {
                if (this.f5888d.remove(cVar) && this.f5888d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f5887c) {
            try {
                Object obj2 = this.f5889e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f5889e = obj;
                    ((i) ((V2.e) this.f5885a).f3870d).execute(new A1.d(this, 22, new ArrayList(this.f5888d)));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
