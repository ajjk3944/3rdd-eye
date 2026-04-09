.class public final Lcom/ui/wifiman/model/teleport/session/a$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/session/a;-><init>(Landroid/content/Context;Llc/e;Lmc/a;Lac/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/session/a;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/session/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/session/a$j;->a:Lcom/ui/wifiman/model/teleport/session/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/session/a$j;->a:Lcom/ui/wifiman/model/teleport/session/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/session/a;->j(Lcom/ui/wifiman/model/teleport/session/a;)Lmc/a;

    move-result-object v0

    invoke-interface {v0}, Lmc/a;->getName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/session/a$j;->a:Lcom/ui/wifiman/model/teleport/session/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/session/a;->j(Lcom/ui/wifiman/model/teleport/session/a;)Lmc/a;

    move-result-object v0

    invoke-interface {v0}, Lmc/a;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
