package F3;

import android.content.Context;
import t4.C5606d;

/* compiled from: SchemaManager_Factory.java */
/* loaded from: classes.dex */
public final class t implements A3.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1633b;

    /* renamed from: c, reason: collision with root package name */
    public final A3.c f1634c;

    public /* synthetic */ t(A3.c cVar, int i) {
        this.f1633b = i;
        this.f1634c = cVar;
    }

    @Override // a9.InterfaceC1676a
    public final Object get() {
        switch (this.f1633b) {
            case 0:
                return new s((Context) this.f1634c.f36c, "com.google.android.datatransport.events", Integer.valueOf(s.f1629e).intValue());
            default:
                return new z3.i((Context) this.f1634c.f36c, new C5606d(6), new B7.d(8));
        }
    }
}
