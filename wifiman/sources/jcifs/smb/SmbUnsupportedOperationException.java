package jcifs.smb;

/* loaded from: classes4.dex */
public class SmbUnsupportedOperationException extends SmbException {
    public SmbUnsupportedOperationException() {
        super("Operation is not supported with the negotiated capabilities");
    }
}
