.class public final Lcom/wireguard/crypto/KeyFormatException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/wireguard/crypto/KeyFormatException$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/wireguard/crypto/b$a;

.field private final b:Lcom/wireguard/crypto/KeyFormatException$a;


# direct methods
.method constructor <init>(Lcom/wireguard/crypto/b$a;Lcom/wireguard/crypto/KeyFormatException$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    iput-object p1, p0, Lcom/wireguard/crypto/KeyFormatException;->a:Lcom/wireguard/crypto/b$a;

    iput-object p2, p0, Lcom/wireguard/crypto/KeyFormatException;->b:Lcom/wireguard/crypto/KeyFormatException$a;

    return-void
.end method
