package n0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6856a {

    /* renamed from: b, reason: collision with root package name */
    public static final d f54099b = new d(null);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC6856a f54100c = new C1963a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC6856a f54101d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC6856a f54102e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* renamed from: a, reason: collision with root package name */
    private final float[] f54103a;

    /* renamed from: n0.a$a, reason: collision with other inner class name */
    public static final class C1963a extends AbstractC6856a {
        C1963a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* renamed from: n0.a$b */
    public static final class b extends AbstractC6856a {
        b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* renamed from: n0.a$c */
    public static final class c extends AbstractC6856a {
        c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* renamed from: n0.a$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC6856a a() {
            return AbstractC6856a.f54100c;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC6856a(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    public final float[] b() {
        return this.f54103a;
    }

    private AbstractC6856a(float[] fArr) {
        this.f54103a = fArr;
    }
}
