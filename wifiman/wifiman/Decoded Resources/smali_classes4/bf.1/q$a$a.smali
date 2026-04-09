.class final Lbf/q$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbf/q$a;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbf/k;


# direct methods
.method constructor <init>(Lbf/k;)V
    .locals 0

    iput-object p1, p0, Lbf/q$a$a;->a:Lbf/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lbf/k;LT/q0;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lbf/q$a$a;->j(Lbf/k;LT/q0;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LT/q0;)LYg/J;
    .locals 0

    invoke-static {p0}, Lbf/q$a$a;->i(LT/q0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LT/q0;Z)V
    .locals 0

    invoke-static {p0, p1}, Lbf/q$a$a;->h(LT/q0;Z)V

    return-void
.end method

.method private static final f(LT/q0;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final h(LT/q0;Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final i(LT/q0;)LYg/J;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lbf/q$a$a;->h(LT/q0;Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Lbf/k;LT/q0;Ljava/lang/String;)LYg/J;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "add"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1, v1}, Lbf/q$a$a;->h(LT/q0;Z)V

    invoke-virtual {p0}, Lbf/k;->o0()V

    goto :goto_0

    :cond_0
    const-string v0, "edit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p1, v1}, Lbf/q$a$a;->h(LT/q0;Z)V

    invoke-virtual {p0}, Lbf/k;->r0()V

    :cond_1
    :goto_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final e(Lz/Y;LT/l;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v9, p2

    move/from16 v1, p3

    const-string v2, "$this$UiToolbar"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.speed.hosts.NetworkHostsUi.<anonymous>.<anonymous> (NetworkHostsUi.kt:62)"

    const v4, 0x278601c

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const v1, -0xa669fc1

    invoke-interface {v9, v1}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    if-ne v1, v3, :cond_3

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x2

    invoke-static {v1, v4, v3, v4}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    invoke-interface {v9, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, LT/q0;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    new-instance v3, Lbf/q$a$a$a;

    iget-object v5, v0, Lbf/q$a$a;->a:Lbf/k;

    invoke-direct {v3, v5, v1}, Lbf/q$a$a$a;-><init>(Lbf/k;LT/q0;)V

    const/16 v5, 0x36

    const v6, -0x4c91a38b

    const/4 v7, 0x1

    invoke-static {v6, v7, v3, v9, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    const/16 v5, 0x30

    invoke-static {v4, v3, v9, v5, v7}, LL9/L;->b(Landroidx/compose/ui/e;Lmh/q;LT/l;II)V

    const v3, -0xa662dee

    invoke-interface {v9, v3}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_4

    new-instance v3, LBe/N$a;

    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->a()Ls9/b;

    move-result-object v12

    new-instance v13, Ls9/d$b;

    sget v4, Lm8/c;->x1:I

    invoke-direct {v13, v4}, Ls9/d$b;-><init>(I)V

    const/16 v16, 0x18

    const/16 v17, 0x0

    const-string v11, "add"

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v10, v3

    invoke-direct/range {v10 .. v17}, LBe/N$a;-><init>(Ljava/lang/String;Ls9/b;Ls9/d;ZLBe/N$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, LBe/N$a;

    sget-object v5, LN9/b;->a:LN9/b;

    invoke-virtual {v5}, LN9/b;->G()Ls9/b;

    move-result-object v20

    new-instance v5, Ls9/d$b;

    sget v6, Lm8/c;->y1:I

    invoke-direct {v5, v6}, Ls9/d$b;-><init>(I)V

    const/16 v24, 0x18

    const/16 v25, 0x0

    const-string v19, "edit"

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v18, v4

    move-object/from16 v21, v5

    invoke-direct/range {v18 .. v25}, LBe/N$a;-><init>(Ljava/lang/String;Ls9/b;Ls9/d;ZLBe/N$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3, v4}, [LBe/N$a;

    move-result-object v3

    invoke-static {v3}, LCi/a;->b([Ljava/lang/Object;)LCi/f;

    move-result-object v3

    invoke-interface {v9, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v8, v3

    check-cast v8, LCi/f;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v1}, Lbf/q$a$a;->f(LT/q0;)Z

    move-result v3

    const v4, -0xa65ca2f

    invoke-interface {v9, v4}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_5

    new-instance v4, Lbf/n;

    invoke-direct {v4, v1}, Lbf/n;-><init>(LT/q0;)V

    invoke-interface {v9, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const v5, -0xa65c09c

    invoke-interface {v9, v5}, LT/l;->U(I)V

    iget-object v5, v0, Lbf/q$a$a;->a:Lbf/k;

    invoke-interface {v9, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    iget-object v6, v0, Lbf/q$a$a;->a:Lbf/k;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_6

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_7

    :cond_6
    new-instance v7, Lbf/o;

    invoke-direct {v7, v6, v1}, Lbf/o;-><init>(Lbf/k;LT/q0;)V

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v7, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const v10, 0x180180

    const/16 v11, 0x19

    const/4 v1, 0x0

    const-wide/16 v5, 0x0

    const/4 v12, 0x0

    move v2, v3

    move-object v3, v4

    move-wide v4, v5

    move-object v6, v12

    move-object/from16 v9, p2

    invoke-static/range {v1 .. v11}, LBe/U;->e(Landroidx/compose/ui/e;ZLmh/a;JLandroidx/compose/foundation/o;Lmh/l;LCi/c;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lbf/q$a$a;->e(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
