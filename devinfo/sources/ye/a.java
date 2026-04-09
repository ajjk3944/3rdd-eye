package ye;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37571a;

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        switch (this.f37571a) {
            case 0:
                throw new we.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                we.e eVar = (we.e) obj2;
                eVar.e(ze.e.g, entry.getKey());
                eVar.e(ze.e.f38251h, entry.getValue());
                return;
            default:
                throw new we.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
