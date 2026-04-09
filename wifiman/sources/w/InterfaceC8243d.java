package w;

import r.AbstractC7535j;
import r.InterfaceC7533i;

/* renamed from: w.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8243d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f63852a = a.f63853a;

    /* renamed from: w.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f63853a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final InterfaceC7533i f63854b = AbstractC7535j.j(0.0f, 0.0f, null, 7, null);

        /* renamed from: c, reason: collision with root package name */
        private static final InterfaceC8243d f63855c = new C2272a();

        /* renamed from: w.d$a$a, reason: collision with other inner class name */
        public static final class C2272a implements InterfaceC8243d {
            C2272a() {
            }
        }

        private a() {
        }

        public final float a(float f10, float f11, float f12) {
            float f13 = f11 + f10;
            if ((f10 >= 0.0f && f13 <= f12) || (f10 < 0.0f && f13 > f12)) {
                return 0.0f;
            }
            float f14 = f13 - f12;
            return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
        }

        public final InterfaceC8243d b() {
            return f63855c;
        }

        public final InterfaceC7533i c() {
            return f63854b;
        }
    }

    default float a(float f10, float f11, float f12) {
        return f63852a.a(f10, f11, f12);
    }

    default InterfaceC7533i b() {
        return f63852a.c();
    }
}
