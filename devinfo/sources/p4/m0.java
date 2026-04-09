package p4;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m0 extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public FileOutputStream f31250a;

    /* renamed from: b, reason: collision with root package name */
    public long f31251b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31252c;

    /* renamed from: d, reason: collision with root package name */
    public int f31253d;

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31252c = obj;
        this.f31253d |= LinearLayoutManager.INVALID_OFFSET;
        return d1.a(null, this);
    }
}
