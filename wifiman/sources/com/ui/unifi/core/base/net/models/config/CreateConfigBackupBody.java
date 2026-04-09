package com.ui.unifi.core.base.net.models.config;

import Vi.b;
import Vi.n;
import Xi.f;
import Yi.c;
import Yi.d;
import Yi.e;
import Zi.C0;
import Zi.C3697b0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@n
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;", "", "", "filename", "", "metadata", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "write$Self$unificore_release", "(Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;LYi/d;LXi/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/ui/unifi/core/base/net/models/config/CreateConfigBackupBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFilename", "Ljava/util/Map;", "getMetadata", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreateConfigBackupBody {
    private static final b[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String filename;
    private final Map<String, String> metadata;

    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42352a;
        private static final f descriptor;

        static {
            a aVar = new a();
            f42352a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.config.CreateConfigBackupBody", aVar, 2);
            h02.p("filename", false);
            h02.p("metadata", false);
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
            return new b[]{W0.f25599a, CreateConfigBackupBody.$childSerializers[1]};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final CreateConfigBackupBody c(e decoder) {
            Map map;
            String strW;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            f fVar = descriptor;
            c cVarC = decoder.c(fVar);
            b[] bVarArr = CreateConfigBackupBody.$childSerializers;
            R0 r02 = null;
            if (cVarC.B()) {
                strW = cVarC.w(fVar, 0);
                map = (Map) cVarC.p(fVar, 1, bVarArr[1], null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Map map2 = null;
                String strW2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW2 = cVarC.w(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iK != 1) {
                            throw new UnknownFieldException(iK);
                        }
                        map2 = (Map) cVarC.p(fVar, 1, bVarArr[1], map2);
                        i11 |= 2;
                    }
                }
                map = map2;
                strW = strW2;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new CreateConfigBackupBody(i10, strW, map, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, CreateConfigBackupBody value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            f fVar = descriptor;
            d dVarC = encoder.c(fVar);
            CreateConfigBackupBody.write$Self$unificore_release(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: com.ui.unifi.core.base.net.models.config.CreateConfigBackupBody$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final b serializer() {
            return a.f42352a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        W0 w02 = W0.f25599a;
        $childSerializers = new b[]{null, new C3697b0(w02, w02)};
    }

    public /* synthetic */ CreateConfigBackupBody(int i10, String str, Map map, R0 r02) {
        if (3 != (i10 & 3)) {
            C0.a(i10, 3, a.f42352a.a());
        }
        this.filename = str;
        this.metadata = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateConfigBackupBody copy$default(CreateConfigBackupBody createConfigBackupBody, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createConfigBackupBody.filename;
        }
        if ((i10 & 2) != 0) {
            map = createConfigBackupBody.metadata;
        }
        return createConfigBackupBody.copy(str, map);
    }

    public static final /* synthetic */ void write$Self$unificore_release(CreateConfigBackupBody self, d output, f serialDesc) {
        b[] bVarArr = $childSerializers;
        output.y(serialDesc, 0, self.filename);
        output.q(serialDesc, 1, bVarArr[1], self.metadata);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    public final Map<String, String> component2() {
        return this.metadata;
    }

    public final CreateConfigBackupBody copy(String filename, Map<String, String> metadata) {
        AbstractC6492s.i(filename, "filename");
        AbstractC6492s.i(metadata, "metadata");
        return new CreateConfigBackupBody(filename, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateConfigBackupBody)) {
            return false;
        }
        CreateConfigBackupBody createConfigBackupBody = (CreateConfigBackupBody) other;
        return AbstractC6492s.d(this.filename, createConfigBackupBody.filename) && AbstractC6492s.d(this.metadata, createConfigBackupBody.metadata);
    }

    public final String getFilename() {
        return this.filename;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return (this.filename.hashCode() * 31) + this.metadata.hashCode();
    }

    public String toString() {
        return "CreateConfigBackupBody(filename=" + this.filename + ", metadata=" + this.metadata + ")";
    }

    public CreateConfigBackupBody(String filename, Map<String, String> metadata) {
        AbstractC6492s.i(filename, "filename");
        AbstractC6492s.i(metadata, "metadata");
        this.filename = filename;
        this.metadata = metadata;
    }
}
