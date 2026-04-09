package cv;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class v extends mq.d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final j[] f6740a;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f6741d;

    public v(j[] jVarArr, int[] iArr) {
        this.f6740a = jVarArr;
        this.f6741d = iArr;
    }

    @Override // mq.a
    public final int a() {
        return this.f6740a.length;
    }

    @Override // mq.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f6740a[i10];
    }

    @Override // mq.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    @Override // mq.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }
}
