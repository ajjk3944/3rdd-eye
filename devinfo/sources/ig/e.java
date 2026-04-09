package ig;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;
import java.util.ArrayList;
import sh.u0;
import sh.w0;
import sh.x0;
import ui.g0;
import ui.h0;
import ui.i0;
import ui.j0;
import ui.k0;
import ui.l0;
import ui.m0;
import ui.n;
import ui.n0;
import ui.o;
import ui.p;
import ui.q;
import ui.r;
import ui.s;
import ui.t;
import ui.u;
import ui.v;
import ui.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends t0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25974i = 0;
    public Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f25975k;

    public e(u uVar) {
        this.f25975k = uVar;
        this.j = LayoutInflater.from(uVar.f35472b0);
    }

    @Override // androidx.recyclerview.widget.t0
    public final int getItemCount() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        switch (this.f25974i) {
            case 0:
                return ((ArrayList) this.f25975k).size();
            case 1:
                return ((x0) this.f25975k).f33783b0.size();
            case 2:
                ui.i iVar = ((ui.g) this.f25975k).Z;
                if (iVar == null || (arrayList = iVar.f35388a) == null) {
                    return 0;
                }
                return arrayList.size();
            case 3:
                o oVar = ((ui.m) this.f25975k).Z;
                if (oVar == null || (arrayList2 = oVar.f35443a) == null) {
                    return 0;
                }
                return arrayList2.size();
            case 4:
                s sVar = ((q) this.f25975k).Z;
                if (sVar == null || (arrayList3 = sVar.f35465a) == null) {
                    return 0;
                }
                return arrayList3.size();
            case 5:
                w wVar = ((u) this.f25975k).Z;
                if (wVar == null || (arrayList4 = wVar.f35476a) == null) {
                    return 0;
                }
                return arrayList4.size();
            case 6:
                j0 j0Var = ((h0) this.f25975k).Z;
                if (j0Var == null || (arrayList5 = j0Var.f35396b) == null) {
                    return 0;
                }
                return arrayList5.size();
            case 7:
                n0 n0Var = ((m0) this.f25975k).Z;
                if (n0Var == null || (arrayList6 = n0Var.f35441a) == null) {
                    return 0;
                }
                return arrayList6.size();
            default:
                km.o oVar2 = ((AppsAnalyzeActivity) this.f25975k).F;
                if (oVar2 == null) {
                    return 0;
                }
                return ((ArrayList) oVar2.f28445a).size();
        }
    }

    @Override // androidx.recyclerview.widget.t0
    public int getItemViewType(int i4) {
        switch (this.f25974i) {
            case 1:
                return ((x0) this.f25975k).f33783b0.get(i4) instanceof sh.t0 ? 1 : 0;
            case 8:
                return ((wj.g) ((ArrayList) ((AppsAnalyzeActivity) this.f25975k).F.f28445a).get(i4)).f36779b;
            default:
                return super.getItemViewType(i4);
        }
    }

    @Override // androidx.recyclerview.widget.t0
    public final void onBindViewHolder(x1 x1Var, int i4) throws Resources.NotFoundException {
        int i10 = this.f25974i;
        Object obj = this.f25975k;
        switch (i10) {
            case 0:
                d dVar = (d) x1Var;
                ArrayList arrayList = (ArrayList) obj;
                String str = ((vg.b) arrayList.get(i4)).f36219a;
                String str2 = ((vg.b) arrayList.get(i4)).f36220b;
                dVar.f25972c.setText(str);
                dVar.f25973d.setText(str2);
                break;
            case 1:
                x0 x0Var = (x0) obj;
                if (!x0Var.c0() && i4 != -1) {
                    u0 u0Var = (u0) x0Var.f33783b0.get(i4);
                    if (!(u0Var instanceof sh.t0)) {
                        w0 w0Var = (w0) x1Var;
                        TextView textView = w0Var.f33779f;
                        ImageView imageView = w0Var.f33776c;
                        textView.setVisibility(8);
                        imageView.setVisibility(0);
                        if (u0Var.f33763a.equals("screen_specific")) {
                            imageView.setImageResource(R.drawable.ic_overlayer);
                            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                            imageView.setColorFilter(com.liuzh.deviceinfo.utilities.f.d());
                        } else if (u0Var.f33763a.equals("storage_analyze")) {
                            imageView.setImageResource(R.drawable.ic_analyze);
                            com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                            imageView.setColorFilter(com.liuzh.deviceinfo.utilities.f.d());
                        } else {
                            int i11 = u0Var.f33766d;
                            Context context = imageView.getContext();
                            if (i11 == 0) {
                                imageView.setImageResource(R.drawable.ic_test_state_failed);
                                imageView.setColorFilter(context.getColor(R.color.test_failed));
                            } else if (i11 == 1) {
                                imageView.setImageResource(R.drawable.ic_test_state_success);
                                imageView.setColorFilter(context.getColor(R.color.test_success));
                            } else if (i11 == 2) {
                                imageView.setImageResource(R.drawable.ic_test_state_default);
                                imageView.setColorFilter(context.getColor(R.color.test_default));
                            }
                        }
                        w0Var.f33777d.setText(u0Var.f33765c);
                        w0Var.f33778e.setImageResource(u0Var.f33764b);
                        break;
                    } else {
                        ViewGroup viewGroup = (ViewGroup) x1Var.itemView.findViewById(R.id.ad_container);
                        View view = x0Var.f33785d0;
                        if (view != null && view.getParent() == null) {
                            View view2 = x1Var.itemView;
                            int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.content_padding_half);
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.topMargin = dimensionPixelSize;
                                marginLayoutParams.bottomMargin = dimensionPixelSize;
                                marginLayoutParams.leftMargin = dimensionPixelSize;
                                marginLayoutParams.rightMargin = dimensionPixelSize;
                                view2.setLayoutParams(marginLayoutParams);
                            }
                            viewGroup.removeAllViews();
                            if (x0Var.f33785d0.getLayoutParams() == null) {
                                viewGroup.addView(x0Var.f33785d0, new FrameLayout.LayoutParams(-2, -2, 17));
                                break;
                            } else {
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(x0Var.f33785d0.getLayoutParams());
                                layoutParams2.gravity = 17;
                                x0Var.f33785d0.setLayoutParams(layoutParams2);
                                viewGroup.addView(x0Var.f33785d0);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                ui.f fVar3 = (ui.f) x1Var;
                ui.h hVar = (ui.h) ((ui.g) obj).Z.f35388a.get(i4);
                ActivityInfo activityInfo = hVar.f35381a;
                ((TextView) fVar3.f35368e.g).setText(ti.e.c(activityInfo.permission));
                com.google.android.gms.internal.consent_sdk.d dVar2 = fVar3.f35368e;
                ((TextView) dVar2.f19298d).setText(ti.e.b(activityInfo.exported));
                ((TextView) dVar2.f19302i).setText(activityInfo.name);
                ((TextView) dVar2.f19301h).setVisibility(hVar.f35383c ? 0 : 8);
                ((LinearLayout) dVar2.f19297c).setVisibility(hVar.f35384d ? 0 : 8);
                ((TextView) dVar2.f19300f).setText(hVar.f35382b);
                break;
            case 3:
                ui.l lVar = (ui.l) x1Var;
                n nVar = (n) ((ui.m) obj).Z.f35443a.get(i4);
                ProviderInfo providerInfo = nVar.f35439a;
                lVar.f35417d.setText(ti.e.c(providerInfo.authority));
                lVar.j.setText(ti.e.b(providerInfo.exported));
                lVar.f35419f.setText(ti.e.c(providerInfo.readPermission));
                lVar.f35420h.setText(ti.e.c(providerInfo.writePermission));
                lVar.f35416c.setText(providerInfo.name);
                lVar.f35423l.setVisibility(nVar.f35440b ? 0 : 8);
                break;
            case 4:
                p pVar = (p) x1Var;
                r rVar = (r) ((q) obj).Z.f35465a.get(i4);
                pVar.f35445c.setText(ti.e.c(rVar.f35460b));
                pVar.f35446d.setText(ti.e.c(rVar.f35462d));
                pVar.f35448f.setText(ti.e.c(rVar.f35463e));
                pVar.j.setText(ti.e.c(rVar.f35461c));
                pVar.f35449h.setText(ti.e.c(rVar.f35464f));
                pVar.f35452l.setVisibility(rVar.f35459a ? 0 : 8);
                break;
            case 5:
                t tVar = (t) x1Var;
                v vVar = (v) ((u) obj).Z.f35476a.get(i4);
                tVar.f35468d.setText(ti.e.b(vVar.f35474a));
                tVar.f35467c.setText(vVar.f35475b);
                break;
            case 6:
                g0 g0Var = (g0) x1Var;
                i0 i0Var = (i0) ((h0) obj).Z.f35396b.get(i4);
                TextView textView2 = g0Var.f35375c;
                TextView textView3 = g0Var.f35377e;
                textView2.setText(ti.e.c(i0Var.f35390a));
                g0Var.f35376d.setText(ti.e.c(i0Var.f35391b));
                g0Var.f35378f.setText(ti.e.c(i0Var.f35392c));
                if (!TextUtils.isEmpty(i0Var.f35393d)) {
                    textView3.setVisibility(0);
                    textView3.setText(i0Var.f35393d);
                    break;
                } else {
                    textView3.setVisibility(8);
                    break;
                }
            case 7:
                l0 l0Var = (l0) x1Var;
                k0 k0Var = (k0) ((m0) obj).Z.f35441a.get(i4);
                ServiceInfo serviceInfo = k0Var.f35409a;
                l0Var.f35432i.f36253i.setText(ti.e.c(serviceInfo.permission));
                vi.a aVar = l0Var.f35432i;
                aVar.f36249d.setText(ti.e.b(serviceInfo.exported));
                aVar.f36254k.setText(ti.e.b(k0Var.f35411c));
                aVar.j.setText(ti.e.b(k0Var.f35412d));
                aVar.g.setText(ti.e.b(k0Var.f35413e));
                aVar.f36256m.setText(serviceInfo.name);
                aVar.f36252h.setText(k0Var.g);
                if (Build.VERSION.SDK_INT >= 24) {
                    aVar.f36250e.setText(ti.e.b(k0Var.f35415h));
                }
                aVar.f36248c.setVisibility(k0Var.f35410b ? 0 : 8);
                aVar.f36255l.setVisibility(k0Var.f35414f ? 0 : 8);
                break;
            default:
                AppsAnalyzeActivity appsAnalyzeActivity = (AppsAnalyzeActivity) obj;
                wj.g gVar = (wj.g) ((ArrayList) appsAnalyzeActivity.F.f28445a).get(i4);
                if (!(x1Var instanceof wj.l)) {
                    if (!(x1Var instanceof wj.h)) {
                        if (!(x1Var instanceof wj.e)) {
                            if (x1Var instanceof wj.f) {
                                getItemViewType(i4);
                                nk.k.b(ii.a.f26002b);
                                nk.k.e((ViewGroup) x1Var.itemView, "container");
                                break;
                            }
                        } else {
                            wj.e eVar = (wj.e) x1Var;
                            View viewA = appsAnalyzeActivity.K.a();
                            FrameLayout frameLayout = eVar.f36777c;
                            if (viewA != null && viewA.getParent() == null) {
                                if (eVar.itemView.getVisibility() != 0) {
                                    eVar.itemView.setVisibility(0);
                                }
                                frameLayout.removeAllViews();
                                frameLayout.addView(viewA);
                                break;
                            }
                        }
                    } else {
                        wj.h hVar2 = (wj.h) x1Var;
                        uj.b bVar = (uj.b) appsAnalyzeActivity.F.f28446b;
                        hVar2.f36782c.setText(hVar2.f36787i.getString(R.string.appa_apps_count, Integer.valueOf(bVar.f35509d)));
                        hVar2.f36783d.setText(String.valueOf(bVar.f35507b));
                        hVar2.f36784e.setText(String.valueOf(bVar.f35508c));
                        hVar2.f36785f.setText(String.valueOf(bVar.f35510e));
                        hVar2.g.setText(String.valueOf(bVar.f35511f));
                        hVar2.f36786h.setText(wi.c.e(bVar.g));
                        break;
                    }
                } else {
                    wj.l lVar2 = (wj.l) x1Var;
                    TextView textView4 = lVar2.f36807f;
                    TextView textView5 = lVar2.f36806e;
                    switch (gVar.f36779b) {
                        case 1:
                            textView5.setText(R.string.appa_target_sdk);
                            textView4.setText(R.string.appa_target_sdk_description_short);
                            lVar2.a(gVar);
                            break;
                        case 2:
                            textView5.setText(R.string.appa_min_sdk);
                            textView4.setText(R.string.appa_min_sdk_description_short);
                            lVar2.a(gVar);
                            break;
                        case 3:
                            textView5.setText(R.string.appa_native_lib);
                            textView4.setText(R.string.appa_native_lib_description_short);
                            lVar2.a(gVar);
                            break;
                        case 4:
                            textView5.setText(R.string.appa_app_installer);
                            textView4.setText(R.string.appa_installer_description_short);
                            lVar2.a(gVar);
                            break;
                        case 5:
                            textView5.setText(R.string.appa_install_loc);
                            textView4.setText(R.string.appa_install_loc_description_short);
                            lVar2.a(gVar);
                            break;
                        case 6:
                            textView5.setText(R.string.appa_sign_algorithm);
                            textView4.setText(R.string.appa_sign_algorithm_description_short);
                            lVar2.a(gVar);
                            break;
                    }
                    x1Var.itemView.setOnClickListener(new ah.g(13, this, gVar));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0152 A[PHI: r2
  0x0152: PHI (r2v45 int) = (r2v44 int), (r2v47 int), (r2v50 int), (r2v51 int), (r2v52 int) binds: [B:21:0x00e6, B:25:0x00fd, B:31:0x011e, B:33:0x012b, B:35:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.x1 onCreateViewHolder(android.view.ViewGroup r27, int r28) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.e.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.x1");
    }

    public e(ui.g gVar) {
        this.f25975k = gVar;
        this.j = LayoutInflater.from(gVar.f35373b0);
    }

    public e(h0 h0Var) {
        this.f25975k = h0Var;
        this.j = LayoutInflater.from(h0Var.f35386b0);
    }

    public e(q qVar) {
        this.f25975k = qVar;
        this.j = LayoutInflater.from(qVar.f35457b0);
    }

    public e(ui.m mVar) {
        this.f25975k = mVar;
        this.j = LayoutInflater.from(mVar.f35434b0);
    }

    public e(m0 m0Var) {
        this.f25975k = m0Var;
        this.j = LayoutInflater.from(m0Var.f35437b0);
    }

    public e(Context context, ArrayList arrayList) {
        this.j = context;
        this.f25975k = arrayList;
    }

    public e(x0 x0Var) {
        this.f25975k = x0Var;
    }

    public e(AppsAnalyzeActivity appsAnalyzeActivity) {
        this.f25975k = appsAnalyzeActivity;
        this.j = LayoutInflater.from(appsAnalyzeActivity);
    }
}
