package io.appmetrica.analytics.plugins;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class PluginErrorDetails {

    /* renamed from: a, reason: collision with root package name */
    private final String f42440a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42441b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f42442c;

    /* renamed from: d, reason: collision with root package name */
    private final String f42443d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42444e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f42445f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f42446a;

        /* renamed from: b, reason: collision with root package name */
        private String f42447b;

        /* renamed from: c, reason: collision with root package name */
        private List f42448c;

        /* renamed from: d, reason: collision with root package name */
        private String f42449d;

        /* renamed from: e, reason: collision with root package name */
        private String f42450e;

        /* renamed from: f, reason: collision with root package name */
        private Map f42451f;

        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f42446a, this.f42447b, (List) WrapUtils.getOrDefault(this.f42448c, new ArrayList()), this.f42449d, this.f42450e, (Map) WrapUtils.getOrDefault(this.f42451f, new HashMap()), 0);
        }

        public Builder withExceptionClass(String str) {
            this.f42446a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f42447b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f42449d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f42451f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f42448c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f42450e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i) {
        this(str, str2, list, str3, str4, map);
    }

    public String getExceptionClass() {
        return this.f42440a;
    }

    public String getMessage() {
        return this.f42441b;
    }

    public String getPlatform() {
        return this.f42443d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f42445f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f42442c;
    }

    public String getVirtualMachineVersion() {
        return this.f42444e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f42440a = str;
        this.f42441b = str2;
        this.f42442c = new ArrayList(list);
        this.f42443d = str3;
        this.f42444e = str4;
        this.f42445f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
