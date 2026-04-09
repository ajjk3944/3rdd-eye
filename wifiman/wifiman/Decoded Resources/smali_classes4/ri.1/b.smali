.class public final enum Lri/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lri/b;

.field public static final enum FOR_INCORPORATION:Lri/b;

.field public static final enum FOR_SUBTYPING:Lri/b;

.field public static final enum FROM_EXPRESSION:Lri/b;


# direct methods
.method private static final synthetic $values()[Lri/b;
    .locals 3

    sget-object v0, Lri/b;->FOR_SUBTYPING:Lri/b;

    sget-object v1, Lri/b;->FOR_INCORPORATION:Lri/b;

    sget-object v2, Lri/b;->FROM_EXPRESSION:Lri/b;

    filled-new-array {v0, v1, v2}, [Lri/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lri/b;

    const-string v1, "FOR_SUBTYPING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lri/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lri/b;->FOR_SUBTYPING:Lri/b;

    new-instance v0, Lri/b;

    const-string v1, "FOR_INCORPORATION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lri/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lri/b;->FOR_INCORPORATION:Lri/b;

    new-instance v0, Lri/b;

    const-string v1, "FROM_EXPRESSION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lri/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lri/b;->FROM_EXPRESSION:Lri/b;

    invoke-static {}, Lri/b;->$values()[Lri/b;

    move-result-object v0

    sput-object v0, Lri/b;->$VALUES:[Lri/b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lri/b;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)Lri/b;
    .locals 1

    const-class v0, Lri/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lri/b;

    return-object p0
.end method

.method public static values()[Lri/b;
    .locals 1

    sget-object v0, Lri/b;->$VALUES:[Lri/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lri/b;

    return-object v0
.end method
