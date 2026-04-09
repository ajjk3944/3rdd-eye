.class final Lcom/ui/wifiman/model/speedtest/internet/b$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/b;->s(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/b;

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/internet/f;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/b;Lcom/ui/wifiman/model/speedtest/internet/f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$o;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/internet/b$o;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LKa/f$a;)Lgg/f;
    .locals 5

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b$o;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$o;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/speedtest/internet/b;->i(Lcom/ui/wifiman/model/speedtest/internet/b;Lcom/ui/wifiman/model/speedtest/internet/f;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LKa/f$c$a$a;

    new-instance v3, Lcom/ui/wifiman/model/speedtest/internet/b$o$a;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v2, v4}, Lcom/ui/wifiman/model/speedtest/internet/b$o$a;-><init>(LKa/f$a;LKa/f$c$a$a;Ldh/e;)V

    const/4 v2, 0x1

    invoke-static {v4, v3, v2, v4}, LQi/g;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/b;

    move-result-object v2

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v3

    invoke-virtual {v2, v3}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v3

    invoke-virtual {v2, v3}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lgg/b;->H(Ljava/lang/Iterable;)Lgg/b;

    move-result-object p1

    const-wide/16 v0, 0x3e8

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lgg/b;->Y(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->M()Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKa/f$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$o;->a(LKa/f$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
