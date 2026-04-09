package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FullUrlFormer<T> {

    /* renamed from: a, reason: collision with root package name */
    private List f42403a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f42404b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f42405c;

    /* renamed from: d, reason: collision with root package name */
    private final IParamsAppender f42406d;

    /* renamed from: e, reason: collision with root package name */
    private final ConfigProvider f42407e;

    public FullUrlFormer(IParamsAppender<T> iParamsAppender, ConfigProvider<T> configProvider) {
        this.f42406d = iParamsAppender;
        this.f42407e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f42403a.get(this.f42404b)).buildUpon();
        this.f42406d.appendParams(builderBuildUpon, this.f42407e.getConfig());
        this.f42405c = builderBuildUpon.build().toString();
    }

    public List<String> getAllHosts() {
        return this.f42403a;
    }

    public String getUrl() {
        return new c(this.f42405c).f42378a;
    }

    public boolean hasMoreHosts() {
        return this.f42404b + 1 < this.f42403a.size();
    }

    public void incrementAttemptNumber() {
        this.f42404b++;
    }

    public void setHosts(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f42403a = list;
    }
}
