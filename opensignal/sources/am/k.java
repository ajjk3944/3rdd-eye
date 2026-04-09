package am;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.material.button.MaterialButton;
import com.staircase3.opensignal.osca.domain.model.ResolutionCardInfo;
import com.staircase3.opensignal.utils.u;
import h7.n1;
import h7.q0;
import java.util.ArrayList;
import java.util.List;
import lq.q;
import mq.x;

/* loaded from: classes.dex */
public final class k extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f877d = 2;

    /* renamed from: e, reason: collision with root package name */
    public Object f878e;

    /* renamed from: f, reason: collision with root package name */
    public Object f879f;

    public /* synthetic */ k() {
    }

    @Override // h7.q0
    public final int b() {
        switch (this.f877d) {
            case 0:
                return ((ArrayList) this.f879f).size() + 2;
            case 1:
                return ((List) this.f878e).size();
            default:
                ArrayList arrayList = (ArrayList) this.f879f;
                if (arrayList != null) {
                    return arrayList.size() + 2;
                }
                return 0;
        }
    }

    @Override // h7.q0
    public int d(int i10) {
        switch (this.f877d) {
            case 0:
                return i10 != 0 ? i10 != 1 ? a.PAGER.getType() : a.GDPR.getType() : a.START.getType();
            case 1:
            default:
                return super.d(i10);
            case 2:
                return (i10 == 0 || i10 == 2) ? 0 : 1;
        }
    }

    @Override // h7.q0
    public final void j(n1 n1Var, int i10) throws Resources.NotFoundException {
        final int i11 = 0;
        switch (this.f877d) {
            case 0:
                int iD = d(i10);
                final int i12 = 1;
                if (iD != a.START.getType()) {
                    if (iD != a.GDPR.getType()) {
                        if (iD == a.PAGER.getType()) {
                            Object obj = ((ArrayList) this.f879f).get(i10 - 2);
                            br.l.d(obj, "get(...)");
                            xl.a aVar = (xl.a) obj;
                            cj.a aVar2 = ((j) n1Var).f876u;
                            ConstraintLayout constraintLayout = (ConstraintLayout) aVar2.f3974d;
                            TextView textView = (TextView) aVar2.f3977x;
                            Context context = constraintLayout.getContext();
                            ((ImageView) aVar2.f3976r).setImageResource(aVar.f25447d);
                            ((TextView) aVar2.f3978y).setText(context.getString(aVar.f25445b));
                            ((TextView) aVar2.f3975g).setText(context.getString(aVar.f25444a));
                            if (!aVar.f25448e) {
                                textView.setVisibility(8);
                                break;
                            } else {
                                textView.setVisibility(0);
                                textView.setText(context.getString(aVar.f25446c));
                                break;
                            }
                        }
                    } else {
                        final i iVar = (i) n1Var;
                        cj.a aVar3 = iVar.f873u;
                        Context context2 = iVar.f875w;
                        String string = context2.getResources().getString(qk.l.gdpr_content);
                        br.l.d(string, "getString(...)");
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(string));
                        String string2 = context2.getString(qk.l.on_first_start_message_settings_span);
                        br.l.d(string2, "getString(...)");
                        String string3 = spannableStringBuilder.toString();
                        br.l.d(string3, "toString(...)");
                        if (tt.l.q0(string3, string2, false)) {
                            h hVar = new h(iVar);
                            String string4 = spannableStringBuilder.toString();
                            br.l.d(string4, "toString(...)");
                            int iB0 = tt.l.B0(string4, string2, 0, false, 6);
                            spannableStringBuilder.setSpan(hVar, iB0, string2.length() + iB0, 33);
                        }
                        TextView textView2 = (TextView) aVar3.f3977x;
                        textView2.setMovementMethod(LinkMovementMethod.getInstance());
                        textView2.setText(spannableStringBuilder);
                        TextView textView3 = (TextView) aVar3.f3978y;
                        textView3.setMovementMethod(LinkMovementMethod.getInstance());
                        String string5 = textView3.getContext().getString(qk.l.gdpr_privacy_policy_text);
                        q qVar = u.f6195a;
                        textView3.setText(Html.fromHtml(string5, 0));
                        ((ImageView) aVar3.f3976r).setOnClickListener(new View.OnClickListener() { // from class: am.g
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i11) {
                                    case 0:
                                        f fVar = iVar.f874v;
                                        if (fVar != null) {
                                            zl.a aVarG0 = fVar.g0();
                                            aVarG0.f27449e.f23591a.d("CATEGORY_ONBOARDING", "closegdprscreen", x.f16946a);
                                            aVarG0.c(zl.b.f27456c);
                                            break;
                                        }
                                        break;
                                    default:
                                        i iVar2 = iVar;
                                        ((Button) iVar2.f873u.f3975g).setVisibility(4);
                                        f fVar2 = iVar2.f874v;
                                        if (fVar2 != null) {
                                            fVar2.g0().d(fVar2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ((Button) aVar3.f3975g).setOnClickListener(new View.OnClickListener() { // from class: am.g
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i12) {
                                    case 0:
                                        f fVar = iVar.f874v;
                                        if (fVar != null) {
                                            zl.a aVarG0 = fVar.g0();
                                            aVarG0.f27449e.f23591a.d("CATEGORY_ONBOARDING", "closegdprscreen", x.f16946a);
                                            aVarG0.c(zl.b.f27456c);
                                            break;
                                        }
                                        break;
                                    default:
                                        i iVar2 = iVar;
                                        ((Button) iVar2.f873u.f3975g).setVisibility(4);
                                        f fVar2 = iVar2.f874v;
                                        if (fVar2 != null) {
                                            fVar2.g0().d(fVar2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    l lVar = (l) n1Var;
                    ((MaterialButton) lVar.f880u.f12354g).setOnClickListener(new b(i12, lVar));
                    break;
                }
                break;
            case 1:
                dn.k kVar = (dn.k) n1Var;
                ResolutionCardInfo resolutionCardInfo = (ResolutionCardInfo) ((List) this.f878e).get(i10);
                Button button = kVar.f7421x;
                br.l.e(resolutionCardInfo, "resolutionCardInfo");
                kVar.f7419v.setText(resolutionCardInfo.f6133a);
                kVar.f7420w.setText(resolutionCardInfo.f6134d);
                if (resolutionCardInfo.f6135g == null) {
                    button.setVisibility(8);
                    break;
                } else {
                    button.setVisibility(0);
                    button.setOnClickListener(new dn.j(kVar, i11, resolutionCardInfo));
                    break;
                }
            default:
                if (i10 >= 0) {
                    if (!(n1Var instanceof sk.j)) {
                        if (n1Var instanceof sk.i) {
                            TextView textView4 = ((sk.i) n1Var).f22098u;
                            if (i10 == 0) {
                                textView4.setText(qk.l.connected_tower);
                                break;
                            } else if (i10 == 2) {
                                textView4.setText(qk.l.other_towers);
                                break;
                            }
                        }
                    } else {
                        sk.j jVar = (sk.j) n1Var;
                        jVar.f22099u.setText((String) this.f878e);
                        try {
                            sm.k kVar2 = (sm.k) ((ArrayList) this.f879f).get(i10);
                            jVar.f22100v.setText("" + kVar2.f22137b);
                            jVar.f22101w.setText("" + kVar2.f22138c);
                            break;
                        } catch (IndexOutOfBoundsException unused) {
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // h7.q0
    public final n1 k(ViewGroup viewGroup, int i10) {
        switch (this.f877d) {
            case 0:
                f fVar = (f) this.f878e;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                if (i10 == a.START.getType()) {
                    View viewInflate = layoutInflaterFrom.inflate(qk.i.onboarding_start, viewGroup, false);
                    int i11 = qk.h.logo_imageview;
                    if (((ImageView) b4.A(viewInflate, i11)) != null) {
                        i11 = qk.h.page_button;
                        MaterialButton materialButton = (MaterialButton) b4.A(viewInflate, i11);
                        if (materialButton != null) {
                            i11 = qk.h.page_imageview;
                            if (((ImageView) b4.A(viewInflate, i11)) != null) {
                                i11 = qk.h.page_title_textview;
                                if (((TextView) b4.A(viewInflate, i11)) != null) {
                                    return new l(new io.sentry.internal.debugmeta.c((ConstraintLayout) viewInflate, 3, materialButton), fVar);
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
                }
                if (i10 != a.GDPR.getType()) {
                    View viewInflate2 = layoutInflaterFrom.inflate(qk.i.onboarding_page, viewGroup, false);
                    int i12 = qk.h.page_description_textview;
                    TextView textView = (TextView) b4.A(viewInflate2, i12);
                    if (textView != null) {
                        i12 = qk.h.page_imageview;
                        ImageView imageView = (ImageView) b4.A(viewInflate2, i12);
                        if (imageView != null) {
                            i12 = qk.h.page_subtitle_textview;
                            TextView textView2 = (TextView) b4.A(viewInflate2, i12);
                            if (textView2 != null) {
                                i12 = qk.h.page_title_textview;
                                TextView textView3 = (TextView) b4.A(viewInflate2, i12);
                                if (textView3 != null) {
                                    return new j(new cj.a((ConstraintLayout) viewInflate2, textView, imageView, textView2, textView3, 7));
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i12)));
                }
                View viewInflate3 = layoutInflaterFrom.inflate(qk.i.onboarding_gdpr, viewGroup, false);
                int i13 = qk.h.agree_button;
                Button button = (Button) b4.A(viewInflate3, i13);
                if (button != null) {
                    i13 = qk.h.agreement_container;
                    if (((LinearLayout) b4.A(viewInflate3, i13)) != null) {
                        i13 = qk.h.close_button;
                        ImageView imageView2 = (ImageView) b4.A(viewInflate3, i13);
                        if (imageView2 != null) {
                            i13 = qk.h.gdpr_content_textview;
                            TextView textView4 = (TextView) b4.A(viewInflate3, i13);
                            if (textView4 != null) {
                                i13 = qk.h.gdpr_title_textview;
                                if (((TextView) b4.A(viewInflate3, i13)) != null) {
                                    i13 = qk.h.privacy_policy_textview;
                                    TextView textView5 = (TextView) b4.A(viewInflate3, i13);
                                    if (textView5 != null) {
                                        return new i(new cj.a((ConstraintLayout) viewInflate3, button, imageView2, textView4, textView5, 6), fVar);
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i13)));
            case 1:
                View viewInflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(qk.i.osca_dialog_card, viewGroup, false);
                br.l.b(viewInflate4);
                return new dn.k(viewInflate4, (bf.a) this.f879f);
            default:
                return i10 == 0 ? new sk.i(LayoutInflater.from(viewGroup.getContext()).inflate(qk.i.row_towers_header, viewGroup, false)) : new sk.j(LayoutInflater.from(viewGroup.getContext()).inflate(qk.i.row_tower_list, viewGroup, false));
        }
    }

    public k(List list, bf.a aVar) {
        br.l.e(list, "resolutionCardItems");
        this.f878e = list;
        this.f879f = aVar;
    }

    public k(f fVar) {
        this.f878e = fVar;
        ArrayList arrayListE = e5.e(new xl.a(qk.l.onboarding_intro_page_description, qk.l.onboarding_intro_page_title, qk.f.ic_onboarding_intro));
        arrayListE.add(new xl.a(Build.VERSION.SDK_INT >= 29, qk.l.location_page_description, qk.l.location_page_title, qk.l.background_location_subtitle_using_app, qk.f.ic_location_permission));
        arrayListE.add(new xl.a(qk.l.phone_state_page_description, qk.l.phone_state_page_title, qk.f.ic_phone_state_permission));
        this.f879f = arrayListE;
    }
}
