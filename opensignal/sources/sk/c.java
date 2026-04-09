package sk;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.squareup.picasso.f0;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22068a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22069b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f22070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i10, List list, int i11) {
        super(context, i10, list);
        this.f22068a = i11;
        switch (i11) {
            case 1:
                super(context, i10, list);
                this.f22069b = i10;
                this.f22070c = f0.f(context);
                break;
            default:
                this.f22069b = i10;
                this.f22070c = f0.f(context);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
