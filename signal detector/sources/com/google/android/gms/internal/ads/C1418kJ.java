package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.kJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1418kJ implements InterfaceC1199gE {

    /* renamed from: a, reason: collision with root package name */
    public final C1255hG f15107a;

    public C1418kJ(C1255hG c1255hG) {
        this.f15107a = c1255hG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1199gE
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f15107a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((C1364jJ) it.next()).f14929a.a(bArr, bArr2);
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
