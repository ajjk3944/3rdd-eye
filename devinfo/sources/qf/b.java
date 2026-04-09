package qf;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Map f32288a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f32289b;

    /* renamed from: c, reason: collision with root package name */
    public d f32290c;

    /* renamed from: d, reason: collision with root package name */
    public gl.c f32291d;

    /* renamed from: e, reason: collision with root package name */
    public Map f32292e;

    /* renamed from: f, reason: collision with root package name */
    public Object f32293f;
    public /* synthetic */ Object g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f32294h;

    /* renamed from: i, reason: collision with root package name */
    public int f32295i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ek.c cVar2) {
        super(cVar2);
        this.f32294h = cVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.f32295i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32294h.b(this);
    }
}
