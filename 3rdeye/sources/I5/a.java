package I5;

import I5.d;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f2489f;

    /* renamed from: a, reason: collision with root package name */
    public B7.d f2490a;

    /* renamed from: b, reason: collision with root package name */
    public Date f2491b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2492c;

    /* renamed from: d, reason: collision with root package name */
    public d f2493d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2494e;

    static {
        d dVar = new d();
        a aVar = new a();
        aVar.f2490a = new B7.d(10);
        aVar.f2493d = dVar;
        f2489f = aVar;
    }

    @Override // I5.d.a
    public final void a(boolean z10) {
        if (!this.f2494e && z10) {
            this.f2490a.getClass();
            Date date = new Date();
            Date date2 = this.f2491b;
            if (date2 == null || date.after(date2)) {
                this.f2491b = date;
                if (this.f2492c) {
                    Iterator it = Collections.unmodifiableCollection(c.f2496c.f2498b).iterator();
                    while (it.hasNext()) {
                        K5.a aVar = ((G5.l) it.next()).f1927e;
                        Date date3 = this.f2491b;
                        aVar.c(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f2494e = z10;
    }
}
