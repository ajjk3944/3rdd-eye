package a0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: a0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243B extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public C0244C f4546d;

    /* renamed from: e, reason: collision with root package name */
    public File f4547e;

    /* renamed from: f, reason: collision with root package name */
    public FileOutputStream f4548f;

    /* renamed from: g, reason: collision with root package name */
    public FileOutputStream f4549g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4550h;
    public final /* synthetic */ C0244C i;

    /* renamed from: j, reason: collision with root package name */
    public int f4551j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0243B(C0244C c0244c, j5.b bVar) {
        super(bVar);
        this.i = c0244c;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4550h = obj;
        this.f4551j |= LinearLayoutManager.INVALID_OFFSET;
        return this.i.j(this, null);
    }
}
