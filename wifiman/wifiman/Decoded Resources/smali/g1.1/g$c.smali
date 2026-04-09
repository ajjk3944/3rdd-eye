.class public final enum Lg1/g$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lg1/g$c;

.field public static final enum BOTTOM:Lg1/g$c;

.field public static final enum END:Lg1/g$c;

.field public static final enum LEFT:Lg1/g$c;

.field public static final enum RIGHT:Lg1/g$c;

.field public static final enum START:Lg1/g$c;

.field public static final enum TOP:Lg1/g$c;


# direct methods
.method private static synthetic $values()[Lg1/g$c;
    .locals 6

    sget-object v0, Lg1/g$c;->LEFT:Lg1/g$c;

    sget-object v1, Lg1/g$c;->RIGHT:Lg1/g$c;

    sget-object v2, Lg1/g$c;->START:Lg1/g$c;

    sget-object v3, Lg1/g$c;->END:Lg1/g$c;

    sget-object v4, Lg1/g$c;->TOP:Lg1/g$c;

    sget-object v5, Lg1/g$c;->BOTTOM:Lg1/g$c;

    filled-new-array/range {v0 .. v5}, [Lg1/g$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg1/g$c;

    const-string v1, "LEFT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg1/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$c;->LEFT:Lg1/g$c;

    new-instance v0, Lg1/g$c;

    const-string v1, "RIGHT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lg1/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$c;->RIGHT:Lg1/g$c;

    new-instance v0, Lg1/g$c;

    const-string v1, "START"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lg1/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$c;->START:Lg1/g$c;

    new-instance v0, Lg1/g$c;

    const-string v1, "END"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lg1/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$c;->END:Lg1/g$c;

    new-instance v0, Lg1/g$c;

    const-string v1, "TOP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lg1/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$c;->TOP:Lg1/g$c;

    new-instance v0, Lg1/g$c;

    const-string v1, "BOTTOM"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lg1/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$c;->BOTTOM:Lg1/g$c;

    invoke-static {}, Lg1/g$c;->$values()[Lg1/g$c;

    move-result-object v0

    sput-object v0, Lg1/g$c;->$VALUES:[Lg1/g$c;

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

.method public static valueOf(Ljava/lang/String;)Lg1/g$c;
    .locals 1

    const-class v0, Lg1/g$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg1/g$c;

    return-object p0
.end method

.method public static values()[Lg1/g$c;
    .locals 1

    sget-object v0, Lg1/g$c;->$VALUES:[Lg1/g$c;

    invoke-virtual {v0}, [Lg1/g$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg1/g$c;

    return-object v0
.end method
