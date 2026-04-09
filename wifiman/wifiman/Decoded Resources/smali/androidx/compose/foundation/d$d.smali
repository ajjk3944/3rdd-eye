.class final Landroidx/compose/foundation/d$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/d;->g(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Ljava/lang/String;Lmh/a;Lmh/a;Lmh/a;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:LJ0/g;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lmh/a;

.field final synthetic f:Lmh/a;

.field final synthetic g:Lmh/a;


# direct methods
.method constructor <init>(ZLjava/lang/String;LJ0/g;Ljava/lang/String;Lmh/a;Lmh/a;Lmh/a;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/d$d;->a:Z

    iput-object p2, p0, Landroidx/compose/foundation/d$d;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/compose/foundation/d$d;->c:LJ0/g;

    iput-object p4, p0, Landroidx/compose/foundation/d$d;->d:Ljava/lang/String;

    iput-object p5, p0, Landroidx/compose/foundation/d$d;->e:Lmh/a;

    iput-object p6, p0, Landroidx/compose/foundation/d$d;->f:Lmh/a;

    iput-object p7, p0, Landroidx/compose/foundation/d$d;->g:Lmh/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 10

    const p1, 0x755f393b

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/foundation/j;->a()LT/H0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ls/G;

    instance-of p1, v2, Ls/I;

    if-eqz p1, :cond_1

    const p1, -0x66efc583

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    const/4 p1, 0x0

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_1
    const p1, -0x66ee1fbe

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_2

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p1, Ly/m;

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_0

    :goto_1
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-boolean v3, p0, Landroidx/compose/foundation/d$d;->a:Z

    iget-object v4, p0, Landroidx/compose/foundation/d$d;->b:Ljava/lang/String;

    iget-object v5, p0, Landroidx/compose/foundation/d$d;->c:LJ0/g;

    iget-object v6, p0, Landroidx/compose/foundation/d$d;->d:Ljava/lang/String;

    iget-object v7, p0, Landroidx/compose/foundation/d$d;->e:Lmh/a;

    iget-object v8, p0, Landroidx/compose/foundation/d$d;->f:Lmh/a;

    iget-object v9, p0, Landroidx/compose/foundation/d$d;->g:Lmh/a;

    invoke-static/range {v0 .. v9}, Landroidx/compose/foundation/d;->e(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Ljava/lang/String;Lmh/a;Lmh/a;Lmh/a;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/d$d;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
