package sh;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w0 extends x1 implements View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f33776c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f33777d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f33778e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f33779f;
    public final /* synthetic */ ig.e g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ig.e eVar, View view) {
        super(view);
        this.g = eVar;
        this.f33776c = (ImageView) view.findViewById(R.id.status);
        this.f33777d = (TextView) view.findViewById(R.id.name);
        this.f33778e = (ImageView) view.findViewById(R.id.icon);
        this.f33779f = (TextView) view.findViewById(R.id.text);
        view.setOnClickListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015e  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.view.View r13) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.w0.onClick(android.view.View):void");
    }
}
