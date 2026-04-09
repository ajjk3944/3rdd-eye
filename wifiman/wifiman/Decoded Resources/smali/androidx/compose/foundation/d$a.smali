.class final Landroidx/compose/foundation/d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/d;->c(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:LJ0/g;

.field final synthetic d:Lmh/a;


# direct methods
.method constructor <init>(ZLjava/lang/String;LJ0/g;Lmh/a;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/d$a;->a:Z

    iput-object p2, p0, Landroidx/compose/foundation/d$a;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/compose/foundation/d$a;->c:LJ0/g;

    iput-object p4, p0, Landroidx/compose/foundation/d$a;->d:Lmh/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 7

    const p1, -0x2d10e1f7

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)"

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

    const p1, 0x24c8cff8

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    const/4 p1, 0x0

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_1
    const p1, 0x24ca75bd

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

    iget-boolean v3, p0, Landroidx/compose/foundation/d$a;->a:Z

    iget-object v4, p0, Landroidx/compose/foundation/d$a;->b:Ljava/lang/String;

    iget-object v5, p0, Landroidx/compose/foundation/d$a;->c:LJ0/g;

    iget-object v6, p0, Landroidx/compose/foundation/d$a;->d:Lmh/a;

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;)Landroidx/compose/ui/e;

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

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/d$a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
