.class final Lyd/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->n(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/advanced/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V
    .locals 0

    iput-object p1, p0, Lyd/b$g;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lcom/ui/wifiman/model/speedtest/result/b$b;
    .locals 9

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkd/e;

    iget-object v0, p0, Lyd/b$g;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->w()LVd/c$a;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    new-instance v8, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    invoke-virtual {v0}, LVd/c$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, LVd/c$a;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LVd/c$a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, LVd/c$a;->a()Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lkd/e;->b()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lkd/e;->a()Ljava/net/URL;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-direct {v1, v8, v0, v3, v2}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;-><init>(Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "main server must already be available when reporting result"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lyd/b$g;->a(Ll9/a;)Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object p1

    return-object p1
.end method
