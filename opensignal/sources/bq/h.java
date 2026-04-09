package bq;

import android.view.View;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import com.survicate.surveys.presentation.widget.MicroSurvicateTextInput;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2870b;

    public /* synthetic */ h(int i10, Object obj) {
        this.f2869a = i10;
        this.f2870b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        ar.a aVar;
        int i10 = this.f2869a;
        Object obj = this.f2870b;
        switch (i10) {
            case 0:
                MicroSurvicateCommentField microSurvicateCommentField = (MicroSurvicateCommentField) obj;
                int i11 = MicroSurvicateCommentField.E;
                br.l.e(microSurvicateCommentField, "this$0");
                if (z10 && (aVar = microSurvicateCommentField.D) != null) {
                    aVar.c();
                    break;
                }
                break;
            case 1:
                MicroSurvicateTextInput microSurvicateTextInput = (MicroSurvicateTextInput) obj;
                int i12 = MicroSurvicateTextInput.H;
                br.l.e(microSurvicateTextInput, "this$0");
                if (!z10) {
                    microSurvicateTextInput.validate();
                    break;
                }
                break;
            case 2:
                je.c cVar = (je.c) obj;
                cVar.s(cVar.t());
                break;
            default:
                je.j jVar = (je.j) obj;
                jVar.f13633l = z10;
                jVar.p();
                if (!z10) {
                    jVar.s(false);
                    jVar.f13634m = false;
                    break;
                }
                break;
        }
    }
}
