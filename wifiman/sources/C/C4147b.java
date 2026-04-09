package c;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4147b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f33524e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final float f33525a;

    /* renamed from: b, reason: collision with root package name */
    private final float f33526b;

    /* renamed from: c, reason: collision with root package name */
    private final float f33527c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33528d;

    /* renamed from: c.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4147b(float f10, float f11, float f12, int i10) {
        this.f33525a = f10;
        this.f33526b = f11;
        this.f33527c = f12;
        this.f33528d = i10;
    }

    public final float a() {
        return this.f33527c;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f33525a + ", touchY=" + this.f33526b + ", progress=" + this.f33527c + ", swipeEdge=" + this.f33528d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4147b(BackEvent backEvent) {
        AbstractC6492s.i(backEvent, "backEvent");
        C4146a c4146a = C4146a.f33523a;
        this(c4146a.c(backEvent), c4146a.d(backEvent), c4146a.a(backEvent), c4146a.b(backEvent));
    }
}
