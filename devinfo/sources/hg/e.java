package hg;

import androidx.lifecycle.e1;
import com.liuzh.deviceinfo.DeviceInfoApp;
import java.util.Arrays;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class e extends e1 {
    public static String e(int i4) {
        String string = DeviceInfoApp.f21145f.getString(i4);
        k.d(string, "getString(...)");
        return string;
    }

    public static String f(Object[] objArr, int i4) {
        String string = DeviceInfoApp.f21145f.getString(i4, Arrays.copyOf(objArr, objArr.length));
        k.d(string, "getString(...)");
        return string;
    }
}
