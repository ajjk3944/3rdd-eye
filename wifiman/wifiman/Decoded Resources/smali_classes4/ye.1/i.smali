.class public final Lye/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field final synthetic a:Landroidx/lifecycle/N;

.field final synthetic b:Landroidx/lifecycle/o;

.field final synthetic c:Landroidx/appcompat/app/c;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V
    .locals 0

    iput-object p1, p0, Lye/i;->a:Landroidx/lifecycle/N;

    iput-object p2, p0, Lye/i;->b:Landroidx/lifecycle/o;

    iput-object p3, p0, Lye/i;->c:Landroidx/appcompat/app/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 3

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lye/i;->a:Landroidx/lifecycle/N;

    instance-of v0, p1, Landroidx/lifecycle/e;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/lifecycle/e;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    new-instance v0, Lye/i$b;

    iget-object v1, p0, Lye/i;->c:Landroidx/appcompat/app/c;

    invoke-direct {v0, p1, v1}, Lye/i$b;-><init>(Landroidx/lifecycle/e;Landroidx/appcompat/app/c;)V

    iget-object v1, p0, Lye/i;->b:Landroidx/lifecycle/o;

    invoke-interface {v1}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    :cond_1
    iget-object v0, p0, Lye/i;->c:Landroidx/appcompat/app/c;

    iget-object v1, p0, Lye/i;->b:Landroidx/lifecycle/o;

    new-instance v2, Lye/i$a;

    invoke-direct {v2, p1, v0, v1}, Lye/i$a;-><init>(Landroidx/lifecycle/e;Landroidx/appcompat/app/c;Landroidx/lifecycle/o;)V

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Lye/i;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
