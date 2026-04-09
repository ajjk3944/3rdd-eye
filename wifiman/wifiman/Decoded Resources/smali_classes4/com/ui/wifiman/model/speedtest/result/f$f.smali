.class final Lcom/ui/wifiman/model/speedtest/result/f$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/result/f;->a(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/result/f;

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/result/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/result/f;Lcom/ui/wifiman/model/speedtest/result/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/f$f;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/result/f$f;->b:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lwa/a;)Lgg/D;
    .locals 3

    const-string v0, "catalog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/f$f;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/f$f;->b:Lcom/ui/wifiman/model/speedtest/result/b;

    new-instance v2, Lcom/ui/wifiman/model/speedtest/result/f$f$a;

    invoke-direct {v2, v0, v1, p1}, Lcom/ui/wifiman/model/speedtest/result/f$f$a;-><init>(Lcom/ui/wifiman/model/speedtest/result/f;Lcom/ui/wifiman/model/speedtest/result/b;Lwa/a;)V

    invoke-static {v2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwa/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/result/f$f;->a(Lwa/a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
