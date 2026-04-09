.class public final enum Li6/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Li6/a;

.field public static final enum Full:Li6/a;

.field public static final enum None:Li6/a;


# direct methods
.method private static final synthetic $values()[Li6/a;
    .locals 2

    sget-object v0, Li6/a;->Full:Li6/a;

    sget-object v1, Li6/a;->None:Li6/a;

    filled-new-array {v0, v1}, [Li6/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li6/a;

    const-string/jumbo v1, "Full"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li6/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li6/a;->Full:Li6/a;

    new-instance v0, Li6/a;

    const-string/jumbo v1, "None"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Li6/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li6/a;->None:Li6/a;

    invoke-static {}, Li6/a;->$values()[Li6/a;

    move-result-object v0

    sput-object v0, Li6/a;->$VALUES:[Li6/a;

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

.method public static valueOf(Ljava/lang/String;)Li6/a;
    .locals 1

    const-class v0, Li6/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li6/a;

    return-object p0
.end method

.method public static values()[Li6/a;
    .locals 1

    sget-object v0, Li6/a;->$VALUES:[Li6/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li6/a;

    return-object v0
.end method
