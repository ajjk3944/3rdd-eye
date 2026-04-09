package com.ui.wifiman.support;

import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.ui.wifiman.support.UiSupport;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public final class UiSupport {

    /* renamed from: a, reason: collision with root package name */
    public static final a f44296a = new a(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/ui/wifiman/support/UiSupport$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "SupportTextGenException", "Lcom/ui/wifiman/support/UiSupport$Error$SupportTextGenException;", "app-support_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends Exception {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/support/UiSupport$Error$SupportTextGenException;", "Lcom/ui/wifiman/support/UiSupport$Error;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "app-support_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SupportTextGenException extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportTextGenException(Throwable cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
                this.message = "Support text generation failed with cause: " + getCause().getMessage();
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f44299a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f44300b;

        public b(String name, Map values) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(values, "values");
            this.f44299a = name;
            this.f44300b = values;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Map.Entry entry) {
            AbstractC6492s.i(entry, "<destruct>");
            return ((String) entry.getKey()) + " : " + ((String) entry.getValue());
        }

        public final String b() {
            return this.f44299a;
        }

        public String toString() {
            return this.f44299a + "\n\n" + AbstractC3689v.z0(this.f44300b.entrySet(), "\n", null, null, 0, null, new InterfaceC6835l() { // from class: ue.a
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return UiSupport.b.c((Map.Entry) obj);
                }
            }, 30, null);
        }
    }

    private final b a(Context context) {
        Map mapE;
        String string;
        CharSequence charSequenceLoadLabel;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (charSequenceLoadLabel = applicationInfo.loadLabel(context.getPackageManager())) == null || (string = charSequenceLoadLabel.toString()) == null) {
                string = "ERROR";
            }
            s sVarA = z.a("name", string);
            s sVarA2 = z.a("package", packageInfo.packageName);
            String str = packageInfo.versionName;
            if (str == null) {
                str = "";
            }
            mapE = U.k(sVarA, sVarA2, z.a("version", str), z.a("versionCode", Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode)), z.a("first install time", String.valueOf(packageInfo.firstInstallTime)), z.a("last update time", String.valueOf(packageInfo.lastUpdateTime)));
        } catch (Throwable th2) {
            String message = th2.getMessage();
            mapE = U.e(z.a("ERROR", message != null ? message : ""));
        }
        return new b("APP", mapE);
    }

    private final StringBuilder b(StringBuilder sb2, b bVar) {
        sb2.append("\n=================\n");
        sb2.append(bVar);
        return sb2;
    }

    private final b c() {
        return new b("DEVICE", U.k(z.a("manufacturer", Build.MANUFACTURER), z.a("model", Build.MODEL), z.a("brand", Build.BRAND), z.a("device", Build.DEVICE), z.a("display", Build.DISPLAY), z.a("fingerprint", Build.FINGERPRINT), z.a("product", Build.PRODUCT), z.a("version", String.valueOf(Build.VERSION.SDK_INT))));
    }

    private final b d(String str) {
        return new b("SUPPORT FILE", U.k(z.a("timestamp", String.valueOf(new Date())), z.a("userId", String.valueOf(str))));
    }

    private final b f(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                int length = strArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    String str = strArr[i10];
                    int i12 = i11 + 1;
                    int[] iArr = packageInfo.requestedPermissionsFlags;
                    linkedHashMap.put(str, (iArr != null ? iArr[i11] & 2 : 0) > 0 ? "GRANTED" : "REQUESTED");
                    i10++;
                    i11 = i12;
                }
            }
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            linkedHashMap.put("ERROR", message);
        }
        return new b("PERMISSIONS", linkedHashMap);
    }

    public final String e(Context context, String str, List list) throws Error.SupportTextGenException {
        AbstractC6492s.i(context, "context");
        try {
            StringBuilder sbB = b(b(b(new StringBuilder(d(str).toString()), a(context)), f(context)), c());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    b(sbB, (b) it.next());
                }
            }
            String string = sbB.toString();
            AbstractC6492s.h(string, "toString(...)");
            return string;
        } catch (Exception e10) {
            throw new Error.SupportTextGenException(e10);
        }
    }
}
