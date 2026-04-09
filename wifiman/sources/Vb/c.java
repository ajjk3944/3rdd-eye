package Vb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: k, reason: collision with root package name */
    public static final a f23317k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f23318a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23319b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23320c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23321d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f23322e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f23323f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23324g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f23325h;

    /* renamed from: i, reason: collision with root package name */
    private final String f23326i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f23327j;

    public static final class a {

        /* renamed from: Vb.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0867a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23328a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f23329b;

            static {
                int[] iArr = new int[T7.b.values().length];
                try {
                    iArr[T7.b.SYSTEM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[T7.b.LIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[T7.b.DARK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f23328a = iArr;
                int[] iArr2 = new int[T7.c.values().length];
                try {
                    iArr2[T7.c.IMPERIAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[T7.c.METRIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                f23329b = iArr2;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(T7.b bVar) {
            int i10 = C0867a.f23328a[bVar.ordinal()];
            if (i10 == 1) {
                return "system";
            }
            if (i10 == 2) {
                return "light";
            }
            if (i10 == 3) {
                return "dark";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(T7.c cVar) {
            int i10 = C0867a.f23329b[cVar.ordinal()];
            if (i10 == 1) {
                return "imperial";
            }
            if (i10 == 2) {
                return "metric";
            }
            throw new NoWhenBranchMatchedException();
        }

        private a() {
        }
    }

    public c(int i10, String themeId, String dayNightId, String distanceUnitSystemId, boolean z10, boolean z11, boolean z12, boolean z13, String screenOrientationId, boolean z14) {
        AbstractC6492s.i(themeId, "themeId");
        AbstractC6492s.i(dayNightId, "dayNightId");
        AbstractC6492s.i(distanceUnitSystemId, "distanceUnitSystemId");
        AbstractC6492s.i(screenOrientationId, "screenOrientationId");
        this.f23318a = i10;
        this.f23319b = themeId;
        this.f23320c = dayNightId;
        this.f23321d = distanceUnitSystemId;
        this.f23322e = z10;
        this.f23323f = z11;
        this.f23324g = z12;
        this.f23325h = z13;
        this.f23326i = screenOrientationId;
        this.f23327j = z14;
    }

    public final boolean a() {
        return this.f23322e;
    }

    public final boolean b() {
        return this.f23323f;
    }

    public final String c() {
        return this.f23320c;
    }

    public final T7.b d() {
        String str = this.f23320c;
        int iHashCode = str.hashCode();
        if (iHashCode != -887328209) {
            if (iHashCode != 3075958) {
                if (iHashCode == 102970646 && str.equals("light")) {
                    return T7.b.LIGHT;
                }
            } else if (str.equals("dark")) {
                return T7.b.DARK;
            }
        } else if (str.equals("system")) {
            return T7.b.SYSTEM;
        }
        throw new IllegalStateException("unexpected value in dayNightId - `" + this.f23320c + "`");
    }

    public final boolean e() {
        return this.f23324g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f23318a == cVar.f23318a && AbstractC6492s.d(this.f23319b, cVar.f23319b) && AbstractC6492s.d(this.f23320c, cVar.f23320c) && AbstractC6492s.d(this.f23321d, cVar.f23321d) && this.f23322e == cVar.f23322e && this.f23323f == cVar.f23323f && this.f23324g == cVar.f23324g && this.f23325h == cVar.f23325h && AbstractC6492s.d(this.f23326i, cVar.f23326i) && this.f23327j == cVar.f23327j;
    }

    public final T7.c f() {
        String str = this.f23321d;
        if (AbstractC6492s.d(str, "imperial")) {
            return T7.c.IMPERIAL;
        }
        if (AbstractC6492s.d(str, "metric")) {
            return T7.c.METRIC;
        }
        throw new IllegalStateException("unexpected value in distanceUnitId - `" + this.f23321d + "`");
    }

    public final String g() {
        return this.f23321d;
    }

    public final int h() {
        return this.f23318a;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.f23318a) * 31) + this.f23319b.hashCode()) * 31) + this.f23320c.hashCode()) * 31) + this.f23321d.hashCode()) * 31) + Boolean.hashCode(this.f23322e)) * 31) + Boolean.hashCode(this.f23323f)) * 31) + Boolean.hashCode(this.f23324g)) * 31) + Boolean.hashCode(this.f23325h)) * 31) + this.f23326i.hashCode()) * 31) + Boolean.hashCode(this.f23327j);
    }

    public final String i() {
        return this.f23326i;
    }

    public final boolean j() {
        return this.f23325h;
    }

    public final boolean k() {
        return this.f23327j;
    }

    public final String l() {
        return this.f23319b;
    }

    public String toString() {
        return "RoomAppSettings(id=" + this.f23318a + ", themeId=" + this.f23319b + ", dayNightId=" + this.f23320c + ", distanceUnitSystemId=" + this.f23321d + ", channelsShowFrequencies2ghz=" + this.f23322e + ", channelsShowFrequencies5ghz=" + this.f23323f + ", discoveryKeepScreenOn=" + this.f23324g + ", speedtestKeepScreenOn=" + this.f23325h + ", screenOrientationId=" + this.f23326i + ", teleportTileServiceAdded=" + this.f23327j + ")";
    }

    public /* synthetic */ c(int i10, String str, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, String str4, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? "default" : str, str2, str3, z10, z11, z12, z13, (i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? "portrait" : str4, z14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(T7.b dayNight, T7.c distanceUnitSystem, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC6492s.i(dayNight, "dayNight");
        AbstractC6492s.i(distanceUnitSystem, "distanceUnitSystem");
        a aVar = f23317k;
        this(0, null, aVar.c(dayNight), aVar.d(distanceUnitSystem), z10, z11, z12, z13, null, z14, 259, null);
    }
}
