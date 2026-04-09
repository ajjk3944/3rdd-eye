.class public final enum LEb/w$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
    with = LEb/w$f$b;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEb/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEb/w$f$a;,
        LEb/w$f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LEb/w$f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "LEb/w$f;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "b",
        "a",
        "Active",
        "Backup",
        "Unknown",
        "SSO_release"
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

.field private static final synthetic $VALUES:[LEb/w$f;

.field public static final enum Active:LEb/w$f;
    .annotation runtime LVi/m;
        value = "active"
    .end annotation
.end field

.field public static final enum Backup:LEb/w$f;
    .annotation runtime LVi/m;
        value = "backup"
    .end annotation
.end field

.field public static final Companion:LEb/w$f$a;

.field public static final enum Unknown:LEb/w$f;
    .annotation runtime LVi/m;
        value = "unknown"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[LEb/w$f;
    .locals 3

    sget-object v0, LEb/w$f;->Active:LEb/w$f;

    sget-object v1, LEb/w$f;->Backup:LEb/w$f;

    sget-object v2, LEb/w$f;->Unknown:LEb/w$f;

    filled-new-array {v0, v1, v2}, [LEb/w$f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LEb/w$f;

    const-string v1, "Active"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LEb/w$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEb/w$f;->Active:LEb/w$f;

    new-instance v0, LEb/w$f;

    const-string v1, "Backup"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LEb/w$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEb/w$f;->Backup:LEb/w$f;

    new-instance v0, LEb/w$f;

    const-string/jumbo v1, "Unknown"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LEb/w$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEb/w$f;->Unknown:LEb/w$f;

    invoke-static {}, LEb/w$f;->$values()[LEb/w$f;

    move-result-object v0

    sput-object v0, LEb/w$f;->$VALUES:[LEb/w$f;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LEb/w$f;->$ENTRIES:Lfh/a;

    new-instance v0, LEb/w$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LEb/w$f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LEb/w$f;->Companion:LEb/w$f$a;

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

    sget-object v0, LEb/w$f;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LEb/w$f;
    .locals 1

    const-class v0, LEb/w$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LEb/w$f;

    return-object p0
.end method

.method public static values()[LEb/w$f;
    .locals 1

    sget-object v0, LEb/w$f;->$VALUES:[LEb/w$f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LEb/w$f;

    return-object v0
.end method
