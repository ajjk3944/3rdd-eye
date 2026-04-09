.class final Lsf/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsf/i;->c(Lsf/c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LL0/d;

.field final synthetic b:Lsf/c;


# direct methods
.method constructor <init>(LL0/d;Lsf/c;)V
    .locals 0

    iput-object p1, p0, Lsf/i$c;->a:LL0/d;

    iput-object p2, p0, Lsf/i$c;->b:Lsf/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LL0/d;Lsf/c;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lsf/i$c;->c(LL0/d;Lsf/c;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LL0/d;Lsf/c;I)LYg/J;
    .locals 1

    const-string v0, "report"

    invoke-virtual {p0, v0, p2, p2}, LL0/d;->j(Ljava/lang/String;II)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LL0/d$c;

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lsf/c;->t0()V

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lq/e;LT/l;I)V
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v9, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.teleport.invitation.TeleportInvitationUi.<anonymous>.<anonymous> (TeleportInvitationUi.kt:118)"

    const v3, -0x52134d3a

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v1, v0, Lsf/i$c;->a:LL0/d;

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object v2, v0, Lsf/i$c;->b:Lsf/c;

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v5, v4, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v4, v9, v7}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v8

    invoke-virtual {v8}, Lra/a;->a()Lra/b;

    move-result-object v8

    invoke-virtual {v8}, Lra/b;->a()Lra/b$a$a;

    move-result-object v8

    invoke-virtual {v8}, Lra/b$a$a;->d()F

    move-result v8

    const/4 v10, 0x2

    invoke-static {v3, v8, v5, v10, v6}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual {v4, v9, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->f()LL0/U;

    move-result-object v10

    invoke-virtual {v4, v9, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->a()J

    move-result-wide v11

    sget-object v4, LW0/j;->b:LW0/j$a;

    invoke-virtual {v4}, LW0/j$a;->a()I

    move-result v30

    const v40, 0xff7ffe

    const/16 v41, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-static/range {v10 .. v41}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v4

    const v5, 0x5c9d622d

    invoke-interface {v9, v5}, LT/l;->U(I)V

    invoke-interface {v9, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v9, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_2

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_3

    :cond_2
    new-instance v6, Lsf/j;

    invoke-direct {v6, v1, v2}, Lsf/j;-><init>(LL0/d;Lsf/c;)V

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v8, v6

    check-cast v8, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v10, 0x0

    const/16 v11, 0x78

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move-object v7, v12

    move-object/from16 v9, p2

    invoke-static/range {v1 .. v11}, LF/h;->a(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;LT/l;II)V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lsf/i$c;->b(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
