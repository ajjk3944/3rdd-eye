.class public abstract Lorg/libsodium/jni/SodiumJNI;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final native crypto_generichash_bytes()I
.end method

.method public static final native crypto_generichash_final([B[BI)I
.end method

.method public static final native crypto_generichash_init([B[BII)I
.end method

.method public static final native crypto_generichash_statebytes()I
.end method

.method public static final native crypto_generichash_update([B[BI)I
.end method

.method public static final native crypto_scalarmult([B[B[B)I
.end method

.method public static final native crypto_scalarmult_base([B[B)I
.end method

.method public static final native crypto_scalarmult_bytes()I
.end method

.method public static final native crypto_secretbox_xsalsa20poly1305([B[BI[B[B)I
.end method

.method public static final native crypto_secretbox_xsalsa20poly1305_open([B[BI[B[B)I
.end method

.method public static final native randombytes([BI)V
.end method

.method public static final native sodium_init()I
.end method
