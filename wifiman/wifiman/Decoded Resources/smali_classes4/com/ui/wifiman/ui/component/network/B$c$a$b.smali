.class final Lcom/ui/wifiman/ui/component/network/B$c$a$b;
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
.field final synthetic a:LA/B;

.field final synthetic b:Lcom/ui/wifiman/ui/component/network/q$c;

.field final synthetic c:Lmh/s;

.field final synthetic d:F


# direct methods
.method constructor <init>(LA/B;Lcom/ui/wifiman/ui/component/network/q$c;Lmh/s;F)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->a:LA/B;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->b:Lcom/ui/wifiman/ui/component/network/q$c;

    iput-object p3, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->c:Lmh/s;

    iput p4, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->d:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/component/network/q$b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->i(Lcom/ui/wifiman/ui/component/network/q$b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/wifiman/ui/component/network/q$c;I)Lcom/ui/wifiman/ui/component/network/q$b;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->h(Lcom/ui/wifiman/ui/component/network/q$c;I)Lcom/ui/wifiman/ui/component/network/q$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/ui/wifiman/ui/component/network/q$c;Lmh/s;FLA/y;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->f(Lcom/ui/wifiman/ui/component/network/q$c;Lmh/s;FLA/y;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lcom/ui/wifiman/ui/component/network/q$c;Lmh/s;FLA/y;)LYg/J;
    .locals 3

    const-string v0, "$this$LazyRow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/ui/component/network/q;->a:Lcom/ui/wifiman/ui/component/network/q;

    invoke-virtual {v0, p0}, Lcom/ui/wifiman/ui/component/network/q;->e(Lcom/ui/wifiman/ui/component/network/q$c;)I

    move-result v0

    new-instance v1, Lcom/ui/wifiman/ui/component/network/I;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/ui/component/network/I;-><init>(Lcom/ui/wifiman/ui/component/network/q$c;)V

    new-instance p0, Lcom/ui/wifiman/ui/component/network/J;

    invoke-direct {p0}, Lcom/ui/wifiman/ui/component/network/J;-><init>()V

    new-instance v2, Lcom/ui/wifiman/ui/component/network/B$c$a$b$a;

    invoke-direct {v2, p1, p2}, Lcom/ui/wifiman/ui/component/network/B$c$a$b$a;-><init>(Lmh/s;F)V

    const p1, 0x61d32a62

    const/4 p2, 0x1

    invoke-static {p1, p2, v2}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p1

    invoke-static {p3, v0, v1, p0, p1}, Lcom/ui/wifiman/ui/component/network/B;->A(LA/y;ILmh/l;Lmh/l;Lmh/r;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(Lcom/ui/wifiman/ui/component/network/q$c;I)Lcom/ui/wifiman/ui/component/network/q$b;
    .locals 0

    if-nez p1, :cond_0

    invoke-interface {p0}, Lcom/ui/wifiman/ui/component/network/q$c;->b()Lcom/ui/wifiman/ui/component/network/q$b;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lcom/ui/wifiman/ui/component/network/q$c;->a()Ljava/util/List;

    move-result-object p0

    add-int/lit8 p1, p1, -0x1

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYg/s;

    invoke-virtual {p0}, LYg/s;->h()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/ui/component/network/q$b;

    :goto_0
    return-object p0
.end method

.method private static final i(Lcom/ui/wifiman/ui/component/network/q$b;)Ljava/lang/String;
    .locals 1

    const-string v0, "item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/ui/wifiman/ui/component/network/q$b;->getId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e(LT/l;I)V
    .locals 12

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous>.<anonymous>.<anonymous> (NetworkTopology.kt:256)"

    const v3, -0x6ee3f59e

    invoke-static {v3, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->a:LA/B;

    const v2, -0x7cf0910f

    invoke-interface {p1, v2}, LT/l;->U(I)V

    iget-object v2, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->b:Lcom/ui/wifiman/ui/component/network/q$c;

    invoke-interface {p1, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->c:Lmh/s;

    invoke-interface {p1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget v3, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->d:F

    invoke-interface {p1, v3}, LT/l;->g(F)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->b:Lcom/ui/wifiman/ui/component/network/q$c;

    iget-object v4, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->c:Lmh/s;

    iget v5, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->d:F

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_3

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_4

    :cond_3
    new-instance v6, Lcom/ui/wifiman/ui/component/network/H;

    invoke-direct {v6, v3, v4, v5}, Lcom/ui/wifiman/ui/component/network/H;-><init>(Lcom/ui/wifiman/ui/component/network/q$c;Lmh/s;F)V

    invoke-interface {p1, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v8, v6

    check-cast v8, Lmh/l;

    invoke-interface {p1}, LT/l;->J()V

    const/4 v10, 0x6

    const/16 v11, 0xfc

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v9, p1

    invoke-static/range {v0 .. v11}, LA/b;->b(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$e;Lf0/c$c;Lw/n;ZLmh/l;LT/l;II)V

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

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/component/network/B$c$a$b;->e(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
