package Y4;

import a2.AbstractC0271g;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.lefan.signal.db.SquatterBean;
import com.lefan.signal.ui.wifi.SquatterActivity;
import com.lefan.signal.ui.wifi.SquatterDetailActivity;
import d5.AbstractC2282j;
import e.C2284a;
import e.C2291h;
import e.InterfaceC2285b;
import e2.InterfaceC2302a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: Y4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0229i implements InterfaceC2302a, InterfaceC2285b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SquatterActivity f4473a;

    public /* synthetic */ C0229i(SquatterActivity squatterActivity) {
        this.f4473a = squatterActivity;
    }

    @Override // e2.InterfaceC2302a
    public void a(AbstractC0271g abstractC0271g, View view, int i) {
        int i3 = SquatterActivity.f19359d0;
        SquatterActivity squatterActivity = this.f4473a;
        SquatterBean squatterBean = (SquatterBean) AbstractC2282j.V(i, squatterActivity.f19372a0);
        if (squatterBean == null) {
            return;
        }
        C2291h c2291h = squatterActivity.f19373c0;
        Intent intent = new Intent(squatterActivity, (Class<?>) SquatterDetailActivity.class);
        intent.putExtra("squatter", squatterBean);
        c2291h.a(intent);
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) {
        SquatterBean squatterBean;
        C2284a c2284a = (C2284a) obj;
        int i = SquatterActivity.f19359d0;
        q5.i.e(c2284a, "it");
        Intent intent = c2284a.f19839b;
        if (c2284a.f19838a == 1006) {
            Object obj2 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                squatterBean = intent != null ? (SquatterBean) intent.getSerializableExtra("result_squatter", SquatterBean.class) : null;
            } else {
                squatterBean = (SquatterBean) (intent != null ? intent.getSerializableExtra("result_squatter") : null);
            }
            if (squatterBean == null) {
                return;
            }
            SquatterActivity squatterActivity = this.f4473a;
            CopyOnWriteArrayList copyOnWriteArrayList = squatterActivity.f19372a0;
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (q5.i.a(((SquatterBean) next).getIp(), squatterBean.getIp())) {
                    obj2 = next;
                    break;
                }
            }
            SquatterBean squatterBean2 = (SquatterBean) obj2;
            if (squatterBean2 != null) {
                squatterBean2.setType(squatterBean.getType());
                squatterBean2.setKnown(squatterBean.isKnown());
                squatterBean2.setBrand(squatterBean.getBrand());
                squatterActivity.f19361P.notifyItemChanged(copyOnWriteArrayList.indexOf(squatterBean2));
                ArrayList arrayList = new ArrayList();
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (((SquatterBean) next2).isKnown()) {
                        arrayList.add(next2);
                    }
                }
                squatterActivity.D(arrayList.size(), copyOnWriteArrayList.size());
            }
        }
    }
}
