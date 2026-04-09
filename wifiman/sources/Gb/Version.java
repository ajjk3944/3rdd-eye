package gb;

import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u0011 B3\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0017R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001c\u0012\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u0017¨\u0006'"}, d2 = {"Lgb/p;", "", "", "seen0", "versionMajor", "versionMinor", "versionPatch", "LZi/R0;", "serializationConstructorMarker", "<init>", "(IIIILZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lgb/p;LYi/d;LXi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVersionMajor", "getVersionMajor$annotations", "()V", SnmpConfigurator.O_BIND_ADDRESS, "getVersionMinor", "getVersionMinor$annotations", SnmpConfigurator.O_COMMUNITY, "getVersionPatch", "getVersionPatch$annotations", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gb.p, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class Version {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int versionMajor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int versionMinor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int versionPatch;

    /* renamed from: gb.p$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47831a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f47831a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.client.http.models.Version", aVar, 3);
            h02.p("version_major", false);
            h02.p("version_minor", false);
            h02.p("version_patch", false);
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
            W w10 = W.f25597a;
            return new Vi.b[]{w10, w10, w10};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Version c(Yi.e decoder) {
            int i10;
            int i11;
            int i12;
            int i13;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            if (cVarC.B()) {
                int i14 = cVarC.i(fVar, 0);
                int i15 = cVarC.i(fVar, 1);
                i10 = i14;
                i11 = cVarC.i(fVar, 2);
                i12 = i15;
                i13 = 7;
            } else {
                boolean z10 = true;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        i16 = cVarC.i(fVar, 0);
                        i19 |= 1;
                    } else if (iK == 1) {
                        i18 = cVarC.i(fVar, 1);
                        i19 |= 2;
                    } else {
                        if (iK != 2) {
                            throw new UnknownFieldException(iK);
                        }
                        i17 = cVarC.i(fVar, 2);
                        i19 |= 4;
                    }
                }
                i10 = i16;
                i11 = i17;
                i12 = i18;
                i13 = i19;
            }
            cVarC.b(fVar);
            return new Version(i13, i10, i12, i11, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, Version value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            Version.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: gb.p$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f47831a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Version(int i10, int i11, int i12, int i13, R0 r02) {
        if (7 != (i10 & 7)) {
            C0.a(i10, 7, a.f47831a.a());
        }
        this.versionMajor = i11;
        this.versionMinor = i12;
        this.versionPatch = i13;
    }

    public static final /* synthetic */ void a(Version self, Yi.d output, Xi.f serialDesc) {
        output.C(serialDesc, 0, self.versionMajor);
        output.C(serialDesc, 1, self.versionMinor);
        output.C(serialDesc, 2, self.versionPatch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Version)) {
            return false;
        }
        Version version = (Version) other;
        return this.versionMajor == version.versionMajor && this.versionMinor == version.versionMinor && this.versionPatch == version.versionPatch;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.versionMajor) * 31) + Integer.hashCode(this.versionMinor)) * 31) + Integer.hashCode(this.versionPatch);
    }

    public String toString() {
        return "Version(versionMajor=" + this.versionMajor + ", versionMinor=" + this.versionMinor + ", versionPatch=" + this.versionPatch + ")";
    }
}
