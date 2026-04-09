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
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class y3 extends s3 {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f21841p = true;

    /* renamed from: h, reason: collision with root package name */
    private final b7 f21842h;
    private final AtomicBoolean i;

    /* renamed from: j, reason: collision with root package name */
    private MediaEvents f21843j;

    /* renamed from: k, reason: collision with root package name */
    private final VastProperties f21844k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f21845l;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f21846m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f21847n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f21848o;

    public y3(b7 b7Var) {
        super(b7Var);
        this.i = new AtomicBoolean();
        this.f21845l = new AtomicBoolean();
        this.f21846m = new AtomicBoolean();
        this.f21847n = new AtomicBoolean();
        this.f21848o = new AtomicBoolean();
        this.f21842h = b7Var;
        float fU1 = b7Var.u1();
        if (b7Var.u1() == -1) {
            this.f21844k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f21844k = VastProperties.createVastPropertiesForSkippableMedia(fU1, true, Position.STANDALONE);
        }
    }

    public void A() {
        b("track resumed", new W0(this, 2));
    }

    public void B() {
        b("track skipped", new Y0(this, 0));
    }

    public void C() {
        if (this.f21848o.compareAndSet(false, true)) {
            b("track third quartile", new Y0(this, 1));
        }
    }

    @Override // com.applovin.impl.s3
    public AdSessionContext a(WebView webView) {
        if (!f21841p && this.f21842h.n1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (c7 c7Var : this.f21842h.n1().b()) {
            List<i7> listC = c7Var.c();
            if (listC.isEmpty()) {
                n7.a(c7Var.b(), g7.FAILED_TO_LOAD_RESOURCE, this.f20928b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (i7 i7Var : listC) {
                    if ("omid".equalsIgnoreCase(i7Var.b())) {
                        arrayList2.add(i7Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    n7.a(c7Var.b(), g7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f20928b);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((i7) it.next()).c()));
                        } catch (Throwable th) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f20929c.a(this.f20930d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        n7.a(c7Var.b(), g7.FAILED_TO_LOAD_RESOURCE, this.f20928b);
                    } else {
                        String strE = c7Var.e();
                        String strD = c7Var.d();
                        if (!StringUtils.isValidString(strE) || StringUtils.isValidString(strD)) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                URL url = (URL) it2.next();
                                arrayList.add(StringUtils.isValidString(strE) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(strD, url, strE) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            n7.a(c7Var.b(), g7.FAILED_TO_LOAD_RESOURCE, this.f20928b);
                        }
                    }
                }
            }
        }
        String strA = this.f20928b.d0().a();
        if (TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20929c.b(this.f20930d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f20928b.d0().b(), strA, arrayList, this.f21842h.getOpenMeasurementContentUrl(), this.f21842h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f20929c.a(this.f20930d, "Failed to create ad session context", th2);
            return null;
        }
    }

    public void b(final float f10, final boolean z10) {
        if (this.f21845l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.Z0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18906b.a(f10, z10);
                }
            });
        }
    }

    @Override // com.applovin.impl.s3
    public void h() {
        b("track loaded", new X0(this, 1));
    }

    public void v() {
        b("track clicked", new W0(this, 0));
    }

    public void w() {
        b("track completed", new X0(this, 2));
    }

    public void x() {
        if (this.f21846m.compareAndSet(false, true)) {
            b("track first quartile", new Y0(this, 2));
        }
    }

    public void y() {
        if (this.f21847n.compareAndSet(false, true)) {
            b("track midpoint", new X0(this, 0));
        }
    }

    public void z() {
        b("track paused", new W0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f21843j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f21843j.bufferStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f21843j.adUserInteraction(InteractionType.CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f21843j.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f21843j.firstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f20933g.loaded(this.f21844k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f21843j.midpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f21843j.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f21843j.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f21843j.skipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f21843j.thirdQuartile();
    }

    public void i() {
        if (this.i.compareAndSet(true, false)) {
            b("buffer finished", new C2.h(this, 25));
        }
    }

    public void j() {
        if (this.i.compareAndSet(false, true)) {
            b("buffer started", new L0(this, 8));
        }
    }

    public void b(boolean z10) {
        b("track volume changed", new B.e(this, z10, 1));
    }

    @Override // com.applovin.impl.s3
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
            this.f20929c.a(this.f20930d, "Failed to create ad session configuration", th);
            return null;
        }
    }

    @Override // com.applovin.impl.s3
    public void a(AdSession adSession) {
        try {
            this.f21843j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20929c.a(this.f20930d, "Failed to create media events", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f10, boolean z10) {
        this.f21843j.start(f10, z10 ? 0.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10) {
        this.f21843j.volumeChange(z10 ? 0.0f : 1.0f);
    }
}
