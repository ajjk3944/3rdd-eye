package a0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.Iterator;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249c extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public Serializable f4566d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f4567e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4568f;

    /* renamed from: g, reason: collision with root package name */
    public int f4569g;

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4568f = obj;
        this.f4569g |= LinearLayoutManager.INVALID_OFFSET;
        return a4.t.a(null, null, this);
    }
}
