.class public final enum Lcom/ubnt/usurvey/product/m$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/usurvey/product/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ubnt/usurvey/product/m$c;

.field public static final enum NORMAL:Lcom/ubnt/usurvey/product/m$c;

.field public static final enum SMALL:Lcom/ubnt/usurvey/product/m$c;


# instance fields
.field private final size:I

.field private final variant:Lab/d$a$b;


# direct methods
.method private static final synthetic $values()[Lcom/ubnt/usurvey/product/m$c;
    .locals 2

    sget-object v0, Lcom/ubnt/usurvey/product/m$c;->SMALL:Lcom/ubnt/usurvey/product/m$c;

    sget-object v1, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    filled-new-array {v0, v1}, [Lcom/ubnt/usurvey/product/m$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 15

    new-instance v7, Lcom/ubnt/usurvey/product/m$c;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-string/jumbo v1, "SMALL"

    const/4 v2, 0x0

    const/16 v3, 0x28

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/ubnt/usurvey/product/m$c;-><init>(Ljava/lang/String;IILab/d$a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lcom/ubnt/usurvey/product/m$c;->SMALL:Lcom/ubnt/usurvey/product/m$c;

    new-instance v0, Lcom/ubnt/usurvey/product/m$c;

    const/4 v13, 0x2

    const/4 v14, 0x0

    const-string/jumbo v9, "NORMAL"

    const/4 v10, 0x1

    const/16 v11, 0x51

    const/4 v12, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lcom/ubnt/usurvey/product/m$c;-><init>(Ljava/lang/String;IILab/d$a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    invoke-static {}, Lcom/ubnt/usurvey/product/m$c;->$values()[Lcom/ubnt/usurvey/product/m$c;

    move-result-object v0

    sput-object v0, Lcom/ubnt/usurvey/product/m$c;->$VALUES:[Lcom/ubnt/usurvey/product/m$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ubnt/usurvey/product/m$c;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILab/d$a$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lab/d$a$b;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/ubnt/usurvey/product/m$c;->size:I

    .line 3
    iput-object p4, p0, Lcom/ubnt/usurvey/product/m$c;->variant:Lab/d$a$b;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IILab/d$a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    .line 4
    sget-object p4, Lab/d$a$b$b;->b:Lab/d$a$b$b;

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ubnt/usurvey/product/m$c;-><init>(Ljava/lang/String;IILab/d$a$b;)V

    return-void
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lcom/ubnt/usurvey/product/m$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ubnt/usurvey/product/m$c;
    .locals 1

    const-class v0, Lcom/ubnt/usurvey/product/m$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ubnt/usurvey/product/m$c;

    return-object p0
.end method

.method public static values()[Lcom/ubnt/usurvey/product/m$c;
    .locals 1

    sget-object v0, Lcom/ubnt/usurvey/product/m$c;->$VALUES:[Lcom/ubnt/usurvey/product/m$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ubnt/usurvey/product/m$c;

    return-object v0
.end method


# virtual methods
.method public final getSize()I
    .locals 1

    iget v0, p0, Lcom/ubnt/usurvey/product/m$c;->size:I

    return v0
.end method

.method public final getVariant()Lab/d$a$b;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/product/m$c;->variant:Lab/d$a$b;

    return-object v0
.end method
