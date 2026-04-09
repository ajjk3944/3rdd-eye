.class public final enum LAd/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LAd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LAd/a$a;

.field public static final enum DROPPED_CONNECTIVITY:LAd/a$a;

.field public static final enum NOT_AS_EXPECTED:LAd/a$a;

.field public static final enum POOR_LATENCY:LAd/a$a;

.field public static final enum POOR_THROUGHPUT:LAd/a$a;


# direct methods
.method private static final synthetic $values()[LAd/a$a;
    .locals 4

    sget-object v0, LAd/a$a;->DROPPED_CONNECTIVITY:LAd/a$a;

    sget-object v1, LAd/a$a;->POOR_LATENCY:LAd/a$a;

    sget-object v2, LAd/a$a;->POOR_THROUGHPUT:LAd/a$a;

    sget-object v3, LAd/a$a;->NOT_AS_EXPECTED:LAd/a$a;

    filled-new-array {v0, v1, v2, v3}, [LAd/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LAd/a$a;

    const-string v1, "DROPPED_CONNECTIVITY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LAd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAd/a$a;->DROPPED_CONNECTIVITY:LAd/a$a;

    new-instance v0, LAd/a$a;

    const-string v1, "POOR_LATENCY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LAd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAd/a$a;->POOR_LATENCY:LAd/a$a;

    new-instance v0, LAd/a$a;

    const-string v1, "POOR_THROUGHPUT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LAd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAd/a$a;->POOR_THROUGHPUT:LAd/a$a;

    new-instance v0, LAd/a$a;

    const-string v1, "NOT_AS_EXPECTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LAd/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAd/a$a;->NOT_AS_EXPECTED:LAd/a$a;

    invoke-static {}, LAd/a$a;->$values()[LAd/a$a;

    move-result-object v0

    sput-object v0, LAd/a$a;->$VALUES:[LAd/a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LAd/a$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, LAd/a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LAd/a$a;
    .locals 1

    const-class v0, LAd/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LAd/a$a;

    return-object p0
.end method

.method public static values()[LAd/a$a;
    .locals 1

    sget-object v0, LAd/a$a;->$VALUES:[LAd/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LAd/a$a;

    return-object v0
.end method
