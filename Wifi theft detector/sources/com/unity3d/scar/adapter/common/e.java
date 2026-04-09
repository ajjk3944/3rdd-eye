package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import java.util.List;

/* loaded from: classes3.dex */
public interface e {
    void a(Context context, boolean z10, e7.b bVar);

    void b(Context context, List list, e7.b bVar);

    void c(Context context, String str, UnityAdFormat unityAdFormat, e7.b bVar);

    void d(Context context, RelativeLayout relativeLayout, d7.c cVar, int i10, int i11, f fVar);

    void e(Context context, d7.c cVar, h hVar);

    void f(Context context, d7.c cVar, g gVar);

    void show(Activity activity, String str, String str2);
}
