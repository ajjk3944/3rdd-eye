.class final Lcom/ui/wifiman/model/ubiquiti/cloud/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/a;->a()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/ubiquiti/cloud/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/a$c;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/a$c;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/cloud/a$c;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/a$c;

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

    const-string v0, "_error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/lang/RuntimeException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :cond_2
    :goto_1
    nop

    instance-of v0, p1, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$Unauthorized;

    check-cast p1, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$Unauthorized;-><init>(Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;)V

    invoke-static {v0}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    goto :goto_3

    :cond_3
    instance-of v0, p1, Lretrofit2/HttpException;

    if-nez v0, :cond_5

    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    goto :goto_3

    :cond_5
    :goto_2
    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$IO;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$IO;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    :goto_3
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/a$c;->a(Ljava/lang/Throwable;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
