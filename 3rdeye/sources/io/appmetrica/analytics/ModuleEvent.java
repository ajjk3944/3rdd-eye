package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ModuleEvent {

    /* renamed from: a, reason: collision with root package name */
    private final int f38746a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38747b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38748c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38749d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f38750e;

    /* renamed from: f, reason: collision with root package name */
    private final List f38751f;

    /* renamed from: g, reason: collision with root package name */
    private final List f38752g;

    /* renamed from: h, reason: collision with root package name */
    private final List f38753h;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f38754a;

        /* renamed from: b, reason: collision with root package name */
        private String f38755b;

        /* renamed from: c, reason: collision with root package name */
        private String f38756c;

        /* renamed from: d, reason: collision with root package name */
        private int f38757d;

        /* renamed from: e, reason: collision with root package name */
        private Category f38758e;

        /* renamed from: f, reason: collision with root package name */
        private HashMap f38759f;

        /* renamed from: g, reason: collision with root package name */
        private HashMap f38760g;

        /* renamed from: h, reason: collision with root package name */
        private HashMap f38761h;

        public /* synthetic */ Builder(int i, int i10) {
            this(i);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(Map<String, Object> map) {
            if (map != null) {
                this.f38761h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f38758e = category;
            return this;
        }

        public Builder withEnvironment(Map<String, Object> map) {
            if (map != null) {
                this.f38759f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f38760g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(String str) {
            this.f38755b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i) {
            this.f38757d = i;
            return this;
        }

        public Builder withValue(String str) {
            this.f38756c = str;
            return this;
        }

        private Builder(int i) {
            this.f38757d = 1;
            this.f38758e = Category.GENERAL;
            this.f38754a = i;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(int i) {
        return new Builder(i, 0);
    }

    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f38753h);
    }

    public Category getCategory() {
        return this.f38750e;
    }

    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f38751f);
    }

    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f38752g);
    }

    public String getName() {
        return this.f38747b;
    }

    public int getServiceDataReporterType() {
        return this.f38749d;
    }

    public int getType() {
        return this.f38746a;
    }

    public String getValue() {
        return this.f38748c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f38746a + ", name='" + this.f38747b + "', value='" + this.f38748c + "', serviceDataReporterType=" + this.f38749d + ", category=" + this.f38750e + ", environment=" + this.f38751f + ", extras=" + this.f38752g + ", attributes=" + this.f38753h + '}';
    }

    private ModuleEvent(Builder builder) {
        this.f38746a = builder.f38754a;
        this.f38747b = builder.f38755b;
        this.f38748c = builder.f38756c;
        this.f38749d = builder.f38757d;
        this.f38750e = builder.f38758e;
        this.f38751f = CollectionUtils.getListFromMap(builder.f38759f);
        this.f38752g = CollectionUtils.getListFromMap(builder.f38760g);
        this.f38753h = CollectionUtils.getListFromMap(builder.f38761h);
    }
}
