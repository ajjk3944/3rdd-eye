.class public final enum LT/N0$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT/N0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LT/N0$d;

.field public static final enum Idle:LT/N0$d;

.field public static final enum Inactive:LT/N0$d;

.field public static final enum InactivePendingWork:LT/N0$d;

.field public static final enum PendingWork:LT/N0$d;

.field public static final enum ShutDown:LT/N0$d;

.field public static final enum ShuttingDown:LT/N0$d;


# direct methods
.method private static final synthetic $values()[LT/N0$d;
    .locals 6

    sget-object v0, LT/N0$d;->ShutDown:LT/N0$d;

    sget-object v1, LT/N0$d;->ShuttingDown:LT/N0$d;

    sget-object v2, LT/N0$d;->Inactive:LT/N0$d;

    sget-object v3, LT/N0$d;->InactivePendingWork:LT/N0$d;

    sget-object v4, LT/N0$d;->Idle:LT/N0$d;

    sget-object v5, LT/N0$d;->PendingWork:LT/N0$d;

    filled-new-array/range {v0 .. v5}, [LT/N0$d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LT/N0$d;

    const-string v1, "ShutDown"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LT/N0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT/N0$d;->ShutDown:LT/N0$d;

    new-instance v0, LT/N0$d;

    const-string v1, "ShuttingDown"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LT/N0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT/N0$d;->ShuttingDown:LT/N0$d;

    new-instance v0, LT/N0$d;

    const-string v1, "Inactive"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LT/N0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT/N0$d;->Inactive:LT/N0$d;

    new-instance v0, LT/N0$d;

    const-string v1, "InactivePendingWork"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LT/N0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT/N0$d;->InactivePendingWork:LT/N0$d;

    new-instance v0, LT/N0$d;

    const-string v1, "Idle"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LT/N0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT/N0$d;->Idle:LT/N0$d;

    new-instance v0, LT/N0$d;

    const-string v1, "PendingWork"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LT/N0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT/N0$d;->PendingWork:LT/N0$d;

    invoke-static {}, LT/N0$d;->$values()[LT/N0$d;

    move-result-object v0

    sput-object v0, LT/N0$d;->$VALUES:[LT/N0$d;

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

.method public static valueOf(Ljava/lang/String;)LT/N0$d;
    .locals 1

    const-class v0, LT/N0$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LT/N0$d;

    return-object p0
.end method

.method public static values()[LT/N0$d;
    .locals 1

    sget-object v0, LT/N0$d;->$VALUES:[LT/N0$d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LT/N0$d;

    return-object v0
.end method
