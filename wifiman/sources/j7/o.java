package J7;

import com.squareup.moshi.JsonDataException;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudError;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestResponse;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseError;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseTokenFetch;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public final class o extends AbstractC6494u implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f9885a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar) {
        super(1);
        this.f9885a = nVar;
    }

    @Override // mh.InterfaceC6835l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ApiTeleportCloudRequestResponse invoke(Mj.w it) throws TeleportCloud.Error.InvalidResponse, TeleportCloud.Error.CloudError.Unauthenticated, TeleportCloud.Error.ApiError, TeleportCloud.Error.CloudError.TeleportDisabled, TeleportCloud.Error.CloudError.SiteGatewayNotFound, TeleportCloud.Error.CloudError.ClientInvalid {
        Object objC;
        Object next;
        n nVar = this.f9885a;
        AbstractC6492s.h(it, "it");
        String message = null;
        if (it.f()) {
            objC = it.a();
        } else {
            ResponseBody responseBodyD = it.d();
            String strC = responseBodyD != null ? responseBodyD.C() : null;
            AbstractC6492s.f(strC);
            if (kotlin.text.t.m0(strC)) {
                throw new TeleportCloud.Error.ApiError(it.b(), null, 2, null);
            }
            try {
                try {
                    objC = nVar.f9879e.c(strC);
                } catch (JsonDataException unused) {
                    objC = nVar.f9880f.c(strC);
                }
            } catch (JsonDataException unused2) {
                throw new TeleportCloud.Error.ApiError(it.b(), null, 2, null);
            }
        }
        int iB = it.b();
        if (objC instanceof ApiTeleportCloudRequestResponse) {
            return (ApiTeleportCloudRequestResponse) objC;
        }
        if (!(objC instanceof ApiTeleportCloudError)) {
            if (objC instanceof ApiTeleportCloudResponseError.TeleportDisabled) {
                throw TeleportCloud.Error.CloudError.TeleportDisabled.f39454a;
            }
            if (objC instanceof ApiTeleportCloudResponseTokenFetch.Error.TokenNotFound ? true : objC instanceof ApiTeleportCloudResponseTokenFetch.Error.TokenExpired) {
                throw TeleportCloud.Error.CloudError.Unauthenticated.f39456a;
            }
            if (objC instanceof ApiTeleportCloudResponseError.ClientNotFound) {
                throw TeleportCloud.Error.CloudError.ClientInvalid.f39450a;
            }
            if (objC instanceof ApiTeleportCloudResponseError.SiteGatewayNotFound) {
                throw TeleportCloud.Error.CloudError.SiteGatewayNotFound.f39452a;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid response - ");
            sb2.append(objC != null ? objC.getClass().getSimpleName() : null);
            throw new TeleportCloud.Error.InvalidResponse(sb2.toString(), null, 2, null);
        }
        if (iB == 401 || iB == 404) {
            throw TeleportCloud.Error.CloudError.Unauthenticated.f39456a;
        }
        ApiTeleportCloudError apiTeleportCloudError = (ApiTeleportCloudError) objC;
        if (AbstractC6492s.d(apiTeleportCloudError.getReason(), "Valid token is required.")) {
            throw TeleportCloud.Error.CloudError.Unauthenticated.f39456a;
        }
        int iB2 = it.b();
        String reason = apiTeleportCloudError.getReason();
        if (reason == null && (reason = apiTeleportCloudError.getException()) == null) {
            List errors = apiTeleportCloudError.getErrors();
            if (errors != null) {
                Iterator it2 = errors.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((ApiTeleportCloudError.Error) next).getMessage() != null) {
                        break;
                    }
                }
                ApiTeleportCloudError.Error error = (ApiTeleportCloudError.Error) next;
                if (error != null) {
                    message = error.getMessage();
                }
            }
        } else {
            message = reason;
        }
        throw new TeleportCloud.Error.ApiError(iB2, message);
    }
}
