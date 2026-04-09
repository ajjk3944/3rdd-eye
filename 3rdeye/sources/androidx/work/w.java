package androidx.work;

import android.os.Build;
import b2.C1842w;
import c9.C2079C;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkRequest.kt */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f17042a;

    /* renamed from: b, reason: collision with root package name */
    public final C1842w f17043b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<String> f17044c;

    /* compiled from: WorkRequest.kt */
    public static abstract class a<B extends a<B, ?>, W extends w> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f17045a;

        /* renamed from: b, reason: collision with root package name */
        public UUID f17046b;

        /* renamed from: c, reason: collision with root package name */
        public C1842w f17047c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f17048d;

        public a(Class<? extends l> cls) {
            UUID uuidRandomUUID = UUID.randomUUID();
            kotlin.jvm.internal.l.e(uuidRandomUUID, "randomUUID()");
            this.f17046b = uuidRandomUUID;
            String string = this.f17046b.toString();
            kotlin.jvm.internal.l.e(string, "id.toString()");
            this.f17047c = new C1842w(string, cls.getName());
            this.f17048d = C2079C.b(cls.getName());
        }

        public final W a() {
            p pVarB = b();
            d dVar = this.f17047c.f17146j;
            boolean z10 = (Build.VERSION.SDK_INT >= 24 && dVar.a()) || dVar.f16885d || dVar.f16883b || dVar.f16884c;
            C1842w c1842w = this.f17047c;
            if (c1842w.f17153q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (c1842w.f17144g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            kotlin.jvm.internal.l.e(uuidRandomUUID, "randomUUID()");
            this.f17046b = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            kotlin.jvm.internal.l.e(string, "id.toString()");
            C1842w other = this.f17047c;
            kotlin.jvm.internal.l.f(other, "other");
            this.f17047c = new C1842w(string, other.f17139b, other.f17140c, other.f17141d, new e(other.f17142e), new e(other.f17143f), other.f17144g, other.f17145h, other.i, new d(other.f17146j), other.f17147k, other.f17148l, other.f17149m, other.f17150n, other.f17151o, other.f17152p, other.f17153q, other.f17154r, other.f17155s, other.f17157u, other.f17158v, other.f17159w, 524288);
            return pVarB;
        }

        public abstract p b();
    }

    public w(UUID id, C1842w workSpec, Set<String> tags) {
        kotlin.jvm.internal.l.f(id, "id");
        kotlin.jvm.internal.l.f(workSpec, "workSpec");
        kotlin.jvm.internal.l.f(tags, "tags");
        this.f17042a = id;
        this.f17043b = workSpec;
        this.f17044c = tags;
    }

    public final String a() {
        String string = this.f17042a.toString();
        kotlin.jvm.internal.l.e(string, "id.toString()");
        return string;
    }
}
