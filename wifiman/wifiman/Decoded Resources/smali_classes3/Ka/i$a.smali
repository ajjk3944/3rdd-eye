.class final LKa/i$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKa/i;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LKa/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LKa/i$a;

    invoke-direct {v0}, LKa/i$a;-><init>()V

    sput-object v0, LKa/i$a;->a:LKa/i$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lspeedtest/TcpSpeedtestServerApi;
    .locals 2

    new-instance v0, Lspeedtest/TcpSpeedtestServerApiParams;

    invoke-direct {v0}, Lspeedtest/TcpSpeedtestServerApiParams;-><init>()V

    new-instance v1, Lspeedtest/TcpSpeedtestServerApiFactory;

    invoke-direct {v1}, Lspeedtest/TcpSpeedtestServerApiFactory;-><init>()V

    invoke-virtual {v1, v0}, Lspeedtest/TcpSpeedtestServerApiFactory;->newApi(Lspeedtest/TcpSpeedtestServerApiParams;)Lspeedtest/TcpSpeedtestServerApi;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKa/i$a;->a()Lspeedtest/TcpSpeedtestServerApi;

    move-result-object v0

    return-object v0
.end method
