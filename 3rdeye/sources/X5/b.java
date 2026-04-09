package x5;

import androidx.recyclerview.widget.RecyclerView;
import h9.e;
import java.util.Iterator;
import java.util.Map;
import x5.c;

/* compiled from: FirebaseSessionsDependencies.kt */
@e(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {124}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
/* loaded from: classes2.dex */
public final class b extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Map f47777l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f47778m;

    /* renamed from: n, reason: collision with root package name */
    public c.a f47779n;

    /* renamed from: o, reason: collision with root package name */
    public K9.a f47780o;

    /* renamed from: p, reason: collision with root package name */
    public Map f47781p;

    /* renamed from: q, reason: collision with root package name */
    public Object f47782q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f47783r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C5768a f47784s;

    /* renamed from: t, reason: collision with root package name */
    public int f47785t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C5768a c5768a, h9.c cVar) {
        super(cVar);
        this.f47784s = c5768a;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47783r = obj;
        this.f47785t |= RecyclerView.UNDEFINED_DURATION;
        return this.f47784s.b(this);
    }
}
