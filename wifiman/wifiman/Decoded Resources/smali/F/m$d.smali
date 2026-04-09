.class final LF/m$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


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

.field final synthetic b:LR0/T;

.field final synthetic c:LR0/Q;

.field final synthetic d:LR0/s;


# direct methods
.method constructor <init>(LF/E;LR0/T;LR0/Q;LR0/s;)V
    .locals 0

    iput-object p1, p0, LF/m$d;->a:LF/E;

    iput-object p2, p0, LF/m$d;->b:LR0/T;

    iput-object p3, p0, LF/m$d;->c:LR0/Q;

    iput-object p4, p0, LF/m$d;->d:LR0/s;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 7

    iget-object p1, p0, LF/m$d;->a:LF/E;

    invoke-virtual {p1}, LF/E;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LF/m$d;->a:LF/E;

    sget-object v0, LF/W;->a:LF/W$a;

    iget-object v1, p0, LF/m$d;->b:LR0/T;

    iget-object v2, p0, LF/m$d;->c:LR0/Q;

    invoke-virtual {p1}, LF/E;->n()LR0/k;

    move-result-object v3

    iget-object v4, p0, LF/m$d;->d:LR0/s;

    iget-object v5, p0, LF/m$d;->a:LF/E;

    invoke-virtual {v5}, LF/E;->m()Lmh/l;

    move-result-object v5

    iget-object v6, p0, LF/m$d;->a:LF/E;

    invoke-virtual {v6}, LF/E;->l()Lmh/l;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, LF/W$a;->i(LR0/T;LR0/Q;LR0/k;LR0/s;Lmh/l;Lmh/l;)LR0/Z;

    move-result-object v0

    invoke-virtual {p1, v0}, LF/E;->E(LR0/Z;)V

    :cond_0
    new-instance p1, LF/m$d$a;

    invoke-direct {p1}, LF/m$d$a;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, LF/m$d;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
