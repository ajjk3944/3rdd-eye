.class final LI/e1$z;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1;-><init>(LI/o1;LI/l1;LJ/j;LH/b;ZZLF/D;LH/d;ZLy/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/e1;

.field final synthetic b:LF/D;


# direct methods
.method constructor <init>(LI/e1;LF/D;)V
    .locals 0

    iput-object p1, p0, LI/e1$z;->a:LI/e1;

    iput-object p2, p0, LI/e1$z;->b:LF/D;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, LI/e1$z;->a:LI/e1;

    invoke-static {v0}, LI/e1;->O2(LI/e1;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LI/e1$z;->a:LI/e1;

    invoke-static {v0}, Landroidx/compose/ui/focus/q;->a(Lk0/k;)Z

    :cond_0
    iget-object v0, p0, LI/e1$z;->b:LF/D;

    invoke-virtual {v0}, LF/D;->h()I

    move-result v0

    sget-object v1, LR0/y;->b:LR0/y$a;

    invoke-virtual {v1}, LR0/y$a;->f()I

    move-result v2

    invoke-static {v0, v2}, LR0/y;->n(II)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LI/e1$z;->b:LF/D;

    invoke-virtual {v0}, LF/D;->h()I

    move-result v0

    invoke-virtual {v1}, LR0/y$a;->e()I

    move-result v1

    invoke-static {v0, v1}, LR0/y;->n(II)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LI/e1$z;->a:LI/e1;

    invoke-static {v0}, LI/e1;->N2(LI/e1;)LLi/y;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI/e1$z;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
