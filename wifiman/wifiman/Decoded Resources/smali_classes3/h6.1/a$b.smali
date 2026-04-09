.class public final enum Lh6/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lh6/a$b;

.field public static final enum Center:Lh6/a$b;

.field public static final enum Start:Lh6/a$b;


# instance fields
.field private final dataLabelsToSkip:I

.field private final labelPosition:La6/a;


# direct methods
.method private static final synthetic $values()[Lh6/a$b;
    .locals 2

    sget-object v0, Lh6/a$b;->Start:Lh6/a$b;

    sget-object v1, Lh6/a$b;->Center:Lh6/a$b;

    filled-new-array {v0, v1}, [Lh6/a$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lh6/a$b;

    sget-object v1, La6/a;->Start:La6/a;

    const-string/jumbo v2, "Start"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, Lh6/a$b;-><init>(Ljava/lang/String;ILa6/a;I)V

    sput-object v0, Lh6/a$b;->Start:Lh6/a$b;

    new-instance v0, Lh6/a$b;

    const-string v1, "Center"

    sget-object v2, La6/a;->Center:La6/a;

    invoke-direct {v0, v1, v4, v2, v3}, Lh6/a$b;-><init>(Ljava/lang/String;ILa6/a;I)V

    sput-object v0, Lh6/a$b;->Center:Lh6/a$b;

    invoke-static {}, Lh6/a$b;->$values()[Lh6/a$b;

    move-result-object v0

    sput-object v0, Lh6/a$b;->$VALUES:[Lh6/a$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILa6/a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/a;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lh6/a$b;->labelPosition:La6/a;

    iput p4, p0, Lh6/a$b;->dataLabelsToSkip:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lh6/a$b;
    .locals 1

    const-class v0, Lh6/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh6/a$b;

    return-object p0
.end method

.method public static values()[Lh6/a$b;
    .locals 1

    sget-object v0, Lh6/a$b;->$VALUES:[Lh6/a$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh6/a$b;

    return-object v0
.end method


# virtual methods
.method public final getDataLabelsToSkip$core_release()I
    .locals 1

    iget v0, p0, Lh6/a$b;->dataLabelsToSkip:I

    return v0
.end method

.method public final getLabelPosition$core_release()La6/a;
    .locals 1

    iget-object v0, p0, Lh6/a$b;->labelPosition:La6/a;

    return-object v0
.end method
