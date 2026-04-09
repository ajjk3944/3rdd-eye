package R2;

import R2.q;
import com.bumptech.glide.load.data.d;
import g3.C4389b;

/* compiled from: UnitModelLoader.java */
/* loaded from: classes.dex */
public final class y<Model> implements q<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    public static final y<?> f11721a = new y<>();

    /* compiled from: UnitModelLoader.java */
    public static class a<Model> implements r<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        public static final a<?> f11722a = new a<>();

        @Override // R2.r
        public final q<Model, Model> c(u uVar) {
            return y.f11721a;
        }
    }

    @Override // R2.q
    public final boolean a(Model model) {
        return true;
    }

    @Override // R2.q
    public final q.a<Model> b(Model model, int i, int i10, L2.h hVar) {
        return new q.a<>(new C4389b(model), new b(model));
    }

    /* compiled from: UnitModelLoader.java */
    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: b, reason: collision with root package name */
        public final Model f11723b;

        public b(Model model) {
            this.f11723b = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Model> a() {
            return (Class<Model>) this.f11723b.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public final L2.a d() {
            return L2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.h hVar, d.a<? super Model> aVar) {
            aVar.f(this.f11723b);
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
