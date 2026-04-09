package Ld;

import com.ui.wifiman.model.ubiquiti.cloud.UnifiCloudClient;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f11567a;

    /* renamed from: b, reason: collision with root package name */
    private final UnifiCloudClient f11568b;

    /* renamed from: c, reason: collision with root package name */
    private final com.ui.wifiman.model.ubiquiti.console.b f11569c;

    /* renamed from: d, reason: collision with root package name */
    private final com.ui.wifiman.model.ubiquiti.console.f f11570d;

    /* renamed from: e, reason: collision with root package name */
    private final cb.c f11571e;

    public /* synthetic */ e(UUID uuid, UnifiCloudClient unifiCloudClient, com.ui.wifiman.model.ubiquiti.console.b bVar, com.ui.wifiman.model.ubiquiti.console.f fVar, cb.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, unifiCloudClient, bVar, fVar, cVar);
    }

    public final UUID a() {
        return this.f11567a;
    }

    public final UnifiCloudClient b() {
        return this.f11568b;
    }

    public final com.ui.wifiman.model.ubiquiti.console.f c() {
        return this.f11570d;
    }

    public final com.ui.wifiman.model.ubiquiti.console.b d() {
        return this.f11569c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return b.a.d(this.f11567a, eVar.f11567a) && AbstractC6492s.d(this.f11568b, eVar.f11568b) && AbstractC6492s.d(this.f11569c, eVar.f11569c) && AbstractC6492s.d(this.f11570d, eVar.f11570d) && AbstractC6492s.d(this.f11571e, eVar.f11571e);
    }

    public int hashCode() {
        return (((((((b.a.e(this.f11567a) * 31) + this.f11568b.hashCode()) * 31) + this.f11569c.hashCode()) * 31) + this.f11570d.hashCode()) * 31) + this.f11571e.hashCode();
    }

    public String toString() {
        return "UbiquitiSsoAccountSession(accountId=" + b.a.f(this.f11567a) + ", client=" + this.f11568b + ", consoles=" + this.f11569c + ", consoleConnectionService=" + this.f11570d + ", unifiCore=" + this.f11571e + ")";
    }

    private e(UUID accountId, UnifiCloudClient client, com.ui.wifiman.model.ubiquiti.console.b consoles, com.ui.wifiman.model.ubiquiti.console.f consoleConnectionService, cb.c unifiCore) {
        AbstractC6492s.i(accountId, "accountId");
        AbstractC6492s.i(client, "client");
        AbstractC6492s.i(consoles, "consoles");
        AbstractC6492s.i(consoleConnectionService, "consoleConnectionService");
        AbstractC6492s.i(unifiCore, "unifiCore");
        this.f11567a = accountId;
        this.f11568b = client;
        this.f11569c = consoles;
        this.f11570d = consoleConnectionService;
        this.f11571e = unifiCore;
    }
}
