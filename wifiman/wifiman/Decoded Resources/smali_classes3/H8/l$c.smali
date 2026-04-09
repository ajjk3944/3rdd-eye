.class final LH8/l$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/l;->E0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/l;


# direct methods
.method constructor <init>(LH8/l;)V
    .locals 0

    iput-object p1, p0, LH8/l$c;->a:LH8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LH8/l$b;)Lgg/f;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string/jumbo v2, "state"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, p1, LH8/l$b$c;

    if-nez v2, :cond_2

    instance-of v2, p1, LH8/l$b$a;

    if-nez v2, :cond_2

    instance-of v2, p1, LH8/l$b$b$b;

    if-nez v2, :cond_2

    instance-of v2, p1, LH8/l$b$b$a;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p1, LH8/l$b$b$c;

    if-eqz p1, :cond_1

    iget-object p1, p0, LH8/l$c;->a:LH8/l;

    invoke-static {p1}, LH8/l;->x0(LH8/l;)Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->connect()Lgg/b;

    move-result-object p1

    const-wide/16 v2, 0x32

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v3, v4}, Lgg/b;->a0(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object v2

    invoke-virtual {p1, v2}, Lgg/b;->X(Lgg/f;)Lgg/b;

    move-result-object p1

    sget-object v2, LH8/l$c$a;->a:LH8/l$c$a;

    invoke-virtual {p1, v2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    iget-object v2, p0, LH8/l$c;->a:LH8/l;

    invoke-static {v2}, LH8/l;->y0(LH8/l;)Li8/a;

    move-result-object v2

    new-array v3, v1, [Li8/a$b;

    sget-object v4, Li8/a$b$n;->a:Li8/a$b$n;

    aput-object v4, v3, v0

    invoke-interface {v2, v3}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v2

    iget-object v3, p0, LH8/l$c;->a:LH8/l;

    invoke-static {v3}, LH8/l;->y0(LH8/l;)Li8/a;

    move-result-object v3

    new-instance v4, Li8/a$b$c;

    sget-object v5, LQe/c$a;->TELEPORT:LQe/c$a;

    invoke-direct {v4, v5}, Li8/a$b$c;-><init>(LQe/c$a;)V

    new-array v5, v1, [Li8/a$b;

    aput-object v4, v5, v0

    invoke-interface {v3, v5}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Lgg/f;

    aput-object p1, v4, v0

    aput-object v2, v4, v1

    const/4 p1, 0x2

    aput-object v3, v4, p1

    invoke-static {v4}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LH8/l$b;

    invoke-virtual {p0, p1}, LH8/l$c;->a(LH8/l$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
