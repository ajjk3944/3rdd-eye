package R2;

import java.util.Collections;
import java.util.List;
import t4.C5606d;

/* compiled from: ModelLoader.java */
/* loaded from: classes.dex */
public interface q<Model, Data> {

    /* compiled from: ModelLoader.java */
    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final L2.f f11686a;

        /* renamed from: b, reason: collision with root package name */
        public final List<L2.f> f11687b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f11688c;

        public a() {
            throw null;
        }

        public a(L2.f fVar, com.bumptech.glide.load.data.d<Data> dVar) {
            List<L2.f> list = Collections.EMPTY_LIST;
            C5606d.l(fVar, "Argument must not be null");
            this.f11686a = fVar;
            C5606d.l(list, "Argument must not be null");
            this.f11687b = list;
            C5606d.l(dVar, "Argument must not be null");
            this.f11688c = dVar;
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i, int i10, L2.h hVar);
}
