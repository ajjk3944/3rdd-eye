package o1;

import H1.p;
import android.graphics.Bitmap;
import android.os.Build;
import h0.C2351a;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f22692d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f22693e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f22694f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f22695g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f22696h;

    /* renamed from: a, reason: collision with root package name */
    public final C2757e f22697a = new C2757e(1);

    /* renamed from: b, reason: collision with root package name */
    public final C2351a f22698b = new C2351a(27);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f22699c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f22692d = configArr;
        f22693e = configArr;
        f22694f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f22695g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f22696h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(p.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i, int i3, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = p.d(config) * i * i3;
        C2757e c2757e = this.f22697a;
        InterfaceC2759g interfaceC2759gL = (InterfaceC2759g) ((ArrayDeque) c2757e.f1505a).poll();
        if (interfaceC2759gL == null) {
            interfaceC2759gL = c2757e.l();
        }
        i iVar = (i) interfaceC2759gL;
        iVar.f22690b = iD;
        iVar.f22691c = config;
        int i6 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i7 = h.f22688a[config.ordinal()];
            configArr = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? new Bitmap.Config[]{config} : f22696h : f22695g : f22694f : f22692d;
        } else {
            configArr = f22693e;
        }
        int length = configArr.length;
        while (true) {
            if (i6 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i6];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num == null || num.intValue() > iD * 8) {
                i6++;
            } else if (num.intValue() != iD || (config2 != null ? !config2.equals(config) : config != null)) {
                c2757e.f(iVar);
                int iIntValue = num.intValue();
                InterfaceC2759g interfaceC2759gL2 = (InterfaceC2759g) ((ArrayDeque) c2757e.f1505a).poll();
                if (interfaceC2759gL2 == null) {
                    interfaceC2759gL2 = c2757e.l();
                }
                iVar = (i) interfaceC2759gL2;
                iVar.f22690b = iIntValue;
                iVar.f22691c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f22698b.B(iVar);
        if (bitmap != null) {
            a(Integer.valueOf(iVar.f22690b), bitmap);
            bitmap.reconfigure(i, i3, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.f22699c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = p.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C2757e c2757e = this.f22697a;
        InterfaceC2759g interfaceC2759gL = (InterfaceC2759g) ((ArrayDeque) c2757e.f1505a).poll();
        if (interfaceC2759gL == null) {
            interfaceC2759gL = c2757e.l();
        }
        i iVar = (i) interfaceC2759gL;
        iVar.f22690b = iC;
        iVar.f22691c = config;
        this.f22698b.P(iVar, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(iVar.f22690b));
        navigableMapD.put(Integer.valueOf(iVar.f22690b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbA = AbstractC2984e.a("SizeConfigStrategy{groupedMap=");
        sbA.append(this.f22698b);
        sbA.append(", sortedSizes=(");
        HashMap map = this.f22699c;
        for (Map.Entry entry : map.entrySet()) {
            sbA.append(entry.getKey());
            sbA.append('[');
            sbA.append(entry.getValue());
            sbA.append("], ");
        }
        if (!map.isEmpty()) {
            sbA.replace(sbA.length() - 2, sbA.length(), "");
        }
        sbA.append(")}");
        return sbA.toString();
    }
}
