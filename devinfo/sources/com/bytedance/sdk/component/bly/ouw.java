package com.bytedance.sdk.component.bly;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.component.utils.bly;
import com.bytedance.sdk.component.utils.cd;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends lh implements jae.ouw {
    private volatile float bly;
    private final List<Integer> fkw;

    /* renamed from: jg, reason: collision with root package name */
    private int f7434jg;

    /* renamed from: le, reason: collision with root package name */
    private final int f7435le;

    /* renamed from: lh, reason: collision with root package name */
    private final int f7436lh;
    private long mwh;
    private volatile float pno;
    private View.OnTouchListener qbp;
    private final Context ra;
    private long ryl;

    /* renamed from: th, reason: collision with root package name */
    private float f7437th;
    private float vm;
    String vt;
    private final int yu;
    private boolean zih;
    private float tlj = -1.0f;

    /* renamed from: cf, reason: collision with root package name */
    private float f7433cf = -1.0f;
    private final Handler rn = new jae(bly.ouw().getLooper(), this);
    InterfaceC0049ouw ouw = new InterfaceC0049ouw() { // from class: com.bytedance.sdk.component.bly.ouw.1
        @Override // com.bytedance.sdk.component.bly.ouw.InterfaceC0049ouw
        public final void ouw() {
            if (ouw.this.tlj == -1.0f && ouw.this.f7433cf == -1.0f && ouw.this.mwh == -1) {
                ko.ouw("arbitrage_click", "first trigger triggerJump()", ", mTriggerX: ", Float.valueOf(ouw.this.tlj), ", mTriggerY: ", Float.valueOf(ouw.this.f7433cf));
                ouw ouwVar = ouw.this;
                ouwVar.tlj = ouwVar.pno;
                ouw ouwVar2 = ouw.this;
                ouwVar2.f7433cf = ouwVar2.bly;
                ouw ouwVar3 = ouw.this;
                ouwVar3.mwh = ouwVar3.ryl;
                ouw.ra(ouw.this);
            }
            ko.ouw("arbitrage_click", "everytime trigger triggerJump()", ", mTriggerX: ", Float.valueOf(ouw.this.tlj), ", mTriggerY: ", Float.valueOf(ouw.this.f7433cf));
        }

        @Override // com.bytedance.sdk.component.bly.ouw.InterfaceC0049ouw
        public final void vt() {
            ko.vt("arbitrage_click", "trigger onPageFinished() in ArbitrageOnTouchListener");
        }

        @Override // com.bytedance.sdk.component.bly.ouw.InterfaceC0049ouw
        public final void ouw(int i4) {
            ouw.this.f7434jg = i4;
            ouw.this.ouw();
            ko.vt("arbitrage_click", "trigger onPageStarted() in ArbitrageOnTouchListener");
        }
    };
    private int zin = -1;
    private final List<Integer> ko = new ArrayList();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.bly.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0049ouw {
        void ouw();

        void ouw(int i4);

        void vt();
    }

    public ouw(Context context, int i4, int i10, List<Integer> list, int i11) {
        this.ra = context;
        if (i4 == -1) {
            this.f7436lh = cd.ouw(context);
        } else {
            this.f7436lh = cd.ouw(context, i4);
        }
        this.yu = cd.ouw(context, i10);
        this.fkw = list;
        this.f7435le = i11;
    }

    public static /* synthetic */ boolean ra(ouw ouwVar) {
        ouwVar.zih = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0054  */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.bly.ouw.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.bytedance.sdk.component.bly.lh
    public final void ouw(View.OnTouchListener onTouchListener) {
        this.qbp = onTouchListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw() {
        this.tlj = -1.0f;
        this.f7433cf = -1.0f;
        this.mwh = -1L;
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        int i4 = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i4 == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.zih ? 1 : 0);
                    this.zih = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw != null) {
                com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw.ouw(this.vt, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
