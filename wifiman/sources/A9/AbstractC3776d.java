package a9;

import com.ui.btle.v2.f;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: a9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3776d implements f.b {

    /* renamed from: a9.d$a */
    static final class a implements n {
        a() {
        }

        public final gg.f a(byte[] it) {
            AbstractC6492s.i(it, "it");
            return AbstractC3776d.this.b(it);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((C3774b) obj).g());
        }
    }

    /* renamed from: a9.d$b */
    public static final class b implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f25773a;

        public b(byte[] bArr) {
            this.f25773a = bArr;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(C3774b.b(C3774b.f25768b.a(this.f25773a)));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    @Override // com.ui.btle.v2.f.b
    public final AbstractC5912b a(byte[] frame) {
        AbstractC6492s.i(frame, "frame");
        z zVarI = z.i(new b(frame));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bT = zVarI.t(new a());
        AbstractC6492s.h(abstractC5912bT, "final override fun write…ngPacketFrame(it) }\n    }");
        return abstractC5912bT;
    }

    protected abstract AbstractC5912b b(byte[] bArr);
}
