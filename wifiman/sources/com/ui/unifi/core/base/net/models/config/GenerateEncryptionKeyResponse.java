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
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@n
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyResponse;", "", "", "publicKey", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "write$Self$unificore_release", "(Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyResponse;LYi/d;LXi/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPublicKey", "getPublicKey$annotations", "()V", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GenerateEncryptionKeyResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String publicKey;

    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42356a;
        private static final f descriptor;

        static {
            a aVar = new a();
            f42356a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.config.GenerateEncryptionKeyResponse", aVar, 1);
            h02.p("publicKey", false);
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
            return new b[]{W0.f25599a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final GenerateEncryptionKeyResponse c(e decoder) {
            String strW;
            AbstractC6492s.i(decoder, "decoder");
            f fVar = descriptor;
            c cVarC = decoder.c(fVar);
            int i10 = 1;
            R0 r02 = null;
            if (cVarC.B()) {
                strW = cVarC.w(fVar, 0);
            } else {
                boolean z10 = true;
                int i11 = 0;
                strW = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else {
                        if (iK != 0) {
                            throw new UnknownFieldException(iK);
                        }
                        strW = cVarC.w(fVar, 0);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarC.b(fVar);
            return new GenerateEncryptionKeyResponse(i10, strW, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, GenerateEncryptionKeyResponse value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            f fVar = descriptor;
            d dVarC = encoder.c(fVar);
            GenerateEncryptionKeyResponse.write$Self$unificore_release(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: com.ui.unifi.core.base.net.models.config.GenerateEncryptionKeyResponse$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final b serializer() {
            return a.f42356a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GenerateEncryptionKeyResponse(int i10, String str, R0 r02) {
        if (1 != (i10 & 1)) {
            C0.a(i10, 1, a.f42356a.a());
        }
        this.publicKey = str;
    }

    public static /* synthetic */ GenerateEncryptionKeyResponse copy$default(GenerateEncryptionKeyResponse generateEncryptionKeyResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = generateEncryptionKeyResponse.publicKey;
        }
        return generateEncryptionKeyResponse.copy(str);
    }

    @m("publicKey")
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$unificore_release(GenerateEncryptionKeyResponse self, d output, f serialDesc) {
        output.y(serialDesc, 0, self.publicKey);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    public final GenerateEncryptionKeyResponse copy(String publicKey) {
        AbstractC6492s.i(publicKey, "publicKey");
        return new GenerateEncryptionKeyResponse(publicKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GenerateEncryptionKeyResponse) && AbstractC6492s.d(this.publicKey, ((GenerateEncryptionKeyResponse) other).publicKey);
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return this.publicKey.hashCode();
    }

    public String toString() {
        return "GenerateEncryptionKeyResponse(publicKey=" + this.publicKey + ")";
    }

    public GenerateEncryptionKeyResponse(String publicKey) {
        AbstractC6492s.i(publicKey, "publicKey");
        this.publicKey = publicKey;
    }
}
