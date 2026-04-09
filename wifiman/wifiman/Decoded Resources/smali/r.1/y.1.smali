.class public final Lr/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/d;


# instance fields
.field private final a:Lr/x0;

.field private final b:Lr/s0;

.field private final c:Ljava/lang/Object;

.field private final d:Lr/q;

.field private final e:Lr/q;

.field private final f:Lr/q;

.field private final g:Ljava/lang/Object;

.field private final h:J

.field private final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lr/x0;Lr/s0;Ljava/lang/Object;Lr/q;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lr/y;->a:Lr/x0;

    .line 3
    iput-object p2, p0, Lr/y;->b:Lr/s0;

    .line 4
    iput-object p3, p0, Lr/y;->c:Ljava/lang/Object;

    .line 5
    invoke-virtual {p0}, Lr/y;->c()Lr/s0;

    move-result-object p2

    invoke-interface {p2}, Lr/s0;->a()Lmh/l;

    move-result-object p2

    invoke-interface {p2, p3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lr/q;

    iput-object p2, p0, Lr/y;->d:Lr/q;

    .line 6
    invoke-static {p4}, Lr/r;->e(Lr/q;)Lr/q;

    move-result-object p3

    iput-object p3, p0, Lr/y;->e:Lr/q;

    .line 7
    invoke-virtual {p0}, Lr/y;->c()Lr/s0;

    move-result-object p3

    invoke-interface {p3}, Lr/s0;->b()Lmh/l;

    move-result-object p3

    .line 8
    invoke-interface {p1, p2, p4}, Lr/x0;->c(Lr/q;Lr/q;)Lr/q;

    move-result-object v0

    .line 9
    invoke-interface {p3, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, p0, Lr/y;->g:Ljava/lang/Object;

    .line 10
    invoke-interface {p1, p2, p4}, Lr/x0;->e(Lr/q;Lr/q;)J

    move-result-wide v0

    iput-wide v0, p0, Lr/y;->h:J

    .line 11
    invoke-virtual {p0}, Lr/y;->b()J

    move-result-wide v0

    .line 12
    invoke-interface {p1, v0, v1, p2, p4}, Lr/x0;->b(JLr/q;Lr/q;)Lr/q;

    move-result-object p1

    .line 13
    invoke-static {p1}, Lr/r;->e(Lr/q;)Lr/q;

    move-result-object p1

    .line 14
    iput-object p1, p0, Lr/y;->f:Lr/q;

    .line 15
    invoke-virtual {p1}, Lr/q;->b()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    .line 16
    iget-object p3, p0, Lr/y;->f:Lr/q;

    invoke-virtual {p3, p2}, Lr/q;->a(I)F

    move-result p4

    .line 17
    iget-object v0, p0, Lr/y;->a:Lr/x0;

    invoke-interface {v0}, Lr/x0;->a()F

    move-result v0

    neg-float v0, v0

    .line 18
    iget-object v1, p0, Lr/y;->a:Lr/x0;

    invoke-interface {v1}, Lr/x0;->a()F

    move-result v1

    .line 19
    invoke-static {p4, v0, v1}, Lsh/m;->j(FFF)F

    move-result p4

    invoke-virtual {p3, p2, p4}, Lr/q;->e(IF)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lr/z;Lr/s0;Ljava/lang/Object;Lr/q;)V
    .locals 0

    .line 20
    invoke-interface {p1, p2}, Lr/z;->a(Lr/s0;)Lr/x0;

    move-result-object p1

    .line 21
    invoke-direct {p0, p1, p2, p3, p4}, Lr/y;-><init>(Lr/x0;Lr/s0;Ljava/lang/Object;Lr/q;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lr/y;->i:Z

    return v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lr/y;->h:J

    return-wide v0
.end method

.method public c()Lr/s0;
    .locals 1

    iget-object v0, p0, Lr/y;->b:Lr/s0;

    return-object v0
.end method

.method public d(J)Lr/q;
    .locals 3

    invoke-interface {p0, p1, p2}, Lr/d;->e(J)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lr/y;->a:Lr/x0;

    iget-object v1, p0, Lr/y;->d:Lr/q;

    iget-object v2, p0, Lr/y;->e:Lr/q;

    invoke-interface {v0, p1, p2, v1, v2}, Lr/x0;->b(JLr/q;Lr/q;)Lr/q;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lr/y;->f:Lr/q;

    return-object p1
.end method

.method public f(J)Ljava/lang/Object;
    .locals 4

    invoke-interface {p0, p1, p2}, Lr/d;->e(J)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr/y;->c()Lr/s0;

    move-result-object v0

    invoke-interface {v0}, Lr/s0;->b()Lmh/l;

    move-result-object v0

    iget-object v1, p0, Lr/y;->a:Lr/x0;

    iget-object v2, p0, Lr/y;->d:Lr/q;

    iget-object v3, p0, Lr/y;->e:Lr/q;

    invoke-interface {v1, p1, p2, v2, v3}, Lr/x0;->d(JLr/q;Lr/q;)Lr/q;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lr/y;->g()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/y;->g:Ljava/lang/Object;

    return-object v0
.end method
