.class final Lw8/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/b;->v0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw8/b;


# direct methods
.method constructor <init>(Lw8/b;)V
    .locals 0

    iput-object p1, p0, Lw8/b$e;->a:Lw8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LSd/d$a;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "directConnectionStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LSd/d$a$a$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw8/b$e;->a:Lw8/b;

    invoke-static {v0}, Lw8/b;->D0(Lw8/b;)LSd/a;

    move-result-object v0

    check-cast p1, LSd/d$a$a$b;

    invoke-virtual {p1}, LSd/d$a$a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, p1, v1}, LSd/a;->a(Ljava/lang/String;Ljava/util/Set;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LSd/d$a$a$a;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lw8/b$e;->a:Lw8/b;

    invoke-static {p1}, Lw8/b;->C0(Lw8/b;)Lv8/a;

    move-result-object p1

    invoke-interface {p1}, Lv8/a;->b()Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of p1, p1, LSd/d$a$b;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lw8/b$e;->a:Lw8/b;

    invoke-static {p1}, Lw8/b;->E0(Lw8/b;)Li8/a;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Li8/a$b;

    sget-object v1, Li8/b;->a:Li8/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-interface {p1, v0}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LSd/d$a;

    invoke-virtual {p0, p1}, Lw8/b$e;->a(LSd/d$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
