.class final Lcom/ui/wifiman/ui/component/network/B$c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/B$c$a;->a(Lz/f;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lcom/ui/wifiman/ui/component/network/q$c;

.field final synthetic c:Lmh/s;

.field final synthetic d:LA/B;


# direct methods
.method constructor <init>(FLcom/ui/wifiman/ui/component/network/q$c;Lmh/s;LA/B;)V
    .locals 0

    iput p1, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->a:F

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->b:Lcom/ui/wifiman/ui/component/network/q$c;

    iput-object p3, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->c:Lmh/s;

    iput-object p4, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->d:LA/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LYg/s;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->n(LYg/s;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/wifiman/ui/component/network/q$c;Lmh/s;FLA/y;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->k(Lcom/ui/wifiman/ui/component/network/q$c;Lmh/s;FLA/y;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/ui/wifiman/ui/component/network/q$c;I)LYg/s;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->l(Lcom/ui/wifiman/ui/component/network/q$c;I)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LA/B;)I
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->i(LA/B;)I

    move-result p0

    return p0
.end method

.method public static synthetic f(LA/B;)I
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->j(LA/B;)I

    move-result p0

    return p0
.end method

.method private static final i(LA/B;)I
    .locals 0

    invoke-virtual {p0}, LA/B;->r()I

    move-result p0

    return p0
.end method

.method private static final j(LA/B;)I
    .locals 0

    invoke-virtual {p0}, LA/B;->s()I

    move-result p0

    return p0
.end method

.method private static final k(Lcom/ui/wifiman/ui/component/network/q$c;Lmh/s;FLA/y;)LYg/J;
    .locals 3

    const-string v0, "$this$LazyRow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/ui/wifiman/ui/component/network/q$c;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Lcom/ui/wifiman/ui/component/network/F;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/ui/component/network/F;-><init>(Lcom/ui/wifiman/ui/component/network/q$c;)V

    new-instance p0, Lcom/ui/wifiman/ui/component/network/G;

    invoke-direct {p0}, Lcom/ui/wifiman/ui/component/network/G;-><init>()V

    new-instance v2, Lcom/ui/wifiman/ui/component/network/B$c$a$a$a;

    invoke-direct {v2, p1, p2}, Lcom/ui/wifiman/ui/component/network/B$c$a$a$a;-><init>(Lmh/s;F)V

    const p1, -0x4933a769

    const/4 p2, 0x1

    invoke-static {p1, p2, v2}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p1

    invoke-static {p3, v0, v1, p0, p1}, Lcom/ui/wifiman/ui/component/network/B;->A(LA/y;ILmh/l;Lmh/l;Lmh/r;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final l(Lcom/ui/wifiman/ui/component/network/q$c;I)LYg/s;
    .locals 0

    invoke-interface {p0}, Lcom/ui/wifiman/ui/component/network/q$c;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYg/s;

    return-object p0
.end method

.method private static final n(LYg/s;)Ljava/lang/String;
    .locals 1

    const-string v0, "item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYg/s;->h()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/ui/component/network/q$b;

    invoke-interface {p0}, Lcom/ui/wifiman/ui/component/network/q$b;->getId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final h(LT/l;I)V
    .locals 14

    move-object v0, p0

    move-object v10, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous>.<anonymous>.<anonymous> (NetworkTopology.kt:225)"

    const v5, 0x49417439

    invoke-static {v5, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v4, v2, v5}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const v2, -0x7cf11e0a

    invoke-interface {p1, v2}, LT/l;->U(I)V

    iget-object v2, v0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->d:LA/B;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_3

    new-instance v6, Lcom/ui/wifiman/ui/component/network/C;

    invoke-direct {v6, v2}, Lcom/ui/wifiman/ui/component/network/C;-><init>(LA/B;)V

    invoke-static {v6}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object v6

    invoke-interface {p1, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v6, LT/z1;

    invoke-interface {p1}, LT/l;->J()V

    invoke-interface {v6}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const v6, -0x7cf111c3

    invoke-interface {p1, v6}, LT/l;->U(I)V

    iget-object v6, v0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->d:LA/B;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v8, v9, :cond_4

    new-instance v8, Lcom/ui/wifiman/ui/component/network/D;

    invoke-direct {v8, v6}, Lcom/ui/wifiman/ui/component/network/D;-><init>(LA/B;)V

    invoke-static {v8}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object v8

    invoke-interface {p1, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v8, LT/z1;

    invoke-interface {p1}, LT/l;->J()V

    invoke-interface {v8}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    new-instance v8, LA/B;

    invoke-direct {v8, v2, v6}, LA/B;-><init>(II)V

    iget v2, v0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->a:F

    int-to-float v6, v3

    div-float/2addr v2, v6

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v2, v4, v3, v5}, Landroidx/compose/foundation/layout/o;->c(FFILjava/lang/Object;)Lz/N;

    move-result-object v3

    const v2, -0x7cf0f21b

    invoke-interface {p1, v2}, LT/l;->U(I)V

    iget-object v2, v0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->b:Lcom/ui/wifiman/ui/component/network/q$c;

    invoke-interface {p1, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, v0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->c:Lmh/s;

    invoke-interface {p1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    iget v4, v0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->a:F

    invoke-interface {p1, v4}, LT/l;->g(F)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v4, v0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->b:Lcom/ui/wifiman/ui/component/network/q$c;

    iget-object v5, v0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->c:Lmh/s;

    iget v6, v0, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->a:F

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v2, :cond_5

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v9, v2, :cond_6

    :cond_5
    new-instance v9, Lcom/ui/wifiman/ui/component/network/E;

    invoke-direct {v9, v4, v5, v6}, Lcom/ui/wifiman/ui/component/network/E;-><init>(Lcom/ui/wifiman/ui/component/network/q$c;Lmh/s;F)V

    invoke-interface {p1, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v9, Lmh/l;

    invoke-interface {p1}, LT/l;->J()V

    const v11, 0xc00006

    const/16 v12, 0x78

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    move-object v2, v8

    move v8, v13

    move-object v10, p1

    invoke-static/range {v1 .. v12}, LA/b;->b(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$e;Lf0/c$c;Lw/n;ZLmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->h(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
