package s5;

import a5.d0;
import d5.w;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21917a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q3.a f21918d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f21919g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21920r;

    public /* synthetic */ i(q3.a aVar, int i10, long j) {
        this.f21918d = aVar;
        this.f21920r = i10;
        this.f21919g = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f21917a;
        int i11 = this.f21920r;
        long j = this.f21919g;
        q3.a aVar = this.f21918d;
        switch (i10) {
            case 0:
                w wVar = (w) aVar.f20680g;
                int i12 = d0.f105a;
                wVar.f7095a.O.onDroppedFrames(i11, j);
                break;
            default:
                w wVar2 = (w) aVar.f20680g;
                int i13 = d0.f105a;
                wVar2.f7095a.O.onVideoFrameProcessingOffset(j, i11);
                break;
        }
    }

    public /* synthetic */ i(q3.a aVar, long j, int i10) {
        this.f21918d = aVar;
        this.f21919g = j;
        this.f21920r = i10;
    }
}
