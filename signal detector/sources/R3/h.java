package R3;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class h extends S3.d implements S3.i {

    /* renamed from: b, reason: collision with root package name */
    public final B2.a f3415b;

    /* renamed from: c, reason: collision with root package name */
    public final c3.f f3416c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f3417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, B2.a aVar, c3.f fVar) {
        super(0);
        this.f3417d = kVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f3415b = aVar;
        this.f3416c = fVar;
    }

    @Override // S3.i
    public void D2(Bundle bundle) {
        this.f3417d.f3421a.c(this.f3416c);
        this.f3415b.f("onCompleteUpdate", new Object[0]);
    }

    @Override // S3.i
    public void f2(Bundle bundle) {
        this.f3417d.f3421a.c(this.f3416c);
        this.f3415b.f("onRequestInfo", new Object[0]);
    }
}
