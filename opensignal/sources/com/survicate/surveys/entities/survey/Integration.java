package com.survicate.surveys.entities.survey;

import br.g;
import br.l;
import c7.a;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/survicate/surveys/entities/survey/Integration;", "", "provider", "", "enabled", "", "sendInputFields", "(Ljava/lang/String;ZZ)V", "getEnabled", "()Z", "getProvider", "()Ljava/lang/String;", "getSendInputFields", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Integration {
    private final boolean enabled;
    private final String provider;
    private final boolean sendInputFields;

    public Integration(@o(name = "provider") String str, @o(name = "enabled") boolean z10, @o(name = "send_input_fields") boolean z11) {
        l.e(str, "provider");
        this.provider = str;
        this.enabled = z10;
        this.sendInputFields = z11;
    }

    public static /* synthetic */ Integration copy$default(Integration integration, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = integration.provider;
        }
        if ((i10 & 2) != 0) {
            z10 = integration.enabled;
        }
        if ((i10 & 4) != 0) {
            z11 = integration.sendInputFields;
        }
        return integration.copy(str, z10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSendInputFields() {
        return this.sendInputFields;
    }

    public final Integration copy(@o(name = "provider") String provider, @o(name = "enabled") boolean enabled, @o(name = "send_input_fields") boolean sendInputFields) {
        l.e(provider, "provider");
        return new Integration(provider, enabled, sendInputFields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Integration)) {
            return false;
        }
        Integration integration = (Integration) other;
        return l.a(this.provider, integration.provider) && this.enabled == integration.enabled && this.sendInputFields == integration.sendInputFields;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final boolean getSendInputFields() {
        return this.sendInputFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.provider.hashCode() * 31;
        boolean z10 = this.enabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.sendInputFields;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Integration(provider=");
        sb2.append(this.provider);
        sb2.append(", enabled=");
        sb2.append(this.enabled);
        sb2.append(", sendInputFields=");
        return a.r(sb2, this.sendInputFields, ')');
    }

    public /* synthetic */ Integration(String str, boolean z10, boolean z11, int i10, g gVar) {
        this(str, z10, (i10 & 4) != 0 ? true : z11);
    }
}
