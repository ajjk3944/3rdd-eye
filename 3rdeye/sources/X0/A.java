package X0;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: SingleProcessDataStore.kt */
@h9.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
/* loaded from: classes.dex */
public final class A extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public o f13417l;

    /* renamed from: m, reason: collision with root package name */
    public File f13418m;

    /* renamed from: n, reason: collision with root package name */
    public FileOutputStream f13419n;

    /* renamed from: o, reason: collision with root package name */
    public FileOutputStream f13420o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f13421p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o<Object> f13422q;

    /* renamed from: r, reason: collision with root package name */
    public int f13423r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(o oVar, h9.c cVar) {
        super(cVar);
        this.f13422q = oVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f13421p = obj;
        this.f13423r |= RecyclerView.UNDEFINED_DURATION;
        return this.f13422q.j(null, this);
    }
}
