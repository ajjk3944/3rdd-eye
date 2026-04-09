.class final LHe/v$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHe/v;->f(Landroidx/compose/ui/e;LHe/p;JLmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:LHe/p;

.field final synthetic c:LT/z1;

.field final synthetic d:J

.field final synthetic e:Lmh/q;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LHe/p;LT/z1;JLmh/q;)V
    .locals 0

    iput-object p1, p0, LHe/v$c;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LHe/v$c;->b:LHe/p;

    iput-object p3, p0, LHe/v$c;->c:LT/z1;

    iput-wide p4, p0, LHe/v$c;->d:J

    iput-object p6, p0, LHe/v$c;->e:Lmh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LHe/p;)LYg/J;
    .locals 0

    invoke-static {p0}, LHe/v$c;->c(LHe/p;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LHe/p;)LYg/J;
    .locals 0

    invoke-virtual {p0}, LHe/p;->b()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lq/e;LT/l;I)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v10, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.toolbar.WifimanToolbarDropdownContent.<anonymous> (WifimanToolbarDropdown.kt:162)"

    const v3, 0x77db442a

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v1, v0, LHe/v$c;->a:Landroidx/compose/ui/e;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v11

    const v1, 0x5d9cced0

    invoke-interface {v10, v1}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_1

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v1

    invoke-interface {v10, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    move-object v12, v1

    check-cast v12, Ly/m;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const v1, 0x5d9cdad9

    invoke-interface {v10, v1}, LT/l;->U(I)V

    iget-object v1, v0, LHe/v$c;->b:LHe/p;

    invoke-interface {v10, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, v0, LHe/v$c;->b:LHe/p;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_2

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_3

    :cond_2
    new-instance v5, LHe/x;

    invoke-direct {v5, v3}, LHe/x;-><init>(LHe/p;)V

    invoke-interface {v10, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v17, v5

    check-cast v17, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v18, 0x1c

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v19}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v10, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->d()J

    move-result-wide v5

    new-instance v2, LHe/v$c$a;

    iget-object v3, v0, LHe/v$c;->c:LT/z1;

    iget-wide v7, v0, LHe/v$c;->d:J

    iget-object v9, v0, LHe/v$c;->e:Lmh/q;

    invoke-direct {v2, v3, v7, v8, v9}, LHe/v$c$a;-><init>(LT/z1;JLmh/q;)V

    const/16 v3, 0x36

    const v7, -0x76bcc892

    invoke-static {v7, v4, v2, v10, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/high16 v11, 0x180000

    const/16 v12, 0x3a

    const/4 v2, 0x0

    const-wide/16 v7, 0x0

    const/4 v14, 0x0

    move-wide v3, v5

    move-wide v5, v7

    move-object v7, v13

    move v8, v14

    move-object/from16 v10, p2

    invoke-static/range {v1 .. v12}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LHe/v$c;->b(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
