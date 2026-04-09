package Oa;

import Yg.m;
import Yg.n;
import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ui.sso.auth.a;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class c extends AbstractAccountAuthenticator {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17695a;

    /* renamed from: b, reason: collision with root package name */
    private final m f17696b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACCOUNT_NOT_EXIST = new a("ACCOUNT_NOT_EXIST", 0, -1);

        /* renamed from: id, reason: collision with root package name */
        private final int f17697id;

        private static final /* synthetic */ a[] $values() {
            return new a[]{ACCOUNT_NOT_EXIST};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, int i11) {
            this.f17697id = i11;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int getId() {
            return this.f17697id;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17698a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAuthenticator - called accountExist()";
        }
    }

    /* renamed from: Oa.c$c, reason: collision with other inner class name */
    static final class C0612c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0612c f17699a = new C0612c();

        C0612c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAuthenticator - called addAccount()";
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {
        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountManager invoke() {
            return AccountManager.get(c.this.c());
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f17701a = new e();

        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAuthenticator - called confirmCredentials()";
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f17702a = new f();

        f() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAuthenticator - called editProperties()";
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f17703a = new g();

        g() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAuthenticator - called getAuthToken()";
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f17704a = new h();

        h() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAuthenticator - called getAuthTokenLabel()";
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f17705a = new i();

        i() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAuthenticator - called hasFeatures()";
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f17706a = new j();

        j() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UIAccountAuthenticator - called updateCredentials()";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        AbstractC6492s.i(context, "context");
        this.f17695a = context;
        this.f17696b = n.b(new d());
    }

    private final boolean a(Account account) {
        Ua.a.e(b.f17698a);
        Account[] accountsByType = AccountManager.get(this.f17695a).getAccountsByType(account.type);
        AbstractC6492s.h(accountsByType, "getAccountsByType(...)");
        for (Account account2 : accountsByType) {
            if (AbstractC6492s.d(account2, account)) {
                return true;
            }
        }
        return false;
    }

    private final AccountManager b() {
        Object value = this.f17696b.getValue();
        AbstractC6492s.h(value, "getValue(...)");
        return (AccountManager) value;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Ua.a.e(C0612c.f17699a);
        Bundle bundle2 = new Bundle();
        Intent intent = (Intent) Ma.a.f13069a.c().s(this.f17695a, null, null);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    public final Context c() {
        return this.f17695a;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        Ua.a.e(e.f17701a);
        Bundle EMPTY = Bundle.EMPTY;
        AbstractC6492s.h(EMPTY, "EMPTY");
        return EMPTY;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        Ua.a.e(f.f17702a);
        Bundle EMPTY = Bundle.EMPTY;
        AbstractC6492s.h(EMPTY, "EMPTY");
        return EMPTY;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Ua.a.e(g.f17703a);
        Bundle bundle2 = new Bundle();
        if (account == null || !a(account)) {
            bundle2.putString("errorCode", String.valueOf(a.ACCOUNT_NOT_EXIST.getId()));
            bundle2.putString("errorMessage", "Account doesn't exist");
        } else {
            String strPeekAuthToken = b().peekAuthToken(account, str);
            if (strPeekAuthToken != null) {
                bundle2.putString("authAccount", account.name);
                bundle2.putString("accountType", account.type);
                bundle2.putString("authtoken", strPeekAuthToken);
            } else {
                Intent intent = (Intent) Ma.a.f13069a.c().s(this.f17695a, account.name, null);
                intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
                bundle2.putParcelable("intent", intent);
            }
        }
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public String getAuthTokenLabel(String str) {
        Ua.a.e(h.f17704a);
        if (AbstractC6492s.d(str, a.EnumC1372a.UBIC.getId())) {
            String string = this.f17695a.getString(Na.a.f16326a);
            AbstractC6492s.h(string, "getString(...)");
            return string;
        }
        String string2 = this.f17695a.getString(Na.a.f16327b);
        AbstractC6492s.h(string2, "getString(...)");
        return string2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        Ua.a.e(i.f17705a);
        Bundle EMPTY = Bundle.EMPTY;
        AbstractC6492s.h(EMPTY, "EMPTY");
        return EMPTY;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Ua.a.e(j.f17706a);
        Bundle EMPTY = Bundle.EMPTY;
        AbstractC6492s.h(EMPTY, "EMPTY");
        return EMPTY;
    }
}
