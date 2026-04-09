package com.bytedance.sdk.component.fkw.yu.vt;

import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.fkw.vm;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements le {
    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final String ouw() {
        return "data_intercept";
    }

    private static void ouw(com.bytedance.sdk.component.fkw.vt vtVar, com.bytedance.sdk.component.fkw.yu.lh.le leVar, String str, byte[] bArr) {
        if (vtVar == null || !vtVar.le()) {
            return;
        }
        leVar.vt(vtVar).ouw(str, bArr);
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final boolean ouw(com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, th thVar, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        char c9;
        char c10;
        char c11;
        byte[] bArrOuw;
        com.bytedance.sdk.component.fkw.vt vtVar = lhVar.zin;
        com.bytedance.sdk.component.fkw.yu.lh.le leVar = lhVar.qbp;
        byte[] bArrOuw2 = null;
        if (vtVar == null || leVar == null) {
            c9 = 5;
            c10 = 4;
            c11 = 3;
        } else {
            if (vtVar.le()) {
                if (thVar != null) {
                    thVar.ouw("data_cache", lhVar);
                }
                c9 = 5;
                vm vmVarVt = leVar.vt(vtVar);
                c10 = 4;
                bArrOuw = vmVarVt != null ? vmVarVt.ouw(lhVar.f7501lh) : null;
                if (thVar != null) {
                    thVar.ouw("data_cache");
                }
                c11 = 3;
                ko.ouw("PagImageRequest", "step 4-1 Read memory-level data key is", lhVar.f7501lh, "url is ", lhVar.ouw, "imageData is null  ", Boolean.valueOf(bArrOuw == null));
            } else {
                c9 = 5;
                c10 = 4;
                c11 = 3;
                bArrOuw = null;
            }
            if (vtVar.ra() && bArrOuw == null) {
                if (thVar != null) {
                    thVar.ouw("disk_cache", lhVar);
                }
                String str = lhVar.f7501lh;
                leVar.lh(vtVar);
                Collection<com.bytedance.sdk.component.fkw.lh> collectionOuw = leVar.ouw();
                if (collectionOuw != null) {
                    Iterator<com.bytedance.sdk.component.fkw.lh> it = collectionOuw.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        byte[] bArrOuw3 = it.next().ouw((com.bytedance.sdk.component.fkw.lh) str);
                        if (bArrOuw3 != null) {
                            bArrOuw2 = bArrOuw3;
                            break;
                        }
                    }
                }
                if (bArrOuw2 != null) {
                    ouw(lhVar.zin, leVar, lhVar.f7501lh, bArrOuw2);
                }
                if (thVar != null) {
                    thVar.ouw("disk_cache");
                }
                String str2 = lhVar.f7501lh;
                String str3 = lhVar.ouw;
                Boolean boolValueOf = Boolean.valueOf(bArrOuw2 == null);
                Object[] objArr = new Object[6];
                objArr[0] = "step 4-2 Read disk cache key is ";
                objArr[1] = str2;
                objArr[2] = "url is ";
                objArr[c11] = str3;
                objArr[c10] = "imageData is null  ";
                objArr[c9] = boolValueOf;
                ko.ouw("PagImageRequest", objArr);
            } else {
                bArrOuw2 = bArrOuw;
            }
        }
        if (leVar != null && bArrOuw2 == null) {
            if (thVar != null) {
                thVar.ouw("net_request", lhVar);
            }
            bArrOuw2 = ouw(leVar, lhVar, ouwVar);
            String str4 = lhVar.f7501lh;
            String str5 = lhVar.ouw;
            Boolean boolValueOf2 = Boolean.valueOf(bArrOuw2 == null);
            Object[] objArr2 = new Object[6];
            objArr2[0] = "step 4-3 net request cache key is  ";
            objArr2[1] = str4;
            objArr2[2] = "url is ";
            objArr2[c11] = str5;
            objArr2[c10] = " imageData is null ";
            objArr2[c9] = boolValueOf2;
            ko.ouw("PagImageRequest", objArr2);
            if (thVar != null) {
                thVar.ouw("net_request");
            }
        }
        if (bArrOuw2 == null) {
            String str6 = lhVar.f7501lh;
            String str7 = lhVar.ouw;
            Boolean boolValueOf3 = Boolean.valueOf(bArrOuw2 == null);
            Object[] objArr3 = new Object[6];
            objArr3[0] = "step 4-4 net fail cache key is  ";
            objArr3[1] = str6;
            objArr3[2] = "url is ";
            objArr3[c11] = str7;
            objArr3[c10] = " imageData is null ";
            objArr3[c9] = boolValueOf3;
            ko.ouw("PagImageRequest", objArr3);
            return false;
        }
        lhVar.tc = bArrOuw2;
        return true;
    }

    private byte[] ouw(final com.bytedance.sdk.component.fkw.yu.lh.le leVar, com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        if (leVar.yu == null) {
            com.bytedance.sdk.component.fkw.yu yuVarYu = leVar.vt.yu();
            if (yuVarYu == null) {
                yuVarYu = new com.bytedance.sdk.component.fkw.vt.ouw();
            }
            leVar.yu = yuVarYu;
        }
        com.bytedance.sdk.component.fkw.yu yuVar = leVar.yu;
        lhVar.zih = false;
        try {
            com.bytedance.sdk.component.fkw.le leVarOuw = yuVar.ouw(new com.bytedance.sdk.component.fkw.vt.vt(lhVar.ouw, false, false, lhVar.ex));
            if (leVarOuw == null) {
                ouwVar.ouw(TTAdConstant.IMAGE_MODE_CAROUSEL_IMG, "call is empty", new Exception("call is empty"));
                return null;
            }
            int iVt = leVarOuw.vt();
            if (iVt == 200) {
                final byte[] bArr = (byte[]) leVarOuw.lh();
                if (bArr == null) {
                    ouwVar.ouw(iVt, leVarOuw.yu(), new Exception("net data is empty"));
                    return null;
                }
                ouw(lhVar.zin, leVar, lhVar.f7501lh, bArr);
                final com.bytedance.sdk.component.fkw.vt vtVar = lhVar.zin;
                final String str = lhVar.f7501lh;
                if (vtVar != null && vtVar.ra()) {
                    leVar.vt().submit(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.vt.lh.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            leVar.lh(vtVar).ouw(str, bArr);
                        }
                    });
                }
                return bArr;
            }
            Object objLh = leVarOuw.lh();
            ouwVar.ouw(iVt, leVarOuw.yu(), objLh instanceof Throwable ? (Throwable) objLh : null);
            return null;
        } catch (Throwable th2) {
            ouwVar.ouw(TTAdConstant.IMAGE_MODE_CAROUSEL_IMG, "net request failed!", th2);
            return null;
        }
    }
}
