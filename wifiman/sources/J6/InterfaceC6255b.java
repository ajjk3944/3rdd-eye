package j6;

import a6.EnumC3767a;

/* renamed from: j6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6255b {

    /* renamed from: j6.b$a */
    public static final class a {
        public static float a(InterfaceC6255b interfaceC6255b) {
            return interfaceC6255b.g();
        }

        public static float b(InterfaceC6255b interfaceC6255b) {
            return interfaceC6255b.e();
        }

        public static float c(InterfaceC6255b interfaceC6255b) {
            return interfaceC6255b.g() + interfaceC6255b.e();
        }

        public static InterfaceC6255b d(InterfaceC6255b interfaceC6255b, float f10) {
            return AbstractC6256c.a(interfaceC6255b.g() * f10, interfaceC6255b.e() * f10, interfaceC6255b.d());
        }
    }

    float a();

    float b();

    InterfaceC6255b c(float f10);

    EnumC3767a d();

    float e();

    float f();

    float g();
}
