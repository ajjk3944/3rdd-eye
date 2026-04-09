package com.zipoapps.ads.config;

import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: AdManagerConfiguration.kt */
/* loaded from: classes3.dex */
public final class AdManagerConfiguration {
    private final List<String> testAdvertisingIds;

    /* compiled from: AdManagerConfiguration.kt */
    public static final class Builder {
        private List<String> testAdvertisingIds;

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        private final List<String> component1() {
            return this.testAdvertisingIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder copy$default(Builder builder, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = builder.testAdvertisingIds;
            }
            return builder.copy(list);
        }

        public final AdManagerConfiguration build() {
            return new AdManagerConfiguration(this.testAdvertisingIds);
        }

        public final Builder copy(List<String> list) {
            return new Builder(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Builder) && l.b(this.testAdvertisingIds, ((Builder) obj).testAdvertisingIds);
        }

        public int hashCode() {
            List<String> list = this.testAdvertisingIds;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final Builder testAdvertisingIds(List<String> ids) {
            l.f(ids, "ids");
            this.testAdvertisingIds = ids;
            return this;
        }

        public String toString() {
            return "Builder(testAdvertisingIds=" + this.testAdvertisingIds + ")";
        }

        public Builder(List<String> list) {
            this.testAdvertisingIds = list;
        }

        public /* synthetic */ Builder(List list, int i, g gVar) {
            this((i & 1) != 0 ? null : list);
        }
    }

    public AdManagerConfiguration(List<String> list) {
        this.testAdvertisingIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdManagerConfiguration copy$default(AdManagerConfiguration adManagerConfiguration, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adManagerConfiguration.testAdvertisingIds;
        }
        return adManagerConfiguration.copy(list);
    }

    public final List<String> component1() {
        return this.testAdvertisingIds;
    }

    public final AdManagerConfiguration copy(List<String> list) {
        return new AdManagerConfiguration(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdManagerConfiguration) && l.b(this.testAdvertisingIds, ((AdManagerConfiguration) obj).testAdvertisingIds);
    }

    public final List<String> getTestAdvertisingIds() {
        return this.testAdvertisingIds;
    }

    public int hashCode() {
        List<String> list = this.testAdvertisingIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "AdManagerConfiguration(testAdvertisingIds=" + this.testAdvertisingIds + ")";
    }
}
