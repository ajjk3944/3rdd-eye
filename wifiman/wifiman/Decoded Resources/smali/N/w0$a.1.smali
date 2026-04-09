.class final LN/w0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/w0;->a(ZLmh/a;Landroidx/compose/ui/e;ZLy/m;LN/u0;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/z1;

.field final synthetic b:LT/z1;


# direct methods
.method constructor <init>(LT/z1;LT/z1;)V
    .locals 0

    iput-object p1, p0, LN/w0$a;->a:LT/z1;

    iput-object p2, p0, LN/w0$a;->b:LT/z1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    invoke-static {}, LN/w0;->c()F

    move-result v1

    invoke-interface {v13, v1}, LY0/d;->d1(F)F

    move-result v3

    iget-object v1, v0, LN/w0$a;->a:LT/z1;

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v10

    invoke-static {}, LN/w0;->b()F

    move-result v1

    invoke-interface {v13, v1}, LY0/d;->d1(F)F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float v14, v3, v2

    sub-float v12, v1, v14

    new-instance v15, Lo0/k;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v15

    invoke-direct/range {v2 .. v9}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x6c

    const/16 v17, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v18, 0x0

    move-object/from16 v1, p1

    move-wide v2, v10

    move v4, v12

    move-object v8, v15

    move/from16 v10, v18

    move/from16 v11, v16

    move-object/from16 v12, v17

    invoke-static/range {v1 .. v12}, Lo0/f;->P1(Lo0/f;JFJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    iget-object v1, v0, LN/w0$a;->b:LT/z1;

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/h;

    invoke-virtual {v1}, LY0/h;->s()F

    move-result v1

    const/4 v2, 0x0

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v1, v2}, LY0/h;->h(FF)I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, v0, LN/w0$a;->a:LT/z1;

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v2

    iget-object v1, v0, LN/w0$a;->b:LT/z1;

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/h;

    invoke-virtual {v1}, LY0/h;->s()F

    move-result v1

    invoke-interface {v13, v1}, LY0/d;->d1(F)F

    move-result v1

    sub-float v4, v1, v14

    sget-object v8, Lo0/j;->a:Lo0/j;

    const/16 v11, 0x6c

    const/4 v12, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v12}, Lo0/f;->P1(Lo0/f;JFJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, LN/w0$a;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
