package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC2149xw extends AbstractAsyncTaskC1987uw {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f17650c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f17651d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17653f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC2149xw(C1879sw c1879sw, HashSet hashSet, JSONObject jSONObject, long j6, int i) {
        super(c1879sw);
        this.f17653f = i;
        this.f17650c = new HashSet(hashSet);
        this.f17651d = jSONObject;
        this.f17652e = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC1987uw
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C1016cw c1016cw;
        switch (this.f17653f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (c1016cw = C1016cw.f13696c) != null) {
                    for (Rv rv : Collections.unmodifiableCollection(c1016cw.f13697a)) {
                        if (this.f17650c.contains(rv.f11084g)) {
                            AbstractC1502lw abstractC1502lw = rv.f11081d;
                            if (this.f17652e >= abstractC1502lw.f15490c) {
                                abstractC1502lw.f15491d = 2;
                                C1994v2.f17210g.D(abstractC1502lw.c(), "setNativeViewHierarchy", str, abstractC1502lw.f15488a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public void b(String str) {
        C1016cw c1016cw = C1016cw.f13696c;
        if (c1016cw != null) {
            for (Rv rv : Collections.unmodifiableCollection(c1016cw.f13697a)) {
                if (this.f17650c.contains(rv.f11084g)) {
                    AbstractC1502lw abstractC1502lw = rv.f11081d;
                    if (this.f17652e >= abstractC1502lw.f15490c && abstractC1502lw.f15491d != 3) {
                        abstractC1502lw.f15491d = 3;
                        C1994v2.f17210g.D(abstractC1502lw.c(), "setNativeViewHierarchy", str, abstractC1502lw.f15488a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f17653f) {
            case 0:
                return this.f17651d.toString();
            default:
                C1879sw c1879sw = this.f17192b;
                JSONObject jSONObject = (JSONObject) c1879sw.f16823b;
                JSONObject jSONObject2 = this.f17651d;
                if (AbstractC1718pw.e(jSONObject2, jSONObject)) {
                    return null;
                }
                c1879sw.f16823b = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC1987uw, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f17653f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
