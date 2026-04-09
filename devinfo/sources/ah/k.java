package ah;

import android.content.DialogInterface;
import com.liuzh.deviceinfo.analyzer.StorageAnalyzeActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f394b;

    public /* synthetic */ k(int i4, Object obj) {
        this.f393a = i4;
        this.f394b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i4 = this.f393a;
        Object obj = this.f394b;
        switch (i4) {
            case 0:
                o.f400d.h((i) obj);
                break;
            case 1:
                int i10 = StorageAnalyzeActivity.C;
                ((StorageAnalyzeActivity) obj).finish();
                break;
            default:
                ((xh.d) obj).U().finish();
                break;
        }
    }
}
