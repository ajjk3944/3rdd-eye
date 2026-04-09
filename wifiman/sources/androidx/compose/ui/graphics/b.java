package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.AbstractC3964z0;
import com.google.ar.core.ImageMetadata;
import m0.AbstractC6673I0;
import m0.c1;
import m0.d1;
import m0.i1;
import mh.InterfaceC6835l;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public abstract class b {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l) {
        return eVar.b0(new BlockGraphicsLayerElement(interfaceC6835l));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, i1 i1Var, boolean z10, d1 d1Var, long j11, long j12, int i10) {
        return eVar.b0(new GraphicsLayerElement(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, i1Var, z10, d1Var, j11, j12, i10, null));
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, i1 i1Var, boolean z10, d1 d1Var, long j11, long j12, int i10, int i11, Object obj) {
        return b(eVar, (i11 & 1) != 0 ? 1.0f : f10, (i11 & 2) != 0 ? 1.0f : f11, (i11 & 4) == 0 ? f12 : 1.0f, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? 0.0f : f14, (i11 & 32) != 0 ? 0.0f : f15, (i11 & 64) != 0 ? 0.0f : f16, (i11 & 128) != 0 ? 0.0f : f17, (i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? f18 : 0.0f, (i11 & 512) != 0 ? 8.0f : f19, (i11 & 1024) != 0 ? f.f28939b.a() : j10, (i11 & 2048) != 0 ? c1.a() : i1Var, (i11 & 4096) != 0 ? false : z10, (i11 & 8192) != 0 ? null : d1Var, (i11 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? AbstractC6673I0.a() : j11, (i11 & 32768) != 0 ? AbstractC6673I0.a() : j12, (i11 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? a.f28894a.a() : i10);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar) {
        return AbstractC3964z0.b() ? eVar.b0(c(androidx.compose.ui.e.f28771b0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : eVar;
    }
}
