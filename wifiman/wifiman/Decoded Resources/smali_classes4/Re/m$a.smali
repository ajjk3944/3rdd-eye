.class final LRe/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRe/m;->c(LRe/a;Lof/a$c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lxe/f$b;

.field final synthetic b:LIi/N;

.field final synthetic c:LRe/a;


# direct methods
.method constructor <init>(Lxe/f$b;LIi/N;LRe/a;)V
    .locals 0

    iput-object p1, p0, LRe/m$a;->a:Lxe/f$b;

    iput-object p2, p0, LRe/m$a;->b:LIi/N;

    iput-object p3, p0, LRe/m$a;->c:LRe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, LRe/m$a;->c(Lxe/f$b;)LYg/J;

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
    .locals 19

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

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.settings.AppSettings.<anonymous> (AppSettingsUi.kt:63)"

    const v4, 0x105cc7ea

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v2, v5, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1}, Lz/j0;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->Z1:I

    const/4 v3, 0x0

    invoke-static {v2, v15, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, LL9/d$a;->b:LL9/d$a;

    const v4, -0xdc85f64

    invoke-interface {v15, v4}, LT/l;->U(I)V

    iget-object v4, v0, LRe/m$a;->a:Lxe/f$b;

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    iget-object v6, v0, LRe/m$a;->a:Lxe/f$b;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v7, v4, :cond_4

    :cond_3
    new-instance v7, LRe/k;

    invoke-direct {v7, v6}, LRe/k;-><init>(Lxe/f$b;)V

    invoke-interface {v15, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v4, v7

    check-cast v4, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    new-instance v6, LRe/m$a$a;

    iget-object v7, v0, LRe/m$a;->b:LIi/N;

    iget-object v8, v0, LRe/m$a;->c:LRe/a;

    invoke-direct {v6, v7, v8}, LRe/m$a$a;-><init>(LIi/N;LRe/a;)V

    const/16 v7, 0x36

    const v8, -0x497fd326

    invoke-static {v8, v5, v6, v15, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    sget v6, LL9/d$a;->c:I

    shl-int/lit8 v6, v6, 0x6

    or-int/lit16 v6, v6, 0x6000

    move/from16 v16, v6

    const/16 v17, 0x0

    const/16 v18, 0x7e0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v18}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

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

    invoke-virtual {p0, p1, p2}, LRe/m$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
