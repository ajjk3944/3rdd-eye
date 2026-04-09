package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yn2;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lo2 extends pn2 {
    public lo2(yn2.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j4) {
        super(bVar, hashSet, jSONObject, j4);
    }

    @Override // com.yandex.mobile.ads.impl.yn2, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        jn2 jn2VarA = jn2.a();
        if (jn2VarA != null) {
            for (in2 in2Var : jn2VarA.b()) {
                if (this.f31850c.contains(in2Var.i())) {
                    in2Var.j().b(str, this.f31852e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(Object[] objArr) {
        return this.f31851d.toString();
    }
}
