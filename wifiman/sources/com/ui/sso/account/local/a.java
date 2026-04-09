package com.ui.sso.account.local;

import Ii.AbstractC3059i;
import Ii.J;
import Ii.N;
import Yg.v;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.security.crypto.a;
import androidx.security.crypto.b;
import com.ui.sso.account.local.UiAccountSharedPrefProvider;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class a implements UiAccountSharedPrefProvider {

    /* renamed from: b, reason: collision with root package name */
    public static final C1335a f41641b = new C1335a(null);

    /* renamed from: a, reason: collision with root package name */
    private final J f41642a;

    /* renamed from: com.ui.sso.account.local.a$a, reason: collision with other inner class name */
    public static final class C1335a {
        public /* synthetic */ C1335a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1335a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        long f41643a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41644b;

        /* renamed from: d, reason: collision with root package name */
        int f41646d;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41644b = obj;
            this.f41646d |= PduHandle.NONE;
            return a.this.b(null, null, this);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f41647a = new c();

        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UiAccount SharedPrefStorage cleanup started";
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41648a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f41649b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41650c;

        /* renamed from: com.ui.sso.account.local.a$d$a, reason: collision with other inner class name */
        static final class C1336a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f41651a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f41652b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1336a(boolean z10, File file) {
                super(0);
                this.f41651a = z10;
                this.f41652b = file;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UiAccount SharedPrefStorage file deleted: " + this.f41651a + "; path: " + this.f41652b.getAbsolutePath();
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ File f41653a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(File file) {
                super(0);
                this.f41653a = file;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UiAccount SharedPrefStorage file non-existent; path: " + this.f41653a.getAbsolutePath();
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f41654a = new c();

            c() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UiAccount SharedPrefStorage keystore alias clear failed";
            }
        }

        /* renamed from: com.ui.sso.account.local.a$d$d, reason: collision with other inner class name */
        static final class C1337d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1337d f41655a = new C1337d();

            C1337d() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UiAccount SharedPrefStorage cleanup failed while trying to reset local encrypted shared preferences";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f41649b = context;
            this.f41650c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(this.f41649b, this.f41650c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            AbstractC5467b.g();
            if (this.f41648a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                File file = new File(this.f41649b.getFilesDir().getParent() + "/shared_prefs/" + this.f41650c + ".xml");
                if (file.exists()) {
                    Ua.a.e(new C1336a(file.delete(), file));
                } else {
                    Ua.a.g(new b(file), null, 2, null);
                }
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    keyStore.deleteEntry("_com_ui_sso_local_storage_");
                } catch (KeyStoreException e10) {
                    Ua.a.f(c.f41654a, e10);
                }
            } catch (Exception e11) {
                Ua.a.c(C1337d.f41655a, e11);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f41656a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10) {
            super(0);
            this.f41656a = j10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UiAccount SharedPrefStorage cleanup finished in " + (System.currentTimeMillis() - this.f41656a) + " ms";
        }
    }

    static final class f extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41657a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f41659c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f41660d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, boolean z10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f41659c = context;
            this.f41660d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new f(this.f41659c, this.f41660d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UiAccountSharedPrefProvider.Error {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41657a;
            if (i10 == 0) {
                v.b(obj);
                try {
                    return a.this.c(a.this.d(this.f41659c), this.f41659c);
                } catch (UiAccountSharedPrefProvider.Error e10) {
                    if (!this.f41660d) {
                        throw e10;
                    }
                    a aVar = a.this;
                    Context context = this.f41659c;
                    this.f41657a = 1;
                    if (aVar.b(context, "ui_sso_local_storage", this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return a.this.c(a.this.d(this.f41659c), this.f41659c);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public a(J dispatcherIO) {
        AbstractC6492s.i(dispatcherIO, "dispatcherIO");
        this.f41642a = dispatcherIO;
    }

    @Override // com.ui.sso.account.local.UiAccountSharedPrefProvider
    public Object a(Context context, boolean z10, InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.f41642a, new f(context, z10, null), interfaceC5380e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r8, java.lang.String r9, dh.InterfaceC5380e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.ui.sso.account.local.a.b
            if (r0 == 0) goto L13
            r0 = r10
            com.ui.sso.account.local.a$b r0 = (com.ui.sso.account.local.a.b) r0
            int r1 = r0.f41646d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41646d = r1
            goto L18
        L13:
            com.ui.sso.account.local.a$b r0 = new com.ui.sso.account.local.a$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f41644b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41646d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2b
            long r8 = r0.f41643a
            Yg.v.b(r10)
            goto L54
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            Yg.v.b(r10)
            long r4 = java.lang.System.currentTimeMillis()
            com.ui.sso.account.local.a$c r10 = com.ui.sso.account.local.a.c.f41647a
            Ua.a.e(r10)
            Ii.J r10 = r7.f41642a
            com.ui.sso.account.local.a$d r2 = new com.ui.sso.account.local.a$d
            r6 = 0
            r2.<init>(r8, r9, r6)
            r0.f41643a = r4
            r0.f41646d = r3
            java.lang.Object r8 = Ii.AbstractC3059i.g(r10, r2, r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            r8 = r4
        L54:
            com.ui.sso.account.local.a$e r10 = new com.ui.sso.account.local.a$e
            r10.<init>(r8)
            Ua.a.e(r10)
            Yg.J r8 = Yg.J.f24997a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.account.local.a.b(android.content.Context, java.lang.String, dh.e):java.lang.Object");
    }

    public final SharedPreferences c(androidx.security.crypto.b masterKey, Context context) throws UiAccountSharedPrefProvider.Error {
        AbstractC6492s.i(masterKey, "masterKey");
        AbstractC6492s.i(context, "context");
        try {
            SharedPreferences sharedPreferencesA = androidx.security.crypto.a.a(context, "ui_sso_local_storage", masterKey, a.d.AES256_SIV, a.e.AES256_GCM);
            AbstractC6492s.f(sharedPreferencesA);
            return sharedPreferencesA;
        } catch (IOException e10) {
            throw new UiAccountSharedPrefProvider.Error("fileName can not be used", e10);
        } catch (GeneralSecurityException e11) {
            throw new UiAccountSharedPrefProvider.Error("a bad master key or key set has been attempted", e11);
        }
    }

    public final androidx.security.crypto.b d(Context context) throws UiAccountSharedPrefProvider.Error {
        AbstractC6492s.i(context, "context");
        try {
            b.C1126b c1126bB = new b.C1126b(context, "_com_ui_sso_local_storage_").b(b.c.AES256_GCM);
            AbstractC6492s.h(c1126bB, "setKeyScheme(...)");
            if (Build.VERSION.SDK_INT >= 28) {
                c1126bB.c(true);
            }
            androidx.security.crypto.b bVarA = c1126bB.a();
            AbstractC6492s.f(bVarA);
            return bVarA;
        } catch (IOException e10) {
            throw new UiAccountSharedPrefProvider.Error("KeyStore master key build failed", e10);
        } catch (GeneralSecurityException e11) {
            throw new UiAccountSharedPrefProvider.Error("KeyStore master key build failed", e11);
        }
    }
}
