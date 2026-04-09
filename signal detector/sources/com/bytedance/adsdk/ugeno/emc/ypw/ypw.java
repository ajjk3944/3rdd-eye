package com.bytedance.adsdk.ugeno.emc.ypw;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.emc.bw;
import com.bytedance.adsdk.ugeno.uym.msw;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class ypw extends emc {

    /* renamed from: com.bytedance.adsdk.ugeno.emc.ypw.ypw$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[bw.values().length];
            emc = iArr;
            try {
                iArr[bw.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[bw.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                emc[bw.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                emc[bw.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                emc[bw.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                emc[bw.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                emc[bw.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                emc[bw.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                emc[bw.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ypw(Context context, com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, TreeMap<Float, String> treeMap) {
        super(context, xqVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.emc.ypw.emc
    public void emc(float f2, String str) {
        this.bw.add(Keyframe.ofFloat(f2, (this.ypw.startsWith(bw.TRANSLATE.emc()) || this.dg == bw.BORDER_RADIUS) ? msw.emc(this.emc, com.bytedance.adsdk.ugeno.uym.xq.emc(str, 0.0f)) : com.bytedance.adsdk.ugeno.uym.xq.emc(str, 0.0f)));
    }

    @Override // com.bytedance.adsdk.ugeno.emc.ypw.emc
    public TypeEvaluator ycc() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.emc.ypw.emc
    public void ypw() {
        float fCf;
        switch (AnonymousClass1.emc[this.dg.ordinal()]) {
            case 1:
                fCf = this.uym.cf();
                break;
            case 2:
                fCf = this.uym.vk();
                break;
            case 3:
                fCf = this.uym.aa();
                break;
            case 4:
                fCf = this.uym.sba();
                break;
            case 5:
                fCf = this.uym.yzg();
                if (this.uym.gbl() != null) {
                    this.uym.gbl().setCameraDistance(10000.0f);
                    break;
                }
                break;
            case 6:
                fCf = this.uym.ul();
                if (this.uym.gbl() != null) {
                    this.uym.gbl().setCameraDistance(10000.0f);
                    break;
                }
                break;
            case 7:
                fCf = this.uym.ylm();
                break;
            case 8:
                fCf = this.uym.sra();
                break;
            case 9:
                fCf = this.uym.rie();
                break;
            default:
                fCf = 0.0f;
                break;
        }
        this.bw.add(Keyframe.ofFloat(0.0f, fCf));
    }
}
