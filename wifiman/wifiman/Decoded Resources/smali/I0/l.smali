.class public final LI0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI0/d$a;


# instance fields
.field private final a:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LI0/l;->a:LT/q0;

    return-void
.end method

.method private final e(Z)V
    .locals 1

    iget-object v0, p0, LI0/l;->a:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LI0/l;->e(Z)V

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LI0/l;->e(Z)V

    return-void
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, LI0/l;->a:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final d(Landroid/view/View;LJ0/p;Ldh/i;Ljava/util/function/Consumer;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "LJ0/p;",
            "Ldh/i;",
            "Ljava/util/function/Consumer<",
            "Landroid/view/ScrollCaptureTarget;",
            ">;)V"
        }
    .end annotation

    new-instance v0, LV/b;

    const/16 v1, 0x10

    new-array v1, v1, [LI0/m;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LV/b;-><init>([Ljava/lang/Object;I)V

    invoke-virtual {p2}, LJ0/p;->a()LJ0/n;

    move-result-object p2

    new-instance v1, LI0/l$a;

    invoke-direct {v1, v0}, LI0/l$a;-><init>(Ljava/lang/Object;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p2, v2, v1, v3, v4}, LI0/n;->e(LJ0/n;ILmh/l;ILjava/lang/Object;)V

    new-array p2, v3, [Lmh/l;

    sget-object v1, LI0/l$b;->a:LI0/l$b;

    aput-object v1, p2, v2

    sget-object v1, LI0/l$c;->a:LI0/l$c;

    const/4 v2, 0x1

    aput-object v1, p2, v2

    invoke-static {p2}, Lch/a;->c([Lmh/l;)Ljava/util/Comparator;

    move-result-object p2

    invoke-virtual {v0, p2}, LV/b;->F(Ljava/util/Comparator;)V

    invoke-virtual {v0}, LV/b;->s()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LV/b;->o()I

    move-result p2

    sub-int/2addr p2, v2

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    aget-object v4, v0, p2

    :goto_0
    check-cast v4, LI0/m;

    if-nez v4, :cond_1

    return-void

    :cond_1
    invoke-static {p3}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object p2

    new-instance p3, LI0/d;

    invoke-virtual {v4}, LI0/m;->c()LJ0/n;

    move-result-object v0

    invoke-virtual {v4}, LI0/m;->d()LY0/p;

    move-result-object v1

    invoke-direct {p3, v0, v1, p2, p0}, LI0/d;-><init>(LJ0/n;LY0/p;LIi/N;LI0/d$a;)V

    invoke-virtual {v4}, LI0/m;->a()LC0/r;

    move-result-object p2

    invoke-static {p2}, LC0/s;->b(LC0/r;)Ll0/i;

    move-result-object p2

    invoke-virtual {v4}, LI0/m;->d()LY0/p;

    move-result-object v0

    invoke-virtual {v0}, LY0/p;->i()J

    move-result-wide v0

    invoke-static {p2}, LY0/q;->b(Ll0/i;)LY0/p;

    move-result-object p2

    invoke-static {p2}, Lm0/b1;->a(LY0/p;)Landroid/graphics/Rect;

    move-result-object p2

    new-instance v2, Landroid/graphics/Point;

    invoke-static {v0, v1}, LY0/n;->h(J)I

    move-result v3

    invoke-static {v0, v1}, LY0/n;->i(J)I

    move-result v0

    invoke-direct {v2, v3, v0}, Landroid/graphics/Point;-><init>(II)V

    invoke-static {p3}, LI0/i;->a(Ljava/lang/Object;)Landroid/view/ScrollCaptureCallback;

    move-result-object p3

    invoke-static {p1, p2, v2, p3}, LI0/k;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;Landroid/view/ScrollCaptureCallback;)Landroid/view/ScrollCaptureTarget;

    move-result-object p1

    invoke-virtual {v4}, LI0/m;->d()LY0/p;

    move-result-object p2

    invoke-static {p2}, Lm0/b1;->a(LY0/p;)Landroid/graphics/Rect;

    move-result-object p2

    invoke-static {p1, p2}, LI0/j;->a(Landroid/view/ScrollCaptureTarget;Landroid/graphics/Rect;)V

    invoke-interface {p4, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method
