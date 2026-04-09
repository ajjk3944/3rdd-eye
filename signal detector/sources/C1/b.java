package C1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1138a;

    public b(int i) {
        switch (i) {
            case 1:
                this.f1138a = new ArrayList();
                break;
            case 2:
                this.f1138a = new ArrayList();
                break;
            default:
                this.f1138a = new ArrayList();
                break;
        }
    }

    public synchronized z1.a a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return z1.c.f24452b;
        }
        ArrayList arrayList = this.f1138a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            z1.b bVar = (z1.b) obj;
            if (bVar.f24449a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f24450b)) {
                return bVar.f24451c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.f1138a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            z1.b bVar = (z1.b) obj;
            if ((bVar.f24449a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f24450b)) && !arrayList.contains(bVar.f24450b)) {
                arrayList.add(bVar.f24450b);
            }
        }
        return arrayList;
    }
}
