.class final LFf/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/i;->c(LFf/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LFf/e;

.field final synthetic b:LQ/z;

.field final synthetic c:LT/o0;


# direct methods
.method constructor <init>(LFf/e;LQ/z;LT/o0;)V
    .locals 0

    iput-object p1, p0, LFf/i$a;->a:LFf/e;

    iput-object p2, p0, LFf/i$a;->b:LQ/z;

    iput-object p3, p0, LFf/i$a;->c:LT/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v11, p1

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

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous> (WifiScanUiContent.kt:84)"

    const v4, -0x3aa3233f

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const v2, 0x61628539

    invoke-interface {v11, v2}, LT/l;->U(I)V

    iget-object v2, v0, LFf/i$a;->a:LFf/e;

    invoke-virtual {v2}, LFf/e;->o0()LLi/N;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v2, v4, v11, v5, v3}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, LBe/m0;->m()LT/H0;

    move-result-object v2

    invoke-interface {v11, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBe/n0;

    invoke-virtual {v2}, LBe/n0;->a()LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    move v8, v3

    goto :goto_1

    :cond_3
    move v8, v5

    :goto_1
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    iget-object v2, v0, LFf/i$a;->a:LFf/e;

    invoke-virtual {v2}, LFf/e;->p0()LLi/N;

    move-result-object v2

    invoke-static {v2, v4, v11, v5, v3}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    move v6, v3

    goto :goto_2

    :cond_4
    move v6, v5

    :goto_2
    iget-object v2, v0, LFf/i$a;->b:LQ/z;

    new-instance v4, LFf/i$a$a;

    iget-object v5, v0, LFf/i$a;->a:LFf/e;

    iget-object v7, v0, LFf/i$a;->c:LT/o0;

    invoke-direct {v4, v5, v7}, LFf/i$a$a;-><init>(LFf/e;LT/o0;)V

    const v5, 0x27f3942a

    const/16 v7, 0x36

    invoke-static {v5, v3, v4, v11, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    new-instance v5, LFf/i$a$b;

    iget-object v9, v0, LFf/i$a;->a:LFf/e;

    iget-object v10, v0, LFf/i$a;->c:LT/o0;

    invoke-direct {v5, v9, v10}, LFf/i$a$b;-><init>(LFf/e;LT/o0;)V

    const v9, 0x15bbf749

    invoke-static {v9, v3, v5, v11, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    new-instance v9, LFf/i$a$c;

    iget-object v10, v0, LFf/i$a;->a:LFf/e;

    invoke-direct {v9, v10}, LFf/i$a$c;-><init>(LFf/e;)V

    const v10, -0x20eadf5a

    invoke-static {v10, v3, v9, v11, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    sget-object v10, LFf/a;->a:LFf/a;

    invoke-virtual {v10}, LFf/a;->b()Lmh/p;

    move-result-object v10

    new-instance v12, LFf/i$a$d;

    iget-object v13, v0, LFf/i$a;->a:LFf/e;

    invoke-direct {v12, v13}, LFf/i$a$d;-><init>(LFf/e;)V

    const v13, 0x3d520793

    invoke-static {v13, v3, v12, v11, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v12

    const v13, 0x36180d86

    const/16 v14, 0x10

    const/4 v7, 0x0

    move-object v3, v4

    move-object v4, v5

    move-object v5, v7

    move-object v7, v9

    move-object v9, v10

    move-object v10, v12

    move-object/from16 v11, p1

    move v12, v13

    move v13, v14

    invoke-static/range {v1 .. v13}, LBe/M;->d(Landroidx/compose/ui/e;LQ/z;Lmh/q;Lmh/q;Lmh/q;ZLmh/q;ZLmh/p;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LFf/i$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
