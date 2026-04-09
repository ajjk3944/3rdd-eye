package com.mbridge.msdk.config.component.vc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.ViewGroup;
import com.mbridge.msdk.config.activity.MBRewardVideoActivity;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class VCCpt extends com.mbridge.msdk.config.component.base.a {

    /* renamed from: l, reason: collision with root package name */
    private static ConcurrentHashMap<String, VCCpt> f13748l;

    /* renamed from: h, reason: collision with root package name */
    final String f13749h = "1200001";

    /* renamed from: i, reason: collision with root package name */
    final String f13750i = "1200002";

    /* renamed from: j, reason: collision with root package name */
    private String f13751j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.vc.model.a f13752k;

    public static class b implements com.mbridge.msdk.config.activity.lifecycle.a, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private String f13753a;

        private b() {
        }

        public void a(String str) {
            this.f13753a = str;
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void b() {
            VCCpt vCCpt;
            if (VCCpt.f13748l == null || VCCpt.f13748l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f13748l.get(this.f13753a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902007", new HashMap()));
            vCCpt.c("onResume");
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void c() {
            VCCpt vCCpt;
            if (VCCpt.f13748l == null || VCCpt.f13748l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f13748l.get(this.f13753a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902009", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void e() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void f() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void onStart() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a(ViewGroup viewGroup) {
            VCCpt vCCpt;
            if (VCCpt.f13748l == null || VCCpt.f13748l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f13748l.get(this.f13753a)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                vCCpt.a(viewGroup);
            }
            Object objB = vCCpt.f13090d.b(c.a("sdk_context"));
            if (objB instanceof Map) {
                ((Map) objB).put(c.a("rootView"), viewGroup);
            } else {
                HashMap map = new HashMap();
                map.put(c.a("rootView"), viewGroup);
                vCCpt.f13090d.a(c.a("sdk_context"), map);
            }
            vCCpt.a(vCCpt.a("902002", new HashMap()));
            vCCpt.a(vCCpt.a("902003", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a() {
            VCCpt vCCpt;
            if (VCCpt.f13748l == null || VCCpt.f13748l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f13748l.get(this.f13753a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902006", new HashMap()));
            vCCpt.c("onStop");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f13090d;
        if (aVar == null) {
            return;
        }
        Object objB = aVar.b(c.a("sdk_context"));
        try {
            if (objB instanceof Map) {
                Object obj = ((Map) objB).get("lifecycleListeners");
                if (obj instanceof List) {
                    List<com.mbridge.msdk.config.component.vc.inter.a> list = (List) obj;
                    if (list.isEmpty()) {
                        return;
                    }
                    synchronized (list) {
                        try {
                            for (com.mbridge.msdk.config.component.vc.inter.a aVar2 : list) {
                                if (aVar2 != null) {
                                    aVar2.a(str);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b("VCCpt", th2.getMessage(), th2);
        }
    }

    private void h() {
        a(a("902005", new HashMap()));
        l();
        if (e() == null || !(e().getContext() instanceof Activity)) {
            return;
        }
        ((Activity) e().getContext()).finish();
    }

    private void i() {
        String strA = this.f13752k.a();
        try {
            if (strA.equals(c.a("319"))) {
                m();
            } else if (strA.equals(c.a("307"))) {
                h();
            }
            if (this.f13752k.f() == 1) {
                n();
            }
        } catch (Exception e10) {
            q0.b("VCCpt", "Error in doRenderTemplateAction", e10);
            a("1200002", "Root view render fail");
        }
    }

    private com.mbridge.msdk.config.activity.backdispatcher.a j() {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar;
        try {
            aVar = this.f13090d;
        } catch (Throwable th) {
            q0.b("VCCpt", th.getMessage());
        }
        if (aVar == null) {
            return null;
        }
        Object objB = aVar.b(c.a("sdk_context"));
        if (objB instanceof Map) {
            Object obj = ((Map) objB).get("backInvocationCallback");
            if (obj instanceof com.mbridge.msdk.config.activity.backdispatcher.a) {
                return (com.mbridge.msdk.config.activity.backdispatcher.a) obj;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        a(a("902010", new HashMap()));
    }

    private void l() {
        try {
            Object objB = this.f13090d.b(c.a("sdk_context"));
            if (objB instanceof Map) {
                Map map = (Map) objB;
                Object obj = map.get("lifecycleListeners");
                if (obj instanceof List) {
                    ((List) obj).clear();
                }
                Object obj2 = map.get(c.a("component_cache"));
                if (obj2 instanceof Map) {
                    ((Map) obj2).clear();
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    n();
                }
                map.remove("backInvocationCallback");
            }
            ConcurrentHashMap<String, VCCpt> concurrentHashMap = f13748l;
            if (concurrentHashMap != null) {
                concurrentHashMap.remove(this.f13751j);
                if (f13748l.isEmpty()) {
                    f13748l = null;
                }
            }
        } catch (Throwable th) {
            q0.b("VCCpt", th.getMessage(), th);
        }
    }

    private void m() {
        Intent intent = new Intent(com.mbridge.msdk.foundation.controller.c.n().d(), (Class<?>) MBRewardVideoActivity.class);
        intent.putExtra("155", this.f13752k.c());
        intent.putExtra("154", this.f13752k.d());
        intent.putExtra("157", this.f13752k.g());
        intent.putExtra("158", this.f13752k.b());
        intent.putExtra("156", this.f13752k.e());
        b bVar = new b();
        bVar.a(this.f13751j);
        intent.putExtra("lifecycleCallbackByActivity", bVar);
        try {
            if (com.mbridge.msdk.foundation.controller.c.n() != null && com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                ((Activity) com.mbridge.msdk.foundation.controller.c.n().f()).startActivity(intent);
                return;
            }
        } catch (Throwable th) {
            q0.b("VCCpt", th.getMessage());
        }
        intent.addFlags(268435456);
        com.mbridge.msdk.foundation.controller.c.n().d().startActivity(intent);
    }

    private void n() {
        Context context;
        com.mbridge.msdk.config.activity.backdispatcher.a aVarJ;
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                ViewGroup viewGroupE = e();
                if (viewGroupE != null && (context = viewGroupE.getContext()) != null && (context instanceof Activity) && (aVarJ = j()) != null) {
                    aVarJ.a(((Activity) context).getWindow());
                }
            } catch (Throwable th) {
                q0.b("VCCpt", th.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f13092f = "902001";
        this.f13752k = new com.mbridge.msdk.config.component.vc.model.a(map);
        f13748l = new ConcurrentHashMap<>();
        String string = UUID.randomUUID().toString();
        this.f13751j = string;
        f13748l.put(string, this);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        i();
    }

    private void a(String str, String str2) {
        a("902008", str, str2);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ViewGroup viewGroup) {
        com.mbridge.msdk.config.component.vc.model.a aVar;
        if (Build.VERSION.SDK_INT < 33 || viewGroup == null || (aVar = this.f13752k) == null || aVar.f() == 1) {
            return;
        }
        try {
            Context context = viewGroup.getContext();
            if (context != null && (context instanceof Activity)) {
                com.mbridge.msdk.config.activity.backdispatcher.a aVar2 = new com.mbridge.msdk.config.activity.backdispatcher.a();
                aVar2.a(((Activity) context).getWindow(), new com.mbridge.msdk.config.activity.backdispatcher.b() { // from class: com.mbridge.msdk.config.component.vc.a
                    @Override // com.mbridge.msdk.config.activity.backdispatcher.b
                    public final void a() {
                        this.f13754a.k();
                    }
                });
                a(aVar2);
            }
        } catch (Throwable th) {
            q0.b("VCCpt", th.getMessage());
        }
    }

    private void a(Object obj) {
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f13090d;
            if (aVar == null) {
                return;
            }
            Object objB = aVar.b(c.a("sdk_context"));
            if (objB instanceof Map) {
                ((Map) objB).put("backInvocationCallback", obj);
            }
        } catch (Throwable th) {
            q0.b("VCCpt", th.getMessage());
        }
    }
}
