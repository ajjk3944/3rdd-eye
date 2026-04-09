package com.mbridge.msdk.config.component.url;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class URLCpt extends a {

    /* renamed from: h, reason: collision with root package name */
    final String f13742h = "600001";

    /* renamed from: i, reason: collision with root package name */
    com.mbridge.msdk.config.component.url.model.a f13743i;

    private void a(Context context, String str, String str2, Map<Object, Object> map) {
        String message;
        PackageInfo packageInfo;
        Intent launchIntentForPackage;
        ResolveInfo next;
        boolean z10 = false;
        try {
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(str) && (packageInfo = context.getPackageManager().getPackageInfo(str, 1)) != null && str.equals(packageInfo.packageName) && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) != null) {
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0);
                if (!listQueryIntentActivities.isEmpty() && (next = listQueryIntentActivities.iterator().next()) != null) {
                    ActivityInfo activityInfo = next.activityInfo;
                    intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    intent.addFlags(268435456);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str2));
                intent.addFlags(268435456);
            }
            if (map != null) {
                for (Map.Entry<Object, Object> entry : map.entrySet()) {
                    if (entry.getKey() instanceof String) {
                        intent.putExtra(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                    }
                }
            }
            context.startActivity(intent);
            message = "";
            z10 = true;
        } catch (Exception e10) {
            q0.b("URLCpt", e10.getMessage());
            message = e10.getMessage();
        }
        a(z10, message);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f13092f = "909001";
        this.f13743i = new com.mbridge.msdk.config.component.url.model.a(map);
        if (e() != null) {
            this.f13743i.a(e().getContext());
        } else {
            this.f13743i.a(c.n().d());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        g();
    }

    public void g() {
        com.mbridge.msdk.config.component.url.model.a aVar = this.f13743i;
        if (aVar != null) {
            a(aVar.a(), this.f13743i.c(), this.f13743i.d(), this.f13743i.b());
        }
    }

    private void a(boolean z10, String str) {
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.a("500"), String.valueOf(z10 ? 1 : 0));
        if (!z10) {
            map.put(com.mbridge.msdk.config.component.common.util.c.a("reason"), str);
            map.put(com.mbridge.msdk.config.component.common.util.c.a("code"), "600001");
        }
        a(a("909002", map));
    }
}
