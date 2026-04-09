package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s9.u;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetFileExtensionFromUrl;", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "removeUrlQuery", "Lcom/unity3d/ads/core/domain/RemoveUrlQuery;", "(Lcom/unity3d/ads/core/domain/RemoveUrlQuery;)V", "getRemoveUrlQuery", "()Lcom/unity3d/ads/core/domain/RemoveUrlQuery;", "invoke", "", "url", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonGetFileExtensionFromUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonGetFileExtensionFromUrl.kt\ncom/unity3d/ads/core/domain/CommonGetFileExtensionFromUrl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {

    @NotNull
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(@NotNull RemoveUrlQuery removeUrlQuery) {
        p.e(removeUrlQuery, "removeUrlQuery");
        this.removeUrlQuery = removeUrlQuery;
    }

    @NotNull
    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    @Nullable
    public String invoke(@NotNull String url) {
        p.e(url, "url");
        String strInvoke = this.removeUrlQuery.invoke(url);
        if (strInvoke == null) {
            return null;
        }
        String strP0 = u.P0(strInvoke, '/', null, 2, null);
        if (!u.O(strP0, '.', false, 2, null)) {
            return null;
        }
        String strP02 = u.P0(strP0, '.', null, 2, null);
        if (strP02.length() == 0) {
            return null;
        }
        return strP02;
    }
}
