package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyp;
import com.google.android.gms.internal.ads.zzgyv;
import g0.C4356c;
import io.appmetrica.analytics.impl.Oo;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgyv<MessageType extends zzgyv<MessageType, BuilderType>, BuilderType extends zzgyp<MessageType, BuilderType>> extends zzgww<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzgyv<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhbm zzt = zzhbm.zzc();

    public static zzgyx zzbA() {
        return zzgxd.zzd();
    }

    public static zzgyx zzbB(zzgyx zzgyxVar) {
        int size = zzgyxVar.size();
        return zzgyxVar.zzf(size + size);
    }

    public static zzgyy zzbC() {
        return zzgyc.zze();
    }

    public static zzgyy zzbD(zzgyy zzgyyVar) {
        int size = zzgyyVar.size();
        return zzgyyVar.zzf(size + size);
    }

    public static zzgzc zzbE() {
        return zzgym.zze();
    }

    public static zzgzc zzbF(zzgzc zzgzcVar) {
        int size = zzgzcVar.size();
        return zzgzcVar.zzf(size + size);
    }

    public static zzgzd zzbG() {
        return zzgyw.zzg();
    }

    public static zzgzd zzbH(zzgzd zzgzdVar) {
        int size = zzgzdVar.size();
        return zzgzdVar.zzf(size + size);
    }

    public static zzgzg zzbI() {
        return zzgzv.zzh();
    }

    public static zzgzg zzbJ(zzgzg zzgzgVar) {
        int size = zzgzgVar.size();
        return zzgzgVar.zzf(size + size);
    }

    public static <E> zzgzh<E> zzbK() {
        return zzhar.zzd();
    }

    public static <E> zzgzh<E> zzbL(zzgzh<E> zzgzhVar) {
        int size = zzgzhVar.size();
        return zzgzhVar.zzf(size + size);
    }

    public static Object zzbP(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzbQ(zzhag zzhagVar, String str, Object[] objArr) {
        return new zzhas(zzhagVar, str, objArr);
    }

    public static Method zzbR(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(Oo.h("Generated message class \"", cls.getName(), "\" missing method \"", str, "\"."), e4);
        }
    }

    public static <T extends zzgyv> void zzbZ(Class<T> cls, T t10) {
        t10.zzbV();
        zzc.put(cls, t10);
    }

    public static <ContainingType extends zzhag, Type> zzgyt<ContainingType, Type> zzbe(ContainingType containingtype, zzhag zzhagVar, zzgza zzgzaVar, int i, zzhby zzhbyVar, boolean z10, Class cls) {
        return new zzgyt<>(containingtype, zzhar.zzd(), zzhagVar, new zzgys(zzgzaVar, i, zzhbyVar, true, z10), cls);
    }

    public static <ContainingType extends zzhag, Type> zzgyt<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzhag zzhagVar, zzgza zzgzaVar, int i, zzhby zzhbyVar, Class cls) {
        return new zzgyt<>(containingtype, type, zzhagVar, new zzgys(zzgzaVar, i, zzhbyVar, false, false), cls);
    }

    public static <T extends zzgyv> T zzbh(Class<T> cls) throws ClassNotFoundException {
        zzgyv<?, ?> zzgyvVar = zzc.get(cls);
        if (zzgyvVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgyvVar = zzc.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (zzgyvVar != null) {
            return zzgyvVar;
        }
        zzgyv<?, ?> zzgyvVarZzbt = ((zzgyv) zzhbs.zzg(cls)).zzbt();
        if (zzgyvVarZzbt == null) {
            throw new IllegalStateException();
        }
        zzc.put(cls, zzgyvVarZzbt);
        return zzgyvVarZzbt;
    }

    public static <T extends zzgyv<T, ?>> T zzbk(T t10, InputStream inputStream) throws zzgzk {
        int i = zzgyf.zzb;
        int i10 = zzhaq.zza;
        T t11 = (T) zzg(t10, inputStream, zzgyf.zza);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbl(T t10, InputStream inputStream, zzgyf zzgyfVar) throws zzgzk {
        T t11 = (T) zzg(t10, inputStream, zzgyfVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbm(T t10, zzgxn zzgxnVar) throws zzgzk {
        int i = zzgyf.zzb;
        int i10 = zzhaq.zza;
        T t11 = (T) zzbr(t10, zzgxnVar, zzgyf.zza);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbn(T t10, zzgxt zzgxtVar) throws zzgzk {
        int i = zzgyf.zzb;
        int i10 = zzhaq.zza;
        return (T) zzbs(t10, zzgxtVar, zzgyf.zza);
    }

    public static <T extends zzgyv<T, ?>> T zzbo(T t10, InputStream inputStream) throws zzgzk {
        zzgxt zzgxtVarZzG = zzgxt.zzG(inputStream, 4096);
        int i = zzgyf.zzb;
        int i10 = zzhaq.zza;
        T t11 = (T) zzbz(t10, zzgxtVarZzG, zzgyf.zza);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbp(T t10, ByteBuffer byteBuffer) throws zzgzk {
        int i = zzgyf.zzb;
        int i10 = zzhaq.zza;
        return (T) zzbv(t10, byteBuffer, zzgyf.zza);
    }

    public static <T extends zzgyv<T, ?>> T zzbq(T t10, byte[] bArr) throws zzgzk {
        int length = bArr.length;
        int i = zzgyf.zzb;
        int i10 = zzhaq.zza;
        T t11 = (T) zzi(t10, bArr, 0, length, zzgyf.zza);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbr(T t10, zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        T t11 = (T) zzh(t10, zzgxnVar, zzgyfVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbs(T t10, zzgxt zzgxtVar, zzgyf zzgyfVar) throws zzgzk {
        T t11 = (T) zzbz(t10, zzgxtVar, zzgyfVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbu(T t10, InputStream inputStream, zzgyf zzgyfVar) throws zzgzk {
        T t11 = (T) zzbz(t10, zzgxt.zzG(inputStream, 4096), zzgyfVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbv(T t10, ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
        zzgxt zzgxtVarZzH;
        boolean z10 = false;
        if (byteBuffer.hasArray()) {
            zzgxtVarZzH = zzgxt.zzH(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhbs.zzB()) {
            zzgxtVarZzH = new zzgxr(byteBuffer, z10, null);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzgxtVarZzH = zzgxt.zzH(bArr, 0, iRemaining, true);
        }
        T t11 = (T) zzbs(t10, zzgxtVarZzH, zzgyfVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzbx(T t10, byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
        T t11 = (T) zzi(t10, bArr, 0, bArr.length, zzgyfVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyv<T, ?>> T zzby(T t10, zzgxt zzgxtVar) throws zzgzk {
        int i = zzgyf.zzb;
        int i10 = zzhaq.zza;
        return (T) zzbz(t10, zzgxtVar, zzgyf.zza);
    }

    public static <T extends zzgyv<T, ?>> T zzbz(T t10, zzgxt zzgxtVar, zzgyf zzgyfVar) throws zzgzk {
        T t11 = (T) t10.zzbj();
        try {
            zzhaz zzhazVarZzb = zzhaq.zza().zzb(t11.getClass());
            zzhazVarZzb.zzh(t11, zzgxu.zzq(zzgxtVar), zzgyfVar);
            zzhazVarZzb.zzf(t11);
            return t11;
        } catch (zzgzk e4) {
            if (e4.zzb()) {
                throw new zzgzk(e4);
            }
            throw e4;
        } catch (zzhbk e10) {
            throw e10.zza();
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzgzk) {
                throw ((zzgzk) e11.getCause());
            }
            throw new zzgzk(e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzgzk) {
                throw ((zzgzk) e12.getCause());
            }
            throw e12;
        }
    }

    private int zzc(zzhaz<?> zzhazVar) {
        if (zzhazVar != null) {
            return zzhazVar.zza(this);
        }
        return zzhaq.zza().zzb(getClass()).zza(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzgyr<MessageType, BuilderType>, BuilderType, T> zzgyt<MessageType, T> zzd(zzgyd<MessageType, T> zzgydVar) {
        return (zzgyt) zzgydVar;
    }

    private static <T extends zzgyv<T, ?>> T zzf(T t10) throws zzgzk {
        if (t10 == null || t10.zzbw()) {
            return t10;
        }
        throw t10.zzaP().zza();
    }

    private static <T extends zzgyv<T, ?>> T zzg(T t10, InputStream inputStream, zzgyf zzgyfVar) throws IOException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            zzgxt zzgxtVarZzG = zzgxt.zzG(new zzgwu(inputStream, zzgxt.zzE(i, inputStream)), 4096);
            T t11 = (T) zzbz(t10, zzgxtVarZzG, zzgyfVar);
            zzgxtVarZzG.zzy(0);
            return t11;
        } catch (zzgzk e4) {
            if (e4.zzb()) {
                throw new zzgzk(e4);
            }
            throw e4;
        } catch (IOException e10) {
            throw new zzgzk(e10);
        }
    }

    private static <T extends zzgyv<T, ?>> T zzh(T t10, zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        zzgxt zzgxtVarZzl = zzgxnVar.zzl();
        T t11 = (T) zzbz(t10, zzgxtVarZzl, zzgyfVar);
        zzgxtVarZzl.zzy(0);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzgyv<T, ?>> T zzi(T t10, byte[] bArr, int i, int i10, zzgyf zzgyfVar) throws zzgzk {
        if (i10 == 0) {
            return t10;
        }
        T t11 = (T) t10.zzbj();
        try {
            zzhaz zzhazVarZzb = zzhaq.zza().zzb(t11.getClass());
            zzhazVarZzb.zzi(t11, bArr, i, i + i10, new zzgxb(zzgyfVar));
            zzhazVarZzb.zzf(t11);
            return t11;
        } catch (zzgzk e4) {
            if (e4.zzb()) {
                throw new zzgzk(e4);
            }
            throw e4;
        } catch (zzhbk e10) {
            throw e10.zza();
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzgzk) {
                throw ((zzgzk) e11.getCause());
            }
            throw new zzgzk(e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private void zzj() {
        if (this.zzt == zzhbm.zzc()) {
            this.zzt = zzhbm.zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzgyv<T, ?>> boolean zzk(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.zzdd(zzgyu.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzhaq.zza().zzb(t10.getClass()).zzl(t10);
        if (z10) {
            t10.zzdd(zzgyu.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t10, null);
        }
        return zZzl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhaq.zza().zzb(getClass()).zzk(this, (zzgyv) obj);
    }

    public int hashCode() {
        if (zzcd()) {
            return zzaW();
        }
        if (zzcc()) {
            zzca(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzhai.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public int zzaL() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public int zzaM(zzhaz zzhazVar) {
        if (zzcd()) {
            int iZzc = zzc(zzhazVar);
            if (iZzc >= 0) {
                return iZzc;
            }
            throw new IllegalStateException(C4356c.h(iZzc, "serialized size must be non-negative, was "));
        }
        if (zzaL() != Integer.MAX_VALUE) {
            return zzaL();
        }
        int iZzc2 = zzc(zzhazVar);
        zzaS(iZzc2);
        return iZzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public zzhal zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public void zzaS(int i) {
        if (i < 0) {
            throw new IllegalStateException(C4356c.h(i, "serialized size must be non-negative, was "));
        }
        this.zzd = i | (this.zzd & Integer.MIN_VALUE);
    }

    public int zzaW() {
        return zzhaq.zza().zzb(getClass()).zzb(this);
    }

    public int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public int zzaY() {
        return zzaM(null);
    }

    public final <MessageType2 extends zzgyv<MessageType2, BuilderType2>, BuilderType2 extends zzgyp<MessageType2, BuilderType2>> BuilderType2 zzaZ() {
        return (BuilderType2) zzdd(zzgyu.NEW_BUILDER, null, null);
    }

    public final zzhao<MessageType> zzbN() {
        return (zzhao) zzdd(zzgyu.GET_PARSER, null, null);
    }

    public Object zzbO() throws Exception {
        return zzdd(zzgyu.BUILD_MESSAGE_INFO, null, null);
    }

    public void zzbS() {
        this.zzq = 0;
    }

    public void zzbT() {
        zzaS(Integer.MAX_VALUE);
    }

    public void zzbU() {
        zzhaq.zza().zzb(getClass()).zzf(this);
        zzbV();
    }

    public void zzbV() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public void zzbW(int i, zzgxn zzgxnVar) {
        zzj();
        zzhbm zzhbmVar = this.zzt;
        zzhbmVar.zzg();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhbmVar.zzj((i << 3) | 2, zzgxnVar);
    }

    public final void zzbX(zzhbm zzhbmVar) {
        this.zzt = zzhbm.zze(this.zzt, zzhbmVar);
    }

    public void zzbY(int i, int i10) {
        zzj();
        zzhbm zzhbmVar = this.zzt;
        zzhbmVar.zzg();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhbmVar.zzj(i << 3, Long.valueOf(i10));
    }

    public final <MessageType2 extends zzgyv<MessageType2, BuilderType2>, BuilderType2 extends zzgyp<MessageType2, BuilderType2>> BuilderType2 zzba(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzaZ();
        buildertype2.zzbj(messagetype2);
        return buildertype2;
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdd(zzgyu.NEW_BUILDER, null, null);
    }

    /* renamed from: zzbc, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzbM() {
        BuilderType buildertype = (BuilderType) zzdd(zzgyu.NEW_BUILDER, null, null);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    /* renamed from: zzbi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbt() {
        return (MessageType) zzdd(zzgyu.GET_DEFAULT_INSTANCE, null, null);
    }

    public MessageType zzbj() {
        return (MessageType) zzdd(zzgyu.NEW_MUTABLE_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final boolean zzbw() {
        return zzk(this, true);
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public void zzcZ(zzgya zzgyaVar) throws IOException {
        zzhaq.zza().zzb(getClass()).zzj(this, zzgyb.zza(zzgyaVar));
    }

    public void zzca(int i) {
        this.zzq = i;
    }

    public boolean zzcc() {
        return zzaX() == 0;
    }

    public boolean zzcd() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public boolean zzce(int i, zzgxt zzgxtVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzm(i, zzgxtVar);
    }

    public abstract Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2);
}
