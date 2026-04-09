package com.google.android.exoplayer2.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.datepicker.m;
import com.staircase3.opensignal.activities.MainActivity;
import p.n2;

/* loaded from: classes.dex */
public final class e0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4655a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4656d;

    public /* synthetic */ e0(int i10, Object obj) {
        this.f4655a = i10;
        this.f4656d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f4655a) {
            case 0:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f4656d;
                CheckedTextView checkedTextView = trackSelectionView.f4619d;
                SparseArray sparseArray = trackSelectionView.f4620g;
                CheckedTextView checkedTextView2 = trackSelectionView.f4618a;
                if (view == checkedTextView2) {
                    trackSelectionView.f4623y = true;
                    sparseArray.clear();
                } else {
                    if (view != checkedTextView) {
                        trackSelectionView.f4623y = false;
                        view.getTag().getClass();
                        throw new ClassCastException();
                    }
                    trackSelectionView.f4623y = false;
                    sparseArray.clear();
                }
                checkedTextView2.setChecked(trackSelectionView.f4623y);
                checkedTextView.setChecked(!trackSelectionView.f4623y && sparseArray.size() == 0);
                throw null;
            case 1:
                com.google.android.material.datepicker.m mVar = (com.google.android.material.datepicker.m) this.f4656d;
                m.a aVar = mVar.A0;
                m.a aVar2 = m.a.YEAR;
                if (aVar == aVar2) {
                    mVar.h0(m.a.DAY);
                    mVar.D0.announceForAccessibility(mVar.r(ed.j.mtrl_picker_toggled_to_day_selection));
                    return;
                } else {
                    if (aVar == m.a.DAY) {
                        mVar.h0(aVar2);
                        mVar.C0.announceForAccessibility(mVar.r(ed.j.mtrl_picker_toggled_to_year_selection));
                        return;
                    }
                    return;
                }
            case 2:
                ((i.g) this.f4656d).dismiss();
                return;
            case 3:
                i.e eVar = (i.e) this.f4656d;
                Message messageObtain = (view != eVar.j || (message3 = eVar.f11030l) == null) ? (view != eVar.f11031m || (message2 = eVar.f11033o) == null) ? (view != eVar.f11034p || (message = eVar.f11036r) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                eVar.F.obtainMessage(1, eVar.f11022b).sendToTarget();
                return;
            case 4:
                ((n.a) this.f4656d).b();
                return;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                n2 n2Var = ((Toolbar) this.f4656d).f1025l0;
                o.o oVar = n2Var == null ? null : n2Var.f20121d;
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                StringBuilder sb2 = new StringBuilder("package:");
                MainActivity mainActivity = (MainActivity) this.f4656d;
                sb2.append(mainActivity.T.getPackageName());
                intent.setData(Uri.parse(sb2.toString()));
                mainActivity.startActivity(intent);
                return;
            default:
                o.o itemData = ((zd.e) view).getItemData();
                kd.b bVar = (kd.b) this.f4656d;
                boolean zQ = bVar.f27347l0.f27326a.q(itemData, bVar.f27346k0, 0);
                if (itemData == null || !itemData.isCheckable()) {
                    return;
                }
                if (!zQ || itemData.isChecked()) {
                    bVar.setCheckedItem(itemData);
                    return;
                }
                return;
        }
    }
}
