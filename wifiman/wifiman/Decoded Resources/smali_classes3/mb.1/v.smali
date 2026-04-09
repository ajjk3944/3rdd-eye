.class public final enum Lmb/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
    with = Lmb/v$b;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmb/v$a;,
        Lmb/v$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmb/v;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lmb/v;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "b",
        "a",
        "ENABLED",
        "DISABLED",
        "UNSUPPORTED",
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

.field private static final synthetic $VALUES:[Lmb/v;

.field public static final Companion:Lmb/v$a;

.field public static final enum DISABLED:Lmb/v;
    .annotation runtime LVi/m;
        value = "DISABLED"
    .end annotation
.end field

.field public static final enum ENABLED:Lmb/v;
    .annotation runtime LVi/m;
        value = "ENABLED"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lmb/v;
    .annotation runtime LVi/m;
        value = "UNKNOWN"
    .end annotation
.end field

.field public static final enum UNSUPPORTED:Lmb/v;
    .annotation runtime LVi/m;
        value = "UNSUPPORTED"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lmb/v;
    .locals 4

    sget-object v0, Lmb/v;->ENABLED:Lmb/v;

    sget-object v1, Lmb/v;->DISABLED:Lmb/v;

    sget-object v2, Lmb/v;->UNSUPPORTED:Lmb/v;

    sget-object v3, Lmb/v;->UNKNOWN:Lmb/v;

    filled-new-array {v0, v1, v2, v3}, [Lmb/v;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmb/v;

    const-string/jumbo v1, "ENABLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmb/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/v;->ENABLED:Lmb/v;

    new-instance v0, Lmb/v;

    const-string v1, "DISABLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lmb/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/v;->DISABLED:Lmb/v;

    new-instance v0, Lmb/v;

    const-string/jumbo v1, "UNSUPPORTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lmb/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/v;->UNSUPPORTED:Lmb/v;

    new-instance v0, Lmb/v;

    const-string/jumbo v1, "UNKNOWN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lmb/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmb/v;->UNKNOWN:Lmb/v;

    invoke-static {}, Lmb/v;->$values()[Lmb/v;

    move-result-object v0

    sput-object v0, Lmb/v;->$VALUES:[Lmb/v;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lmb/v;->$ENTRIES:Lfh/a;

    new-instance v0, Lmb/v$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmb/v$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmb/v;->Companion:Lmb/v$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Lmb/v;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmb/v;
    .locals 1

    const-class v0, Lmb/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmb/v;

    return-object p0
.end method

.method public static values()[Lmb/v;
    .locals 1

    sget-object v0, Lmb/v;->$VALUES:[Lmb/v;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmb/v;

    return-object v0
.end method
