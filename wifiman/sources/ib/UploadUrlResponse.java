package ib;

import Vi.n;
import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u001b\u0011B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0014R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b \u0010\u001f\u001a\u0004\b\u001b\u0010\u0014¨\u0006\""}, d2 = {"Lib/b;", "", "", "seen0", "", "id", "uploadUrl", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lib/b;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getUploadUrl$annotations", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ib.b, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class UploadUrlResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uploadUrl;

    /* renamed from: ib.b$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f49123a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f49123a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.client.webrtc.log.UploadUrlResponse", aVar, 2);
            h02.p("id", true);
            h02.p("upload_url", false);
            descriptor = h02;
        }

        private a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final Xi.f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final Vi.b[] d() {
            W0 w02 = W0.f25599a;
            return new Vi.b[]{Wi.a.u(w02), w02};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final UploadUrlResponse c(Yi.e decoder) {
            String str;
            String strW;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            R0 r02 = null;
            if (cVarC.B()) {
                str = (String) cVarC.h(fVar, 0, W0.f25599a, null);
                strW = cVarC.w(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                str = null;
                String strW2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        str = (String) cVarC.h(fVar, 0, W0.f25599a, str);
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
            return new UploadUrlResponse(i10, str, strW, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, UploadUrlResponse value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            UploadUrlResponse.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: ib.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f49123a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UploadUrlResponse(int i10, String str, String str2, R0 r02) {
        if (2 != (i10 & 2)) {
            C0.a(i10, 2, a.f49123a.a());
        }
        if ((i10 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.uploadUrl = str2;
    }

    public static final /* synthetic */ void b(UploadUrlResponse self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || self.id != null) {
            output.t(serialDesc, 0, W0.f25599a, self.id);
        }
        output.y(serialDesc, 1, self.uploadUrl);
    }

    /* renamed from: a, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadUrlResponse)) {
            return false;
        }
        UploadUrlResponse uploadUrlResponse = (UploadUrlResponse) other;
        return AbstractC6492s.d(this.id, uploadUrlResponse.id) && AbstractC6492s.d(this.uploadUrl, uploadUrlResponse.uploadUrl);
    }

    public int hashCode() {
        String str = this.id;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.uploadUrl.hashCode();
    }

    public String toString() {
        return "UploadUrlResponse(id=" + this.id + ", uploadUrl=" + this.uploadUrl + ")";
    }
}
