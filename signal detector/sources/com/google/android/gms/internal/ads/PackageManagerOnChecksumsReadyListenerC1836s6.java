package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.s6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class PackageManagerOnChecksumsReadyListenerC1836s6 implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16682a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16683b;

    public /* synthetic */ PackageManagerOnChecksumsReadyListenerC1836s6(int i, Object obj) {
        this.f16682a = i;
        this.f16683b = obj;
    }

    public final void onChecksumsReady(List list) {
        int i = this.f16682a;
        int i3 = 0;
        Object obj = this.f16683b;
        switch (i) {
            case 0:
                if (list == null) {
                    ((PD) obj).d("");
                    break;
                } else {
                    try {
                        int size = list.size();
                        while (i3 < size) {
                            ApkChecksum apkChecksumE = U4.n.e(list.get(i3));
                            if (apkChecksumE.getType() == 8) {
                                C2166yC c2166yCF = C2166yC.f17693f.f();
                                byte[] value = apkChecksumE.getValue();
                                ((PD) obj).d(c2166yCF.g(value.length, value));
                                break;
                            } else {
                                i3++;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    ((PD) obj).d("");
                    break;
                }
            case 1:
                PD pd = (PD) obj;
                if (list == null) {
                    pd.d(null);
                    break;
                } else {
                    try {
                        int size2 = list.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            ApkChecksum apkChecksumE2 = U4.n.e(list.get(i6));
                            if (apkChecksumE2.getType() == 8) {
                                byte[] value2 = apkChecksumE2.getValue();
                                char[] cArr = Z6.f12791a;
                                int length = value2.length;
                                char[] cArr2 = new char[length + length];
                                while (i3 < value2.length) {
                                    byte b5 = value2[i3];
                                    char[] cArr3 = Z6.f12791a;
                                    int i7 = i3 + i3;
                                    cArr2[i7] = cArr3[(b5 & 255) >>> 4];
                                    cArr2[i7 + 1] = cArr3[b5 & 15];
                                    i3++;
                                }
                                pd.d(new String(cArr2));
                                break;
                            }
                        }
                        pd.d(null);
                        break;
                    } catch (Throwable unused2) {
                        pd.d(null);
                        return;
                    }
                }
            default:
                w.h hVar = (w.h) obj;
                if (list == null) {
                    hVar.a("");
                    break;
                } else {
                    try {
                        int size3 = list.size();
                        while (i3 < size3) {
                            ApkChecksum apkChecksumE3 = U4.n.e(list.get(i3));
                            if (apkChecksumE3.getType() == 8) {
                                C2166yC c2166yCF2 = C2166yC.f17693f.f();
                                byte[] value3 = apkChecksumE3.getValue();
                                hVar.a(c2166yCF2.g(value3.length, value3));
                                break;
                            } else {
                                i3++;
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                    hVar.a("");
                    break;
                }
        }
    }

    public PackageManagerOnChecksumsReadyListenerC1836s6() {
        this.f16682a = 0;
        this.f16683b = new PD();
    }
}
