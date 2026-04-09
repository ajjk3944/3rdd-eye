.class public final enum Lw7/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lw7/c;

.field public static final enum V1:Lw7/c;


# instance fields
.field private final factory:Lmh/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmh/a;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lw7/c;
    .locals 1

    sget-object v0, Lw7/c;->V1:Lw7/c;

    filled-new-array {v0}, [Lw7/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lw7/c;

    const/4 v1, 0x0

    sget-object v2, Lw7/c$a;->a:Lw7/c$a;

    const-string/jumbo v3, "V1"

    invoke-direct {v0, v3, v1, v2}, Lw7/c;-><init>(Ljava/lang/String;ILmh/a;)V

    sput-object v0, Lw7/c;->V1:Lw7/c;

    invoke-static {}, Lw7/c;->$values()[Lw7/c;

    move-result-object v0

    sput-object v0, Lw7/c;->$VALUES:[Lw7/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILmh/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lw7/c;->factory:Lmh/a;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lw7/c;
    .locals 1

    const-class v0, Lw7/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw7/c;

    return-object p0
.end method

.method public static values()[Lw7/c;
    .locals 1

    sget-object v0, Lw7/c;->$VALUES:[Lw7/c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw7/c;

    return-object v0
.end method


# virtual methods
.method public final getFactory$library_server_lan_release()Lmh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/a;"
        }
    .end annotation

    iget-object v0, p0, Lw7/c;->factory:Lmh/a;

    return-object v0
.end method
