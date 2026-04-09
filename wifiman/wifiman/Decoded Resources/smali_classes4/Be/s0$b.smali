.class final LBe/s0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/s0;->g(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/r;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCi/c;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/l;

.field final synthetic d:Lmh/r;

.field final synthetic e:I


# direct methods
.method constructor <init>(LCi/c;Ljava/lang/Object;Lmh/l;Lmh/r;I)V
    .locals 0

    iput-object p1, p0, LBe/s0$b;->a:LCi/c;

    iput-object p2, p0, LBe/s0$b;->b:Ljava/lang/Object;

    iput-object p3, p0, LBe/s0$b;->c:Lmh/l;

    iput-object p4, p0, LBe/s0$b;->d:Lmh/r;

    iput p5, p0, LBe/s0$b;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LBe/s0$b;->c(Lmh/l;Ljava/lang/Object;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lmh/l;Ljava/lang/Object;)LYg/J;
    .locals 0

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/A;LT/l;I)V
    .locals 11

    const-string v0, "$this$FlowRow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.component.UiSelectorHorizontalBase.<anonymous> (UiSelectorHorizontal.kt:73)"

    const v1, 0x310c96a0

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, LBe/s0$b;->a:LCi/c;

    iget-object p3, p0, LBe/s0$b;->b:Ljava/lang/Object;

    iget-object v0, p0, LBe/s0$b;->c:Lmh/l;

    iget-object v1, p0, LBe/s0$b;->d:Lmh/r;

    iget v2, p0, LBe/s0$b;->e:I

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v4, 0x78f7b313

    invoke-interface {p2, v4}, LT/l;->U(I)V

    invoke-interface {p2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p2, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_4

    :cond_3
    new-instance v6, LBe/t0;

    invoke-direct {v6, v0, v3}, LBe/t0;-><init>(Lmh/l;Ljava/lang/Object;)V

    invoke-interface {p2, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    new-instance v4, LBe/s0$b$a;

    invoke-direct {v4, v1, v3, v2}, LBe/s0$b$a;-><init>(Lmh/r;Ljava/lang/Object;I)V

    const/16 v3, 0x36

    const v7, -0x5679f9c1

    const/4 v8, 0x1

    invoke-static {v7, v8, v4, p2, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v9, 0xc00

    const/4 v10, 0x1

    const/4 v4, 0x0

    move-object v8, p2

    invoke-static/range {v4 .. v10}, LBe/s0;->m(Landroidx/compose/ui/e;ZLmh/a;Lmh/q;LT/l;II)V

    goto :goto_1

    :cond_5
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/A;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LBe/s0$b;->b(Lz/A;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
