.class public abstract Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$Auth;,
        Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$KeyExchange;,
        Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$KeyGen;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0005\u0006\u0007B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u0082\u0001\u0003\u0008\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/ui/btle/v2/encryption/dh/DiffieHellman$Error",
        "Ljava/lang/RuntimeException;",
        "Lkotlin/RuntimeException;",
        "<init>",
        "()V",
        "Auth",
        "KeyExchange",
        "KeyGen",
        "Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$Auth;",
        "Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$KeyExchange;",
        "Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$KeyGen;",
        "btle-v2_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error;-><init>()V

    return-void
.end method
