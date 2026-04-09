package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwv;
import com.google.android.gms.internal.ads.zzgww;
import io.appmetrica.analytics.impl.Oo;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgww<MessageType extends zzgww<MessageType, BuilderType>, BuilderType extends zzgwv<MessageType, BuilderType>> implements zzhag {
    protected int zzq = 0;

    public static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgwv.zzbd(iterable, list);
    }

    public static void zzaR(zzgxn zzgxnVar) throws IllegalArgumentException {
        if (!zzgxnVar.zzp()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdI(String str) {
        return Oo.h("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    public int zzaM(zzhaz zzhazVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public zzgxn zzaN() {
        try {
            int iZzaY = zzaY();
            zzgxn zzgxnVar = zzgxn.zzb;
            byte[] bArr = new byte[iZzaY];
            int i = zzgya.zzf;
            zzgxw zzgxwVar = new zzgxw(bArr, 0, iZzaY);
            zzcZ(zzgxwVar);
            zzgxwVar.zzF();
            return new zzgxk(bArr);
        } catch (IOException e4) {
            throw new RuntimeException(zzdI("ByteString"), e4);
        }
    }

    public zzhal zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public zzhbk zzaP() {
        return new zzhbk(this);
    }

    public void zzaS(int i) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) throws IOException {
        int iZzaY = zzaY();
        zzgxy zzgxyVar = new zzgxy(outputStream, zzgya.zzB(zzgya.zzD(iZzaY) + iZzaY));
        zzgxyVar.zzu(iZzaY);
        zzcZ(zzgxyVar);
        zzgxyVar.zzK();
    }

    public void zzaU(OutputStream outputStream) throws IOException {
        zzgxy zzgxyVar = new zzgxy(outputStream, zzgya.zzB(zzaY()));
        zzcZ(zzgxyVar);
        zzgxyVar.zzK();
    }

    public byte[] zzaV() {
        try {
            int iZzaY = zzaY();
            byte[] bArr = new byte[iZzaY];
            int i = zzgya.zzf;
            zzgxw zzgxwVar = new zzgxw(bArr, 0, iZzaY);
            zzcZ(zzgxwVar);
            zzgxwVar.zzF();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException(zzdI("byte array"), e4);
        }
    }
}
