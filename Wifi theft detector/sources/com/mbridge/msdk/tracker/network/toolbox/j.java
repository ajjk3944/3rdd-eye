package com.mbridge.msdk.tracker.network.toolbox;

import androidx.annotation.NonNull;
import com.mbridge.msdk.tracker.network.p;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* loaded from: classes3.dex */
public class j implements com.mbridge.msdk.thrid.okhttp.n {

    /* renamed from: b, reason: collision with root package name */
    private final String f18398b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18399c;

    /* renamed from: d, reason: collision with root package name */
    private final p f18400d;

    public j(String str, String str2, p pVar) {
        this.f18398b = str;
        this.f18399c = str2;
        this.f18400d = pVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    @NonNull
    public List<InetAddress> a(@NonNull String str) throws UnknownHostException {
        try {
            List<InetAddress> listA = com.mbridge.msdk.thrid.okhttp.n.f18020a.a(str);
            return (listA.isEmpty() && i.b().c(this.f18398b, this.f18399c, str)) ? a(str, new UnknownHostException("DNS result is empty")) : listA;
        } catch (UnknownHostException e10) {
            if (i.b().c(this.f18398b, this.f18399c, str)) {
                return a(str, new UnknownHostException(e10.getMessage()));
            }
            throw e10;
        }
    }

    private List<InetAddress> a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        p pVar = this.f18400d;
        if (pVar != null) {
            pVar.c("local");
        }
        return i.b().a(str, unknownHostException);
    }
}
