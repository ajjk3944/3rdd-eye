package Ra;

import Ii.J;
import Ta.d;
import com.ui.sso.account.UIAccountManager;
import com.ui.sso.api.UiAccountApi;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f19667a;

    /* renamed from: b, reason: collision with root package name */
    private final d f19668b;

    /* renamed from: c, reason: collision with root package name */
    private final Qa.a f19669c;

    /* renamed from: d, reason: collision with root package name */
    private final J f19670d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final UIAccountManager f19671a;

        /* renamed from: b, reason: collision with root package name */
        private final String f19672b;

        /* renamed from: c, reason: collision with root package name */
        private final UiAccountApi.d f19673c;

        public a(UIAccountManager accountManager, String accountType, UiAccountApi.d supportFile) {
            AbstractC6492s.i(accountManager, "accountManager");
            AbstractC6492s.i(accountType, "accountType");
            AbstractC6492s.i(supportFile, "supportFile");
            this.f19671a = accountManager;
            this.f19672b = accountType;
            this.f19673c = supportFile;
        }

        public final UIAccountManager a() {
            return this.f19671a;
        }

        public final String b() {
            return this.f19672b;
        }

        public final UiAccountApi.d c() {
            return this.f19673c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f19671a, aVar.f19671a) && AbstractC6492s.d(this.f19672b, aVar.f19672b) && AbstractC6492s.d(this.f19673c, aVar.f19673c);
        }

        public int hashCode() {
            return (((this.f19671a.hashCode() * 31) + this.f19672b.hashCode()) * 31) + this.f19673c.hashCode();
        }

        public String toString() {
            return "Params(accountManager=" + this.f19671a + ", accountType=" + this.f19672b + ", supportFile=" + this.f19673c + ")";
        }
    }

    /* renamed from: Ra.b$b, reason: collision with other inner class name */
    static final class C0700b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f19674a;

        /* renamed from: b, reason: collision with root package name */
        Object f19675b;

        /* renamed from: c, reason: collision with root package name */
        Object f19676c;

        /* renamed from: d, reason: collision with root package name */
        Object f19677d;

        /* renamed from: e, reason: collision with root package name */
        Object f19678e;

        /* renamed from: f, reason: collision with root package name */
        Object f19679f;

        /* renamed from: g, reason: collision with root package name */
        Object f19680g;

        /* renamed from: h, reason: collision with root package name */
        int f19681h;

        /* renamed from: i, reason: collision with root package name */
        boolean f19682i;

        /* renamed from: j, reason: collision with root package name */
        boolean f19683j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f19684k;

        /* renamed from: m, reason: collision with root package name */
        int f19686m;

        C0700b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19684k = obj;
            this.f19686m |= PduHandle.NONE;
            return b.this.a(null, null, this);
        }
    }

    public b(String appPackage, d deviceIdentifiersService, Qa.a apiOwnershipManager, J dispatcherDefault) {
        AbstractC6492s.i(appPackage, "appPackage");
        AbstractC6492s.i(deviceIdentifiersService, "deviceIdentifiersService");
        AbstractC6492s.i(apiOwnershipManager, "apiOwnershipManager");
        AbstractC6492s.i(dispatcherDefault, "dispatcherDefault");
        this.f19667a = appPackage;
        this.f19668b = deviceIdentifiersService;
        this.f19669c = apiOwnershipManager;
        this.f19670d = dispatcherDefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(Ii.N r24, Ra.b.a r25, dh.InterfaceC5380e r26) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.b.a(Ii.N, Ra.b$a, dh.e):java.lang.Object");
    }
}
