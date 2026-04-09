package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ve3 implements rx {
    public final /* synthetic */ Context f;

    @Override // defpackage.rx
    public final Object a() {
        Context context = this.f;
        i30.m(context, "<this>");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/ad_quality_data.pb");
    }
}
