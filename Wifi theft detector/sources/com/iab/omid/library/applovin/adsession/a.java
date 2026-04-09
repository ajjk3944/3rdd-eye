package com.iab.omid.library.applovin.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
    private final AdSessionContext f12190a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f12191b;

    /* renamed from: c, reason: collision with root package name */
    private final f f12192c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f12193d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f12194e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12195f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12196g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12197h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12198i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12199j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f12200k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f12198i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f12199j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f12196g) {
            return;
        }
        this.f12192c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f12197h;
    }

    public AdSessionStatePublisher d() {
        return this.f12194e;
    }

    public View e() {
        return this.f12193d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f12196g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f12192c.a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f12196g) {
            return;
        }
        this.f12193d.clear();
        removeAllFriendlyObstructions();
        this.f12196g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f12194e = null;
        this.f12200k = null;
    }

    public boolean g() {
        return this.f12200k != null;
    }

    public boolean h() {
        return this.f12195f && !this.f12196g;
    }

    public boolean i() {
        return this.f12196g;
    }

    public boolean j() {
        return this.f12191b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f12191b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f12195f;
    }

    public void m() {
        a();
        d().g();
        this.f12198i = true;
    }

    public void n() {
        b();
        d().h();
        this.f12199j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f12196g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f12196g) {
            return;
        }
        this.f12192c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f12196g) {
            return;
        }
        this.f12192c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f12200k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f12195f || this.f12194e == null) {
            return;
        }
        this.f12195f = true;
        c.c().c(this);
        this.f12194e.a(i.c().b());
        this.f12194e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f12194e.a(this, this.f12190a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f12192c = new f();
        this.f12195f = false;
        this.f12196g = false;
        this.f12191b = adSessionConfiguration;
        this.f12190a = adSessionContext;
        this.f12197h = str;
        b(null);
        this.f12194e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f12194e.i();
        c.c().a(this);
        this.f12194e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f12193d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f12193d = new com.iab.omid.library.applovin.weakreference.a(view);
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
            this.f12200k.onPossibleObstructionsDetected(this.f12197h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f12199j = true;
    }
}
