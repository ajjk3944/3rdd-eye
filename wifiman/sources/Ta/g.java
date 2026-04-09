package ta;

import C0.InterfaceC2528h;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6492s;
import m0.AbstractC6735w0;
import mh.InterfaceC6839p;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import s.AbstractC7833F;
import s9.InterfaceC7929a;

/* loaded from: classes3.dex */
public final class g implements InterfaceC8050d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f61911a = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(g gVar, InterfaceC7929a interfaceC7929a, androidx.compose.ui.e eVar, InterfaceC7929a.b bVar, InterfaceC7929a.b bVar2, String str, f0.c cVar, InterfaceC2528h interfaceC2528h, float f10, AbstractC6735w0 abstractC6735w0, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        gVar.a(interfaceC7929a, eVar, bVar, bVar2, str, cVar, interfaceC2528h, f10, abstractC6735w0, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    private final void e(final InterfaceC7929a.b bVar, final androidx.compose.ui.e eVar, final String str, final f0.c cVar, final InterfaceC2528h interfaceC2528h, final float f10, final AbstractC6735w0 abstractC6735w0, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(977514439);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(str) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(cVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.T(interfaceC2528h) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC3540lR.g(f10) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC3540lR.T(abstractC6735w0) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((599187 & i11) == 599186 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(977514439, i11, -1, "com.ui.core.ui.util.img.UiImageLoaderDefault.LocalImage (UiImageLoaderDefault.kt:20)");
            }
            AbstractC7833F.a(AbstractC8049c.i(bVar, interfaceC3540lR, i11 & 14), str, eVar, cVar, interfaceC2528h, f10, abstractC6735w0, interfaceC3540lR, ((i11 >> 3) & 112) | ((i11 << 3) & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (i11 & 3670016), 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: ta.f
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return g.f(this.f61902a, bVar, eVar, str, cVar, interfaceC2528h, f10, abstractC6735w0, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(g gVar, InterfaceC7929a.b bVar, androidx.compose.ui.e eVar, String str, f0.c cVar, InterfaceC2528h interfaceC2528h, float f10, AbstractC6735w0 abstractC6735w0, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        gVar.e(bVar, eVar, str, cVar, interfaceC2528h, f10, abstractC6735w0, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    @Override // ta.InterfaceC8050d
    public void a(final InterfaceC7929a img, final androidx.compose.ui.e modifier, final InterfaceC7929a.b bVar, final InterfaceC7929a.b bVar2, final String str, final f0.c alignment, final InterfaceC2528h contentScale, final float f10, final AbstractC6735w0 abstractC6735w0, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(img, "img");
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(alignment, "alignment");
        AbstractC6492s.i(contentScale, "contentScale");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1824776532);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(img) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(modifier) ? 32 : 16;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.T(str) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC3540lR.T(alignment) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC3540lR.T(contentScale) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i10) == 0) {
            i11 |= interfaceC3540lR.g(f10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= interfaceC3540lR.T(abstractC6735w0) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= interfaceC3540lR.T(this) ? 536870912 : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ((306782227 & i11) == 306782226 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1824776532, i11, -1, "com.ui.core.ui.util.img.UiImageLoaderDefault.Image (UiImageLoaderDefault.kt:43)");
            }
            if (!(img instanceof InterfaceC7929a.b)) {
                throw new IllegalStateException("DefaultCommonImageLoader doesn't support images remote image sources, import any of core-ui-img libs or provide custom implementation");
            }
            int i12 = i11 & 112;
            int i13 = i11 >> 6;
            interfaceC3540l2 = interfaceC3540lR;
            e((InterfaceC7929a.b) img, modifier, str, alignment, contentScale, f10, abstractC6735w0, interfaceC3540lR, i12 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (i13 & 29360128));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: ta.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return g.d(this.f61891a, img, modifier, bVar, bVar2, str, alignment, contentScale, f10, abstractC6735w0, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
