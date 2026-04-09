package g8;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.os.Process;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.wifihacker.detector.mvp.view.activity.SplashActivity;
import com.wifihacker.detector.service.NotificationLiveService;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import h8.b;
import h8.c;
import h8.d;
import h8.e;
import h8.f;
import h8.g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xbill.DNS.KEYRecord;

/* loaded from: classes3.dex */
public abstract class s {

    public class a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21220a;

        public a(m8.a aVar) {
            this.f21220a = aVar;
        }

        @Override // h8.c.b
        public void onInterstitialDismissed() {
            h8.a.f().c();
            m8.a aVar = this.f21220a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class b implements e.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21221a;

        public b(m8.a aVar) {
            this.f21221a = aVar;
        }

        @Override // h8.e.b
        public void onInterstitialDismissed() {
            h8.a.f().c();
            m8.a aVar = this.f21221a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class c implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21222a;

        public c(m8.a aVar) {
            this.f21222a = aVar;
        }

        @Override // h8.d.b
        public void onInterstitialDismissed() {
            h8.a.f().c();
            m8.a aVar = this.f21222a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class d implements g.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21223a;

        public d(m8.a aVar) {
            this.f21223a = aVar;
        }

        @Override // h8.g.b
        public void onInterstitialDismissed() {
            h8.a.f().b();
            h8.a.f().c();
            m8.a aVar = this.f21223a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class e implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21224a;

        public e(m8.a aVar) {
            this.f21224a = aVar;
        }

        @Override // h8.f.b
        public void onInterstitialDismissed() {
            h8.a.f().b();
            h8.a.f().c();
            m8.a aVar = this.f21224a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class f implements b.InterfaceC0407b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21225a;

        public f(m8.a aVar) {
            this.f21225a = aVar;
        }

        @Override // h8.b.InterfaceC0407b
        public void onInterstitialDismissed() {
            h8.a.f().b();
            h8.a.f().c();
            m8.a aVar = this.f21225a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class g implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21226a;

        public g(m8.a aVar) {
            this.f21226a = aVar;
        }

        @Override // h8.d.b
        public void onInterstitialDismissed() {
            h8.a.f().b();
            h8.a.f().c();
            m8.a aVar = this.f21226a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class h implements g.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21227a;

        public h(m8.a aVar) {
            this.f21227a = aVar;
        }

        @Override // h8.g.b
        public void onInterstitialDismissed() {
            h8.a.f().b();
            h8.a.f().c();
            m8.a aVar = this.f21227a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class i implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21228a;

        public i(m8.a aVar) {
            this.f21228a = aVar;
        }

        @Override // h8.f.b
        public void onInterstitialDismissed() {
            h8.a.f().b();
            h8.a.f().c();
            m8.a aVar = this.f21228a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class j implements b.InterfaceC0407b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21229a;

        public j(m8.a aVar) {
            this.f21229a = aVar;
        }

        @Override // h8.b.InterfaceC0407b
        public void onInterstitialDismissed() {
            h8.a.f().b();
            h8.a.f().c();
            m8.a aVar = this.f21229a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class k implements g.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21230a;

        public k(m8.a aVar) {
            this.f21230a = aVar;
        }

        @Override // h8.g.b
        public void onInterstitialDismissed() {
            h8.a.f().c();
            m8.a aVar = this.f21230a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class l implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21231a;

        public l(m8.a aVar) {
            this.f21231a = aVar;
        }

        @Override // h8.c.b
        public void onInterstitialDismissed() {
            h8.a.f().b();
            h8.a.f().c();
            m8.a aVar = this.f21231a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class m implements e.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21232a;

        public m(m8.a aVar) {
            this.f21232a = aVar;
        }

        @Override // h8.e.b
        public void onInterstitialDismissed() {
            h8.a.f().b();
            h8.a.f().c();
            m8.a aVar = this.f21232a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class n implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21233a;

        public n(m8.a aVar) {
            this.f21233a = aVar;
        }

        @Override // h8.d.b
        public void onInterstitialDismissed() {
            h8.a.f().b();
            h8.a.f().c();
            m8.a aVar = this.f21233a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class o implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f21234a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f21235b;

        public o(Dialog dialog, Context context) {
            this.f21234a = dialog;
            this.f21235b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21234a.dismiss();
            s.v(this.f21235b, "com.router.passwords.wifirouterpasswords.routersetup");
        }
    }

    public class p implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21236a;

        public p(m8.a aVar) {
            this.f21236a = aVar;
        }

        @Override // h8.f.b
        public void onInterstitialDismissed() {
            h8.a.f().c();
            m8.a aVar = this.f21236a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class q implements b.InterfaceC0407b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21237a;

        public q(m8.a aVar) {
            this.f21237a = aVar;
        }

        @Override // h8.b.InterfaceC0407b
        public void onInterstitialDismissed() {
            h8.a.f().c();
            m8.a aVar = this.f21237a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class r implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21238a;

        public r(m8.a aVar) {
            this.f21238a = aVar;
        }

        @Override // h8.c.b
        public void onInterstitialDismissed() {
            h8.a.f().c();
            m8.a aVar = this.f21238a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    /* renamed from: g8.s$s, reason: collision with other inner class name */
    public class C0403s implements e.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21239a;

        public C0403s(m8.a aVar) {
            this.f21239a = aVar;
        }

        @Override // h8.e.b
        public void onInterstitialDismissed() {
            h8.a.f().c();
            m8.a aVar = this.f21239a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class t implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21240a;

        public t(m8.a aVar) {
            this.f21240a = aVar;
        }

        @Override // h8.d.b
        public void onInterstitialDismissed() {
            h8.a.f().c();
            m8.a aVar = this.f21240a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class u implements g.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21241a;

        public u(m8.a aVar) {
            this.f21241a = aVar;
        }

        @Override // h8.g.b
        public void onInterstitialDismissed() {
            h8.a.f().c();
            m8.a aVar = this.f21241a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class v implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21242a;

        public v(m8.a aVar) {
            this.f21242a = aVar;
        }

        @Override // h8.f.b
        public void onInterstitialDismissed() {
            h8.a.f().c();
            m8.a aVar = this.f21242a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public class w implements b.InterfaceC0407b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m8.a f21243a;

        public w(m8.a aVar) {
            this.f21243a = aVar;
        }

        @Override // h8.b.InterfaceC0407b
        public void onInterstitialDismissed() {
            h8.a.f().c();
            m8.a aVar = this.f21243a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    public static void a(Context context) {
        v(context, "com.wifianalyzer.networktools.wifitest");
    }

    public static void b(Activity activity, m8.a aVar) {
        if (h8.g.d().e()) {
            h8.g.d().h(activity, new k(aVar));
            return;
        }
        if (h8.f.d().e()) {
            h8.f.d().h(activity, new p(aVar));
            return;
        }
        if (h8.b.c().d()) {
            h8.b.c().g(activity, new q(aVar));
            return;
        }
        if (h8.c.d().e()) {
            h8.c.d().h(activity, new r(aVar));
            return;
        }
        if (h8.e.c().d()) {
            h8.e.c().g(activity, new C0403s(aVar));
            return;
        }
        if (h8.d.c().d()) {
            h8.d.c().g(activity, new t(aVar));
            return;
        }
        h8.a.f().i(1);
        if (aVar != null) {
            aVar.a(false);
        }
    }

    public static void c(Activity activity, m8.a aVar) {
        if (h8.g.d().e()) {
            h8.g.d().h(activity, new h(aVar));
            return;
        }
        if (h8.f.d().e()) {
            h8.f.d().h(activity, new i(aVar));
            return;
        }
        if (h8.b.c().d()) {
            h8.b.c().g(activity, new j(aVar));
            return;
        }
        if (h8.c.d().e()) {
            h8.c.d().h(activity, new l(aVar));
            return;
        }
        if (h8.e.c().d()) {
            h8.e.c().g(activity, new m(aVar));
        } else if (h8.d.c().d()) {
            h8.d.c().g(activity, new n(aVar));
        } else if (aVar != null) {
            aVar.a(false);
        }
    }

    public static void d(Activity activity, m8.a aVar) {
        if (h8.a.f().e() > 3) {
            if (aVar != null) {
                aVar.a(false);
                return;
            }
            return;
        }
        h8.a.f().b();
        if (h8.a.f().d() % 3 != 0) {
            if (aVar != null) {
                aVar.a(false);
                return;
            }
            return;
        }
        if (h8.g.d().e()) {
            h8.g.d().h(activity, new u(aVar));
            return;
        }
        if (h8.f.d().e()) {
            h8.f.d().h(activity, new v(aVar));
            return;
        }
        if (h8.b.c().d()) {
            h8.b.c().g(activity, new w(aVar));
            return;
        }
        if (h8.c.d().e()) {
            h8.c.d().h(activity, new a(aVar));
            return;
        }
        if (h8.e.c().d()) {
            h8.e.c().g(activity, new b(aVar));
            return;
        }
        if (h8.d.c().d()) {
            h8.d.c().g(activity, new c(aVar));
            return;
        }
        h8.a.f().i(1);
        if (aVar != null) {
            aVar.a(false);
        }
    }

    public static void e(Activity activity, m8.a aVar) {
        if (h8.g.d().e()) {
            h8.g.d().h(activity, new d(aVar));
            return;
        }
        if (h8.f.d().e()) {
            h8.f.d().h(activity, new e(aVar));
            return;
        }
        if (h8.b.c().d()) {
            h8.b.c().g(activity, new f(aVar));
        } else if (h8.d.c().d()) {
            h8.d.c().g(activity, new g(aVar));
        } else if (aVar != null) {
            aVar.a(false);
        }
    }

    public static String f(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return "No Contents";
        }
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[KEYRecord.Flags.FLAG4];
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C.UTF8_NAME));
            while (true) {
                int i10 = bufferedReader.read(cArr);
                if (i10 == -1) {
                    inputStream.close();
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i10);
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public static int g(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String h(WifiManager wifiManager) throws IOException {
        int wifiState = wifiManager.getWifiState();
        wifiManager.setWifiEnabled(true);
        FileInputStream fileInputStream = new FileInputStream(new File("/sys/class/net/wlan0/address"));
        String strF = f(fileInputStream);
        fileInputStream.close();
        wifiManager.setWifiEnabled(3 == wifiState);
        return strF;
    }

    public static String i() throws SocketException {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = list.get(i10);
                i10++;
                NetworkInterface networkInterface = (NetworkInterface) obj;
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b10 : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b10)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return null;
        } catch (Exception unused) {
            Log.e("MobileAcces", "Erreur lecture propriete Adresse MAC ");
            return null;
        }
    }

    public static String j(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null || !"02:00:00:00:00:00".equals(connectionInfo.getMacAddress())) {
            return (connectionInfo == null || connectionInfo.getMacAddress() == null) ? "" : connectionInfo.getMacAddress();
        }
        try {
            String strI = i();
            return strI != null ? strI : h(wifiManager);
        } catch (IOException unused) {
            Log.e("MobileAccess", "Erreur lecture propriete Adresse MAC");
            return "02:00:00:00:00:00";
        } catch (Exception unused2) {
            Log.e("MobileAcces", "Erreur lecture propriete Adresse MAC ");
            return "02:00:00:00:00:00";
        }
    }

    public static String k() throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new NetworkOnMainThreadException();
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://www.verfrisser.net/michel/ip.php").openConnection();
            if (httpURLConnection.getResponseCode() == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        inputStream.close();
                        return sb.toString().trim();
                    }
                    sb.append(line + "\n");
                }
            }
        } catch (MalformedURLException e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return "".trim();
    }

    public static void l(Context context, View view, boolean z10) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (z10) {
            inputMethodManager.showSoftInput(view, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean m(Context context, String str) {
        return context.getPackageManager().getLaunchIntentForPackage(str) != null;
    }

    public static boolean n(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        try {
            while (true) {
                boolean z10 = true;
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.processName.equals(context.getPackageName())) {
                        int i10 = runningAppProcessInfo.importance;
                        if (i10 != 400 && (i10 == 100 || i10 == 200)) {
                            z10 = false;
                        }
                    }
                }
                return z10;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean o() {
        return h8.c.d().e() || h8.d.c().d() || h8.e.c().d();
    }

    public static boolean p() {
        return h8.g.d().e() || h8.f.d().e() || h8.b.c().d() || h8.d.c().d();
    }

    public static String q(long j10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf((int) (j10 & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j10 >> 8) & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j10 >> 16) & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j10 >> 24) & 255)));
        return stringBuffer.toString();
    }

    public static void r(Context context) {
        Intent intent = new Intent(context, (Class<?>) SplashActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
        Process.killProcess(Process.myPid());
    }

    public static void s(Context context) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", context.getString(R.string.invite_friend_text));
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.menu_share)));
    }

    public static boolean t() {
        return System.currentTimeMillis() - 1769179211888L < 259200000;
    }

    public static void u(Context context, String str) {
        try {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
        } catch (Exception unused) {
            w(context, str);
        }
    }

    public static void v(Context context, String str) {
        if (m(context, str)) {
            u(context, str);
        } else {
            w(context, str);
        }
    }

    public static void w(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("market://details?id=" + str));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        } else {
            g8.l.d(R.string.google_play_not_found);
        }
    }

    public static void x(Context context) {
        try {
            if (g8.o.c().b(context, "switch_open_lock_screen", true)) {
                context.startService(new Intent(context, (Class<?>) NotificationLiveService.class));
            }
        } catch (Exception e10) {
            g8.k.b(Log.getStackTraceString(e10));
        }
    }

    public static void y(Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.dialog_router_password, (ViewGroup) null);
        b.a aVar = new b.a(context);
        aVar.q(viewInflate);
        androidx.appcompat.app.b bVarA = aVar.a();
        bVarA.show();
        viewInflate.setOnClickListener(new o(bVarA, context));
    }

    public static void z(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.net.ic_wifi.PICK_WIFI_NETWORK");
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent("android.settings.WIFI_SETTINGS");
        if (intent2.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent2);
        } else {
            g8.l.d(R.string.wifi_list_not_found);
        }
    }
}
