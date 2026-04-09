.class public final enum LJh/O;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJh/O$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LJh/O;

.field public static final Companion:LJh/O$a;

.field public static final enum IGNORE:LJh/O;

.field public static final enum STRICT:LJh/O;

.field public static final enum WARN:LJh/O;


# instance fields
.field private final description:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LJh/O;
    .locals 3

    sget-object v0, LJh/O;->IGNORE:LJh/O;

    sget-object v1, LJh/O;->WARN:LJh/O;

    sget-object v2, LJh/O;->STRICT:LJh/O;

    filled-new-array {v0, v1, v2}, [LJh/O;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LJh/O;

    const/4 v1, 0x0

    const-string v2, "ignore"

    const-string v3, "IGNORE"

    invoke-direct {v0, v3, v1, v2}, LJh/O;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LJh/O;->IGNORE:LJh/O;

    new-instance v0, LJh/O;

    const/4 v1, 0x1

    const-string v2, "warn"

    const-string v3, "WARN"

    invoke-direct {v0, v3, v1, v2}, LJh/O;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LJh/O;->WARN:LJh/O;

    new-instance v0, LJh/O;

    const/4 v1, 0x2

    const-string v2, "strict"

    const-string v3, "STRICT"

    invoke-direct {v0, v3, v1, v2}, LJh/O;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LJh/O;->STRICT:LJh/O;

    invoke-static {}, LJh/O;->$values()[LJh/O;

    move-result-object v0

    sput-object v0, LJh/O;->$VALUES:[LJh/O;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LJh/O;->$ENTRIES:Lfh/a;

    new-instance v0, LJh/O$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJh/O$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJh/O;->Companion:LJh/O$a;

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

    iput-object p3, p0, LJh/O;->description:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LJh/O;
    .locals 1

    const-class v0, LJh/O;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LJh/O;

    return-object p0
.end method

.method public static values()[LJh/O;
    .locals 1

    sget-object v0, LJh/O;->$VALUES:[LJh/O;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LJh/O;

    return-object v0
.end method


# virtual methods
.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LJh/O;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final isIgnore()Z
    .locals 1

    sget-object v0, LJh/O;->IGNORE:LJh/O;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isWarning()Z
    .locals 1

    sget-object v0, LJh/O;->WARN:LJh/O;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
