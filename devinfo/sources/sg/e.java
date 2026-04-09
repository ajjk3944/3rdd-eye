package sg;

import com.liuzh.deviceinfo.diskpartition.DiskPartitionActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DiskPartitionActivity f33606b;

    public /* synthetic */ e(DiskPartitionActivity diskPartitionActivity, int i4) {
        this.f33605a = i4;
        this.f33606b = diskPartitionActivity;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f33605a) {
            case 0:
                return this.f33606b.b();
            case 1:
                return this.f33606b.e();
            default:
                return this.f33606b.c();
        }
    }
}
