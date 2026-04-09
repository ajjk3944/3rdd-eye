package z5;

import h5.InterfaceC2375i;

/* renamed from: z5.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3049z extends AbstractC3025a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3049z(InterfaceC2375i interfaceC2375i, boolean z6, int i) {
        super(interfaceC2375i, z6);
        this.f24569d = i;
    }

    @Override // z5.c0
    public boolean z(Throwable th) {
        switch (this.f24569d) {
            case 1:
                AbstractC3046w.j(this.f24513c, th);
                return true;
            default:
                return super.z(th);
        }
    }
}
