package od;

import S8.l;

/* renamed from: od.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7122d {

    /* renamed from: od.d$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC7122d interfaceC7122d, float f10, float f11, long j10, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordDeviceDetected");
            }
            if ((i10 & 4) != 0) {
                j10 = System.currentTimeMillis();
            }
            interfaceC7122d.a(f10, f11, j10, str);
        }

        public static /* synthetic */ void b(InterfaceC7122d interfaceC7122d, float f10, float f11, long j10, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordPath");
            }
            if ((i10 & 4) != 0) {
                j10 = System.currentTimeMillis();
            }
            interfaceC7122d.b(f10, f11, j10, lVar);
        }
    }

    void a(float f10, float f11, long j10, String str);

    void b(float f10, float f11, long j10, l lVar);
}
