.class final Lcom/ui/wmw/wifi/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/wifi/b;-><init>(Lcom/ui/wmw/api/v1/a;LKf/e;LMf/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wmw/wifi/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/wifi/b$b;

    invoke-direct {v0}, Lcom/ui/wmw/wifi/b$b;-><init>()V

    sput-object v0, Lcom/ui/wmw/wifi/b$b;->a:Lcom/ui/wmw/wifi/b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/v1/b$e;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/b$e;->a()Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;->b()Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a;

    move-result-object p1

    sget-object v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a;->DONE:Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/b$e;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/wifi/b$b;->a(Lcom/ui/wmw/api/v1/b$e;)Z

    move-result p1

    return p1
.end method
