package w4;

import android.net.Uri;
import android.widget.Button;
import android.widget.ImageView;
import com.lefan.base.activity.SuggestActivity;
import e.InterfaceC2285b;
import h.AbstractActivityC2349g;
import java.util.HashMap;
import o.P0;

/* renamed from: w4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2978d implements InterfaceC2285b, P0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2349g f23975a;

    public /* synthetic */ C2978d(AbstractActivityC2349g abstractActivityC2349g) {
        this.f23975a = abstractActivityC2349g;
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) {
        SuggestActivity suggestActivity = (SuggestActivity) this.f23975a;
        Uri uri = (Uri) obj;
        if (uri == null) {
            int i = SuggestActivity.f18766W;
            return;
        }
        Button button = suggestActivity.f18773U;
        HashMap map = suggestActivity.f18768P;
        if (button != null) {
            button.setEnabled(false);
        }
        int i3 = suggestActivity.f18772T;
        if (i3 == 0) {
            ImageView imageView = suggestActivity.f18769Q;
            if (imageView != null) {
                imageView.setImageURI(uri);
            }
            map.put(0, uri);
            return;
        }
        if (i3 == 1) {
            ImageView imageView2 = suggestActivity.f18770R;
            if (imageView2 != null) {
                imageView2.setImageURI(uri);
            }
            map.put(1, uri);
            return;
        }
        if (i3 != 2) {
            return;
        }
        ImageView imageView3 = suggestActivity.f18771S;
        if (imageView3 != null) {
            imageView3.setImageURI(uri);
        }
        map.put(2, uri);
    }
}
