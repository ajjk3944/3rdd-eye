package s0;

/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21848r;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f21848r) {
            case 0:
                int i10 = this.f21847g;
                this.f21847g = i10 + 2;
                Object[] objArr = this.f21845a;
                return new a(objArr[i10], 0, objArr[i10 + 1]);
            case 1:
                int i11 = this.f21847g;
                this.f21847g = i11 + 2;
                return this.f21845a[i11];
            default:
                int i12 = this.f21847g;
                this.f21847g = i12 + 2;
                return this.f21845a[i12 + 1];
        }
    }
}
