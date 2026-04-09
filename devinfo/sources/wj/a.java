package wj;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import com.liuzho.lib.appinfo.AppInfoActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends x1 implements View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f36765c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f36766d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f36767e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f36768f;
    public final /* synthetic */ ej.e g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ej.e eVar, View view) {
        super(view);
        this.g = eVar;
        this.f36765c = (TextView) view.findViewById(R.id.name);
        this.f36766d = (TextView) view.findViewById(R.id.pkg_name);
        this.f36767e = (TextView) view.findViewById(R.id.version);
        this.f36768f = (ImageView) view.findViewById(R.id.icon);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = (b) ((ArrayList) ((se.b) this.g.j).f33558c).get(getAdapterPosition());
        if (bVar == null) {
            return;
        }
        nk.k.b(ii.a.f26002b);
        Context context = view.getContext();
        String str = bVar.f36771c;
        nk.k.e(context, "context");
        nk.k.e(str, "pkg");
        AppInfoActivity.B(context, -1, str);
    }
}
