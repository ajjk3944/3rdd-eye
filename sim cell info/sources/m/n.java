package m;

/* loaded from: classes.dex */
public class n extends o {

    /* renamed from: c, reason: collision with root package name */
    float f2954c = 0.0f;

    @Override // m.o
    public void e() {
        super.e();
        this.f2954c = 0.0f;
    }

    public void g() {
        this.f2956b = 2;
    }

    public void h(int i2) {
        int i3 = this.f2956b;
        if (i3 == 0 || this.f2954c != i2) {
            this.f2954c = i2;
            if (i3 == 1) {
                c();
            }
            b();
        }
    }
}
