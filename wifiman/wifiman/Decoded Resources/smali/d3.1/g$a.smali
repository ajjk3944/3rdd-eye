.class public final enum Ld3/g$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ld3/g$a;

.field public static final enum FATAL_ERROR:Ld3/g$a;

.field public static final enum INVALID_PAYLOAD:Ld3/g$a;

.field public static final enum OK:Ld3/g$a;

.field public static final enum TRANSIENT_ERROR:Ld3/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ld3/g$a;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld3/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld3/g$a;->OK:Ld3/g$a;

    new-instance v1, Ld3/g$a;

    const-string v2, "TRANSIENT_ERROR"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ld3/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ld3/g$a;->TRANSIENT_ERROR:Ld3/g$a;

    new-instance v2, Ld3/g$a;

    const-string v3, "FATAL_ERROR"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ld3/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ld3/g$a;->FATAL_ERROR:Ld3/g$a;

    new-instance v3, Ld3/g$a;

    const-string v4, "INVALID_PAYLOAD"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ld3/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ld3/g$a;->INVALID_PAYLOAD:Ld3/g$a;

    filled-new-array {v0, v1, v2, v3}, [Ld3/g$a;

    move-result-object v0

    sput-object v0, Ld3/g$a;->$VALUES:[Ld3/g$a;

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

.method public static valueOf(Ljava/lang/String;)Ld3/g$a;
    .locals 1

    const-class v0, Ld3/g$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld3/g$a;

    return-object p0
.end method

.method public static values()[Ld3/g$a;
    .locals 1

    sget-object v0, Ld3/g$a;->$VALUES:[Ld3/g$a;

    invoke-virtual {v0}, [Ld3/g$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld3/g$a;

    return-object v0
.end method
