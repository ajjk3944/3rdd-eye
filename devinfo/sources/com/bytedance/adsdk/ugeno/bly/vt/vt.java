package com.bytedance.adsdk.ugeno.bly.vt;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.vt.ouw;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt extends com.bytedance.adsdk.ugeno.vt.ouw<com.bytedance.adsdk.ugeno.bly.vt.ouw> {
    private com.bytedance.adsdk.ugeno.bly.vt.ouw ln;

    public vt(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final ouw.C0036ouw bly() {
        return new ouw(this);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        com.bytedance.adsdk.ugeno.bly.vt.ouw ouwVar = new com.bytedance.adsdk.ugeno.bly.vt.ouw(this.vt);
        this.ln = ouwVar;
        ouwVar.ouw = this;
        return ouwVar;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() throws JSONException {
        this.ln.setEventMap(this.mwe);
        super.vt();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw extends ouw.C0036ouw {
        protected int ksc;

        public ouw(com.bytedance.adsdk.ugeno.vt.ouw ouwVar) {
            super(ouwVar);
            this.ksc = -1;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00a0 A[SYNTHETIC] */
        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0036ouw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void ouw(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
            /*
                r8 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r10)
                if (r0 == 0) goto L8
                goto La7
            L8:
                super.ouw(r9, r10, r11)
                java.lang.String r9 = "layoutGravity"
                boolean r9 = android.text.TextUtils.equals(r10, r9)
                if (r9 == 0) goto La7
                boolean r9 = android.text.TextUtils.isEmpty(r11)
                r10 = -1
                if (r9 == 0) goto L1c
                goto La5
            L1c:
                java.lang.String r9 = "\\|"
                java.lang.String[] r9 = r11.split(r9)
                if (r9 == 0) goto La5
                int r11 = r9.length
                if (r11 > 0) goto L29
                goto La5
            L29:
                int r11 = r9.length
                r0 = 0
                r1 = r0
                r2 = r1
            L2d:
                if (r1 >= r11) goto La4
                r3 = r9[r1]
                r3.getClass()
                int r4 = r3.hashCode()
                r5 = 5
                r6 = 3
                r7 = 1
                switch(r4) {
                    case -1383228885: goto L82;
                    case -1364013995: goto L77;
                    case -348726240: goto L6c;
                    case 115029: goto L61;
                    case 3317767: goto L56;
                    case 108511772: goto L4b;
                    case 1063616078: goto L40;
                    default: goto L3e;
                }
            L3e:
                r3 = r10
                goto L8c
            L40:
                java.lang.String r4 = "center_horizontal"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L49
                goto L3e
            L49:
                r3 = 6
                goto L8c
            L4b:
                java.lang.String r4 = "right"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L54
                goto L3e
            L54:
                r3 = r5
                goto L8c
            L56:
                java.lang.String r4 = "left"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L5f
                goto L3e
            L5f:
                r3 = 4
                goto L8c
            L61:
                java.lang.String r4 = "top"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L6a
                goto L3e
            L6a:
                r3 = r6
                goto L8c
            L6c:
                java.lang.String r4 = "center_vertical"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L75
                goto L3e
            L75:
                r3 = 2
                goto L8c
            L77:
                java.lang.String r4 = "center"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L80
                goto L3e
            L80:
                r3 = r7
                goto L8c
            L82:
                java.lang.String r4 = "bottom"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L8b
                goto L3e
            L8b:
                r3 = r0
            L8c:
                switch(r3) {
                    case 0: goto L9e;
                    case 1: goto L9b;
                    case 2: goto L98;
                    case 3: goto L95;
                    case 4: goto L93;
                    case 5: goto La0;
                    case 6: goto L91;
                    default: goto L8f;
                }
            L8f:
                r5 = r10
                goto La0
            L91:
                r5 = r7
                goto La0
            L93:
                r5 = r6
                goto La0
            L95:
                r5 = 48
                goto La0
            L98:
                r5 = 16
                goto La0
            L9b:
                r5 = 17
                goto La0
            L9e:
                r5 = 80
            La0:
                r2 = r2 | r5
                int r1 = r1 + 1
                goto L2d
            La4:
                r10 = r2
            La5:
                r8.ksc = r10
            La7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bly.vt.vt.ouw.ouw(android.content.Context, java.lang.String, java.lang.String):void");
        }

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0036ouw
        public final /* synthetic */ ViewGroup.LayoutParams ouw() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.ouw, (int) this.vt);
            layoutParams.leftMargin = (int) this.f6977le;
            layoutParams.rightMargin = (int) this.ra;
            layoutParams.topMargin = (int) this.pno;
            layoutParams.bottomMargin = (int) this.bly;
            layoutParams.gravity = this.ksc;
            return layoutParams;
        }
    }
}
