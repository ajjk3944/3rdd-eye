package r1;

import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final C2870A f23384e = new C2870A(10);

    /* renamed from: f, reason: collision with root package name */
    public static final B f23385f = new B(2);

    /* renamed from: d, reason: collision with root package name */
    public final V2.e f23389d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23386a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f23388c = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final C2870A f23387b = f23384e;

    public x(V2.e eVar) {
        this.f23389d = eVar;
    }

    public final synchronized void a(Class cls, Class cls2, s sVar) {
        w wVar = new w(cls, cls2, sVar);
        ArrayList arrayList = this.f23386a;
        arrayList.add(arrayList.size(), wVar);
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = this.f23386a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                w wVar = (w) obj;
                if (!this.f23388c.contains(wVar) && wVar.f23381a.isAssignableFrom(cls)) {
                    this.f23388c.add(wVar);
                    arrayList.add(wVar.f23383c.d(this));
                    this.f23388c.remove(wVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized r c(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f23386a;
            int size = arrayList2.size();
            boolean z6 = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                w wVar = (w) obj;
                if (this.f23388c.contains(wVar)) {
                    z6 = true;
                } else if (wVar.f23381a.isAssignableFrom(cls) && wVar.f23382b.isAssignableFrom(cls2)) {
                    this.f23388c.add(wVar);
                    arrayList.add(wVar.f23383c.d(this));
                    this.f23388c.remove(wVar);
                }
            }
            if (arrayList.size() > 1) {
                C2870A c2870a = this.f23387b;
                V2.e eVar = this.f23389d;
                c2870a.getClass();
                return new C2872b(arrayList, 2, eVar);
            }
            if (arrayList.size() == 1) {
                return (r) arrayList.get(0);
            }
            if (z6) {
                return f23385f;
            }
            throw new com.bumptech.glide.i("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f23388c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = this.f23386a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            w wVar = (w) obj;
            if (!arrayList.contains(wVar.f23382b) && wVar.f23381a.isAssignableFrom(cls)) {
                arrayList.add(wVar.f23382b);
            }
        }
        return arrayList;
    }
}
