.class final Lcom/ui/wifiman/ui/signal/z$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/z;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/w;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/w;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/w;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/z$b;->a:Lcom/ui/wifiman/ui/signal/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(LT/q0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/signal/z$b;->e(LT/q0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LT/q0;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/signal/z$b;->f(LT/q0;Ljava/lang/String;)V

    return-void
.end method

.method private static final e(LT/q0;)Ljava/lang/String;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final f(LT/q0;Ljava/lang/String;)V
    .locals 0

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final c(Lz/j;LT/l;I)V
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

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.signal.SignalTabPlaceAddUi.<anonymous> (SignalTabPlaceAddUi.kt:66)"

    const v1, 0x54eb521

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const p1, -0x739e9e9

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    const/4 v0, 0x0

    if-ne p1, p3, :cond_3

    const-string p1, ""

    const/4 p3, 0x2

    invoke-static {p1, v0, p3, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast p1, LT/q0;

    invoke-interface {p2}, LT/l;->J()V

    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p3, v1, v2, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object p3, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p3, p2, v0}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->c()F

    move-result v1

    invoke-virtual {p3, p2, v0}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    const/4 v5, 0x0

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {p3, p2, v0}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object p3

    invoke-virtual {p3}, Lra/a;->a()Lra/b;

    move-result-object p3

    invoke-virtual {p3}, Lra/b;->b()Lra/b$a$b;

    move-result-object p3

    invoke-virtual {p3}, Lra/b$a$b;->d()F

    move-result p3

    invoke-static {v1, v5, v4, p3}, Landroidx/compose/foundation/layout/o;->d(FFFF)Lz/N;

    move-result-object v5

    new-instance p3, Lcom/ui/wifiman/ui/signal/z$b$a;

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/z$b;->a:Lcom/ui/wifiman/ui/signal/w;

    invoke-direct {p3, v0, p1}, Lcom/ui/wifiman/ui/signal/z$b$a;-><init>(Lcom/ui/wifiman/ui/signal/w;LT/q0;)V

    const/16 p1, 0x36

    const v0, -0x4bf57c76

    invoke-static {v0, v2, p3, p2, p1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const/16 v8, 0xc06

    const/4 v9, 0x2

    const/4 v4, 0x0

    move-object v7, p2

    invoke-static/range {v3 .. v9}, LF9/P;->b(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/N;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
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

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/z$b;->c(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
