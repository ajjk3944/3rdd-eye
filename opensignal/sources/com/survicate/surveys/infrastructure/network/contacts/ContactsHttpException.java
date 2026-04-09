package com.survicate.surveys.infrastructure.network.contacts;

import br.l;
import com.survicate.surveys.infrastructure.network.HttpException;
import h0.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsHttpException;", "Lcom/survicate/surveys/infrastructure/network/HttpException;", "responseCode", "", "apiMessage", "", "(ILjava/lang/String;)V", "message", "getMessage", "()Ljava/lang/String;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContactsHttpException extends HttpException {
    private final String apiMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsHttpException(int i10, String str) {
        super(i10, null, 2, null);
        l.e(str, "apiMessage");
        this.apiMessage = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder("HTTP error (code: ");
        sb2.append(getResponseCode());
        sb2.append(", message: ");
        return b.r(sb2, this.apiMessage, ')');
    }
}
