.class public final enum Lmb/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
    with = Lmb/i$b;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmb/i$a;,
        Lmb/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmb/i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lmb/i;",
        "",
        "",
        "ongoing",
        "<init>",
        "(Ljava/lang/String;IZ)V",
        "Z",
        "getOngoing",
        "()Z",
        "Companion",
        "b",
        "a",
        "ACTIVE",
        "INACTIVE",
        "ACTIVATING",
        "DEACTIVATING",
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

.field private static final synthetic $VALUES:[Lmb/i;

.field public static final enum ACTIVATING:Lmb/i;
    .annotation runtime LVi/m;
        value = "activating"
    .end annotation
.end field

.field public static final enum ACTIVE:Lmb/i;
    .annotation runtime LVi/m;
        value = "active"
    .end annotation
.end field

.field public static final Companion:Lmb/i$a;

.field public static final enum DEACTIVATING:Lmb/i;
    .annotation runtime LVi/m;
        value = "deactivating"
    .end annotation
.end field

.field public static final enum INACTIVE:Lmb/i;
    .annotation runtime LVi/m;
        value = "inactive"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lmb/i;
    .annotation runtime LVi/m;
        value = "unknown"
    .end annotation
.end field


# instance fields
.field private final ongoing:Z


# direct methods
.method private static final synthetic $values()[Lmb/i;
    .locals 5

    sget-object v0, Lmb/i;->ACTIVE:Lmb/i;

    sget-object v1, Lmb/i;->INACTIVE:Lmb/i;

    sget-object v2, Lmb/i;->ACTIVATING:Lmb/i;

    sget-object v3, Lmb/i;->DEACTIVATING:Lmb/i;

    sget-object v4, Lmb/i;->UNKNOWN:Lmb/i;

    filled-new-array {v0, v1, v2, v3, v4}, [Lmb/i;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lmb/i;

    const-string v1, "ACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lmb/i;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lmb/i;->ACTIVE:Lmb/i;

    new-instance v0, Lmb/i;

    const-string/jumbo v1, "INACTIVE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lmb/i;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lmb/i;->INACTIVE:Lmb/i;

    new-instance v0, Lmb/i;

    const-string v1, "ACTIVATING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v3}, Lmb/i;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lmb/i;->ACTIVATING:Lmb/i;

    new-instance v0, Lmb/i;

    const-string v1, "DEACTIVATING"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v3}, Lmb/i;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lmb/i;->DEACTIVATING:Lmb/i;

    new-instance v0, Lmb/i;

    const-string/jumbo v1, "UNKNOWN"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, Lmb/i;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lmb/i;->UNKNOWN:Lmb/i;

    invoke-static {}, Lmb/i;->$values()[Lmb/i;

    move-result-object v0

    sput-object v0, Lmb/i;->$VALUES:[Lmb/i;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lmb/i;->$ENTRIES:Lfh/a;

    new-instance v0, Lmb/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmb/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmb/i;->Companion:Lmb/i$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lmb/i;->ongoing:Z

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

    sget-object v0, Lmb/i;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmb/i;
    .locals 1

    const-class v0, Lmb/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmb/i;

    return-object p0
.end method

.method public static values()[Lmb/i;
    .locals 1

    sget-object v0, Lmb/i;->$VALUES:[Lmb/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmb/i;

    return-object v0
.end method


# virtual methods
.method public final getOngoing()Z
    .locals 1

    iget-boolean v0, p0, Lmb/i;->ongoing:Z

    return v0
.end method
