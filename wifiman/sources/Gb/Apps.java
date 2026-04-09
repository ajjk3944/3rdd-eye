package gb;

import Zg.AbstractC3689v;
import Zi.C3704f;
import Zi.H0;
import Zi.M;
import Zi.R0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mb.x;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u001e B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006$"}, d2 = {"Lgb/b;", "", "", "Lmb/x;", "apps", "controllers", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "d", "(Lgb/b;LYi/d;LXi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", SnmpConfigurator.O_BIND_ADDRESS, "()Ljava/util/List;", SnmpConfigurator.O_COMMUNITY, "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gb.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class Apps {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Vi.b[] f47759c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List apps;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List controllers;

    /* renamed from: gb.b$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47762a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f47762a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.client.http.models.Apps", aVar, 2);
            h02.p("apps", true);
            h02.p("controllers", true);
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
            Vi.b[] bVarArr = Apps.f47759c;
            return new Vi.b[]{bVarArr[0], bVarArr[1]};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Apps c(Yi.e decoder) {
            List list;
            List list2;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = Apps.f47759c;
            R0 r02 = null;
            if (cVarC.B()) {
                list2 = (List) cVarC.p(fVar, 0, bVarArr[0], null);
                list = (List) cVarC.p(fVar, 1, bVarArr[1], null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list3 = null;
                List list4 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        list4 = (List) cVarC.p(fVar, 0, bVarArr[0], list4);
                        i11 |= 1;
                    } else {
                        if (iK != 1) {
                            throw new UnknownFieldException(iK);
                        }
                        list3 = (List) cVarC.p(fVar, 1, bVarArr[1], list3);
                        i11 |= 2;
                    }
                }
                list = list3;
                list2 = list4;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new Apps(i10, list2, list, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, Apps value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            Apps.d(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: gb.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f47762a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        x.Companion aVar = x.INSTANCE;
        f47759c = new Vi.b[]{new C3704f(aVar.serializer()), new C3704f(aVar.serializer())};
    }

    public /* synthetic */ Apps(int i10, List list, List list2, R0 r02) {
        this.apps = (i10 & 1) == 0 ? AbstractC3689v.l() : list;
        if ((i10 & 2) == 0) {
            this.controllers = AbstractC3689v.l();
        } else {
            this.controllers = list2;
        }
    }

    public static final /* synthetic */ void d(Apps self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f47759c;
        if (output.o(serialDesc, 0) || !AbstractC6492s.d(self.apps, AbstractC3689v.l())) {
            output.q(serialDesc, 0, bVarArr[0], self.apps);
        }
        if (!output.o(serialDesc, 1) && AbstractC6492s.d(self.controllers, AbstractC3689v.l())) {
            return;
        }
        output.q(serialDesc, 1, bVarArr[1], self.controllers);
    }

    /* renamed from: b, reason: from getter */
    public final List getApps() {
        return this.apps;
    }

    /* renamed from: c, reason: from getter */
    public final List getControllers() {
        return this.controllers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Apps)) {
            return false;
        }
        Apps apps = (Apps) other;
        return AbstractC6492s.d(this.apps, apps.apps) && AbstractC6492s.d(this.controllers, apps.controllers);
    }

    public int hashCode() {
        return (this.apps.hashCode() * 31) + this.controllers.hashCode();
    }

    public String toString() {
        return "Apps(apps=" + this.apps + ", controllers=" + this.controllers + ")";
    }

    public Apps(List apps, List controllers) {
        AbstractC6492s.i(apps, "apps");
        AbstractC6492s.i(controllers, "controllers");
        this.apps = apps;
        this.controllers = controllers;
    }

    public /* synthetic */ Apps(List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC3689v.l() : list, (i10 & 2) != 0 ? AbstractC3689v.l() : list2);
    }
}
