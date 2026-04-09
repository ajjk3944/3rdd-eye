.class abstract Ltb/q$b;
.super Ltb/W;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltb/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "b"
.end annotation


# instance fields
.field private final b:Ltb/i;

.field private final c:Lgg/A;

.field final synthetic d:Ltb/q;


# direct methods
.method public constructor <init>(Ltb/q;Ltb/i;Lgg/A;)V
    .locals 1

    const-string/jumbo v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltb/q$b;->d:Ltb/q;

    invoke-direct {p0}, Ltb/W;-><init>()V

    iput-object p2, p0, Ltb/q$b;->b:Ltb/i;

    iput-object p3, p0, Ltb/q$b;->c:Lgg/A;

    return-void
.end method


# virtual methods
.method protected d(Lkb/p;)V
    .locals 5

    const-string/jumbo v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkb/p;->c()Lkb/q;

    move-result-object v0

    check-cast v0, Lkb/u;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lkb/u;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ltb/q$b;->b:Ltb/i;

    invoke-virtual {v2}, Ltb/i;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Ltb/q$b;->d:Ltb/q;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ltb/q;->n(Z)V

    iget-object v1, p0, Ltb/q$b;->c:Lgg/A;

    invoke-interface {v1}, Lgg/A;->isDisposed()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p1, LSj/a;->a:LSj/a$b;

    iget-object v0, p0, Ltb/q$b;->d:Ltb/q;

    invoke-virtual {v0}, Ltb/q;->d()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "Uh oh! Response subscriber unsubscribed: %s"

    invoke-virtual {p1, v1, v0}, LSj/a$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {v0}, Lkb/u;->b()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xc8

    if-gt v1, v0, :cond_4

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_4

    iget-object v0, p0, Ltb/q$b;->c:Lgg/A;

    invoke-interface {v0, p1}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    iget-object v0, p0, Ltb/q$b;->b:Ltb/i;

    invoke-virtual {v0}, Ltb/i;->a()Lkb/j;

    move-result-object v0

    invoke-virtual {v0}, Lkb/j;->b()Lkb/f;

    move-result-object v0

    instance-of v1, v0, Lkb/n;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    check-cast v0, Lkb/n;

    goto :goto_1

    :cond_5
    move-object v0, v2

    :goto_1
    iget-object v1, p0, Ltb/q$b;->c:Lgg/A;

    new-instance v3, Lcom/ui/unifi/core/base/net/exceptions/ApiRequestException;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lkb/n;->h()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_6
    move-object v4, v2

    :goto_2
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lkb/n;->g()Ljava/lang/String;

    move-result-object v2

    :cond_7
    invoke-direct {v3, v4, v2, p1}, Lcom/ui/unifi/core/base/net/exceptions/ApiRequestException;-><init>(Ljava/lang/String;Ljava/lang/String;Lkb/p;)V

    invoke-interface {v1, v3}, Lgg/A;->c(Ljava/lang/Throwable;)Z

    :goto_3
    return-void
.end method
