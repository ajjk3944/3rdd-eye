package Lj;

import Lj.a;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Rect f12066a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    private static final EnumC0478b f12067b = EnumC0478b.TOP_LEFT;

    public static abstract class a {
        abstract b a();

        public b b() {
            e(new Rect(c()));
            return a();
        }

        abstract Rect c();

        public abstract a d(EnumC0478b enumC0478b);

        public abstract a e(Rect rect);
    }

    /* renamed from: Lj.b$b, reason: collision with other inner class name */
    public enum EnumC0478b {
        TOP_LEFT(0),
        TOP_RIGHT(1),
        BOTTOM_RIGHT(2),
        BOTTOM_LEFT(3),
        LEFT_TOP(4),
        RIGHT_TOP(5),
        RIGHT_BOTTOM(6),
        LEFT_BOTTOM(7);

        private final int value;

        EnumC0478b(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static a a() {
        return new a.b().e(f12066a).d(f12067b);
    }

    public abstract EnumC0478b b();

    public abstract Rect c();
}
