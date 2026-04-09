.class public final enum Lm2/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lm2/j;

.field public static final enum ASC:Lm2/j;

.field public static final enum DESC:Lm2/j;


# direct methods
.method private static final synthetic $values()[Lm2/j;
    .locals 2

    sget-object v0, Lm2/j;->ASC:Lm2/j;

    sget-object v1, Lm2/j;->DESC:Lm2/j;

    filled-new-array {v0, v1}, [Lm2/j;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm2/j;

    const-string v1, "ASC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm2/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm2/j;->ASC:Lm2/j;

    new-instance v0, Lm2/j;

    const-string v1, "DESC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lm2/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm2/j;->DESC:Lm2/j;

    invoke-static {}, Lm2/j;->$values()[Lm2/j;

    move-result-object v0

    sput-object v0, Lm2/j;->$VALUES:[Lm2/j;

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

.method public static valueOf(Ljava/lang/String;)Lm2/j;
    .locals 1

    const-class v0, Lm2/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm2/j;

    return-object p0
.end method

.method public static values()[Lm2/j;
    .locals 1

    sget-object v0, Lm2/j;->$VALUES:[Lm2/j;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm2/j;

    return-object v0
.end method
