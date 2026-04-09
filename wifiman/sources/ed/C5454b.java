package ed;

import Zg.d0;
import android.content.Context;
import com.ubnt.net.arp.NetlinkArpTable;
import com.ui.wifiman.model.support.a;
import ed.InterfaceC5453a;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import h9.C5969a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ed.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5454b implements InterfaceC5453a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ui.wifiman.model.support.a f46375a;

    /* renamed from: b, reason: collision with root package name */
    private final NetlinkArpTable f46376b;

    /* renamed from: ed.b$a */
    public static final class a implements C {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashSet] */
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            Object objE;
            try {
                HashMap<String, String> arpTable = C5454b.this.f46376b.getArpTable();
                if (arpTable != null) {
                    objE = new HashSet();
                    for (Map.Entry<String, String> entry : arpTable.entrySet()) {
                        String key = entry.getKey();
                        C5969a c5969aE = C5969a.f48518b.e(entry.getValue());
                        if (key != null && c5969aE != null) {
                            objE.add(new InterfaceC5453a.C1742a(key, c5969aE));
                        }
                    }
                } else {
                    objE = d0.e();
                }
                interfaceC5910A.onSuccess(objE);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: ed.b$b, reason: collision with other inner class name */
    static final class C1743b implements InterfaceC6469f {
        C1743b() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Set it) {
            AbstractC6492s.i(it, "it");
            C5454b.this.f46375a.b(new a.AbstractC1437a.b(it));
        }
    }

    public C5454b(Context applicationContext, com.ui.wifiman.model.support.a supportFileDataCollector) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(supportFileDataCollector, "supportFileDataCollector");
        this.f46375a = supportFileDataCollector;
        this.f46376b = new NetlinkArpTable(applicationContext);
    }

    @Override // ed.InterfaceC5453a
    public z b() {
        z zVarI = z.i(new a());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarE = zVarI.o(new C1743b()).O(Gg.a.d()).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        return zVarE;
    }
}
