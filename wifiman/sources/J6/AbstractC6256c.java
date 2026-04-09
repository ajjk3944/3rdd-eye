package j6;

import a6.EnumC3767a;
import j6.InterfaceC6255b;

/* renamed from: j6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6256c {

    /* renamed from: j6.c$a */
    public static final class a implements InterfaceC6255b {

        /* renamed from: a, reason: collision with root package name */
        private final float f50134a;

        /* renamed from: b, reason: collision with root package name */
        private final float f50135b;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC3767a f50136c;

        a(float f10, float f11, EnumC3767a enumC3767a) {
            this.f50134a = f10;
            this.f50135b = f11;
            this.f50136c = enumC3767a;
        }

        @Override // j6.InterfaceC6255b
        public float a() {
            return InterfaceC6255b.a.c(this);
        }

        @Override // j6.InterfaceC6255b
        public float b() {
            return InterfaceC6255b.a.b(this);
        }

        @Override // j6.InterfaceC6255b
        public InterfaceC6255b c(float f10) {
            return InterfaceC6255b.a.d(this, f10);
        }

        @Override // j6.InterfaceC6255b
        public EnumC3767a d() {
            return this.f50136c;
        }

        @Override // j6.InterfaceC6255b
        public float e() {
            return this.f50135b;
        }

        @Override // j6.InterfaceC6255b
        public float f() {
            return InterfaceC6255b.a.a(this);
        }

        @Override // j6.InterfaceC6255b
        public float g() {
            return this.f50134a;
        }
    }

    public static final InterfaceC6255b a(float f10, float f11, EnumC3767a enumC3767a) {
        return new a(f10, f11, enumC3767a);
    }
}
