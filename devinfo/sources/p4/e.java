package p4;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f31186a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f31187b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31188c;

    /* renamed from: d, reason: collision with root package name */
    public int f31189d;

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31188c = obj;
        this.f31189d |= LinearLayoutManager.INVALID_OFFSET;
        return pk.a.a(null, null, this);
    }
}
