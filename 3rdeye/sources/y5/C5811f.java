package y5;

import androidx.recyclerview.widget.RecyclerView;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: SessionsSettings.kt */
@h9.e(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {Sdk$SDKError.b.CONFIG_REFRESH_FAILED_VALUE, 139}, m = "updateSettings")
/* renamed from: y5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5811f extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public C5810e f48166l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f48167m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C5810e f48168n;

    /* renamed from: o, reason: collision with root package name */
    public int f48169o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5811f(C5810e c5810e, h9.c cVar) {
        super(cVar);
        this.f48168n = c5810e;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f48167m = obj;
        this.f48169o |= RecyclerView.UNDEFINED_DURATION;
        return this.f48168n.b(this);
    }
}
