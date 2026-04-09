package u6;

import k6.C6396c;

/* loaded from: classes3.dex */
public interface e extends c {

    public static final class a {
        public static float a(e eVar) {
            return eVar.h() ? 1.0f : -1.0f;
        }

        public static float b(e eVar, float f10) {
            return f10 * eVar.getDensity();
        }

        public static int c(e eVar, float f10) {
            return (int) eVar.g(f10);
        }

        public static float d(e eVar, float f10) {
            return f10 * eVar.y();
        }

        public static float e(e eVar, float f10) {
            return f10 * eVar.getDensity();
        }
    }

    float b(float f10);

    C6396c c();

    boolean f();

    float g(float f10);

    float getDensity();

    boolean h();

    float j();

    float l();

    float m(float f10);

    int o(float f10);

    float y();
}
