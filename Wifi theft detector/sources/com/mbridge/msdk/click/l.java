package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.a;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
public class l extends com.mbridge.msdk.foundation.same.task.a {

    /* renamed from: b, reason: collision with root package name */
    private final Context f12971b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12972c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12973d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12974e;

    /* renamed from: f, reason: collision with root package name */
    private final CampaignEx f12975f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f12976g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f12977h;

    /* renamed from: i, reason: collision with root package name */
    private final int f12978i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f12979j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f12980k;

    /* renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f12981l;

    /* renamed from: m, reason: collision with root package name */
    private g f12982m;

    /* renamed from: n, reason: collision with root package name */
    private k f12983n;

    /* renamed from: a, reason: collision with root package name */
    private final Semaphore f12970a = new Semaphore(0);

    /* renamed from: o, reason: collision with root package name */
    private final o.f f12984o = new a();

    public l(com.mbridge.msdk.click.entity.b bVar) {
        this.f12971b = bVar.c();
        this.f12972c = bVar.e();
        this.f12973d = bVar.b();
        this.f12974e = bVar.d();
        this.f12975f = bVar.a();
        this.f12976g = bVar.g();
        this.f12977h = bVar.i();
        this.f12978i = bVar.f();
        this.f12979j = bVar.h();
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void pauseTask(boolean z10) {
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void runTask() {
        JumpLoaderResult jumpLoaderResult;
        g gVar = this.f12982m;
        if (gVar != null) {
            gVar.b(null);
        }
        JumpLoaderResult jumpLoaderResult2 = new JumpLoaderResult();
        this.f12981l = jumpLoaderResult2;
        jumpLoaderResult2.setUrl(this.f12972c);
        JumpLoaderResult jumpLoaderResultC = c(this.f12972c);
        this.f12981l = jumpLoaderResultC;
        if (jumpLoaderResultC != null && !TextUtils.isEmpty(jumpLoaderResultC.getExceptionMsg())) {
            this.f12981l.setSuccess(true);
        }
        if (this.mState != a.b.RUNNING) {
            k kVar = this.f12983n;
            if (kVar != null) {
                kVar.a(this.f12981l);
                return;
            }
            return;
        }
        JumpLoaderResult jumpLoaderResult3 = this.f12981l;
        if (jumpLoaderResult3 != null && !jumpLoaderResult3.isSuccess()) {
            k kVar2 = this.f12983n;
            if (kVar2 != null) {
                kVar2.a(this.f12981l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.f12980k;
        if (aVar != null && (jumpLoaderResult = this.f12981l) != null) {
            jumpLoaderResult.setStatusCode(aVar.f12947f);
        }
        m.a(this.f12975f, this.f12981l, this.f12980k, this.f12973d, this.f12974e, this.f12971b, this.f12984o, this.f12983n, this.f12970a);
    }

    public class a implements o.f {
        public a() {
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean a(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean b(String str) {
            return false;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean c(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(String str, boolean z10, String str2) {
            l.this.b(str);
            l.this.f12981l.setContent(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                try {
                    l.this.f12981l.setSuccess(true);
                    if (l.this.f12983n != null) {
                        l.this.f12983n.a(l.this.f12981l);
                    }
                    l.this.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(int i10, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                l.this.f12981l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                l.this.f12981l.setContent(str3);
            }
            l.this.b(str);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        return m.a(str, this.f12975f, this.f12981l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x014f, code lost:
    
        r1.setjumpDone(true);
        r1.setUrl(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163 A[LOOP:0: B:15:0x003e->B:65:0x0163, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b A[EDGE_INSN: B:71:0x016b->B:66:0x016b BREAK  A[LOOP:0: B:15:0x003e->B:65:0x0163], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.click.entity.JumpLoaderResult c(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.l.c(java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    public void a(g gVar) {
        this.f12982m = gVar;
    }

    public void a(k kVar) {
        this.f12983n = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f12970a.release();
    }

    private String a(String str) {
        if (this.f12979j) {
            String strA = com.mbridge.msdk.setting.b.a(this.f12971b, str);
            if (!TextUtils.isEmpty(strA)) {
                str = str + strA;
            }
        }
        return com.mbridge.msdk.util.b.a() ? m.a(this.f12975f, str) : str;
    }
}
