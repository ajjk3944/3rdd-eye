.class final Lxf/g$a$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxf/g$a$b;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LMe/f;

.field final synthetic b:Lxf/e;


# direct methods
.method constructor <init>(LMe/f;Lxf/e;)V
    .locals 0

    iput-object p1, p0, Lxf/g$a$b$b;->a:LMe/f;

    iput-object p2, p0, Lxf/g$a$b$b;->b:Lxf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxf/e;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxf/g$a$b$b;->f(Lxf/e;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf/e;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxf/g$a$b$b;->e(Lxf/e;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lxf/e;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lxf/e;->x0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Lxf/e;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lxf/e;->x0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(Lq/e;LT/l;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "$this$AnimatedVisibility"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.ap.WifiAccessPointDetailUiContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WifiAccessPointDetailUiContent.kt:118)"

    const v4, 0x7dfaa300

    move/from16 v5, p3

    invoke-static {v4, v5, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v2, v0, Lxf/g$a$b$b;->a:LMe/f;

    instance-of v3, v2, LMe/g;

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v3, :cond_3

    const v2, 0x6b43a199

    invoke-interface {v1, v2}, LT/l;->U(I)V

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v2, v8, v7, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v9

    const v2, 0x6b43b724

    invoke-interface {v1, v2}, LT/l;->U(I)V

    iget-object v2, v0, Lxf/g$a$b$b;->b:Lxf/e;

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Lxf/g$a$b$b;->b:Lxf/e;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_2

    :cond_1
    new-instance v6, Lxf/h;

    invoke-direct {v6, v3}, Lxf/h;-><init>(Lxf/e;)V

    invoke-interface {v1, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v13, v6

    check-cast v13, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v16

    int-to-float v2, v5

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v20

    const/16 v21, 0x7

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v3, v0, Lxf/g$a$b$b;->a:LMe/f;

    check-cast v3, LMe/g;

    invoke-static {v2, v3, v1, v4}, LMe/i;->b(Landroidx/compose/ui/e;LMe/g;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto :goto_0

    :cond_3
    instance-of v2, v2, LMe/c;

    if-eqz v2, :cond_6

    const v2, 0x6b43d85f

    invoke-interface {v1, v2}, LT/l;->U(I)V

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v2, v8, v7, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v9

    const v2, 0x6b43eea4

    invoke-interface {v1, v2}, LT/l;->U(I)V

    iget-object v2, v0, Lxf/g$a$b$b;->b:Lxf/e;

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Lxf/g$a$b$b;->b:Lxf/e;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_4

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_5

    :cond_4
    new-instance v6, Lxf/i;

    invoke-direct {v6, v3}, Lxf/i;-><init>(Lxf/e;)V

    invoke-interface {v1, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v13, v6

    check-cast v13, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v16

    int-to-float v2, v5

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v20

    const/16 v21, 0x7

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v3, v0, Lxf/g$a$b$b;->a:LMe/f;

    check-cast v3, LMe/c;

    invoke-static {v2, v3, v1, v4}, LMe/e;->b(Landroidx/compose/ui/e;LMe/c;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto :goto_0

    :cond_6
    const v2, -0x2c29ae3

    invoke-interface {v1, v2}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lxf/g$a$b$b;->c(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
