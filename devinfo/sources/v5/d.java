package v5;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import nk.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f35861a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f35862b;

    /* renamed from: c, reason: collision with root package name */
    public j f35863c;

    /* renamed from: d, reason: collision with root package name */
    public u f35864d;

    /* renamed from: e, reason: collision with root package name */
    public ck.h f35865e;

    /* renamed from: f, reason: collision with root package name */
    public u f35866f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f35867h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f35868i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ek.c cVar) {
        super(cVar);
        this.f35868i = eVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f35867h = obj;
        this.j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f35868i.I(false, null, this);
    }
}
