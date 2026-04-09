.class public final enum Lr/b0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lr/b0;

.field public static final enum Restart:Lr/b0;

.field public static final enum Reverse:Lr/b0;


# direct methods
.method private static final synthetic $values()[Lr/b0;
    .locals 2

    sget-object v0, Lr/b0;->Restart:Lr/b0;

    sget-object v1, Lr/b0;->Reverse:Lr/b0;

    filled-new-array {v0, v1}, [Lr/b0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr/b0;

    const-string v1, "Restart"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr/b0;->Restart:Lr/b0;

    new-instance v0, Lr/b0;

    const-string v1, "Reverse"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr/b0;->Reverse:Lr/b0;

    invoke-static {}, Lr/b0;->$values()[Lr/b0;

    move-result-object v0

    sput-object v0, Lr/b0;->$VALUES:[Lr/b0;

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

.method public static valueOf(Ljava/lang/String;)Lr/b0;
    .locals 1

    const-class v0, Lr/b0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr/b0;

    return-object p0
.end method

.method public static values()[Lr/b0;
    .locals 1

    sget-object v0, Lr/b0;->$VALUES:[Lr/b0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr/b0;

    return-object v0
.end method
