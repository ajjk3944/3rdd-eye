.class public final Lcom/ui/wifiman/ui/teleport/a$d$a;
.super Lcom/ui/wifiman/ui/teleport/B;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/a$d;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final g:LLi/z;

.field private final h:LLi/z;


# direct methods
.method constructor <init>(LT/l;)V
    .locals 6

    invoke-direct {p0}, Lcom/ui/wifiman/ui/teleport/B;-><init>()V

    new-instance v1, Ls9/d$c;

    const-string v0, "Offline"

    invoke-direct {v1, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/ui/wifiman/ui/teleport/J;->v(LT/l;I)Lrf/f;

    move-result-object v2

    new-instance v3, Lcom/ui/wifiman/ui/teleport/A$a;

    new-instance p1, Ls9/d$b;

    sget v0, Lm8/c;->M3:I

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    new-instance v0, Ls9/d$b;

    sget v4, Lm8/c;->L3:I

    invoke-direct {v0, v4}, Ls9/d$b;-><init>(I)V

    new-instance v4, Ls9/d$c;

    const-string v5, "Action"

    invoke-direct {v4, v5}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v3, p1, v0, v4}, Lcom/ui/wifiman/ui/teleport/A$a;-><init>(Ls9/d;Ls9/d;Ls9/d;)V

    new-instance p1, Lcom/ui/wifiman/ui/teleport/A;

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/ui/wifiman/ui/teleport/A;-><init>(Ls9/d;Lrf/f;Lcom/ui/wifiman/ui/teleport/A$a;Lcom/ui/wifiman/ui/teleport/x;Z)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/a$d$a;->g:LLi/z;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/a$d$a;->h:LLi/z;

    return-void
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public bridge synthetic n0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/teleport/a$d$a;->s0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/teleport/a$d$a;->t0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public p0()V
    .locals 0

    return-void
.end method

.method public q0()V
    .locals 0

    return-void
.end method

.method public r0(Z)V
    .locals 0

    return-void
.end method

.method public s0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/a$d$a;->g:LLi/z;

    return-object v0
.end method

.method public t0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/a$d$a;->h:LLi/z;

    return-object v0
.end method
