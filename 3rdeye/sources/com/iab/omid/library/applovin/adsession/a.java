package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f23517a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f23518b;

    /* renamed from: c, reason: collision with root package name */
    private final f f23519c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f23520d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f23521e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23522f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23523g;

    /* renamed from: h, reason: collision with root package name */
    private final String f23524h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23525j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f23526k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f23525j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f23523g) {
            return;
        }
        this.f23519c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f23524h;
    }

    public AdSessionStatePublisher d() {
        return this.f23521e;
    }

    public View e() {
        return this.f23520d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f23523g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f23519c.a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f23523g) {
            return;
        }
        this.f23520d.clear();
        removeAllFriendlyObstructions();
        this.f23523g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f23521e = null;
        this.f23526k = null;
    }

    public boolean g() {
        return this.f23526k != null;
    }

    public boolean h() {
        return this.f23522f && !this.f23523g;
    }

    public boolean i() {
        return this.f23523g;
    }

    public boolean j() {
        return this.f23518b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f23518b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f23522f;
    }

    public void m() {
        a();
        d().g();
        this.i = true;
    }

    public void n() {
        b();
        d().h();
        this.f23525j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f23523g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f23523g) {
            return;
        }
        this.f23519c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f23523g) {
            return;
        }
        this.f23519c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f23526k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f23522f || this.f23521e == null) {
            return;
        }
        this.f23522f = true;
        c.c().c(this);
        this.f23521e.a(i.c().b());
        this.f23521e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f23521e.a(this, this.f23517a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f23519c = new f();
        this.f23522f = false;
        this.f23523g = false;
        this.f23518b = adSessionConfiguration;
        this.f23517a = adSessionContext;
        this.f23524h = str;
        b(null);
        this.f23521e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f23521e.i();
        c.c().a(this);
        this.f23521e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f23520d.clear();
            }
        }
    }

    private void b(View view) {
        this.f23520d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f23526k.onPossibleObstructionsDetected(this.f23524h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f23525j = true;
    }
}
