.class public final Ly0/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/F;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/H$a;
    }
.end annotation


# instance fields
.field public a:Lmh/l;

.field private b:Ly0/O;

.field private c:Z

.field private final d:Ly0/E;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly0/H$b;

    invoke-direct {v0, p0}, Ly0/H$b;-><init>(Ly0/H;)V

    iput-object v0, p0, Ly0/H;->d:Ly0/E;

    return-void
.end method


# virtual methods
.method public L0()Ly0/E;
    .locals 1

    iget-object v0, p0, Ly0/H;->d:Ly0/E;

    return-object v0
.end method

.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Ly0/H;->c:Z

    return v0
.end method

.method public final c()Lmh/l;
    .locals 1

    iget-object v0, p0, Ly0/H;->a:Lmh/l;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "onTouchEvent"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d(Z)V
    .locals 0

    iput-boolean p1, p0, Ly0/H;->c:Z

    return-void
.end method

.method public final e(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Ly0/H;->a:Lmh/l;

    return-void
.end method

.method public final f(Ly0/O;)V
    .locals 2

    iget-object v0, p0, Ly0/H;->b:Ly0/O;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly0/O;->b(Ly0/H;)V

    :goto_0
    iput-object p1, p0, Ly0/H;->b:Ly0/O;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, p0}, Ly0/O;->b(Ly0/H;)V

    :goto_1
    return-void
.end method
