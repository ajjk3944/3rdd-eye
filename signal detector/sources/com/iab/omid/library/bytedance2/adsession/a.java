package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.c;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.internal.f;
import com.iab.omid.library.bytedance2.internal.i;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.b;
import com.iab.omid.library.bytedance2.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f18625a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f18626b;

    /* renamed from: c, reason: collision with root package name */
    private final f f18627c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.weakreference.a f18628d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f18629e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18630f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18631g;

    /* renamed from: h, reason: collision with root package name */
    private final String f18632h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18633j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f18634k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f18633j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f18631g) {
            return;
        }
        this.f18627c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f18628d.get();
    }

    public List<e> d() {
        return this.f18627c.a();
    }

    public boolean e() {
        return this.f18634k != null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f18631g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f18630f && !this.f18631g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f18631g) {
            return;
        }
        this.f18628d.clear();
        removeAllFriendlyObstructions();
        this.f18631g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f18629e = null;
        this.f18634k = null;
    }

    public boolean g() {
        return this.f18631g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f18632h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18629e;
    }

    public boolean h() {
        return this.f18626b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f18626b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f18630f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f18633j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f18631g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f18631g) {
            return;
        }
        this.f18627c.b();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f18631g) {
            return;
        }
        this.f18627c.c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f18634k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f18630f) {
            return;
        }
        this.f18630f = true;
        c.c().c(this);
        this.f18629e.a(i.c().b());
        this.f18629e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.f18629e.a(this, this.f18625a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f18627c = new f();
        this.f18630f = false;
        this.f18631g = false;
        this.f18626b = adSessionConfiguration;
        this.f18625a = adSessionContext;
        this.f18632h = str;
        b(null);
        this.f18629e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.bytedance2.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18629e.i();
        c.c().a(this);
        this.f18629e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f18628d.clear();
            }
        }
    }

    private void b(View view) {
        this.f18628d = new com.iab.omid.library.bytedance2.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.bytedance2.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.bytedance2.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f18634k.onPossibleObstructionsDetected(this.f18632h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f18633j = true;
    }
}
