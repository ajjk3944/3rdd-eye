package f;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.i f23592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23593c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci.b f23594d;

    public /* synthetic */ h(d.i iVar, String str, ci.b bVar, int i4) {
        this.f23591a = i4;
        this.f23592b = iVar;
        this.f23593c = str;
        this.f23594d = bVar;
    }

    @Override // f.d
    public final void a(Object obj) {
        switch (this.f23591a) {
            case 0:
                d.i iVar = this.f23592b;
                ArrayList arrayList = iVar.f21600d;
                LinkedHashMap linkedHashMap = iVar.f21598b;
                String str = this.f23593c;
                Object obj2 = linkedHashMap.get(str);
                ci.b bVar = this.f23594d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    iVar.b(iIntValue, bVar, obj);
                    return;
                } catch (Exception e2) {
                    arrayList.remove(str);
                    throw e2;
                }
            default:
                d.i iVar2 = this.f23592b;
                ArrayList arrayList2 = iVar2.f21600d;
                LinkedHashMap linkedHashMap2 = iVar2.f21598b;
                String str2 = this.f23593c;
                Object obj3 = linkedHashMap2.get(str2);
                ci.b bVar2 = this.f23594d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    iVar2.b(iIntValue2, bVar2, obj);
                    return;
                } catch (Exception e10) {
                    arrayList2.remove(str2);
                    throw e10;
                }
        }
    }

    public void b() {
        this.f23592b.f(this.f23593c);
    }
}
