.class final Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;-><init>(LLd/f;LQd/e;LZc/f;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$g;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$g;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$g;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;)Lgg/D;
    .locals 3

    const-string v0, "fetch"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LWc/b$a$a;

    const-string v1, "just(...)"

    if-eqz v0, :cond_2

    check-cast p1, LWc/b$a$a;

    invoke-virtual {p1}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v2, v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError;

    if-eqz v2, :cond_0

    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/console/b$a$b;->a:Lcom/ui/wifiman/model/ubiquiti/console/b$a$b;

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of v0, v0, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/b$a$a;

    invoke-virtual {p1}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/b$a$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error;)V

    invoke-static {v0}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    const-string v0, "error(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    instance-of v0, p1, LWc/b$c;

    if-nez v0, :cond_5

    instance-of v0, p1, LWc/b$a$b;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    instance-of p1, p1, LWc/b$b;

    if-eqz p1, :cond_4

    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/console/b$a$c;->a:Lcom/ui/wifiman/model/ubiquiti/console/b$a$c;

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/console/b$a$d;->a:Lcom/ui/wifiman/model/ubiquiti/console/b$a$d;

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$g;->a(LWc/b;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
