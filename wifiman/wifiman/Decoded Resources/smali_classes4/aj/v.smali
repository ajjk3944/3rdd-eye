.class final Laj/v;
.super Laj/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Laj/g;Lcj/e;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Laj/b;-><init>(Laj/g;Lcj/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0}, Laj/v;->g()V

    return-void
.end method

.method private final g()V
    .locals 2

    invoke-virtual {p0}, Laj/b;->a()Lcj/e;

    move-result-object v0

    invoke-static {}, Lcj/g;->a()Lcj/e;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lbj/w;

    invoke-virtual {p0}, Laj/b;->e()Laj/g;

    move-result-object v1

    invoke-direct {v0, v1}, Lbj/w;-><init>(Laj/g;)V

    invoke-virtual {p0}, Laj/b;->a()Lcj/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcj/e;->a(Lcj/i;)V

    return-void
.end method
