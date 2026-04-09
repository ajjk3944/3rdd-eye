package org.conscrypt;

import javax.net.ssl.SSLException;

/* loaded from: classes3.dex */
public abstract class HandshakeListener {
    public abstract void onHandshakeFinished() throws SSLException;
}
