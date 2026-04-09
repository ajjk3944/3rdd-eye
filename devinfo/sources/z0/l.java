package z0;

import x.q;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f37829d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f37829d) {
            case 0:
                int i4 = this.f37828c;
                this.f37828c = i4 + 2;
                Object[] objArr = this.f37826a;
                return new q(1, objArr[i4], objArr[i4 + 1]);
            case 1:
                int i10 = this.f37828c;
                this.f37828c = i10 + 2;
                return this.f37826a[i10];
            default:
                int i11 = this.f37828c;
                this.f37828c = i11 + 2;
                return this.f37826a[i11 + 1];
        }
    }
}
