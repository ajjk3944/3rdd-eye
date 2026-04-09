package W6;

import H6.C0675l;
import android.os.Trace;
import b3.AbstractC1846a;
import com.bumptech.glide.j;
import h3.g;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* compiled from: DivStateTransitionHolder.kt */
/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13343a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13344b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13345c;

    public d(C0675l div2View) {
        l.f(div2View, "div2View");
        this.f13345c = div2View;
        this.f13344b = new ArrayList();
    }

    @Override // h3.g
    public Object get() {
        if (this.f13343a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection(J1.a.d("Glide registry"));
        this.f13343a = true;
        try {
            return j.a((com.bumptech.glide.b) this.f13345c, this.f13344b);
        } finally {
            this.f13343a = false;
            Trace.endSection();
        }
    }

    public d(com.bumptech.glide.b bVar, ArrayList arrayList, AbstractC1846a abstractC1846a) {
        this.f13345c = bVar;
        this.f13344b = arrayList;
    }
}
