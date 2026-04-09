package tr;

import br.l;
import ft.t;
import java.util.Collection;
import mq.w;
import qs.g;
import rr.f;

/* loaded from: classes.dex */
public final class a implements b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f22953b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f22954c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f22955d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f22956e = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22957a;

    public /* synthetic */ a(int i10) {
        this.f22957a = i10;
    }

    @Override // tr.b
    public Collection a(g gVar, f fVar) {
        l.e(gVar, "name");
        l.e(fVar, "classDescriptor");
        return w.f16945a;
    }

    @Override // tr.d
    public boolean b(f fVar, t tVar) {
        switch (this.f22957a) {
            case 1:
                l.e(fVar, "classDescriptor");
                return true;
            default:
                l.e(fVar, "classDescriptor");
                return !tVar.getAnnotations().G(e.f22958a);
        }
    }

    @Override // tr.b
    public Collection c(f fVar) {
        return w.f16945a;
    }

    @Override // tr.b
    public Collection d(f fVar) {
        return w.f16945a;
    }

    @Override // tr.b
    public Collection e(f fVar) {
        l.e(fVar, "classDescriptor");
        return w.f16945a;
    }
}
