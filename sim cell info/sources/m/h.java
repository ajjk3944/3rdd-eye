package m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public List<f> f2928a;

    /* renamed from: b, reason: collision with root package name */
    int f2929b;

    /* renamed from: c, reason: collision with root package name */
    int f2930c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2931d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2932e;

    /* renamed from: f, reason: collision with root package name */
    List<f> f2933f;

    /* renamed from: g, reason: collision with root package name */
    List<f> f2934g;

    /* renamed from: h, reason: collision with root package name */
    HashSet<f> f2935h;

    /* renamed from: i, reason: collision with root package name */
    HashSet<f> f2936i;

    /* renamed from: j, reason: collision with root package name */
    List<f> f2937j;

    /* renamed from: k, reason: collision with root package name */
    List<f> f2938k;

    h(List<f> list) {
        this.f2929b = -1;
        this.f2930c = -1;
        this.f2931d = false;
        this.f2932e = new int[]{-1, -1};
        this.f2933f = new ArrayList();
        this.f2934g = new ArrayList();
        this.f2935h = new HashSet<>();
        this.f2936i = new HashSet<>();
        this.f2937j = new ArrayList();
        this.f2938k = new ArrayList();
        this.f2928a = list;
    }

    h(List<f> list, boolean z2) {
        this.f2929b = -1;
        this.f2930c = -1;
        this.f2931d = false;
        this.f2932e = new int[]{-1, -1};
        this.f2933f = new ArrayList();
        this.f2934g = new ArrayList();
        this.f2935h = new HashSet<>();
        this.f2936i = new HashSet<>();
        this.f2937j = new ArrayList();
        this.f2938k = new ArrayList();
        this.f2928a = list;
        this.f2931d = z2;
    }

    private void e(ArrayList<f> arrayList, f fVar) {
        f fVar2;
        if (fVar.f2899k0) {
            return;
        }
        arrayList.add(fVar);
        fVar.f2899k0 = true;
        if (fVar.L()) {
            return;
        }
        if (fVar instanceof j) {
            j jVar = (j) fVar;
            int i2 = jVar.w0;
            for (int i3 = 0; i3 < i2; i3++) {
                e(arrayList, jVar.v0[i3]);
            }
        }
        int length = fVar.C.length;
        for (int i4 = 0; i4 < length; i4++) {
            e eVar = fVar.C[i4].f2853d;
            if (eVar != null && (fVar2 = eVar.f2851b) != fVar.u()) {
                e(arrayList, fVar2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(m.f r7) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.h.f(m.f):void");
    }

    void a(f fVar, int i2) {
        HashSet<f> hashSet;
        if (i2 == 0) {
            hashSet = this.f2935h;
        } else if (i2 != 1) {
            return;
        } else {
            hashSet = this.f2936i;
        }
        hashSet.add(fVar);
    }

    public List<f> b(int i2) {
        if (i2 == 0) {
            return this.f2933f;
        }
        if (i2 == 1) {
            return this.f2934g;
        }
        return null;
    }

    Set<f> c(int i2) {
        if (i2 == 0) {
            return this.f2935h;
        }
        if (i2 == 1) {
            return this.f2936i;
        }
        return null;
    }

    List<f> d() {
        if (!this.f2937j.isEmpty()) {
            return this.f2937j;
        }
        int size = this.f2928a.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.f2928a.get(i2);
            if (!fVar.f2895i0) {
                e((ArrayList) this.f2937j, fVar);
            }
        }
        this.f2938k.clear();
        this.f2938k.addAll(this.f2928a);
        this.f2938k.removeAll(this.f2937j);
        return this.f2937j;
    }

    void g() {
        int size = this.f2938k.size();
        for (int i2 = 0; i2 < size; i2++) {
            f(this.f2938k.get(i2));
        }
    }
}
