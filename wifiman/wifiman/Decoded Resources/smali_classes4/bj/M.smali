.class public final enum Lbj/M;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lbj/M;

.field public static final enum LIST:Lbj/M;

.field public static final enum MAP:Lbj/M;

.field public static final enum OBJ:Lbj/M;

.field public static final enum POLY_OBJ:Lbj/M;


# instance fields
.field public final begin:C

.field public final end:C


# direct methods
.method private static final synthetic $values()[Lbj/M;
    .locals 4

    sget-object v0, Lbj/M;->OBJ:Lbj/M;

    sget-object v1, Lbj/M;->LIST:Lbj/M;

    sget-object v2, Lbj/M;->MAP:Lbj/M;

    sget-object v3, Lbj/M;->POLY_OBJ:Lbj/M;

    filled-new-array {v0, v1, v2, v3}, [Lbj/M;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lbj/M;

    const-string v1, "OBJ"

    const/4 v2, 0x0

    const/16 v3, 0x7b

    const/16 v4, 0x7d

    invoke-direct {v0, v1, v2, v3, v4}, Lbj/M;-><init>(Ljava/lang/String;ICC)V

    sput-object v0, Lbj/M;->OBJ:Lbj/M;

    new-instance v0, Lbj/M;

    const-string v1, "LIST"

    const/4 v2, 0x1

    const/16 v5, 0x5b

    const/16 v6, 0x5d

    invoke-direct {v0, v1, v2, v5, v6}, Lbj/M;-><init>(Ljava/lang/String;ICC)V

    sput-object v0, Lbj/M;->LIST:Lbj/M;

    new-instance v0, Lbj/M;

    const-string v1, "MAP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v3, v4}, Lbj/M;-><init>(Ljava/lang/String;ICC)V

    sput-object v0, Lbj/M;->MAP:Lbj/M;

    new-instance v0, Lbj/M;

    const-string v1, "POLY_OBJ"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v5, v6}, Lbj/M;-><init>(Ljava/lang/String;ICC)V

    sput-object v0, Lbj/M;->POLY_OBJ:Lbj/M;

    invoke-static {}, Lbj/M;->$values()[Lbj/M;

    move-result-object v0

    sput-object v0, Lbj/M;->$VALUES:[Lbj/M;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lbj/M;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ICC)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(CC)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-char p3, p0, Lbj/M;->begin:C

    iput-char p4, p0, Lbj/M;->end:C

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

    sget-object v0, Lbj/M;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lbj/M;
    .locals 1

    const-class v0, Lbj/M;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbj/M;

    return-object p0
.end method

.method public static values()[Lbj/M;
    .locals 1

    sget-object v0, Lbj/M;->$VALUES:[Lbj/M;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbj/M;

    return-object v0
.end method
