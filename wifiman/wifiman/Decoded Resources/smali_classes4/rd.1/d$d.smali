.class final Lrd/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/d;-><init>(LZc/f;Lje/u;Lld/b;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrd/d;


# direct methods
.method constructor <init>(Lrd/d;)V
    .locals 0

    iput-object p1, p0, Lrd/d$d;->a:Lrd/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lrd/d$b;)LDj/a;
    .locals 2

    const-string v0, "networkState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lrd/d$b$a;

    if-eqz v0, :cond_0

    const-string p1, "A2A Speedtest Discovery Started"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, Lrd/d$d;->a:Lrd/d;

    invoke-static {p1}, Lrd/d;->d(Lrd/d;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lrd/d$b$b;

    if-eqz p1, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lrd/d$b;

    invoke-virtual {p0, p1}, Lrd/d$d;->a(Lrd/d$b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
