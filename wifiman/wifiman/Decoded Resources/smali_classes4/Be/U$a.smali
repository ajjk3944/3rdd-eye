.class final LBe/U$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/U;->e(Landroidx/compose/ui/e;ZLmh/a;JLandroidx/compose/foundation/o;Lmh/l;LCi/c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCi/c;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(LCi/c;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LBe/U$a;->a:LCi/c;

    iput-object p2, p0, LBe/U$a;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/l;LBe/N$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LBe/U$a;->c(Lmh/l;LBe/N$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lmh/l;LBe/N$a;)LYg/J;
    .locals 0

    invoke-virtual {p1}, LBe/N$a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/j;LT/l;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v10, p2

    move/from16 v1, p3

    const-string v2, "$this$DropdownMenu"

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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.component.UiDropdownMenu.<anonymous> (UiDropdownMenu.kt:77)"

    const v4, 0x8550ed7

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LBe/U$a;->a:LCi/c;

    iget-object v11, v0, LBe/U$a;->b:Lmh/l;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    const/4 v1, 0x0

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v13, v1, 0x1

    if-gez v1, :cond_3

    invoke-static {}, LZg/v;->v()V

    :cond_3
    move-object v14, v2

    check-cast v14, LBe/N$a;

    const v2, -0x673fd441

    invoke-interface {v10, v2}, LT/l;->U(I)V

    if-eqz v1, :cond_4

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v8, 0x6

    const/16 v9, 0x1e

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lz9/b;->b(Landroidx/compose/ui/e;JFFFLT/l;II)V

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const v1, -0x42bd4e4e

    invoke-interface {v10, v1}, LT/l;->U(I)V

    invoke-interface {v10, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v10, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_5

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_6

    :cond_5
    new-instance v2, LBe/T;

    invoke-direct {v2, v11, v14}, LBe/T;-><init>(Lmh/l;LBe/N$a;)V

    invoke-interface {v10, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v4, v2

    check-cast v4, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v6, 0x0

    const/4 v7, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v2, v14

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v7}, LBe/U;->f(Landroidx/compose/ui/e;LBe/N$a;Lz/N;Lmh/a;LT/l;II)V

    move v1, v13

    goto :goto_1

    :cond_7
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LBe/U$a;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
