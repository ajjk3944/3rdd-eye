package oi;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f30560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f30561c;

    public /* synthetic */ c(View view, Bitmap bitmap, int i4) {
        this.f30559a = i4;
        this.f30560b = view;
        this.f30561c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30559a) {
            case 0:
                ((ImageView) this.f30560b.findViewById(R.id.iv_progress)).setImageBitmap(this.f30561c);
                break;
            default:
                ((ImageView) this.f30560b.findViewById(R.id.iv_progress)).setImageBitmap(this.f30561c);
                break;
        }
    }
}
