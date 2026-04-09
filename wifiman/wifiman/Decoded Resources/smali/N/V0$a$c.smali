.class final LN/V0$a$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/V0$a;->a(FJJFLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:J

.field final synthetic c:Lmh/p;

.field final synthetic d:Z

.field final synthetic e:J


# direct methods
.method constructor <init>(FJLmh/p;ZJ)V
    .locals 0

    iput p1, p0, LN/V0$a$c;->a:F

    iput-wide p2, p0, LN/V0$a$c;->b:J

    iput-object p4, p0, LN/V0$a$c;->c:Lmh/p;

    iput-boolean p5, p0, LN/V0$a$c;->d:Z

    iput-wide p6, p0, LN/V0$a$c;->e:J

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 39

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:124)"

    const v4, -0x6f2a07d7

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, LN/f0;->a:LN/f0;

    const/4 v2, 0x6

    invoke-virtual {v1, v6, v2}, LN/f0;->c(LT/l;I)LN/c1;

    move-result-object v3

    invoke-virtual {v3}, LN/c1;->e()LL0/U;

    move-result-object v3

    invoke-virtual {v1, v6, v2}, LN/f0;->c(LT/l;I)LN/c1;

    move-result-object v1

    invoke-virtual {v1}, LN/c1;->d()LL0/U;

    move-result-object v1

    iget v2, v0, LN/V0$a$c;->a:F

    invoke-static {v3, v1, v2}, LL0/V;->c(LL0/U;LL0/U;F)LL0/U;

    move-result-object v7

    iget-boolean v1, v0, LN/V0$a$c;->d:Z

    iget-wide v8, v0, LN/V0$a$c;->e:J

    if-eqz v1, :cond_3

    const v37, 0xfffffe

    const/16 v38, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-static/range {v7 .. v38}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v1

    move-object v3, v1

    goto :goto_1

    :cond_3
    move-object v3, v7

    :goto_1
    iget-wide v1, v0, LN/V0$a$c;->b:J

    iget-object v5, v0, LN/V0$a$c;->c:Lmh/p;

    const/16 v7, 0x180

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v1 .. v8}, LN/V0;->b(JLL0/U;Ljava/lang/Float;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/V0$a$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
