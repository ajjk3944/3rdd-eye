.class public final Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d;->a(LYg/s;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

.field final synthetic c:[B


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;[B)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d$a;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d$a;->b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d$a;->c:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d$a;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Identification$Meta;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d$a;->b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

    invoke-static {v2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->i(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY6/h;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d$a;->b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d$a;->c:[B

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d$a;->c:[B

    invoke-static {v2, v3, v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->f(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;[BLY6/h;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Data;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Data;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/a;

    :cond_1
    if-eqz v1, :cond_2

    invoke-interface {p1, v1}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
