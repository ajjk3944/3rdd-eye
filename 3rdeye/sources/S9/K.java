package S9;

import androidx.recyclerview.widget.RecyclerView;
import b9.AbstractC1995b;
import h9.AbstractC4424a;
import java.util.LinkedHashMap;

/* compiled from: JsonTreeReader.kt */
@h9.e(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {23}, m = "readObject")
/* loaded from: classes3.dex */
public final class K extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public AbstractC1995b f12033l;

    /* renamed from: m, reason: collision with root package name */
    public C1578j f12034m;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashMap f12035n;

    /* renamed from: o, reason: collision with root package name */
    public String f12036o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f12037p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1578j f12038q;

    /* renamed from: r, reason: collision with root package name */
    public int f12039r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C1578j c1578j, AbstractC4424a abstractC4424a) {
        super(abstractC4424a);
        this.f12038q = c1578j;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f12037p = obj;
        this.f12039r |= RecyclerView.UNDEFINED_DURATION;
        return C1578j.a(this.f12038q, null, this);
    }
}
