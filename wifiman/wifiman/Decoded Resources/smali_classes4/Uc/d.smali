.class public final enum LUc/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LUc/d;

.field public static final enum ID:LUc/d;

.field public static final enum TYPE:LUc/d;


# instance fields
.field private final keys:[Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LUc/d;
    .locals 2

    sget-object v0, LUc/d;->TYPE:LUc/d;

    sget-object v1, LUc/d;->ID:LUc/d;

    filled-new-array {v0, v1}, [LUc/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LUc/d;

    const-string v1, "serviceType"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "TYPE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LUc/d;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/d;->TYPE:LUc/d;

    new-instance v0, LUc/d;

    const-string v1, "serviceId"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "ID"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, LUc/d;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, LUc/d;->ID:LUc/d;

    invoke-static {}, LUc/d;->$values()[LUc/d;

    move-result-object v0

    sput-object v0, LUc/d;->$VALUES:[LUc/d;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LUc/d;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LUc/d;->keys:[Ljava/lang/String;

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

    sget-object v0, LUc/d;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LUc/d;
    .locals 1

    const-class v0, LUc/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUc/d;

    return-object p0
.end method

.method public static values()[LUc/d;
    .locals 1

    sget-object v0, LUc/d;->$VALUES:[LUc/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUc/d;

    return-object v0
.end method


# virtual methods
.method public final getKeys()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUc/d;->keys:[Ljava/lang/String;

    return-object v0
.end method
