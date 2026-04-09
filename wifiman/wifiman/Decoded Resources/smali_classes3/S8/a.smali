.class public final enum LS8/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LS8/a;

.field public static final enum A:LS8/a;

.field public static final enum AC:LS8/a;

.field public static final enum AD:LS8/a;

.field public static final enum AX:LS8/a;

.field public static final enum B:LS8/a;

.field public static final enum BE:LS8/a;

.field public static final enum G:LS8/a;

.field public static final enum N:LS8/a;


# direct methods
.method private static final synthetic $values()[LS8/a;
    .locals 8

    sget-object v0, LS8/a;->A:LS8/a;

    sget-object v1, LS8/a;->B:LS8/a;

    sget-object v2, LS8/a;->G:LS8/a;

    sget-object v3, LS8/a;->N:LS8/a;

    sget-object v4, LS8/a;->AC:LS8/a;

    sget-object v5, LS8/a;->AD:LS8/a;

    sget-object v6, LS8/a;->AX:LS8/a;

    sget-object v7, LS8/a;->BE:LS8/a;

    filled-new-array/range {v0 .. v7}, [LS8/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS8/a;

    const-string v1, "A"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LS8/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS8/a;->A:LS8/a;

    new-instance v0, LS8/a;

    const-string v1, "B"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LS8/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS8/a;->B:LS8/a;

    new-instance v0, LS8/a;

    const-string/jumbo v1, "G"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LS8/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS8/a;->G:LS8/a;

    new-instance v0, LS8/a;

    const-string/jumbo v1, "N"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LS8/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS8/a;->N:LS8/a;

    new-instance v0, LS8/a;

    const-string v1, "AC"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LS8/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS8/a;->AC:LS8/a;

    new-instance v0, LS8/a;

    const-string v1, "AD"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LS8/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS8/a;->AD:LS8/a;

    new-instance v0, LS8/a;

    const-string v1, "AX"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LS8/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS8/a;->AX:LS8/a;

    new-instance v0, LS8/a;

    const-string v1, "BE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LS8/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS8/a;->BE:LS8/a;

    invoke-static {}, LS8/a;->$values()[LS8/a;

    move-result-object v0

    sput-object v0, LS8/a;->$VALUES:[LS8/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LS8/a;->$ENTRIES:Lfh/a;

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

    sget-object v0, LS8/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LS8/a;
    .locals 1

    const-class v0, LS8/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS8/a;

    return-object p0
.end method

.method public static values()[LS8/a;
    .locals 1

    sget-object v0, LS8/a;->$VALUES:[LS8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS8/a;

    return-object v0
.end method
