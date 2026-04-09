package K4;

import android.text.Spanned;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apm.insight.R;

/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: F, reason: collision with root package name */
    public static final SparseIntArray f2394F;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f2395D;

    /* renamed from: E, reason: collision with root package name */
    public long f2396E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2394F = sparseIntArray;
        sparseIntArray.put(R.id.item_title_name, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(View view) {
        super(view);
        Object[] objArr = new Object[3];
        Y.h.e(view, objArr, f2394F, true);
        this.f2396E = -1L;
        ((LinearLayout) objArr[0]).setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f2395D = textView;
        textView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f2396E = 4L;
        }
        f();
    }

    @Override // Y.h
    public final void b() {
        long j6;
        TextView textView;
        CharSequence text;
        synchronized (this) {
            j6 = this.f2396E;
            this.f2396E = 0L;
        }
        J4.d dVar = this.f2393n;
        long j7 = j6 & 7;
        String str = (j7 == 0 || dVar == null) ? null : dVar.f2145c;
        if (j7 == 0 || str == (text = (textView = this.f2395D).getText())) {
            return;
        }
        if (str == null && text.length() == 0) {
            return;
        }
        if (!(str instanceof Spanned)) {
            if ((str == null) == (text == null)) {
                if (str == null) {
                    return;
                }
                int length = str.length();
                if (length == text.length()) {
                    for (int i = 0; i < length; i++) {
                        if (str.charAt(i) == text.charAt(i)) {
                        }
                    }
                    return;
                }
            }
        } else if (str.equals(text)) {
            return;
        }
        textView.setText(str);
    }
}
