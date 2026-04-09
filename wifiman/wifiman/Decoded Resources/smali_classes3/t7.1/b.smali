.class public final enum Lt7/b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ls7/h;


# static fields
.field private static final synthetic $VALUES:[Lt7/b;

.field public static final enum FACTORY_DEFAULT:Lt7/b;

.field public static final enum NORMAL:Lt7/b;

.field public static final enum RECOVERY:Lt7/b;


# instance fields
.field private final isSingle:Z


# direct methods
.method private static final synthetic $values()[Lt7/b;
    .locals 3

    sget-object v0, Lt7/b;->NORMAL:Lt7/b;

    sget-object v1, Lt7/b;->FACTORY_DEFAULT:Lt7/b;

    sget-object v2, Lt7/b;->RECOVERY:Lt7/b;

    filled-new-array {v0, v1, v2}, [Lt7/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lt7/b;

    const-string/jumbo v1, "NORMAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lt7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt7/b;->NORMAL:Lt7/b;

    new-instance v0, Lt7/b;

    const-string/jumbo v1, "FACTORY_DEFAULT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lt7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt7/b;->FACTORY_DEFAULT:Lt7/b;

    new-instance v0, Lt7/b;

    const-string/jumbo v1, "RECOVERY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lt7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt7/b;->RECOVERY:Lt7/b;

    invoke-static {}, Lt7/b;->$values()[Lt7/b;

    move-result-object v0

    sput-object v0, Lt7/b;->$VALUES:[Lt7/b;

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

    const/4 p1, 0x1

    iput-boolean p1, p0, Lt7/b;->isSingle:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lt7/b;
    .locals 1

    const-class v0, Lt7/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt7/b;

    return-object p0
.end method

.method public static values()[Lt7/b;
    .locals 1

    sget-object v0, Lt7/b;->$VALUES:[Lt7/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt7/b;

    return-object v0
.end method


# virtual methods
.method public isSingle()Z
    .locals 1

    iget-boolean v0, p0, Lt7/b;->isSingle:Z

    return v0
.end method
