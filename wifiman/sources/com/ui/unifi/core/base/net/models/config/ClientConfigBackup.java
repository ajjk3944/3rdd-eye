package com.ui.unifi.core.base.net.models.config;

import Vi.b;
import Vi.m;
import Vi.n;
import Xi.f;
import Yi.c;
import Yi.d;
import Yi.e;
import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import androidx.annotation.Keep;
import com.ui.unifi.core.base.net.models.config.BackupConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@n
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006-"}, d2 = {"Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;", "", "Lcom/ui/unifi/core/base/net/models/config/BackupConfig;", "backup", "", "url", "<init>", "(Lcom/ui/unifi/core/base/net/models/config/BackupConfig;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILcom/ui/unifi/core/base/net/models/config/BackupConfig;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "write$Self$unificore_release", "(Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;LYi/d;LXi/f;)V", "write$Self", "component1", "()Lcom/ui/unifi/core/base/net/models/config/BackupConfig;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/ui/unifi/core/base/net/models/config/BackupConfig;Ljava/lang/String;)Lcom/ui/unifi/core/base/net/models/config/ClientConfigBackup;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ui/unifi/core/base/net/models/config/BackupConfig;", "getBackup", "getBackup$annotations", "()V", "Ljava/lang/String;", "getUrl", "getUrl$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ClientConfigBackup {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BackupConfig backup;
    private final String url;

    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42350a;
        private static final f descriptor;

        static {
            a aVar = new a();
            f42350a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.config.ClientConfigBackup", aVar, 2);
            h02.p("backup", false);
            h02.p("url", false);
            descriptor = h02;
        }

        private a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final b[] d() {
            return new b[]{BackupConfig.a.f42349a, W0.f25599a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final ClientConfigBackup c(e decoder) {
            BackupConfig backupConfig;
            String strW;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            f fVar = descriptor;
            c cVarC = decoder.c(fVar);
            R0 r02 = null;
            if (cVarC.B()) {
                backupConfig = (BackupConfig) cVarC.p(fVar, 0, BackupConfig.a.f42349a, null);
                strW = cVarC.w(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                backupConfig = null;
                String strW2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        backupConfig = (BackupConfig) cVarC.p(fVar, 0, BackupConfig.a.f42349a, backupConfig);
                        i11 |= 1;
                    } else {
                        if (iK != 1) {
                            throw new UnknownFieldException(iK);
                        }
                        strW2 = cVarC.w(fVar, 1);
                        i11 |= 2;
                    }
                }
                strW = strW2;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new ClientConfigBackup(i10, backupConfig, strW, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, ClientConfigBackup value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            f fVar = descriptor;
            d dVarC = encoder.c(fVar);
            ClientConfigBackup.write$Self$unificore_release(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: com.ui.unifi.core.base.net.models.config.ClientConfigBackup$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final b serializer() {
            return a.f42350a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ClientConfigBackup(int i10, BackupConfig backupConfig, String str, R0 r02) {
        if (3 != (i10 & 3)) {
            C0.a(i10, 3, a.f42350a.a());
        }
        this.backup = backupConfig;
        this.url = str;
    }

    public static /* synthetic */ ClientConfigBackup copy$default(ClientConfigBackup clientConfigBackup, BackupConfig backupConfig, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            backupConfig = clientConfigBackup.backup;
        }
        if ((i10 & 2) != 0) {
            str = clientConfigBackup.url;
        }
        return clientConfigBackup.copy(backupConfig, str);
    }

    @m("backup")
    public static /* synthetic */ void getBackup$annotations() {
    }

    @m("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$unificore_release(ClientConfigBackup self, d output, f serialDesc) {
        output.q(serialDesc, 0, BackupConfig.a.f42349a, self.backup);
        output.y(serialDesc, 1, self.url);
    }

    /* renamed from: component1, reason: from getter */
    public final BackupConfig getBackup() {
        return this.backup;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final ClientConfigBackup copy(BackupConfig backup, String url) {
        AbstractC6492s.i(backup, "backup");
        AbstractC6492s.i(url, "url");
        return new ClientConfigBackup(backup, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientConfigBackup)) {
            return false;
        }
        ClientConfigBackup clientConfigBackup = (ClientConfigBackup) other;
        return AbstractC6492s.d(this.backup, clientConfigBackup.backup) && AbstractC6492s.d(this.url, clientConfigBackup.url);
    }

    public final BackupConfig getBackup() {
        return this.backup;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.backup.hashCode() * 31) + this.url.hashCode();
    }

    public String toString() {
        return "ClientConfigBackup(backup=" + this.backup + ", url=" + this.url + ")";
    }

    public ClientConfigBackup(BackupConfig backup, String url) {
        AbstractC6492s.i(backup, "backup");
        AbstractC6492s.i(url, "url");
        this.backup = backup;
        this.url = url;
    }
}
