package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes.dex */
public final class D7 {

    /* renamed from: a, reason: collision with root package name */
    private final C4976v3 f35844a;

    public D7(C4976v3 c4976v3) {
        this.f35844a = c4976v3;
    }

    private final boolean d() {
        return this.f35844a.C().f36286z.a() > 0;
    }

    private final boolean e() {
        return d() && this.f35844a.zzb().a() - this.f35844a.C().f36286z.a() > this.f35844a.w().y(null, N.f36086i0);
    }

    final void a() {
        this.f35844a.zzl().j();
        if (d()) {
            if (e()) {
                this.f35844a.C().f36285y.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f35844a.E().c1("auto", "_cmpx", bundle);
            } else {
                String strA = this.f35844a.C().f36285y.a();
                if (TextUtils.isEmpty(strA)) {
                    this.f35844a.zzj().E().a("Cache still valid but referrer not found");
                } else {
                    long jA = ((this.f35844a.C().f36286z.a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jA);
                    Object obj = pair.first;
                    this.f35844a.E().c1(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f35844a.C().f36285y.b(null);
            }
            this.f35844a.C().f36286z.b(0L);
        }
    }

    final void b(String str, Bundle bundle) {
        String string;
        this.f35844a.zzl().j();
        if (this.f35844a.n()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            string = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f35844a.C().f36285y.b(string);
        this.f35844a.C().f36286z.b(this.f35844a.zzb().a());
    }

    final void c() {
        if (d() && e()) {
            this.f35844a.C().f36285y.b(null);
        }
    }
}
