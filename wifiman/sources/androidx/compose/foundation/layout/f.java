package androidx.compose.foundation.layout;

import Yg.J;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import z.InterfaceC8681d;

/* loaded from: classes.dex */
public final class f implements InterfaceC8681d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f28130a = new f();

    public static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0.c f28131a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f0.c cVar) {
            super(1);
            this.f28131a = cVar;
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return J.f24997a;
        }
    }

    public static final class b extends AbstractC6494u implements InterfaceC6835l {
        public b() {
            super(1);
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return J.f24997a;
        }
    }

    private f() {
    }

    @Override // z.InterfaceC8681d
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return eVar.b0(new BoxChildDataElement(f0.c.f46573a.e(), true, AbstractC3964z0.b() ? new b() : AbstractC3964z0.a()));
    }

    @Override // z.InterfaceC8681d
    public androidx.compose.ui.e f(androidx.compose.ui.e eVar, f0.c cVar) {
        return eVar.b0(new BoxChildDataElement(cVar, false, AbstractC3964z0.b() ? new a(cVar) : AbstractC3964z0.a()));
    }
}
