package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1444a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1445b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f1446c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1447d;

    /* renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0008a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f1448a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f1449b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f1450c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f1451d;

        public a a() {
            return new a(this.f1448a, this.f1449b, this.f1450c, this.f1451d);
        }

        public C0008a b(int i10) {
            this.f1448a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    public a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1444a = num;
        this.f1445b = num2;
        this.f1446c = num3;
        this.f1447d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1444a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1445b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1446c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1447d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
