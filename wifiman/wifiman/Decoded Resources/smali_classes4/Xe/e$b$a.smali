.class final LXe/e$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXe/e$b;->f(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls9/d;

.field final synthetic b:LXe/b;

.field final synthetic c:LT/q0;


# direct methods
.method constructor <init>(Ls9/d;LXe/b;LT/q0;)V
    .locals 0

    iput-object p1, p0, LXe/e$b$a;->a:Ls9/d;

    iput-object p2, p0, LXe/e$b$a;->b:LXe/b;

    iput-object p3, p0, LXe/e$b$a;->c:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LXe/b;LT/q0;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LXe/e$b$a;->c(LXe/b;LT/q0;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LXe/b;LT/q0;Ljava/lang/String;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LXe/e$b;->e(LT/q0;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LXe/b;->r0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LA9/i;LT/l;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    const-string v1, "$this$UiSettingsCard"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.signal.floorplan.save.FloorplanSaveUi.<anonymous>.<anonymous>.<anonymous> (FloorplanSaveUi.kt:82)"

    const v3, -0xaf46269

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->t1:I

    const/4 v3, 0x0

    invoke-static {v2, v12, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v2

    iget-object v5, v0, LXe/e$b$a;->c:LT/q0;

    invoke-static {v5}, LXe/e$b;->c(LT/q0;)Ljava/lang/String;

    move-result-object v23

    iget-object v5, v0, LXe/e$b$a;->a:Ls9/d;

    const v6, 0x3e3d4aba

    invoke-interface {v12, v6}, LT/l;->U(I)V

    if-nez v5, :cond_1

    move-object/from16 v28, v4

    goto :goto_0

    :cond_1
    invoke-static {v5, v12, v3}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v28, v3

    :goto_0
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const v3, 0x3e3d5173

    invoke-interface {v12, v3}, LT/l;->U(I)V

    iget-object v3, v0, LXe/e$b$a;->b:LXe/b;

    invoke-interface {v12, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, LXe/e$b$a;->b:LXe/b;

    iget-object v5, v0, LXe/e$b$a;->c:LT/q0;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_3

    :cond_2
    new-instance v6, LXe/h;

    invoke-direct {v6, v4, v5}, LXe/h;-><init>(LXe/b;LT/q0;)V

    invoke-interface {v12, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v5, v6

    check-cast v5, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v26, 0x0

    const v27, 0x1ff7e4

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x6

    const/16 v25, 0x0

    move-object/from16 v4, v23

    move-object/from16 v12, v28

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v27}, LF9/k0;->d(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;Lmh/a;Ljava/lang/Boolean;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZZLm0/l0;LF/D;LF/C;Landroidx/compose/ui/focus/o;LT/l;IIII)V

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

    invoke-virtual {p0, p1, p2, p3}, LXe/e$b$a;->b(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
