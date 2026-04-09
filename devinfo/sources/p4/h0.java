package p4;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public FileOutputStream f31217a;

    /* renamed from: b, reason: collision with root package name */
    public FileOutputStream f31218b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31219c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f31220d;

    /* renamed from: e, reason: collision with root package name */
    public int f31221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, ek.c cVar) {
        super(cVar);
        this.f31220d = i0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31219c = obj;
        this.f31221e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31220d.b(null, this);
    }
}
