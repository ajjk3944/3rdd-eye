package h2;

import Vi.o;
import Yi.f;
import Zg.AbstractC3689v;
import Zg.U;
import cj.e;
import cj.g;
import f2.AbstractC5496B;
import f2.AbstractC5504c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5946b extends Yi.b {

    /* renamed from: a, reason: collision with root package name */
    private final Vi.b f48401a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f48402b;

    /* renamed from: c, reason: collision with root package name */
    private final e f48403c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f48404d;

    /* renamed from: e, reason: collision with root package name */
    private int f48405e;

    public C5946b(Vi.b serializer, Map typeMap) {
        AbstractC6492s.i(serializer, "serializer");
        AbstractC6492s.i(typeMap, "typeMap");
        this.f48401a = serializer;
        this.f48402b = typeMap;
        this.f48403c = g.a();
        this.f48404d = new LinkedHashMap();
        this.f48405e = -1;
    }

    private final void K(Object obj) {
        String strF = this.f48401a.a().f(this.f48405e);
        AbstractC5496B abstractC5496B = (AbstractC5496B) this.f48402b.get(strF);
        if (abstractC5496B != null) {
            this.f48404d.put(strF, abstractC5496B instanceof AbstractC5504c ? ((AbstractC5504c) abstractC5496B).l(obj) : AbstractC3689v.e(abstractC5496B.i(obj)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + strF + ". Please provide NavType through typeMap.").toString());
    }

    @Override // Yi.b, Yi.f
    public f B(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (c.d(descriptor)) {
            this.f48405e = 0;
        }
        return super.B(descriptor);
    }

    @Override // Yi.b
    public boolean H(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        this.f48405e = i10;
        return true;
    }

    @Override // Yi.b
    public void I(Object value) {
        AbstractC6492s.i(value, "value");
        K(value);
    }

    public final Map J(Object value) {
        AbstractC6492s.i(value, "value");
        super.z(this.f48401a, value);
        return U.t(this.f48404d);
    }

    @Override // Yi.f
    public e a() {
        return this.f48403c;
    }

    @Override // Yi.f
    public void f() {
        K(null);
    }

    @Override // Yi.f
    public void z(o serializer, Object obj) {
        AbstractC6492s.i(serializer, "serializer");
        K(obj);
    }
}
