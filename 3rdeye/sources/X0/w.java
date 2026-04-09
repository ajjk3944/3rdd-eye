package X0;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FileInputStream;
import java.util.LinkedHashSet;

/* compiled from: SingleProcessDataStore.kt */
@h9.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
/* loaded from: classes.dex */
public final class w extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public o f13519l;

    /* renamed from: m, reason: collision with root package name */
    public FileInputStream f13520m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f13521n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o<Object> f13522o;

    /* renamed from: p, reason: collision with root package name */
    public int f13523p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(o oVar, h9.c cVar) {
        super(cVar);
        this.f13522o = oVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f13521n = obj;
        this.f13523p |= RecyclerView.UNDEFINED_DURATION;
        LinkedHashSet linkedHashSet = o.f13452k;
        return this.f13522o.g(this);
    }
}
