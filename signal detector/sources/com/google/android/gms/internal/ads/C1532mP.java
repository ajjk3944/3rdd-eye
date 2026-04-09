package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.mP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1532mP extends AbstractC1166fi {
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f15618j;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1532mP.a(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final C1703ph k(C1703ph c1703ph) throws C0625Mh {
        int[] iArr = this.i;
        if (iArr == null) {
            return C1703ph.f16196e;
        }
        int i = c1703ph.f16199c;
        if (!Vt.a(i)) {
            throw new C0625Mh("Unhandled input format:", c1703ph);
        }
        int i3 = c1703ph.f16198b;
        boolean z6 = i3 != iArr.length;
        int i6 = 0;
        while (true) {
            int length = iArr.length;
            if (i6 >= length) {
                return z6 ? new C1703ph(c1703ph.f16197a, length, i) : C1703ph.f16196e;
            }
            int i7 = iArr[i6];
            if (i7 >= i3) {
                String string = Arrays.toString(iArr);
                throw new C0625Mh(AbstractC1135f5.n(new StringBuilder(String.valueOf(string).length() + 59), "Channel map (", string, ") trying to access non-existent input channel."), c1703ph);
            }
            z6 |= i7 != i6;
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final void m() {
        this.f15618j = this.i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final void n() {
        this.f15618j = null;
        this.i = null;
    }
}
