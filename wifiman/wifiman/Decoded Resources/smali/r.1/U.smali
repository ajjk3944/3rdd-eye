.class public abstract Lr/U;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private final c:Lo/z;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x12c

    .line 3
    iput v0, p0, Lr/U;->a:I

    .line 4
    invoke-static {}, Lo/n;->b()Lo/z;

    move-result-object v0

    iput-object v0, p0, Lr/U;->c:Lo/z;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr/U;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lr/U;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lr/U;->a:I

    return v0
.end method

.method public final c()Lo/z;
    .locals 1

    iget-object v0, p0, Lr/U;->c:Lo/z;

    return-object v0
.end method

.method public final d(I)V
    .locals 0

    iput p1, p0, Lr/U;->a:I

    return-void
.end method

.method public final e(Lr/S;Lr/E;)Lr/S;
    .locals 0

    invoke-virtual {p1, p2}, Lr/S;->c(Lr/E;)V

    return-object p1
.end method
