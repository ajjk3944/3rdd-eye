.class final Lcom/ui/wifiman/ui/signal/z$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/z$b;->c(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/w;

.field final synthetic b:LT/q0;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/w;LT/q0;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/z$b$a;->a:Lcom/ui/wifiman/ui/signal/w;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/z$b$a;->b:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v13, p2

    move/from16 v1, p3

    const-string v2, "$this$UiSettings"

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.signal.SignalTabPlaceAddUi.<anonymous>.<anonymous> (SignalTabPlaceAddUi.kt:77)"

    const v4, -0x4bf57c76

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    invoke-static {v14, v15, v12, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/ui/signal/z$b$a$a;

    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/z$b$a;->a:Lcom/ui/wifiman/ui/signal/w;

    iget-object v4, v0, Lcom/ui/wifiman/ui/signal/z$b$a;->b:LT/q0;

    invoke-direct {v2, v3, v4}, Lcom/ui/wifiman/ui/signal/z$b$a$a;-><init>(Lcom/ui/wifiman/ui/signal/w;LT/q0;)V

    const v3, 0xbc51712

    const/16 v10, 0x36

    invoke-static {v3, v12, v2, v13, v10}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v16, 0x6000006

    const/16 v17, 0xfe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v10, p2

    move/from16 v11, v16

    move v13, v12

    move/from16 v12, v17

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    const/4 v1, 0x0

    invoke-static {v14, v15, v13, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/ui/signal/z$b$a$b;

    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/z$b$a;->a:Lcom/ui/wifiman/ui/signal/w;

    invoke-direct {v2, v3}, Lcom/ui/wifiman/ui/signal/z$b$a$b;-><init>(Lcom/ui/wifiman/ui/signal/w;)V

    const v3, 0x56ca5dfb

    move v4, v13

    const/16 v5, 0x36

    invoke-static {v3, v4, v2, v10, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v11, 0x6000006

    const/16 v12, 0xfe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/z$b$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
