.class final LF/h0$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/h0$a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/g0;


# direct methods
.method constructor <init>(LF/g0;)V
    .locals 0

    iput-object p1, p0, LF/h0$a$a;->a:LF/g0;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 14

    move-object v0, p0

    iget-object v1, v0, LF/h0$a$a;->a:LF/g0;

    invoke-virtual {v1}, LF/g0;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->g(J)I

    move-result v3

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v4

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v5

    invoke-static {v3, v4, v5}, Lsh/m;->k(III)I

    move-result v8

    invoke-static {v1, v2}, LY0/r;->f(J)I

    move-result v1

    invoke-static/range {p3 .. p4}, LY0/b;->m(J)I

    move-result v2

    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v3

    invoke-static {v1, v2, v3}, Lsh/m;->k(III)I

    move-result v10

    const/16 v12, 0xa

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-wide/from16 v6, p3

    invoke-static/range {v6 .. v13}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v1

    move-object/from16 v3, p2

    invoke-interface {v3, v1, v2}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v3

    invoke-virtual {v1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v4

    new-instance v6, LF/h0$a$a$a;

    invoke-direct {v6, v1}, LF/h0$a$a$a;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/layout/m;

    check-cast p2, LC0/B;

    check-cast p3, LY0/b;

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, LF/h0$a$a;->a(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    return-object p1
.end method
