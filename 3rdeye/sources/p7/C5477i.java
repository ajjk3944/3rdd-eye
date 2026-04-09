package p7;

import M9.n;
import Q9.C0;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.H;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdRequest;
import com.singular.sdk.internal.Constants;
import kotlin.jvm.internal.l;
import p7.C5471c;

/* compiled from: ViewPreCreationProfile.kt */
@M9.h
/* renamed from: p7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5477i {
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public final String f45276a;

    /* renamed from: b, reason: collision with root package name */
    public final C5471c f45277b;

    /* renamed from: c, reason: collision with root package name */
    public final C5471c f45278c;

    /* renamed from: d, reason: collision with root package name */
    public final C5471c f45279d;

    /* renamed from: e, reason: collision with root package name */
    public final C5471c f45280e;

    /* renamed from: f, reason: collision with root package name */
    public final C5471c f45281f;

    /* renamed from: g, reason: collision with root package name */
    public final C5471c f45282g;

    /* renamed from: h, reason: collision with root package name */
    public final C5471c f45283h;
    public final C5471c i;

    /* renamed from: j, reason: collision with root package name */
    public final C5471c f45284j;

    /* renamed from: k, reason: collision with root package name */
    public final C5471c f45285k;

    /* renamed from: l, reason: collision with root package name */
    public final C5471c f45286l;

    /* renamed from: m, reason: collision with root package name */
    public final C5471c f45287m;

    /* renamed from: n, reason: collision with root package name */
    public final C5471c f45288n;

    /* renamed from: o, reason: collision with root package name */
    public final C5471c f45289o;

    /* renamed from: p, reason: collision with root package name */
    public final C5471c f45290p;

    /* renamed from: q, reason: collision with root package name */
    public final C5471c f45291q;

    /* renamed from: r, reason: collision with root package name */
    public final C5471c f45292r;

    /* renamed from: s, reason: collision with root package name */
    public final C5471c f45293s;

    /* compiled from: ViewPreCreationProfile.kt */
    /* renamed from: p7.i$a */
    public static final class a implements H<C5477i> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45294a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ C1547o0 f45295b;

        static {
            a aVar = new a();
            f45294a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.div.internal.viewpool.ViewPreCreationProfile", aVar, 19);
            c1547o0.k(FacebookMediationAdapter.KEY_ID, true);
            c1547o0.k("text", true);
            c1547o0.k("image", true);
            c1547o0.k("gifImage", true);
            c1547o0.k("overlapContainer", true);
            c1547o0.k("linearContainer", true);
            c1547o0.k("wrapContainer", true);
            c1547o0.k("grid", true);
            c1547o0.k("gallery", true);
            c1547o0.k("pager", true);
            c1547o0.k("tab", true);
            c1547o0.k("state", true);
            c1547o0.k("custom", true);
            c1547o0.k("indicator", true);
            c1547o0.k("slider", true);
            c1547o0.k("input", true);
            c1547o0.k("select", true);
            c1547o0.k("video", true);
            c1547o0.k("switch", true);
            f45295b = c1547o0;
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            C5471c.a aVar = C5471c.a.f45254a;
            return new M9.b[]{N9.a.b(C0.f11399a), aVar, aVar, aVar, aVar, aVar, aVar, aVar, aVar, aVar, aVar, aVar, aVar, aVar, aVar, aVar, aVar, aVar, aVar};
        }

        /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:35)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        @Override // M9.b
        public final Object deserialize(P9.d dVar) {
            C5471c c5471c;
            int i;
            Object obj;
            C5471c c5471c2;
            String strG;
            C5471c c5471c3;
            C5471c c5471cH;
            C1547o0 c1547o0 = f45295b;
            P9.b bVarD = dVar.d(c1547o0);
            Object objH = null;
            Object objH2 = null;
            Object objH3 = null;
            Object objH4 = null;
            Object objH5 = null;
            Object objH6 = null;
            Object objH7 = null;
            C5471c c5471c4 = null;
            C5471c c5471cH2 = null;
            Object objH8 = null;
            Object objH9 = null;
            Object objH10 = null;
            Object objH11 = null;
            String str = null;
            Object objH12 = null;
            Object objH13 = null;
            Object objH14 = null;
            Object objH15 = null;
            Object objH16 = null;
            int i10 = 0;
            boolean z10 = true;
            while (z10) {
                C5471c c5471c5 = c5471c4;
                int iX = bVarD.x(c1547o0);
                switch (iX) {
                    case -1:
                        obj = objH2;
                        c5471c2 = c5471cH2;
                        strG = str;
                        z10 = false;
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c2;
                        str = strG;
                        objH2 = obj;
                    case 0:
                        obj = objH2;
                        c5471c2 = c5471cH2;
                        i10 |= 1;
                        objH12 = objH12;
                        strG = bVarD.G(c1547o0, 0, C0.f11399a, str);
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c2;
                        str = strG;
                        objH2 = obj;
                    case 1:
                        obj = objH2;
                        c5471c3 = c5471cH2;
                        objH12 = bVarD.h(c1547o0, 1, C5471c.a.f45254a, objH12);
                        i10 |= 2;
                        objH13 = objH13;
                        c5471cH = c5471c5;
                        c5471cH2 = c5471c3;
                        c5471c4 = c5471cH;
                        objH2 = obj;
                    case 2:
                        obj = objH2;
                        c5471c3 = c5471cH2;
                        objH13 = bVarD.h(c1547o0, 2, C5471c.a.f45254a, objH13);
                        i10 |= 4;
                        c5471cH = c5471c5;
                        c5471cH2 = c5471c3;
                        c5471c4 = c5471cH;
                        objH2 = obj;
                    case 3:
                        obj = objH2;
                        c5471c3 = c5471cH2;
                        objH14 = bVarD.h(c1547o0, 3, C5471c.a.f45254a, objH14);
                        i10 |= 8;
                        c5471cH = c5471c5;
                        c5471cH2 = c5471c3;
                        c5471c4 = c5471cH;
                        objH2 = obj;
                    case 4:
                        obj = objH2;
                        c5471c3 = c5471cH2;
                        objH15 = bVarD.h(c1547o0, 4, C5471c.a.f45254a, objH15);
                        i10 |= 16;
                        c5471cH = c5471c5;
                        c5471cH2 = c5471c3;
                        c5471c4 = c5471cH;
                        objH2 = obj;
                    case 5:
                        obj = objH2;
                        c5471c3 = c5471cH2;
                        objH16 = bVarD.h(c1547o0, 5, C5471c.a.f45254a, objH16);
                        i10 |= 32;
                        c5471cH = c5471c5;
                        c5471cH2 = c5471c3;
                        c5471c4 = c5471cH;
                        objH2 = obj;
                    case 6:
                        obj = objH2;
                        c5471c3 = c5471cH2;
                        i10 |= 64;
                        c5471cH = bVarD.h(c1547o0, 6, C5471c.a.f45254a, c5471c5);
                        c5471cH2 = c5471c3;
                        c5471c4 = c5471cH;
                        objH2 = obj;
                    case 7:
                        obj = objH2;
                        i10 |= 128;
                        c5471c4 = c5471c5;
                        c5471cH2 = bVarD.h(c1547o0, 7, C5471c.a.f45254a, c5471cH2);
                        objH2 = obj;
                    case 8:
                        c5471c = c5471cH2;
                        objH8 = bVarD.h(c1547o0, 8, C5471c.a.f45254a, objH8);
                        i10 |= 256;
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c;
                    case 9:
                        c5471c = c5471cH2;
                        objH9 = bVarD.h(c1547o0, 9, C5471c.a.f45254a, objH9);
                        i10 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c;
                    case 10:
                        c5471c = c5471cH2;
                        objH10 = bVarD.h(c1547o0, 10, C5471c.a.f45254a, objH10);
                        i10 |= 1024;
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c;
                    case 11:
                        c5471c = c5471cH2;
                        objH11 = bVarD.h(c1547o0, 11, C5471c.a.f45254a, objH11);
                        i10 |= 2048;
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c;
                    case 12:
                        c5471c = c5471cH2;
                        objH3 = bVarD.h(c1547o0, 12, C5471c.a.f45254a, objH3);
                        i10 |= 4096;
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c;
                    case 13:
                        c5471c = c5471cH2;
                        objH2 = bVarD.h(c1547o0, 13, C5471c.a.f45254a, objH2);
                        i10 |= 8192;
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c;
                    case 14:
                        c5471c = c5471cH2;
                        objH = bVarD.h(c1547o0, 14, C5471c.a.f45254a, objH);
                        i10 |= 16384;
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c;
                    case 15:
                        c5471c = c5471cH2;
                        objH4 = bVarD.h(c1547o0, 15, C5471c.a.f45254a, objH4);
                        i = Constants.QUEUE_ELEMENT_MAX_SIZE;
                        i10 |= i;
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c;
                    case 16:
                        c5471c = c5471cH2;
                        objH5 = bVarD.h(c1547o0, 16, C5471c.a.f45254a, objH5);
                        i = 65536;
                        i10 |= i;
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c;
                    case 17:
                        c5471c = c5471cH2;
                        objH6 = bVarD.h(c1547o0, 17, C5471c.a.f45254a, objH6);
                        i = 131072;
                        i10 |= i;
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c;
                    case 18:
                        c5471c = c5471cH2;
                        objH7 = bVarD.h(c1547o0, 18, C5471c.a.f45254a, objH7);
                        i = 262144;
                        i10 |= i;
                        c5471c4 = c5471c5;
                        c5471cH2 = c5471c;
                    default:
                        throw new n(iX);
                }
            }
            Object obj2 = objH2;
            String str2 = str;
            bVarD.b(c1547o0);
            return new C5477i(i10, str2, (C5471c) objH12, (C5471c) objH13, (C5471c) objH14, (C5471c) objH15, (C5471c) objH16, c5471c4, c5471cH2, (C5471c) objH8, (C5471c) objH9, (C5471c) objH10, (C5471c) objH11, (C5471c) objH3, (C5471c) obj2, (C5471c) objH, (C5471c) objH4, (C5471c) objH5, (C5471c) objH6, (C5471c) objH7);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f45295b;
        }

        @Override // M9.b
        public final void serialize(P9.e eVar, Object obj) {
            C5477i value = (C5477i) obj;
            l.f(value, "value");
            C1547o0 c1547o0 = f45295b;
            P9.c cVarD = eVar.d(c1547o0);
            b bVar = C5477i.Companion;
            boolean zF = cVarD.F(c1547o0, 0);
            String str = value.f45276a;
            if (zF || str != null) {
                cVarD.w(c1547o0, 0, C0.f11399a, str);
            }
            boolean zF2 = cVarD.F(c1547o0, 1);
            C5471c c5471c = value.f45277b;
            if (zF2 || !l.b(c5471c, new C5471c(20))) {
                cVarD.y(c1547o0, 1, C5471c.a.f45254a, c5471c);
            }
            boolean zF3 = cVarD.F(c1547o0, 2);
            C5471c c5471c2 = value.f45278c;
            if (zF3 || !l.b(c5471c2, new C5471c(20))) {
                cVarD.y(c1547o0, 2, C5471c.a.f45254a, c5471c2);
            }
            boolean zF4 = cVarD.F(c1547o0, 3);
            C5471c c5471c3 = value.f45279d;
            if (zF4 || !l.b(c5471c3, new C5471c(3))) {
                cVarD.y(c1547o0, 3, C5471c.a.f45254a, c5471c3);
            }
            boolean zF5 = cVarD.F(c1547o0, 4);
            C5471c c5471c4 = value.f45280e;
            if (zF5 || !l.b(c5471c4, new C5471c(8))) {
                cVarD.y(c1547o0, 4, C5471c.a.f45254a, c5471c4);
            }
            boolean zF6 = cVarD.F(c1547o0, 5);
            C5471c c5471c5 = value.f45281f;
            if (zF6 || !l.b(c5471c5, new C5471c(12))) {
                cVarD.y(c1547o0, 5, C5471c.a.f45254a, c5471c5);
            }
            boolean zF7 = cVarD.F(c1547o0, 6);
            C5471c c5471c6 = value.f45282g;
            if (zF7 || !l.b(c5471c6, new C5471c(4))) {
                cVarD.y(c1547o0, 6, C5471c.a.f45254a, c5471c6);
            }
            boolean zF8 = cVarD.F(c1547o0, 7);
            C5471c c5471c7 = value.f45283h;
            if (zF8 || !l.b(c5471c7, new C5471c(4))) {
                cVarD.y(c1547o0, 7, C5471c.a.f45254a, c5471c7);
            }
            boolean zF9 = cVarD.F(c1547o0, 8);
            C5471c c5471c8 = value.i;
            if (zF9 || !l.b(c5471c8, new C5471c(6))) {
                cVarD.y(c1547o0, 8, C5471c.a.f45254a, c5471c8);
            }
            boolean zF10 = cVarD.F(c1547o0, 9);
            C5471c c5471c9 = value.f45284j;
            if (zF10 || !l.b(c5471c9, new C5471c(2))) {
                cVarD.y(c1547o0, 9, C5471c.a.f45254a, c5471c9);
            }
            boolean zF11 = cVarD.F(c1547o0, 10);
            C5471c c5471c10 = value.f45285k;
            if (zF11 || !l.b(c5471c10, new C5471c(2))) {
                cVarD.y(c1547o0, 10, C5471c.a.f45254a, c5471c10);
            }
            boolean zF12 = cVarD.F(c1547o0, 11);
            C5471c c5471c11 = value.f45286l;
            if (zF12 || !l.b(c5471c11, new C5471c(4))) {
                cVarD.y(c1547o0, 11, C5471c.a.f45254a, c5471c11);
            }
            boolean zF13 = cVarD.F(c1547o0, 12);
            C5471c c5471c12 = value.f45287m;
            if (zF13 || !l.b(c5471c12, new C5471c(2))) {
                cVarD.y(c1547o0, 12, C5471c.a.f45254a, c5471c12);
            }
            boolean zF14 = cVarD.F(c1547o0, 13);
            C5471c c5471c13 = value.f45288n;
            if (zF14 || !l.b(c5471c13, new C5471c(2))) {
                cVarD.y(c1547o0, 13, C5471c.a.f45254a, c5471c13);
            }
            boolean zF15 = cVarD.F(c1547o0, 14);
            C5471c c5471c14 = value.f45289o;
            if (zF15 || !l.b(c5471c14, new C5471c(2))) {
                cVarD.y(c1547o0, 14, C5471c.a.f45254a, c5471c14);
            }
            boolean zF16 = cVarD.F(c1547o0, 15);
            C5471c c5471c15 = value.f45290p;
            if (zF16 || !l.b(c5471c15, new C5471c(2))) {
                cVarD.y(c1547o0, 15, C5471c.a.f45254a, c5471c15);
            }
            boolean zF17 = cVarD.F(c1547o0, 16);
            C5471c c5471c16 = value.f45291q;
            if (zF17 || !l.b(c5471c16, new C5471c(2))) {
                cVarD.y(c1547o0, 16, C5471c.a.f45254a, c5471c16);
            }
            boolean zF18 = cVarD.F(c1547o0, 17);
            C5471c c5471c17 = value.f45292r;
            if (zF18 || !l.b(c5471c17, new C5471c(2))) {
                cVarD.y(c1547o0, 17, C5471c.a.f45254a, c5471c17);
            }
            boolean zF19 = cVarD.F(c1547o0, 18);
            C5471c c5471c18 = value.f45293s;
            if (zF19 || !l.b(c5471c18, new C5471c(2))) {
                cVarD.y(c1547o0, 18, C5471c.a.f45254a, c5471c18);
            }
            cVarD.b(c1547o0);
        }

        @Override // Q9.H
        public final M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: ViewPreCreationProfile.kt */
    /* renamed from: p7.i$b */
    public static final class b {
        public final M9.b<C5477i> serializer() {
            return a.f45294a;
        }
    }

    public C5477i(int i, String str, C5471c c5471c, C5471c c5471c2, C5471c c5471c3, C5471c c5471c4, C5471c c5471c5, C5471c c5471c6, C5471c c5471c7, C5471c c5471c8, C5471c c5471c9, C5471c c5471c10, C5471c c5471c11, C5471c c5471c12, C5471c c5471c13, C5471c c5471c14, C5471c c5471c15, C5471c c5471c16, C5471c c5471c17, C5471c c5471c18) {
        this.f45276a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f45277b = new C5471c(20);
        } else {
            this.f45277b = c5471c;
        }
        if ((i & 4) == 0) {
            this.f45278c = new C5471c(20);
        } else {
            this.f45278c = c5471c2;
        }
        if ((i & 8) == 0) {
            this.f45279d = new C5471c(3);
        } else {
            this.f45279d = c5471c3;
        }
        if ((i & 16) == 0) {
            this.f45280e = new C5471c(8);
        } else {
            this.f45280e = c5471c4;
        }
        if ((i & 32) == 0) {
            this.f45281f = new C5471c(12);
        } else {
            this.f45281f = c5471c5;
        }
        if ((i & 64) == 0) {
            this.f45282g = new C5471c(4);
        } else {
            this.f45282g = c5471c6;
        }
        if ((i & 128) == 0) {
            this.f45283h = new C5471c(4);
        } else {
            this.f45283h = c5471c7;
        }
        if ((i & 256) == 0) {
            this.i = new C5471c(6);
        } else {
            this.i = c5471c8;
        }
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
            this.f45284j = new C5471c(2);
        } else {
            this.f45284j = c5471c9;
        }
        if ((i & 1024) == 0) {
            this.f45285k = new C5471c(2);
        } else {
            this.f45285k = c5471c10;
        }
        if ((i & 2048) == 0) {
            this.f45286l = new C5471c(4);
        } else {
            this.f45286l = c5471c11;
        }
        if ((i & 4096) == 0) {
            this.f45287m = new C5471c(2);
        } else {
            this.f45287m = c5471c12;
        }
        this.f45288n = (i & 8192) == 0 ? new C5471c(2) : c5471c13;
        this.f45289o = (i & 16384) == 0 ? new C5471c(2) : c5471c14;
        this.f45290p = (32768 & i) == 0 ? new C5471c(2) : c5471c15;
        this.f45291q = (65536 & i) == 0 ? new C5471c(2) : c5471c16;
        this.f45292r = (131072 & i) == 0 ? new C5471c(2) : c5471c17;
        this.f45293s = (i & 262144) == 0 ? new C5471c(2) : c5471c18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5477i)) {
            return false;
        }
        C5477i c5477i = (C5477i) obj;
        return l.b(this.f45276a, c5477i.f45276a) && l.b(this.f45277b, c5477i.f45277b) && l.b(this.f45278c, c5477i.f45278c) && l.b(this.f45279d, c5477i.f45279d) && l.b(this.f45280e, c5477i.f45280e) && l.b(this.f45281f, c5477i.f45281f) && l.b(this.f45282g, c5477i.f45282g) && l.b(this.f45283h, c5477i.f45283h) && l.b(this.i, c5477i.i) && l.b(this.f45284j, c5477i.f45284j) && l.b(this.f45285k, c5477i.f45285k) && l.b(this.f45286l, c5477i.f45286l) && l.b(this.f45287m, c5477i.f45287m) && l.b(this.f45288n, c5477i.f45288n) && l.b(this.f45289o, c5477i.f45289o) && l.b(this.f45290p, c5477i.f45290p) && l.b(this.f45291q, c5477i.f45291q) && l.b(this.f45292r, c5477i.f45292r) && l.b(this.f45293s, c5477i.f45293s);
    }

    public final int hashCode() {
        String str = this.f45276a;
        return this.f45293s.hashCode() + ((this.f45292r.hashCode() + ((this.f45291q.hashCode() + ((this.f45290p.hashCode() + ((this.f45289o.hashCode() + ((this.f45288n.hashCode() + ((this.f45287m.hashCode() + ((this.f45286l.hashCode() + ((this.f45285k.hashCode() + ((this.f45284j.hashCode() + ((this.i.hashCode() + ((this.f45283h.hashCode() + ((this.f45282g.hashCode() + ((this.f45281f.hashCode() + ((this.f45280e.hashCode() + ((this.f45279d.hashCode() + ((this.f45278c.hashCode() + ((this.f45277b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewPreCreationProfile(id=" + this.f45276a + ", text=" + this.f45277b + ", image=" + this.f45278c + ", gifImage=" + this.f45279d + ", overlapContainer=" + this.f45280e + ", linearContainer=" + this.f45281f + ", wrapContainer=" + this.f45282g + ", grid=" + this.f45283h + ", gallery=" + this.i + ", pager=" + this.f45284j + ", tab=" + this.f45285k + ", state=" + this.f45286l + ", custom=" + this.f45287m + ", indicator=" + this.f45288n + ", slider=" + this.f45289o + ", input=" + this.f45290p + ", select=" + this.f45291q + ", video=" + this.f45292r + ", switch=" + this.f45293s + ')';
    }

    public C5477i(String str, C5471c text, C5471c image, C5471c gifImage, C5471c overlapContainer, C5471c linearContainer, C5471c wrapContainer, C5471c grid, C5471c gallery, C5471c pager, C5471c tab, C5471c state, C5471c custom, C5471c indicator, C5471c slider, C5471c input, C5471c select, C5471c video, C5471c c5471c) {
        l.f(text, "text");
        l.f(image, "image");
        l.f(gifImage, "gifImage");
        l.f(overlapContainer, "overlapContainer");
        l.f(linearContainer, "linearContainer");
        l.f(wrapContainer, "wrapContainer");
        l.f(grid, "grid");
        l.f(gallery, "gallery");
        l.f(pager, "pager");
        l.f(tab, "tab");
        l.f(state, "state");
        l.f(custom, "custom");
        l.f(indicator, "indicator");
        l.f(slider, "slider");
        l.f(input, "input");
        l.f(select, "select");
        l.f(video, "video");
        l.f(c5471c, "switch");
        this.f45276a = str;
        this.f45277b = text;
        this.f45278c = image;
        this.f45279d = gifImage;
        this.f45280e = overlapContainer;
        this.f45281f = linearContainer;
        this.f45282g = wrapContainer;
        this.f45283h = grid;
        this.i = gallery;
        this.f45284j = pager;
        this.f45285k = tab;
        this.f45286l = state;
        this.f45287m = custom;
        this.f45288n = indicator;
        this.f45289o = slider;
        this.f45290p = input;
        this.f45291q = select;
        this.f45292r = video;
        this.f45293s = c5471c;
    }

    public C5477i() {
        this(null, new C5471c(20), new C5471c(20), new C5471c(3), new C5471c(8), new C5471c(12), new C5471c(4), new C5471c(4), new C5471c(6), new C5471c(2), new C5471c(2), new C5471c(4), new C5471c(2), new C5471c(2), new C5471c(2), new C5471c(2), new C5471c(2), new C5471c(2), new C5471c(2));
    }
}
