.class public final enum Lnf/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lnf/g;

.field public static final enum DOWN:Lnf/g;

.field public static final enum LATENCY:Lnf/g;

.field public static final enum UP:Lnf/g;


# direct methods
.method private static final synthetic $values()[Lnf/g;
    .locals 3

    sget-object v0, Lnf/g;->LATENCY:Lnf/g;

    sget-object v1, Lnf/g;->DOWN:Lnf/g;

    sget-object v2, Lnf/g;->UP:Lnf/g;

    filled-new-array {v0, v1, v2}, [Lnf/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnf/g;

    const-string v1, "LATENCY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnf/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnf/g;->LATENCY:Lnf/g;

    new-instance v0, Lnf/g;

    const-string v1, "DOWN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lnf/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnf/g;->DOWN:Lnf/g;

    new-instance v0, Lnf/g;

    const-string v1, "UP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lnf/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnf/g;->UP:Lnf/g;

    invoke-static {}, Lnf/g;->$values()[Lnf/g;

    move-result-object v0

    sput-object v0, Lnf/g;->$VALUES:[Lnf/g;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lnf/g;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lnf/g;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnf/g;
    .locals 1

    const-class v0, Lnf/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnf/g;

    return-object p0
.end method

.method public static values()[Lnf/g;
    .locals 1

    sget-object v0, Lnf/g;->$VALUES:[Lnf/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnf/g;

    return-object v0
.end method
