.class public final Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$c;
.super Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$c;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$c;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$c;->a:Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$c;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x289436b3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "InsufficientPermission"

    return-object v0
.end method
