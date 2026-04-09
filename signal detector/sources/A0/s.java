package a0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public C0244C f4603d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4604e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f4605f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4606g;

    /* renamed from: h, reason: collision with root package name */
    public u f4607h;
    public Iterator i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4608j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0244C f4609k;

    /* renamed from: l, reason: collision with root package name */
    public int f4610l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C0244C c0244c, j5.b bVar) {
        super(bVar);
        this.f4609k = c0244c;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4608j = obj;
        this.f4610l |= LinearLayoutManager.INVALID_OFFSET;
        return this.f4609k.c(this);
    }
}
