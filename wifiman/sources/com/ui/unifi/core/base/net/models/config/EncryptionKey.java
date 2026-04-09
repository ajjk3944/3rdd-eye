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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0018R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u0018¨\u00062"}, d2 = {"Lcom/ui/unifi/core/base/net/models/config/EncryptionKey;", "", "", "pepper", "privateKey", "publicKey", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "write$Self$unificore_release", "(Lcom/ui/unifi/core/base/net/models/config/EncryptionKey;LYi/d;LXi/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ui/unifi/core/base/net/models/config/EncryptionKey;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPepper", "getPepper$annotations", "()V", "getPrivateKey", "getPrivateKey$annotations", "getPublicKey", "getPublicKey$annotations", "getStatus", "getStatus$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EncryptionKey {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String pepper;
    private final String privateKey;
    private final String publicKey;
    private final String status;

    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42354a;
        private static final f descriptor;

        static {
            a aVar = new a();
            f42354a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.config.EncryptionKey", aVar, 4);
            h02.p("pepper", false);
            h02.p("privateKey", false);
            h02.p("publicKey", false);
            h02.p("status", false);
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
            W0 w02 = W0.f25599a;
            return new b[]{w02, w02, w02, w02};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final EncryptionKey c(e decoder) {
            String str;
            String strW;
            String str2;
            String str3;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            f fVar = descriptor;
            c cVarC = decoder.c(fVar);
            if (cVarC.B()) {
                String strW2 = cVarC.w(fVar, 0);
                String strW3 = cVarC.w(fVar, 1);
                String strW4 = cVarC.w(fVar, 2);
                str = strW2;
                strW = cVarC.w(fVar, 3);
                str2 = strW4;
                str3 = strW3;
                i10 = 15;
            } else {
                String strW5 = null;
                String strW6 = null;
                String strW7 = null;
                String strW8 = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW5 = cVarC.w(fVar, 0);
                        i11 |= 1;
                    } else if (iK == 1) {
                        strW8 = cVarC.w(fVar, 1);
                        i11 |= 2;
                    } else if (iK == 2) {
                        strW7 = cVarC.w(fVar, 2);
                        i11 |= 4;
                    } else {
                        if (iK != 3) {
                            throw new UnknownFieldException(iK);
                        }
                        strW6 = cVarC.w(fVar, 3);
                        i11 |= 8;
                    }
                }
                str = strW5;
                strW = strW6;
                str2 = strW7;
                str3 = strW8;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new EncryptionKey(i10, str, str3, str2, strW, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, EncryptionKey value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            f fVar = descriptor;
            d dVarC = encoder.c(fVar);
            EncryptionKey.write$Self$unificore_release(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: com.ui.unifi.core.base.net.models.config.EncryptionKey$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final b serializer() {
            return a.f42354a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EncryptionKey(int i10, String str, String str2, String str3, String str4, R0 r02) {
        if (15 != (i10 & 15)) {
            C0.a(i10, 15, a.f42354a.a());
        }
        this.pepper = str;
        this.privateKey = str2;
        this.publicKey = str3;
        this.status = str4;
    }

    public static /* synthetic */ EncryptionKey copy$default(EncryptionKey encryptionKey, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = encryptionKey.pepper;
        }
        if ((i10 & 2) != 0) {
            str2 = encryptionKey.privateKey;
        }
        if ((i10 & 4) != 0) {
            str3 = encryptionKey.publicKey;
        }
        if ((i10 & 8) != 0) {
            str4 = encryptionKey.status;
        }
        return encryptionKey.copy(str, str2, str3, str4);
    }

    @m("pepper")
    public static /* synthetic */ void getPepper$annotations() {
    }

    @m("privateKey")
    public static /* synthetic */ void getPrivateKey$annotations() {
    }

    @m("publicKey")
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @m("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    public static final /* synthetic */ void write$Self$unificore_release(EncryptionKey self, d output, f serialDesc) {
        output.y(serialDesc, 0, self.pepper);
        output.y(serialDesc, 1, self.privateKey);
        output.y(serialDesc, 2, self.publicKey);
        output.y(serialDesc, 3, self.status);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPepper() {
        return this.pepper;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrivateKey() {
        return this.privateKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final EncryptionKey copy(String pepper, String privateKey, String publicKey, String status) {
        AbstractC6492s.i(pepper, "pepper");
        AbstractC6492s.i(privateKey, "privateKey");
        AbstractC6492s.i(publicKey, "publicKey");
        AbstractC6492s.i(status, "status");
        return new EncryptionKey(pepper, privateKey, publicKey, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptionKey)) {
            return false;
        }
        EncryptionKey encryptionKey = (EncryptionKey) other;
        return AbstractC6492s.d(this.pepper, encryptionKey.pepper) && AbstractC6492s.d(this.privateKey, encryptionKey.privateKey) && AbstractC6492s.d(this.publicKey, encryptionKey.publicKey) && AbstractC6492s.d(this.status, encryptionKey.status);
    }

    public final String getPepper() {
        return this.pepper;
    }

    public final String getPrivateKey() {
        return this.privateKey;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.pepper.hashCode() * 31) + this.privateKey.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "EncryptionKey(pepper=" + this.pepper + ", privateKey=" + this.privateKey + ", publicKey=" + this.publicKey + ", status=" + this.status + ")";
    }

    public EncryptionKey(String pepper, String privateKey, String publicKey, String status) {
        AbstractC6492s.i(pepper, "pepper");
        AbstractC6492s.i(privateKey, "privateKey");
        AbstractC6492s.i(publicKey, "publicKey");
        AbstractC6492s.i(status, "status");
        this.pepper = pepper;
        this.privateKey = privateKey;
        this.publicKey = publicKey;
        this.status = status;
    }
}
