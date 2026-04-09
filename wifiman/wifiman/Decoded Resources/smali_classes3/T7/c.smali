.class public final enum LT7/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT7/c$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LT7/c;

.field public static final Companion:LT7/c$a;

.field public static final enum IMPERIAL:LT7/c;

.field public static final enum METRIC:LT7/c;


# direct methods
.method private static final synthetic $values()[LT7/c;
    .locals 2

    sget-object v0, LT7/c;->METRIC:LT7/c;

    sget-object v1, LT7/c;->IMPERIAL:LT7/c;

    filled-new-array {v0, v1}, [LT7/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LT7/c;

    const-string/jumbo v1, "METRIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LT7/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT7/c;->METRIC:LT7/c;

    new-instance v0, LT7/c;

    const-string/jumbo v1, "IMPERIAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LT7/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT7/c;->IMPERIAL:LT7/c;

    invoke-static {}, LT7/c;->$values()[LT7/c;

    move-result-object v0

    sput-object v0, LT7/c;->$VALUES:[LT7/c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LT7/c;->$ENTRIES:Lfh/a;

    new-instance v0, LT7/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT7/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LT7/c;->Companion:LT7/c$a;

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

    sget-object v0, LT7/c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LT7/c;
    .locals 1

    const-class v0, LT7/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LT7/c;

    return-object p0
.end method

.method public static values()[LT7/c;
    .locals 1

    sget-object v0, LT7/c;->$VALUES:[LT7/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LT7/c;

    return-object v0
.end method
