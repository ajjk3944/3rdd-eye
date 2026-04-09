.class public final enum Lzh/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzh/c$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lzh/c;

.field public static final Companion:Lzh/c$a;

.field public static final enum Function:Lzh/c;

.field public static final enum KFunction:Lzh/c;

.field public static final enum KSuspendFunction:Lzh/c;

.field public static final enum SuspendFunction:Lzh/c;

.field public static final enum UNKNOWN:Lzh/c;


# direct methods
.method private static final synthetic $values()[Lzh/c;
    .locals 5

    sget-object v0, Lzh/c;->Function:Lzh/c;

    sget-object v1, Lzh/c;->SuspendFunction:Lzh/c;

    sget-object v2, Lzh/c;->KFunction:Lzh/c;

    sget-object v3, Lzh/c;->KSuspendFunction:Lzh/c;

    sget-object v4, Lzh/c;->UNKNOWN:Lzh/c;

    filled-new-array {v0, v1, v2, v3, v4}, [Lzh/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzh/c;

    const-string v1, "Function"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzh/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzh/c;->Function:Lzh/c;

    new-instance v0, Lzh/c;

    const-string v1, "SuspendFunction"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lzh/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzh/c;->SuspendFunction:Lzh/c;

    new-instance v0, Lzh/c;

    const-string v1, "KFunction"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lzh/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzh/c;->KFunction:Lzh/c;

    new-instance v0, Lzh/c;

    const-string v1, "KSuspendFunction"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lzh/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzh/c;->KSuspendFunction:Lzh/c;

    new-instance v0, Lzh/c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lzh/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzh/c;->UNKNOWN:Lzh/c;

    invoke-static {}, Lzh/c;->$values()[Lzh/c;

    move-result-object v0

    sput-object v0, Lzh/c;->$VALUES:[Lzh/c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lzh/c;->$ENTRIES:Lfh/a;

    new-instance v0, Lzh/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzh/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzh/c;->Companion:Lzh/c$a;

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

.method public static valueOf(Ljava/lang/String;)Lzh/c;
    .locals 1

    const-class v0, Lzh/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzh/c;

    return-object p0
.end method

.method public static values()[Lzh/c;
    .locals 1

    sget-object v0, Lzh/c;->$VALUES:[Lzh/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzh/c;

    return-object v0
.end method
