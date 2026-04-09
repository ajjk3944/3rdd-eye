.class public Lwj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()I
    .locals 1

    invoke-static {}, Lorg/libsodium/jni/SodiumJNI;->crypto_generichash_bytes()I

    move-result v0

    return v0
.end method

.method public static b([B[BI)I
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/libsodium/jni/SodiumJNI;->crypto_generichash_final([B[BI)I

    move-result p0

    return p0
.end method

.method public static c([B[BII)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/libsodium/jni/SodiumJNI;->crypto_generichash_init([B[BII)I

    move-result p0

    return p0
.end method

.method public static d()I
    .locals 1

    invoke-static {}, Lorg/libsodium/jni/SodiumJNI;->crypto_generichash_statebytes()I

    move-result v0

    return v0
.end method

.method public static e([B[BI)I
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/libsodium/jni/SodiumJNI;->crypto_generichash_update([B[BI)I

    move-result p0

    return p0
.end method

.method public static f([B[B[B)I
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/libsodium/jni/SodiumJNI;->crypto_scalarmult([B[B[B)I

    move-result p0

    return p0
.end method

.method public static g([B[B)I
    .locals 0

    invoke-static {p0, p1}, Lorg/libsodium/jni/SodiumJNI;->crypto_scalarmult_base([B[B)I

    move-result p0

    return p0
.end method

.method public static h()I
    .locals 1

    invoke-static {}, Lorg/libsodium/jni/SodiumJNI;->crypto_scalarmult_bytes()I

    move-result v0

    return v0
.end method

.method public static i([B[BI[B[B)I
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lorg/libsodium/jni/SodiumJNI;->crypto_secretbox_xsalsa20poly1305([B[BI[B[B)I

    move-result p0

    return p0
.end method

.method public static j([B[BI[B[B)I
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lorg/libsodium/jni/SodiumJNI;->crypto_secretbox_xsalsa20poly1305_open([B[BI[B[B)I

    move-result p0

    return p0
.end method

.method public static k([BI)V
    .locals 0

    invoke-static {p0, p1}, Lorg/libsodium/jni/SodiumJNI;->randombytes([BI)V

    return-void
.end method

.method public static l()I
    .locals 1

    invoke-static {}, Lorg/libsodium/jni/SodiumJNI;->sodium_init()I

    move-result v0

    return v0
.end method
