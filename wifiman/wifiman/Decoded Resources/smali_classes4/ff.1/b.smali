.class public final enum Lff/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lff/b;

.field public static final enum INTERNAL:Lff/b;

.field public static final enum SERVER_UNREACHABLE:Lff/b;

.field public static final enum UNEXPECTED:Lff/b;


# direct methods
.method private static final synthetic $values()[Lff/b;
    .locals 3

    sget-object v0, Lff/b;->INTERNAL:Lff/b;

    sget-object v1, Lff/b;->SERVER_UNREACHABLE:Lff/b;

    sget-object v2, Lff/b;->UNEXPECTED:Lff/b;

    filled-new-array {v0, v1, v2}, [Lff/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lff/b;

    const-string v1, "INTERNAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lff/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/b;->INTERNAL:Lff/b;

    new-instance v0, Lff/b;

    const-string v1, "SERVER_UNREACHABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lff/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/b;->SERVER_UNREACHABLE:Lff/b;

    new-instance v0, Lff/b;

    const-string v1, "UNEXPECTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lff/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/b;->UNEXPECTED:Lff/b;

    invoke-static {}, Lff/b;->$values()[Lff/b;

    move-result-object v0

    sput-object v0, Lff/b;->$VALUES:[Lff/b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lff/b;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lff/b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lff/b;
    .locals 1

    const-class v0, Lff/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lff/b;

    return-object p0
.end method

.method public static values()[Lff/b;
    .locals 1

    sget-object v0, Lff/b;->$VALUES:[Lff/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lff/b;

    return-object v0
.end method
