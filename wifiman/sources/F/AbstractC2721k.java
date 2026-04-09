package F;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import v.AbstractC8177a;

/* renamed from: F.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2721k {

    /* renamed from: F.k$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v.i f5359a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v.i iVar) {
            super(0);
            this.f5359a = iVar;
        }

        public final void a() {
            v.j.a(this.f5359a);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.k$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M.G f5360a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f5361b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5362c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(M.G g10, InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f5360a = g10;
            this.f5361b = interfaceC6839p;
            this.f5362c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2721k.b(this.f5360a, this.f5361b, interfaceC3540l, L0.a(this.f5362c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.k$c */
    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v.i f5363a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(v.i iVar) {
            super(0);
            this.f5363a = iVar;
        }

        public final void a() {
            v.j.a(this.f5363a);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.k$d */
    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J.j f5364a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5365b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f5366c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5367d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(J.j jVar, boolean z10, InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f5364a = jVar;
            this.f5365b = z10;
            this.f5366c = interfaceC6839p;
            this.f5367d = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2721k.a(this.f5364a, this.f5365b, this.f5366c, interfaceC3540l, L0.a(this.f5367d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void a(J.j jVar, boolean z10, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2103477555);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(jVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2103477555, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:51)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = new v.i(null, 1, null);
                interfaceC3540lR.K(objF);
            }
            v.i iVar = (v.i) objF;
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = new c(iVar);
                interfaceC3540lR.K(objF2);
            }
            int i12 = i11 << 9;
            AbstractC8177a.b(iVar, (InterfaceC6824a) objF2, J.l.a(jVar, iVar), null, z10, interfaceC6839p, interfaceC3540lR, (57344 & i12) | 54 | (i12 & ImageMetadata.JPEG_GPS_COORDINATES), 8);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new d(jVar, z10, interfaceC6839p, i10));
        }
    }

    public static final void b(M.G g10, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1985516685);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(g10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1985516685, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:35)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = new v.i(null, 1, null);
                interfaceC3540lR.K(objF);
            }
            v.i iVar = (v.i) objF;
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = new a(iVar);
                interfaceC3540lR.K(objF2);
            }
            AbstractC8177a.b(iVar, (InterfaceC6824a) objF2, M.I.a(g10, iVar), null, g10.E(), interfaceC6839p, interfaceC3540lR, ((i11 << 12) & ImageMetadata.JPEG_GPS_COORDINATES) | 54, 8);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new b(g10, interfaceC6839p, i10));
        }
    }
}
