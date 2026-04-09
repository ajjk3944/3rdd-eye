package zh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.liuzh.deviceinfo.R;
import j$.util.Objects;
import km.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final c f38292a = new c();

    public static void a(Context context, RecyclerView recyclerView) {
        Drawable drawable = context.getDrawable(R.drawable.afs_md2_thumb);
        Context context2 = recyclerView.getContext();
        Drawable drawableL = jm.a.l(R.drawable.afs_track, context2);
        jm.a.l(R.drawable.afs_thumb, context2);
        Objects.requireNonNull(drawable);
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        new ql.c(recyclerView, new n(recyclerView), drawableL, wb.e.M(drawable, com.liuzh.deviceinfo.utilities.f.a()), new ql.a(recyclerView));
    }
}
