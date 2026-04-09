package kp;

import androidx.lifecycle.p;
import br.k;
import com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleContentView;
import com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleView;
import com.survicate.surveys.presentation.nps.micro.MicroSurveyPointNpsView;
import com.survicate.surveys.presentation.numerical.micro.MicroSurveyPointNumericalView;
import com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeView;
import com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleContentView;
import com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleView;
import g4.j;
import java.lang.reflect.InvocationTargetException;
import lq.b0;
import on.i0;
import wt.w;

/* loaded from: classes.dex */
public final /* synthetic */ class d extends k implements ar.a {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, obj, cls, str, str2, i11);
        this.E = i12;
    }

    @Override // ar.a
    public final Object c() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10 = this.E;
        b0 b0Var = b0.f15562a;
        Object obj = this.f2904d;
        switch (i10) {
            case 0:
                ar.a aVar = ((MicroSurveyPointMultipleContentView) obj).f6446d;
                if (aVar != null) {
                    aVar.c();
                    break;
                }
                break;
            case 1:
                ((wo.d) obj).a(false);
                break;
            case 2:
                e eVar = (e) obj;
                if (eVar.k0().getCurrentValidationState().isSuccess()) {
                    eVar.g0().h(eVar.k0().getAnswer());
                    break;
                }
                break;
            case 3:
                ((wo.f) obj).f();
                break;
            case 4:
                int i11 = MicroSurveyPointMultipleView.I;
                ((MicroSurveyPointMultipleView) obj).b();
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                int i12 = MicroSurveyPointMultipleView.I;
                ((MicroSurveyPointMultipleView) obj).b();
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((wo.d) obj).a(false);
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                mp.e eVar2 = (mp.e) obj;
                if (eVar2.k0().getCurrentValidationState().isSuccess()) {
                    eVar2.g0().h(eVar2.k0().getAnswer());
                    break;
                }
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                ((wo.f) obj).f();
                break;
            case 9:
                int i13 = MicroSurveyPointNpsView.J;
                ((MicroSurveyPointNpsView) obj).d();
                break;
            case 10:
                int i14 = MicroSurveyPointNpsView.J;
                ((MicroSurveyPointNpsView) obj).d();
                break;
            case 11:
                ((wo.d) obj).a(false);
                break;
            case 12:
                pp.d dVar = (pp.d) obj;
                if (dVar.k0().getCurrentValidationState().isSuccess()) {
                    dVar.g0().h(dVar.k0().getAnswer());
                    break;
                }
                break;
            case 13:
                ((wo.f) obj).f();
                break;
            case 14:
                int i15 = MicroSurveyPointNumericalView.J;
                ((MicroSurveyPointNumericalView) obj).d();
                break;
            case 15:
                int i16 = MicroSurveyPointNumericalView.J;
                ((MicroSurveyPointNumericalView) obj).d();
                break;
            case 16:
                ((wo.d) obj).a(false);
                break;
            case 17:
                sp.c cVar = (sp.c) obj;
                if (cVar.k0().getCurrentValidationState().isSuccess()) {
                    cVar.g0().h(cVar.k0().getAnswer());
                    break;
                }
                break;
            case 18:
                ((wo.f) obj).f();
                break;
            case 19:
                int i17 = MicroSurveyPointShapeView.J;
                ((MicroSurveyPointShapeView) obj).d();
                break;
            case 20:
                int i18 = MicroSurveyPointShapeView.J;
                ((MicroSurveyPointShapeView) obj).d();
                break;
            case 21:
                int i19 = MicroSurveyPointSingleContentView.G;
                ar.a aVar2 = ((MicroSurveyPointSingleContentView) obj).f6500d;
                if (aVar2 != null) {
                    aVar2.c();
                    break;
                }
                break;
            case 22:
                ((wo.d) obj).a(false);
                break;
            case 23:
                vp.c cVar2 = (vp.c) obj;
                if (cVar2.k0().getCurrentValidationState().isSuccess()) {
                    cVar2.g0().h(cVar2.k0().getAnswer());
                    break;
                }
                break;
            case 24:
                ((wo.f) obj).f();
                break;
            case 25:
                int i20 = MicroSurveyPointSingleView.J;
                ((MicroSurveyPointSingleView) obj).d();
                break;
            case 26:
                int i21 = MicroSurveyPointSingleView.J;
                ((MicroSurveyPointSingleView) obj).d();
                break;
            case 27:
                i0 i0Var = (i0) obj;
                w.s(i0Var.f19634g, null, null, new p(i0Var, (pq.c) null, 4), 3);
                break;
            case 28:
                ((wo.d) obj).a(false);
                break;
            default:
                xp.d dVar2 = (xp.d) obj;
                if (dVar2.k0().getCurrentValidationState().isSuccess()) {
                    dVar2.g0().h(dVar2.k0().getAnswer());
                    break;
                }
                break;
        }
        return b0Var;
    }
}
