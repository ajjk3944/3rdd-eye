package sj;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.t1;
import cm.g;
import com.liuzh.deviceinfo.R;
import nk.k;
import ui.e;
import ui.h0;
import ui.m;
import ui.m0;
import ui.q;
import ui.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33810a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f33811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33812c;

    public a(b bVar) {
        this.f33812c = bVar;
        Context context = bVar.getContext();
        k.d(context, "getContext(...)");
        this.f33811b = g.n(R.attr.analyzer_content_padding, context);
    }

    @Override // androidx.recyclerview.widget.b1
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, t1 t1Var) {
        switch (this.f33810a) {
            case 0:
                k.e(rect, "outRect");
                k.e(view, "view");
                k.e(t1Var, "state");
                int iN = RecyclerView.N(view);
                int i4 = iN % 2;
                int i10 = this.f33811b;
                if (i4 == 0) {
                    rect.left = i10;
                    rect.right = i10 / 2;
                } else {
                    rect.left = i10 / 2;
                    rect.right = i10;
                }
                if (iN >= 2) {
                    if (iN < ((b) this.f33812c).getAdapter().f29954i.size() - 2) {
                        int i11 = i10 / 2;
                        rect.top = i11;
                        rect.bottom = i11;
                        break;
                    } else {
                        rect.top = i10 / 2;
                        rect.bottom = i10;
                        break;
                    }
                } else {
                    rect.top = i10;
                    rect.bottom = i10 / 2;
                    break;
                }
            case 1:
                int iN2 = RecyclerView.N(view);
                int i12 = this.f33811b;
                rect.left = i12;
                rect.right = i12;
                int i13 = i12 / 2;
                rect.top = i13;
                rect.bottom = i13;
                if (iN2 != 0) {
                    if (iN2 == ((ui.b) this.f33812c).f35349c0.getItemCount() - 1) {
                        rect.bottom = i12;
                        break;
                    }
                } else {
                    rect.top = i12;
                    break;
                }
                break;
            case 2:
                int iN3 = RecyclerView.N(view);
                int i14 = this.f33811b;
                rect.left = i14;
                rect.right = i14;
                int i15 = i14 / 2;
                rect.top = i15;
                rect.bottom = i15;
                if (iN3 != 0) {
                    if (iN3 == ((e) this.f33812c).f35359b0.getItemCount() - 1) {
                        rect.bottom = i14;
                        break;
                    }
                } else {
                    rect.top = i14;
                    break;
                }
                break;
            case 3:
                int iN4 = RecyclerView.N(view);
                int i16 = this.f33811b;
                rect.left = i16;
                rect.right = i16;
                int i17 = i16 / 2;
                rect.top = i17;
                rect.bottom = i17;
                if (iN4 != 0) {
                    if (iN4 == ((ui.g) this.f33812c).f35374c0.getItemCount() - 1) {
                        rect.bottom = i16;
                        break;
                    }
                } else {
                    rect.top = i16;
                    break;
                }
                break;
            case 4:
                int iN5 = RecyclerView.N(view);
                int i18 = this.f33811b;
                rect.left = i18;
                rect.right = i18;
                int i19 = i18 / 2;
                rect.top = i19;
                rect.bottom = i19;
                if (iN5 != 0) {
                    if (iN5 == ((m) this.f33812c).f35435c0.getItemCount() - 1) {
                        rect.bottom = i18;
                        break;
                    }
                } else {
                    rect.top = i18;
                    break;
                }
                break;
            case 5:
                int iN6 = RecyclerView.N(view);
                int i20 = this.f33811b;
                rect.left = i20;
                rect.right = i20;
                int i21 = i20 / 2;
                rect.top = i21;
                rect.bottom = i21;
                if (iN6 != 0) {
                    if (iN6 == ((q) this.f33812c).f35458c0.getItemCount() - 1) {
                        rect.bottom = i20;
                        break;
                    }
                } else {
                    rect.top = i20;
                    break;
                }
                break;
            case 6:
                int iN7 = RecyclerView.N(view);
                int i22 = this.f33811b;
                rect.left = i22;
                rect.right = i22;
                int i23 = i22 / 2;
                rect.top = i23;
                rect.bottom = i23;
                if (iN7 != 0) {
                    if (iN7 == ((u) this.f33812c).f35473c0.getItemCount() - 1) {
                        rect.bottom = i22;
                        break;
                    }
                } else {
                    rect.top = i22;
                    break;
                }
                break;
            case 7:
                int iN8 = RecyclerView.N(view);
                int i24 = this.f33811b;
                rect.left = i24;
                rect.right = i24;
                int i25 = i24 / 2;
                rect.top = i25;
                rect.bottom = i25;
                if (iN8 != 0) {
                    if (iN8 == ((h0) this.f33812c).f35387c0.getItemCount() - 1) {
                        rect.bottom = i24;
                        break;
                    }
                } else {
                    rect.top = i24;
                    break;
                }
                break;
            default:
                int iN9 = RecyclerView.N(view);
                int i26 = this.f33811b;
                rect.left = i26;
                rect.right = i26;
                int i27 = i26 / 2;
                rect.top = i27;
                rect.bottom = i27;
                if (iN9 != 0) {
                    if (iN9 == ((m0) this.f33812c).f35438c0.getItemCount() - 1) {
                        rect.bottom = i26;
                        break;
                    }
                } else {
                    rect.top = i26;
                    break;
                }
                break;
        }
    }

    public a(ui.b bVar) {
        this.f33812c = bVar;
        this.f33811b = g.n(R.attr.appi_content_padding, bVar.f35348b0);
    }

    public a(e eVar) {
        this.f33812c = eVar;
        this.f33811b = g.n(R.attr.appi_content_padding, eVar.Z);
    }

    public a(ui.g gVar) {
        this.f33812c = gVar;
        this.f33811b = g.n(R.attr.appi_content_padding, gVar.f35373b0);
    }

    public a(m mVar) {
        this.f33812c = mVar;
        this.f33811b = g.n(R.attr.appi_content_padding, mVar.f35434b0);
    }

    public a(q qVar) {
        this.f33812c = qVar;
        this.f33811b = g.n(R.attr.appi_content_padding, qVar.f35457b0);
    }

    public a(u uVar) {
        this.f33812c = uVar;
        this.f33811b = g.n(R.attr.appi_content_padding, uVar.f35472b0);
    }

    public a(h0 h0Var) {
        this.f33812c = h0Var;
        this.f33811b = g.n(R.attr.appi_content_padding, h0Var.f35386b0);
    }

    public a(m0 m0Var) {
        this.f33812c = m0Var;
        this.f33811b = g.n(R.attr.appi_content_padding, m0Var.f35437b0);
    }
}
