package com.ui.wifiman.model.android.secure;

import Yg.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.security.crypto.a;
import androidx.security.crypto.b;
import com.ui.wifiman.model.android.secure.AndroidPassphraseManager;
import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class a implements AndroidPassphraseManager {

    /* renamed from: d, reason: collision with root package name */
    public static final C1380a f42420d = new C1380a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f42421a;

    /* renamed from: b, reason: collision with root package name */
    private final m f42422b;

    /* renamed from: c, reason: collision with root package name */
    private final z f42423c;

    /* renamed from: com.ui.wifiman.model.android.secure.a$a, reason: collision with other inner class name */
    public static final class C1380a {
        public /* synthetic */ C1380a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1380a() {
        }
    }

    public static final class b implements InterfaceC5915e {
        public b() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                a.this.g(O7.d.PASSCODES.getId());
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class c implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AndroidPassphraseManager.a f42426b;

        /* renamed from: com.ui.wifiman.model.android.secure.a$c$a, reason: collision with other inner class name */
        public static final class C1381a implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f42427a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SharedPreferences f42428b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AndroidPassphraseManager.a f42429c;

            public C1381a(a aVar, SharedPreferences sharedPreferences, AndroidPassphraseManager.a aVar2) {
                this.f42427a = aVar;
                this.f42428b = sharedPreferences;
                this.f42429c = aVar2;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                String string;
                try {
                    synchronized (this.f42427a) {
                        try {
                            string = this.f42428b.getString(this.f42429c.getAlias(), null);
                            if (string == null) {
                                if (!this.f42428b.edit().putString(this.f42429c.getAlias(), (String) this.f42429c.getGenerator().invoke()).commit()) {
                                    throw new AndroidPassphraseManager.Error.StorageError("failed to store required passphrase " + this.f42429c.getAlias(), null, 2, null);
                                }
                                string = this.f42428b.getString(this.f42429c.getAlias(), null);
                                if (string == null) {
                                    throw new AndroidPassphraseManager.Error.StorageError("failed to obtain required passphrase " + this.f42429c.getAlias(), null, 2, null);
                                }
                            }
                        } finally {
                        }
                    }
                    interfaceC5910A.onSuccess(string);
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        c(AndroidPassphraseManager.a aVar) {
            this.f42426b = aVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(SharedPreferences pref) {
            AbstractC6492s.i(pref, "pref");
            z zVarI = z.i(new C1381a(a.this, pref, this.f42426b));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI;
        }
    }

    public static final class d implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42431b;

        public d(String str) {
            this.f42431b = str;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                try {
                    a aVar = a.this;
                    interfaceC5910A.onSuccess(aVar.f(aVar.f42421a, this.f42431b));
                } catch (Throwable th2) {
                    throw new AndroidPassphraseManager.Error.StorageError("AndroidKeystorePassphraseManager failed to open secure storage. Keystore probably corrupted", th2);
                }
            } catch (Throwable th3) {
                interfaceC5910A.onError(th3);
            }
        }
    }

    public a(Context applicationContext, String sharedPrefFilename) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(sharedPrefFilename, "sharedPrefFilename");
        this.f42421a = applicationContext;
        this.f42422b = Yg.n.b(new InterfaceC6824a() { // from class: sc.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return com.ui.wifiman.model.android.secure.a.i(this.f61438a);
            }
        });
        z zVarI = z.i(new d(sharedPrefFilename));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        this.f42423c = zVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences f(Context context, String str) {
        SharedPreferences sharedPreferencesA = androidx.security.crypto.a.a(context, str, h(), a.d.AES256_SIV, a.e.AES256_GCM);
        AbstractC6492s.h(sharedPreferencesA, "create(...)");
        return sharedPreferencesA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            File file = new File(this.f42421a.getFilesDir().getParent() + "/shared_prefs/" + str + ".xml");
            if (file.exists()) {
                Z7.b.h("Android keystore passphrase manager storage deleted: " + file.delete() + "; path: " + file.getAbsolutePath(), null, 2, null);
            } else {
                Z7.b.j("Android keystore passphrase manager storage file non-existent; path: " + file.getAbsolutePath(), null, null, 6, null);
            }
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry("_androidx_security_master_key_");
        } catch (Exception e10) {
            Z7.b.e("Error while Android keystore passphrase manager trying to reset storage", e10, null, 4, null);
        }
    }

    private final androidx.security.crypto.b h() {
        return (androidx.security.crypto.b) this.f42422b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.security.crypto.b i(a aVar) {
        b.C1126b c1126bB = new b.C1126b(aVar.f42421a).b(b.c.AES256_GCM);
        AbstractC6492s.h(c1126bB, "setKeyScheme(...)");
        if (Build.VERSION.SDK_INT >= 28) {
            c1126bB.c(true);
        }
        return c1126bB.a();
    }

    @Override // com.ui.wifiman.model.android.secure.AndroidPassphraseManager
    public z a(AndroidPassphraseManager.a passphrase) {
        AbstractC6492s.i(passphrase, "passphrase");
        z zVarO = this.f42423c.s(new c(passphrase)).E(Gg.a.a()).O(Gg.a.d());
        AbstractC6492s.h(zVarO, "subscribeOn(...)");
        return zVarO;
    }

    @Override // com.ui.wifiman.model.android.secure.AndroidPassphraseManager
    public AbstractC5912b clear() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bW = abstractC5912bR.W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }
}
