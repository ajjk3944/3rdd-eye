.class public final Lk6/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk6/d$a;->a()Lx6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:F

.field private final g:F

.field private final h:F


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lk6/d$a$a;->a:Ljava/util/List;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lk6/d$a$a;->h:F

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lk6/d$a$a;->e:F

    return v0
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lk6/d$a$a;->c:F

    return v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lk6/d$a$a;->d:F

    return v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lk6/d$a$a;->h:F

    return v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, Lk6/d$a$a;->b:F

    return v0
.end method

.method public f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lk6/d$a$a;->a:Ljava/util/List;

    return-object v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Lk6/d$a$a;->g:F

    return v0
.end method

.method public getId()I
    .locals 1

    invoke-static {p0}, Lx6/b$a;->a(Lx6/b;)I

    move-result v0

    return v0
.end method

.method public h()F
    .locals 1

    iget v0, p0, Lk6/d$a$a;->f:F

    return v0
.end method
