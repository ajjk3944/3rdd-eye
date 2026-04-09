package ml;

import androidx.lifecycle.e0;
import ba.l;
import br.h;
import cg.j;
import lq.e;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements e0, h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f16871a;

    public a(j jVar) {
        this.f16871a = jVar;
    }

    @Override // br.h
    public final e a() {
        return this.f16871a;
    }

    @Override // androidx.lifecycle.e0
    public final /* synthetic */ void b(Object obj) throws l {
        this.f16871a.a(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0) || !(obj instanceof h)) {
            return false;
        }
        return this.f16871a.equals(((h) obj).a());
    }

    public final int hashCode() {
        return this.f16871a.hashCode();
    }
}
