package cc;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f3662a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f3664c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3665d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f3666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3667f;

    public n(e eVar, int i10, Bundle bundle) {
        this.f3667f = eVar;
        Boolean bool = Boolean.TRUE;
        this.f3664c = eVar;
        this.f3662a = bool;
        this.f3663b = false;
        this.f3665d = i10;
        this.f3666e = bundle;
    }

    public abstract boolean a();

    public abstract void b(ConnectionResult connectionResult);
}
