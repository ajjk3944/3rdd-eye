package com.survicate.surveys.infrastructure.network.contacts;

import br.g;
import iu.e;
import ju.b;
import kotlin.Metadata;
import ku.p0;
import ku.y0;
import lq.c;
import mu.y;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b*\u0010(\u001a\u0004\b\u0005\u0010\u0019R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0017¨\u0006/"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingAudienceResult;", "", "", "id", "", "isSatisfied", "cacheUntilMs", "<init>", "(JZJ)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(IJZJLku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingAudienceResult;Lju/b;Liu/e;)V", "component1", "()J", "component2", "()Z", "component3", "copy", "(JZJ)Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingAudienceResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "getId$annotations", "()V", "Z", "isSatisfied$annotations", "getCacheUntilMs", "getCacheUntilMs$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BackendTargetingAudienceResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long cacheUntilMs;
    private final long id;
    private final boolean isSatisfied;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingAudienceResult$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingAudienceResult;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final gu.a serializer() {
            return BackendTargetingAudienceResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @c
    public /* synthetic */ BackendTargetingAudienceResult(int i10, long j, boolean z10, long j7, y0 y0Var) {
        if (7 != (i10 & 7)) {
            p0.f(i10, 7, BackendTargetingAudienceResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = j;
        this.isSatisfied = z10;
        this.cacheUntilMs = j7;
    }

    public static /* synthetic */ BackendTargetingAudienceResult copy$default(BackendTargetingAudienceResult backendTargetingAudienceResult, long j, boolean z10, long j7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j = backendTargetingAudienceResult.id;
        }
        long j10 = j;
        if ((i10 & 2) != 0) {
            z10 = backendTargetingAudienceResult.isSatisfied;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            j7 = backendTargetingAudienceResult.cacheUntilMs;
        }
        return backendTargetingAudienceResult.copy(j10, z11, j7);
    }

    public static /* synthetic */ void getCacheUntilMs$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void isSatisfied$annotations() {
    }

    public static final /* synthetic */ void write$Self(BackendTargetingAudienceResult self, b output, e serialDesc) {
        y yVar = (y) output;
        yVar.v(serialDesc, 0, self.id);
        yVar.s(serialDesc, 1, self.isSatisfied);
        yVar.v(serialDesc, 2, self.cacheUntilMs);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSatisfied() {
        return this.isSatisfied;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCacheUntilMs() {
        return this.cacheUntilMs;
    }

    public final BackendTargetingAudienceResult copy(long id2, boolean isSatisfied, long cacheUntilMs) {
        return new BackendTargetingAudienceResult(id2, isSatisfied, cacheUntilMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackendTargetingAudienceResult)) {
            return false;
        }
        BackendTargetingAudienceResult backendTargetingAudienceResult = (BackendTargetingAudienceResult) other;
        return this.id == backendTargetingAudienceResult.id && this.isSatisfied == backendTargetingAudienceResult.isSatisfied && this.cacheUntilMs == backendTargetingAudienceResult.cacheUntilMs;
    }

    public final long getCacheUntilMs() {
        return this.cacheUntilMs;
    }

    public final long getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        boolean z10 = this.isSatisfied;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return Long.hashCode(this.cacheUntilMs) + ((iHashCode + i10) * 31);
    }

    public final boolean isSatisfied() {
        return this.isSatisfied;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BackendTargetingAudienceResult(id=");
        sb2.append(this.id);
        sb2.append(", isSatisfied=");
        sb2.append(this.isSatisfied);
        sb2.append(", cacheUntilMs=");
        return w.g.h(sb2, this.cacheUntilMs, ')');
    }

    public BackendTargetingAudienceResult(long j, boolean z10, long j7) {
        this.id = j;
        this.isSatisfied = z10;
        this.cacheUntilMs = j7;
    }
}
