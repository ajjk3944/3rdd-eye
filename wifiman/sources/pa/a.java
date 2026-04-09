package Pa;

import Ii.AbstractC3059i;
import Ii.J;
import Ii.N;
import Vi.b;
import Vi.n;
import Vi.w;
import Yg.v;
import Zg.AbstractC3689v;
import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import aj.AbstractC3868b;
import android.content.SharedPreferences;
import ch.AbstractC4260a;
import com.ui.sso.account.UIAccountManager;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.text.t;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.UnknownFieldException;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public final class a implements UIAccountManager {

    /* renamed from: f, reason: collision with root package name */
    public static final C0649a f18498f = new C0649a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f18499a;

    /* renamed from: b, reason: collision with root package name */
    private final Oa.a f18500b;

    /* renamed from: c, reason: collision with root package name */
    private final J f18501c;

    /* renamed from: d, reason: collision with root package name */
    private final Na.c f18502d;

    /* renamed from: e, reason: collision with root package name */
    private UIAccountManager.a f18503e;

    /* renamed from: Pa.a$a, reason: collision with other inner class name */
    public static final class C0649a {
        public /* synthetic */ C0649a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0649a() {
        }
    }

    @n
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002\u001e#B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001f\u0012\u0004\b&\u0010\"\u001a\u0004\b%\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001f\u0012\u0004\b'\u0010\"\u001a\u0004\b\u001e\u0010\u0017¨\u0006)"}, d2 = {"LPa/a$b;", "", "", "id", "email", "username", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(LPa/a$b;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "getId$annotations", "()V", SnmpConfigurator.O_BIND_ADDRESS, "getEmail$annotations", "d", "getUsername$annotations", "getAvatar$annotations", "Companion", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pa.a$b, reason: from toString */
    public static final /* data */ class PersistentAccount {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String username;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String avatar;

        /* renamed from: Pa.a$b$a, reason: collision with other inner class name */
        public static final class C0650a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final C0650a f18508a;
            private static final /* synthetic */ H0 descriptor;

            static {
                C0650a c0650a = new C0650a();
                f18508a = c0650a;
                H0 h02 = new H0("com.ui.sso.account.local.UiAccountManagerSharedPref.PersistentAccount", c0650a, 4);
                h02.p("id", false);
                h02.p("email", false);
                h02.p("username", false);
                h02.p("avatar", false);
                descriptor = h02;
            }

            private C0650a() {
            }

            @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
            public Xi.f a() {
                return descriptor;
            }

            @Override // Zi.M
            public b[] b() {
                return M.a.a(this);
            }

            @Override // Zi.M
            public b[] d() {
                W0 w02 = W0.f25599a;
                return new b[]{w02, w02, w02, Wi.a.u(w02)};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public PersistentAccount c(Yi.e decoder) {
                int i10;
                String str;
                String str2;
                String str3;
                String str4;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVarA = a();
                Yi.c cVarC = decoder.c(fVarA);
                String strW = null;
                if (cVarC.B()) {
                    String strW2 = cVarC.w(fVarA, 0);
                    String strW3 = cVarC.w(fVarA, 1);
                    String strW4 = cVarC.w(fVarA, 2);
                    str = strW2;
                    str4 = (String) cVarC.h(fVarA, 3, W0.f25599a, null);
                    str3 = strW4;
                    str2 = strW3;
                    i10 = 15;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    String strW5 = null;
                    String strW6 = null;
                    String str5 = null;
                    while (z10) {
                        int iK = cVarC.k(fVarA);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW = cVarC.w(fVarA, 0);
                            i11 |= 1;
                        } else if (iK == 1) {
                            strW5 = cVarC.w(fVarA, 1);
                            i11 |= 2;
                        } else if (iK == 2) {
                            strW6 = cVarC.w(fVarA, 2);
                            i11 |= 4;
                        } else {
                            if (iK != 3) {
                                throw new UnknownFieldException(iK);
                            }
                            str5 = (String) cVarC.h(fVarA, 3, W0.f25599a, str5);
                            i11 |= 8;
                        }
                    }
                    i10 = i11;
                    str = strW;
                    str2 = strW5;
                    str3 = strW6;
                    str4 = str5;
                }
                cVarC.b(fVarA);
                return new PersistentAccount(i10, str, str2, str3, str4, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(Yi.f encoder, PersistentAccount value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVarA = a();
                Yi.d dVarC = encoder.c(fVarA);
                PersistentAccount.e(value, dVarC, fVarA);
                dVarC.b(fVarA);
            }
        }

        /* renamed from: Pa.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return C0650a.f18508a;
            }

            private Companion() {
            }
        }

        public /* synthetic */ PersistentAccount(int i10, String str, String str2, String str3, String str4, R0 r02) {
            if (15 != (i10 & 15)) {
                C0.a(i10, 15, C0650a.f18508a.a());
            }
            this.id = str;
            this.email = str2;
            this.username = str3;
            this.avatar = str4;
        }

        public static final /* synthetic */ void e(PersistentAccount self, Yi.d output, Xi.f serialDesc) {
            output.y(serialDesc, 0, self.id);
            output.y(serialDesc, 1, self.email);
            output.y(serialDesc, 2, self.username);
            output.t(serialDesc, 3, W0.f25599a, self.avatar);
        }

        /* renamed from: a, reason: from getter */
        public final String getAvatar() {
            return this.avatar;
        }

        /* renamed from: b, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: d, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersistentAccount)) {
                return false;
            }
            PersistentAccount persistentAccount = (PersistentAccount) other;
            return AbstractC6492s.d(this.id, persistentAccount.id) && AbstractC6492s.d(this.email, persistentAccount.email) && AbstractC6492s.d(this.username, persistentAccount.username) && AbstractC6492s.d(this.avatar, persistentAccount.avatar);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.email.hashCode()) * 31) + this.username.hashCode()) * 31;
            String str = this.avatar;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PersistentAccount(id=" + this.id + ", email=" + this.email + ", username=" + this.username + ", avatar=" + this.avatar + ")";
        }

        public PersistentAccount(String id2, String email, String username, String str) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(email, "email");
            AbstractC6492s.i(username, "username");
            this.id = id2;
            this.email = email;
            this.username = username;
            this.avatar = str;
        }
    }

    static final class c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f18509a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f18511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(UUID uuid, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f18511c = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new c(this.f18511c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean zCommit;
            Object objG = AbstractC5467b.g();
            int i10 = this.f18509a;
            if (i10 == 0) {
                v.b(obj);
                a aVar = a.this;
                UUID uuid = this.f18511c;
                this.f18509a = 1;
                if (aVar.t(uuid, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            SharedPreferences sharedPreferences = a.this.f18499a;
            a aVar2 = a.this;
            UUID uuid2 = this.f18511c;
            synchronized (sharedPreferences) {
                zCommit = aVar2.f18499a.edit().remove(aVar2.s(uuid2)).commit();
            }
            if (zCommit) {
                a.this.f18500b.b();
                a.this.f18500b.a(this.f18511c);
                return Yg.J.f24997a;
            }
            throw new UIAccountManager.Error.IO("Failed to delete account " + this.f18511c, null, 2, null);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f18512a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f18513b;

        /* renamed from: d, reason: collision with root package name */
        int f18515d;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18513b = obj;
            this.f18515d |= PduHandle.NONE;
            return a.this.t(null, this);
        }
    }

    static final class e extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f18516a;

        /* renamed from: Pa.a$e$a, reason: collision with other inner class name */
        public static final class C0652a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((Na.b) obj).c(), ((Na.b) obj2).c());
            }
        }

        e(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new e(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List listA;
            AbstractC5467b.g();
            if (this.f18516a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            SharedPreferences sharedPreferences = a.this.f18499a;
            a aVar = a.this;
            synchronized (sharedPreferences) {
                List listC = AbstractC3689v.c();
                try {
                    Map<String, ?> all = aVar.f18499a.getAll();
                    AbstractC6492s.f(all);
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        AbstractC6492s.f(key);
                        if (t.P(key, "acc", false, 2, null)) {
                            String str = value instanceof String ? (String) value : null;
                            if (str != null) {
                                try {
                                    AbstractC3868b.a aVar2 = AbstractC3868b.f26328d;
                                    kotlin.coroutines.jvm.internal.b.a(listC.add(aVar.r((PersistentAccount) aVar2.b(w.c(aVar2.a(), O.l(PersistentAccount.class)), str))));
                                } catch (SerializationException e10) {
                                    throw new UIAccountManager.Error.IO("Failed to decode acc " + key, e10);
                                } catch (IllegalArgumentException e11) {
                                    throw new UIAccountManager.Error.IO("Failed to decode acc " + key, e11);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    listA = AbstractC3689v.a(listC);
                } catch (NullPointerException e12) {
                    throw new UIAccountManager.Error.IO("failed to read shared preferences", e12);
                } catch (SecurityException e13) {
                    throw new UIAccountManager.Error.IO("failed to read shared preferences", e13);
                }
            }
            return AbstractC3689v.X0(listA, new C0652a());
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class f extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f18518a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f18520c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f18521d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(UUID uuid, String str, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f18520c = uuid;
            this.f18521d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new f(this.f18520c, this.f18521d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f18518a;
            if (i10 == 0) {
                v.b(obj);
                a aVar = a.this;
                UUID uuid = this.f18520c;
                this.f18518a = 1;
                if (aVar.t(uuid, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            try {
                return a.this.f18499a.getString(a.this.u(this.f18520c, this.f18521d), null);
            } catch (ClassCastException e10) {
                throw new UIAccountManager.Error.IO("Failed get auth `" + this.f18521d + "` of " + this.f18520c, e10);
            } catch (SecurityException e11) {
                throw new UIAccountManager.Error.IO("Failed get auth `" + this.f18521d + "` of " + this.f18520c, e11);
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class g extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f18522a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f18524c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f18525d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(UUID uuid, String str, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f18524c = uuid;
            this.f18525d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new g(this.f18524c, this.f18525d, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r5.f18522a
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1f
                if (r1 == r2) goto L1b
                if (r1 != r3) goto L12
                Yg.v.b(r6)
                goto L3e
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                Yg.v.b(r6)
                goto L2f
            L1f:
                Yg.v.b(r6)
                Pa.a r6 = Pa.a.this
                java.util.UUID r1 = r5.f18524c
                r5.f18522a = r2
                java.lang.Object r6 = Pa.a.m(r6, r1, r5)
                if (r6 != r0) goto L2f
                return r0
            L2f:
                Pa.a r6 = Pa.a.this
                java.util.UUID r1 = r5.f18524c
                java.lang.String r2 = r5.f18525d
                r5.f18522a = r3
                java.lang.Object r6 = r6.i(r1, r2, r5)
                if (r6 != r0) goto L3e
                return r0
            L3e:
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L9c
                Pa.a r6 = Pa.a.this
                android.content.SharedPreferences r6 = Pa.a.p(r6)
                Pa.a r0 = Pa.a.this
                java.util.UUID r1 = r5.f18524c
                java.lang.String r2 = r5.f18525d
                monitor-enter(r6)
                android.content.SharedPreferences r4 = Pa.a.p(r0)     // Catch: java.lang.Throwable -> L99
                android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L99
                java.lang.String r0 = Pa.a.o(r0, r1, r2)     // Catch: java.lang.Throwable -> L99
                android.content.SharedPreferences$Editor r0 = r4.remove(r0)     // Catch: java.lang.Throwable -> L99
                boolean r0 = r0.commit()     // Catch: java.lang.Throwable -> L99
                monitor-exit(r6)
                if (r0 == 0) goto L74
                Pa.a r6 = Pa.a.this
                Oa.a r6 = Pa.a.n(r6)
                java.util.UUID r0 = r5.f18524c
                r6.a(r0)
                Yg.J r6 = Yg.J.f24997a
                return r6
            L74:
                com.ui.sso.account.UIAccountManager$Error$IO r6 = new com.ui.sso.account.UIAccountManager$Error$IO
                java.lang.String r0 = r5.f18525d
                java.util.UUID r1 = r5.f18524c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Failed to invalidate auth '"
                r2.append(r4)
                r2.append(r0)
                java.lang.String r0 = "' of "
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = r2.toString()
                r1 = 0
                r6.<init>(r0, r1, r3, r1)
                throw r6
            L99:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            L9c:
                com.ui.sso.account.UIAccountManager$Error$NotFound r6 = new com.ui.sso.account.UIAccountManager$Error$NotFound
                java.util.UUID r0 = r5.f18524c
                java.lang.String r1 = r5.f18525d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Account "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = " has no auth of type '"
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = "'"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Pa.a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((g) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class h extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f18526a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Na.b f18528c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Na.b bVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f18528c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new h(this.f18528c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Na.b bVar;
            boolean zCommit;
            Object objG = AbstractC5467b.g();
            int i10 = this.f18526a;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    a aVar = a.this;
                    UUID uuidC = this.f18528c.c();
                    this.f18526a = 1;
                    obj = aVar.t(uuidC, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                bVar = (Na.b) obj;
            } catch (UIAccountManager.Error.NotFound unused) {
                bVar = null;
            }
            if (AbstractC6492s.d(bVar, this.f18528c)) {
                return Yg.J.f24997a;
            }
            SharedPreferences sharedPreferences = a.this.f18499a;
            a aVar2 = a.this;
            Na.b bVar2 = this.f18528c;
            synchronized (sharedPreferences) {
                SharedPreferences.Editor editorEdit = aVar2.f18499a.edit();
                String strS = aVar2.s(bVar2.c());
                AbstractC3868b.a aVar3 = AbstractC3868b.f26328d;
                zCommit = editorEdit.putString(strS, aVar3.c(w.c(aVar3.a(), O.l(PersistentAccount.class)), aVar2.q(bVar2))).commit();
            }
            if (zCommit) {
                a.this.f18500b.b();
                return Yg.J.f24997a;
            }
            throw new UIAccountManager.Error.IO("Failed to update account " + this.f18528c.c(), null, 2, null);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((h) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class i extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f18529a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f18531c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f18532d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f18533e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(UUID uuid, String str, String str2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f18531c = uuid;
            this.f18532d = str;
            this.f18533e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new i(this.f18531c, this.f18532d, this.f18533e, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean zCommit;
            Object objG = AbstractC5467b.g();
            int i10 = this.f18529a;
            if (i10 == 0) {
                v.b(obj);
                a aVar = a.this;
                UUID uuid = this.f18531c;
                this.f18529a = 1;
                if (aVar.t(uuid, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            SharedPreferences sharedPreferences = a.this.f18499a;
            a aVar2 = a.this;
            UUID uuid2 = this.f18531c;
            String str = this.f18532d;
            String str2 = this.f18533e;
            synchronized (sharedPreferences) {
                zCommit = aVar2.f18499a.edit().putString(aVar2.u(uuid2, str), str2).commit();
            }
            if (zCommit) {
                a.this.f18500b.a(this.f18531c);
                return Yg.J.f24997a;
            }
            throw new UIAccountManager.Error.IO("Failed to update auth '" + this.f18532d + "' of " + this.f18531c, null, 2, null);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((i) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public a(SharedPreferences sharedPref, Oa.a accountManagerChangeRegistry, J dispatcherIO) {
        AbstractC6492s.i(sharedPref, "sharedPref");
        AbstractC6492s.i(accountManagerChangeRegistry, "accountManagerChangeRegistry");
        AbstractC6492s.i(dispatcherIO, "dispatcherIO");
        this.f18499a = sharedPref;
        this.f18500b = accountManagerChangeRegistry;
        this.f18501c = dispatcherIO;
        this.f18502d = Na.c.LOCAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersistentAccount q(Na.b bVar) {
        String string = bVar.c().toString();
        AbstractC6492s.h(string, "toString(...)");
        return new PersistentAccount(string, bVar.b(), bVar.d(), bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Na.b r(PersistentAccount persistentAccount) {
        UUID uuidFromString = UUID.fromString(persistentAccount.getId());
        AbstractC6492s.h(uuidFromString, "fromString(...)");
        return new Na.b(uuidFromString, persistentAccount.getEmail(), persistentAccount.getUsername(), persistentAccount.getAvatar());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String s(UUID uuid) {
        return "acc-" + uuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.util.UUID r5, dh.InterfaceC5380e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Pa.a.d
            if (r0 == 0) goto L13
            r0 = r6
            Pa.a$d r0 = (Pa.a.d) r0
            int r1 = r0.f18515d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18515d = r1
            goto L18
        L13:
            Pa.a$d r0 = new Pa.a$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f18513b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f18515d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f18512a
            java.util.UUID r5 = (java.util.UUID) r5
            Yg.v.b(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            Yg.v.b(r6)
            r0.f18512a = r5
            r0.f18515d = r3
            java.lang.Object r6 = r4.f(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L4a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r6.next()
            r1 = r0
            Na.b r1 = (Na.b) r1
            java.util.UUID r1 = r1.c()
            boolean r1 = kotlin.jvm.internal.AbstractC6492s.d(r1, r5)
            if (r1 == 0) goto L4a
            goto L63
        L62:
            r0 = 0
        L63:
            Na.b r0 = (Na.b) r0
            if (r0 == 0) goto L68
            return r0
        L68:
            com.ui.sso.account.UIAccountManager$Error$NotFound r6 = new com.ui.sso.account.UIAccountManager$Error$NotFound
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Account '"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "' not found"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Pa.a.t(java.util.UUID, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String u(UUID uuid, String str) {
        return "auth-" + uuid + "-" + str;
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object b(Na.b bVar, InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(this.f18501c, new h(bVar, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object c(UUID uuid, InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(this.f18501c, new c(uuid, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Na.c d() {
        return this.f18502d;
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object e(InterfaceC5380e interfaceC5380e) {
        return kotlin.coroutines.jvm.internal.b.a(true);
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object f(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.f18501c, new e(null), interfaceC5380e);
    }

    @Override // com.ui.sso.account.UIAccountManager
    public void g(UIAccountManager.a aVar) {
        if (aVar != null) {
            this.f18500b.d(aVar);
        } else {
            UIAccountManager.a aVar2 = this.f18503e;
            if (aVar2 != null) {
                this.f18500b.c(aVar2);
            }
        }
        this.f18503e = aVar;
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object h(UUID uuid, String str, String str2, InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(this.f18501c, new i(uuid, str, str2, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object i(UUID uuid, String str, InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.f18501c, new f(uuid, str, null), interfaceC5380e);
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object j(UUID uuid, String str, InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(this.f18501c, new g(uuid, str, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }

    public /* synthetic */ a(SharedPreferences sharedPreferences, Oa.a aVar, J j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, (i10 & 2) != 0 ? Oa.a.f17689a.a() : aVar, j10);
    }
}
