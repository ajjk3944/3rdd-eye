package io.appmetrica.analytics;

import B4.f;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class StartupParamsItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f38788a;

    /* renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f38789b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38790c;

    public StartupParamsItem(String str, StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f38788a = str;
        this.f38789b = startupParamsItemStatus;
        this.f38790c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StartupParamsItem.class == obj.getClass()) {
            StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
            if (Objects.equals(this.f38788a, startupParamsItem.f38788a) && this.f38789b == startupParamsItem.f38789b && Objects.equals(this.f38790c, startupParamsItem.f38790c)) {
                return true;
            }
        }
        return false;
    }

    public String getErrorDetails() {
        return this.f38790c;
    }

    public String getId() {
        return this.f38788a;
    }

    public StartupParamsItemStatus getStatus() {
        return this.f38789b;
    }

    public int hashCode() {
        return Objects.hash(this.f38788a, this.f38789b, this.f38790c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartupParamsItem{id='");
        sb.append(this.f38788a);
        sb.append("', status=");
        sb.append(this.f38789b);
        sb.append(", errorDetails='");
        return f.c(sb, this.f38790c, "'}");
    }
}
