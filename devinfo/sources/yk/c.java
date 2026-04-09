package yk;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import xk.h;
import z6.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37654c;

    public /* synthetic */ c(int i4, Object obj, Object obj2) {
        this.f37652a = i4;
        this.f37653b = obj;
        this.f37654c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37652a) {
            case 0:
                ((h) this.f37653b).C((d) this.f37654c);
                break;
            case 1:
                List list = (List) this.f37653b;
                f fVar = (f) this.f37654c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((y6.a) it.next()).a(fVar.f37964e);
                }
                break;
            default:
                f.d dVar = (f.d) this.f37653b;
                Context context = (Context) this.f37654c;
                try {
                    try {
                        dVar.a(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:com.liuzh.deviceinfo")));
                        break;
                    } catch (ActivityNotFoundException unused) {
                        dVar.a(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION"));
                        return;
                    }
                } catch (Exception unused2) {
                    nh.a.k(context, "com.liuzh.deviceinfo", false);
                }
        }
    }
}
