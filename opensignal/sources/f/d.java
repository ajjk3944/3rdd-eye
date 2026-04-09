package f;

import c.g;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f8375c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr.a f8376d;

    public /* synthetic */ d(g gVar, String str, dr.a aVar, int i10) {
        this.f8373a = i10;
        this.f8375c = gVar;
        this.f8374b = str;
        this.f8376d = aVar;
    }

    @Override // f.b
    public final void a(Object obj) {
        switch (this.f8373a) {
            case 0:
                g.b bVar = (g.b) this.f8376d;
                g gVar = this.f8375c;
                HashMap map = gVar.f3013b;
                String str = this.f8374b;
                Integer num = (Integer) map.get(str);
                if (num != null) {
                    gVar.f3015d.add(str);
                    try {
                        gVar.b(num.intValue(), bVar, obj);
                        return;
                    } catch (Exception e4) {
                        gVar.f3015d.remove(str);
                        throw e4;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                g gVar2 = this.f8375c;
                HashMap map2 = gVar2.f3013b;
                String str2 = this.f8374b;
                Integer num2 = (Integer) map2.get(str2);
                dr.a aVar = this.f8376d;
                if (num2 != null) {
                    gVar2.f3015d.add(str2);
                    try {
                        gVar2.b(num2.intValue(), aVar, obj);
                        return;
                    } catch (Exception e10) {
                        gVar2.f3015d.remove(str2);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public void b() {
        this.f8375c.e(this.f8374b);
    }
}
