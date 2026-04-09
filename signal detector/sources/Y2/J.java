package Y2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class J extends G {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f4268h;
    public static final J i;

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f4269c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f4270d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f4271e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f4272f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f4273g;

    static {
        Object[] objArr = new Object[0];
        f4268h = objArr;
        i = new J(0, 0, 0, objArr, objArr);
    }

    public J(int i3, int i6, int i7, Object[] objArr, Object[] objArr2) {
        this.f4269c = objArr;
        this.f4270d = i3;
        this.f4271e = objArr2;
        this.f4272f = i6;
        this.f4273g = i7;
    }

    @Override // Y2.C
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f4269c;
        int i3 = this.f4273g;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // Y2.C
    public final int b() {
        return this.f4273g;
    }

    @Override // Y2.C
    public final int c() {
        return 0;
    }

    @Override // Y2.C, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f4271e;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i3 = iRotateLeft & this.f4272f;
            Object obj2 = objArr[i3];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i3 + 1;
        }
    }

    @Override // Y2.C
    public final Object[] d() {
        return this.f4269c;
    }

    @Override // Y2.G, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4270d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        F i3 = this.f4262b;
        if (i3 == null) {
            D d6 = F.f4261b;
            int i6 = this.f4273g;
            i3 = i6 == 0 ? I.f4265e : new I(i6, this.f4269c);
            this.f4262b = i3;
        }
        return i3.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4273g;
    }
}
