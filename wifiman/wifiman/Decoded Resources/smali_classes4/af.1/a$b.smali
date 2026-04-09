.class final Laf/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Laf/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laf/a$b;

    invoke-direct {v0}, Laf/a$b;-><init>()V

    sput-object v0, Laf/a$b;->a:Laf/a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LS8/c;)LYg/J;
    .locals 0

    invoke-static {p0}, Laf/a$b;->e(LS8/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0}, Laf/a$b;->f(Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LS8/c;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Ljava/lang/String;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(LT/l;I)V
    .locals 39

    move-object/from16 v5, p1

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.speed.component.ComposableSingletons$SpeedTabSpeedFactorCardUiKt.lambda-2.<anonymous> (SpeedTabSpeedFactorCardUi.kt:379)"

    const v4, 0x6b19b861

    invoke-static {v4, v0, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    new-instance v1, Laf/P;

    new-instance v7, Ls9/d$c;

    const-string v3, "WiFi Speed Factors"

    invoke-direct {v7, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    sget-object v8, LAf/w;->a:LAf/w;

    sget-object v9, LW7/e;->EXCELLENT:LW7/e;

    new-instance v3, Laf/Q;

    sget-object v11, LS8/c;->GHZ_2_4:LS8/c;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v3

    invoke-direct/range {v10 .. v15}, Laf/Q;-><init>(LS8/c;ZZZZ)V

    new-instance v4, Laf/Q;

    sget-object v17, LS8/c;->GHZ_5:LS8/c;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x1

    move-object/from16 v16, v4

    invoke-direct/range {v16 .. v21}, Laf/Q;-><init>(LS8/c;ZZZZ)V

    new-instance v6, Laf/Q;

    sget-object v11, LS8/c;->GHZ_6:LS8/c;

    const/4 v15, 0x1

    const/4 v13, 0x1

    move-object v10, v6

    invoke-direct/range {v10 .. v15}, Laf/Q;-><init>(LS8/c;ZZZZ)V

    filled-new-array {v3, v4, v6}, [Laf/Q;

    move-result-object v3

    invoke-static {v3}, LCi/a;->b([Ljava/lang/Object;)LCi/f;

    move-result-object v10

    new-instance v3, Laf/O;

    new-instance v13, Ls9/d$c;

    const-string v4, "Band"

    invoke-direct {v13, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v4, Laf/O$b;

    sget-object v6, Laf/O$b$a;->CHANNEL:Laf/O$b$a;

    new-instance v11, Ls9/d$c;

    const-string v15, "32"

    invoke-direct {v11, v15}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v14, 0x0

    invoke-direct {v4, v6, v11, v14}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    new-instance v11, Laf/O$b;

    sget-object v12, Laf/O$b$a;->CHANNEL_WIDTH:Laf/O$b$a;

    new-instance v14, Ls9/d$c;

    const-string v2, "80 MHz"

    invoke-direct {v14, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v20, v0

    sget-object v0, LW7/e;->POOR:LW7/e;

    invoke-direct {v11, v12, v14, v0}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    filled-new-array {v4, v11}, [Laf/O$b;

    move-result-object v4

    invoke-static {v4}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lokhttp3/internal/Util;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v14

    sget-object v4, Laf/O$a$a;->a:Laf/O$a$a;

    const/16 v17, 0x10

    const/16 v18, 0x0

    const-string v16, ""

    move-object v11, v3

    move-object v5, v12

    move-object/from16 v12, v16

    move-object/from16 v22, v3

    const/4 v3, 0x0

    move-object v3, v15

    move-object v15, v4

    move/from16 v16, v21

    invoke-direct/range {v11 .. v18}, Laf/O;-><init>(Ljava/lang/String;Ls9/d;Ljava/util/List;Laf/O$a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Laf/O;

    new-instance v4, Ls9/d$c;

    const-string v11, "Radio Potential"

    invoke-direct {v4, v11}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v11, Laf/O$b;

    new-instance v13, Ls9/d$c;

    invoke-direct {v13, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v14, 0x0

    invoke-direct {v11, v6, v13, v14}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    new-instance v13, Laf/O$b;

    new-instance v14, Ls9/d$c;

    invoke-direct {v14, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v13, v5, v14, v0}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    filled-new-array {v11, v13}, [Laf/O$b;

    move-result-object v11

    invoke-static {v11}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-static {v11}, Lokhttp3/internal/Util;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v26

    new-instance v11, Laf/O$a$b;

    const/4 v13, 0x1

    invoke-direct {v11, v13}, Laf/O$a$b;-><init>(I)V

    const/16 v29, 0x10

    const/16 v30, 0x0

    const-string v24, ""

    const/16 v28, 0x0

    move-object/from16 v23, v12

    move-object/from16 v25, v4

    move-object/from16 v27, v11

    invoke-direct/range {v23 .. v30}, Laf/O;-><init>(Ljava/lang/String;Ls9/d;Ljava/util/List;Laf/O$a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Laf/O;

    new-instance v4, Ls9/d$c;

    const-string v11, "Channel Health"

    invoke-direct {v4, v11}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v11, Laf/O$b;

    new-instance v14, Ls9/d$c;

    invoke-direct {v14, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v3, 0x0

    invoke-direct {v11, v6, v14, v3}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    new-instance v3, Laf/O$b;

    new-instance v6, Ls9/d$c;

    invoke-direct {v6, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v3, v5, v6, v0}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    filled-new-array {v11, v3}, [Laf/O$b;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v34

    new-instance v0, Laf/O$a$b;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Laf/O$a$b;-><init>(I)V

    const/16 v37, 0x10

    const/16 v38, 0x0

    const-string v32, ""

    const/16 v36, 0x0

    move-object/from16 v31, v13

    move-object/from16 v33, v4

    move-object/from16 v35, v0

    invoke-direct/range {v31 .. v38}, Laf/O;-><init>(Ljava/lang/String;Ls9/d;Ljava/util/List;Laf/O$a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v1

    move-object/from16 v11, v22

    invoke-direct/range {v6 .. v13}, Laf/P;-><init>(Ls9/d;LDe/g;LW7/e;LCi/c;Laf/O;Laf/O;Laf/O;)V

    const v0, -0x2978a967

    move-object/from16 v5, p1

    invoke-interface {v5, v0}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_3

    new-instance v0, Laf/b;

    invoke-direct {v0}, Laf/b;-><init>()V

    invoke-interface {v5, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v3, v0

    check-cast v3, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v0, -0x2978a5e7

    invoke-interface {v5, v0}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_4

    new-instance v0, Laf/c;

    invoke-direct {v0}, Laf/c;-><init>()V

    invoke-interface {v5, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v4, v0

    check-cast v4, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v6, 0xd86

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object/from16 v0, v20

    move-object v2, v3

    move-object v3, v4

    move-object v4, v8

    move-object/from16 v5, p1

    invoke-static/range {v0 .. v7}, Laf/d0;->w(Landroidx/compose/ui/e;Laf/P;Lmh/l;Lmh/l;Lmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Laf/a$b;->c(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
