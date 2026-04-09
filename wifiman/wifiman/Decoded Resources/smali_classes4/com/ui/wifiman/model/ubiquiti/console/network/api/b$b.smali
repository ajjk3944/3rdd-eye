.class final Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;-><init>(Leb/g$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$b;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$b;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Leb/m;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$b;->c(Leb/m;)V

    return-void
.end method

.method private static final c(Leb/m;)V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Leb/m;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    const-string v0, "Failed to close Unifi Network API websocket"

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v0, p0, v2, v1, v2}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leb/m;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$b;->b(Leb/m;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Leb/m;)LDj/a;
    .locals 2

    const-string v0, "ws"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Leb/m;->f()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/c;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/c;-><init>(Leb/m;)V

    invoke-virtual {v0, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
