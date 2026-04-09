.class public final enum Lkb/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lkb/o;

.field public static final enum COMMAND:Lkb/o;

.field public static final enum DELETE:Lkb/o;

.field public static final enum GET:Lkb/o;

.field public static final enum PATCH:Lkb/o;

.field public static final enum POST:Lkb/o;

.field public static final enum PUT:Lkb/o;


# direct methods
.method private static final synthetic $values()[Lkb/o;
    .locals 6

    sget-object v0, Lkb/o;->GET:Lkb/o;

    sget-object v1, Lkb/o;->POST:Lkb/o;

    sget-object v2, Lkb/o;->PATCH:Lkb/o;

    sget-object v3, Lkb/o;->PUT:Lkb/o;

    sget-object v4, Lkb/o;->DELETE:Lkb/o;

    sget-object v5, Lkb/o;->COMMAND:Lkb/o;

    filled-new-array/range {v0 .. v5}, [Lkb/o;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkb/o;

    const-string/jumbo v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkb/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkb/o;->GET:Lkb/o;

    new-instance v0, Lkb/o;

    const-string/jumbo v1, "POST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkb/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkb/o;->POST:Lkb/o;

    new-instance v0, Lkb/o;

    const-string/jumbo v1, "PATCH"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkb/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkb/o;->PATCH:Lkb/o;

    new-instance v0, Lkb/o;

    const-string/jumbo v1, "PUT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lkb/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkb/o;->PUT:Lkb/o;

    new-instance v0, Lkb/o;

    const-string v1, "DELETE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lkb/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkb/o;->DELETE:Lkb/o;

    new-instance v0, Lkb/o;

    const-string v1, "COMMAND"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lkb/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkb/o;->COMMAND:Lkb/o;

    invoke-static {}, Lkb/o;->$values()[Lkb/o;

    move-result-object v0

    sput-object v0, Lkb/o;->$VALUES:[Lkb/o;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lkb/o;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lkb/o;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkb/o;
    .locals 1

    const-class v0, Lkb/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkb/o;

    return-object p0
.end method

.method public static values()[Lkb/o;
    .locals 1

    sget-object v0, Lkb/o;->$VALUES:[Lkb/o;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkb/o;

    return-object v0
.end method
