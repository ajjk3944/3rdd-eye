package u;

/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f24483a;

    /* renamed from: b, reason: collision with root package name */
    public int f24484b;

    public d(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f24483a = new Object[i10];
    }

    @Override // u.c
    public boolean a(Object obj) {
        int i10 = this.f24484b;
        Object[] objArr = this.f24483a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f24484b = i10 + 1;
        return true;
    }

    @Override // u.c
    public Object b() {
        int i10 = this.f24484b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f24483a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f24484b = i10 - 1;
        return obj;
    }

    @Override // u.c
    public void c(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f24484b;
            Object[] objArr2 = this.f24483a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f24484b = i12 + 1;
            }
        }
    }
}
