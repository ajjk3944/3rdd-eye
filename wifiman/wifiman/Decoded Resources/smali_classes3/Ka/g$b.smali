.class final LKa/g$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKa/g;-><init>(Ljava/lang/String;LLa/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:LKa/g;


# direct methods
.method constructor <init>(Ljava/lang/String;LKa/g;)V
    .locals 0

    iput-object p1, p0, LKa/g$b;->a:Ljava/lang/String;

    iput-object p2, p0, LKa/g$b;->b:LKa/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lspeedtest/HttpSpeedtestServerApi;
    .locals 3

    new-instance v0, Lspeedtest/HttpServerApiParams;

    invoke-direct {v0}, Lspeedtest/HttpServerApiParams;-><init>()V

    iget-object v1, p0, LKa/g$b;->a:Ljava/lang/String;

    iget-object v2, p0, LKa/g$b;->b:LKa/g;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lspeedtest/HttpServerApiParams;->setToken(Ljava/lang/String;)V

    :cond_0
    invoke-static {v2}, LKa/g;->f(LKa/g;)Lspeedtest/SpeedtestApplicationInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lspeedtest/HttpServerApiParams;->setAppInfo(Lspeedtest/SpeedtestApplicationInfo;)V

    new-instance v1, Lspeedtest/HttpServerApiFactory;

    invoke-direct {v1}, Lspeedtest/HttpServerApiFactory;-><init>()V

    invoke-virtual {v1, v0}, Lspeedtest/HttpServerApiFactory;->newApi(Lspeedtest/HttpServerApiParams;)Lspeedtest/HttpSpeedtestServerApi;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKa/g$b;->a()Lspeedtest/HttpSpeedtestServerApi;

    move-result-object v0

    return-object v0
.end method
