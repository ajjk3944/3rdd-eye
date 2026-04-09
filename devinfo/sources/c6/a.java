package c6;

import a6.e;
import a6.f;
import android.os.Bundle;
import androidx.lifecycle.s;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f2762a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2763b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2766e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f2767f;
    public boolean g;

    /* renamed from: c, reason: collision with root package name */
    public final bf.f f2764c = new bf.f(7);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2765d = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f2768h = true;

    public a(f fVar, e eVar) {
        this.f2762a = fVar;
        this.f2763b = eVar;
    }

    public final void a() {
        f fVar = this.f2762a;
        if (fVar.j().f1110d != s.f1181b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f2766e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f2763b.invoke();
        fVar.j().a(new d.e(2, this));
        this.f2766e = true;
    }
}
