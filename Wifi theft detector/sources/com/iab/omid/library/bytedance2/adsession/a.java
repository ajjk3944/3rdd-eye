package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

/* loaded from: classes3.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f12325a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f12326b;

    /* renamed from: c, reason: collision with root package name */
    private final f f12327c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.weakreference.a f12328d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f12329e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12330f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12331g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12332h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12333i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12334j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f12335k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f12333i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f12334j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f12331g) {
            return;
        }
        this.f12327c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f12328d.get();
    }

    public List<e> d() {
        return this.f12327c.a();
    }

    public boolean e() {
        return this.f12335k != null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f12331g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f12330f && !this.f12331g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f12331g) {
            return;
        }
        this.f12328d.clear();
        removeAllFriendlyObstructions();
        this.f12331g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f12329e = null;
        this.f12335k = null;
    }

    public boolean g() {
        return this.f12331g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f12332h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f12329e;
    }

    public boolean h() {
        return this.f12326b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f12326b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f12330f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f12333i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f12334j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f12331g) {
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
        if (this.f12331g) {
            return;
        }
        this.f12327c.b();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f12331g) {
            return;
        }
        this.f12327c.c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f12335k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f12330f) {
            return;
        }
        this.f12330f = true;
        c.c().c(this);
        this.f12329e.a(i.c().b());
        this.f12329e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.f12329e.a(this, this.f12325a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f12327c = new f();
        this.f12330f = false;
        this.f12331g = false;
        this.f12326b = adSessionConfiguration;
        this.f12325a = adSessionContext;
        this.f12332h = str;
        b(null);
        this.f12329e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.bytedance2.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f12329e.i();
        c.c().a(this);
        this.f12329e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f12328d.clear();
            }
        }
    }

    private void b(View view) {
        this.f12328d = new com.iab.omid.library.bytedance2.weakreference.a(view);
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
            this.f12335k.onPossibleObstructionsDetected(this.f12332h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f12334j = true;
    }
}
