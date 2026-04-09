.class public final Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c;->a(Ljava/nio/ByteBuffer;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/nio/ByteBuffer;

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c$a;->a:Ljava/nio/ByteBuffer;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c$a;->b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c$a;->b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const-class v3, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification;

    invoke-static {v2, v1, v3}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->g(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;[BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification;->a()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0
    :try_end_0
    .catch Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "Failed to parse event message"

    const/4 v3, 0x4

    invoke-static {v2, v1, v0, v3, v0}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
