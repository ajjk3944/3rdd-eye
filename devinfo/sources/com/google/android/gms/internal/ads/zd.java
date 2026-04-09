package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zd implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19061a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19062b;

    public /* synthetic */ zd(int i4, Object obj) {
        this.f19061a = i4;
        this.f19062b = obj;
    }

    public final void onChecksumsReady(List list) {
        int i4 = this.f19061a;
        int i10 = 0;
        Object obj = this.f19062b;
        switch (i4) {
            case 0:
                if (list == null) {
                    ((d91) obj).e("");
                    break;
                } else {
                    try {
                        int size = list.size();
                        while (i10 < size) {
                            ApkChecksum apkChecksumA = com.applovin.shadow.okio.a.a(list.get(i10));
                            if (apkChecksumA.getType() == 8) {
                                m61 m61VarF = m61.f13779f.f();
                                byte[] value = apkChecksumA.getValue();
                                ((d91) obj).e(m61VarF.g(value.length, value));
                                break;
                            } else {
                                i10++;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    ((d91) obj).e("");
                    break;
                }
            case 1:
                d91 d91Var = (d91) obj;
                if (list == null) {
                    d91Var.e(null);
                    break;
                } else {
                    try {
                        int size2 = list.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            ApkChecksum apkChecksumA2 = com.applovin.shadow.okio.a.a(list.get(i11));
                            if (apkChecksumA2.getType() == 8) {
                                byte[] value2 = apkChecksumA2.getValue();
                                char[] cArr = hf.f11849a;
                                int length = value2.length;
                                char[] cArr2 = new char[length + length];
                                while (i10 < value2.length) {
                                    byte b10 = value2[i10];
                                    char[] cArr3 = hf.f11849a;
                                    int i12 = i10 + i10;
                                    cArr2[i12] = cArr3[(b10 & 255) >>> 4];
                                    cArr2[i12 + 1] = cArr3[b10 & 15];
                                    i10++;
                                }
                                d91Var.e(new String(cArr2));
                                break;
                            }
                        }
                        d91Var.e(null);
                        break;
                    } catch (Throwable unused2) {
                        d91Var.e(null);
                        return;
                    }
                }
            default:
                h3.h hVar = (h3.h) obj;
                if (list == null) {
                    hVar.a("");
                    break;
                } else {
                    try {
                        int size3 = list.size();
                        while (i10 < size3) {
                            ApkChecksum apkChecksumA3 = com.applovin.shadow.okio.a.a(list.get(i10));
                            if (apkChecksumA3.getType() == 8) {
                                m61 m61VarF2 = m61.f13779f.f();
                                byte[] value3 = apkChecksumA3.getValue();
                                hVar.a(m61VarF2.g(value3.length, value3));
                                break;
                            } else {
                                i10++;
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                    hVar.a("");
                    break;
                }
        }
    }

    public zd() {
        this.f19061a = 0;
        this.f19062b = new d91();
    }
}
