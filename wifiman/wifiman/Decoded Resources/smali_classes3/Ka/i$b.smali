.class final LKa/i$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKa/i;->i(LKa/h$b;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LKa/i;

.field final synthetic b:LKa/h$b;


# direct methods
.method constructor <init>(LKa/i;LKa/h$b;)V
    .locals 0

    iput-object p1, p0, LKa/i$b;->a:LKa/i;

    iput-object p2, p0, LKa/i$b;->b:LKa/h$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lspeedtest/Speedtest_;
    .locals 3

    iget-object v0, p0, LKa/i$b;->a:LKa/i;

    invoke-static {v0}, LKa/i;->f(LKa/i;)Lspeedtest/TcpSpeedtestServerApi;

    move-result-object v0

    iget-object v1, p0, LKa/i$b;->a:LKa/i;

    iget-object v2, p0, LKa/i$b;->b:LKa/h$b;

    invoke-static {v1, v2}, LKa/i;->e(LKa/i;LKa/h$b;)Lspeedtest/SpeedtestParams;

    move-result-object v1

    invoke-interface {v0, v1}, Lspeedtest/TcpSpeedtestServerApi;->testDownload(Lspeedtest/SpeedtestParams;)Lspeedtest/Speedtest_;

    move-result-object v0

    const-string/jumbo v1, "goApi.testDownload(params.asApiParams())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKa/i$b;->a()Lspeedtest/Speedtest_;

    move-result-object v0

    return-object v0
.end method
