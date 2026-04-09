.class public final Lb1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/s$a;
.implements Lb1/s;


# instance fields
.field private final b:Lb1/u;

.field private final c:Lb1/u;

.field private final d:Lb1/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(F)V
    .locals 1

    .line 6
    invoke-static {p1}, LY0/h;->d(F)LY0/h;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lb1/t;-><init>(LY0/h;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lb1/t;-><init>(F)V

    return-void
.end method

.method private constructor <init>(LY0/h;Ljava/lang/String;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lb1/u;

    const-string v1, "base"

    const/4 v2, 0x0

    invoke-direct {v0, p1, p2, v1, v2}, Lb1/u;-><init>(LY0/h;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lb1/t;->b:Lb1/u;

    .line 4
    new-instance p1, Lb1/u;

    const-string p2, "min"

    invoke-direct {p1, v2, v2, p2, v2}, Lb1/u;-><init>(LY0/h;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lb1/t;->c:Lb1/u;

    .line 5
    new-instance p1, Lb1/u;

    const-string p2, "max"

    invoke-direct {p1, v2, v2, p2, v2}, Lb1/u;-><init>(LY0/h;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lb1/t;->d:Lb1/u;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0, p1}, Lb1/t;-><init>(LY0/h;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/constraintlayout/core/parser/b;
    .locals 3

    iget-object v0, p0, Lb1/t;->c:Lb1/u;

    invoke-virtual {v0}, Lb1/u;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/t;->d:Lb1/u;

    invoke-virtual {v0}, Lb1/u;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/t;->b:Lb1/u;

    invoke-virtual {v0}, Lb1/u;->a()Landroidx/constraintlayout/core/parser/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/constraintlayout/core/parser/d;

    const/4 v1, 0x0

    new-array v1, v1, [C

    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/parser/d;-><init>([C)V

    iget-object v1, p0, Lb1/t;->c:Lb1/u;

    invoke-virtual {v1}, Lb1/u;->b()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lb1/t;->c:Lb1/u;

    invoke-virtual {v1}, Lb1/u;->a()Landroidx/constraintlayout/core/parser/b;

    move-result-object v1

    const-string v2, "min"

    invoke-virtual {v0, v2, v1}, Landroidx/constraintlayout/core/parser/a;->a0(Ljava/lang/String;Landroidx/constraintlayout/core/parser/b;)V

    :cond_1
    iget-object v1, p0, Lb1/t;->d:Lb1/u;

    invoke-virtual {v1}, Lb1/u;->b()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lb1/t;->d:Lb1/u;

    invoke-virtual {v1}, Lb1/u;->a()Landroidx/constraintlayout/core/parser/b;

    move-result-object v1

    const-string v2, "max"

    invoke-virtual {v0, v2, v1}, Landroidx/constraintlayout/core/parser/a;->a0(Ljava/lang/String;Landroidx/constraintlayout/core/parser/b;)V

    :cond_2
    iget-object v1, p0, Lb1/t;->b:Lb1/u;

    invoke-virtual {v1}, Lb1/u;->a()Landroidx/constraintlayout/core/parser/b;

    move-result-object v1

    const-string v2, "value"

    invoke-virtual {v0, v2, v1}, Landroidx/constraintlayout/core/parser/a;->a0(Ljava/lang/String;Landroidx/constraintlayout/core/parser/b;)V

    :goto_0
    return-object v0
.end method
