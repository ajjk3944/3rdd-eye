package p4;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public gl.c f31281a;

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f31282b;

    /* renamed from: c, reason: collision with root package name */
    public FileLock f31283c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31284d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0 f31286f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, ek.c cVar) {
        super(cVar);
        this.f31286f = r0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31285e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31286f.e(null, this);
    }
}
