package com.wireguard.crypto;

import com.wireguard.crypto.b;

/* loaded from: classes4.dex */
public final class KeyFormatException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final b.a f45638a;

    /* renamed from: b, reason: collision with root package name */
    private final a f45639b;

    public enum a {
        CONTENTS,
        LENGTH
    }

    KeyFormatException(b.a aVar, a aVar2) {
        this.f45638a = aVar;
        this.f45639b = aVar2;
    }
}
