package fb;

import com.google.android.gms.internal.ads.cl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl f23964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23965c;

    public /* synthetic */ q(cl clVar, String str, int i4) {
        this.f23963a = i4;
        this.f23964b = clVar;
        this.f23965c = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f23963a) {
            case 0:
                ((a) this.f23964b.f10156c).f23860b.evaluateJavascript(this.f23965c, null);
                break;
            default:
                ((a) this.f23964b.f10156c).f23860b.evaluateJavascript(this.f23965c, null);
                break;
        }
    }
}
