package a2;

import B4.C0141c;
import android.view.View;
import com.apm.insight.R;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.lefan.signal.network.webSpeed.WebSpeedActivity;
import com.lefan.signal.network.webSpeed.WebSpeedBean;
import d5.AbstractC2282j;
import k0.K;
import q5.i;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC0266b implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseViewHolder f4657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0271g f4658c;

    public /* synthetic */ ViewOnLongClickListenerC0266b(BaseViewHolder baseViewHolder, AbstractC0271g abstractC0271g, int i) {
        this.f4656a = i;
        this.f4657b = baseViewHolder;
        this.f4658c = abstractC0271g;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f4656a;
        AbstractC0271g abstractC0271g = this.f4658c;
        BaseViewHolder baseViewHolder = this.f4657b;
        boolean z6 = false;
        switch (i) {
            case 0:
                J4.c cVar = (J4.c) abstractC0271g;
                i.e(baseViewHolder, "$viewHolder");
                i.e(cVar, "this$0");
                int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    cVar.q(baseViewHolder.getItemViewType());
                    if (AbstractC2282j.V(bindingAdapterPosition, cVar.f4668b) != null) {
                        i.d(view, "it");
                    }
                }
                return false;
            default:
                i.e(baseViewHolder, "$viewHolder");
                int bindingAdapterPosition2 = baseViewHolder.getBindingAdapterPosition();
                if (bindingAdapterPosition2 == -1) {
                    return false;
                }
                i.d(view, "v");
                O4.b bVar = abstractC0271g.f4673g;
                if (bVar == null) {
                    return false;
                }
                WebSpeedActivity webSpeedActivity = bVar.f3070a;
                int i3 = WebSpeedActivity.f18847S;
                WebSpeedBean webSpeedBean = (WebSpeedBean) AbstractC2282j.V(bindingAdapterPosition2, webSpeedActivity.f18850Q);
                int i6 = 1;
                if (webSpeedBean != null) {
                    K kS = webSpeedActivity.s();
                    c1.g gVar = new c1.g(27, z6);
                    gVar.f5897c = webSpeedActivity.getString(R.string.tip_title);
                    gVar.f5896b = webSpeedActivity.getString(R.string.delete_web_stie);
                    gVar.f5898d = webSpeedActivity.getString(R.string.string_delete);
                    gVar.f5899e = -65536;
                    I.d dVar = new I.d(bindingAdapterPosition2, i6, webSpeedActivity, webSpeedBean);
                    if (kS != null) {
                        C0141c c0141c = new C0141c();
                        c0141c.f704C0 = gVar;
                        c0141c.f703B0 = dVar;
                        c0141c.e0(kS, "custom_dialog");
                    }
                }
                return true;
        }
    }
}
