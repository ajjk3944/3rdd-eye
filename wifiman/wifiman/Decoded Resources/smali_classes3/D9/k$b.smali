.class final LD9/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD9/k;->k(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;

.field final synthetic b:LD9/o;

.field final synthetic c:Lmh/a;

.field final synthetic d:Lmh/q;


# direct methods
.method constructor <init>(LT/q0;LD9/o;Lmh/a;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LD9/k$b;->a:LT/q0;

    iput-object p2, p0, LD9/k$b;->b:LD9/o;

    iput-object p3, p0, LD9/k$b;->c:Lmh/a;

    iput-object p4, p0, LD9/k$b;->d:Lmh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LT/q0;LD9/o;Lmh/a;F)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD9/k$b;->c(LT/q0;LD9/o;Lmh/a;F)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LT/q0;LD9/o;Lmh/a;F)LYg/J;
    .locals 0

    invoke-interface {p0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {p1}, LD9/o;->c()V

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(LT/z1;)F
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.component.popup.anchored.UiAnchoredPopupBase.<anonymous> (AnchoredPopup.kt:108)"

    const v2, -0x57937dd9

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LD9/k$b;->a:LT/q0;

    invoke-interface {p2}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_3

    const/high16 p2, 0x3f800000    # 1.0f

    :goto_1
    move v0, p2

    goto :goto_2

    :cond_3
    const/4 p2, 0x0

    goto :goto_1

    :goto_2
    const p2, 0x67fc45b5

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, LD9/k$b;->b:LD9/o;

    invoke-interface {p1, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p2

    iget-object v1, p0, LD9/k$b;->c:Lmh/a;

    invoke-interface {p1, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p2, v1

    iget-object v1, p0, LD9/k$b;->a:LT/q0;

    iget-object v2, p0, LD9/k$b;->b:LD9/o;

    iget-object v3, p0, LD9/k$b;->c:Lmh/a;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez p2, :cond_4

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v4, p2, :cond_5

    :cond_4
    new-instance v4, LD9/l;

    invoke-direct {v4, v1, v2, v3}, LD9/l;-><init>(LT/q0;LD9/o;Lmh/a;)V

    invoke-interface {p1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, Lmh/l;

    invoke-interface {p1}, LT/l;->J()V

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Lr/c;->d(FLr/i;FLjava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object p2

    iget-object v0, p0, LD9/k$b;->d:Lmh/q;

    invoke-static {p2}, LD9/k$b;->e(LT/z1;)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p2, p1, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p2, LYg/J;->a:LYg/J;

    const v0, 0x67fc658b

    invoke-interface {p1, v0}, LT/l;->U(I)V

    iget-object v0, p0, LD9/k$b;->a:LT/q0;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_6

    new-instance v1, LD9/k$b$a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, LD9/k$b$a;-><init>(LT/q0;Ldh/e;)V

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lmh/p;

    invoke-interface {p1}, LT/l;->J()V

    const/4 v0, 0x6

    invoke-static {p2, v1, p1, v0}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LD9/k$b;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
