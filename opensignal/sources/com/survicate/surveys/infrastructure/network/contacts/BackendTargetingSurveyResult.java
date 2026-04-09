package com.survicate.surveys.infrastructure.network.contacts;

import br.g;
import br.l;
import iu.e;
import ju.b;
import kotlin.Metadata;
import ku.p0;
import ku.y0;
import lq.c;
import mu.y;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u001c¨\u00061"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingSurveyResult;", "", "", "id", "", "canShow", "", "cacheUntilMs", "<init>", "(Ljava/lang/String;ZJ)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;ZJLku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingSurveyResult;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()J", "copy", "(Ljava/lang/String;ZJ)Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingSurveyResult;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Z", "getCanShow", "getCanShow$annotations", "J", "getCacheUntilMs", "getCacheUntilMs$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BackendTargetingSurveyResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long cacheUntilMs;
    private final boolean canShow;
    private final String id;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingSurveyResult$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingSurveyResult;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final gu.a serializer() {
            return BackendTargetingSurveyResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @c
    public /* synthetic */ BackendTargetingSurveyResult(int i10, String str, boolean z10, long j, y0 y0Var) {
        if (7 != (i10 & 7)) {
            p0.f(i10, 7, BackendTargetingSurveyResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.canShow = z10;
        this.cacheUntilMs = j;
    }

    public static /* synthetic */ BackendTargetingSurveyResult copy$default(BackendTargetingSurveyResult backendTargetingSurveyResult, String str, boolean z10, long j, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = backendTargetingSurveyResult.id;
        }
        if ((i10 & 2) != 0) {
            z10 = backendTargetingSurveyResult.canShow;
        }
        if ((i10 & 4) != 0) {
            j = backendTargetingSurveyResult.cacheUntilMs;
        }
        return backendTargetingSurveyResult.copy(str, z10, j);
    }

    public static /* synthetic */ void getCacheUntilMs$annotations() {
    }

    public static /* synthetic */ void getCanShow$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static final /* synthetic */ void write$Self(BackendTargetingSurveyResult self, b output, e serialDesc) {
        y yVar = (y) output;
        yVar.x(serialDesc, 0, self.id);
        yVar.s(serialDesc, 1, self.canShow);
        yVar.v(serialDesc, 2, self.cacheUntilMs);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanShow() {
        return this.canShow;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCacheUntilMs() {
        return this.cacheUntilMs;
    }

    public final BackendTargetingSurveyResult copy(String id2, boolean canShow, long cacheUntilMs) {
        l.e(id2, "id");
        return new BackendTargetingSurveyResult(id2, canShow, cacheUntilMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackendTargetingSurveyResult)) {
            return false;
        }
        BackendTargetingSurveyResult backendTargetingSurveyResult = (BackendTargetingSurveyResult) other;
        return l.a(this.id, backendTargetingSurveyResult.id) && this.canShow == backendTargetingSurveyResult.canShow && this.cacheUntilMs == backendTargetingSurveyResult.cacheUntilMs;
    }

    public final long getCacheUntilMs() {
        return this.cacheUntilMs;
    }

    public final boolean getCanShow() {
        return this.canShow;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        boolean z10 = this.canShow;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return Long.hashCode(this.cacheUntilMs) + ((iHashCode + i10) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BackendTargetingSurveyResult(id=");
        sb2.append(this.id);
        sb2.append(", canShow=");
        sb2.append(this.canShow);
        sb2.append(", cacheUntilMs=");
        return w.g.h(sb2, this.cacheUntilMs, ')');
    }

    public BackendTargetingSurveyResult(String str, boolean z10, long j) {
        l.e(str, "id");
        this.id = str;
        this.canShow = z10;
        this.cacheUntilMs = j;
    }
}
