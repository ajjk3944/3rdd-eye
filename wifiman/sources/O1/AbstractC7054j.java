package o1;

import java.util.Arrays;

/* renamed from: o1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7054j extends C7049e implements InterfaceC7053i {

    /* renamed from: w0, reason: collision with root package name */
    public C7049e[] f55229w0 = new C7049e[4];

    /* renamed from: x0, reason: collision with root package name */
    public int f55230x0 = 0;

    @Override // o1.InterfaceC7053i
    public void a(C7049e c7049e) {
        if (c7049e == this || c7049e == null) {
            return;
        }
        int i10 = this.f55230x0 + 1;
        C7049e[] c7049eArr = this.f55229w0;
        if (i10 > c7049eArr.length) {
            this.f55229w0 = (C7049e[]) Arrays.copyOf(c7049eArr, c7049eArr.length * 2);
        }
        C7049e[] c7049eArr2 = this.f55229w0;
        int i11 = this.f55230x0;
        c7049eArr2[i11] = c7049e;
        this.f55230x0 = i11 + 1;
    }

    @Override // o1.InterfaceC7053i
    public void b() {
        this.f55230x0 = 0;
        Arrays.fill(this.f55229w0, (Object) null);
    }

    @Override // o1.InterfaceC7053i
    public void c(C7050f c7050f) {
    }
}
