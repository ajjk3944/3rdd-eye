.class final LA8/q$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/q;->t0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LA8/q;


# direct methods
.method constructor <init>(LA8/q;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LA8/q$f;->b:LA8/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, LA8/q$f;

    iget-object v0, p0, LA8/q$f;->b:LA8/q;

    invoke-direct {p1, v0, p2}, LA8/q$f;-><init>(LA8/q;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LA8/q$f;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    const/4 v0, 0x1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, LA8/q$f;->a:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v0, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    sget-object v5, LA8/d;->a:LA8/d;

    iget-object p1, p0, LA8/q$f;->b:LA8/q;

    invoke-static {p1}, LA8/q;->y0(LA8/q;)LXe/a;

    move-result-object p1

    invoke-virtual {p1}, LXe/a;->a()J

    move-result-wide v6

    iget-object p1, p0, LA8/q$f;->b:LA8/q;

    invoke-virtual {p1}, LA8/q;->d()Lorg/kodein/di/DI;

    move-result-object p1

    invoke-static {p1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object p1

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v8, LA8/q$f$a;

    invoke-direct {v8}, LA8/q$f$a;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    const-string/jumbo v9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Landroid/content/Context;

    invoke-direct {v2, v8, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p1, v2, v4}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Landroid/content/Context;

    iget-object p1, p0, LA8/q$f;->b:LA8/q;

    invoke-static {p1}, LA8/q;->w0(LA8/q;)Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;

    move-result-object v9

    iput v0, p0, LA8/q$f;->a:I

    move-object v10, p0

    invoke-virtual/range {v5 .. v10}, LA8/d;->b(JLandroid/content/Context;Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_0
    check-cast p1, Ljava/io/File;

    if-eqz p1, :cond_4

    iget-object v2, p0, LA8/q$f;->b:LA8/q;

    invoke-static {v2}, LA8/q;->u0(LA8/q;)LP7/a;

    move-result-object v2

    new-instance v4, LP7/c$g$c;

    invoke-direct {v4}, LP7/c$g$c;-><init>()V

    invoke-interface {v2, v4}, LP7/a;->b(LP7/c;)V

    iget-object v2, p0, LA8/q$f;->b:LA8/q;

    invoke-static {v2}, LA8/q;->z0(LA8/q;)Li8/a;

    move-result-object v2

    new-instance v4, Li8/a$b$x;

    invoke-direct {v4, p1}, Li8/a$b$x;-><init>(Ljava/io/File;)V

    new-array p1, v0, [Li8/a$b;

    const/4 v0, 0x0

    aput-object v4, p1, v0

    invoke-interface {v2, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    iput v3, p0, LA8/q$f;->a:I

    invoke-static {p1, p0}, LQi/b;->b(Lgg/f;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_4
    iget-object p1, p0, LA8/q$f;->b:LA8/q;

    invoke-static {p1}, LA8/q;->y0(LA8/q;)LXe/a;

    move-result-object p1

    invoke-virtual {p1}, LXe/a;->a()J

    move-result-wide v0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Failed to share floorplan image. Failed to instantiate floorplan controller "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x6

    invoke-static {p1, v4, v4, v0, v4}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_5
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LA8/q$f;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LA8/q$f;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LA8/q$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
