package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.b;

/* loaded from: classes2.dex */
public abstract class ClientInfo {

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        ClientType(int i10) {
            this.value = i10;
        }
    }

    public static abstract class a {
        public abstract ClientInfo a();

        public abstract a b(w3.a aVar);

        public abstract a c(ClientType clientType);
    }

    public static a a() {
        return new b.C0196b();
    }

    public abstract w3.a b();

    public abstract ClientType c();
}
