package com.mbridge.msdk.config.component.style;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.style.model.b;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class StyleCpt extends com.mbridge.msdk.config.component.base.a implements com.mbridge.msdk.config.component.vc.inter.a, d {

    /* renamed from: h, reason: collision with root package name */
    private b f13715h;

    /* renamed from: i, reason: collision with root package name */
    private XMLView f13716i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.style.inter.a f13717j;

    private void c(View view) {
        if (view != null) {
            view.setVisibility(0);
            HashMap map = new HashMap();
            map.put(c.a("view_tag"), view.getTag());
            a(a("903008", map));
        }
    }

    private String[] e(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.replaceAll("[\\[\\]]", "").split(",");
    }

    private void h() {
        String strA = this.f13715h.a();
        if (TextUtils.isEmpty(strA)) {
            a("2000005", "Component command is null");
            return;
        }
        try {
            if (strA.equals(c.a("319"))) {
                r();
                return;
            }
            if (strA.equals(c.a("325"))) {
                l();
            } else if (strA.equals(c.a("326"))) {
                a(8);
            } else if (strA.equals(c.a("307"))) {
                g();
            }
        } catch (Exception e10) {
            q0.b("StyleCpt", "Error in doRenderTemplateAction", e10);
            a("", "Command execute error " + e10.getMessage());
        }
    }

    private void i() {
        b bVar = this.f13715h;
        if (bVar == null || bVar.d() == null) {
            return;
        }
        for (com.mbridge.msdk.config.component.style.model.a aVar : this.f13715h.d()) {
            if (aVar != null) {
                String strA = aVar.a();
                String strD = aVar.d();
                if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strD)) {
                    View viewC = c(strD);
                    if (viewC == null) {
                        q0.b("StyleCpt", "Widget view not found: " + strD);
                    } else {
                        try {
                            if (strA.equals(c.a("319"))) {
                                c(viewC);
                            } else if (strA.equals(c.a("325"))) {
                                a(viewC);
                            } else if (strA.equals(c.a("328"))) {
                                a(viewC, aVar);
                            } else if (strA.equals(c.a("327"))) {
                                b(viewC);
                            }
                            c(viewC, aVar);
                            b(viewC, aVar);
                        } catch (Exception e10) {
                            q0.b("StyleCpt", "Error in doWidgetViewAction", e10);
                        }
                    }
                }
            }
        }
    }

    private void j() throws NoSuchAlgorithmException {
        b bVar = this.f13715h;
        if (bVar == null || TextUtils.isEmpty(bVar.c())) {
            return;
        }
        this.f13716i = com.mbridge.msdk.config.dynamic.utils.d.a(e(), SameMD5.getMD5(this.f13715h.c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> k() {
        String strC;
        List<com.mbridge.msdk.config.component.style.model.a> listD = this.f13715h.d();
        if (listD != null && !listD.isEmpty()) {
            for (com.mbridge.msdk.config.component.style.model.a aVar : listD) {
                if (aVar != null && (strC = aVar.c()) != null) {
                    strC.equals("1");
                }
            }
        }
        return com.mbridge.msdk.config.dynamic.utils.d.a((ViewGroup) this.f13716i);
    }

    private void l() {
        XMLView xMLView = this.f13716i;
        if (xMLView == null) {
            return;
        }
        xMLView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        h();
        i();
    }

    private void p() {
        String strC = this.f13715h.c();
        if (TextUtils.isEmpty(strC)) {
            a("2000001", "Template URL is empty");
            return;
        }
        String strD = d(strC);
        if (strD == null || TextUtils.isEmpty(strD)) {
            a("2000003", "XML paths is empty");
            return;
        }
        try {
            XMLView xMLView = (XMLView) new com.mbridge.msdk.config.dynamic.a().a(strD, e(), this.f13090d);
            this.f13716i = xMLView;
            if (xMLView == null) {
                a("2000004", "xml render fail");
            } else {
                xMLView.setRenderMap(strC);
                this.f13716i.setXmlViewActionListener(this.f13717j);
            }
        } catch (Exception e10) {
            a("2000004", e10.getMessage());
        }
    }

    private void q() {
        if (this.f13717j != null) {
            return;
        }
        this.f13717j = new a();
    }

    private void r() {
        HashMap map = new HashMap();
        a(a("903002", map));
        if (this.f13716i == null) {
            a(0);
        }
        Map<String, Object> mapK = k();
        if (!mapK.isEmpty()) {
            map.putAll(mapK);
        }
        a(a("903006", map));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f13092f = "903001";
        this.f13715h = new b(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() throws NoSuchAlgorithmException {
        super.d();
        j();
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.style.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f13719a.m();
            }
        });
    }

    public void n() {
        a(a("903004", new HashMap()));
    }

    public void o() {
        a(a("903003", new HashMap()));
    }

    private void g() {
        if (this.f13716i != null && e() != null) {
            HashMap map = new HashMap();
            e().removeView(this.f13716i);
            Map<String, Object> mapK = k();
            if (!mapK.isEmpty()) {
                map.putAll(mapK);
            }
            a(a("903005", map));
        }
        Object objB = this.f13090d.b(c.a("sdk_context"));
        if (objB instanceof Map) {
            Object obj = ((Map) objB).get("lifecycleListeners");
            if (obj instanceof List) {
                ((List) obj).clear();
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
        q();
    }

    private void b(View view) {
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    private String d(String str) {
        com.mbridge.msdk.config.component.common.file.b bVarA = com.mbridge.msdk.config.component.common.file.a.a(str, 2, this.f13715h.b());
        if (bVarA != null) {
            return bVarA.e() ? bVarA.d() : "";
        }
        return "";
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(c.a("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(c.a("116"));
                if (obj2 instanceof String) {
                    String strValueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        return strValueOf.equals(this.f13715h.c());
                    }
                }
            }
        }
        return false;
    }

    private void b(View view, com.mbridge.msdk.config.component.style.model.a aVar) throws NumberFormatException {
        try {
            if (view == null) {
                q0.b("StyleCpt", "Widget view is null");
                return;
            }
            String strE = aVar.e();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            String[] strArrE = e(strE);
            if (strArrE.length != 2) {
                q0.b("StyleCpt", "Invalid widget location format: " + strE);
                return;
            }
            int i10 = Integer.parseInt(strArrE[0]);
            int i11 = Integer.parseInt(strArrE[1]);
            view.setX(i10);
            view.setY(i11);
        } catch (Exception e10) {
            q0.b("StyleCpt", "Error relocating widget: " + e10.getMessage());
        }
    }

    private void c(View view, com.mbridge.msdk.config.component.style.model.a aVar) throws NumberFormatException {
        try {
            if (view == null) {
                q0.b("StyleCpt", "Widget view is null");
                return;
            }
            String strF = aVar.f();
            if (TextUtils.isEmpty(strF)) {
                return;
            }
            String[] strArrE = e(strF);
            if (strArrE.length != 2) {
                q0.b("StyleCpt", "Invalid widget size format: " + strF);
                return;
            }
            int i10 = Integer.parseInt(strArrE[0]);
            int i11 = Integer.parseInt(strArrE[1]);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i10;
                layoutParams.height = i11;
                view.setLayoutParams(layoutParams);
            }
        } catch (Exception e10) {
            q0.b("StyleCpt", "Error resizing widget: " + e10.getMessage());
        }
    }

    public class a implements com.mbridge.msdk.config.component.style.inter.a {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(String str, Map<String, Object> map) {
            if (TextUtils.isEmpty(str)) {
                q0.b("StyleCpt", "Click tag is empty");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put(c.a("view_tag"), str);
            if (map != null && !map.isEmpty()) {
                map2.putAll(map);
            }
            Map mapK = StyleCpt.this.k();
            if (!mapK.isEmpty()) {
                map2.put("all_properties", mapK);
            }
            StyleCpt styleCpt = StyleCpt.this;
            styleCpt.a(styleCpt.a("903010", map2));
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(Map<String, Object> map) {
            if (map != null) {
                StyleCpt styleCpt = StyleCpt.this;
                styleCpt.a(styleCpt.a("903008", map));
            }
        }
    }

    private void a(String str, String str2) {
        q0.b("StyleCpt", str2);
        HashMap map = new HashMap();
        map.put(c.a("reason"), str2);
        map.put(c.a("code"), str);
        if (this.f13715h.d() != null) {
            q0.b("StyleCpt", map.toString());
        } else {
            a(a("903007", map));
        }
    }

    private View c(String str) {
        XMLView xMLView = this.f13716i;
        if (xMLView == null) {
            return e().findViewWithTag(str);
        }
        return xMLView.findViewWithTag(str);
    }

    private void a(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            Object objB = aVar.b();
            View view2 = objB instanceof View ? (View) objB : null;
            if (view2 == null) {
                q0.b("StyleCpt", "Action view is null");
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                viewGroup.addView(view2);
            }
        } catch (Exception e10) {
            q0.b("StyleCpt", "Error adding widget: " + e10.getMessage());
        }
    }

    private void a(View view) {
        if (view != null) {
            view.setVisibility(4);
            HashMap map = new HashMap();
            map.put(c.a("view_tag"), view.getTag());
            a(a("903009", map));
        }
    }

    private void a(int i10) {
        XMLView xMLView;
        p();
        if (e() == null || (xMLView = this.f13716i) == null) {
            return;
        }
        xMLView.setVisibility(i10);
    }

    @Override // com.mbridge.msdk.config.component.vc.inter.a
    public void a(String str) {
        str.getClass();
        if (str.equals("onStop")) {
            o();
        } else if (str.equals("onResume")) {
            n();
        }
    }
}
