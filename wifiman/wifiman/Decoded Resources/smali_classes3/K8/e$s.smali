.class final LK8/e$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/j;


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

    iput-object p1, p0, LK8/e$s;->a:LK8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Lrf/e;

    check-cast p3, Ll9/a;

    check-cast p4, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    check-cast p5, Ls9/d;

    check-cast p6, LId/h$a;

    invoke-virtual/range {p0 .. p6}, LK8/e$s;->b(Ll9/a;Lrf/e;Ll9/a;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;Ls9/d;LId/h$a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Lrf/e;Ll9/a;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;Ls9/d;LId/h$a;)Ll9/a;
    .locals 6

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "myself"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tunnelConnectionState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tunnelStateInfo"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tunnelUnavailability"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    move-object v4, p3

    check-cast v4, Lcom/ui/wifiman/ui/teleport/x;

    iget-object p3, p0, LK8/e$s;->a:LK8/e;

    invoke-static {p3, p1}, LK8/e;->u0(LK8/e;Lcom/ui/wifiman/model/teleport/h;)Lrf/e;

    move-result-object p1

    new-instance p3, Ll9/a;

    instance-of v0, p6, LId/h$a$d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_7

    :cond_0
    instance-of v2, p6, LId/h$a$a;

    if-nez v2, :cond_2

    instance-of v3, p6, LId/h$a$c;

    if-nez v3, :cond_2

    instance-of v3, p6, LId/h$a$b;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    new-instance v3, Lrf/f;

    iget-object v5, p0, LK8/e$s;->a:LK8/e;

    invoke-static {v5, p4}, LK8/e;->v0(LK8/e;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Lcom/ui/wifiman/ui/teleport/y;

    move-result-object p4

    invoke-direct {v3, p1, p2, p4}, Lrf/f;-><init>(Lrf/e;Lrf/e;Lcom/ui/wifiman/ui/teleport/y;)V

    if-nez v2, :cond_6

    instance-of p1, p6, LId/h$a$b;

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    if-nez v0, :cond_5

    instance-of p1, p6, LId/h$a$c;

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_1
    const/4 p1, 0x0

    :goto_2
    move v5, p1

    goto :goto_4

    :cond_6
    :goto_3
    const/4 p1, 0x1

    goto :goto_2

    :goto_4
    if-nez v0, :cond_8

    if-eqz v2, :cond_7

    goto :goto_5

    :cond_7
    instance-of p1, p6, LId/h$a$b;

    if-eqz p1, :cond_c

    move-object p1, p6

    check-cast p1, LId/h$a$b;

    invoke-virtual {p1}, LId/h$a$b;->a()LId/c;

    move-result-object p2

    instance-of p2, p2, LId/c$c;

    if-eqz p2, :cond_9

    :cond_8
    :goto_5
    move-object p1, v1

    goto :goto_6

    :cond_9
    new-instance p2, Lcom/ui/wifiman/ui/teleport/A$a;

    invoke-virtual {p1}, LId/h$a$b;->a()LId/c;

    move-result-object p4

    invoke-static {p4}, LK8/b;->d(LId/c;)Ls9/d;

    move-result-object p4

    const-string v0, ""

    if-nez p4, :cond_a

    new-instance p4, Ls9/d$c;

    invoke-direct {p4, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_a
    invoke-virtual {p1}, LId/h$a$b;->a()LId/c;

    move-result-object p1

    invoke-static {p1}, LK8/b;->a(LId/c;)Ls9/d;

    move-result-object p1

    if-nez p1, :cond_b

    new-instance p1, Ls9/d$c;

    invoke-direct {p1, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_b
    iget-object v0, p0, LK8/e$s;->a:LK8/e;

    invoke-static {v0, p6}, LK8/e;->s0(LK8/e;LId/h$a;)Ls9/d;

    move-result-object p6

    invoke-direct {p2, p4, p1, p6}, Lcom/ui/wifiman/ui/teleport/A$a;-><init>(Ls9/d;Ls9/d;Ls9/d;)V

    move-object p1, p2

    goto :goto_6

    :cond_c
    instance-of p1, p6, LId/h$a$c;

    if-eqz p1, :cond_d

    new-instance p1, Lcom/ui/wifiman/ui/teleport/A$a;

    move-object p2, p6

    check-cast p2, LId/h$a$c;

    invoke-virtual {p2}, LId/h$a$c;->a()LId/a$c;

    move-result-object p4

    invoke-static {p4}, LH8/o;->b(LId/a$c;)Ls9/d;

    move-result-object p4

    invoke-virtual {p2}, LId/h$a$c;->a()LId/a$c;

    move-result-object p2

    invoke-static {p2}, LH8/o;->a(LId/a$c;)Ls9/d;

    move-result-object p2

    iget-object v0, p0, LK8/e$s;->a:LK8/e;

    invoke-static {v0, p6}, LK8/e;->s0(LK8/e;LId/h$a;)Ls9/d;

    move-result-object p6

    invoke-direct {p1, p4, p2, p6}, Lcom/ui/wifiman/ui/teleport/A$a;-><init>(Ls9/d;Ls9/d;Ls9/d;)V

    goto :goto_6

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :goto_6
    new-instance p2, Lcom/ui/wifiman/ui/teleport/A;

    move-object v0, p2

    move-object v1, p5

    move-object v2, v3

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/ui/wifiman/ui/teleport/A;-><init>(Ls9/d;Lrf/f;Lcom/ui/wifiman/ui/teleport/A$a;Lcom/ui/wifiman/ui/teleport/x;Z)V

    move-object v1, p2

    :goto_7
    invoke-direct {p3, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p3
.end method
