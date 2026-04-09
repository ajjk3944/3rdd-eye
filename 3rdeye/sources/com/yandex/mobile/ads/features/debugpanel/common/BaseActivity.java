package com.yandex.mobile.ads.features.debugpanel.common;

import A9.E;
import A9.F;
import android.app.Activity;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.ku;
import com.yandex.mobile.ads.impl.vg2;
import com.yandex.mobile.ads.impl.wg2;

/* loaded from: classes3.dex */
public abstract class BaseActivity<T extends vg2> extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private final E f24004a = ku.a();

    /* renamed from: b, reason: collision with root package name */
    private final Object f24005b;

    /* renamed from: c, reason: collision with root package name */
    private T f24006c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f24007a;

        /* renamed from: b, reason: collision with root package name */
        private final vg2 f24008b;

        public a() {
            this(0);
        }

        public final Object a() {
            return this.f24007a;
        }

        public final vg2 b() {
            return this.f24008b;
        }

        public a(Object obj, vg2 vg2Var) {
            this.f24007a = obj;
            this.f24008b = vg2Var;
        }

        public /* synthetic */ a(int i) {
            this(null, null);
        }
    }

    public BaseActivity() {
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        a aVar = lastNonConfigurationInstance instanceof a ? (a) lastNonConfigurationInstance : null;
        this.f24005b = aVar != null ? aVar.a() : null;
    }

    public final E a() {
        return this.f24004a;
    }

    public final T b() {
        T t10 = this.f24006c;
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) c().a();
        this.f24006c = t11;
        return t11;
    }

    public abstract wg2<T> c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.yandex.mobile.ads.impl.vg2] */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        a aVar = lastNonConfigurationInstance instanceof a ? (a) lastNonConfigurationInstance : null;
        if (aVar != null) {
            ?? B10 = aVar.b();
            this.f24006c = B10 != 0 ? B10 : null;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        T t10;
        super.onDestroy();
        F.b(this.f24004a, null);
        if (isChangingConfigurations() || (t10 = this.f24006c) == null) {
            return;
        }
        t10.a();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        return new a(null, b());
    }
}
