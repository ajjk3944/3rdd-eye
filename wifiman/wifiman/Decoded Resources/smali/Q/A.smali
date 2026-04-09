.class public final LQ/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ/A$c;
    }
.end annotation


# static fields
.field public static final d:LQ/A$c;

.field private static final e:Lc0/k;


# instance fields
.field private final a:LT/m0;

.field private final b:LT/m0;

.field private c:LT/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQ/A$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQ/A$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQ/A;->d:LQ/A$c;

    sget-object v0, LQ/A$a;->a:LQ/A$a;

    sget-object v1, LQ/A$b;->a:LQ/A$b;

    invoke-static {v0, v1}, Lc0/a;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object v0

    sput-object v0, LQ/A;->e:Lc0/k;

    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LT/C0;->a(F)LT/m0;

    move-result-object p1

    iput-object p1, p0, LQ/A;->a:LT/m0;

    invoke-static {p3}, LT/C0;->a(F)LT/m0;

    move-result-object p1

    iput-object p1, p0, LQ/A;->b:LT/m0;

    invoke-static {p2}, LT/C0;->a(F)LT/m0;

    move-result-object p1

    iput-object p1, p0, LQ/A;->c:LT/m0;

    return-void
.end method

.method public static final synthetic a()Lc0/k;
    .locals 1

    sget-object v0, LQ/A;->e:Lc0/k;

    return-object v0
.end method


# virtual methods
.method public final b()F
    .locals 2

    invoke-virtual {p0}, LQ/A;->e()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LQ/A;->d()F

    move-result v0

    invoke-virtual {p0}, LQ/A;->e()F

    move-result v1

    div-float v1, v0, v1

    :goto_0
    return v1
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, LQ/A;->b:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method public final d()F
    .locals 1

    iget-object v0, p0, LQ/A;->c:LT/m0;

    invoke-interface {v0}, LT/m0;->c()F

    move-result v0

    return v0
.end method

.method public final e()F
    .locals 1

    iget-object v0, p0, LQ/A;->a:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method public final f(F)V
    .locals 1

    iget-object v0, p0, LQ/A;->b:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method public final g(F)V
    .locals 3

    iget-object v0, p0, LQ/A;->c:LT/m0;

    invoke-virtual {p0}, LQ/A;->e()F

    move-result v1

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Lsh/m;->j(FFF)F

    move-result p1

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method public final h(F)V
    .locals 1

    iget-object v0, p0, LQ/A;->a:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method
