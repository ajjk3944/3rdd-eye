package a6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0978b f25730c = new C0978b(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f25731a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25732b;

    public static final class a extends b {
        public /* synthetic */ a(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 1 : i11);
        }

        public float a(float f10) {
            return 0.0f;
        }

        public a(int i10, int i11) {
            super(i10, i11, null);
            if (i10 < 0) {
                throw new IllegalArgumentException(("`offset` cannot be negative. Received " + i10 + '.').toString());
            }
            if (i11 >= 1) {
                return;
            }
            throw new IllegalArgumentException(("`spacing` cannot be less than 1. Received " + i11 + '.').toString());
        }
    }

    /* renamed from: a6.b$b, reason: collision with other inner class name */
    public static final class C0978b {
        public /* synthetic */ C0978b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0978b() {
        }
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    private b(int i10, int i11) {
        this.f25731a = i10;
        this.f25732b = i11;
    }
}
