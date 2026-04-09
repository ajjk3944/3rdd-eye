package io.appmetrica.analytics.plugins;

/* loaded from: classes3.dex */
public class StackTraceItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f42452a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42453b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f42454c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f42455d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42456e;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f42457a;

        /* renamed from: b, reason: collision with root package name */
        private String f42458b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f42459c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f42460d;

        /* renamed from: e, reason: collision with root package name */
        private String f42461e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f42457a, this.f42458b, this.f42459c, this.f42460d, this.f42461e, 0);
        }

        public Builder withClassName(String str) {
            this.f42457a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f42460d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f42458b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f42459c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f42461e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i) {
        this(str, str2, num, num2, str3);
    }

    public String getClassName() {
        return this.f42452a;
    }

    public Integer getColumn() {
        return this.f42455d;
    }

    public String getFileName() {
        return this.f42453b;
    }

    public Integer getLine() {
        return this.f42454c;
    }

    public String getMethodName() {
        return this.f42456e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f42452a = str;
        this.f42453b = str2;
        this.f42454c = num;
        this.f42455d = num2;
        this.f42456e = str3;
    }
}
