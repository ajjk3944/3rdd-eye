package ag;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements xf.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f348a;

    @Override // xf.a
    public final void a(Object obj, Object obj2) {
        switch (this.f348a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                xf.e eVar = (xf.e) obj2;
                eVar.e(i.f351g, entry.getKey());
                eVar.e(i.f352h, entry.getValue());
                return;
            case 1:
                throw new xf.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            default:
                throw new xf.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
