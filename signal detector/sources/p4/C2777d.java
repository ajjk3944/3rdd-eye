package p4;

import android.content.Context;
import com.google.android.gms.internal.ads.C1268hc;
import com.lefan.signal.MyApplication;
import j2.C2550f;
import j2.C2551g;
import v2.AbstractC2960a;

/* renamed from: p4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2777d {

    /* renamed from: a, reason: collision with root package name */
    public C1268hc f22879a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22880b;

    /* renamed from: c, reason: collision with root package name */
    public long f22881c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MyApplication f22882d;

    public C2777d(MyApplication myApplication) {
        this.f22882d = myApplication;
    }

    public final void a(Context context) {
        q5.i.e(context, "context");
        if (this.f22880b) {
            return;
        }
        this.f22880b = true;
        AbstractC2960a.a(context, "ca-app-pub-8024055951217142/5692882633", new C2551g(new C2550f(1)), new C2775b(this));
    }
}
