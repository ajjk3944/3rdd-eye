.class final LT/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/g0;


# static fields
.field public static final a:LT/F;

.field private static final b:Landroid/view/Choreographer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LT/F;

    invoke-direct {v0}, LT/F;-><init>()V

    sput-object v0, LT/F;->a:LT/F;

    invoke-static {}, LIi/c0;->c()LIi/H0;

    move-result-object v0

    invoke-virtual {v0}, LIi/H0;->p0()LIi/H0;

    move-result-object v0

    new-instance v1, LT/F$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LT/F$a;-><init>(Ldh/e;)V

    invoke-static {v0, v1}, LIi/i;->e(Ldh/i;Lmh/p;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Choreographer;

    sput-object v0, LT/F;->b:Landroid/view/Choreographer;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic b()Landroid/view/Choreographer;
    .locals 1

    sget-object v0, LT/F;->b:Landroid/view/Choreographer;

    return-object v0
.end method


# virtual methods
.method public fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LT/g0$a;->a(LT/g0;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->b(LT/g0;Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public j(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LIi/p;

    invoke-static {p2}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    new-instance v1, LT/F$c;

    invoke-direct {v1, v0, p1}, LT/F$c;-><init>(LIi/n;Lmh/l;)V

    invoke-static {}, LT/F;->b()Landroid/view/Choreographer;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    new-instance p1, LT/F$b;

    invoke-direct {p1, v1}, LT/F$b;-><init>(Landroid/view/Choreographer$FrameCallback;)V

    invoke-interface {v0, p1}, LIi/n;->B(Lmh/l;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p1
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->c(LT/g0;Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ldh/i;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->d(LT/g0;Ldh/i;)Ldh/i;

    move-result-object p1

    return-object p1
.end method
