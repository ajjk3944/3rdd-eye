package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.oE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1629oE implements VD {

    /* renamed from: a, reason: collision with root package name */
    public final C1255hG f15920a;

    @Override // com.google.android.gms.internal.ads.VD
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f15920a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((C1575nE) it.next()).f15759a.a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
