.class final LM/I$b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/I$b;->h(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LY0/d;

.field final synthetic b:LT/q0;


# direct methods
.method constructor <init>(LY0/d;LT/q0;)V
    .locals 0

    iput-object p1, p0, LM/I$b$b;->a:LY0/d;

    iput-object p2, p0, LM/I$b$b;->b:LT/q0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lmh/a;)Landroidx/compose/ui/e;
    .locals 14

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    new-instance v1, LM/I$b$b$a;

    invoke-direct {v1, p1}, LM/I$b$b$a;-><init>(Lmh/a;)V

    new-instance v3, LM/I$b$b$b;

    iget-object p1, p0, LM/I$b$b;->a:LY0/d;

    iget-object v2, p0, LM/I$b$b;->b:LT/q0;

    invoke-direct {v3, p1, v2}, LM/I$b$b$b;-><init>(LY0/d;LT/q0;)V

    sget-object p1, Ls/V;->a:Ls/V$a;

    invoke-virtual {p1}, Ls/V$a;->a()Ls/V;

    move-result-object v11

    const/16 v12, 0x1ea

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v0 .. v13}, Ls/K;->f(Landroidx/compose/ui/e;Lmh/l;Lmh/l;Lmh/l;FZJFFZLs/V;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmh/a;

    invoke-virtual {p0, p1}, LM/I$b$b;->a(Lmh/a;)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
