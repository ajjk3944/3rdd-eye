.class public final Lb2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/lifecycle/Q;

.field private final b:Landroidx/lifecycle/P$c;

.field private final c:Lb2/a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/d;->a:Landroidx/lifecycle/Q;

    iput-object p2, p0, Lb2/d;->b:Landroidx/lifecycle/P$c;

    iput-object p3, p0, Lb2/d;->c:Lb2/a;

    return-void
.end method

.method public static synthetic b(Lb2/d;Lth/d;Ljava/lang/String;ILjava/lang/Object;)Landroidx/lifecycle/N;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Ld2/g;->a:Ld2/g;

    invoke-virtual {p2, p1}, Ld2/g;->c(Lth/d;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lb2/d;->a(Lth/d;Ljava/lang/String;)Landroidx/lifecycle/N;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lth/d;Ljava/lang/String;)Landroidx/lifecycle/N;
    .locals 2

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb2/d;->a:Landroidx/lifecycle/Q;

    invoke-virtual {v0, p2}, Landroidx/lifecycle/Q;->b(Ljava/lang/String;)Landroidx/lifecycle/N;

    move-result-object v0

    invoke-interface {p1, v0}, Lth/d;->J(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p0, Lb2/d;->b:Landroidx/lifecycle/P$c;

    instance-of p2, p1, Landroidx/lifecycle/P$e;

    if-eqz p2, :cond_0

    check-cast p1, Landroidx/lifecycle/P$e;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/P$e;->d(Landroidx/lifecycle/N;)V

    :cond_0
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v0, Lb2/b;

    iget-object v1, p0, Lb2/d;->c:Lb2/a;

    invoke-direct {v0, v1}, Lb2/b;-><init>(Lb2/a;)V

    sget-object v1, Ld2/g$a;->a:Ld2/g$a;

    invoke-virtual {v0, v1, p2}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    iget-object v1, p0, Lb2/d;->b:Landroidx/lifecycle/P$c;

    invoke-static {v1, p1, v0}, Lb2/e;->a(Landroidx/lifecycle/P$c;Lth/d;Lb2/a;)Landroidx/lifecycle/N;

    move-result-object p1

    iget-object v0, p0, Lb2/d;->a:Landroidx/lifecycle/Q;

    invoke-virtual {v0, p2, p1}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;Landroidx/lifecycle/N;)V

    return-object p1
.end method
