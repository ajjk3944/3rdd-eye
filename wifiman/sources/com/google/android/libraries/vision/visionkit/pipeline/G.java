package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.A2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4582g2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.N1;
import java.util.List;

/* loaded from: classes.dex */
public final class G extends AbstractC4516a2 implements A2 {
    private static final G zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private InterfaceC4582g2 zzg = AbstractC4516a2.k();

    static {
        G g10 = new G();
        zzb = g10;
        AbstractC4516a2.p(G.class, g10);
    }

    private G() {
    }

    public static G C(byte[] bArr, N1 n12) {
        return (G) AbstractC4516a2.g(zzb, bArr, n12);
    }

    public final int A() {
        return this.zze;
    }

    public final String D() {
        return this.zzf;
    }

    public final List E() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", C5014c.class});
        }
        if (i11 == 3) {
            return new G();
        }
        E e10 = null;
        if (i11 == 4) {
            return new F(e10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
