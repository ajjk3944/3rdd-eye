.class final Lcom/ui/wifiman/model/speedtest/result/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/result/f;->f(J)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/result/f;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/result/f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/f$c;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lwa/a;)Ll9/a;
    .locals 2

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "catalog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    const/4 v1, 0x0

    invoke-static {p1, v1}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXb/d;

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/f$c;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    invoke-virtual {v1, p1, p2}, Lcom/ui/wifiman/model/speedtest/result/f;->l(LXb/d;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Lwa/a;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/result/f$c;->a(Ljava/util/List;Lwa/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
