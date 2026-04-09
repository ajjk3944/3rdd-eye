package I2;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface n {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final C2.e f8511a;

        /* renamed from: b, reason: collision with root package name */
        public final List f8512b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d f8513c;

        public a(C2.e eVar, com.bumptech.glide.load.data.d dVar) {
            this(eVar, Collections.emptyList(), dVar);
        }

        public a(C2.e eVar, List list, com.bumptech.glide.load.data.d dVar) {
            this.f8511a = (C2.e) W2.k.d(eVar);
            this.f8512b = (List) W2.k.d(list);
            this.f8513c = (com.bumptech.glide.load.data.d) W2.k.d(dVar);
        }
    }

    a a(Object obj, int i10, int i11, C2.g gVar);

    boolean b(Object obj);
}
