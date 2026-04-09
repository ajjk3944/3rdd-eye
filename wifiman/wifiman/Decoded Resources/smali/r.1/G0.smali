.class public final Lr/G0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/z0;


# instance fields
.field private final a:F

.field private final b:F

.field private final synthetic c:Lr/A0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FFLr/q;)V
    .locals 0

    .line 5
    invoke-static {p3, p1, p2}, Lr/w0;->a(Lr/q;FF)Lr/s;

    move-result-object p3

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lr/G0;-><init>(FFLr/s;)V

    return-void
.end method

.method private constructor <init>(FFLr/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lr/G0;->a:F

    .line 3
    iput p2, p0, Lr/G0;->b:F

    .line 4
    new-instance p1, Lr/A0;

    invoke-direct {p1, p3}, Lr/A0;-><init>(Lr/s;)V

    iput-object p1, p0, Lr/G0;->c:Lr/A0;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lr/G0;->c:Lr/A0;

    invoke-interface {v0}, Lr/z0;->a()Z

    move-result v0

    return v0
.end method

.method public b(Lr/q;Lr/q;Lr/q;)J
    .locals 1

    iget-object v0, p0, Lr/G0;->c:Lr/A0;

    invoke-virtual {v0, p1, p2, p3}, Lr/A0;->b(Lr/q;Lr/q;Lr/q;)J

    move-result-wide p1

    return-wide p1
.end method

.method public c(JLr/q;Lr/q;Lr/q;)Lr/q;
    .locals 6

    iget-object v0, p0, Lr/G0;->c:Lr/A0;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lr/A0;->c(JLr/q;Lr/q;Lr/q;)Lr/q;

    move-result-object p1

    return-object p1
.end method

.method public d(Lr/q;Lr/q;Lr/q;)Lr/q;
    .locals 1

    iget-object v0, p0, Lr/G0;->c:Lr/A0;

    invoke-virtual {v0, p1, p2, p3}, Lr/A0;->d(Lr/q;Lr/q;Lr/q;)Lr/q;

    move-result-object p1

    return-object p1
.end method

.method public f(JLr/q;Lr/q;Lr/q;)Lr/q;
    .locals 6

    iget-object v0, p0, Lr/G0;->c:Lr/A0;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lr/A0;->f(JLr/q;Lr/q;Lr/q;)Lr/q;

    move-result-object p1

    return-object p1
.end method
