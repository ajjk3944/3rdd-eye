.class public Lorg/msgpack/core/MessageStringCodingException;
.super Lorg/msgpack/core/MessagePackException;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/nio/charset/CharacterCodingException;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/msgpack/core/MessagePackException;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/nio/charset/CharacterCodingException;
    .locals 1

    invoke-super {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/nio/charset/CharacterCodingException;

    return-object v0
.end method

.method public bridge synthetic getCause()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, Lorg/msgpack/core/MessageStringCodingException;->a()Ljava/nio/charset/CharacterCodingException;

    move-result-object v0

    return-object v0
.end method
