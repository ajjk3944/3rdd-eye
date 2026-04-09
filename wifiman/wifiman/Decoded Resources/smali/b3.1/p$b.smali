.class public final enum Lb3/p$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lb3/p$b;

.field public static final enum EVENT_OVERRIDE:Lb3/p$b;

.field public static final enum NOT_SET:Lb3/p$b;

.field private static final valueMap:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lb3/p$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lb3/p$b;

    const-string v1, "NOT_SET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lb3/p$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb3/p$b;->NOT_SET:Lb3/p$b;

    new-instance v1, Lb3/p$b;

    const-string v3, "EVENT_OVERRIDE"

    const/4 v4, 0x1

    const/4 v5, 0x5

    invoke-direct {v1, v3, v4, v5}, Lb3/p$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb3/p$b;->EVENT_OVERRIDE:Lb3/p$b;

    filled-new-array {v0, v1}, [Lb3/p$b;

    move-result-object v3

    sput-object v3, Lb3/p$b;->$VALUES:[Lb3/p$b;

    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    sput-object v3, Lb3/p$b;->valueMap:Landroid/util/SparseArray;

    invoke-virtual {v3, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v3, v5, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

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

    iput p3, p0, Lb3/p$b;->value:I

    return-void
.end method

.method public static forNumber(I)Lb3/p$b;
    .locals 1

    sget-object v0, Lb3/p$b;->valueMap:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb3/p$b;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lb3/p$b;
    .locals 1

    const-class v0, Lb3/p$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb3/p$b;

    return-object p0
.end method

.method public static values()[Lb3/p$b;
    .locals 1

    sget-object v0, Lb3/p$b;->$VALUES:[Lb3/p$b;

    invoke-virtual {v0}, [Lb3/p$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb3/p$b;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lb3/p$b;->value:I

    return v0
.end method
