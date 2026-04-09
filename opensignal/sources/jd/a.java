package jd;

import android.graphics.Rect;
import android.view.View;
import com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatContentView;
import com.survicate.surveys.presentation.nps.micro.MicroSurveyPointNpsContentView;
import com.survicate.surveys.presentation.numerical.micro.MicroSurveyPointNumericalContentView;
import com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeContentView;
import com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleContentView;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextContentView;
import com.survicate.surveys.presentation.widget.MicroSurvicateTextInput;
import g4.j;
import h7.n1;
import zp.b;
import zp.c;
import zp.e;

/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13606a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13607d;

    public /* synthetic */ a(int i10, Object obj) {
        this.f13606a = i10;
        this.f13607d = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f13606a) {
            case 0:
                throw null;
            case 1:
                view.removeOnLayoutChangeListener(this);
                ((MicroSurveyPointNpsContentView) this.f13607d).F.d();
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                ((MicroSurveyPointNumericalContentView) this.f13607d).F.d();
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                ((MicroSurveyPointShapeContentView) this.f13607d).F.d();
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                ((MicroSurveyPointSmileyScaleContentView) this.f13607d).I.d();
                return;
            case j.STRING_FIELD_NUMBER /* 5 */:
                view.removeOnLayoutChangeListener(this);
                ((MicroSurveyPointCsatContentView) this.f13607d).D.d();
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                n1 n1VarI = ((MicroSurveyPointTextContentView) this.f13607d).f6532r.I(r1.getChildCount() - 1);
                if (n1VarI instanceof e) {
                    MicroSurvicateTextInput microSurvicateTextInput = ((e) n1VarI).f27501v;
                    microSurvicateTextInput.getClass();
                    Rect rect = new Rect();
                    microSurvicateTextInput.getDrawingRect(rect);
                    microSurvicateTextInput.requestRectangleOnScreen(rect, false);
                    return;
                }
                if (n1VarI instanceof b) {
                    Rect rect2 = new Rect();
                    View view2 = ((b) n1VarI).f10155a;
                    view2.getDrawingRect(rect2);
                    view2.requestRectangleOnScreen(rect2, false);
                    return;
                }
                if (n1VarI instanceof c) {
                    Rect rect3 = new Rect();
                    View view3 = ((c) n1VarI).f10155a;
                    view3.getDrawingRect(rect3);
                    view3.requestRectangleOnScreen(rect3, false);
                    return;
                }
                return;
        }
    }
}
