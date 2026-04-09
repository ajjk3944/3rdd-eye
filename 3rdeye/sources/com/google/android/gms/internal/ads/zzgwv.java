package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwv;
import com.google.android.gms.internal.ads.zzgww;
import g0.C4356c;
import io.appmetrica.analytics.impl.Oo;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgwv<MessageType extends zzgww<MessageType, BuilderType>, BuilderType extends zzgwv<MessageType, BuilderType>> implements zzhaf {
    private String zza(String str) {
        return Oo.h("Reading ", getClass().getName(), " from a ", str, " threw an IOException (should never happen).");
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzhar) {
                ((zzhar) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            A.a aVar = (Object) list2.get(i);
            if (aVar == null) {
                zzc(list, size2);
            }
            list.add(aVar);
        }
    }

    public static zzhbk zzbb(zzhag zzhagVar) {
        return new zzhbk(zzhagVar);
    }

    @Deprecated
    public static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    public static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzgzi.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzgzs)) {
            if (iterable instanceof zzhap) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzgzs) iterable).zza();
        zzgzs zzgzsVar = (zzgzs) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                String strI = C4356c.i(zzgzsVar.size() - size, "Element at index ", " is null.");
                int size2 = zzgzsVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(strI);
                    }
                    zzgzsVar.remove(size2);
                }
            } else if (obj instanceof zzgxn) {
                zzgzsVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzgxn.zzv(bArr2, 0, bArr2.length);
                zzgzsVar.zzb();
            } else {
                zzgzsVar.add((String) obj);
            }
        }
    }

    private static void zzc(List<?> list, int i) {
        String strI = C4356c.i(list.size() - i, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(strI);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzaP();

    public abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzgxn zzgxnVar) throws zzgzk {
        try {
            zzgxt zzgxtVarZzl = zzgxnVar.zzl();
            zzaR(zzgxtVarZzl);
            zzgxtVarZzl.zzy(0);
            return this;
        } catch (zzgzk e4) {
            throw e4;
        } catch (IOException e10) {
            throw new RuntimeException(zza("ByteString"), e10);
        }
    }

    /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaR(zzgxt zzgxtVar) throws IOException {
        int i = zzgyf.zzb;
        int i10 = zzhaq.zza;
        return (BuilderType) zzaW(zzgxtVar, zzgyf.zza);
    }

    /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaS(zzhag zzhagVar) {
        if (zzbt().getClass().isInstance(zzhagVar)) {
            return (BuilderType) zzaD((zzgww) zzhagVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) throws IOException {
        zzgxt zzgxtVarZzG = zzgxt.zzG(inputStream, 4096);
        zzaR(zzgxtVarZzG);
        zzgxtVarZzG.zzy(0);
        return this;
    }

    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(byte[] bArr) throws zzgzk {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        try {
            zzgxt zzgxtVarZzl = zzgxnVar.zzl();
            zzaW(zzgxtVarZzl, zzgyfVar);
            zzgxtVarZzl.zzy(0);
            return this;
        } catch (zzgzk e4) {
            throw e4;
        } catch (IOException e10) {
            throw new RuntimeException(zza("ByteString"), e10);
        }
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzaW(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException;

    public BuilderType zzaL(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
        zzgxt zzgxtVarZzG = zzgxt.zzG(inputStream, 4096);
        zzaW(zzgxtVarZzG, zzgyfVar);
        zzgxtVarZzG.zzy(0);
        return this;
    }

    /* renamed from: zzaM, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
        return (BuilderType) zzba(bArr, 0, bArr.length, zzgyfVar);
    }

    @Override // 
    /* renamed from: zzaN, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i10) throws zzgzk {
        try {
            zzgxt zzgxtVarZzH = zzgxt.zzH(bArr, i, i10, false);
            zzaR(zzgxtVarZzH);
            zzgxtVarZzH.zzy(0);
            return this;
        } catch (zzgzk e4) {
            throw e4;
        } catch (IOException e10) {
            throw new RuntimeException(zza("byte array"), e10);
        }
    }

    @Override // 
    /* renamed from: zzaO, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr, int i, int i10, zzgyf zzgyfVar) throws zzgzk {
        try {
            zzgxt zzgxtVarZzH = zzgxt.zzH(bArr, i, i10, false);
            zzaW(zzgxtVarZzH, zzgyfVar);
            zzgxtVarZzH.zzy(0);
            return this;
        } catch (zzgzk e4) {
            throw e4;
        } catch (IOException e10) {
            throw new RuntimeException(zza("byte array"), e10);
        }
    }

    public /* bridge */ /* synthetic */ zzhaf zzaQ(zzgxn zzgxnVar) throws zzgzk {
        zzaE(zzgxnVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhaf zzaT(InputStream inputStream) throws IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhaf zzaV(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        zzaJ(zzgxnVar, zzgyfVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhaf zzaX(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
        zzaL(inputStream, zzgyfVar);
        return this;
    }

    public boolean zzbe(InputStream inputStream) throws IOException {
        int i = zzgyf.zzb;
        int i10 = zzhaq.zza;
        return zzbf(inputStream, zzgyf.zza);
    }

    public boolean zzbf(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        zzaL(new zzgwu(inputStream, zzgxt.zzE(i, inputStream)), zzgyfVar);
        return true;
    }
}
