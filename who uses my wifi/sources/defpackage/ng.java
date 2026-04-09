package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ng {
    public final Object a;
    public final kp b;
    public final dy c;
    public final Object d;
    public final Throwable e;

    public ng(Object obj, kp kpVar, dy dyVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = kpVar;
        this.c = dyVar;
        this.d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static ng a(ng ngVar, kp kpVar, CancellationException cancellationException, int i) {
        Object obj = ngVar.a;
        if ((i & 2) != 0) {
            kpVar = ngVar.b;
        }
        kp kpVar2 = kpVar;
        dy dyVar = ngVar.c;
        Object obj2 = ngVar.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = ngVar.e;
        }
        return new ng(obj, kpVar2, dyVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng)) {
            return false;
        }
        ng ngVar = (ng) obj;
        return i30.c(this.a, ngVar.a) && i30.c(this.b, ngVar.b) && i30.c(this.c, ngVar.c) && i30.c(this.d, ngVar.d) && i30.c(this.e, ngVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        kp kpVar = this.b;
        int iHashCode2 = (iHashCode + (kpVar == null ? 0 : kpVar.hashCode())) * 31;
        dy dyVar = this.c;
        int iHashCode3 = (iHashCode2 + (dyVar == null ? 0 : dyVar.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ ng(Object obj, kp kpVar, dy dyVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : kpVar, (i & 4) != 0 ? null : dyVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
