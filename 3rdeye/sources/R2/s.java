package R2;

import i3.C4455a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: ModelLoaderRegistry.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final u f11689a;

    /* renamed from: b, reason: collision with root package name */
    public final a f11690b;

    /* compiled from: ModelLoaderRegistry.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f11691a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: R2.s$a$a, reason: collision with other inner class name */
        public static class C0155a<Model> {

            /* renamed from: a, reason: collision with root package name */
            public final List<q<Model, ?>> f11692a;

            public C0155a(List<q<Model, ?>> list) {
                this.f11692a = list;
            }
        }
    }

    public s(C4455a.c cVar) {
        u uVar = new u(cVar);
        this.f11690b = new a();
        this.f11689a = uVar;
    }

    public final synchronized ArrayList a(Class cls) {
        return this.f11689a.d(cls);
    }
}
