.class public final Landroidx/security/crypto/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/security/crypto/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/security/crypto/b$b$a;
    }
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field b:Landroid/security/keystore/KeyGenParameterSpec;

.field c:Landroidx/security/crypto/b$c;

.field d:Z

.field e:I

.field f:Z

.field final g:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "_androidx_security_master_key_"

    invoke-direct {p0, p1, v0}, Landroidx/security/crypto/b$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/security/crypto/b$b;->g:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Landroidx/security/crypto/b$b;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Landroidx/security/crypto/b;
    .locals 1

    invoke-static {p0}, Landroidx/security/crypto/b$b$a;->a(Landroidx/security/crypto/b$b;)Landroidx/security/crypto/b;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroidx/security/crypto/b$c;)Landroidx/security/crypto/b$b;
    .locals 3

    sget-object v0, Landroidx/security/crypto/b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Landroidx/security/crypto/b$b;->b:Landroid/security/keystore/KeyGenParameterSpec;

    if-nez v0, :cond_0

    iput-object p1, p0, Landroidx/security/crypto/b$b;->c:Landroidx/security/crypto/b$c;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "KeyScheme set after setting a KeyGenParamSpec"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported scheme: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Z)Landroidx/security/crypto/b$b;
    .locals 0

    iput-boolean p1, p0, Landroidx/security/crypto/b$b;->f:Z

    return-object p0
.end method
