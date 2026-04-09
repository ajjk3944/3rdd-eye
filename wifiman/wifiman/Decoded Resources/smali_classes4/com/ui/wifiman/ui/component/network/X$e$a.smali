.class final Lcom/ui/wifiman/ui/component/network/X$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/X$e;->c(Lz/f;LA/B;FJLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:F

.field final synthetic d:J

.field final synthetic e:J

.field final synthetic f:LT/q0;


# direct methods
.method constructor <init>(FFFJJLT/q0;)V
    .locals 0

    iput p1, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->a:F

    iput p2, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->b:F

    iput p3, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->c:F

    iput-wide p4, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->d:J

    iput-wide p6, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->e:J

    iput-object p8, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->f:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LT/q0;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/component/network/X$e$a;->c(LT/q0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LT/q0;)LYg/J;
    .locals 1

    invoke-interface {p0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0, v0}, LT/q0;->setValue(Ljava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lq/e;LT/l;I)V
    .locals 11

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous>.<anonymous> (WifimanNetworkTopology.kt:259)"

    const v1, -0x29940065

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget p3, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->a:F

    invoke-static {p1, p3}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p1

    iget p3, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->b:F

    iget v0, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->c:F

    invoke-static {p1, p3, v0}, Landroidx/compose/foundation/layout/l;->b(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object p1, LN9/b;->a:LN9/b;

    invoke-virtual {p1}, LN9/b;->l()Ls9/b;

    move-result-object v2

    sget p1, Lm8/c;->C1:I

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v7

    iget-wide v3, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->d:J

    iget-wide v5, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->e:J

    const p1, -0x40a164cf

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->f:LT/q0;

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    iget-object p3, p0, Lcom/ui/wifiman/ui/component/network/X$e$a;->f:LT/q0;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_1

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_2

    :cond_1
    new-instance v0, Lcom/ui/wifiman/ui/component/network/c0;

    invoke-direct {v0, p3}, Lcom/ui/wifiman/ui/component/network/c0;-><init>(LT/q0;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v8, v0

    check-cast v8, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v10, 0x0

    move-object v9, p2

    invoke-static/range {v1 .. v10}, Lcom/ui/wifiman/ui/component/network/X;->u(Landroidx/compose/ui/e;Ls9/b;JJLjava/lang/String;Lmh/a;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/component/network/X$e$a;->b(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
