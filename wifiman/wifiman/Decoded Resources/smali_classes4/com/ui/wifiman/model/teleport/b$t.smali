.class public final Lcom/ui/wifiman/model/teleport/b$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b;->disconnect()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$t;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b$t;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/b;->h(Lcom/ui/wifiman/model/teleport/b;)LFg/c;

    move-result-object v0

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, v1}, LFg/c;->h(Ljava/lang/Object;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
