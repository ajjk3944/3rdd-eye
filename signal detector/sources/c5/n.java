package C5;

import androidx.recyclerview.widget.LinearLayoutManager;
import i5.EnumC2380a;
import z5.T;

/* loaded from: classes3.dex */
public final class n extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public o f1189d;

    /* renamed from: e, reason: collision with root package name */
    public c f1190e;

    /* renamed from: f, reason: collision with root package name */
    public p f1191f;

    /* renamed from: g, reason: collision with root package name */
    public T f1192g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1193h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f1194j;

    /* renamed from: k, reason: collision with root package name */
    public int f1195k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, j5.b bVar) {
        super(bVar);
        this.f1194j = oVar;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.i = obj;
        this.f1195k |= LinearLayoutManager.INVALID_OFFSET;
        this.f1194j.k(null, this);
        return EnumC2380a.f20635a;
    }
}
