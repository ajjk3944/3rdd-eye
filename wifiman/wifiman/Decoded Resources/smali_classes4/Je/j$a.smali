.class final LJe/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJe/j;->b(LJe/c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJe/c;


# direct methods
.method constructor <init>(LJe/c;)V
    .locals 0

    iput-object p1, p0, LJe/j$a;->a:LJe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, LJe/j$a;->c(Lxe/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lxe/f$b;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v15, p1

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

    const-string v3, "com.ui.wifiman.ui.device.DeviceDetail.<anonymous> (DeviceDetailUi.kt:40)"

    const v4, 0x6f3c796e

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object v1

    invoke-interface {v15, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxe/f$b;

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    invoke-static {v2, v3, v5, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2}, Lz/j0;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v3, v0, LJe/j$a;->a:LJe/c;

    invoke-virtual {v3}, LJe/c;->c()LLi/N;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v3, v4, v15, v6, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls9/d;

    const v7, 0x3e600ca7

    invoke-interface {v15, v7}, LT/l;->U(I)V

    if-nez v3, :cond_3

    move-object v3, v4

    goto :goto_1

    :cond_3
    invoke-static {v3, v15, v6}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    sget-object v19, LL9/d$a;->b:LL9/d$a;

    const v4, 0x3e601a5a

    invoke-interface {v15, v4}, LT/l;->U(I)V

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_4

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_5

    :cond_4
    new-instance v6, LJe/i;

    invoke-direct {v6, v1}, LJe/i;-><init>(Lxe/f$b;)V

    invoke-interface {v15, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v4, v6

    check-cast v4, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    new-instance v1, LJe/j$a$a;

    iget-object v6, v0, LJe/j$a;->a:LJe/c;

    invoke-direct {v1, v6}, LJe/j$a$a;-><init>(LJe/c;)V

    const/16 v6, 0x36

    const v7, 0x30acba7e

    invoke-static {v7, v5, v1, v15, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    sget v1, LL9/d$a;->c:I

    shl-int/lit8 v1, v1, 0x6

    or-int/lit16 v1, v1, 0x6000

    move/from16 v16, v1

    const/16 v17, 0x0

    const/16 v18, 0x7e0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v1, v2

    move-object v2, v3

    move-object/from16 v3, v19

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v18}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LJe/j$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
