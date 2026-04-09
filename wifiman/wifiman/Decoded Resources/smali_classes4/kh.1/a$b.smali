.class public final enum Lkh/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lkh/a$b;

.field public static final enum ABSENT:Lkh/a$b;

.field public static final enum ABSENT_OPTIONAL:Lkh/a$b;

.field public static final enum PRESENT:Lkh/a$b;

.field public static final enum PRESENT_OPTIONAL:Lkh/a$b;


# direct methods
.method private static final synthetic $values()[Lkh/a$b;
    .locals 4

    sget-object v0, Lkh/a$b;->PRESENT:Lkh/a$b;

    sget-object v1, Lkh/a$b;->ABSENT:Lkh/a$b;

    sget-object v2, Lkh/a$b;->PRESENT_OPTIONAL:Lkh/a$b;

    sget-object v3, Lkh/a$b;->ABSENT_OPTIONAL:Lkh/a$b;

    filled-new-array {v0, v1, v2, v3}, [Lkh/a$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkh/a$b;

    const-string v1, "PRESENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkh/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkh/a$b;->PRESENT:Lkh/a$b;

    new-instance v0, Lkh/a$b;

    const-string v1, "ABSENT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkh/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkh/a$b;->ABSENT:Lkh/a$b;

    new-instance v0, Lkh/a$b;

    const-string v1, "PRESENT_OPTIONAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkh/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkh/a$b;->PRESENT_OPTIONAL:Lkh/a$b;

    new-instance v0, Lkh/a$b;

    const-string v1, "ABSENT_OPTIONAL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lkh/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkh/a$b;->ABSENT_OPTIONAL:Lkh/a$b;

    invoke-static {}, Lkh/a$b;->$values()[Lkh/a$b;

    move-result-object v0

    sput-object v0, Lkh/a$b;->$VALUES:[Lkh/a$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lkh/a$b;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lkh/a$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkh/a$b;
    .locals 1

    const-class v0, Lkh/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkh/a$b;

    return-object p0
.end method

.method public static values()[Lkh/a$b;
    .locals 1

    sget-object v0, Lkh/a$b;->$VALUES:[Lkh/a$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkh/a$b;

    return-object v0
.end method
