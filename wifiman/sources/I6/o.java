package I6;

import G6.O;
import I6.a;
import java.util.Map;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8666a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f8667b;

    public o(J6.b bVar, InterfaceC8708a interfaceC8708a) {
        this.f8666a = bVar;
        this.f8667b = interfaceC8708a;
    }

    public O a(String str) {
        a aVar = (a) this.f8666a.get(str);
        if (aVar != null) {
            return aVar.a();
        }
        synchronized (this.f8666a) {
            try {
                a aVar2 = (a) this.f8666a.get(str);
                if (aVar2 != null) {
                    return aVar2.a();
                }
                a aVarA = ((a.InterfaceC0352a) this.f8667b.get()).b(str).a();
                O oA = aVarA.a();
                this.f8666a.put(str, aVarA);
                return oA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
