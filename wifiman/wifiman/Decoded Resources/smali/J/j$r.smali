.class final LJ/j$r;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->N(Ly0/G;Ly/m;Lmh/a;Lmh/a;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;

.field final synthetic b:LJ/j;

.field final synthetic c:Lmh/a;


# direct methods
.method constructor <init>(Lmh/a;LJ/j;Lmh/a;)V
    .locals 0

    iput-object p1, p0, LJ/j$r;->a:Lmh/a;

    iput-object p2, p0, LJ/j$r;->b:LJ/j;

    iput-object p3, p0, LJ/j$r;->c:Lmh/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 2

    sget-object v0, LJ/j$r$a;->a:LJ/j$r$a;

    invoke-static {v0}, LJ/k;->a(Lmh/a;)V

    iget-object v0, p0, LJ/j$r;->a:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    iget-object v0, p0, LJ/j$r;->b:LJ/j;

    invoke-static {v0}, LJ/j;->f(LJ/j;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LJ/j$r;->b:LJ/j;

    invoke-virtual {v0}, LJ/j;->i0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LJ/j$r;->b:LJ/j;

    invoke-static {v0}, LJ/j;->j(LJ/j;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LJ/j$r;->c:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    iget-object v0, p0, LJ/j$r;->b:LJ/j;

    invoke-static {v0}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v0

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LJ/j$r;->b:LJ/j;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LJ/j;->v(LJ/j;Z)V

    :cond_0
    iget-object v0, p0, LJ/j$r;->b:LJ/j;

    sget-object v1, LJ/n;->None:LJ/n;

    invoke-virtual {v0, v1}, LJ/j;->I0(LJ/n;)V

    iget-object v0, p0, LJ/j$r;->b:LJ/j;

    invoke-static {v0}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LI/l1;->b(J)J

    move-result-wide p1

    iget-object v0, p0, LJ/j$r;->b:LJ/j;

    invoke-static {v0}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object v1

    invoke-static {v1, p1, p2}, LI/m1;->b(LI/l1;J)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, LJ/j;->s(LJ/j;J)Z

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LJ/j$r;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
