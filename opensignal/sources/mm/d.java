package mm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import br.l;
import com.google.android.gms.internal.measurement.b4;
import com.staircase3.opensignal.utils.o;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import h7.n1;
import h7.q0;
import h7.r1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import mq.w;
import on.t;
import qk.h;
import qk.i;
import rk.m;
import zp.e;

/* loaded from: classes.dex */
public final class d extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16882d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16883e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16884f;

    /* renamed from: g, reason: collision with root package name */
    public Object f16885g;

    /* renamed from: h, reason: collision with root package name */
    public Object f16886h;

    public d(List list, MicroColorScheme microColorScheme) {
        this.f16882d = 2;
        l.e(list, "answers");
        l.e(microColorScheme, "colorScheme");
        this.f16883e = list;
        this.f16886h = microColorScheme;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // h7.q0
    public final int b() {
        switch (this.f16882d) {
            case 0:
                return this.f16884f.size();
            case 1:
                return this.f16884f.size();
            case 2:
                return ((List) this.f16883e).size();
            default:
                return ((List) this.f16884f).size();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x02a3  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // h7.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(h7.n1 r13, int r14) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mm.d.j(h7.n1, int):void");
    }

    @Override // h7.q0
    public final n1 k(ViewGroup viewGroup, int i10) {
        switch (this.f16882d) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i.video_test_history_item, (ViewGroup) null, false);
                int i11 = h.bufferTimeLabel;
                if (((TextView) b4.A(viewInflate, i11)) != null) {
                    i11 = h.bufferTimeValue;
                    TextView textView = (TextView) b4.A(viewInflate, i11);
                    if (textView != null) {
                        i11 = h.bufferingUnitLabel;
                        if (((TextView) b4.A(viewInflate, i11)) != null) {
                            i11 = h.elapsedTimeTextVideo;
                            TextView textView2 = (TextView) b4.A(viewInflate, i11);
                            if (textView2 != null) {
                                i11 = h.guidelineLatency;
                                if (((Guideline) b4.A(viewInflate, i11)) != null) {
                                    i11 = h.guidelineUpload;
                                    if (((Guideline) b4.A(viewInflate, i11)) != null) {
                                        i11 = h.leadingUnitLabel;
                                        if (((TextView) b4.A(viewInflate, i11)) != null) {
                                            i11 = h.loadTimeLabel;
                                            if (((TextView) b4.A(viewInflate, i11)) != null) {
                                                i11 = h.loadTimeValue;
                                                TextView textView3 = (TextView) b4.A(viewInflate, i11);
                                                if (textView3 != null) {
                                                    i11 = h.networkInformationTextVideo;
                                                    TextView textView4 = (TextView) b4.A(viewInflate, i11);
                                                    if (textView4 != null) {
                                                        i11 = h.playbackUnitLabel;
                                                        if (((TextView) b4.A(viewInflate, i11)) != null) {
                                                            i11 = h.smoothPlaybackValue;
                                                            TextView textView5 = (TextView) b4.A(viewInflate, i11);
                                                            if (textView5 != null) {
                                                                i11 = h.videoResolution;
                                                                TextView textView6 = (TextView) b4.A(viewInflate, i11);
                                                                if (textView6 != null) {
                                                                    this.f16886h = new of.b((ConstraintLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6);
                                                                    of.b bVar = (of.b) this.f16886h;
                                                                    if (bVar != null) {
                                                                        return new c(bVar, (o) this.f16883e);
                                                                    }
                                                                    l.l("binding");
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
            case 1:
                this.f16886h = new SimpleDateFormat("d MMMM y - HH:mm", Locale.getDefault());
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(i.speed_test_history_item, (ViewGroup) null, false);
                int i12 = h.downloadLabel;
                if (((TextView) b4.A(viewInflate2, i12)) != null) {
                    i12 = h.downloadUnit;
                    TextView textView7 = (TextView) b4.A(viewInflate2, i12);
                    if (textView7 != null) {
                        i12 = h.downloadValue;
                        TextView textView8 = (TextView) b4.A(viewInflate2, i12);
                        if (textView8 != null) {
                            i12 = h.elapsedTimeText;
                            TextView textView9 = (TextView) b4.A(viewInflate2, i12);
                            if (textView9 != null) {
                                i12 = h.guidelineLatency;
                                if (((Guideline) b4.A(viewInflate2, i12)) != null) {
                                    i12 = h.guidelineUpload;
                                    if (((Guideline) b4.A(viewInflate2, i12)) != null) {
                                        i12 = h.indoorOutdoorText;
                                        TextView textView10 = (TextView) b4.A(viewInflate2, i12);
                                        if (textView10 != null) {
                                            i12 = h.latencyLabel;
                                            if (((TextView) b4.A(viewInflate2, i12)) != null) {
                                                i12 = h.latencyValue;
                                                TextView textView11 = (TextView) b4.A(viewInflate2, i12);
                                                if (textView11 != null) {
                                                    i12 = h.networkInformationText;
                                                    TextView textView12 = (TextView) b4.A(viewInflate2, i12);
                                                    if (textView12 != null) {
                                                        i12 = h.uploadLabel;
                                                        if (((TextView) b4.A(viewInflate2, i12)) != null) {
                                                            i12 = h.uploadUnit;
                                                            TextView textView13 = (TextView) b4.A(viewInflate2, i12);
                                                            if (textView13 != null) {
                                                                i12 = h.uploadValue;
                                                                TextView textView14 = (TextView) b4.A(viewInflate2, i12);
                                                                if (textView14 != null) {
                                                                    al.b bVar2 = new al.b();
                                                                    bVar2.f810b = (ConstraintLayout) viewInflate2;
                                                                    bVar2.f809a = textView7;
                                                                    bVar2.f811c = textView8;
                                                                    bVar2.f812d = textView9;
                                                                    bVar2.f813e = textView10;
                                                                    bVar2.f814f = textView11;
                                                                    bVar2.f815g = textView12;
                                                                    bVar2.f816h = textView13;
                                                                    bVar2.f817i = textView14;
                                                                    SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.f16886h;
                                                                    if (simpleDateFormat != null) {
                                                                        return new m(bVar2, simpleDateFormat, (o) this.f16883e);
                                                                    }
                                                                    l.l("dateFormatter");
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i12)));
            case 2:
                View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_csat, viewGroup, false);
                l.d(viewInflate3, "inflate(...)");
                return new zo.a(this, viewInflate3, (MicroColorScheme) this.f16886h);
            default:
                View viewInflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(t.item_micro_text, viewGroup, false);
                l.b(viewInflate4);
                return new e(viewInflate4, (r1) this.f16883e, (MicroColorScheme) this.f16886h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(java.util.List r26) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mm.d.q(java.util.List):void");
    }

    public void r(QuestionPointAnswer questionPointAnswer) {
        List list = (List) this.f16883e;
        QuestionPointAnswer questionPointAnswer2 = (QuestionPointAnswer) this.f16884f;
        Integer numValueOf = questionPointAnswer2 != null ? Integer.valueOf(list.indexOf(questionPointAnswer2)) : null;
        this.f16884f = questionPointAnswer;
        if (numValueOf != null) {
            e(numValueOf.intValue());
        }
        e(list.indexOf(questionPointAnswer));
    }

    public d(r1 r1Var, MicroColorScheme microColorScheme) {
        this.f16882d = 3;
        l.e(r1Var, "viewDependencies");
        l.e(microColorScheme, "colorScheme");
        this.f16883e = r1Var;
        this.f16886h = microColorScheme;
        this.f16884f = w.f16945a;
    }

    public d(o oVar, int i10) {
        this.f16882d = i10;
        switch (i10) {
            case 1:
                l.e(oVar, "networkTypeUtils");
                this.f16883e = oVar;
                this.f16884f = w.f16945a;
                this.f16885g = new ArrayList();
                break;
            default:
                l.e(oVar, "networkTypeUtils");
                this.f16883e = oVar;
                this.f16884f = new ArrayList();
                this.f16885g = new ArrayList();
                break;
        }
    }
}
