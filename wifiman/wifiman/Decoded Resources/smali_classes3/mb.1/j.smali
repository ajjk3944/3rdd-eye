.class public final enum Lmb/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
    with = Lmb/j$b;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmb/j$a;,
        Lmb/j$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmb/j;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0014\u0008\u0087\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lmb/j;",
        "",
        "",
        "controllerName",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getControllerName",
        "()Ljava/lang/String;",
        "Companion",
        "b",
        "a",
        "PROTECT",
        "NETWORK",
        "ACCESS",
        "TALK",
        "LED",
        "CONNECT",
        "APOLLO",
        "USERS",
        "SETTINGS",
        "UNKNOWN",
        "unificore_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lmb/j;

.field public static final enum ACCESS:Lmb/j;
    .annotation runtime LVi/m;
        value = "access"
    .end annotation
.end field

.field public static final enum APOLLO:Lmb/j;
    .annotation runtime LVi/m;
        value = "apollo"
    .end annotation
.end field

.field public static final enum CONNECT:Lmb/j;
    .annotation runtime LVi/m;
        value = "connect"
    .end annotation
.end field

.field public static final Companion:Lmb/j$a;

.field public static final enum LED:Lmb/j;
    .annotation runtime LVi/m;
        value = "led"
    .end annotation
.end field

.field public static final enum NETWORK:Lmb/j;
    .annotation runtime LVi/m;
        value = "network"
    .end annotation
.end field

.field public static final enum PROTECT:Lmb/j;
    .annotation runtime LVi/m;
        value = "protect"
    .end annotation
.end field

.field public static final enum SETTINGS:Lmb/j;
    .annotation runtime LVi/m;
        value = "settings"
    .end annotation
.end field

.field public static final enum TALK:Lmb/j;
    .annotation runtime LVi/m;
        value = "talk"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lmb/j;
    .annotation runtime LVi/m;
        value = "unknown"
    .end annotation
.end field

.field public static final enum USERS:Lmb/j;
    .annotation runtime LVi/m;
        value = "users"
    .end annotation
.end field


# instance fields
.field private final controllerName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lmb/j;
    .locals 10

    sget-object v0, Lmb/j;->PROTECT:Lmb/j;

    sget-object v1, Lmb/j;->NETWORK:Lmb/j;

    sget-object v2, Lmb/j;->ACCESS:Lmb/j;

    sget-object v3, Lmb/j;->TALK:Lmb/j;

    sget-object v4, Lmb/j;->LED:Lmb/j;

    sget-object v5, Lmb/j;->CONNECT:Lmb/j;

    sget-object v6, Lmb/j;->APOLLO:Lmb/j;

    sget-object v7, Lmb/j;->USERS:Lmb/j;

    sget-object v8, Lmb/j;->SETTINGS:Lmb/j;

    sget-object v9, Lmb/j;->UNKNOWN:Lmb/j;

    filled-new-array/range {v0 .. v9}, [Lmb/j;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmb/j;

    const/4 v1, 0x0

    const-string/jumbo v2, "protect"

    const-string/jumbo v3, "PROTECT"

    invoke-direct {v0, v3, v1, v2}, Lmb/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/j;->PROTECT:Lmb/j;

    new-instance v0, Lmb/j;

    const/4 v1, 0x1

    const-string/jumbo v2, "network"

    const-string/jumbo v3, "NETWORK"

    invoke-direct {v0, v3, v1, v2}, Lmb/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/j;->NETWORK:Lmb/j;

    new-instance v0, Lmb/j;

    const/4 v1, 0x2

    const-string/jumbo v2, "access"

    const-string v3, "ACCESS"

    invoke-direct {v0, v3, v1, v2}, Lmb/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/j;->ACCESS:Lmb/j;

    new-instance v0, Lmb/j;

    const/4 v1, 0x3

    const-string/jumbo v2, "talk"

    const-string/jumbo v3, "TALK"

    invoke-direct {v0, v3, v1, v2}, Lmb/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/j;->TALK:Lmb/j;

    new-instance v0, Lmb/j;

    const/4 v1, 0x4

    const-string/jumbo v2, "led"

    const-string/jumbo v3, "LED"

    invoke-direct {v0, v3, v1, v2}, Lmb/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/j;->LED:Lmb/j;

    new-instance v0, Lmb/j;

    const/4 v1, 0x5

    const-string/jumbo v2, "connect"

    const-string v3, "CONNECT"

    invoke-direct {v0, v3, v1, v2}, Lmb/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/j;->CONNECT:Lmb/j;

    new-instance v0, Lmb/j;

    const/4 v1, 0x6

    const-string/jumbo v2, "apollo"

    const-string v3, "APOLLO"

    invoke-direct {v0, v3, v1, v2}, Lmb/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/j;->APOLLO:Lmb/j;

    new-instance v0, Lmb/j;

    const/4 v1, 0x7

    const-string/jumbo v2, "users"

    const-string/jumbo v3, "USERS"

    invoke-direct {v0, v3, v1, v2}, Lmb/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/j;->USERS:Lmb/j;

    new-instance v0, Lmb/j;

    const/16 v1, 0x8

    const-string/jumbo v2, "settings"

    const-string/jumbo v3, "SETTINGS"

    invoke-direct {v0, v3, v1, v2}, Lmb/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/j;->SETTINGS:Lmb/j;

    new-instance v0, Lmb/j;

    const/16 v1, 0x9

    const-string/jumbo v2, "unknown"

    const-string/jumbo v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lmb/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/j;->UNKNOWN:Lmb/j;

    invoke-static {}, Lmb/j;->$values()[Lmb/j;

    move-result-object v0

    sput-object v0, Lmb/j;->$VALUES:[Lmb/j;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lmb/j;->$ENTRIES:Lfh/a;

    new-instance v0, Lmb/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmb/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmb/j;->Companion:Lmb/j$a;

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

    iput-object p3, p0, Lmb/j;->controllerName:Ljava/lang/String;

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

    sget-object v0, Lmb/j;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmb/j;
    .locals 1

    const-class v0, Lmb/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmb/j;

    return-object p0
.end method

.method public static values()[Lmb/j;
    .locals 1

    sget-object v0, Lmb/j;->$VALUES:[Lmb/j;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmb/j;

    return-object v0
.end method


# virtual methods
.method public final getControllerName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmb/j;->controllerName:Ljava/lang/String;

    return-object v0
.end method
