package ve;

import Yg.J;
import Yg.y;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.z;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import jh.AbstractC6329b;
import jh.AbstractC6331d;
import jh.AbstractC6339l;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import l9.C6556a;
import we.InterfaceC8332b;

/* renamed from: ve.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8216b implements InterfaceC8215a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f63559e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8332b f63560a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f63561b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f63562c;

    /* renamed from: d, reason: collision with root package name */
    private final ve.g f63563d;

    /* renamed from: ve.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: ve.b$b, reason: collision with other inner class name */
    public static final class C2256b implements C {
        public C2256b() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(C8216b.this.f63561b.getExternalCacheDir() + "/support");
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: ve.b$c */
    static final class c implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f63566b;

        /* renamed from: ve.b$c$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f63567a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C8216b f63568b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f63569c;

            a(String str, C8216b c8216b, String str2) {
                this.f63567a = str;
                this.f63568b = c8216b;
                this.f63569c = str2;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(y yVar) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
                AbstractC6492s.i(yVar, "<destruct>");
                Object objA = yVar.a();
                AbstractC6492s.h(objA, "component1(...)");
                Object objC = yVar.c();
                AbstractC6492s.h(objC, "component2(...)");
                Object objD = yVar.d();
                AbstractC6492s.h(objD, "component3(...)");
                String strJ = this.f63568b.j(this.f63568b.l(((String) objA) + "\n--SECTIONS---" + this.f63567a + "\n---LOGCAT---\n" + ((String) objC) + "\n---LOG---\n" + ((String) objD)));
                File file = new File(this.f63569c);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(this.f63569c, "support.supx");
                file2.delete();
                AbstractC6331d.c(file2, strJ, null, 2, null);
                return new C6556a(file2);
            }
        }

        c(String str) {
            this.f63566b = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(String logcatPath) {
            AbstractC6492s.i(logcatPath, "logcatPath");
            return Ag.e.f756a.b(C8216b.this.k(), C8216b.this.m(), C8216b.this.f63563d.b()).A(new a(this.f63566b, C8216b.this, logcatPath));
        }
    }

    /* renamed from: ve.b$d */
    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f63570a = new d();

        /* renamed from: ve.b$d$a */
        public static final class a implements C {
            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(new C6556a(null));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            z zVarI = z.i(new a());
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI;
        }
    }

    /* renamed from: ve.b$e */
    public static final class e implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(J.f24997a);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: ve.b$f */
    static final class f implements n {
        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(J it) {
            AbstractC6492s.i(it, "it");
            return "os.version: " + System.getProperty("os.version") + "\nVERSION.SDK_INT: " + Build.VERSION.SDK_INT + "\nDEVICE: " + Build.DEVICE + "\nMODEL: " + Build.MODEL + "\nPRODUCT: " + Build.PRODUCT + "\nPermissions: " + C8216b.this.i() + "\n";
        }
    }

    /* renamed from: ve.b$g */
    public static final class g implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                StringBuilder sb2 = new StringBuilder();
                Iterator it = AbstractC6339l.f(new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream()))).iterator();
                while (it.hasNext()) {
                    sb2.append((String) it.next());
                    sb2.append("\n");
                }
                String string = sb2.toString();
                AbstractC6492s.h(string, "toString(...)");
                interfaceC5910A.onSuccess(string);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public C8216b(InterfaceC8332b bytesFormatter, Context context, Context applicationContext, ve.g fileLog) {
        AbstractC6492s.i(bytesFormatter, "bytesFormatter");
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(fileLog, "fileLog");
        this.f63560a = bytesFormatter;
        this.f63561b = context;
        this.f63562c = applicationContext;
        this.f63563d = fileLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List i() throws PackageManager.NameNotFoundException {
        ArrayList arrayList = new ArrayList();
        PackageInfo packageInfo = this.f63562c.getPackageManager().getPackageInfo(this.f63562c.getPackageName(), 4096);
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr != null) {
            int length = strArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                int i12 = i11 + 1;
                int[] iArr = packageInfo.requestedPermissionsFlags;
                Integer numValueOf = iArr != null ? Integer.valueOf(iArr[i11]) : null;
                if (numValueOf == null || (numValueOf.intValue() & 2) != 0) {
                    AbstractC6492s.f(str);
                    arrayList.add(str);
                }
                i10++;
                i11 = i12;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(byte[] bArr) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(this.f63560a.b("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApXWKAiaRb0K1/0B98s4FTT2X2ogyWh7MnyAFIaw5eAViXPGQ63AqAgt3QweDr6AE8OIMwbV7fBg4a68ClMfCSMWdJiWJtTs3Z2CENdsgISSw3HDgrMcFoI6BKBO7u9DWW9BiwcetA1SC/bUc2hxSPmJd5VoJ8syxQquxV/adO/o7UGCPbgFjTGclJ+rHdsJgYGO9vSnD5VeuBlZQ54pOwse8HLj71xNkDvFWwk2GlEFxrfaeX7P5j3eEeyDFaQbpcOYw1tC909E8hjOnGLlnAi750P7VqUITVshGacdlJjyFq7cNkE9qc6bE04dCpqfH/jrPwlqOIOeKCbQx4RSZUQIDAQAB")));
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeyGenerateKey, new IvParameterSpec(secretKeyGenerateKey.getEncoded()));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        Cipher cipher2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher2.init(1, publicKeyGeneratePublic);
        byte[] bArrDoFinal2 = cipher2.doFinal(secretKeyGenerateKey.getEncoded());
        InterfaceC8332b interfaceC8332b = this.f63560a;
        AbstractC6492s.f(bArrDoFinal2);
        String strA = interfaceC8332b.a(bArrDoFinal2);
        InterfaceC8332b interfaceC8332b2 = this.f63560a;
        AbstractC6492s.f(bArrDoFinal);
        return strA + "\n" + interfaceC8332b2.a(bArrDoFinal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z k() {
        z zVarI = z.i(new e());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarA = zVarI.A(new f());
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] l(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(byteArrayOutputStream), C6510d.f52215b), 8192);
        try {
            bufferedWriter.write(str);
            J j10 = J.f24997a;
            AbstractC6329b.a(bufferedWriter, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC6492s.h(byteArray, "toByteArray(...)");
            return byteArray;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z m() {
        z zVarI = z.i(new g());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    @Override // ve.InterfaceC8215a
    public z a(String sectionInfo) {
        AbstractC6492s.i(sectionInfo, "sectionInfo");
        z zVarI = z.i(new C2256b());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarO = zVarI.s(new c(sectionInfo)).F(d.f63570a).O(Gg.a.d());
        AbstractC6492s.h(zVarO, "subscribeOn(...)");
        return zVarO;
    }
}
