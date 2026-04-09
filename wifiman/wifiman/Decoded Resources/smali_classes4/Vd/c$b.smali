.class public final enum LVd/c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LVd/c$b;

.field public static final enum DOWNLOAD:LVd/c$b;

.field public static final enum FINISHED:LVd/c$b;

.field public static final enum LATENCY_CHECK:LVd/c$b;

.field public static final enum UPLOAD:LVd/c$b;


# direct methods
.method private static final synthetic $values()[LVd/c$b;
    .locals 4

    sget-object v0, LVd/c$b;->LATENCY_CHECK:LVd/c$b;

    sget-object v1, LVd/c$b;->DOWNLOAD:LVd/c$b;

    sget-object v2, LVd/c$b;->UPLOAD:LVd/c$b;

    sget-object v3, LVd/c$b;->FINISHED:LVd/c$b;

    filled-new-array {v0, v1, v2, v3}, [LVd/c$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LVd/c$b;

    const-string v1, "LATENCY_CHECK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LVd/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/c$b;->LATENCY_CHECK:LVd/c$b;

    new-instance v0, LVd/c$b;

    const-string v1, "DOWNLOAD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LVd/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/c$b;->DOWNLOAD:LVd/c$b;

    new-instance v0, LVd/c$b;

    const-string v1, "UPLOAD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LVd/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/c$b;->UPLOAD:LVd/c$b;

    new-instance v0, LVd/c$b;

    const-string v1, "FINISHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LVd/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVd/c$b;->FINISHED:LVd/c$b;

    invoke-static {}, LVd/c$b;->$values()[LVd/c$b;

    move-result-object v0

    sput-object v0, LVd/c$b;->$VALUES:[LVd/c$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LVd/c$b;->$ENTRIES:Lfh/a;

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

    sget-object v0, LVd/c$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LVd/c$b;
    .locals 1

    const-class v0, LVd/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LVd/c$b;

    return-object p0
.end method

.method public static values()[LVd/c$b;
    .locals 1

    sget-object v0, LVd/c$b;->$VALUES:[LVd/c$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LVd/c$b;

    return-object v0
.end method
