.class final Lrd/j$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/j;-><init>(LZc/f;Lmc/a;Lld/b;Lvc/b;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;Ldc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrd/j;


# direct methods
.method constructor <init>(Lrd/j;)V
    .locals 0

    iput-object p1, p0, Lrd/j$m;->a:Lrd/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lrd/j$c;)LDj/a;
    .locals 3

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Speedtest SERVER params: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    instance-of v0, p1, Lrd/j$c$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrd/j$m;->a:Lrd/j;

    invoke-static {v0}, Lrd/j;->j(Lrd/j;)Lgg/i;

    move-result-object v0

    new-instance v1, Lrd/j$m$a;

    iget-object v2, p0, Lrd/j$m;->a:Lrd/j;

    invoke-direct {v1, v2, p1}, Lrd/j$m$a;-><init>(Lrd/j;Lrd/j$c;)V

    invoke-virtual {v0, v1}, Lgg/i;->x(Lgg/m;)Lgg/i;

    move-result-object p1

    new-instance v0, Lrd/j$m$b;

    iget-object v1, p0, Lrd/j$m;->a:Lrd/j;

    invoke-direct {v0, v1}, Lrd/j$m$b;-><init>(Lrd/j;)V

    invoke-virtual {p1, v0}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lrd/j$c$a;

    if-eqz p1, :cond_1

    sget-object p1, Lrd/a$a$a;->a:Lrd/a$a$a;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    new-instance v0, Lrd/j$m$c;

    iget-object v1, p0, Lrd/j$m;->a:Lrd/j;

    invoke-direct {v0, v1}, Lrd/j$m$c;-><init>(Lrd/j;)V

    invoke-virtual {p1, v0}, Lgg/i;->g0(Lkg/f;)Lgg/i;

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

    check-cast p1, Lrd/j$c;

    invoke-virtual {p0, p1}, Lrd/j$m;->a(Lrd/j$c;)LDj/a;

    move-result-object p1

    return-object p1
.end method
