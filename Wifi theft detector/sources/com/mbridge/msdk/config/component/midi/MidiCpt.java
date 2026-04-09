package com.mbridge.msdk.config.component.midi;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.e0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.midi.monitor.c;
import com.mbridge.msdk.config.dynamic.baseview.cusview.CusPlayerView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MidiCpt extends com.mbridge.msdk.config.component.base.a implements com.mbridge.msdk.config.component.vc.inter.a, d {

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.model.a f13565h;

    /* renamed from: i, reason: collision with root package name */
    private CusPlayerView f13566i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.a f13567j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.a f13568k;

    /* renamed from: l, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.b f13569l;

    /* renamed from: m, reason: collision with root package name */
    private c f13570m;

    /* renamed from: q, reason: collision with root package name */
    private String f13574q;

    /* renamed from: n, reason: collision with root package name */
    private int f13571n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f13572o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f13573p = 0;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13575r = false;

    public class a implements com.mbridge.msdk.config.component.midi.monitor.a {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(String str) {
            MidiCpt.this.f13574q = str;
            MidiCpt.this.j();
            MidiCpt.this.g();
        }

        @Override // com.mbridge.msdk.config.component.midi.monitor.a
        public void b(final String str) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.midi.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13578a.c(str);
                }
            });
        }

        @Override // com.mbridge.msdk.config.component.midi.monitor.a
        public void a(String str) {
            MidiCpt.this.a("904010", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, int i11) {
        return (int) ((i10 / i11) * 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i() {
        HashMap map = new HashMap();
        if (this.f13566i == null) {
            q0.b("MidiCpt", "mbPlayerView is null in createProgressEventData");
            return map;
        }
        int iCeil = this.f13572o;
        if (iCeil == 0) {
            iCeil = (int) Math.ceil(r1.getCurPosition() / 1000.0d);
        }
        int duration = this.f13573p;
        if (duration == 0) {
            duration = this.f13566i.getDuration();
        }
        int iA = this.f13571n;
        if (iA == 0) {
            iA = a(iCeil, duration);
        }
        map.put(com.mbridge.msdk.config.component.common.util.c.a("percent"), Integer.valueOf(iA));
        map.put(com.mbridge.msdk.config.component.common.util.c.a(NotificationCompat.CATEGORY_PROGRESS), Integer.valueOf(iCeil));
        map.put(com.mbridge.msdk.config.component.common.util.c.a("122"), this.f13566i.isSilent() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.mbridge.msdk.config.component.midi.model.a aVar = this.f13565h;
        if (aVar == null) {
            c("PlayerModel is null");
            return;
        }
        if (this.f13566i == null) {
            this.f13566i = aVar.d();
        }
        if (this.f13566i == null) {
            c("PlayerWidget is null");
            return;
        }
        String strB = this.f13565h.b();
        if (TextUtils.isEmpty(strB)) {
            c("Command is empty");
            return;
        }
        try {
            if (com.mbridge.msdk.config.component.common.util.c.a("315").equals(strB)) {
                this.f13575r = true;
                n();
                return;
            }
            if (com.mbridge.msdk.config.component.common.util.c.a("307").equals(strB)) {
                this.f13575r = false;
                h();
                return;
            }
            if (com.mbridge.msdk.config.component.common.util.c.a("316").equals(strB)) {
                c cVar = this.f13570m;
                if (cVar != null) {
                    cVar.h();
                }
                this.f13575r = false;
                m();
                return;
            }
            if (com.mbridge.msdk.config.component.common.util.c.a("335").equals(strB)) {
                this.f13575r = true;
                p();
            } else {
                q0.b("MidiCpt", "Unknown command: " + strB);
            }
        } catch (Exception e10) {
            q0.b("MidiCpt", "Error executing player action: " + strB, e10);
            c("Error executing player action: " + e10.getMessage());
        }
    }

    private void k() {
        com.mbridge.msdk.config.component.midi.model.a aVar;
        com.mbridge.msdk.config.component.midi.model.a aVar2;
        if (this.f13569l == null && (aVar2 = this.f13565h) != null && aVar2.c() == 1) {
            this.f13569l = new com.mbridge.msdk.config.component.midi.monitor.b();
        }
        if (this.f13570m != null || (aVar = this.f13565h) == null) {
            return;
        }
        this.f13570m = new c(aVar.g(), this.f13565h.i());
    }

    private void l() {
        if (this.f13568k == null) {
            this.f13568k = new a();
        }
        if (this.f13567j == null) {
            this.f13567j = new b();
        }
    }

    private void m() {
        CusPlayerView cusPlayerView = this.f13566i;
        if (cusPlayerView != null) {
            cusPlayerView.pause();
        }
        b("904003", i());
    }

    private void n() {
        if (this.f13565h == null || this.f13566i == null) {
            c("play params is null");
            return;
        }
        if (TextUtils.isEmpty(this.f13574q)) {
            c("Video URL is empty");
            return;
        }
        if (!TextUtils.isEmpty(this.f13565h.e())) {
            try {
                this.f13566i.setMixWithOtherAudio(Integer.valueOf(this.f13565h.e()).intValue());
            } catch (NumberFormatException e10) {
                q0.b("MidiCpt", "Invalid mixWithOtherAudio value: " + this.f13565h.e(), e10);
            }
        }
        if (this.f13566i.getCurPosition() > 1) {
            p();
            return;
        }
        int iA = this.f13565h.a();
        if (iA >= 0) {
            this.f13566i.initBufferIngParam(iA);
        }
        CusPlayerView cusPlayerView = this.f13566i;
        String str = this.f13574q;
        cusPlayerView.initVFPData(str, str, this.f13567j);
        this.f13566i.playVideo();
        b("904004", i());
    }

    private void p() {
        CusPlayerView cusPlayerView = this.f13566i;
        if (cusPlayerView != null) {
            cusPlayerView.resumeStart();
            c cVar = this.f13570m;
            if (cVar != null && cVar.e()) {
                this.f13570m.h();
            }
        }
        b("904004", i());
    }

    public void o() {
        try {
            CusPlayerView cusPlayerView = this.f13566i;
            if (cusPlayerView != null) {
                cusPlayerView.stop();
                this.f13566i.release();
                this.f13566i = null;
            }
            c cVar = this.f13570m;
            if (cVar != null) {
                cVar.b();
                this.f13570m = null;
            }
            if (this.f13569l != null) {
                this.f13569l = null;
            }
            if (this.f13565h != null) {
                this.f13565h = null;
            }
            this.f13567j = null;
            this.f13568k = null;
        } catch (Exception e10) {
            q0.b("MidiCpt", "Error in release", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        CusPlayerView cusPlayerView = this.f13566i;
        if (cusPlayerView == null || this.f13565h == null) {
            q0.b("MidiCpt", "check mute params is null");
            return;
        }
        if ((cusPlayerView.isSilent() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL).equals(this.f13565h.f())) {
            return;
        }
        if (MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(this.f13565h.f())) {
            this.f13566i.openSound();
        } else {
            this.f13566i.closeSound();
        }
        b("904006", i());
    }

    private void h() {
        CusPlayerView cusPlayerView = this.f13566i;
        if (cusPlayerView != null) {
            cusPlayerView.stop();
        }
        b("904009", i());
        o();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            q0.b("MidiCpt", "execute " + this);
            l();
            c cVar = this.f13570m;
            if (cVar == null) {
                c("TimeOutPlayerMonitor is null");
            } else {
                cVar.a(this.f13568k);
                this.f13570m.g();
            }
        } catch (Exception e10) {
            q0.b("MidiCpt", "Error in execute", e10);
            c("Error in execute: " + e10.getMessage());
        }
    }

    public class b implements com.mbridge.msdk.config.dynamic.baseview.video.a {
        public b() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void a(long j10) {
            if (MidiCpt.this.f13570m != null) {
                MidiCpt.this.f13570m.f();
            }
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.b("904002", (Map<String, Object>) midiCpt.i());
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingEnd() {
            q0.b("BufferState", "缓冲结束");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingStart() {
            q0.b("BufferState", "开始缓冲");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingTimeOut(String str) {
            q0.b("BufferState", "缓冲超时");
            MidiCpt.this.a("904010", str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onPlayCompleted() {
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.b("904007", (Map<String, Object>) midiCpt.i());
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onPlayError(String str) {
            MidiCpt.this.c(str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void a(long j10, long j11) {
            MidiCpt.this.f13572o = e0.a(j10);
            MidiCpt.this.f13573p = e0.a(j11);
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.f13571n = midiCpt.a(midiCpt.f13572o, MidiCpt.this.f13573p);
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.a("percent"), Integer.valueOf(MidiCpt.this.f13571n));
            map.put(com.mbridge.msdk.config.component.common.util.c.a(NotificationCompat.CATEGORY_PROGRESS), Long.valueOf(j10));
            map.put(com.mbridge.msdk.config.component.common.util.c.a("122"), MidiCpt.this.f13566i.isSilent() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
            MidiCpt.this.b("904005", map);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        com.mbridge.msdk.config.component.midi.model.a aVar = this.f13565h;
        if (aVar == null) {
            q0.b("MidiCpt", "playerModel is null, cannot parse event config");
        } else {
            aVar.b(map);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f13092f = "904001";
        this.f13565h = new com.mbridge.msdk.config.component.midi.model.a(map);
        try {
            ViewGroup viewGroupE = e();
            if (viewGroupE != null) {
                if (!TextUtils.isEmpty(this.f13565h.h())) {
                    this.f13566i = (CusPlayerView) e().findViewWithTag(this.f13565h.h());
                } else {
                    this.f13566i = (CusPlayerView) com.mbridge.msdk.config.dynamic.utils.d.a(viewGroupE, CusPlayerView.class);
                }
            }
            CusPlayerView cusPlayerView = this.f13566i;
            if (cusPlayerView == null) {
                q0.b("MidiCpt", "Failed to get CusPlayerView from root view");
            } else {
                this.f13565h.a(cusPlayerView);
            }
        } catch (Exception e10) {
            q0.b("MidiCpt", "Error getting CusPlayerView", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.a("reason"), str);
        b("904008", map);
        o();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
        k();
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = map.get(com.mbridge.msdk.config.component.common.util.c.a("16"));
                if (obj instanceof Map) {
                    Object obj2 = ((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.a("116"));
                    if (obj2 instanceof String) {
                        String strValueOf = String.valueOf(obj2);
                        if (!TextUtils.isEmpty(strValueOf)) {
                            return strValueOf.equals(this.f13565h.i());
                        }
                    }
                }
            } catch (Throwable th) {
                q0.b("MidiCpt", th.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Map<String, Object> map) {
        a(a(str, map));
        com.mbridge.msdk.config.component.midi.monitor.b bVar = this.f13569l;
        if (bVar != null) {
            bVar.a(str, this.f13090d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Map<String, Object> mapI = i();
        mapI.put(com.mbridge.msdk.config.component.common.util.c.a("reason"), str2);
        mapI.put(com.mbridge.msdk.config.component.common.util.c.a("code"), "4001");
        b(str, mapI);
        o();
    }

    @Override // com.mbridge.msdk.config.component.vc.inter.a
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            q0.b("MidiCpt", "eventName is null");
            return;
        }
        str.getClass();
        if (!str.equals("onStop")) {
            if (str.equals("onResume") && this.f13575r) {
                p();
                return;
            }
            return;
        }
        m();
    }
}
