.class public final Lp6/a$b;
.super Lp6/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final e:I


# direct methods
.method public constructor <init>(ILp6/c;)V
    .locals 1

    const-string/jumbo v0, "cornerTreatment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lp6/a;-><init>(Lp6/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lp6/a$b;->e:I

    if-ltz p1, :cond_0

    const/16 p2, 0x65

    if-ge p1, p2, :cond_0

    return-void

    :cond_0
    new-instance p2, Lcom/patrykandpatrick/vico/core/throwable/IllegalPercentageException;

    invoke-direct {p2, p1}, Lcom/patrykandpatrick/vico/core/throwable/IllegalPercentageException;-><init>(I)V

    throw p2
.end method


# virtual methods
.method public a(FF)F
    .locals 0

    const/16 p2, 0x64

    int-to-float p2, p2

    div-float/2addr p1, p2

    iget p2, p0, Lp6/a$b;->e:I

    int-to-float p2, p2

    mul-float/2addr p1, p2

    return p1
.end method
