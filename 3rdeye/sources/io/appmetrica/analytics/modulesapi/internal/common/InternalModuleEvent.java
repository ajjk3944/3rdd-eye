package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g;

/* loaded from: classes3.dex */
public final class InternalModuleEvent {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f42313a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42314b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42315c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f42316d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f42317e;

    /* renamed from: f, reason: collision with root package name */
    private final List f42318f;

    /* renamed from: g, reason: collision with root package name */
    private final List f42319g;

    /* renamed from: h, reason: collision with root package name */
    private final List f42320h;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f42321a;

        /* renamed from: b, reason: collision with root package name */
        private String f42322b;

        /* renamed from: c, reason: collision with root package name */
        private String f42323c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f42324d;

        /* renamed from: e, reason: collision with root package name */
        private Category f42325e;

        /* renamed from: f, reason: collision with root package name */
        private Map f42326f;

        /* renamed from: g, reason: collision with root package name */
        private Map f42327g;

        /* renamed from: h, reason: collision with root package name */
        private Map f42328h;

        public Builder(int i) {
            this.f42321a = i;
        }

        public InternalModuleEvent build() {
            return new InternalModuleEvent(this, null);
        }

        public final Map<String, Object> getAttributes() {
            return this.f42328h;
        }

        public final Category getCategory() {
            return this.f42325e;
        }

        public final Map<String, Object> getEnvironment() {
            return this.f42326f;
        }

        public final Map<String, byte[]> getExtras() {
            return this.f42327g;
        }

        public final String getName() {
            return this.f42322b;
        }

        public final Integer getServiceDataReporterType() {
            return this.f42324d;
        }

        public final int getType$modules_api_release() {
            return this.f42321a;
        }

        public final String getValue() {
            return this.f42323c;
        }

        public final void setAttributes(Map<String, ? extends Object> map) {
            this.f42328h = map;
        }

        public final void setCategory(Category category) {
            this.f42325e = category;
        }

        public final void setEnvironment(Map<String, ? extends Object> map) {
            this.f42326f = map;
        }

        public final void setExtras(Map<String, byte[]> map) {
            this.f42327g = map;
        }

        public final void setName(String str) {
            this.f42322b = str;
        }

        public final void setServiceDataReporterType(Integer num) {
            this.f42324d = num;
        }

        public final void setValue(String str) {
            this.f42323c = str;
        }

        public final Builder withAttributes(Map<String, ? extends Object> map) {
            if (map != null) {
                this.f42328h = new HashMap(map);
            }
            return this;
        }

        public final Builder withCategory(Category category) {
            this.f42325e = category;
            return this;
        }

        public final Builder withEnvironment(Map<String, ? extends Object> map) {
            if (map != null) {
                this.f42326f = new HashMap(map);
            }
            return this;
        }

        public final Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f42327g = new HashMap(map);
            }
            return this;
        }

        public final Builder withName(String str) {
            this.f42322b = str;
            return this;
        }

        public final Builder withServiceDataReporterType(int i) {
            this.f42324d = Integer.valueOf(i);
            return this;
        }

        public final Builder withValue(String str) {
            this.f42323c = str;
            return this;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Builder newBuilder(int i) {
            return new Builder(i);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InternalModuleEvent(Builder builder, g gVar) {
        this(builder);
    }

    public static final Builder newBuilder(int i) {
        return Companion.newBuilder(i);
    }

    public final Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f42320h);
    }

    public final Category getCategory() {
        return this.f42317e;
    }

    public final Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f42318f);
    }

    public final Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f42319g);
    }

    public final String getName() {
        return this.f42314b;
    }

    public final Integer getServiceDataReporterType() {
        return this.f42316d;
    }

    public final int getType() {
        return this.f42313a;
    }

    public final String getValue() {
        return this.f42315c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f42313a + ", name='" + this.f42314b + "', value='" + this.f42315c + "', serviceDataReporterType=" + this.f42316d + ", category=" + this.f42317e + ", environment=" + this.f42318f + ", extras=" + this.f42319g + ", attributes=" + this.f42320h + '}';
    }

    private InternalModuleEvent(Builder builder) {
        this.f42313a = builder.getType$modules_api_release();
        this.f42314b = builder.getName();
        this.f42315c = builder.getValue();
        this.f42316d = builder.getServiceDataReporterType();
        this.f42317e = builder.getCategory();
        this.f42318f = CollectionUtils.getListFromMap(builder.getEnvironment());
        this.f42319g = CollectionUtils.getListFromMap(builder.getExtras());
        this.f42320h = CollectionUtils.getListFromMap(builder.getAttributes());
    }
}
