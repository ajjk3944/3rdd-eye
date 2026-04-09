.class final Lda/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/s;->n(Lda/u;ZLjava/lang/String;Lmh/a;ZLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lda/u;


# direct methods
.method constructor <init>(Lda/u;)V
    .locals 0

    iput-object p1, p0, Lda/s$b;->a:Lda/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA9/i;LT/l;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v8, p2

    const-string v1, "$this$UiColumnWithDividers"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.sso.register.UiRegisterLayout.<anonymous>.<anonymous>.<anonymous> (UiRegisterLayout.kt:160)"

    const v3, -0x22759019

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget v1, LP9/b;->y0:I

    const/4 v2, 0x0

    invoke-static {v1, v8, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v4

    iget-object v1, v0, Lda/s$b;->a:Lda/u;

    invoke-virtual {v1}, Lda/u;->p0()LH/l;

    move-result-object v17

    new-instance v28, LF/D;

    sget-object v1, LR0/r;->b:LR0/r$a;

    invoke-virtual {v1}, LR0/r$a;->b()I

    move-result v22

    const/16 v26, 0x77

    const/16 v27, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v18, v28

    invoke-direct/range {v18 .. v27}, LF/D;-><init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Lda/s$b;->a:Lda/u;

    invoke-virtual {v1}, Lda/u;->q0()LLi/z;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    invoke-static {v1, v5, v8, v2, v3}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls9/d;

    const v3, 0x67232f1f

    invoke-interface {v8, v3}, LT/l;->U(I)V

    if-nez v1, :cond_1

    move-object/from16 v20, v5

    goto :goto_0

    :cond_1
    invoke-static {v1, v8, v2}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v20, v1

    :goto_0
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/high16 v22, 0x30000

    const v23, 0x37f75

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object v2, v4

    move-object/from16 v4, v17

    move-object/from16 v8, v20

    move-object/from16 v17, v28

    move-object/from16 v20, p2

    invoke-static/range {v1 .. v23}, LF9/c0;->c(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LH/l;LH/b;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZLm0/l0;LF/D;LH/d;Landroidx/compose/ui/focus/o;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lda/s$b;->a(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
