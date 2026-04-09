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

/* loaded from: classes3.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f20899a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f20900b;

    /* renamed from: c, reason: collision with root package name */
    private final f f20901c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f20902d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f20903e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20904f;
    private boolean g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20905h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20906i;
    private boolean j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f20907k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f20906i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.g) {
            return;
        }
        this.f20901c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f20905h;
    }

    public AdSessionStatePublisher d() {
        return this.f20903e;
    }

    public View e() {
        return this.f20902d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f20901c.a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.g) {
            return;
        }
        this.f20902d.clear();
        removeAllFriendlyObstructions();
        this.g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f20903e = null;
        this.f20907k = null;
    }

    public boolean g() {
        return this.f20907k != null;
    }

    public boolean h() {
        return this.f20904f && !this.g;
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.f20900b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f20900b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f20904f;
    }

    public void m() {
        a();
        d().g();
        this.f20906i = true;
    }

    public void n() {
        b();
        d().h();
        this.j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.g) {
            return;
        }
        this.f20901c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.g) {
            return;
        }
        this.f20901c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f20907k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f20904f || this.f20903e == null) {
            return;
        }
        this.f20904f = true;
        c.c().c(this);
        this.f20903e.a(i.c().b());
        this.f20903e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f20903e.a(this, this.f20899a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f20901c = new f();
        this.f20904f = false;
        this.g = false;
        this.f20900b = adSessionConfiguration;
        this.f20899a = adSessionContext;
        this.f20905h = str;
        b(null);
        this.f20903e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f20903e.i();
        c.c().a(this);
        this.f20903e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f20902d.clear();
            }
        }
    }

    private void b(View view) {
        this.f20902d = new com.iab.omid.library.applovin.weakreference.a(view);
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
            this.f20907k.onPossibleObstructionsDetected(this.f20905h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.j = true;
    }
}
