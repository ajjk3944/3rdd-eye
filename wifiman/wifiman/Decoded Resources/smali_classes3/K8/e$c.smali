.class final LK8/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/e;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK8/e;


# direct methods
.method constructor <init>(LK8/e;)V
    .locals 0

    iput-object p1, p0, LK8/e$c;->a:LK8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Ll9/a;
    .locals 6

    const-string/jumbo v0, "connectionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz v0, :cond_1

    new-instance v0, Ll9/a;

    new-instance v1, Lcom/ui/wifiman/ui/teleport/x;

    iget-object v2, p0, LK8/e$c;->a:LK8/e;

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;->b()LH7/b;

    move-result-object v3

    invoke-interface {v3}, LH7/b;->c()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, LK8/e;->t0(LK8/e;J)Ls9/d;

    move-result-object v2

    iget-object v3, p0, LK8/e$c;->a:LK8/e;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;->b()LH7/b;

    move-result-object p1

    invoke-interface {p1}, LH7/b;->a()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, LK8/e;->t0(LK8/e;J)Ls9/d;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/ui/teleport/x;-><init>(Ls9/d;Ls9/d;)V

    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    new-instance v0, Ll9/a;

    const/4 p1, 0x0

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    :goto_1
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p0, p1}, LK8/e$c;->a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
