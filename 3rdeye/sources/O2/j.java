package O2;

import H6.B;
import N7.G8;
import android.graphics.Bitmap;
import android.os.Build;
import h3.l;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f10198d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f10199e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f10200f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f10201g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f10202h;

    /* renamed from: a, reason: collision with root package name */
    public final c f10203a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final e<b, Bitmap> f10204b = new e<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f10205c = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10206a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f10206a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10206a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10206a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10206a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        public final c f10207a;

        /* renamed from: b, reason: collision with root package name */
        public int f10208b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap.Config f10209c;

        public b(c cVar) {
            this.f10207a = cVar;
        }

        @Override // O2.i
        public final void a() {
            this.f10207a.l(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f10208b == bVar.f10208b && l.b(this.f10209c, bVar.f10209c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.f10208b * 31;
            Bitmap.Config config = this.f10209c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return j.c(this.f10208b, this.f10209c);
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    public static class c extends B {
        public final i m() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f10198d = configArr;
        f10199e = configArr;
        f10200f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f10201g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f10202h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num2 = navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(l.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i, int i10, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int i11 = 0;
        int iD = l.d(config) * i * i10;
        c cVar = this.f10203a;
        i iVarM = (i) ((ArrayDeque) cVar.f2034b).poll();
        if (iVarM == null) {
            iVarM = cVar.m();
        }
        b bVar = (b) iVarM;
        bVar.f10208b = iD;
        bVar.f10209c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i12 = a.f10206a[config.ordinal()];
            configArr = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? new Bitmap.Config[]{config} : f10202h : f10201g : f10200f : f10198d;
        } else {
            configArr = f10199e;
        }
        int length = configArr.length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i11];
            Integer numCeilingKey = d(config2).ceilingKey(Integer.valueOf(iD));
            if (numCeilingKey == null || numCeilingKey.intValue() > iD * 8) {
                i11++;
            } else if (numCeilingKey.intValue() != iD || (config2 != null ? !config2.equals(config) : config != null)) {
                cVar.l(bVar);
                int iIntValue = numCeilingKey.intValue();
                Object objM = (i) ((ArrayDeque) cVar.f2034b).poll();
                if (objM == null) {
                    objM = cVar.m();
                }
                bVar = (b) objM;
                bVar.f10208b = iIntValue;
                bVar.f10209c = config2;
            }
        }
        Bitmap bitmapA = this.f10204b.a(bVar);
        if (bitmapA != null) {
            a(Integer.valueOf(bVar.f10208b), bitmapA);
            bitmapA.reconfigure(i, i10, config);
        }
        return bitmapA;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap map = this.f10205c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = l.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        c cVar = this.f10203a;
        i iVarM = (i) ((ArrayDeque) cVar.f2034b).poll();
        if (iVarM == null) {
            iVarM = cVar.m();
        }
        b bVar = (b) iVarM;
        bVar.f10208b = iC;
        bVar.f10209c = config;
        this.f10204b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num = navigableMapD.get(Integer.valueOf(bVar.f10208b));
        navigableMapD.put(Integer.valueOf(bVar.f10208b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbU = G8.u("SizeConfigStrategy{groupedMap=");
        sbU.append(this.f10204b);
        sbU.append(", sortedSizes=(");
        HashMap map = this.f10205c;
        for (Map.Entry entry : map.entrySet()) {
            sbU.append(entry.getKey());
            sbU.append('[');
            sbU.append(entry.getValue());
            sbU.append("], ");
        }
        if (!map.isEmpty()) {
            sbU.replace(sbU.length() - 2, sbU.length(), "");
        }
        sbU.append(")}");
        return sbU.toString();
    }
}
