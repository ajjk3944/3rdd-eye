package p8;

import android.content.Context;
import android.text.TextUtils;
import com.wifi.netdiscovery.consts.OS_TYPE;
import com.wifi.netdiscovery.data.HostInfo;
import com.wifi.netdiscovery.utils.DeviceTypeUtil;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.o;
import g8.q;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public r8.a f23902a;

    /* renamed from: b, reason: collision with root package name */
    public Context f23903b;

    public a(r8.a aVar) {
        this.f23902a = aVar;
    }

    public final k8.a a(HostInfo hostInfo) {
        a aVar;
        HostInfo hostInfo2;
        k8.a aVar2 = new k8.a();
        aVar2.f21893e = hostInfo.ipAddress;
        aVar2.f21894f = hostInfo.hardwareAddress;
        aVar2.f21895g = o.c().a(this.f23903b, "device_marked", hostInfo.hardwareAddress, false);
        String str = hostInfo.hostName;
        aVar2.f21890b = str;
        String str2 = hostInfo.vendor;
        String strReplace = str2 != null ? str2.split(" ")[0].replace(",", "") : str2;
        if (str2 != null) {
            strReplace = str2.split(" ")[0].replace(",", "");
        }
        String str3 = strReplace;
        aVar2.f21892d = str3;
        if (TextUtils.isEmpty(str)) {
            aVar = this;
            hostInfo2 = hostInfo;
        } else {
            aVar = this;
            hostInfo2 = hostInfo;
            aVar.c(aVar2, hostInfo2, str, str2, str3);
        }
        String strG = o.c().g(aVar.f23903b, "edit_device_name", hostInfo2.hardwareAddress, "");
        if (!TextUtils.isEmpty(strG)) {
            aVar2.f21889a = strG;
        }
        return aVar2;
    }

    public void b(HostInfo hostInfo) {
        this.f23902a.e(a(hostInfo));
    }

    public final void c(k8.a aVar, HostInfo hostInfo, String str, String str2, String str3) {
        DeviceTypeUtil.DeviceType deviceTypeE = DeviceTypeUtil.e(str);
        DeviceTypeUtil.DeviceType deviceType = DeviceTypeUtil.DeviceType.Android;
        if (deviceTypeE.equals(deviceType) || DeviceTypeUtil.e(str2).equals(deviceType)) {
            aVar.f21896h = 1;
            aVar.f21891c = q.b(R.string.device_android);
            if (q.a(str3.toLowerCase(), "unknow")) {
                aVar.f21889a = q.b(R.string.device_android);
                return;
            }
            aVar.f21889a = q.b(R.string.device_android) + "(" + str3 + ")";
            return;
        }
        DeviceTypeUtil.DeviceType deviceTypeE2 = DeviceTypeUtil.e(str);
        DeviceTypeUtil.DeviceType deviceType2 = DeviceTypeUtil.DeviceType.MacBook;
        if (deviceTypeE2.equals(deviceType2) || DeviceTypeUtil.e(str2).equals(deviceType2)) {
            aVar.f21896h = 2;
            aVar.f21891c = q.b(R.string.device_apple);
            aVar.f21889a = q.b(R.string.device_android) + "(" + str3 + ")";
            return;
        }
        DeviceTypeUtil.DeviceType deviceTypeE3 = DeviceTypeUtil.e(str);
        DeviceTypeUtil.DeviceType deviceType3 = DeviceTypeUtil.DeviceType.Iphone;
        if (deviceTypeE3.equals(deviceType3) || DeviceTypeUtil.e(str2).equals(deviceType3)) {
            aVar.f21896h = 2;
            aVar.f21891c = q.b(R.string.device_apple);
            aVar.f21889a = q.b(R.string.device_android) + "(" + str3 + ")";
            return;
        }
        DeviceTypeUtil.DeviceType deviceTypeE4 = DeviceTypeUtil.e(str);
        DeviceTypeUtil.DeviceType deviceType4 = DeviceTypeUtil.DeviceType.Windows;
        if (deviceTypeE4.equals(deviceType4) || DeviceTypeUtil.e(str2).equals(deviceType4) || OS_TYPE.WINDOWS.equals(hostInfo.os)) {
            aVar.f21896h = 3;
            aVar.f21891c = q.b(R.string.device_windows);
            aVar.f21889a = q.b(R.string.device_windows) + "(" + str3 + ")";
            return;
        }
        if (hostInfo.isGateWay) {
            aVar.f21891c = q.b(R.string.device_unknown);
            aVar.f21896h = 4;
            aVar.f21889a = q.b(R.string.router) + "(" + str3 + ")";
            return;
        }
        aVar.f21891c = q.b(R.string.device_unknown);
        aVar.f21896h = 0;
        aVar.f21889a = q.b(R.string.device_unknown) + "(" + str3 + ")";
    }

    public void d(Context context) {
        this.f23903b = context;
    }
}
