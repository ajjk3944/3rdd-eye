.class final LB/w$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/w$a;->a(Lc0/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/lazy/layout/d;

.field final synthetic b:LB/r;

.field final synthetic c:Landroidx/compose/ui/layout/x;

.field final synthetic d:LB/Q;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/layout/d;LB/r;Landroidx/compose/ui/layout/x;LB/Q;)V
    .locals 0

    iput-object p1, p0, LB/w$a$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    iput-object p2, p0, LB/w$a$a;->b:LB/r;

    iput-object p3, p0, LB/w$a$a;->c:Landroidx/compose/ui/layout/x;

    iput-object p4, p0, LB/w$a$a;->d:LB/Q;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 4

    iget-object p1, p0, LB/w$a$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    new-instance v0, Landroidx/compose/foundation/lazy/layout/h;

    iget-object v1, p0, LB/w$a$a;->b:LB/r;

    iget-object v2, p0, LB/w$a$a;->c:Landroidx/compose/ui/layout/x;

    iget-object v3, p0, LB/w$a$a;->d:LB/Q;

    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/lazy/layout/h;-><init>(LB/r;Landroidx/compose/ui/layout/x;LB/Q;)V

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/layout/d;->f(Landroidx/compose/foundation/lazy/layout/h;)V

    iget-object p1, p0, LB/w$a$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    new-instance v0, LB/w$a$a$a;

    invoke-direct {v0, p1}, LB/w$a$a$a;-><init>(Landroidx/compose/foundation/lazy/layout/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, LB/w$a$a;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
