package a8;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import b8.f;
import com.wifi.netdiscovery.data.HostInfo;
import com.wifi.netdiscovery.utils.DeviceTypeUtil;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.SimpleResolver;

/* loaded from: classes3.dex */
public class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public List f181a;

    /* renamed from: b, reason: collision with root package name */
    public z7.a f182b;

    /* renamed from: c, reason: collision with root package name */
    public Context f183c;

    /* renamed from: e, reason: collision with root package name */
    public y7.a f185e;

    /* renamed from: d, reason: collision with root package name */
    public Map f184d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public ExecutorService f186f = Executors.newCachedThreadPool();

    /* renamed from: g, reason: collision with root package name */
    public int f187g = 0;

    /* renamed from: h, reason: collision with root package name */
    public b8.d f188h = new b8.d();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f189a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f190b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String[] f191c;

        public a(int i10, int i11, String[] strArr) {
            this.f189a = i10;
            this.f190b = i11;
            this.f191c = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = this.f189a; i10 < this.f190b; i10++) {
                b.this.e(this.f191c[i10]);
            }
            b.this.f(4);
        }
    }

    /* renamed from: a8.b$b, reason: collision with other inner class name */
    public class RunnableC0003b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f193a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f194b;

        public RunnableC0003b(String str, int i10) {
            this.f193a = str;
            this.f194b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.e(this.f193a);
            b.this.f(this.f194b);
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f198a;

        public d(List list) {
            this.f198a = list;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException, IOException {
            try {
                DatagramChannel datagramChannelOpen = DatagramChannel.open();
                datagramChannelOpen.configureBlocking(false);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                for (String str : this.f198a) {
                    try {
                        byteBufferAllocate.clear();
                        datagramChannelOpen.send(byteBufferAllocate, new InetSocketAddress(InetAddress.getByName(str), 137));
                        Thread.sleep(10L);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e10) {
                b8.c.a("DiscoveryTask executeSubQuery exception", e10);
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HostInfo f200a;

        public e(HostInfo hostInfo) {
            this.f200a = hostInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.f188h.c(this.f200a.ipAddress);
                if (b.this.f188h.b() == 0) {
                    this.f200a.os = b.this.f188h.a();
                    if (this.f200a == null || b.this.f182b == null) {
                        return;
                    }
                    b.this.f182b.a(this.f200a);
                }
            } catch (Exception e10) {
                b8.c.a("DiscoveryTask executePingTest exception", e10);
            }
        }
    }

    public final void e(String str) {
        HostInfo hostInfo = new HostInfo();
        hostInfo.ipAddress = str;
        try {
            String str2 = (String) this.f184d.get(str);
            hostInfo.hardwareAddress = str2;
            if (str2 == null || "00:00:00:00:00:00".equals(str2)) {
                return;
            }
            n(hostInfo);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void f(int i10) {
        int i11;
        synchronized (this) {
            i11 = this.f187g + 1;
            this.f187g = i11;
        }
        if (i11 == i10) {
            this.f187g = 0;
            z7.a aVar = this.f182b;
            if (aVar != null) {
                aVar.onFinish();
                this.f182b = null;
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Void... voidArr) throws Throwable {
        if (this.f181a == null) {
            return null;
        }
        q(this.f183c);
        f.m(this.f183c, this.f184d);
        if (this.f185e == null) {
            this.f185e = new y7.a(this.f183c);
        }
        this.f184d.put(this.f185e.f25165j, f.h());
        this.f182b.b(this.f184d.size());
        int size = this.f184d.size();
        String[] strArr = new String[size];
        this.f184d.keySet().toArray(strArr);
        int i10 = 0;
        if (size < 4) {
            while (i10 < size) {
                h(strArr[i10], size);
                i10++;
            }
            return null;
        }
        while (i10 < 4) {
            int i11 = (size * i10) / 4;
            i10++;
            i(strArr, i11, (size * i10) / 4);
        }
        return null;
    }

    public final void h(String str, int i10) {
        w7.a.b().a().execute(new RunnableC0003b(str, i10));
    }

    public final void i(String[] strArr, int i10, int i11) {
        w7.a.b().a().execute(new a(i10, i11, strArr));
    }

    public final void j(HostInfo hostInfo) {
        w7.a.b().a().execute(new e(hostInfo));
    }

    public final void k(HostInfo hostInfo) {
        hostInfo.vendor = b8.a.c(this.f183c, null, hostInfo.hardwareAddress);
    }

    public final void l(List list) {
        w7.a.b().a().execute(new d(list));
    }

    @Override // android.os.AsyncTask
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(HostInfo... hostInfoArr) {
        super.onProgressUpdate(hostInfoArr);
    }

    public final void n(HostInfo hostInfo) {
        if (this.f185e == null) {
            this.f185e = new y7.a(this.f183c);
        }
        try {
            String canonicalHostName = InetAddress.getByName(hostInfo.ipAddress).getCanonicalHostName();
            hostInfo.hostName = canonicalHostName;
            if (TextUtils.equals(canonicalHostName, hostInfo.ipAddress) || "localhost".equals(hostInfo.hostName)) {
                try {
                    hostInfo.hostName = o(hostInfo.ipAddress, this.f185e.f25164i);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            String strB = b8.a.b(this.f183c, null, hostInfo.hardwareAddress);
            hostInfo.vendor = strB;
            if ("Unknow".equals(strB)) {
                k(hostInfo);
            }
            if (TextUtils.equals(hostInfo.ipAddress, this.f185e.f25164i)) {
                hostInfo.isGateWay = true;
                hostInfo.hostName = "Router";
            }
            if (TextUtils.equals(hostInfo.ipAddress, this.f185e.f25165j)) {
                hostInfo.isMine = true;
                hostInfo.hostName = "Android";
                hostInfo.vendor = Build.BRAND;
            }
            if (!hostInfo.isGateWay && DeviceTypeUtil.DeviceType.Unknown.equals(DeviceTypeUtil.e(hostInfo.hostName))) {
                j(hostInfo);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        synchronized (this) {
            if (hostInfo != null) {
                try {
                    z7.a aVar = this.f182b;
                    if (aVar != null) {
                        aVar.c(hostInfo);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String o(String str, String str2) {
        try {
            Lookup lookup = new Lookup(b8.b.a(str) + ".in-addr.arpa.", 12);
            lookup.setResolver(new SimpleResolver(str2));
            lookup.run();
            return lookup.getResult() == 0 ? lookup.getAnswers()[0].rdataToString() : "localhost";
        } catch (Throwable th) {
            th.printStackTrace();
            return "localhost";
        }
    }

    public final void p(Context context) {
        try {
            WifiManager.MulticastLock multicastLockCreateMulticastLock = ((WifiManager) context.getSystemService("wifi")).createMulticastLock(getClass().getSimpleName());
            multicastLockCreateMulticastLock.setReferenceCounted(true);
            multicastLockCreateMulticastLock.acquire();
            JmDNS jmDNSCreate = JmDNS.create();
            jmDNSCreate.registerServiceType("_services._dns-sd._udp.local.");
            jmDNSCreate.addServiceListener("_services._dns-sd._udp.local.", new c(jmDNSCreate));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void q(Context context) {
        r(this.f181a);
        p(context);
    }

    public final void r(List list) {
        if (list != null) {
            int i10 = 0;
            while (i10 < 4) {
                try {
                    int size = (list.size() * i10) / 4;
                    i10++;
                    l(list.subList(size, (list.size() * i10) / 4));
                } catch (Exception e10) {
                    b8.c.a("DiscoveryTask sendQueryInfo exception", e10);
                    return;
                }
            }
        }
    }

    public void s(Context context, List list, z7.a aVar) {
        if (list == null || list.size() == 0 || aVar == null) {
            return;
        }
        this.f183c = context;
        this.f181a = Collections.synchronizedList(list);
        this.f182b = aVar;
        executeOnExecutor(w7.a.b().a(), new Void[0]);
    }

    public class c implements ServiceListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JmDNS f196a;

        public c(JmDNS jmDNS) {
            this.f196a = jmDNS;
        }

        @Override // javax.jmdns.ServiceListener
        public void serviceAdded(ServiceEvent serviceEvent) {
            this.f196a.requestServiceInfo(serviceEvent.getType(), serviceEvent.getName(), 1L);
        }

        @Override // javax.jmdns.ServiceListener
        public void serviceRemoved(ServiceEvent serviceEvent) {
        }

        @Override // javax.jmdns.ServiceListener
        public void serviceResolved(ServiceEvent serviceEvent) {
        }
    }
}
