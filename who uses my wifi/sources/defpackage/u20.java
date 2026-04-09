package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u20 extends InputConnectionWrapper {
    public final /* synthetic */ dk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u20(InputConnection inputConnection, dk dkVar) {
        super(inputConnection, false);
        this.a = dkVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        aj zs1Var;
        z71 z71Var = inputContentInfo == null ? null : new z71(6, new vg0(4, inputContentInfo));
        n6 n6Var = (n6) this.a.f;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((vg0) z71Var.g).g).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((vg0) z71Var.g).g;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception unused) {
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((vg0) z71Var.g).g;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            zs1Var = new zs1(clipData, 2);
        } else {
            bj bjVar = new bj();
            bjVar.g = clipData;
            bjVar.h = 2;
            zs1Var = bjVar;
        }
        zs1Var.k(inputContentInfo3.getLinkUri());
        zs1Var.setExtras(bundle2);
        if (e61.h(n6Var, zs1Var.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
