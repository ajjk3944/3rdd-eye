package com.bytedance.sdk.component.bw.dg.ypw;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.bw.dg.xq.ypw.emc;
import com.bytedance.sdk.component.bw.yzg;
import com.bytedance.sdk.component.utils.gbl;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* loaded from: classes.dex */
public class dg<T> implements ycc {
    private void ypw(final com.bytedance.sdk.component.bw.dg.xq.xq xqVar, final byte[] bArr, final com.bytedance.sdk.component.bw.dg.xq.emc emcVar) {
        try {
            new com.bytedance.sdk.component.bw.dg.xq.ypw.emc().emc(bArr, xqVar.aa(), new emc.InterfaceC0030emc() { // from class: com.bytedance.sdk.component.bw.dg.ypw.dg.2
                @Override // com.bytedance.sdk.component.bw.dg.xq.ypw.emc.InterfaceC0030emc
                public void emc(Drawable drawable) {
                    emcVar.emc(new com.bytedance.sdk.component.bw.dg.xq.dg().emc(xqVar, drawable, null, true));
                }

                @Override // com.bytedance.sdk.component.bw.dg.xq.ypw.emc.InterfaceC0030emc
                public void emc() {
                    emcVar.emc(BackupConstant.SCENE_BACKUP_RENDER_FAIL, "decode gif fail", new Exception("decode gif fail"));
                }

                @Override // com.bytedance.sdk.component.bw.dg.xq.ypw.emc.InterfaceC0030emc
                public void emc(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.ycc.emc(bArr)) {
                        dg.this.emc(xqVar, bArr, true, emcVar);
                    } else {
                        emcVar.emc(BackupConstant.SCENE_RENDER_FAIL, "result type is gif but data not image", new Exception("gif not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            emcVar.emc(2000, "decode gif error", th);
        }
    }

    @Override // com.bytedance.sdk.component.bw.dg.ypw.ycc
    public boolean emc(com.bytedance.sdk.component.bw.dg.xq.xq xqVar, yzg yzgVar, com.bytedance.sdk.component.bw.dg.xq.emc emcVar) {
        byte[] bArrQh = xqVar.qh();
        if (bArrQh == null) {
            emcVar.emc(2000, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        int iSup = xqVar.sup();
        xqVar.emc(bArrQh.length);
        if (iSup == 2) {
            boolean z6 = (com.bytedance.sdk.component.utils.ycc.ypw(bArrQh) || gbl.emc(bArrQh, 0)) ? false : true;
            if (com.bytedance.sdk.component.utils.ycc.emc(bArrQh)) {
                emc(xqVar, bArrQh, z6, emcVar);
            } else {
                emcVar.emc(BackupConstant.SCENE_RENDER_FAIL, "result type is bit but data not image", new Exception("not image format"));
            }
        } else if (iSup == 3) {
            emcVar.emc(new com.bytedance.sdk.component.bw.dg.xq.dg().emc(xqVar, bArrQh, null, com.bytedance.sdk.component.utils.ycc.ypw(bArrQh)));
        } else if (com.bytedance.sdk.component.utils.ycc.ypw(bArrQh)) {
            ypw(xqVar, bArrQh, emcVar);
        } else if (gbl.emc(bArrQh, 0)) {
            emc(xqVar, bArrQh, emcVar);
        } else if (com.bytedance.sdk.component.utils.ycc.emc(bArrQh)) {
            emc(xqVar, bArrQh, true, emcVar);
        } else {
            emcVar.emc(BackupConstant.SCENE_RENDER_FAIL, "is not supprot image type", new Exception("not supprot image type"));
        }
        return false;
    }

    private void emc(final com.bytedance.sdk.component.bw.dg.xq.xq xqVar, final byte[] bArr, final com.bytedance.sdk.component.bw.dg.xq.emc emcVar) {
        try {
            new com.bytedance.sdk.component.bw.dg.xq.ypw.emc().emc(bArr, new emc.InterfaceC0030emc() { // from class: com.bytedance.sdk.component.bw.dg.ypw.dg.1
                @Override // com.bytedance.sdk.component.bw.dg.xq.ypw.emc.InterfaceC0030emc
                public void emc(Drawable drawable) {
                    emcVar.emc(new com.bytedance.sdk.component.bw.dg.xq.dg().emc(xqVar, drawable, null, false));
                }

                @Override // com.bytedance.sdk.component.bw.dg.xq.ypw.emc.InterfaceC0030emc
                public void emc() {
                    emcVar.emc(BackupConstant.SCENE_BACKUP_RENDER_FAIL, "decode webp animate fail", new Exception("decode webp animate fail"));
                }

                @Override // com.bytedance.sdk.component.bw.dg.xq.ypw.emc.InterfaceC0030emc
                public void emc(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.ycc.emc(bArr)) {
                        dg.this.emc(xqVar, bArr, true, emcVar);
                    } else {
                        emcVar.emc(BackupConstant.SCENE_RENDER_FAIL, "result type is webp animated but data not image", new Exception("webp animated not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            emcVar.emc(2000, "decode webp animation error", th);
        }
    }

    @Override // com.bytedance.sdk.component.bw.dg.ypw.ycc
    public String emc() {
        return "decode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.component.bw.dg.xq.xq xqVar, byte[] bArr, boolean z6, com.bytedance.sdk.component.bw.dg.xq.emc emcVar) {
        try {
            com.bytedance.sdk.component.bw.dg.xq.ycc yccVarAa = xqVar.aa();
            Bitmap bitmapEmc = yccVarAa.emc(xqVar).emc(bArr);
            if (bitmapEmc != null) {
                xqVar.ru();
                xqVar.emc();
                bitmapEmc.getWidth();
                bitmapEmc.getHeight();
                bitmapEmc.getByteCount();
                emcVar.emc(new com.bytedance.sdk.component.bw.dg.xq.dg().emc(xqVar, bitmapEmc, null, false));
                if (z6) {
                    emc(xqVar.sba(), yccVarAa, xqVar.ru(), bitmapEmc);
                    return;
                }
                return;
            }
            xqVar.ru();
            xqVar.emc();
            emcVar.emc(BackupConstant.SCENE_BACKUP_RENDER_FAIL, "decode failed bitmap null", new Exception("decode failed bitmap null"));
        } catch (Throwable th) {
            xqVar.ru();
            xqVar.emc();
            emcVar.emc(BackupConstant.SCENE_BACKUP_RENDER_FAIL, "decode failed:" + th.getMessage(), th);
        }
    }

    private void emc(com.bytedance.sdk.component.bw.ypw ypwVar, com.bytedance.sdk.component.bw.dg.xq.ycc yccVar, String str, Bitmap bitmap) {
        if (ypwVar == null || yccVar == null || !ypwVar.bw()) {
            return;
        }
        yccVar.emc(ypwVar).emc(str, bitmap);
    }
}
