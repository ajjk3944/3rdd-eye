.class public final enum LV6/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LV6/p;

.field public static final enum BITMAP:LV6/p;

.field public static final enum DRAWABLE:LV6/p;

.field public static final enum GIF:LV6/p;


# direct methods
.method private static final synthetic $values()[LV6/p;
    .locals 3

    sget-object v0, LV6/p;->DRAWABLE:LV6/p;

    sget-object v1, LV6/p;->BITMAP:LV6/p;

    sget-object v2, LV6/p;->GIF:LV6/p;

    filled-new-array {v0, v1, v2}, [LV6/p;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LV6/p;

    const-string v1, "DRAWABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LV6/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV6/p;->DRAWABLE:LV6/p;

    new-instance v0, LV6/p;

    const-string v1, "BITMAP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LV6/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV6/p;->BITMAP:LV6/p;

    new-instance v0, LV6/p;

    const-string/jumbo v1, "GIF"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LV6/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV6/p;->GIF:LV6/p;

    invoke-static {}, LV6/p;->$values()[LV6/p;

    move-result-object v0

    sput-object v0, LV6/p;->$VALUES:[LV6/p;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LV6/p;->$ENTRIES:Lfh/a;

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

    sget-object v0, LV6/p;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LV6/p;
    .locals 1

    const-class v0, LV6/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LV6/p;

    return-object p0
.end method

.method public static values()[LV6/p;
    .locals 1

    sget-object v0, LV6/p;->$VALUES:[LV6/p;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LV6/p;

    return-object v0
.end method
