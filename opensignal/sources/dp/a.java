package dp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.DatePicker;
import br.l;
import com.survicate.surveys.utils.SurvicateLocalDate;
import java.util.Calendar;
import kotlin.Metadata;
import o4.p;
import on.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ldp/a;", "Lo4/p;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "<init>", "()V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends p implements DatePickerDialog.OnDateSetListener {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Parcelable] */
    @Override // o4.p
    public final Dialog h0() {
        Parcelable parcelable;
        Bundle bundle = this.B;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("selected_date", SurvicateLocalDate.class);
            } else {
                ?? parcelable2 = bundle.getParcelable("selected_date");
                parcelable = parcelable2 instanceof SurvicateLocalDate ? parcelable2 : null;
            }
            survicateLocalDate = (SurvicateLocalDate) parcelable;
        }
        Calendar calendar = Calendar.getInstance();
        l.d(calendar, "getInstance(...)");
        int i10 = calendar.get(1);
        int i11 = calendar.get(2) + 1;
        int i12 = calendar.get(5);
        if (survicateLocalDate != null) {
            i10 = survicateLocalDate.f6603a;
        }
        int i13 = i10;
        if (survicateLocalDate != null) {
            i11 = survicateLocalDate.f6604d;
        }
        int i14 = i11 - 1;
        if (survicateLocalDate != null) {
            i12 = survicateLocalDate.f6605g;
        }
        return new DatePickerDialog(X(), v.Widget_DatePickerDialog_Micro, this, i13, i14, i12);
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        l.e(datePicker, "view");
        SurvicateLocalDate survicateLocalDate = new SurvicateLocalDate(i10, i11 + 1, i12);
        Intent intent = new Intent();
        intent.putExtra("selected_date", survicateLocalDate);
        androidx.fragment.app.b bVarS = s(true);
        if (bVarS != null) {
            p4.c cVar = p4.d.f20249a;
            p4.d.b(new p4.e(this, "Attempting to get target request code from fragment " + this));
            p4.d.a(this).getClass();
            p4.b bVar = p4.b.PENALTY_LOG;
            bVarS.A(this.F, -1, intent);
        }
    }
}
