.class final Lcom/ui/wifiman/model/speedtest/internet/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c;->r(LW7/c;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LW7/c;


# direct methods
.method constructor <init>(LW7/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$d;->a:LW7/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)LDj/a;
    .locals 7

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "component1(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LIa/a;

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/c$d;->a:LW7/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, LIa/d$a;

    invoke-virtual {v0}, LW7/c;->b()LW7/c$a;

    move-result-object v3

    invoke-virtual {v3}, LW7/c$a;->a()D

    move-result-wide v3

    invoke-virtual {v0}, LW7/c;->b()LW7/c$a;

    move-result-object v0

    invoke-virtual {v0}, LW7/c$a;->b()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, LIa/d$a;-><init>(DD)V

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    new-instance v0, LIa/d;

    invoke-direct {v0, v2}, LIa/d;-><init>(LIa/d$a;)V

    invoke-interface {p1, v0}, LIa/a;->d(LIa/d;)LLi/g;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v1, v0, v1}, LQi/i;->c(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$d;->a(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method
