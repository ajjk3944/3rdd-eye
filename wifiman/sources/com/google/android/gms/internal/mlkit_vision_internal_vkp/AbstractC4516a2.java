package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4516a2 extends AbstractC4614j1 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected W2 zzc = W2.c();

    static AbstractC4516a2 e(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        AbstractC4516a2 abstractC4516a2 = (AbstractC4516a2) map.get(cls);
        if (abstractC4516a2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC4516a2 = (AbstractC4516a2) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC4516a2 == null) {
            abstractC4516a2 = (AbstractC4516a2) ((AbstractC4516a2) AbstractC4539c3.j(cls)).v(6, null, null);
            if (abstractC4516a2 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC4516a2);
        }
        return abstractC4516a2;
    }

    protected static AbstractC4516a2 g(AbstractC4516a2 abstractC4516a2, byte[] bArr, N1 n12) throws zzbew {
        AbstractC4516a2 abstractC4516a2Y = y(abstractC4516a2, bArr, 0, bArr.length, n12);
        x(abstractC4516a2Y);
        return abstractC4516a2Y;
    }

    protected static InterfaceC4549d2 h() {
        return U1.f();
    }

    protected static InterfaceC4560e2 i() {
        return C4527b2.f();
    }

    protected static InterfaceC4571f2 j() {
        return C4659n2.f();
    }

    protected static InterfaceC4582g2 k() {
        return H2.e();
    }

    static Object l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object m(InterfaceC4790z2 interfaceC4790z2, String str, Object[] objArr) {
        return new I2(interfaceC4790z2, str, objArr);
    }

    protected static void p(Class cls, AbstractC4516a2 abstractC4516a2) {
        abstractC4516a2.o();
        zzb.put(cls, abstractC4516a2);
    }

    protected static final boolean r(AbstractC4516a2 abstractC4516a2, boolean z10) {
        byte bByteValue = ((Byte) abstractC4516a2.v(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = G2.a().b(abstractC4516a2.getClass()).zzl(abstractC4516a2);
        if (z10) {
            abstractC4516a2.v(2, true != zZzl ? null : abstractC4516a2, null);
        }
        return zZzl;
    }

    private final int w(J2 j22) {
        return G2.a().b(getClass()).zza(this);
    }

    private static AbstractC4516a2 x(AbstractC4516a2 abstractC4516a2) throws zzbew {
        if (abstractC4516a2 == null || r(abstractC4516a2, true)) {
            return abstractC4516a2;
        }
        throw new zzbhc(abstractC4516a2).a();
    }

    private static AbstractC4516a2 y(AbstractC4516a2 abstractC4516a2, byte[] bArr, int i10, int i11, N1 n12) throws zzbew {
        if (i11 == 0) {
            return abstractC4516a2;
        }
        AbstractC4516a2 abstractC4516a2F = abstractC4516a2.f();
        try {
            J2 j2B = G2.a().b(abstractC4516a2F.getClass());
            j2B.b(abstractC4516a2F, bArr, 0, i11, new C4680p1(n12));
            j2B.zzf(abstractC4516a2F);
            return abstractC4516a2F;
        } catch (zzbew e10) {
            if (e10.a()) {
                throw new zzbew(e10);
            }
            throw e10;
        } catch (zzbhc e11) {
            throw e11.a();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzbew) {
                throw ((zzbew) e12.getCause());
            }
            throw new zzbew(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4614j1
    final int a(J2 j22) {
        if (u()) {
            int iZza = j22.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i10 = this.zzd & MPv3.MAX_MESSAGE_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = j22.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & PduHandle.NONE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4790z2
    public final int b() {
        int iW;
        if (u()) {
            iW = w(null);
            if (iW < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iW);
            }
        } else {
            iW = this.zzd & MPv3.MAX_MESSAGE_ID;
            if (iW == Integer.MAX_VALUE) {
                iW = w(null);
                if (iW < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iW);
                }
                this.zzd = (this.zzd & PduHandle.NONE) | iW;
            }
        }
        return iW;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4790z2
    public final /* synthetic */ InterfaceC4779y2 c() {
        return (W1) v(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4790z2
    public final void d(I1 i12) {
        G2.a().b(getClass()).a(this, J1.u(i12));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return G2.a().b(getClass()).zzk(this, (AbstractC4516a2) obj);
    }

    final AbstractC4516a2 f() {
        return (AbstractC4516a2) v(4, null, null);
    }

    public final int hashCode() {
        if (u()) {
            return z();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iZ = z();
        this.zza = iZ;
        return iZ;
    }

    protected final void n() {
        G2.a().b(getClass()).zzf(this);
        o();
    }

    final void o() {
        this.zzd &= MPv3.MAX_MESSAGE_ID;
    }

    final void q(int i10) {
        this.zzd = (this.zzd & PduHandle.NONE) | MPv3.MAX_MESSAGE_ID;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.A2
    public final /* synthetic */ InterfaceC4790z2 t() {
        return (AbstractC4516a2) v(6, null, null);
    }

    public final String toString() {
        return B2.a(this, super.toString());
    }

    final boolean u() {
        return (this.zzd & PduHandle.NONE) != 0;
    }

    protected abstract Object v(int i10, Object obj, Object obj2);

    final int z() {
        return G2.a().b(getClass()).zzb(this);
    }
}
