package Z8;

import com.ui.btle.v2.f;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class b extends Z8.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25192a = new b();

    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f25193a;

        public a(byte[] bArr) {
            this.f25193a = bArr;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(f.a(this.f25193a));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: Z8.b$b, reason: collision with other inner class name */
    public static final class C0968b implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f25194a;

        public C0968b(byte[] bArr) {
            this.f25194a = bArr;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(f.a(this.f25194a));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    private b() {
        super(null);
    }

    @Override // Z8.a
    public z a(byte[] frame) {
        AbstractC6492s.i(frame, "frame");
        z zVarI = z.i(new a(frame));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    @Override // Z8.a
    public z b(byte[] frame) {
        AbstractC6492s.i(frame, "frame");
        z zVarI = z.i(new C0968b(frame));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }
}
