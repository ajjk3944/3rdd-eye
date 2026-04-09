package ec;

import android.content.SharedPreferences;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f22536a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22537b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22538c;

    /* renamed from: d, reason: collision with root package name */
    public long f22539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f22540e;

    public a1(b1 b1Var, String str, long j) {
        Objects.requireNonNull(b1Var);
        this.f22540e = b1Var;
        pb.y.e(str);
        this.f22536a = str;
        this.f22537b = j;
    }

    public final long a() {
        if (!this.f22538c) {
            this.f22538c = true;
            this.f22539d = this.f22540e.F().getLong(this.f22536a, this.f22537b);
        }
        return this.f22539d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.f22540e.F().edit();
        editorEdit.putLong(this.f22536a, j);
        editorEdit.apply();
        this.f22539d = j;
    }
}
