.class final enum Lcom/ui/wifiman/model/network/hosts/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/network/hosts/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/network/hosts/a$c;

.field public static final enum FACEBOOK:Lcom/ui/wifiman/model/network/hosts/a$c;

.field public static final enum GATEWAY:Lcom/ui/wifiman/model/network/hosts/a$c;

.field public static final enum GOOGLE:Lcom/ui/wifiman/model/network/hosts/a$c;

.field public static final enum TWITTER:Lcom/ui/wifiman/model/network/hosts/a$c;


# instance fields
.field private final host:Ljava/lang/String;

.field private final position:I


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/network/hosts/a$c;
    .locals 4

    sget-object v0, Lcom/ui/wifiman/model/network/hosts/a$c;->GATEWAY:Lcom/ui/wifiman/model/network/hosts/a$c;

    sget-object v1, Lcom/ui/wifiman/model/network/hosts/a$c;->GOOGLE:Lcom/ui/wifiman/model/network/hosts/a$c;

    sget-object v2, Lcom/ui/wifiman/model/network/hosts/a$c;->FACEBOOK:Lcom/ui/wifiman/model/network/hosts/a$c;

    sget-object v3, Lcom/ui/wifiman/model/network/hosts/a$c;->TWITTER:Lcom/ui/wifiman/model/network/hosts/a$c;

    filled-new-array {v0, v1, v2, v3}, [Lcom/ui/wifiman/model/network/hosts/a$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/ui/wifiman/model/network/hosts/a$c;

    const-string v1, "GATEWAY"

    const/4 v2, 0x0

    const-string v3, "gateway"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ui/wifiman/model/network/hosts/a$c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/network/hosts/a$c;->GATEWAY:Lcom/ui/wifiman/model/network/hosts/a$c;

    new-instance v0, Lcom/ui/wifiman/model/network/hosts/a$c;

    const-string v1, "google.com"

    const-string v3, "GOOGLE"

    const/4 v5, 0x1

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/ui/wifiman/model/network/hosts/a$c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/network/hosts/a$c;->GOOGLE:Lcom/ui/wifiman/model/network/hosts/a$c;

    new-instance v0, Lcom/ui/wifiman/model/network/hosts/a$c;

    const-string v1, "facebook.com"

    const-string v2, "FACEBOOK"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/ui/wifiman/model/network/hosts/a$c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/network/hosts/a$c;->FACEBOOK:Lcom/ui/wifiman/model/network/hosts/a$c;

    new-instance v0, Lcom/ui/wifiman/model/network/hosts/a$c;

    const-string v1, "TWITTER"

    const-string v2, "x.com"

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/ui/wifiman/model/network/hosts/a$c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/network/hosts/a$c;->TWITTER:Lcom/ui/wifiman/model/network/hosts/a$c;

    invoke-static {}, Lcom/ui/wifiman/model/network/hosts/a$c;->$values()[Lcom/ui/wifiman/model/network/hosts/a$c;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/network/hosts/a$c;->$VALUES:[Lcom/ui/wifiman/model/network/hosts/a$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/network/hosts/a$c;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/ui/wifiman/model/network/hosts/a$c;->host:Ljava/lang/String;

    iput p4, p0, Lcom/ui/wifiman/model/network/hosts/a$c;->position:I

    return-void
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lcom/ui/wifiman/model/network/hosts/a$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/network/hosts/a$c;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/network/hosts/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/network/hosts/a$c;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/network/hosts/a$c;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/network/hosts/a$c;->$VALUES:[Lcom/ui/wifiman/model/network/hosts/a$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/network/hosts/a$c;

    return-object v0
.end method


# virtual methods
.method public final getHost()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/a$c;->host:Ljava/lang/String;

    return-object v0
.end method

.method public final getPosition()I
    .locals 1

    iget v0, p0, Lcom/ui/wifiman/model/network/hosts/a$c;->position:I

    return v0
.end method
