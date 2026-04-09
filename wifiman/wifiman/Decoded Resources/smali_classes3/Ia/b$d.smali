.class final LIa/b$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIa/b;-><init>(Ljava/lang/String;LLa/c;LIa/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIa/b$d$a;
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:LIa/b;

.field final synthetic c:LIa/a$b;


# direct methods
.method constructor <init>(Ljava/lang/String;LIa/b;LIa/a$b;)V
    .locals 0

    iput-object p1, p0, LIa/b$d;->a:Ljava/lang/String;

    iput-object p2, p0, LIa/b$d;->b:LIa/b;

    iput-object p3, p0, LIa/b$d;->c:LIa/a$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lspeedtest/DirectoryServerApi;
    .locals 4

    new-instance v0, Lspeedtest/DirectoryServerApiParams;

    invoke-direct {v0}, Lspeedtest/DirectoryServerApiParams;-><init>()V

    iget-object v1, p0, LIa/b$d;->a:Ljava/lang/String;

    iget-object v2, p0, LIa/b$d;->b:LIa/b;

    iget-object v3, p0, LIa/b$d;->c:LIa/a$b;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lspeedtest/DirectoryServerApiParams;->setToken(Ljava/lang/String;)V

    :cond_0
    invoke-static {v2}, LIa/b;->g(LIa/b;)Lspeedtest/SpeedtestApplicationInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lspeedtest/DirectoryServerApiParams;->setAppInfo(Lspeedtest/SpeedtestApplicationInfo;)V

    sget-object v1, LIa/b$d$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    const-string/jumbo v1, "dev"

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    const-string/jumbo v1, "stg"

    goto :goto_0

    :cond_3
    const-string/jumbo v1, "prd"

    :goto_0
    invoke-virtual {v0, v1}, Lspeedtest/DirectoryServerApiParams;->setEnvString(Ljava/lang/String;)V

    new-instance v1, Lspeedtest/DirectoryServerApiFactory;

    invoke-direct {v1}, Lspeedtest/DirectoryServerApiFactory;-><init>()V

    invoke-virtual {v1, v0}, Lspeedtest/DirectoryServerApiFactory;->newApi(Lspeedtest/DirectoryServerApiParams;)Lspeedtest/DirectoryServerApi;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIa/b$d;->a()Lspeedtest/DirectoryServerApi;

    move-result-object v0

    return-object v0
.end method
