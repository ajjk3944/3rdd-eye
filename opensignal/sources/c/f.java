package c;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3008a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3009d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3010g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3011r;

    public /* synthetic */ f(g gVar, int i10, Object obj, int i11) {
        this.f3008a = i11;
        this.f3010g = gVar;
        this.f3009d = i10;
        this.f3011r = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3008a;
        int i11 = this.f3009d;
        Object obj = this.f3010g;
        Object obj2 = this.f3011r;
        switch (i10) {
            case 0:
                g gVar = (g) obj;
                Object obj3 = ((g.a) obj2).f9121a;
                String str = (String) gVar.f3012a.get(Integer.valueOf(i11));
                if (str != null) {
                    f.e eVar = (f.e) gVar.f3016e.get(str);
                    if (eVar == null) {
                        gVar.f3018g.remove(str);
                        gVar.f3017f.put(str, obj3);
                        break;
                    } else {
                        f.a aVar = eVar.f8377a;
                        if (gVar.f3015d.remove(str)) {
                            aVar.a(obj3);
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((g) obj).a(i11, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj2));
                break;
            case 2:
                int i12 = BottomSheetBehavior.f5508g0;
                ((BottomSheetBehavior) obj).F((View) obj2, i11, false);
                break;
            default:
                ((TextView) obj2).setTypeface((Typeface) obj, i11);
                break;
        }
    }

    public f(TextView textView, Typeface typeface, int i10) {
        this.f3008a = 3;
        this.f3011r = textView;
        this.f3010g = typeface;
        this.f3009d = i10;
    }

    public f(BottomSheetBehavior bottomSheetBehavior, View view, int i10) {
        this.f3008a = 2;
        this.f3010g = bottomSheetBehavior;
        this.f3011r = view;
        this.f3009d = i10;
    }
}
