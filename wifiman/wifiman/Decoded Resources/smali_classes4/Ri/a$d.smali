.class public final enum LRi/a$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRi/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LRi/a$d;

.field public static final enum BLOCKING:LRi/a$d;

.field public static final enum CPU_ACQUIRED:LRi/a$d;

.field public static final enum DORMANT:LRi/a$d;

.field public static final enum PARKING:LRi/a$d;

.field public static final enum TERMINATED:LRi/a$d;


# direct methods
.method private static final synthetic $values()[LRi/a$d;
    .locals 5

    sget-object v0, LRi/a$d;->CPU_ACQUIRED:LRi/a$d;

    sget-object v1, LRi/a$d;->BLOCKING:LRi/a$d;

    sget-object v2, LRi/a$d;->PARKING:LRi/a$d;

    sget-object v3, LRi/a$d;->DORMANT:LRi/a$d;

    sget-object v4, LRi/a$d;->TERMINATED:LRi/a$d;

    filled-new-array {v0, v1, v2, v3, v4}, [LRi/a$d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LRi/a$d;

    const-string v1, "CPU_ACQUIRED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LRi/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRi/a$d;->CPU_ACQUIRED:LRi/a$d;

    new-instance v0, LRi/a$d;

    const-string v1, "BLOCKING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LRi/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRi/a$d;->BLOCKING:LRi/a$d;

    new-instance v0, LRi/a$d;

    const-string v1, "PARKING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LRi/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRi/a$d;->PARKING:LRi/a$d;

    new-instance v0, LRi/a$d;

    const-string v1, "DORMANT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LRi/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRi/a$d;->DORMANT:LRi/a$d;

    new-instance v0, LRi/a$d;

    const-string v1, "TERMINATED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LRi/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRi/a$d;->TERMINATED:LRi/a$d;

    invoke-static {}, LRi/a$d;->$values()[LRi/a$d;

    move-result-object v0

    sput-object v0, LRi/a$d;->$VALUES:[LRi/a$d;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LRi/a$d;->$ENTRIES:Lfh/a;

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

    sget-object v0, LRi/a$d;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LRi/a$d;
    .locals 1

    const-class v0, LRi/a$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LRi/a$d;

    return-object p0
.end method

.method public static values()[LRi/a$d;
    .locals 1

    sget-object v0, LRi/a$d;->$VALUES:[LRi/a$d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LRi/a$d;

    return-object v0
.end method
