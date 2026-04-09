package kt;

import ht.m0;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import mq.w;

/* loaded from: classes.dex */
public final class i implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f14517a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f14518b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14519c;

    public i(j jVar, String... strArr) {
        br.l.e(jVar, "kind");
        br.l.e(strArr, "formatParams");
        this.f14517a = jVar;
        this.f14518b = strArr;
        String debugText = b.ERROR_TYPE.getDebugText();
        String debugMessage = jVar.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f14519c = String.format(debugText, Arrays.copyOf(new Object[]{String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // ht.m0
    public final or.h n() {
        or.e eVar = or.e.f19667f;
        return or.e.f19667f;
    }

    @Override // ht.m0
    public final List o() {
        return w.f16945a;
    }

    @Override // ht.m0
    public final rr.i p() {
        k.f14520a.getClass();
        return k.f14522c;
    }

    @Override // ht.m0
    public final Collection q() {
        return w.f16945a;
    }

    @Override // ht.m0
    public final boolean r() {
        return false;
    }

    public final String toString() {
        return this.f14519c;
    }
}
