package F2;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class m implements k {

    /* renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f5833d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f5834e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f5835f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f5836g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f5837h;

    /* renamed from: a, reason: collision with root package name */
    private final c f5838a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final g f5839b = new g();

    /* renamed from: c, reason: collision with root package name */
    private final Map f5840c = new HashMap();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5841a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f5841a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5841a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5841a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5841a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final c f5842a;

        /* renamed from: b, reason: collision with root package name */
        int f5843b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f5844c;

        public b(c cVar) {
            this.f5842a = cVar;
        }

        @Override // F2.l
        public void a() {
            this.f5842a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f5843b = i10;
            this.f5844c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5843b == bVar.f5843b && W2.l.d(this.f5844c, bVar.f5844c);
        }

        public int hashCode() {
            int i10 = this.f5843b * 31;
            Bitmap.Config config = this.f5844c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.h(this.f5843b, this.f5844c);
        }
    }

    static class c extends F2.c {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // F2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f5833d = configArr;
        f5834e = configArr;
        f5835f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f5836g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f5837h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapJ = j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    private b g(int i10, Bitmap.Config config) {
        b bVarE = this.f5838a.e(i10, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer num = (Integer) j(config2).ceilingKey(Integer.valueOf(i10));
            if (num != null && num.intValue() <= i10 * 8) {
                if (num.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVarE;
                        }
                    } else if (config2.equals(config)) {
                        return bVarE;
                    }
                }
                this.f5838a.c(bVarE);
                return this.f5838a.e(num.intValue(), config2);
            }
        }
        return bVarE;
    }

    static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            return f5834e;
        }
        int i10 = a.f5841a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f5837h : f5836g : f5835f : f5833d;
    }

    private NavigableMap j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f5840c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f5840c.put(config, treeMap);
        return treeMap;
    }

    @Override // F2.k
    public String a(int i10, int i11, Bitmap.Config config) {
        return h(W2.l.g(i10, i11, config), config);
    }

    @Override // F2.k
    public int b(Bitmap bitmap) {
        return W2.l.h(bitmap);
    }

    @Override // F2.k
    public void c(Bitmap bitmap) {
        b bVarE = this.f5838a.e(W2.l.h(bitmap), bitmap.getConfig());
        this.f5839b.d(bVarE, bitmap);
        NavigableMap navigableMapJ = j(bitmap.getConfig());
        Integer num = (Integer) navigableMapJ.get(Integer.valueOf(bVarE.f5843b));
        navigableMapJ.put(Integer.valueOf(bVarE.f5843b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // F2.k
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b bVarG = g(W2.l.g(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f5839b.a(bVarG);
        if (bitmap != null) {
            f(Integer.valueOf(bVarG.f5843b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // F2.k
    public String e(Bitmap bitmap) {
        return h(W2.l.h(bitmap), bitmap.getConfig());
    }

    @Override // F2.k
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f5839b.f();
        if (bitmap != null) {
            f(Integer.valueOf(W2.l.h(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f5839b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry entry : this.f5840c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f5840c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
