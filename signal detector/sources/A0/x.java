package a0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class x extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public C0244C f4630d;

    /* renamed from: e, reason: collision with root package name */
    public FileInputStream f4631e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0244C f4633g;

    /* renamed from: h, reason: collision with root package name */
    public int f4634h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0244C c0244c, j5.b bVar) {
        super(bVar);
        this.f4633g = c0244c;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4632f = obj;
        this.f4634h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f4633g.f(this);
    }
}
