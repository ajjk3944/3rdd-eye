.class public final Lcom/ui/btle/v2/encryption/dh/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/v2/encryption/dh/a;-><init>(Lcom/ui/btle/v2/d$b;Lcom/ui/btle/v2/d$a;Lc9/a;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/btle/v2/encryption/dh/a;


# direct methods
.method public constructor <init>(Lcom/ui/btle/v2/encryption/dh/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/btle/v2/encryption/dh/a$g;->a:Lcom/ui/btle/v2/encryption/dh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/btle/v2/encryption/dh/a$g;->a:Lcom/ui/btle/v2/encryption/dh/a;

    invoke-virtual {v0}, Lcom/ui/btle/v2/encryption/dh/d;->b()[B

    move-result-object v0

    iget-object v1, p0, Lcom/ui/btle/v2/encryption/dh/a$g;->a:Lcom/ui/btle/v2/encryption/dh/a;

    invoke-virtual {v1, v0}, Lcom/ui/btle/v2/encryption/dh/d;->c([B)[B

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
