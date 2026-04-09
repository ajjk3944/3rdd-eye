.class public final Lcom/ui/wifiman/model/network/hosts/a$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/network/hosts/a;->d(J)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/network/hosts/a;

.field final synthetic b:J


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/network/hosts/a;J)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a$n;->a:Lcom/ui/wifiman/model/network/hosts/a;

    iput-wide p2, p0, Lcom/ui/wifiman/model/network/hosts/a$n;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 6

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lcom/ui/wifiman/model/network/hosts/a$n;->a:Lcom/ui/wifiman/model/network/hosts/a;

    invoke-static {v1}, Lcom/ui/wifiman/model/network/hosts/a;->g(Lcom/ui/wifiman/model/network/hosts/a;)LRb/a;

    move-result-object v1

    iget-wide v2, p0, Lcom/ui/wifiman/model/network/hosts/a$n;->b:J

    new-array v4, v0, [J

    const/4 v5, 0x0

    aput-wide v2, v4, v5

    invoke-interface {v1, v4}, LRb/a;->b([J)I

    move-result v1

    if-lt v1, v0, :cond_0

    invoke-interface {p1}, Lgg/c;->a()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$HostNotFound;

    iget-wide v1, p0, Lcom/ui/wifiman/model/network/hosts/a$n;->b:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$HostNotFound;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
