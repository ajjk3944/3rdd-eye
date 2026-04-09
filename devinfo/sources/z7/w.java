package z7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final d4.c f38104a;

    /* renamed from: b, reason: collision with root package name */
    public final List f38105b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38106c;

    public w(Class cls, Class cls2, Class cls3, List list, d4.c cVar) {
        this.f38104a = cVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f38105b = list;
        this.f38106c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final y a(int i4, int i10, com.bumptech.glide.load.data.f fVar, t7.m mVar, x7.h hVar) {
        d4.c cVar = this.f38104a;
        List list = (List) cVar.k();
        t8.f.c(list, "Argument must not be null");
        try {
            List list2 = this.f38105b;
            int size = list2.size();
            y yVarA = null;
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    yVarA = ((i) list2.get(i11)).a(i4, i10, fVar, mVar, hVar);
                } catch (u e2) {
                    list.add(e2);
                }
                if (yVarA != null) {
                    break;
                }
            }
            if (yVarA != null) {
                return yVarA;
            }
            throw new u(this.f38106c, new ArrayList(list));
        } finally {
            cVar.i(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f38105b.toArray()) + '}';
    }
}
