.class final Lcf/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcf/d;->b(Landroidx/compose/ui/e;Lcf/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcf/a;


# direct methods
.method constructor <init>(Lcf/a;)V
    .locals 0

    iput-object p1, p0, Lcf/d$a;->a:Lcf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcf/d$a;->c(Lxe/f$b;)LYg/J;

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
.method public final b(Lz/j;LT/l;I)V
    .locals 10

    const-string v0, "$this$ModalScaffold"

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speed.hosts.add.NetworkHostsAddUi.<anonymous> (NetworkHostsAddUi.kt:49)"

    const v1, -0x1715e243

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxe/f$b;

    new-instance v1, Ls9/d$b;

    sget p3, Lm8/c;->w1:I

    invoke-direct {v1, p3}, Ls9/d$b;-><init>(I)V

    sget-object v2, LL9/d$b;->b:LL9/d$b;

    const p3, -0x52c15084

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_3

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_4

    :cond_3
    new-instance v0, Lcf/c;

    invoke-direct {v0, p1}, Lcf/c;-><init>(Lxe/f$b;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v3, v0

    check-cast v3, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    new-instance p1, Lcf/d$a$a;

    iget-object p3, p0, Lcf/d$a;->a:Lcf/a;

    invoke-direct {p1, p3}, Lcf/d$a$a;-><init>(Lcf/a;)V

    const/16 p3, 0x36

    const v0, -0x8d371bc

    const/4 v4, 0x1

    invoke-static {v0, v4, p1, p2, p3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    sget p1, LL9/d$b;->c:I

    shl-int/lit8 p1, p1, 0x6

    or-int/lit16 v8, p1, 0x6000

    const/16 v9, 0x21

    const/4 v0, 0x0

    const-wide/16 v5, 0x0

    move-object v7, p2

    invoke-static/range {v0 .. v9}, LFe/j;->c(Landroidx/compose/ui/e;Ls9/d;LL9/d;Lmh/a;Lmh/q;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcf/d$a;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
