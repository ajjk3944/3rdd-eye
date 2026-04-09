package rk;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.staircase3.opensignal.activities.MainActivity;

/* loaded from: classes.dex */
public final class b implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21617a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f21618d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MainActivity f21619g;

    public b(MainActivity mainActivity, MainActivity mainActivity2, String str) {
        this.f21619g = mainActivity;
        this.f21618d = str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, lq.h] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f21617a) {
            case 0:
                if (!MainActivity.E0) {
                    MainActivity.E0 = true;
                    MainActivity.C0 = false;
                    MainActivity mainActivity = this.f21619g;
                    SharedPreferences.Editor editorEdit = ((vl.a) mainActivity.f6007h0.getValue()).f23928a.edit();
                    editorEdit.putBoolean("first_use", false);
                    editorEdit.apply();
                    dialogInterface.dismiss();
                    ((com.staircase3.opensignal.utils.a) mainActivity.f6013n0.getValue()).c("action_first_start_dialog", "ok", this.f21618d);
                    ((jn.b) mainActivity.f6011l0.getValue()).a(true);
                    ((cm.a) mainActivity.f6008i0.getValue()).b(true);
                    break;
                }
                break;
            default:
                if (!MainActivity.E0) {
                    MainActivity mainActivity2 = this.f21619g;
                    ((com.staircase3.opensignal.utils.a) mainActivity2.f6013n0.getValue()).c("action_first_start_dialog", "cancel", this.f21618d);
                    MainActivity.E0 = false;
                    dialogInterface.dismiss();
                    mainActivity2.finish();
                    break;
                }
                break;
        }
    }

    public b(MainActivity mainActivity, String str) {
        this.f21619g = mainActivity;
        this.f21618d = str;
    }
}
