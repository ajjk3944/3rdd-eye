package x8;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import c9.C2092m;
import i8.r;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import y9.q;

/* compiled from: ListPreferenceHelper.kt */
/* renamed from: x8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5781a extends C5782b {

    /* renamed from: j, reason: collision with root package name */
    public final Context f47806j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f47807k;

    public C5781a(Context context, AttributeSet attributeSet) {
        ArrayList arrayList;
        super(context, attributeSet);
        this.f47806j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f38632b);
        l.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            String string = typedArrayObtainStyledAttributes.getString(1);
            if (string != null) {
                List listR0 = q.r0(string, new String[]{StringUtils.COMMA});
                arrayList = new ArrayList(C2092m.T(listR0, 10));
                Iterator it = listR0.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(q.w0((String) it.next()).toString())));
                }
            } else {
                arrayList = null;
            }
            this.f47807k = arrayList;
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // x8.C5782b
    public final void d() {
        ArrayList arrayList;
        if (!C5782b.b() && ((arrayList = this.f47807k) == null || !(!arrayList.isEmpty()))) {
            c();
            return;
        }
        TextView textView = this.f47808a;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }
}
