.class final LF/m$o;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m;->a(LR0/Q;Lmh/l;Landroidx/compose/ui/e;LL0/U;LR0/c0;Lmh/l;Ly/m;Lm0/l0;ZIILR0/s;LF/C;ZZLmh/q;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;

.field final synthetic b:Landroidx/compose/ui/focus/o;

.field final synthetic c:LR0/s;

.field final synthetic d:LI/N0;


# direct methods
.method constructor <init>(LF/E;Landroidx/compose/ui/focus/o;LR0/s;LI/N0;)V
    .locals 0

    iput-object p1, p0, LF/m$o;->a:LF/E;

    iput-object p2, p0, LF/m$o;->b:Landroidx/compose/ui/focus/o;

    iput-object p3, p0, LF/m$o;->c:LR0/s;

    iput-object p4, p0, LF/m$o;->d:LI/N0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, LF/m$o;->a:LF/E;

    invoke-virtual {v0}, LF/E;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LF/m$o;->b:Landroidx/compose/ui/focus/o;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o;->f()V

    :cond_0
    iget-object v0, p0, LF/m$o;->c:LR0/s;

    invoke-virtual {v0}, LR0/s;->f()I

    move-result v0

    sget-object v1, LR0/y;->b:LR0/y$a;

    invoke-virtual {v1}, LR0/y$a;->f()I

    move-result v2

    invoke-static {v0, v2}, LR0/y;->n(II)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LF/m$o;->c:LR0/s;

    invoke-virtual {v0}, LR0/s;->f()I

    move-result v0

    invoke-virtual {v1}, LR0/y$a;->e()I

    move-result v1

    invoke-static {v0, v1}, LR0/y;->n(II)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LF/m$o;->d:LI/N0;

    invoke-virtual {v0}, LI/N0;->k()V

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF/m$o;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
