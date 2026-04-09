package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.u0;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
public class p extends f implements a.InterfaceC0267a {

    /* renamed from: b, reason: collision with root package name */
    private g f13019b;

    /* renamed from: c, reason: collision with root package name */
    private JumpLoaderResult f13020c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13022e;

    /* renamed from: f, reason: collision with root package name */
    private Context f13023f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f13024g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f13025h;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13021d = true;

    /* renamed from: i, reason: collision with root package name */
    private Handler f13026i = new Handler(Looper.getMainLooper());

    public class a implements k {
        public a() {
        }

        @Override // com.mbridge.msdk.click.k
        public void a(JumpLoaderResult jumpLoaderResult) {
            p.this.f13020c = jumpLoaderResult;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (p.this.f13019b != null) {
                if (p.this.f13020c.isSuccess()) {
                    p.this.f13019b.a(p.this.f13020c);
                } else {
                    p.this.f13019b.a(p.this.f13020c, p.this.f13020c.getMsg());
                }
            }
        }
    }

    public class c extends com.mbridge.msdk.foundation.same.task.a {

        /* renamed from: b, reason: collision with root package name */
        private final Context f13030b;

        /* renamed from: c, reason: collision with root package name */
        private String f13031c;

        /* renamed from: d, reason: collision with root package name */
        private String f13032d;

        /* renamed from: e, reason: collision with root package name */
        private String f13033e;

        /* renamed from: f, reason: collision with root package name */
        private CampaignEx f13034f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f13035g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f13036h;

        /* renamed from: i, reason: collision with root package name */
        private int f13037i;

        /* renamed from: a, reason: collision with root package name */
        private final Semaphore f13029a = new Semaphore(0);

        /* renamed from: j, reason: collision with root package name */
        private o.f f13038j = new a();

        public c(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z10, boolean z11, int i10) {
            this.f13030b = context;
            this.f13031c = str;
            this.f13032d = str2;
            this.f13033e = str3;
            this.f13034f = campaignEx;
            this.f13035g = z10;
            this.f13036h = z11;
            this.f13037i = i10;
        }

        private boolean a(int i10) {
            return i10 == 200;
        }

        private boolean b(int i10) {
            return i10 == 301 || i10 == 302 || i10 == 307;
        }

        private boolean c(String str) {
            return str.startsWith("/");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(String str) {
            return q.a(str, this.f13034f, p.this.f13020c);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            if (p.this.f13019b != null) {
                p.this.f13019b.b(null);
            }
            p.this.f13020c = new JumpLoaderResult();
            p.this.f13020c.setUrl(this.f13031c);
            p.this.f13020c = a(this.f13031c, this.f13035g, this.f13036h, this.f13034f, this.f13037i);
            if (!TextUtils.isEmpty(p.this.f13020c.getExceptionMsg())) {
                p.this.f13020c.setSuccess(true);
            }
            if (p.this.f13021d && p.this.f13020c.isSuccess()) {
                if (p.this.f13025h != null) {
                    p.this.f13020c.setStatusCode(p.this.f13025h.f12947f);
                }
                q.a(this.f13034f, p.this.f13020c, p.this.f13025h, this.f13032d, this.f13033e, this.f13030b, this.f13038j, this.f13029a);
            }
        }

        public class a implements o.f {
            public a() {
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean a(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean b(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean c(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(String str, boolean z10, String str2) {
                c.this.d(str);
                p.this.f13020c.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(int i10, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    p.this.f13020c.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    p.this.f13020c.setContent(str3);
                }
                c.this.d(str);
                a();
            }

            private void a() {
                synchronized (p.this) {
                    p.this.f13020c.setSuccess(true);
                    c.this.a();
                }
            }
        }

        private boolean b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.f13029a.release();
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
        
            r2.setjumpDone(true);
            r2.setUrl(r6);
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01ed A[EDGE_INSN: B:82:0x01ed->B:75:0x01ed BREAK  A[LOOP:0: B:23:0x005f->B:68:0x0198], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r14, boolean r15, boolean r16, com.mbridge.msdk.foundation.entity.CampaignEx r17, int r18) {
            /*
                Method dump skipped, instructions count: 494
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.p.c.a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.entity.JumpLoaderResult");
        }

        private boolean a(String str) {
            return u0.a.b(str);
        }
    }

    public p(Context context) {
        this.f13023f = context;
        this.f13024g = new com.mbridge.msdk.foundation.same.task.b(context, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(String str, g gVar, boolean z10, String str2, String str3, CampaignEx campaignEx, boolean z11, boolean z12, int i10) {
        c cVar;
        this.f13019b = gVar;
        this.f13022e = z10;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f13023f);
        bVar.c(str);
        bVar.b(z10);
        bVar.a(str2);
        bVar.b(str3);
        bVar.a(campaignEx);
        bVar.a(z11);
        bVar.c(z12);
        bVar.a(i10);
        if (str.startsWith("tcp")) {
            l lVar = new l(bVar);
            lVar.a(this.f13019b);
            lVar.a(new a());
            cVar = lVar;
        } else {
            cVar = new c(this.f13023f, str, str2, str3, campaignEx, z11, z12, i10);
        }
        this.f13024g.b(cVar, this);
    }

    @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0267a
    public void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.f13021d) {
            this.f13026i.post(new b());
        }
    }
}
