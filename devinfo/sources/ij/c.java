package ij;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends x1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f26006f = 0;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f26007c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f26008d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f26009e;

    public c(View view) {
        super(view);
        this.f26007c = (TextView) view.findViewById(R.id.tv_title);
        this.f26008d = (TextView) view.findViewById(R.id.tv_size);
        this.f26009e = (TextView) view.findViewById(R.id.tv_summary);
    }
}
