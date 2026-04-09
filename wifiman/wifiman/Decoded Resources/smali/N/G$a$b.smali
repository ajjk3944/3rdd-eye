.class final LN/G$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/G$a;->a(Lz/f;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:LN/H;

.field final synthetic c:LIi/N;


# direct methods
.method constructor <init>(ZLN/H;LIi/N;)V
    .locals 0

    iput-boolean p1, p0, LN/G$a$b;->a:Z

    iput-object p2, p0, LN/G$a$b;->b:LN/H;

    iput-object p3, p0, LN/G$a$b;->c:LIi/N;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-boolean v0, p0, LN/G$a$b;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LN/G$a$b;->b:LN/H;

    invoke-virtual {v0}, LN/H;->c()LN/b;

    move-result-object v0

    invoke-virtual {v0}, LN/b;->r()Lmh/l;

    move-result-object v0

    sget-object v1, LN/I;->Closed:LN/I;

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LN/G$a$b;->c:LIi/N;

    new-instance v4, LN/G$a$b$a;

    iget-object v0, p0, LN/G$a$b;->b:LN/H;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, LN/G$a$b$a;-><init>(LN/H;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/G$a$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
