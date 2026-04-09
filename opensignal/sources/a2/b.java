package a2;

import android.graphics.RenderNode;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ RenderNode B() {
        return new RenderNode("OffscreenLayer.shadow");
    }

    public static /* bridge */ /* synthetic */ boolean D(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }

    public static /* synthetic */ RenderNode f() {
        return new RenderNode("OffscreenLayer.main");
    }

    public static /* bridge */ /* synthetic */ CellIdentityNr h(Object obj) {
        return (CellIdentityNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellInfoNr i(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    public static /* bridge */ /* synthetic */ CellInfoTdscdma j(CellInfo cellInfo) {
        return (CellInfoTdscdma) cellInfo;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession k(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ boolean y(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoTdscdma;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof CellIdentityNr;
    }
}
