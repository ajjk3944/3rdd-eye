package i7;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* loaded from: classes3.dex */
public class a extends QueryInfoGenerationCallback {

    /* renamed from: a, reason: collision with root package name */
    public String f21631a;

    /* renamed from: b, reason: collision with root package name */
    public e7.a f21632b;

    public a(String str, e7.a aVar) {
        this.f21631a = str;
        this.f21632b = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f21632b.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f21632b.a(this.f21631a, queryInfo.getQuery(), queryInfo);
    }
}
