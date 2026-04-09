package com.mbridge.msdk.timer;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private long f18206a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18207b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<i> f18208c;

    /* renamed from: d, reason: collision with root package name */
    private LinkedList<i> f18209d;

    /* renamed from: e, reason: collision with root package name */
    private int f18210e;

    /* renamed from: f, reason: collision with root package name */
    private int f18211f;

    /* renamed from: g, reason: collision with root package name */
    private e f18212g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f18213h;

    /* renamed from: i, reason: collision with root package name */
    private l f18214i;

    /* renamed from: j, reason: collision with root package name */
    private g f18215j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f18216k;

    /* renamed from: com.mbridge.msdk.timer.a$a, reason: collision with other inner class name */
    public class HandlerC0328a extends Handler {
        public HandlerC0328a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (a.this) {
                try {
                    int i10 = message.what;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            a.this.c();
                        }
                    } else {
                        if (a.this.f18207b) {
                            return;
                        }
                        a aVar = a.this;
                        aVar.a(aVar.f18206a);
                        sendMessageDelayed(obtainMessage(1), a.this.f18206a);
                    }
                } finally {
                }
            }
        }
    }

    public class b implements com.mbridge.msdk.reward.adapter.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f18218a;

        public b(com.mbridge.msdk.reward.adapter.c cVar) {
            this.f18218a = cVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f18216k.sendMessage(a.this.f18216k.obtainMessage(2));
            this.f18218a.a((com.mbridge.msdk.reward.adapter.a) null);
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f18216k.sendMessage(a.this.f18216k.obtainMessage(2));
            this.f18218a.a((com.mbridge.msdk.reward.adapter.a) null);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        static a f18220a = new a(null);
    }

    public /* synthetic */ a(HandlerC0328a handlerC0328a) {
        this();
    }

    private a() {
        this.f18207b = false;
        this.f18208c = new LinkedList<>();
        this.f18209d = new LinkedList<>();
        this.f18210e = 0;
        this.f18211f = 0;
        this.f18216k = new HandlerC0328a();
    }

    private void b() {
        if (this.f18215j == null) {
            this.f18215j = g.a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (this.f18214i == null) {
            this.f18214i = l.a(this.f18215j);
        }
        List<i> listA = this.f18214i.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        if (listA != null) {
            this.f18209d.addAll(listA);
            for (i iVar : listA) {
                a(iVar.d(), iVar.g());
            }
        }
        List<i> listA2 = this.f18214i.a(94);
        if (listA2 != null) {
            this.f18208c.addAll(listA2);
            for (i iVar2 : listA2) {
                b(iVar2.d(), iVar2.g());
            }
        }
        if (this.f18212g == null) {
            this.f18212g = e.a(this.f18215j);
        }
        if (this.f18213h == null) {
            this.f18213h = com.mbridge.msdk.videocommon.setting.b.b().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            LinkedList<i> linkedList = this.f18208c;
            if (linkedList != null && linkedList.size() > 0 && this.f18210e < this.f18208c.size()) {
                i iVar = this.f18208c.get(this.f18210e);
                this.f18210e++;
                if (a(iVar)) {
                    a(iVar.d(), iVar.g(), false);
                    return;
                }
                return;
            }
            LinkedList<i> linkedList2 = this.f18209d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f18211f >= this.f18209d.size()) {
                return;
            }
            i iVar2 = this.f18209d.get(this.f18211f);
            this.f18211f++;
            if (a(iVar2)) {
                c(iVar2.d(), iVar2.g());
            }
        } catch (Throwable th) {
            q0.b("LoopTimer", th.getMessage(), th);
        }
    }

    public static a a() {
        return c.f18220a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        LinkedList<i> linkedList = this.f18208c;
        if (linkedList == null || linkedList.size() <= 0 || this.f18210e == 0 || this.f18208c.size() <= this.f18210e) {
            LinkedList<i> linkedList2 = this.f18209d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f18211f == 0 || this.f18209d.size() == this.f18211f) {
                this.f18211f = 0;
                this.f18210e = 0;
                Handler handler = this.f18216k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    private boolean a(i iVar) {
        boolean z10 = false;
        if (iVar != null && !TextUtils.isEmpty(iVar.g())) {
            String strG = iVar.g();
            try {
                if (this.f18212g == null) {
                    return true;
                }
                com.mbridge.msdk.videocommon.setting.a aVar = this.f18213h;
                int iA = this.f18212g.a(strG, aVar != null ? aVar.e() : 0L);
                if (iA == -1) {
                    a(strG);
                } else if (iA == 1) {
                    return true;
                }
                try {
                    Handler handler = this.f18216k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th) {
                    th = th;
                    q0.b("LoopTimer", th.getMessage(), th);
                    return z10;
                }
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
            }
        }
        return z10;
    }

    private void c(String str, String str2) {
        a(str, str2, true);
    }

    private void a(String str, String str2, boolean z10) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(contextD, str, str2);
            cVar.d(z10);
            cVar.a(new b(cVar));
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar2.i(SameMD5.getMD5(v0.d()));
            cVar2.n(str2);
            if (z10) {
                cVar2.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
            } else {
                cVar2.a(94);
            }
            cVar2.h(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            cVar2.f("1");
            cVar.a(1, 8000, false, cVar2);
        } catch (Exception e10) {
            q0.b("LoopTimer", e10.getMessage(), e10);
        }
    }

    public void b(long j10) {
        b();
        this.f18206a = j10;
        this.f18207b = false;
        Handler handler = this.f18216k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f18206a);
    }

    public void b(String str, String str2) {
        if (this.f18208c.contains(str2)) {
            return;
        }
        this.f18208c.add(new i(str, str2, 94));
        l lVar = this.f18214i;
        if (lVar != null) {
            lVar.a(str, str2, 94);
        }
    }

    private void b(String str) {
        l lVar = this.f18214i;
        if (lVar != null) {
            lVar.a(str);
        }
    }

    public void a(String str, String str2) {
        if (this.f18209d.contains(str2)) {
            return;
        }
        this.f18209d.add(new i(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        l lVar = this.f18214i;
        if (lVar != null) {
            lVar.a(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LinkedList<i> linkedList = this.f18208c;
        if (linkedList != null && linkedList.contains(str)) {
            this.f18208c.remove(str);
        } else {
            LinkedList<i> linkedList2 = this.f18209d;
            if (linkedList2 != null && linkedList2.contains(str)) {
                this.f18209d.remove(str);
            }
        }
        b(str);
    }
}
