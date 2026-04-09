package com.ui.wifiman.model.teleport.tunnel.config;

import Jd.b;
import Jd.d;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m2.p;
import m2.q;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SupportFactory;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb;", "Lm2/q;", "<init>", "()V", "LJd/b;", "C", "()LJd/b;", "p", SnmpConfigurator.O_AUTH_PROTOCOL, "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TeleportTunnelDb extends q {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: com.ui.wifiman.model.teleport.tunnel.config.TeleportTunnelDb$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TeleportTunnelDb a(Context context, String fileName, String passphrase) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(fileName, "fileName");
            AbstractC6492s.i(passphrase, "passphrase");
            q.a aVarA = p.a(context, TeleportTunnelDb.class, fileName);
            char[] charArray = passphrase.toCharArray();
            AbstractC6492s.h(charArray, "toCharArray(...)");
            q.a aVarC = aVarA.c(new SupportFactory(SQLiteDatabase.getBytes(charArray), null, true));
            d dVar = d.f10003a;
            return (TeleportTunnelDb) aVarC.a(dVar.a()).a(dVar.b()).a(dVar.c()).a(dVar.d()).a(dVar.e()).a(dVar.f()).a(dVar.g()).b();
        }

        private Companion() {
        }
    }

    public abstract b C();
}
