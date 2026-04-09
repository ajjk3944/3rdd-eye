package jcifs.smb1.smb1;

import java.net.InetAddress;
import java.util.LinkedList;
import java.util.TimeZone;
import net.sqlcipher.database.SQLiteDatabase;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes4.dex */
interface L {

    /* renamed from: B0, reason: collision with root package name */
    public static final boolean f50352B0;

    /* renamed from: C0, reason: collision with root package name */
    public static final boolean f50353C0;

    /* renamed from: D0, reason: collision with root package name */
    public static final boolean f50354D0;

    /* renamed from: E0, reason: collision with root package name */
    public static final boolean f50355E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final boolean f50356F0;

    /* renamed from: G0, reason: collision with root package name */
    public static final boolean f50357G0;

    /* renamed from: H0, reason: collision with root package name */
    public static final String f50358H0;

    /* renamed from: I0, reason: collision with root package name */
    public static final int f50359I0;

    /* renamed from: J0, reason: collision with root package name */
    public static final int f50360J0;

    /* renamed from: K0, reason: collision with root package name */
    public static final TimeZone f50361K0;

    /* renamed from: L0, reason: collision with root package name */
    public static final boolean f50362L0;

    /* renamed from: M0, reason: collision with root package name */
    public static final String f50363M0;

    /* renamed from: N0, reason: collision with root package name */
    public static final int f50364N0;

    /* renamed from: O0, reason: collision with root package name */
    public static final int f50365O0;

    /* renamed from: P0, reason: collision with root package name */
    public static final int f50366P0;

    /* renamed from: Q0, reason: collision with root package name */
    public static final int f50367Q0;

    /* renamed from: R0, reason: collision with root package name */
    public static final boolean f50368R0;

    /* renamed from: S0, reason: collision with root package name */
    public static final int f50369S0;

    /* renamed from: T0, reason: collision with root package name */
    public static final LinkedList f50370T0;

    /* renamed from: U0, reason: collision with root package name */
    public static final int f50371U0;

    /* renamed from: V0, reason: collision with root package name */
    public static final int f50372V0;

    /* renamed from: W0, reason: collision with root package name */
    public static final int f50373W0;

    /* renamed from: X0, reason: collision with root package name */
    public static final String f50374X0;

    /* renamed from: Y0, reason: collision with root package name */
    public static final String f50375Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public static final Q f50376Z0;

    /* renamed from: w0, reason: collision with root package name */
    public static final InetAddress f50377w0 = Rg.a.e();

    /* renamed from: x0, reason: collision with root package name */
    public static final int f50378x0 = Rg.a.d("jcifs.smb1.smb.client.lport", 0);

    /* renamed from: y0, reason: collision with root package name */
    public static final int f50379y0 = Rg.a.d("jcifs.smb1.smb.client.maxMpxCount", 10);

    /* renamed from: z0, reason: collision with root package name */
    public static final int f50380z0 = Rg.a.d("jcifs.smb1.smb.client.snd_buf_size", 16644);

    /* renamed from: A0, reason: collision with root package name */
    public static final int f50351A0 = Rg.a.d("jcifs.smb1.smb.client.rcv_buf_size", 60416);

    static {
        boolean zA = Rg.a.a("jcifs.smb1.smb.client.useUnicode", true);
        f50352B0 = zA;
        f50353C0 = Rg.a.a("jcifs.smb1.smb.client.useUnicode", false);
        boolean zA2 = Rg.a.a("jcifs.smb1.smb.client.useNtStatus", true);
        f50354D0 = zA2;
        boolean zA3 = Rg.a.a("jcifs.smb1.smb.client.signingPreferred", false);
        f50355E0 = zA3;
        boolean zA4 = Rg.a.a("jcifs.smb1.smb.client.useNTSmbs", true);
        f50356F0 = zA4;
        boolean zA5 = Rg.a.a("jcifs.smb1.smb.client.useExtendedSecurity", true);
        f50357G0 = zA5;
        f50358H0 = Rg.a.h("jcifs.smb1.netbios.hostname", null);
        f50359I0 = Rg.a.d("jcifs.smb1.smb.lmCompatibility", 3);
        f50360J0 = (int) (Math.random() * 65536.0d);
        f50361K0 = TimeZone.getDefault();
        f50362L0 = Rg.a.a("jcifs.smb1.smb.client.useBatching", true);
        f50363M0 = Rg.a.h("jcifs.smb1.encoding", Rg.a.f19842c);
        int i10 = (zA5 ? 2048 : 0) | 3 | (zA3 ? 4 : 0) | (zA2 ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 0) | (zA ? 32768 : 0);
        f50364N0 = i10;
        int i11 = (zA2 ? 64 : 0) | (zA4 ? 16 : 0) | (zA ? 4 : 0) | 4096;
        f50365O0 = i11;
        f50366P0 = Rg.a.d("jcifs.smb1.smb.client.flags2", i10);
        f50367Q0 = Rg.a.d("jcifs.smb1.smb.client.capabilities", i11);
        f50368R0 = Rg.a.a("jcifs.smb1.smb.client.tcpNoDelay", false);
        f50369S0 = Rg.a.d("jcifs.smb1.smb.client.responseTimeout", 30000);
        f50370T0 = new LinkedList();
        f50371U0 = Rg.a.d("jcifs.smb1.smb.client.ssnLimit", SQLiteDatabase.MAX_SQL_CACHE_SIZE);
        f50372V0 = Rg.a.d("jcifs.smb1.smb.client.soTimeout", 35000);
        f50373W0 = Rg.a.d("jcifs.smb1.smb.client.connTimeout", 35000);
        f50374X0 = Rg.a.h("jcifs.smb1.smb.client.nativeOs", System.getProperty("os.name"));
        f50375Y0 = Rg.a.h("jcifs.smb1.smb.client.nativeLanMan", "jCIFS");
        f50376Z0 = new Q(null, 0, null, 0);
    }
}
