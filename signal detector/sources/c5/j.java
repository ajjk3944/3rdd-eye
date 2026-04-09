package C5;

import androidx.recyclerview.widget.LinearLayoutManager;
import i5.EnumC2380a;
import z5.T;

/* loaded from: classes3.dex */
public final class j extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public k f1172d;

    /* renamed from: e, reason: collision with root package name */
    public c f1173e;

    /* renamed from: f, reason: collision with root package name */
    public m f1174f;

    /* renamed from: g, reason: collision with root package name */
    public T f1175g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1176h;
    public final /* synthetic */ k i;

    /* renamed from: j, reason: collision with root package name */
    public int f1177j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, j5.b bVar) {
        super(bVar);
        this.i = kVar;
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        this.f1176h = obj;
        this.f1177j |= LinearLayoutManager.INVALID_OFFSET;
        k.K(this.i, null, this);
        return EnumC2380a.f20635a;
    }
}
