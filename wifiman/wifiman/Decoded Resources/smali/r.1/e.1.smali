.class public final enum Lr/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lr/e;

.field public static final enum BoundReached:Lr/e;

.field public static final enum Finished:Lr/e;


# direct methods
.method private static final synthetic $values()[Lr/e;
    .locals 2

    sget-object v0, Lr/e;->BoundReached:Lr/e;

    sget-object v1, Lr/e;->Finished:Lr/e;

    filled-new-array {v0, v1}, [Lr/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr/e;

    const-string v1, "BoundReached"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr/e;->BoundReached:Lr/e;

    new-instance v0, Lr/e;

    const-string v1, "Finished"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr/e;->Finished:Lr/e;

    invoke-static {}, Lr/e;->$values()[Lr/e;

    move-result-object v0

    sput-object v0, Lr/e;->$VALUES:[Lr/e;

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

.method public static valueOf(Ljava/lang/String;)Lr/e;
    .locals 1

    const-class v0, Lr/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr/e;

    return-object p0
.end method

.method public static values()[Lr/e;
    .locals 1

    sget-object v0, Lr/e;->$VALUES:[Lr/e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr/e;

    return-object v0
.end method
