.class final Lcom/ui/wifiman/ui/signal/z$b$a$a;
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

.field final synthetic b:LT/q0;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/w;LT/q0;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/z$b$a$a;->a:Lcom/ui/wifiman/ui/signal/w;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/z$b$a$a;->b:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/signal/w;LF/B;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/signal/z$b$a$a;->e(Lcom/ui/wifiman/ui/signal/w;LF/B;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/wifiman/ui/signal/w;LT/q0;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/signal/z$b$a$a;->f(Lcom/ui/wifiman/ui/signal/w;LT/q0;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lcom/ui/wifiman/ui/signal/w;LF/B;)LYg/J;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/signal/w;->r0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Lcom/ui/wifiman/ui/signal/w;LT/q0;Ljava/lang/String;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/ui/wifiman/ui/signal/z$b;->b(LT/q0;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/ui/wifiman/ui/signal/w;->q0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(LA9/i;LT/l;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    const-string v1, "$this$UiSettingsCard"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.signal.SignalTabPlaceAddUi.<anonymous>.<anonymous>.<anonymous> (SignalTabPlaceAddUi.kt:80)"

    const v3, 0xbc51712

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->t1:I

    const/4 v3, 0x0

    invoke-static {v2, v12, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v2

    sget v4, Lm8/c;->A2:I

    invoke-static {v4, v12, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v20

    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/z$b$a$a;->b:LT/q0;

    invoke-static {v3}, Lcom/ui/wifiman/ui/signal/z$b;->a(LT/q0;)Ljava/lang/String;

    move-result-object v4

    new-instance v31, LF/D;

    sget-object v3, LR0/r;->b:LR0/r$a;

    invoke-virtual {v3}, LR0/r$a;->b()I

    move-result v25

    const/16 v29, 0x77

    const/16 v30, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v21, v31

    invoke-direct/range {v21 .. v30}, LF/D;-><init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v3, -0xc177ad4

    invoke-interface {v12, v3}, LT/l;->U(I)V

    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/z$b$a$a;->a:Lcom/ui/wifiman/ui/signal/w;

    invoke-interface {v12, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    iget-object v5, v0, Lcom/ui/wifiman/ui/signal/z$b$a$a;->a:Lcom/ui/wifiman/ui/signal/w;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_1

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_2

    :cond_1
    new-instance v6, Lcom/ui/wifiman/ui/signal/A;

    invoke-direct {v6, v5}, Lcom/ui/wifiman/ui/signal/A;-><init>(Lcom/ui/wifiman/ui/signal/w;)V

    invoke-interface {v12, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v22, v6

    check-cast v22, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    new-instance v30, LF/C;

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x3e

    const/16 v29, 0x0

    move-object/from16 v21, v30

    invoke-direct/range {v21 .. v29}, LF/C;-><init>(Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v3, -0xc17703f

    invoke-interface {v12, v3}, LT/l;->U(I)V

    iget-object v3, v0, Lcom/ui/wifiman/ui/signal/z$b$a$a;->a:Lcom/ui/wifiman/ui/signal/w;

    invoke-interface {v12, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    iget-object v5, v0, Lcom/ui/wifiman/ui/signal/z$b$a$a;->a:Lcom/ui/wifiman/ui/signal/w;

    iget-object v6, v0, Lcom/ui/wifiman/ui/signal/z$b$a$a;->b:LT/q0;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_3

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_4

    :cond_3
    new-instance v7, Lcom/ui/wifiman/ui/signal/B;

    invoke-direct {v7, v5, v6}, Lcom/ui/wifiman/ui/signal/B;-><init>(Lcom/ui/wifiman/ui/signal/w;LT/q0;)V

    invoke-interface {v12, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v5, v7

    check-cast v5, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v26, 0x0

    const v27, 0x13f7e4

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x6

    const/high16 v25, 0x6000000

    move-object/from16 v12, v20

    move-object/from16 v20, v31

    move-object/from16 v21, v30

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v27}, LF9/k0;->d(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;Lmh/a;Ljava/lang/Boolean;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZZLm0/l0;LF/D;LF/C;Landroidx/compose/ui/focus/o;LT/l;IIII)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/z$b$a$a;->c(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
