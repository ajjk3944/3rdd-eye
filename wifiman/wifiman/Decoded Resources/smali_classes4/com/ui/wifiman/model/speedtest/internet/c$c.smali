.class final Lcom/ui/wifiman/model/speedtest/internet/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c;-><init>(Ltd/d;LYb/b;Lpc/a;LZc/f;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/c;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$c;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;Lcom/ui/wifiman/model/speedtest/internet/c$b;)LWc/b;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serversFetch"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LW7/c;

    instance-of v0, p2, Lcom/ui/wifiman/model/speedtest/internet/c$b$b;

    if-eqz v0, :cond_5

    check-cast p2, Lcom/ui/wifiman/model/speedtest/internet/c$b$b;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/internet/c$b$b;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LIa/e;

    invoke-virtual {v3}, LIa/e;->a()LLa/e;

    move-result-object v3

    invoke-virtual {v3}, LLa/e;->b()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/c$c;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LIa/e;

    invoke-static {v0, v3, p1}, Lcom/ui/wifiman/model/speedtest/internet/c;->e(Lcom/ui/wifiman/model/speedtest/internet/c;LIa/e;LW7/c;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/internet/c$b$b$a;

    if-eqz p1, :cond_3

    new-instance p1, LWc/b$a$b;

    invoke-direct {p1, v2}, LWc/b$a$b;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/internet/c$b$b$b;

    if-eqz p1, :cond_4

    new-instance p1, LWc/b$b;

    invoke-direct {p1, v2}, LWc/b$b;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    instance-of p1, p2, Lcom/ui/wifiman/model/speedtest/internet/c$b$a;

    if-eqz p1, :cond_6

    new-instance p1, LWc/b$a$a;

    check-cast p2, Lcom/ui/wifiman/model/speedtest/internet/c$b$a;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/internet/c$b$a;->a()Ljava/lang/Throwable;

    move-result-object p2

    invoke-direct {p1, p2}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    :goto_2
    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Lcom/ui/wifiman/model/speedtest/internet/c$b;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/internet/c$c;->a(Ll9/a;Lcom/ui/wifiman/model/speedtest/internet/c$b;)LWc/b;

    move-result-object p1

    return-object p1
.end method
