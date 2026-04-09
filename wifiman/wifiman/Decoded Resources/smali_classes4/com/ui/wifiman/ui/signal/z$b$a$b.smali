.class final Lcom/ui/wifiman/ui/signal/z$b$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/z$b$a;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/w;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/w;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/z$b$a$b;->a:Lcom/ui/wifiman/ui/signal/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/signal/w;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/signal/z$b$a$b;->c(Lcom/ui/wifiman/ui/signal/w;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/wifiman/ui/signal/w;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/signal/w;->p0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LA9/i;LT/l;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v15, p2

    const-string v1, "$this$UiSettingsCard"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.signal.SignalTabPlaceAddUi.<anonymous>.<anonymous>.<anonymous> (SignalTabPlaceAddUi.kt:100)"

    const v3, 0x56ca5dfb

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v1, v0, Lcom/ui/wifiman/ui/signal/z$b$a$b;->a:Lcom/ui/wifiman/ui/signal/w;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/signal/w;->n0()LLi/N;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v14, 0x0

    const/4 v13, 0x1

    invoke-static {v1, v3, v15, v14, v13}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v12, v0, Lcom/ui/wifiman/ui/signal/z$b$a$b;->a:Lcom/ui/wifiman/ui/signal/w;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_0
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls9/d;

    invoke-static {v1, v15, v14}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v5, 0x0

    invoke-static {v4, v5, v13, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v20

    invoke-static {v1, v15, v14}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v21

    const v1, 0x1ab789db

    invoke-interface {v15, v1}, LT/l;->U(I)V

    invoke-interface {v15, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_1

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_2

    :cond_1
    new-instance v4, Lcom/ui/wifiman/ui/signal/C;

    invoke-direct {v4, v12, v2}, Lcom/ui/wifiman/ui/signal/C;-><init>(Lcom/ui/wifiman/ui/signal/w;Ljava/lang/String;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v11, v4

    check-cast v11, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v17, 0x0

    const/16 v18, 0x3bda

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x0

    move-object/from16 v22, v10

    move-object v10, v1

    move-object/from16 v23, v12

    move-object v12, v1

    const/4 v1, 0x0

    move/from16 v24, v13

    move v13, v1

    const/4 v1, 0x0

    move/from16 v25, v14

    move-object v14, v1

    const v16, 0x30006

    move-object/from16 v1, v20

    move-object/from16 v20, v3

    move-object/from16 v3, v21

    move-object/from16 v15, p2

    invoke-static/range {v1 .. v18}, LF9/u;->c(Landroidx/compose/ui/e;Ls9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls9/b;LF9/r;ZLjava/lang/Boolean;Ljava/lang/String;Lmh/a;Lmh/a;FLmh/q;LT/l;III)V

    sget-object v1, LYg/J;->a:LYg/J;

    move-object/from16 v2, v22

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v10, v2

    move-object/from16 v3, v20

    move-object/from16 v12, v23

    move/from16 v13, v24

    move/from16 v14, v25

    goto :goto_0

    :cond_3
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/z$b$a$b;->b(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
