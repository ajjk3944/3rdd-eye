.class public final enum Ly0/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Ly0/p;

.field public static final enum Final:Ly0/p;

.field public static final enum Initial:Ly0/p;

.field public static final enum Main:Ly0/p;


# direct methods
.method private static final synthetic $values()[Ly0/p;
    .locals 3

    sget-object v0, Ly0/p;->Initial:Ly0/p;

    sget-object v1, Ly0/p;->Main:Ly0/p;

    sget-object v2, Ly0/p;->Final:Ly0/p;

    filled-new-array {v0, v1, v2}, [Ly0/p;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly0/p;

    const-string v1, "Initial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly0/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly0/p;->Initial:Ly0/p;

    new-instance v0, Ly0/p;

    const-string v1, "Main"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ly0/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly0/p;->Main:Ly0/p;

    new-instance v0, Ly0/p;

    const-string v1, "Final"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ly0/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly0/p;->Final:Ly0/p;

    invoke-static {}, Ly0/p;->$values()[Ly0/p;

    move-result-object v0

    sput-object v0, Ly0/p;->$VALUES:[Ly0/p;

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

.method public static valueOf(Ljava/lang/String;)Ly0/p;
    .locals 1

    const-class v0, Ly0/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly0/p;

    return-object p0
.end method

.method public static values()[Ly0/p;
    .locals 1

    sget-object v0, Ly0/p;->$VALUES:[Ly0/p;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly0/p;

    return-object v0
.end method
