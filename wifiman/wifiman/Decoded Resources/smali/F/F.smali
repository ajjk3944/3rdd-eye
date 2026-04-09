.class public final LF/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:LT/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, LF/F;->a:I

    const/4 v0, 0x2

    iput v0, p0, LF/F;->b:I

    const/4 v0, 0x4

    iput v0, p0, LF/F;->c:I

    const/4 v0, 0x0

    invoke-static {v0}, LT/f1;->a(I)LT/n0;

    move-result-object v0

    iput-object v0, p0, LF/F;->d:LT/n0;

    return-void
.end method

.method public static final synthetic a(LF/F;)I
    .locals 0

    iget p0, p0, LF/F;->a:I

    return p0
.end method

.method public static final synthetic b(LF/F;)I
    .locals 0

    iget p0, p0, LF/F;->b:I

    return p0
.end method

.method public static final synthetic c(LF/F;)LT/n0;
    .locals 0

    iget-object p0, p0, LF/F;->d:LT/n0;

    return-object p0
.end method

.method public static final synthetic d(LF/F;)I
    .locals 0

    iget p0, p0, LF/F;->c:I

    return p0
.end method


# virtual methods
.method public final e(Ly/k;Ldh/e;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lo/F;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lo/F;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1}, Ly/k;->b()LLi/g;

    move-result-object p1

    new-instance v1, LF/F$a;

    invoke-direct {v1, v0, p0}, LF/F$a;-><init>(Lo/F;LF/F;)V

    invoke-interface {p1, v1, p2}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, LF/F;->d:LT/n0;

    invoke-interface {v0}, LT/n0;->e()I

    move-result v0

    iget v1, p0, LF/F;->a:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g()Z
    .locals 2

    iget-object v0, p0, LF/F;->d:LT/n0;

    invoke-interface {v0}, LT/n0;->e()I

    move-result v0

    iget v1, p0, LF/F;->b:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, LF/F;->d:LT/n0;

    invoke-interface {v0}, LT/n0;->e()I

    move-result v0

    iget v1, p0, LF/F;->c:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
