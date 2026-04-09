.class public final enum LG6/N$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LG6/N$b;

.field public static final enum CONNECTED:LG6/N$b;

.field public static final enum CONNECTING:LG6/N$b;

.field public static final enum DISCONNECTED:LG6/N$b;

.field public static final enum DISCONNECTING:LG6/N$b;


# instance fields
.field private final description:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LG6/N$b;

    const-string v1, "CONNECTING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, LG6/N$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LG6/N$b;->CONNECTING:LG6/N$b;

    new-instance v1, LG6/N$b;

    const-string v2, "CONNECTED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, LG6/N$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LG6/N$b;->CONNECTED:LG6/N$b;

    new-instance v2, LG6/N$b;

    const-string v3, "DISCONNECTED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v3}, LG6/N$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LG6/N$b;->DISCONNECTED:LG6/N$b;

    new-instance v3, LG6/N$b;

    const-string v4, "DISCONNECTING"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v4}, LG6/N$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, LG6/N$b;->DISCONNECTING:LG6/N$b;

    filled-new-array {v0, v1, v2, v3}, [LG6/N$b;

    move-result-object v0

    sput-object v0, LG6/N$b;->$VALUES:[LG6/N$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LG6/N$b;->description:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LG6/N$b;
    .locals 1

    const-class v0, LG6/N$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LG6/N$b;

    return-object p0
.end method

.method public static values()[LG6/N$b;
    .locals 1

    sget-object v0, LG6/N$b;->$VALUES:[LG6/N$b;

    invoke-virtual {v0}, [LG6/N$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LG6/N$b;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "RxBleConnectionState{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LG6/N$b;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
