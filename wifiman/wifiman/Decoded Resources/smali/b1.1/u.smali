.class public final Lb1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LY0/h;

.field private b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LY0/h;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lb1/u;->a:LY0/h;

    .line 4
    iput-object p2, p0, Lb1/u;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lb1/u;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LY0/h;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lb1/u;-><init>(LY0/h;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/constraintlayout/core/parser/b;
    .locals 2

    iget-object v0, p0, Lb1/u;->a:LY0/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LY0/h;->s()F

    move-result v0

    new-instance v1, Lf1/b;

    invoke-direct {v1, v0}, Lf1/b;-><init>(F)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lb1/u;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lf1/c;->x(Ljava/lang/String;)Lf1/c;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DimensionDescription: Null value & symbol for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb1/u;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Using WrapContent."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CCL"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "wrap"

    invoke-static {v0}, Lf1/c;->x(Ljava/lang/String;)Lf1/c;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lb1/u;->a:LY0/h;

    if-nez v0, :cond_0

    iget-object v0, p0, Lb1/u;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
