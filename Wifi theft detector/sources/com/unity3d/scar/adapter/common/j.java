package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class j implements e {

    /* renamed from: a, reason: collision with root package name */
    public e7.c f20102a;

    /* renamed from: b, reason: collision with root package name */
    public Map f20103b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public d7.a f20104c;

    /* renamed from: d, reason: collision with root package name */
    public c f20105d;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f20106a;

        public a(Activity activity) {
            this.f20106a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f20104c.show(this.f20106a);
        }
    }

    public j(c cVar) {
        this.f20105d = cVar;
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void a(Context context, boolean z10, e7.b bVar) {
        this.f20102a.a(context, z10, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void b(Context context, List list, e7.b bVar) {
        this.f20102a.b(context, list, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void c(Context context, String str, UnityAdFormat unityAdFormat, e7.b bVar) {
        this.f20102a.c(context, str, unityAdFormat, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void show(Activity activity, String str, String str2) {
        d7.a aVar = (d7.a) this.f20103b.get(str2);
        if (aVar != null) {
            this.f20104c = aVar;
            k.a(new a(activity));
            return;
        }
        this.f20105d.handleError(b.f(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }
}
