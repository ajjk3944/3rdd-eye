.class final LJ/g$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/g;-><init>(LI/o1;LJ/j;LI/l1;Z)V
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

    iput-object p1, p0, LJ/g$b;->a:LJ/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    iget-object v0, p0, LJ/g$b;->a:LJ/g;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v1

    invoke-static {v0, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/d;

    invoke-static {p1, p2}, LY0/k;->h(J)F

    move-result v2

    invoke-interface {v1, v2}, LY0/d;->x1(F)I

    move-result v2

    invoke-static {p1, p2}, LY0/k;->g(J)F

    move-result p1

    invoke-interface {v1, p1}, LY0/d;->x1(F)I

    move-result p1

    invoke-static {v2, p1}, LY0/s;->a(II)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, LJ/g;->Q2(LJ/g;J)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/k;

    invoke-virtual {p1}, LY0/k;->k()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LJ/g$b;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
