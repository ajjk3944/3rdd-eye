package N2;

import N2.j;
import i3.C4455a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: LoadPath.java */
/* loaded from: classes.dex */
public final class s<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final C4455a.c f4630a;

    /* renamed from: b, reason: collision with root package name */
    public final List<? extends k<Data, ResourceType, Transcode>> f4631b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4632c;

    public s(Class cls, Class cls2, Class cls3, List list, C4455a.c cVar) {
        this.f4630a = cVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f4631b = list;
        this.f4632c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final u a(int i, int i10, L2.h hVar, j.b bVar, com.bumptech.glide.load.data.e eVar) throws q {
        C4455a.c cVar = this.f4630a;
        List list = (List) cVar.a();
        try {
            List<? extends k<Data, ResourceType, Transcode>> list2 = this.f4631b;
            int size = list2.size();
            u uVarA = null;
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    uVarA = list2.get(i11).a(i, i10, hVar, bVar, eVar);
                } catch (q e4) {
                    list.add(e4);
                }
                if (uVarA != null) {
                    break;
                }
            }
            if (uVarA != null) {
                return uVarA;
            }
            throw new q(this.f4632c, new ArrayList(list));
        } finally {
            cVar.b(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f4631b.toArray()) + '}';
    }
}
