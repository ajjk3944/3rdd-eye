package com.google.firebase;

import s3.AbstractC7901p;

/* loaded from: classes3.dex */
public class FirebaseException extends Exception {
    @Deprecated
    protected FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        AbstractC7901p.g(str, "Detail message must not be empty");
    }
}
