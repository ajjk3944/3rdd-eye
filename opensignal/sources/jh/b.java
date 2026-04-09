package jh;

import ch.n;
import fh.d;
import ih.m;
import kh.g;
import oh.t;

/* loaded from: classes.dex */
public final class b implements wh.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13712b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f13711a = i10;
        this.f13712b = obj;
    }

    @Override // wh.b
    public final void a(d[] dVarArr) {
        switch (this.f13711a) {
            case 0:
                ((c) this.f13712b).g("IP_HOST_DETECTION_STARTED", dVarArr);
                break;
            case 1:
                ((g) this.f13712b).g("IP_HOST_DETECTION_STARTED", dVarArr);
                break;
            default:
                n.b("VideoTest", "onIpHostDetectionStarted() called");
                break;
        }
    }

    @Override // wh.b
    public final void b(String str, String str2, String str3) {
        switch (this.f13711a) {
            case 0:
                c cVar = (c) this.f13712b;
                m mVar = cVar.f11370c;
                mVar.k = str;
                mVar.f11419m = str2;
                cVar.g("IP_HOST_DETECTED", new d[]{new d(str3, "IP_HOST_URL")});
                break;
            case 1:
                g gVar = (g) this.f13712b;
                m mVar2 = gVar.f11370c;
                mVar2.f11418l = str;
                mVar2.f11420n = str2;
                gVar.g("IP_HOST_DETECTED", new d[]{new d(str3, "IP_HOST_URL")});
                break;
            default:
                StringBuilder sb2 = new StringBuilder("onIpHostDetected() called with: ip = [");
                sb2.append(str);
                sb2.append("], hostName = [");
                sb2.append(str2);
                sb2.append("], url = [");
                n.b("VideoTest", w.g.j(sb2, str3, "]"));
                t tVar = (t) this.f13712b;
                tVar.I = str;
                tVar.J = str2;
                break;
        }
    }

    @Override // wh.b
    public final void c(d[] dVarArr) {
        switch (this.f13711a) {
            case 0:
                n.b("DownloadTest", "ip host onError() called");
                ((c) this.f13712b).g("IP_HOST_ERROR", dVarArr);
                break;
            case 1:
                n.b("UploadTest", "ip and host onError() called");
                ((g) this.f13712b).g("IP_HOST_ERROR", dVarArr);
                break;
            default:
                n.b("VideoTest", "onError() called");
                break;
        }
    }
}
