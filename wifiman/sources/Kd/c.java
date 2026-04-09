package Kd;

import Kd.a;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.ubiquiti.console.e;
import gg.z;
import java.util.UUID;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import wa.InterfaceC8290a;
import xa.InterfaceC8439a;
import xa.o;

/* loaded from: classes4.dex */
public final class c implements Kd.b {

    /* renamed from: a, reason: collision with root package name */
    private final o f10651a;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10652a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TeleportCloud.e.b f10653b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f10654c;

        a(String str, TeleportCloud.e.b bVar, UUID uuid) {
            this.f10652a = str;
            this.f10653b = bVar;
            this.f10654c = uuid;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Kd.a apply(a.C0428a console) {
            AbstractC6492s.i(console, "console");
            return new Kd.a(this.f10652a, this.f10653b, this.f10654c, console, null);
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TeleportCloud.b f10655a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10656b;

        b(TeleportCloud.b bVar, String str) {
            this.f10655a = bVar;
            this.f10656b = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.C0428a apply(InterfaceC8290a catalog) {
            AbstractC6492s.i(catalog, "catalog");
            String strA = this.f10655a.a();
            if (strA == null) {
                strA = "local-" + this.f10656b;
            }
            String strD = e.b.d(strA);
            String strH = this.f10655a.h();
            if (strH == null && (strH = this.f10655a.b()) == null) {
                strH = "";
            }
            String str = strH;
            String strI = this.f10655a.i();
            String strJ = this.f10655a.j();
            String strB = this.f10655a.b();
            return new a.C0428a(strD, str, strI, strJ, strB != null ? (InterfaceC8439a.d) catalog.d(strB) : null, this.f10655a.d(), this.f10655a.c(), this.f10655a.f(), this.f10655a.g(), null);
        }
    }

    public c(o productCatalog) {
        AbstractC6492s.i(productCatalog, "productCatalog");
        this.f10651a = productCatalog;
    }

    @Override // Kd.b
    public z a(String tunnelId, TeleportCloud.b teleportConsoleState) {
        AbstractC6492s.i(tunnelId, "tunnelId");
        AbstractC6492s.i(teleportConsoleState, "teleportConsoleState");
        z zVarA = this.f10651a.b().o0().A(new b(teleportConsoleState, tunnelId));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    @Override // Kd.b
    public z b(String tunnelId, TeleportCloud.e.b bVar, UUID uuid, TeleportCloud.b teleportConsoleState) {
        AbstractC6492s.i(tunnelId, "tunnelId");
        AbstractC6492s.i(teleportConsoleState, "teleportConsoleState");
        z zVarA = a(tunnelId, teleportConsoleState).A(new a(tunnelId, bVar, uuid));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }
}
