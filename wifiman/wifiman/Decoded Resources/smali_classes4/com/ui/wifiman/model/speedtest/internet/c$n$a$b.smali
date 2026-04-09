.class final Lcom/ui/wifiman/model/speedtest/internet/c$n$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c$n$a;->a(LYg/s;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$n$a$b;->a:Lkotlin/jvm/internal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LLa/e;)LWc/b;
    .locals 19

    const-string v0, "eval"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWc/b$a$b;

    move-object/from16 v2, p0

    iget-object v3, v2, Lcom/ui/wifiman/model/speedtest/internet/c$n$a$b;->a:Lkotlin/jvm/internal/N;

    iget-object v3, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    invoke-virtual/range {p1 .. p1}, LLa/e;->b()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    long-to-int v1, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    move-object v14, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const/16 v17, 0xdff

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v4 .. v18}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->g(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v1

    invoke-direct {v0, v1}, LWc/b$a$b;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLa/e;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$n$a$b;->a(LLa/e;)LWc/b;

    move-result-object p1

    return-object p1
.end method
