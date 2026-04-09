.class public final enum LG0/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG0/b$a;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[LG0/b;

.field public static final enum Copy:LG0/b;

.field public static final enum Cut:LG0/b;

.field public static final enum Paste:LG0/b;

.field public static final enum SelectAll:LG0/b;


# instance fields
.field private final id:I

.field private final order:I


# direct methods
.method private static final synthetic $values()[LG0/b;
    .locals 4

    sget-object v0, LG0/b;->Copy:LG0/b;

    sget-object v1, LG0/b;->Paste:LG0/b;

    sget-object v2, LG0/b;->Cut:LG0/b;

    sget-object v3, LG0/b;->SelectAll:LG0/b;

    filled-new-array {v0, v1, v2, v3}, [LG0/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LG0/b;

    const-string v1, "Copy"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LG0/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LG0/b;->Copy:LG0/b;

    new-instance v0, LG0/b;

    const-string v1, "Paste"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LG0/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LG0/b;->Paste:LG0/b;

    new-instance v0, LG0/b;

    const-string v1, "Cut"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, LG0/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LG0/b;->Cut:LG0/b;

    new-instance v0, LG0/b;

    const-string v1, "SelectAll"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, LG0/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LG0/b;->SelectAll:LG0/b;

    invoke-static {}, LG0/b;->$values()[LG0/b;

    move-result-object v0

    sput-object v0, LG0/b;->$VALUES:[LG0/b;

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

    iput p3, p0, LG0/b;->id:I

    iput p3, p0, LG0/b;->order:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LG0/b;
    .locals 1

    const-class v0, LG0/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LG0/b;

    return-object p0
.end method

.method public static values()[LG0/b;
    .locals 1

    sget-object v0, LG0/b;->$VALUES:[LG0/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LG0/b;

    return-object v0
.end method


# virtual methods
.method public final getId()I
    .locals 1

    iget v0, p0, LG0/b;->id:I

    return v0
.end method

.method public final getOrder()I
    .locals 1

    iget v0, p0, LG0/b;->order:I

    return v0
.end method

.method public final getTitleResource()I
    .locals 2

    sget-object v0, LG0/b$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const v0, 0x104000d

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    const v0, 0x1040003

    goto :goto_0

    :cond_2
    const v0, 0x104000b

    goto :goto_0

    :cond_3
    const v0, 0x1040001

    :goto_0
    return v0
.end method
