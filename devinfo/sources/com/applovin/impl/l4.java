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
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class l4 extends f4 {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f4418p = true;

    /* renamed from: h, reason: collision with root package name */
    private final o7 f4419h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f4420i;
    private MediaEvents j;

    /* renamed from: k, reason: collision with root package name */
    private final VastProperties f4421k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f4422l;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f4423m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f4424n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f4425o;

    public l4(o7 o7Var) {
        super(o7Var);
        this.f4420i = new AtomicBoolean();
        this.f4422l = new AtomicBoolean();
        this.f4423m = new AtomicBoolean();
        this.f4424n = new AtomicBoolean();
        this.f4425o = new AtomicBoolean();
        this.f4419h = o7Var;
        float fM1 = o7Var.m1();
        if (o7Var.m1() == -1) {
            this.f4421k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f4421k = VastProperties.createVastPropertiesForSkippableMedia(fM1, true, Position.STANDALONE);
        }
    }

    public void A() {
        b("track resumed", new s9(this, 4));
    }

    public void B() {
        b("track skipped", new s9(this, 8));
    }

    public void C() {
        if (this.f4425o.compareAndSet(false, true)) {
            b("track third quartile", new s9(this, 2));
        }
    }

    @Override // com.applovin.impl.f4
    public AdSessionContext a(WebView webView) {
        if (!f4418p && this.f4419h.e1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (p7 p7Var : this.f4419h.e1().b()) {
            List<v7> listC = p7Var.c();
            if (listC.isEmpty()) {
                a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.f4107b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (v7 v7Var : listC) {
                    if ("omid".equalsIgnoreCase(v7Var.b())) {
                        arrayList2.add(v7Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    a8.a(p7Var.b(), t7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f4107b);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i4 = 0;
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        try {
                            arrayList3.add(new URL(((v7) obj).c()));
                        } catch (Throwable th2) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f4108c.a(this.f4109d, "Failed to parse JavaScript resource url", th2);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.f4107b);
                    } else {
                        String strE = p7Var.e();
                        String strD = p7Var.d();
                        if (!StringUtils.isValidString(strE) || StringUtils.isValidString(strD)) {
                            int size2 = arrayList3.size();
                            while (i4 < size2) {
                                Object obj2 = arrayList3.get(i4);
                                i4++;
                                URL url = (URL) obj2;
                                arrayList.add(StringUtils.isValidString(strE) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(strD, url, strE) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.f4107b);
                        }
                    }
                }
            }
        }
        String strA = this.f4107b.e0().a();
        if (TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4108c.b(this.f4109d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f4107b.e0().b(), strA, arrayList, this.f4419h.getOpenMeasurementContentUrl(), this.f4419h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th3) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f4108c.a(this.f4109d, "Failed to create ad session context", th3);
            return null;
        }
    }

    public void b(final float f10, final boolean z3) {
        if (this.f4422l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.t9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5792a.a(f10, z3);
                }
            });
        }
    }

    @Override // com.applovin.impl.f4
    public void h() {
        b("track loaded", new s9(this, 5));
    }

    public void v() {
        b("track clicked", new s9(this, 10));
    }

    public void w() {
        b("track completed", new s9(this, 1));
    }

    public void x() {
        if (this.f4423m.compareAndSet(false, true)) {
            b("track first quartile", new s9(this, 3));
        }
    }

    public void y() {
        if (this.f4424n.compareAndSet(false, true)) {
            b("track midpoint", new s9(this, 9));
        }
    }

    public void z() {
        b("track paused", new s9(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.j.bufferStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.j.adUserInteraction(InteractionType.CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.j.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.j.firstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.g.loaded(this.f4421k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.j.midpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.j.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.j.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.j.skipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.j.thirdQuartile();
    }

    public void i() {
        if (this.f4420i.compareAndSet(true, false)) {
            b("buffer finished", new s9(this, 0));
        }
    }

    public void j() {
        if (this.f4420i.compareAndSet(false, true)) {
            b("buffer started", new s9(this, 7));
        }
    }

    public void b(boolean z3) {
        b("track volume changed", new ah.m(1, this, z3));
    }

    @Override // com.applovin.impl.f4
    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f4108c.a(this.f4109d, "Failed to create ad session configuration", th2);
            return null;
        }
    }

    @Override // com.applovin.impl.f4
    public void a(AdSession adSession) {
        try {
            this.j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4108c.a(this.f4109d, "Failed to create media events", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f10, boolean z3) {
        this.j.start(f10, z3 ? 0.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z3) {
        this.j.volumeChange(z3 ? 0.0f : 1.0f);
    }
}
