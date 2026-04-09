package jg;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x1;
import com.applovin.impl.adview.p;
import com.google.android.gms.internal.ads.e80;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import va.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27661a;

    /* renamed from: b, reason: collision with root package name */
    public final yb.i f27662b;

    /* renamed from: c, reason: collision with root package name */
    public o f27663c;

    /* renamed from: d, reason: collision with root package name */
    public d f27664d;

    /* renamed from: e, reason: collision with root package name */
    public int f27665e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27666f;

    public g(Context context, yb.i iVar) {
        this.f27661a = context;
        this.f27662b = iVar;
    }

    public final void a() {
        d dVar = this.f27664d;
        if (dVar == null) {
            return;
        }
        o oVar = this.f27663c;
        if (oVar == null) {
            nk.k.k("headerViewBinding");
            throw null;
        }
        ((AppCompatCheckBox) oVar.f36147c).setOnCheckedChangeListener(null);
        o oVar2 = this.f27663c;
        if (oVar2 == null) {
            nk.k.k("headerViewBinding");
            throw null;
        }
        ((ImageView) oVar2.f36149e).setImageDrawable(dVar.b(this.f27661a));
        o oVar3 = this.f27663c;
        if (oVar3 == null) {
            nk.k.k("headerViewBinding");
            throw null;
        }
        ((TextView) oVar3.f36150f).setText(dVar.name());
        o oVar4 = this.f27663c;
        if (oVar4 == null) {
            nk.k.k("headerViewBinding");
            throw null;
        }
        ((TextView) oVar4.g).setText(wi.c.e(dVar.f27655c));
        o oVar5 = this.f27663c;
        if (oVar5 == null) {
            nk.k.k("headerViewBinding");
            throw null;
        }
        ((AppCompatCheckBox) oVar5.f36147c).setChecked(dVar.f27660a);
        if (this.f27666f) {
            this.f27666f = false;
            o oVar6 = this.f27663c;
            if (oVar6 == null) {
                nk.k.k("headerViewBinding");
                throw null;
            }
            ((AppCompatCheckBox) oVar6.f36147c).jumpDrawablesToCurrentState();
        }
        o oVar7 = this.f27663c;
        if (oVar7 == null) {
            nk.k.k("headerViewBinding");
            throw null;
        }
        ((ImageView) oVar7.f36148d).setRotation(dVar.f27656d ? -90.0f : 90.0f);
        o oVar8 = this.f27663c;
        if (oVar8 != null) {
            ((AppCompatCheckBox) oVar8.f36147c).setOnCheckedChangeListener(this);
        } else {
            nk.k.k("headerViewBinding");
            throw null;
        }
    }

    public final void b(x1 x1Var) {
        if (!(x1Var instanceof b)) {
            this.f27666f = !nk.k.a(null, this.f27664d);
            this.f27664d = null;
            this.f27665e = -1;
            return;
        }
        b bVar = (b) x1Var;
        f fVar = bVar.f27648e;
        if (fVar instanceof d) {
            this.f27666f = !nk.k.a(r0, this.f27664d);
            this.f27664d = (d) fVar;
            this.f27665e = bVar.getBindingAdapterPosition();
            a();
            return;
        }
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            if (eVar.f27659d >= 0) {
                d dVar = eVar.f27658c;
                this.f27666f = !nk.k.a(dVar, this.f27664d);
                this.f27664d = dVar;
                this.f27665e = (bVar.getBindingAdapterPosition() - eVar.f27659d) - 1;
                a();
            }
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        int i4;
        nk.k.e(compoundButton, "buttonView");
        d dVar = this.f27664d;
        if (dVar == null || (i4 = this.f27665e) == -1) {
            return;
        }
        dVar.f27660a = z3;
        c cVar = ((StorageCleanActivity) this.f27662b.f37516b).G;
        if (cVar != null) {
            cVar.b(dVar, i4);
        } else {
            nk.k.k("adapter");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar;
        int i4;
        o oVar = this.f27663c;
        if (oVar == null) {
            nk.k.k("headerViewBinding");
            throw null;
        }
        if (!nk.k.a(view, (FrameLayout) oVar.f36146b) || (dVar = this.f27664d) == null || (i4 = this.f27665e) == -1) {
            return;
        }
        yb.i iVar = this.f27662b;
        StorageCleanActivity storageCleanActivity = (StorageCleanActivity) iVar.f37516b;
        e80 e80Var = storageCleanActivity.E;
        if (e80Var == null) {
            nk.k.k("binding");
            throw null;
        }
        x1 x1VarJ = ((RecyclerView) e80Var.j).J(i4);
        if (x1VarJ != null) {
            int top = x1VarJ.itemView.getTop();
            e80 e80Var2 = storageCleanActivity.E;
            if (e80Var2 == null) {
                nk.k.k("binding");
                throw null;
            }
            if (top <= ((RecyclerView) e80Var2.j).getPaddingTop()) {
                e80 e80Var3 = storageCleanActivity.E;
                if (e80Var3 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ((RecyclerView) e80Var3.j).k0(i4);
                dVar.f27656d = !dVar.f27656d;
                c cVar = storageCleanActivity.G;
                if (cVar != null) {
                    cVar.c(dVar, i4);
                    return;
                } else {
                    nk.k.k("adapter");
                    throw null;
                }
            }
        }
        if (((LinearLayoutManager) iVar.f37517c).findFirstVisibleItemPosition() - i4 <= 10) {
            e80 e80Var4 = storageCleanActivity.E;
            if (e80Var4 != null) {
                ((RecyclerView) e80Var4.j).n0(i4);
                return;
            } else {
                nk.k.k("binding");
                throw null;
            }
        }
        int i10 = i4 + 5;
        c cVar2 = storageCleanActivity.G;
        if (cVar2 == null) {
            nk.k.k("adapter");
            throw null;
        }
        if (i10 >= cVar2.f27652l.size()) {
            e80 e80Var5 = storageCleanActivity.E;
            if (e80Var5 != null) {
                ((RecyclerView) e80Var5.j).n0(i4);
                return;
            } else {
                nk.k.k("binding");
                throw null;
            }
        }
        e80 e80Var6 = storageCleanActivity.E;
        if (e80Var6 == null) {
            nk.k.k("binding");
            throw null;
        }
        ((RecyclerView) e80Var6.j).k0(i10);
        e80 e80Var7 = storageCleanActivity.E;
        if (e80Var7 != null) {
            ((RecyclerView) e80Var7.j).post(new p(storageCleanActivity, i4, 5));
        } else {
            nk.k.k("binding");
            throw null;
        }
    }
}
