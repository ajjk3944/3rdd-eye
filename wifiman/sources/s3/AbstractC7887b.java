package s3;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7887b {
    public static ApiException a(Status status) {
        return status.g() ? new ResolvableApiException(status) : new ApiException(status);
    }
}
