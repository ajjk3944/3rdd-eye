.class public final enum Lb3/o$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lb3/o$b;

.field public static final enum ANDROID_FIREBASE:Lb3/o$b;

.field public static final enum UNKNOWN:Lb3/o$b;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lb3/o$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lb3/o$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb3/o$b;->UNKNOWN:Lb3/o$b;

    new-instance v1, Lb3/o$b;

    const/4 v2, 0x1

    const/16 v3, 0x17

    const-string v4, "ANDROID_FIREBASE"

    invoke-direct {v1, v4, v2, v3}, Lb3/o$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb3/o$b;->ANDROID_FIREBASE:Lb3/o$b;

    filled-new-array {v0, v1}, [Lb3/o$b;

    move-result-object v0

    sput-object v0, Lb3/o$b;->$VALUES:[Lb3/o$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lb3/o$b;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb3/o$b;
    .locals 1

    const-class v0, Lb3/o$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb3/o$b;

    return-object p0
.end method

.method public static values()[Lb3/o$b;
    .locals 1

    sget-object v0, Lb3/o$b;->$VALUES:[Lb3/o$b;

    invoke-virtual {v0}, [Lb3/o$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb3/o$b;

    return-object v0
.end method
