.class public final Lnf/p$g;
.super Lnf/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnf/p;->s(Lhf/t$a;Lnf/g;Ls9/d;Ls9/d;Lnf/b;Lnf/f;LT/l;II)Lnf/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final g:LLi/z;

.field private final h:LLi/z;

.field private final i:LLi/z;

.field private final j:LLi/z;

.field private final k:LLi/z;

.field private final l:LLi/z;

.field private final m:LLi/z;


# direct methods
.method constructor <init>(Lhf/t$a;Lnf/g;Ls9/d;Ls9/d;Lnf/b;Lnf/f;)V
    .locals 2

    invoke-direct {p0}, Lnf/h;-><init>()V

    sget-object v0, Lnf/d;->TEST:Lnf/d;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lnf/p$g;->g:LLi/z;

    new-instance v0, Ls9/d$b;

    sget v1, Lm8/c;->i3:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lnf/p$g;->h:LLi/z;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lnf/p$g;->i:LLi/z;

    new-instance p1, Lnf/c;

    const/4 v0, 0x1

    invoke-direct {p1, v0, p2, p3, p4}, Lnf/c;-><init>(ZLnf/g;Ls9/d;Ls9/d;)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lnf/p$g;->j:LLi/z;

    new-instance p1, Lcom/ui/wifiman/ui/component/network/k;

    new-instance p2, Lcom/ui/wifiman/ui/component/network/i;

    sget-object p3, LN9/b;->a:LN9/b;

    invoke-virtual {p3}, LN9/b;->B()Ls9/b;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/ui/wifiman/ui/component/network/i;-><init>(Ls9/a;)V

    new-instance p3, Lcom/ui/wifiman/ui/component/network/j;

    new-instance p4, Lcom/ui/wifiman/ui/component/network/i;

    sget-object v0, LPe/a;->a:LPe/a;

    invoke-virtual {v0}, LPe/a;->V()Ls9/b;

    move-result-object v0

    invoke-direct {p4, v0}, Lcom/ui/wifiman/ui/component/network/i;-><init>(Ls9/a;)V

    sget-object v0, Lcom/ui/wifiman/ui/component/network/h$b$b;->a:Lcom/ui/wifiman/ui/component/network/h$b$b;

    invoke-direct {p3, p4, v0}, Lcom/ui/wifiman/ui/component/network/j;-><init>(Lcom/ui/wifiman/ui/component/network/i;Lcom/ui/wifiman/ui/component/network/h;)V

    invoke-static {p3}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/ui/wifiman/ui/component/network/k;-><init>(Lcom/ui/wifiman/ui/component/network/i;Ljava/util/List;)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lnf/p$g;->k:LLi/z;

    invoke-static {p5}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lnf/p$g;->l:LLi/z;

    invoke-static {p6}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lnf/p$g;->m:LLi/z;

    return-void
.end method


# virtual methods
.method public A0()LLi/z;
    .locals 1

    iget-object v0, p0, Lnf/p$g;->j:LLi/z;

    return-object v0
.end method

.method public B0()LLi/z;
    .locals 1

    iget-object v0, p0, Lnf/p$g;->h:LLi/z;

    return-object v0
.end method

.method public C0()LLi/z;
    .locals 1

    iget-object v0, p0, Lnf/p$g;->i:LLi/z;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public bridge synthetic getTitle()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lnf/p$g;->B0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lnf/p$g;->w0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lnf/p$g;->x0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lnf/p$g;->y0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic r0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lnf/p$g;->z0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic s0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lnf/p$g;->A0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lnf/p$g;->C0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public u0()V
    .locals 0

    return-void
.end method

.method public v0(Z)V
    .locals 0

    return-void
.end method

.method public w0()LLi/z;
    .locals 1

    iget-object v0, p0, Lnf/p$g;->l:LLi/z;

    return-object v0
.end method

.method public x0()LLi/z;
    .locals 1

    iget-object v0, p0, Lnf/p$g;->k:LLi/z;

    return-object v0
.end method

.method public y0()LLi/z;
    .locals 1

    iget-object v0, p0, Lnf/p$g;->g:LLi/z;

    return-object v0
.end method

.method public z0()LLi/z;
    .locals 1

    iget-object v0, p0, Lnf/p$g;->m:LLi/z;

    return-object v0
.end method
