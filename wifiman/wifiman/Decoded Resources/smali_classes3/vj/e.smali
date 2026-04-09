.class public Lvj/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/di/DI;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvj/e$a;
    }
.end annotation


# static fields
.field public static final c:Lvj/e$a;


# instance fields
.field private final a:Lvj/d;

.field private final b:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvj/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvj/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvj/e;->c:Lvj/e$a;

    return-void
.end method

.method public constructor <init>(Lvj/d;)V
    .locals 1

    const-string/jumbo v0, "_container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvj/e;->a:Lvj/d;

    .line 2
    new-instance p1, Lvj/e$b;

    invoke-direct {p1, p0}, Lvj/e$b;-><init>(Lvj/e;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lvj/e;->b:LYg/m;

    return-void
.end method

.method private constructor <init>(Lvj/f;Z)V
    .locals 7

    .line 3
    new-instance v6, Lvj/d;

    invoke-virtual {p1}, Lvj/b;->h()Lvj/c;

    move-result-object v1

    invoke-virtual {p1}, Lvj/f;->i()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lvj/f;->k()Z

    move-result v3

    invoke-virtual {p1}, Lvj/f;->j()Z

    move-result v4

    move-object v0, v6

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lvj/d;-><init>(Lvj/c;Ljava/util/List;ZZZ)V

    invoke-direct {p0, v6}, Lvj/e;-><init>(Lvj/d;)V

    return-void
.end method

.method public constructor <init>(ZLmh/l;)V
    .locals 1

    const-string/jumbo v0, "init"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lvj/e;->c:Lvj/e$a;

    invoke-static {v0, p1, p2}, Lvj/e$a;->a(Lvj/e$a;ZLmh/l;)Lvj/f;

    move-result-object p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lvj/e;-><init>(Lvj/f;Z)V

    return-void
.end method

.method public static final synthetic a(Lvj/e;)Lvj/d;
    .locals 0

    iget-object p0, p0, Lvj/e;->a:Lvj/d;

    return-object p0
.end method


# virtual methods
.method public I()Lorg/kodein/di/f;
    .locals 1

    invoke-static {p0}, Lorg/kodein/di/DI$d;->b(Lorg/kodein/di/DI;)Lorg/kodein/di/f;

    move-result-object v0

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    invoke-static {p0}, Lorg/kodein/di/DI$d;->a(Lorg/kodein/di/DI;)Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method

.method public i()Lrj/l2;
    .locals 1

    invoke-static {p0}, Lorg/kodein/di/DI$d;->c(Lorg/kodein/di/DI;)Lrj/l2;

    const/4 v0, 0x0

    return-object v0
.end method

.method public final y()Lorg/kodein/di/e;
    .locals 1

    iget-object v0, p0, Lvj/e;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/kodein/di/e;

    return-object v0
.end method
