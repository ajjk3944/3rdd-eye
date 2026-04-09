package p4;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FileInputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f31164a;

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f31165b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31166c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f31167d;

    /* renamed from: e, reason: collision with root package name */
    public int f31168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, ek.c cVar) {
        super(cVar);
        this.f31167d = b0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31166c = obj;
        this.f31168e |= LinearLayoutManager.INVALID_OFFSET;
        return b0.a(this.f31167d, this);
    }
}
