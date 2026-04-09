.class public final LK8/e$w$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/e$w;->a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/TeleportConnection$a;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)V
    .locals 0

    iput-object p1, p0, LK8/e$w$f;->a:Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LK8/e$w$f;->a:Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;->b()LH7/b;

    move-result-object v0

    invoke-interface {v0}, LH7/b;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

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
