.class public final LJ7/F$b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/F$b;->a(Ljava/lang/String;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/N;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;)V
    .locals 0

    iput-object p1, p0, LJ7/F$b$b;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, LJ7/F$b$b;->b:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/D;
    .locals 3

    instance-of v0, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz v0, :cond_0

    iget-object v0, p0, LJ7/F$b$b;->a:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object p1, v0

    check-cast p1, Ljava/lang/Throwable;

    :cond_0
    iget-object v0, p0, LJ7/F$b$b;->b:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;

    instance-of v1, p1, Lcom/squareup/moshi/JsonDataException;

    if-eqz v1, :cond_1

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo v1, "Invalid JSON content"

    invoke-direct {v0, v1, p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v1, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz v1, :cond_2

    new-instance p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$ResponseTimeout;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cloud fetch "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;->a()LK7/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " timed out"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$ResponseTimeout;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    if-eqz v0, :cond_3

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_3
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_4

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$NetworkError;

    const-string/jumbo v1, "error"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/io/IOException;

    invoke-direct {v0, p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$NetworkError;-><init>(Ljava/io/IOException;)V

    invoke-static {v0}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LJ7/F$b$b;->a(Ljava/lang/Throwable;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
