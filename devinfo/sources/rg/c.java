package rg;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import b5.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends s {

    /* renamed from: p0, reason: collision with root package name */
    public static final ja.c f32943p0 = new ja.c();

    @Override // b5.s
    public final Dialog e0(Bundle bundle) {
        Context contextW = W();
        Bundle bundle2 = this.g;
        return new b(contextW, bundle2 != null ? bundle2.getString("key.msg") : null);
    }
}
