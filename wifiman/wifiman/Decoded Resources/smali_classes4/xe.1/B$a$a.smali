.class final Lxe/B$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/B$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/w;

.field final synthetic b:Lxe/r0;

.field final synthetic c:LN/n0;

.field final synthetic d:Lxe/f$b;


# direct methods
.method constructor <init>(Lf2/w;Lxe/r0;LN/n0;Lxe/f$b;)V
    .locals 0

    iput-object p1, p0, Lxe/B$a$a;->a:Lf2/w;

    iput-object p2, p0, Lxe/B$a$a;->b:Lxe/r0;

    iput-object p3, p0, Lxe/B$a$a;->c:LN/n0;

    iput-object p4, p0, Lxe/B$a$a;->d:Lxe/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/r0;LN/n0;Lxe/f$b;Lf2/u;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxe/B$a$a;->c(Lxe/r0;LN/n0;Lxe/f$b;Lf2/u;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lxe/r0;LN/n0;Lxe/f$b;Lf2/u;)LYg/J;
    .locals 1

    const-string v0, "$this$NavHost"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxe/B$a$a$a;

    invoke-direct {v0, p1, p2}, Lxe/B$a$a$a;-><init>(LN/n0;Lxe/f$b;)V

    const p1, 0x41009deb

    const/4 p2, 0x1

    invoke-static {p1, p2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p1

    invoke-static {p3, p0, p1}, Lxe/B;->E(Lf2/u;Lxe/r0;Lmh/q;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/j;LT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v15, p2

    move/from16 v1, p3

    const-string v2, "$this$ModalBottomSheetLayout"

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

    const-string v3, "com.ui.wifiman.ui.AppModalNavigation.<anonymous>.<anonymous> (WiFimanAppNavigation.kt:207)"

    const v4, -0x4087c352

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v1}, Lvf/c;->a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    iget-object v1, v0, Lxe/B$a$a;->a:Lf2/w;

    const v2, -0x228c2a01

    invoke-interface {v15, v2}, LT/l;->U(I)V

    iget-object v2, v0, Lxe/B$a$a;->b:Lxe/r0;

    invoke-interface {v15, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, v0, Lxe/B$a$a;->c:LN/n0;

    invoke-interface {v15, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v4, v0, Lxe/B$a$a;->b:Lxe/r0;

    iget-object v5, v0, Lxe/B$a$a;->c:LN/n0;

    iget-object v6, v0, Lxe/B$a$a;->d:Lxe/f$b;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_3

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_4

    :cond_3
    new-instance v7, Lxe/z;

    invoke-direct {v7, v4, v5, v6}, Lxe/z;-><init>(Lxe/r0;LN/n0;Lxe/f$b;)V

    invoke-interface {v15, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v11, v7

    check-cast v11, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v14, 0x0

    const/16 v16, 0x3f8

    const-string v2, "empty"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v13, 0x30

    move-object/from16 v12, p2

    move/from16 v15, v16

    invoke-static/range {v1 .. v15}, Lg2/m;->b(Lf2/w;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;III)V

    iget-object v1, v0, Lxe/B$a$a;->a:Lf2/w;

    invoke-virtual {v1}, Lf2/n;->N()LLi/N;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object/from16 v5, p2

    invoke-static {v1, v2, v5, v3, v4}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf2/k;

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lf2/k;->f()Lf2/r;

    move-result-object v6

    invoke-virtual {v6}, Lf2/r;->w()Ljava/lang/String;

    move-result-object v6

    const-string v7, "empty"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_1

    :cond_5
    move v4, v3

    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const v7, -0x228b9a13

    invoke-interface {v5, v7}, LT/l;->U(I)V

    invoke-interface {v5, v4}, LT/l;->c(Z)Z

    move-result v7

    iget-object v8, v0, Lxe/B$a$a;->c:LN/n0;

    invoke-interface {v5, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    iget-object v8, v0, Lxe/B$a$a;->c:LN/n0;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_6

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v9, v7, :cond_7

    :cond_6
    new-instance v9, Lxe/B$a$a$b;

    invoke-direct {v9, v4, v8, v2}, Lxe/B$a$a$b;-><init>(ZLN/n0;Ldh/e;)V

    invoke-interface {v5, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v9, Lmh/p;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v6, v1, v9, v5, v3}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    iget-object v1, v0, Lxe/B$a$a;->c:LN/n0;

    invoke-virtual {v1}, LN/n0;->k()Z

    move-result v1

    xor-int/lit8 v4, v1, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const v6, -0x228b6cfd

    invoke-interface {v5, v6}, LT/l;->U(I)V

    invoke-interface {v5, v1}, LT/l;->c(Z)Z

    move-result v6

    iget-object v7, v0, Lxe/B$a$a;->a:Lf2/w;

    invoke-interface {v5, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    iget-object v7, v0, Lxe/B$a$a;->a:Lf2/w;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_8

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v8, v6, :cond_9

    :cond_8
    new-instance v8, Lxe/B$a$a$c;

    invoke-direct {v8, v1, v7, v2}, Lxe/B$a$a$c;-><init>(ZLf2/w;Ldh/e;)V

    invoke-interface {v5, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lmh/p;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v4, v8, v5, v3}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
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

    invoke-virtual {p0, p1, p2, p3}, Lxe/B$a$a;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
