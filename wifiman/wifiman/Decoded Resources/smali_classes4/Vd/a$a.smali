.class public final enum LVd/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LVd/a$a;

.field public static final enum ADOPTING:LVd/a$a;

.field public static final enum ADOPTION_FAILED:LVd/a$a;

.field public static final enum CONNECTED:LVd/a$a;

.field public static final enum DELETING:LVd/a$a;

.field public static final enum DISCONNECTED:LVd/a$a;

.field public static final enum FIRMWARE_MISMATCH:LVd/a$a;

.field public static final enum HEARTBEAT_MISSED:LVd/a$a;

.field public static final enum INFORM_ERROR:LVd/a$a;

.field public static final enum ISOLATED:LVd/a$a;

.field public static final enum PENDING:LVd/a$a;

.field public static final enum PROVISIONING:LVd/a$a;

.field public static final enum REMOVED:LVd/a$a;

.field public static final enum UNKNOWN:LVd/a$a;

.field public static final enum UPGRADING:LVd/a$a;


# direct methods
.method private static final synthetic $values()[LVd/a$a;
    .locals 14

    sget-object v0, LVd/a$a;->DISCONNECTED:LVd/a$a;

    sget-object v1, LVd/a$a;->CONNECTED:LVd/a$a;

    sget-object v2, LVd/a$a;->PENDING:LVd/a$a;

    sget-object v3, LVd/a$a;->FIRMWARE_MISMATCH:LVd/a$a;

    sget-object v4, LVd/a$a;->UPGRADING:LVd/a$a;

    sget-object v5, LVd/a$a;->PROVISIONING:LVd/a$a;

    sget-object v6, LVd/a$a;->HEARTBEAT_MISSED:LVd/a$a;

    sget-object v7, LVd/a$a;->ADOPTING:LVd/a$a;

    sget-object v8, LVd/a$a;->DELETING:LVd/a$a;

    sget-object v9, LVd/a$a;->INFORM_ERROR:LVd/a$a;

    sget-object v10, LVd/a$a;->ADOPTION_FAILED:LVd/a$a;

    sget-object v11, LVd/a$a;->ISOLATED:LVd/a$a;

    sget-object v12, LVd/a$a;->REMOVED:LVd/a$a;

    sget-object v13, LVd/a$a;->UNKNOWN:LVd/a$a;

    filled-new-array/range {v0 .. v13}, [LVd/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LVd/a$a;

    const-string v1, "DISCONNECTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->DISCONNECTED:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "CONNECTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->CONNECTED:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "PENDING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->PENDING:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "FIRMWARE_MISMATCH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->FIRMWARE_MISMATCH:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "UPGRADING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->UPGRADING:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "PROVISIONING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->PROVISIONING:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "HEARTBEAT_MISSED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->HEARTBEAT_MISSED:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "ADOPTING"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->ADOPTING:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "DELETING"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->DELETING:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "INFORM_ERROR"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->INFORM_ERROR:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "ADOPTION_FAILED"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->ADOPTION_FAILED:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "ISOLATED"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->ISOLATED:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "REMOVED"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->REMOVED:LVd/a$a;

    new-instance v0, LVd/a$a;

    const-string v1, "UNKNOWN"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, LVd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/a$a;->UNKNOWN:LVd/a$a;

    invoke-static {}, LVd/a$a;->$values()[LVd/a$a;

    move-result-object v0

    sput-object v0, LVd/a$a;->$VALUES:[LVd/a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LVd/a$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, LVd/a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LVd/a$a;
    .locals 1

    const-class v0, LVd/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LVd/a$a;

    return-object p0
.end method

.method public static values()[LVd/a$a;
    .locals 1

    sget-object v0, LVd/a$a;->$VALUES:[LVd/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LVd/a$a;

    return-object v0
.end method
