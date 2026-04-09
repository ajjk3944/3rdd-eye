.class final Lcom/ui/wifiman/model/speedtest/internet/c$n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c$n;->b(LYg/s;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/c;

.field final synthetic b:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/c;Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$n$a;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/internet/c$n$a;->b:Lkotlin/jvm/internal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/D;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LIa/a$c;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$n$a$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$n$a;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/internet/c$n$a;->b:Lkotlin/jvm/internal/N;

    const/4 v3, 0x0

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/ui/wifiman/model/speedtest/internet/c$n$a$a;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;LIa/a$c;Lkotlin/jvm/internal/N;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v3, v0, p1, v3}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$n$a$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$n$a;->b:Lkotlin/jvm/internal/N;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/internet/c$n$a$b;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$n$a;->a(LYg/s;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
