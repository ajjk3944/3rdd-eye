.class final LKa/g$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKa/g;->k(LKa/f$c;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LKa/g;

.field final synthetic b:LKa/f$c;


# direct methods
.method constructor <init>(LKa/g;LKa/f$c;)V
    .locals 0

    iput-object p1, p0, LKa/g$e;->a:LKa/g;

    iput-object p2, p0, LKa/g$e;->b:LKa/f$c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lspeedtest/Speedtest_;
    .locals 3

    iget-object v0, p0, LKa/g$e;->a:LKa/g;

    invoke-static {v0}, LKa/g;->g(LKa/g;)Lspeedtest/HttpSpeedtestServerApi;

    move-result-object v0

    iget-object v1, p0, LKa/g$e;->a:LKa/g;

    iget-object v2, p0, LKa/g$e;->b:LKa/f$c;

    invoke-static {v1, v2}, LKa/g;->e(LKa/g;LKa/f$c;)Lspeedtest/SpeedtestParams;

    move-result-object v1

    invoke-interface {v0, v1}, Lspeedtest/HttpSpeedtestServerApi;->testUpload(Lspeedtest/SpeedtestParams;)Lspeedtest/Speedtest_;

    move-result-object v0

    const-string/jumbo v1, "goApi.testUpload(params.asGoTestParams())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKa/g$e;->a()Lspeedtest/Speedtest_;

    move-result-object v0

    return-object v0
.end method
