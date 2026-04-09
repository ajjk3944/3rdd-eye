package Sg;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.StringTokenizer;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;

/* loaded from: classes4.dex */
class e implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private static final int f20619o = Rg.a.d("jcifs.smb1.netbios.snd_buf_size", 576);

    /* renamed from: p, reason: collision with root package name */
    private static final int f20620p = Rg.a.d("jcifs.smb1.netbios.rcv_buf_size", 576);

    /* renamed from: q, reason: collision with root package name */
    private static final int f20621q = Rg.a.d("jcifs.smb1.netbios.soTimeout", DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT);

    /* renamed from: r, reason: collision with root package name */
    private static final int f20622r = Rg.a.d("jcifs.smb1.netbios.retryCount", 2);

    /* renamed from: s, reason: collision with root package name */
    private static final int f20623s = Rg.a.d("jcifs.smb1.netbios.retryTimeout", 3000);

    /* renamed from: t, reason: collision with root package name */
    private static final int f20624t = Rg.a.d("jcifs.smb1.netbios.lport", 0);

    /* renamed from: u, reason: collision with root package name */
    private static final InetAddress f20625u = Rg.a.b("jcifs.smb1.netbios.laddr", null);

    /* renamed from: v, reason: collision with root package name */
    private static final String f20626v = Rg.a.g("jcifs.smb1.resolveOrder");

    /* renamed from: w, reason: collision with root package name */
    private static Ug.e f20627w = Ug.e.a();

    /* renamed from: a, reason: collision with root package name */
    private final Object f20628a;

    /* renamed from: b, reason: collision with root package name */
    private int f20629b;

    /* renamed from: c, reason: collision with root package name */
    private int f20630c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f20631d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f20632e;

    /* renamed from: f, reason: collision with root package name */
    private DatagramSocket f20633f;

    /* renamed from: g, reason: collision with root package name */
    private DatagramPacket f20634g;

    /* renamed from: h, reason: collision with root package name */
    private DatagramPacket f20635h;

    /* renamed from: i, reason: collision with root package name */
    private HashMap f20636i;

    /* renamed from: j, reason: collision with root package name */
    private Thread f20637j;

    /* renamed from: k, reason: collision with root package name */
    private int f20638k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f20639l;

    /* renamed from: m, reason: collision with root package name */
    InetAddress f20640m;

    /* renamed from: n, reason: collision with root package name */
    InetAddress f20641n;

    e() {
        this(f20624t, f20625u);
    }

    void a(int i10) {
        this.f20630c = 0;
        int i11 = f20621q;
        if (i11 != 0) {
            this.f20630c = Math.max(i11, i10);
        }
        if (this.f20633f == null) {
            this.f20633f = new DatagramSocket(this.f20629b, this.f20640m);
            Thread thread = new Thread(this, "JCIFS-NameServiceClient");
            this.f20637j = thread;
            thread.setDaemon(true);
            this.f20637j.start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00da, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    Sg.g b(Sg.b r8, java.net.InetAddress r9) throws java.net.UnknownHostException {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Sg.e.b(Sg.b, java.net.InetAddress):Sg.g");
    }

    int c() {
        int i10 = this.f20638k + 1;
        this.f20638k = i10;
        if ((i10 & 65535) == 0) {
            this.f20638k = 1;
        }
        return this.f20638k;
    }

    g[] d(g gVar) {
        i iVar = new i(gVar);
        int i10 = 0;
        f hVar = new h(new b("*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 0, null));
        hVar.f20666y = gVar.l();
        int i11 = f20622r;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                throw new UnknownHostException(gVar.f20677a.f20615a);
            }
            try {
                e(hVar, iVar, f20623s);
                if (iVar.f20651j && iVar.f20646e == 0) {
                    int iHashCode = hVar.f20666y.hashCode();
                    while (true) {
                        g[] gVarArr = iVar.f20694D;
                        if (i10 >= gVarArr.length) {
                            return gVarArr;
                        }
                        gVarArr[i10].f20677a.f20618d = iHashCode;
                        i10++;
                    }
                } else {
                    i11 = i12;
                }
            } catch (IOException e10) {
                if (Ug.e.f22464b > 1) {
                    e10.printStackTrace(f20627w);
                }
                throw new UnknownHostException(gVar.toString());
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:51:0x00b5
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    void e(Sg.f r11, Sg.f r12, int r13) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Sg.e.e(Sg.f, Sg.f, int):void");
    }

    void f() {
        synchronized (this.f20628a) {
            try {
                DatagramSocket datagramSocket = this.f20633f;
                if (datagramSocket != null) {
                    datagramSocket.close();
                    this.f20633f = null;
                }
                this.f20637j = null;
                this.f20636i.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f20637j == Thread.currentThread()) {
            try {
                try {
                    this.f20634g.setLength(f20620p);
                    this.f20633f.setSoTimeout(this.f20630c);
                    this.f20633f.receive(this.f20634g);
                    if (Ug.e.f22464b > 3) {
                        f20627w.println("NetBIOS: new data read from socket");
                    }
                    f fVar = (f) this.f20636i.get(new Integer(f.e(this.f20632e, 0)));
                    if (fVar != null && !fVar.f20651j) {
                        synchronized (fVar) {
                            try {
                                fVar.i(this.f20632e, 0);
                                fVar.f20651j = true;
                                if (Ug.e.f22464b > 3) {
                                    f20627w.println(fVar);
                                    Ug.d.a(f20627w, this.f20632e, 0, this.f20634g.getLength());
                                }
                                fVar.notify();
                            } finally {
                            }
                        }
                    }
                } catch (SocketTimeoutException unused) {
                } catch (Exception e10) {
                    if (Ug.e.f22464b > 2) {
                        e10.printStackTrace(f20627w);
                    }
                }
            } catch (Throwable th2) {
                f();
                throw th2;
            }
        }
        f();
    }

    e(int i10, InetAddress inetAddress) {
        int i11;
        this.f20628a = new Object();
        this.f20636i = new HashMap();
        this.f20638k = 0;
        this.f20629b = i10;
        this.f20640m = inetAddress;
        try {
            this.f20641n = Rg.a.b("jcifs.smb1.netbios.baddr", InetAddress.getByName("255.255.255.255"));
        } catch (UnknownHostException unused) {
        }
        int i12 = f20619o;
        this.f20631d = new byte[i12];
        int i13 = f20620p;
        this.f20632e = new byte[i13];
        this.f20635h = new DatagramPacket(this.f20631d, i12, this.f20641n, 137);
        this.f20634g = new DatagramPacket(this.f20632e, i13);
        String str = f20626v;
        if (str == null || str.length() == 0) {
            if (g.p() == null) {
                this.f20639l = new int[]{1, 2};
                return;
            } else {
                this.f20639l = new int[]{1, 3, 2};
                return;
            }
        }
        int[] iArr = new int[3];
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int i14 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if (strTrim.equalsIgnoreCase("LMHOSTS")) {
                i11 = i14 + 1;
                iArr[i14] = 1;
            } else if (strTrim.equalsIgnoreCase("WINS")) {
                if (g.p() != null) {
                    i11 = i14 + 1;
                    iArr[i14] = 3;
                } else if (Ug.e.f22464b > 1) {
                    f20627w.println("NetBIOS resolveOrder specifies WINS however the jcifs.smb1.netbios.wins property has not been set");
                }
            } else if (strTrim.equalsIgnoreCase("BCAST")) {
                i11 = i14 + 1;
                iArr[i14] = 2;
            } else if (!strTrim.equalsIgnoreCase("DNS") && Ug.e.f22464b > 1) {
                f20627w.println("unknown resolver method: " + strTrim);
            }
            i14 = i11;
        }
        int[] iArr2 = new int[i14];
        this.f20639l = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, i14);
    }
}
