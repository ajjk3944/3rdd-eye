.class public final LCc/b$d$a;
.super LCc/b$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCc/b$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:LCc/b$d$a;

.field private static final c:Lcom/ui/wifiman/model/vendor/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCc/b$d$a;

    invoke-direct {v0}, LCc/b$d$a;-><init>()V

    sput-object v0, LCc/b$d$a;->b:LCc/b$d$a;

    sget-object v0, Lcom/ui/wifiman/model/vendor/d$d;->MICROSOFT:Lcom/ui/wifiman/model/vendor/d$d;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/vendor/d$d;->asVendor()Lcom/ui/wifiman/model/vendor/d$c;

    move-result-object v0

    sput-object v0, LCc/b$d$a;->c:Lcom/ui/wifiman/model/vendor/d$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LCc/b$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    invoke-virtual {p0}, LCc/b$d$a;->c()Lcom/ui/wifiman/model/vendor/d$c;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/ui/wifiman/model/vendor/d$c;
    .locals 1

    sget-object v0, LCc/b$d$a;->c:Lcom/ui/wifiman/model/vendor/d$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LCc/b$d$a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x22e13971

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "XBOX"

    return-object v0
.end method
