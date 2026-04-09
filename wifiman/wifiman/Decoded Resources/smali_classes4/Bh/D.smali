.class public final enum LBh/D;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBh/D$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LBh/D;

.field public static final enum ABSTRACT:LBh/D;

.field public static final Companion:LBh/D$a;

.field public static final enum FINAL:LBh/D;

.field public static final enum OPEN:LBh/D;

.field public static final enum SEALED:LBh/D;


# direct methods
.method private static final synthetic $values()[LBh/D;
    .locals 4

    sget-object v0, LBh/D;->FINAL:LBh/D;

    sget-object v1, LBh/D;->SEALED:LBh/D;

    sget-object v2, LBh/D;->OPEN:LBh/D;

    sget-object v3, LBh/D;->ABSTRACT:LBh/D;

    filled-new-array {v0, v1, v2, v3}, [LBh/D;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LBh/D;

    const-string v1, "FINAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LBh/D;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBh/D;->FINAL:LBh/D;

    new-instance v0, LBh/D;

    const-string v1, "SEALED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LBh/D;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBh/D;->SEALED:LBh/D;

    new-instance v0, LBh/D;

    const-string v1, "OPEN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LBh/D;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBh/D;->OPEN:LBh/D;

    new-instance v0, LBh/D;

    const-string v1, "ABSTRACT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LBh/D;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBh/D;->ABSTRACT:LBh/D;

    invoke-static {}, LBh/D;->$values()[LBh/D;

    move-result-object v0

    sput-object v0, LBh/D;->$VALUES:[LBh/D;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LBh/D;->$ENTRIES:Lfh/a;

    new-instance v0, LBh/D$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LBh/D$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LBh/D;->Companion:LBh/D$a;

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

.method public static valueOf(Ljava/lang/String;)LBh/D;
    .locals 1

    const-class v0, LBh/D;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LBh/D;

    return-object p0
.end method

.method public static values()[LBh/D;
    .locals 1

    sget-object v0, LBh/D;->$VALUES:[LBh/D;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LBh/D;

    return-object v0
.end method
