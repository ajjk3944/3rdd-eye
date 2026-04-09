package m7;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* loaded from: classes3.dex */
public class a extends QueryInfoGenerationCallback {

    /* renamed from: a, reason: collision with root package name */
    public String f23451a;

    /* renamed from: b, reason: collision with root package name */
    public e7.a f23452b;

    public a(String str, e7.a aVar) {
        this.f23451a = str;
        this.f23452b = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f23452b.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f23452b.a(this.f23451a, queryInfo.getQuery(), queryInfo);
    }
}
