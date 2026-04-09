package v8;

import androidx.recyclerview.widget.RecyclerView;
import h9.e;
import java.util.ArrayList;

/* compiled from: ContactSupportManager.kt */
@e(c = "com.zipoapps.premiumhelper.support.ContactSupportManager", f = "ContactSupportManager.kt", l = {152, 160}, m = "prepareAttachment")
/* loaded from: classes3.dex */
public final class c extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Object f47083l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f47084m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f47085n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f47086o;

    /* renamed from: p, reason: collision with root package name */
    public int f47087p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, h9.c cVar) {
        super(cVar);
        this.f47086o = bVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47085n = obj;
        this.f47087p |= RecyclerView.UNDEFINED_DURATION;
        return b.b(this.f47086o, null, this);
    }
}
