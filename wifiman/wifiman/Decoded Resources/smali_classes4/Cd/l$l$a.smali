.class final LCd/l$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCd/l$l;->a(LW7/b;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCd/n;


# direct methods
.method constructor <init>(LCd/n;)V
    .locals 0

    iput-object p1, p0, LCd/l$l$a;->a:LCd/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/Speedtest$f;)LCd/n;
    .locals 13

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LCd/l$l$a;->a:LCd/n;

    const/16 v11, 0x1bf

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, p1

    invoke-static/range {v1 .. v12}, LCd/n;->k(LCd/n;LCd/j$c;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)LCd/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {p0, p1}, LCd/l$l$a;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$f;)LCd/n;

    move-result-object p1

    return-object p1
.end method
