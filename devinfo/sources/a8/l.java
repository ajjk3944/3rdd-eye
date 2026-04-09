package a8;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import t8.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f246d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f247e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f248f;
    public static final Bitmap.Config[] g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f249h;

    /* renamed from: a, reason: collision with root package name */
    public final f f250a = new f(1);

    /* renamed from: b, reason: collision with root package name */
    public final yb.i f251b = new yb.i(2);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f252c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f246d = configArr;
        f247e = configArr;
        f248f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f249h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i4, Bitmap.Config config) {
        return "[" + i4 + "](" + config + ")";
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
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(m.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i4, int i10, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = m.d(config) * i4 * i10;
        f fVar = this.f250a;
        i iVarC = (i) ((ArrayDeque) fVar.f218b).poll();
        if (iVarC == null) {
            iVarC = fVar.C();
        }
        k kVar = (k) iVarC;
        kVar.f244b = iD;
        kVar.f245c = config;
        int i11 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i12 = j.f242a[config.ordinal()];
            configArr = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? new Bitmap.Config[]{config} : f249h : g : f248f : f246d;
        } else {
            configArr = f247e;
        }
        int length = configArr.length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i11];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num == null || num.intValue() > iD * 8) {
                i11++;
            } else if (num.intValue() != iD || (config2 != null ? !config2.equals(config) : config != null)) {
                fVar.u(kVar);
                int iIntValue = num.intValue();
                i iVarC2 = (i) ((ArrayDeque) fVar.f218b).poll();
                if (iVarC2 == null) {
                    iVarC2 = fVar.C();
                }
                kVar = (k) iVarC2;
                kVar.f244b = iIntValue;
                kVar.f245c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f251b.D(kVar);
        if (bitmap != null) {
            a(Integer.valueOf(kVar.f244b), bitmap);
            bitmap.reconfigure(i4, i10, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.f252c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = m.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        f fVar = this.f250a;
        i iVarC = (i) ((ArrayDeque) fVar.f218b).poll();
        if (iVarC == null) {
            iVarC = fVar.C();
        }
        k kVar = (k) iVarC;
        kVar.f244b = iC;
        kVar.f245c = config;
        this.f251b.O(kVar, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(kVar.f244b));
        navigableMapD.put(Integer.valueOf(kVar.f244b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbZ = d.h.z("SizeConfigStrategy{groupedMap=");
        sbZ.append(this.f251b);
        sbZ.append(", sortedSizes=(");
        HashMap map = this.f252c;
        for (Map.Entry entry : map.entrySet()) {
            sbZ.append(entry.getKey());
            sbZ.append('[');
            sbZ.append(entry.getValue());
            sbZ.append("], ");
        }
        if (!map.isEmpty()) {
            sbZ.replace(sbZ.length() - 2, sbZ.length(), "");
        }
        sbZ.append(")}");
        return sbZ.toString();
    }
}
