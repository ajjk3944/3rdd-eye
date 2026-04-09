package mf;

import ge.c;
import of.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f29366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f29367c;

    public /* synthetic */ a(c cVar, d dVar, int i4) {
        this.f29365a = i4;
        this.f29366b = cVar;
        this.f29367c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29365a) {
            case 0:
                this.f29366b.a(this.f29367c);
                break;
            default:
                this.f29366b.a(this.f29367c);
                break;
        }
    }
}
