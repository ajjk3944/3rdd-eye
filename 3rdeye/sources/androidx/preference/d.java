package androidx.preference;

import android.os.Handler;
import androidx.preference.Preference;
import androidx.preference.c;

/* compiled from: PreferenceGroupAdapter.java */
/* loaded from: classes.dex */
public final class d implements Preference.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreferenceGroup f16343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f16344c;

    public d(c cVar, PreferenceGroup preferenceGroup) {
        this.f16344c = cVar;
        this.f16343b = preferenceGroup;
    }

    @Override // androidx.preference.Preference.c
    public final boolean e(Preference preference) {
        this.f16343b.f16279S = Integer.MAX_VALUE;
        c cVar = this.f16344c;
        Handler handler = cVar.f16337n;
        c.a aVar = cVar.f16338o;
        handler.removeCallbacks(aVar);
        handler.post(aVar);
        return true;
    }
}
