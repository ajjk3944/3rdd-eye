package i8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: h, reason: collision with root package name */
    public static b f21635h;

    /* renamed from: a, reason: collision with root package name */
    public String f21636a;

    /* renamed from: d, reason: collision with root package name */
    public String f21639d;

    /* renamed from: e, reason: collision with root package name */
    public String f21640e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f21637b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public i8.a f21638c = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21641f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21642g = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(255);
            int i10 = 0;
            while (i10 < 255) {
                if (b.this.f21642g) {
                    b.this.f21641f = false;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(b.this.f21636a);
                i10++;
                sb.append(i10);
                RunnableC0416b runnableC0416b = b.this.new RunnableC0416b(sb.toString(), 3000);
                runnableC0416b.a(b.this.f21637b);
                if (b.this.f21642g) {
                    b.this.f21641f = false;
                    return;
                } else {
                    if (b.this.f21642g) {
                        b.this.f21641f = false;
                        return;
                    }
                    executorServiceNewFixedThreadPool.execute(runnableC0416b);
                }
            }
            try {
                if (!executorServiceNewFixedThreadPool.awaitTermination(20L, TimeUnit.SECONDS)) {
                    executorServiceNewFixedThreadPool.shutdown();
                }
                if (b.this.f21642g) {
                    b.this.f21641f = false;
                    return;
                }
            } catch (Exception e10) {
                executorServiceNewFixedThreadPool.shutdown();
                e10.printStackTrace();
                if (b.this.f21642g) {
                    b.this.f21641f = false;
                    return;
                } else if (b.this.f21638c != null) {
                    b.this.f21638c.c();
                }
            }
            if (b.this.f21638c != null) {
                b.this.f21638c.b(b.this.f21637b);
            }
            b.this.f21638c = null;
            b.this.f21641f = false;
        }
    }

    /* renamed from: i8.b$b, reason: collision with other inner class name */
    public class RunnableC0416b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final String f21644a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21645b;

        /* renamed from: c, reason: collision with root package name */
        public HashMap f21646c;

        public RunnableC0416b(String str, int i10) {
            this.f21644a = str;
            this.f21645b = i10;
        }

        public void a(HashMap map) {
            this.f21646c = map;
        }

        @Override // java.lang.Runnable
        public void run() throws UnknownHostException {
            try {
                InetAddress byName = InetAddress.getByName(this.f21644a);
                if (!byName.isReachable(this.f21645b) || this.f21646c == null) {
                    return;
                }
                String hostName = TextUtils.equals(this.f21644a, b.this.f21639d) ? Build.MODEL : byName.getHostName();
                this.f21646c.put(this.f21644a, hostName);
                if (b.this.f21638c != null) {
                    b.this.f21638c.a(this.f21644a, hostName);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static b k() {
        if (f21635h == null) {
            f21635h = new b();
        }
        return f21635h;
    }

    public String h() {
        return this.f21639d;
    }

    public String i() {
        return this.f21640e;
    }

    public final void j(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.f21640e = n(wifiManager.getDhcpInfo().gateway);
        this.f21639d = n(wifiManager.getConnectionInfo().getIpAddress());
        String strN = n(wifiManager.getDhcpInfo().ipAddress);
        if (strN != null) {
            this.f21636a = strN.substring(0, strN.lastIndexOf(".") + 1);
        }
    }

    public boolean l() {
        return this.f21641f;
    }

    public final boolean m(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).isConnected();
    }

    public final String n(long j10) {
        try {
            byte[] byteArray = BigInteger.valueOf(j10).toByteArray();
            o(byteArray, 0, byteArray.length);
            return InetAddress.getByAddress(byteArray).getHostAddress();
        } catch (UnknownHostException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final void o(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return;
        }
        int iMin = Math.min(bArr.length, i11) - 1;
        for (int iMax = Math.max(i10, 0); iMin > iMax; iMax++) {
            byte b10 = bArr[iMin];
            bArr[iMin] = bArr[iMax];
            bArr[iMax] = b10;
            iMin--;
        }
    }

    public void p(Context context, i8.a aVar) {
        this.f21642g = false;
        this.f21638c = aVar;
        if (this.f21641f || !m(context)) {
            i8.a aVar2 = this.f21638c;
            if (aVar2 != null) {
                aVar2.c();
                return;
            }
            return;
        }
        this.f21641f = true;
        this.f21637b.clear();
        j(context);
        new Thread(new a()).start();
    }

    public void q(boolean z10) {
        this.f21642g = z10;
        if (z10) {
            this.f21641f = false;
        }
    }
}
