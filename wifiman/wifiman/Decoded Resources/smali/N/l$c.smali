.class final LN/l$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/l;->b(ZLK0/a;Landroidx/compose/ui/e;LN/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/i;

.field final synthetic b:LT/z1;

.field final synthetic c:LT/z1;

.field final synthetic d:LT/z1;

.field final synthetic e:LT/z1;

.field final synthetic f:LT/z1;


# direct methods
.method constructor <init>(LN/i;LT/z1;LT/z1;LT/z1;LT/z1;LT/z1;)V
    .locals 0

    iput-object p1, p0, LN/l$c;->a:LN/i;

    iput-object p2, p0, LN/l$c;->b:LT/z1;

    iput-object p3, p0, LN/l$c;->c:LT/z1;

    iput-object p4, p0, LN/l$c;->d:LT/z1;

    iput-object p5, p0, LN/l$c;->e:LT/z1;

    iput-object p6, p0, LN/l$c;->f:LT/z1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 9

    invoke-static {}, LN/l;->r()F

    move-result v0

    invoke-interface {p1, v0}, LY0/d;->d1(F)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float v0, v0

    iget-object v1, p0, LN/l$c;->b:LT/z1;

    invoke-static {v1}, LN/l;->m(LT/z1;)J

    move-result-wide v3

    iget-object v1, p0, LN/l$c;->c:LT/z1;

    invoke-static {v1}, LN/l;->n(LT/z1;)J

    move-result-wide v5

    invoke-static {}, LN/l;->q()F

    move-result v1

    invoke-interface {p1, v1}, LY0/d;->d1(F)F

    move-result v7

    move-object v2, p1

    move v8, v0

    invoke-static/range {v2 .. v8}, LN/l;->o(Lo0/f;JJFF)V

    iget-object v1, p0, LN/l$c;->d:LT/z1;

    invoke-static {v1}, LN/l;->l(LT/z1;)J

    move-result-wide v3

    iget-object v1, p0, LN/l$c;->e:LT/z1;

    invoke-static {v1}, LN/l;->j(LT/z1;)F

    move-result v5

    iget-object v1, p0, LN/l$c;->f:LT/z1;

    invoke-static {v1}, LN/l;->k(LT/z1;)F

    move-result v6

    iget-object v8, p0, LN/l$c;->a:LN/i;

    move v7, v0

    invoke-static/range {v2 .. v8}, LN/l;->p(Lo0/f;JFFFLN/i;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, LN/l$c;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
