.class final Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->d(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$g;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$g;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/D;
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;->c(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$g;->a(Ljava/lang/Throwable;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
