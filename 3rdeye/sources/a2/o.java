package A2;

import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.AppDatabase_Impl;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;
import java.util.List;

/* compiled from: BlockModelDao_Impl.java */
/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final AppDatabase_Impl f28a;

    /* renamed from: b, reason: collision with root package name */
    public final l f29b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public final m f30c = new m();

    /* renamed from: d, reason: collision with root package name */
    public final n f31d = new n();

    public o(AppDatabase_Impl appDatabase_Impl) {
        this.f28a = appDatabase_Impl;
    }

    @Override // A2.b
    public final void a(String str) {
        B7.d.u(this.f28a, false, true, new c(str, 0));
    }

    @Override // A2.b
    public final List<Model> b(String str, String str2) {
        return (List) B7.d.u(this.f28a, true, false, new j(0, str, str2));
    }

    @Override // A2.b
    public final void c(Model model) {
        B7.d.u(this.f28a, false, true, new i(0, this, model));
    }

    @Override // A2.b
    public final int d(Model model) {
        return ((Integer) B7.d.u(this.f28a, false, true, new e(0, this, model))).intValue();
    }

    @Override // A2.b
    public final void e(Model model) {
        B7.d.u(this.f28a, false, true, new e(1, this, model));
    }

    @Override // A2.b
    public final List<Model> f(String str) {
        return (List) B7.d.u(this.f28a, true, false, new g(str, 0));
    }

    @Override // A2.b
    public final void g(List<Model> list) {
        B7.d.u(this.f28a, false, true, new k(0, this, list));
    }

    @Override // A2.b
    public final List<Model> h(String str) {
        return (List) B7.d.u(this.f28a, true, false, new g(str, 1));
    }

    @Override // A2.b
    public final int i() {
        return ((Integer) B7.d.u(this.f28a, true, false, new f(0))).intValue();
    }

    @Override // A2.b
    public final void j() {
        B7.d.u(this.f28a, false, true, new h(0));
    }

    @Override // A2.b
    public final List<Model> k() {
        return (List) B7.d.u(this.f28a, true, false, new d(0));
    }
}
