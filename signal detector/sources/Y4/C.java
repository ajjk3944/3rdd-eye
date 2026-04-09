package Y4;

import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import c5.C0412i;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class C extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public String f4394e;

    /* renamed from: f, reason: collision with root package name */
    public int f4395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4396g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(WifiDetectionActivity wifiDetectionActivity, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4396g = wifiDetectionActivity;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((C) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new C(this.f4396g, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        String strI;
        DhcpInfo dhcpInfo;
        List listL;
        int i = this.f4395f;
        try {
            if (i == 0) {
                R2.a.H(obj);
                WifiManager wifiManager = this.f4396g.f19407c0;
                strI = a4.p.i((wifiManager == null || (dhcpInfo = wifiManager.getDhcpInfo()) == null) ? null : new Integer(dhcpInfo.gateway));
                byte[] address = InetAddress.getByName(strI).getAddress();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[0], 0, 0);
                DatagramSocket datagramSocket = new DatagramSocket();
                int i3 = 2;
                while (i3 < 255) {
                    address[3] = (byte) i3;
                    datagramPacket.setAddress(InetAddress.getByAddress(address));
                    datagramSocket.send(datagramPacket);
                    i3++;
                    if (i3 == 125) {
                        datagramSocket.close();
                        datagramSocket = new DatagramSocket();
                    }
                }
                datagramSocket.close();
                this.f4394e = strI;
                this.f4395f = 1;
                Object objE = AbstractC3046w.e(3000L, this);
                EnumC2380a enumC2380a = EnumC2380a.f20635a;
                if (objE == enumC2380a) {
                    return enumC2380a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                strI = this.f4394e;
                R2.a.H(obj);
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("ip neigh show").getInputStream()));
            int i6 = 0;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                Pattern patternCompile = Pattern.compile("\\s+");
                q5.i.d(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(line);
                if (matcher.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iEnd = 0;
                    do {
                        arrayList.add(line.subSequence(iEnd, matcher.start()).toString());
                        iEnd = matcher.end();
                    } while (matcher.find());
                    arrayList.add(line.subSequence(iEnd, line.length()).toString());
                    listL = arrayList;
                } else {
                    listL = a4.p.l(line.toString());
                }
                if (listL.size() > 4 && q5.i.a(listL.get(4), strI)) {
                    i6++;
                }
            }
            return Boolean.valueOf(i6 > 1);
        } catch (Throwable th) {
            R2.a.d(th);
            return Boolean.TRUE;
        }
    }
}
