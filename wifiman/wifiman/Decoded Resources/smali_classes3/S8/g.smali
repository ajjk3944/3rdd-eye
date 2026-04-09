.class public abstract LS8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS8/g$a;,
        LS8/g$b;,
        LS8/g$c;,
        LS8/g$d;
    }
.end annotation


# static fields
.field public static final b:LS8/g$a;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS8/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS8/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LS8/g;->b:LS8/g$a;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LS8/g;->a:I

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LS8/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LS8/g;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LS8/g;

    if-eqz v0, :cond_0

    check-cast p1, LS8/g;

    iget p1, p1, LS8/g;->a:I

    iget v0, p0, LS8/g;->a:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LS8/g;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method
