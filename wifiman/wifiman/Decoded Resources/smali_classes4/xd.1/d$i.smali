.class final Lxd/d$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/d;->j(Lcom/ui/wifiman/model/speedtest/internet/f;Lxd/c;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxd/d$i$d;
    }
.end annotation


# instance fields
.field final synthetic a:Lxd/d;

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/internet/f;

.field final synthetic c:Lxd/c;


# direct methods
.method constructor <init>(Lxd/d;Lcom/ui/wifiman/model/speedtest/internet/f;Lxd/c;)V
    .locals 0

    iput-object p1, p0, Lxd/d$i;->a:Lxd/d;

    iput-object p2, p0, Lxd/d$i;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    iput-object p3, p0, Lxd/d$i;->c:Lxd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/D;
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "component1(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LIa/a$b;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "component2(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LCc/j;

    new-instance v1, Lc8/c;

    sget-object v2, Lxd/d$i$d;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    sget-object v0, Lc8/a;->DEV:Lc8/a;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object v0, Lc8/a;->STAGE:Lc8/a;

    goto :goto_0

    :cond_2
    sget-object v0, Lc8/a;->PRODUCTION:Lc8/a;

    :goto_0
    invoke-direct {v1, v0}, Lc8/c;-><init>(Lc8/a;)V

    invoke-virtual {v1}, Lc8/c;->b()Lgg/z;

    move-result-object v0

    new-instance v1, Lxd/d$i$a;

    iget-object v2, p0, Lxd/d$i;->a:Lxd/d;

    iget-object v3, p0, Lxd/d$i;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    iget-object v4, p0, Lxd/d$i;->c:Lxd/c;

    invoke-direct {v1, v2, v3, p1, v4}, Lxd/d$i$a;-><init>(Lxd/d;Lcom/ui/wifiman/model/speedtest/internet/f;LCc/j;Lxd/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, Lxd/d$i$b;->a:Lxd/d$i$b;

    invoke-virtual {p1, v0}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object p1

    sget-object v0, Lxd/d$i$c;->a:Lxd/d$i$c;

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lxd/d$i;->a(LYg/s;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
