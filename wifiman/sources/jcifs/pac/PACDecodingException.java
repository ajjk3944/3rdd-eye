package jcifs.pac;

import jcifs.CIFSException;

/* loaded from: classes4.dex */
public class PACDecodingException extends CIFSException {
    public PACDecodingException() {
        this(null, null);
    }

    public PACDecodingException(String str, Throwable th2) {
        super(str, th2);
    }
}
