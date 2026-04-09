package J5;

import kg.p;

/* loaded from: classes3.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f9760a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f9761b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f9762c;

    /* renamed from: d, reason: collision with root package name */
    private int f9763d;

    /* renamed from: J5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0390a extends p {
        @Override // kg.p
        boolean test(Object obj);
    }

    a(int i10) {
        this.f9760a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f9761b = objArr;
        this.f9762c = objArr;
    }

    void a(d dVar) {
        int i10 = this.f9760a;
        for (Object[] objArr = this.f9761b; objArr != null; objArr = objArr[i10]) {
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                if (obj == null) {
                    break;
                }
                dVar.accept(obj);
            }
        }
    }

    void b(Object obj) {
        int i10 = this.f9760a;
        int i11 = this.f9763d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f9762c[i10] = objArr;
            this.f9762c = objArr;
            i11 = 0;
        }
        this.f9762c[i11] = obj;
        this.f9763d = i11 + 1;
    }

    void c(InterfaceC0390a interfaceC0390a) {
        int i10;
        int i11 = this.f9760a;
        for (Object[] objArr = this.f9761b; objArr != null; objArr = objArr[i11]) {
            while (i10 < i11) {
                Object obj = objArr[i10];
                i10 = (obj == null || interfaceC0390a.test(obj)) ? 0 : i10 + 1;
            }
        }
    }
}
