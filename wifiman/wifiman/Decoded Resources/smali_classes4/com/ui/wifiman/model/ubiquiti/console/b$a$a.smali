.class public final Lcom/ui/wifiman/model/ubiquiti/console/b$a$a;
.super Lcom/ui/wifiman/model/ubiquiti/console/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/console/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error;)V
    .locals 1

    const-string v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/ubiquiti/console/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/b$a$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/b$a$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error;

    return-object v0
.end method
