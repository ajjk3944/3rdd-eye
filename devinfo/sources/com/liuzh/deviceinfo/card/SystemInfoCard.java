package com.liuzh.deviceinfo.card;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class SystemInfoCard extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21219b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f21220a;

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0120 A[Catch: Exception -> 0x012b, TRY_ENTER, TryCatch #0 {Exception -> 0x012b, blocks: (B:24:0x0107, B:26:0x010d, B:28:0x0115, B:33:0x0122, B:32:0x0120), top: B:53:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SystemInfoCard(android.content.Context r9, android.util.AttributeSet r10) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.res.Resources.NotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liuzh.deviceinfo.card.SystemInfoCard.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final String a(Boolean bool) {
        if (bool == null) {
            return getContext().getString(R.string.unknown);
        }
        return getContext().getString(bool.booleanValue() ? R.string.supported : R.string.not_supported);
    }

    public final View b(LayoutInflater layoutInflater, int i4, String str) {
        View viewInflate = layoutInflater.inflate(R.layout.kvcard_item, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.name)).setText(i4);
        TextView textView = (TextView) viewInflate.findViewById(R.id.value);
        textView.setText(str);
        textView.setTextColor(this.f21220a);
        return viewInflate;
    }
}
