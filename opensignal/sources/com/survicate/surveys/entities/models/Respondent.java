package com.survicate.surveys.entities.models;

import br.g;
import br.l;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/survicate/surveys/entities/models/Respondent;", "", "uuid", "", "verificationTimeMs", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "isVerified", "", "()Z", "getUuid", "()Ljava/lang/String;", "getVerificationTimeMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/survicate/surveys/entities/models/Respondent;", "equals", "other", "hashCode", "", "toString", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Respondent {
    private final String uuid;
    private final Long verificationTimeMs;

    public Respondent(String str, Long l10) {
        l.e(str, "uuid");
        this.uuid = str;
        this.verificationTimeMs = l10;
    }

    public static /* synthetic */ Respondent copy$default(Respondent respondent, String str, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = respondent.uuid;
        }
        if ((i10 & 2) != 0) {
            l10 = respondent.verificationTimeMs;
        }
        return respondent.copy(str, l10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getVerificationTimeMs() {
        return this.verificationTimeMs;
    }

    public final Respondent copy(String uuid, Long verificationTimeMs) {
        l.e(uuid, "uuid");
        return new Respondent(uuid, verificationTimeMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Respondent)) {
            return false;
        }
        Respondent respondent = (Respondent) other;
        return l.a(this.uuid, respondent.uuid) && l.a(this.verificationTimeMs, respondent.verificationTimeMs);
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final Long getVerificationTimeMs() {
        return this.verificationTimeMs;
    }

    public int hashCode() {
        int iHashCode = this.uuid.hashCode() * 31;
        Long l10 = this.verificationTimeMs;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final boolean isVerified() {
        return this.verificationTimeMs != null;
    }

    public String toString() {
        return "Respondent(uuid=" + this.uuid + ", verificationTimeMs=" + this.verificationTimeMs + ')';
    }

    public /* synthetic */ Respondent(String str, Long l10, int i10, g gVar) {
        this(str, (i10 & 2) != 0 ? null : l10);
    }
}
