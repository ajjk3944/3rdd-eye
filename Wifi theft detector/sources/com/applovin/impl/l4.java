package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes.dex */
public class l4 extends f4 {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f6387p = true;

    /* renamed from: h, reason: collision with root package name */
    private final o7 f6388h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f6389i;

    /* renamed from: j, reason: collision with root package name */
    private MediaEvents f6390j;

    /* renamed from: k, reason: collision with root package name */
    private final VastProperties f6391k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f6392l;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f6393m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f6394n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f6395o;

    public l4(o7 o7Var) {
        super(o7Var);
        this.f6389i = new AtomicBoolean();
        this.f6392l = new AtomicBoolean();
        this.f6393m = new AtomicBoolean();
        this.f6394n = new AtomicBoolean();
        this.f6395o = new AtomicBoolean();
        this.f6388h = o7Var;
        float fM1 = o7Var.m1();
        if (o7Var.m1() == -1) {
            this.f6391k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f6391k = VastProperties.createVastPropertiesForSkippableMedia(fM1, true, Position.STANDALONE);
        }
    }

    public void A() {
        b("track resumed", new Runnable() { // from class: com.applovin.impl.xb
            @Override // java.lang.Runnable
            public final void run() {
                this.f8642a.s();
            }
        });
    }

    public void B() {
        b("track skipped", new Runnable() { // from class: com.applovin.impl.bc
            @Override // java.lang.Runnable
            public final void run() {
                this.f5621a.t();
            }
        });
    }

    public void C() {
        if (this.f6395o.compareAndSet(false, true)) {
            b("track third quartile", new Runnable() { // from class: com.applovin.impl.vb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8295a.u();
                }
            });
        }
    }

    @Override // com.applovin.impl.f4
    public AdSessionContext a(WebView webView) {
        if (!f6387p && this.f6388h.e1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (p7 p7Var : this.f6388h.e1().b()) {
            List<v7> listC = p7Var.c();
            if (listC.isEmpty()) {
                a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.f5989b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (v7 v7Var : listC) {
                    if (CampaignEx.KEY_OMID.equalsIgnoreCase(v7Var.b())) {
                        arrayList2.add(v7Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    a8.a(p7Var.b(), t7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f5989b);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        try {
                            arrayList3.add(new URL(((v7) obj).c()));
                        } catch (Throwable th) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f5990c.a(this.f5991d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.f5989b);
                    } else {
                        String strE = p7Var.e();
                        String strD = p7Var.d();
                        if (!StringUtils.isValidString(strE) || StringUtils.isValidString(strD)) {
                            int size2 = arrayList3.size();
                            while (i10 < size2) {
                                Object obj2 = arrayList3.get(i10);
                                i10++;
                                URL url = (URL) obj2;
                                arrayList.add(StringUtils.isValidString(strE) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(strD, url, strE) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.f5989b);
                        }
                    }
                }
            }
        }
        String strA = this.f5989b.e0().a();
        if (TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5990c.b(this.f5991d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f5989b.e0().b(), strA, arrayList, this.f6388h.getOpenMeasurementContentUrl(), this.f6388h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f5990c.a(this.f5991d, "Failed to create ad session context", th2);
            return null;
        }
    }

    public void b(final float f10, final boolean z10) {
        if (this.f6392l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.sb
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f7573a.a(f10, z10);
                }
            });
        }
    }

    @Override // com.applovin.impl.f4
    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.yb
            @Override // java.lang.Runnable
            public final void run() {
                this.f8721a.p();
            }
        });
    }

    public void v() {
        b("track clicked", new Runnable() { // from class: com.applovin.impl.dc
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                this.f5842a.m();
            }
        });
    }

    public void w() {
        b("track completed", new Runnable() { // from class: com.applovin.impl.ub
            @Override // java.lang.Runnable
            public final void run() {
                this.f8236a.n();
            }
        });
    }

    public void x() {
        if (this.f6393m.compareAndSet(false, true)) {
            b("track first quartile", new Runnable() { // from class: com.applovin.impl.wb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8386a.o();
                }
            });
        }
    }

    public void y() {
        if (this.f6394n.compareAndSet(false, true)) {
            b("track midpoint", new Runnable() { // from class: com.applovin.impl.cc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5675a.q();
                }
            });
        }
    }

    public void z() {
        b("track paused", new Runnable() { // from class: com.applovin.impl.zb
            @Override // java.lang.Runnable
            public final void run() {
                this.f8818a.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f6390j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f6390j.bufferStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() throws JSONException {
        this.f6390j.adUserInteraction(InteractionType.CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f6390j.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f6390j.firstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f5994g.loaded(this.f6391k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f6390j.midpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f6390j.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f6390j.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f6390j.skipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f6390j.thirdQuartile();
    }

    public void i() {
        if (this.f6389i.compareAndSet(true, false)) {
            b("buffer finished", new Runnable() { // from class: com.applovin.impl.rb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7511a.k();
                }
            });
        }
    }

    public void j() {
        if (this.f6389i.compareAndSet(false, true)) {
            b("buffer started", new Runnable() { // from class: com.applovin.impl.ac
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5401a.l();
                }
            });
        }
    }

    public void b(final boolean z10) {
        b("track volume changed", new Runnable() { // from class: com.applovin.impl.tb
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                this.f8177a.a(z10);
            }
        });
    }

    @Override // com.applovin.impl.f4
    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f5990c.a(this.f5991d, "Failed to create ad session configuration", th);
            return null;
        }
    }

    @Override // com.applovin.impl.f4
    public void a(AdSession adSession) {
        try {
            this.f6390j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5990c.a(this.f5991d, "Failed to create media events", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f10, boolean z10) throws JSONException {
        this.f6390j.start(f10, z10 ? 0.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10) throws JSONException {
        this.f6390j.volumeChange(z10 ? 0.0f : 1.0f);
    }
}
