.class final Lxd/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/a;->g(Lcom/ui/wifiman/model/speedtest/result/b;Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lxd/a;

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/result/b;


# direct methods
.method constructor <init>(Lxd/a;Lcom/ui/wifiman/model/speedtest/result/b;)V
    .locals 0

    iput-object p1, p0, Lxd/a$e;->a:Lxd/a;

    iput-object p2, p0, Lxd/a$e;->b:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/f;
    .locals 9

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$c;

    iget-object v1, p0, Lxd/a$e;->a:Lxd/a;

    invoke-static {v1}, Lxd/a;->a(Lxd/a;)LP7/a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->f()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v6

    iget-object p1, p0, Lxd/a$e;->b:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->d()Lb8/c;

    move-result-object v8

    new-instance p1, LP7/c$k;

    move-object v2, p1

    invoke-direct/range {v2 .. v8}, LP7/c$k;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lb8/c;)V

    invoke-interface {v1, p1}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lxd/a$e;->a(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
