package com.ui.unifi.core.base.net.client;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mb.j;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ui/unifi/core/base/net/client/MissingDataClientException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lmb/j;", "type", "<init>", "(Lmb/j;)V", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MissingDataClientException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingDataClientException(j type) {
        super("No data client for " + type + " found");
        AbstractC6492s.i(type, "type");
    }
}
