.class final LJ/g$c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ/g;


# direct methods
.method constructor <init>(LJ/g;)V
    .locals 0

    iput-object p1, p0, LJ/g$c$a;->a:LJ/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 5

    iget-object v0, p0, LJ/g$c$a;->a:LJ/g;

    invoke-static {v0}, LJ/g;->P2(LJ/g;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LJ/g$c$a;->a:LJ/g;

    invoke-static {v0}, LJ/g;->M2(LJ/g;)LJ/j;

    move-result-object v0

    invoke-virtual {v0}, LJ/j;->U()LJ/j$a;

    move-result-object v0

    sget-object v1, LJ/j$a;->Touch:LJ/j$a;

    if-eq v0, v1, :cond_0

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, LJ/g$c$a;->a:LJ/g;

    invoke-static {v0}, LJ/g;->N2(LJ/g;)LI/o1;

    move-result-object v0

    iget-object v1, p0, LJ/g$c$a;->a:LJ/g;

    invoke-static {v1}, LJ/g;->M2(LJ/g;)LJ/j;

    move-result-object v1

    iget-object v2, p0, LJ/g$c$a;->a:LJ/g;

    invoke-static {v2}, LJ/g;->O2(LJ/g;)LI/l1;

    move-result-object v2

    iget-object v3, p0, LJ/g$c$a;->a:LJ/g;

    invoke-static {v3}, LJ/g;->L2(LJ/g;)J

    move-result-wide v3

    invoke-static {v0, v1, v2, v3, v4}, LJ/e;->a(LI/o1;LJ/j;LI/l1;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LJ/g$c$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object v0

    return-object v0
.end method
