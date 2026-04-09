package n1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Q.b f22302a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22303b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22304c;

    public x(Class cls, Class cls2, Class cls3, List list, Q.b bVar) {
        this.f22302a = bVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f22303b = list;
        this.f22304c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final z a(int i, int i3, L2.w wVar, com.bumptech.glide.load.data.f fVar, l1.h hVar) {
        Q.b bVar = this.f22302a;
        List list = (List) bVar.h();
        H1.g.c(list, "Argument must not be null");
        try {
            List list2 = this.f22303b;
            int size = list2.size();
            z zVarA = null;
            for (int i6 = 0; i6 < size; i6++) {
                try {
                    zVarA = ((j) list2.get(i6)).a(i, i3, wVar, fVar, hVar);
                } catch (v e6) {
                    list.add(e6);
                }
                if (zVarA != null) {
                    break;
                }
            }
            if (zVarA != null) {
                return zVarA;
            }
            throw new v(this.f22304c, new ArrayList(list));
        } finally {
            bVar.d(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f22303b.toArray()) + '}';
    }
}
