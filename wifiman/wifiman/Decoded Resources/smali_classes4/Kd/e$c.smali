.class public final LKd/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKd/e;->c(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LKd/e;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LKd/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LKd/e$c;->a:LKd/e;

    iput-object p2, p0, LKd/e$c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LKd/e$c;->a:LKd/e;

    invoke-static {v0}, LKd/e;->g(LKd/e;)Lac/e;

    move-result-object v0

    iget-object v1, p0, LKd/e$c;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Lac/e;->d(Ljava/lang/String;)Lac/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lac/b;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/ubnt/teleport/TeleportTunnel$d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/ubnt/teleport/TeleportTunnel$d;->a(Ljava/lang/String;)Lcom/ubnt/teleport/TeleportTunnel$d;

    move-result-object v1

    :cond_1
    new-instance v0, Ll9/a;

    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
