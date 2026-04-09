package xp;

import android.os.Build;
import android.view.View;
import androidx.lifecycle.o0;
import br.k;
import com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatView;
import com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleView;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextView;
import cq.h;
import g4.j;
import java.lang.reflect.InvocationTargetException;
import lq.b0;
import wt.w;
import wt.z;
import zp.i;

/* loaded from: classes.dex */
public final /* synthetic */ class c extends k implements ar.a {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, obj, cls, str, str2, i11);
        this.E = i12;
    }

    @Override // ar.a
    public final Object c() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10 = this.E;
        pq.c cVar = null;
        b0 b0Var = b0.f15562a;
        Object obj = this.f2904d;
        switch (i10) {
            case 0:
                ((wo.f) obj).f();
                break;
            case 1:
                int i11 = MicroSurveyPointSmileyScaleView.J;
                ((MicroSurveyPointSmileyScaleView) obj).d();
                break;
            case 2:
                int i12 = MicroSurveyPointSmileyScaleView.J;
                ((MicroSurveyPointSmileyScaleView) obj).d();
                break;
            case 3:
                break;
            case 4:
                View view = (View) obj;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 30) {
                    a2.f.g(view);
                }
                if (i13 >= 29 && (r0 = a2.c.b(view)) != null) {
                    break;
                }
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                ((wo.d) obj).a(false);
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                zo.d dVar = (zo.d) obj;
                if (dVar.k0().getCurrentValidationState().isSuccess()) {
                    dVar.g0().h(dVar.k0().getAnswer());
                    break;
                }
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((wo.f) obj).f();
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                int i14 = MicroSurveyPointCsatView.J;
                ((MicroSurveyPointCsatView) obj).d();
                break;
            case 9:
                int i15 = MicroSurveyPointCsatView.J;
                ((MicroSurveyPointCsatView) obj).d();
                break;
            case 10:
                ((wo.d) obj).a(false);
                break;
            case 11:
                i iVar = (i) obj;
                if (iVar.l0().getCurrentValidationState().isSuccess()) {
                    if (!iVar.l0().E.d()) {
                        iVar.g0().h(iVar.l0().getAnswer());
                        break;
                    } else {
                        z zVar = iVar.f27511y0;
                        if (zVar == null || !zVar.b()) {
                            iVar.f27511y0 = w.s(o0.d(iVar.t()), null, null, new h(iVar, cVar, 14), 3);
                            break;
                        }
                    }
                }
                break;
            case 12:
                ((wo.f) obj).f();
                break;
            case 13:
                int i16 = MicroSurveyPointTextView.I;
                ((MicroSurveyPointTextView) obj).c();
                break;
            default:
                int i17 = MicroSurveyPointTextView.I;
                ((MicroSurveyPointTextView) obj).c();
                break;
        }
        return b0Var;
    }
}
