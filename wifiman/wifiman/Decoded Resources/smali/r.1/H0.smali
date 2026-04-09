.class public final Lr/H0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/y0;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lr/E;

.field private final d:Lr/A0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILr/E;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lr/H0;->a:I

    iput p2, p0, Lr/H0;->b:I

    iput-object p3, p0, Lr/H0;->c:Lr/E;

    new-instance p1, Lr/A0;

    new-instance p2, Lr/L;

    invoke-virtual {p0}, Lr/H0;->g()I

    move-result v0

    invoke-virtual {p0}, Lr/H0;->e()I

    move-result v1

    invoke-direct {p2, v0, v1, p3}, Lr/L;-><init>(IILr/E;)V

    invoke-direct {p1, p2}, Lr/A0;-><init>(Lr/I;)V

    iput-object p1, p0, Lr/H0;->d:Lr/A0;

    return-void
.end method


# virtual methods
.method public c(JLr/q;Lr/q;Lr/q;)Lr/q;
    .locals 6

    iget-object v0, p0, Lr/H0;->d:Lr/A0;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lr/A0;->c(JLr/q;Lr/q;Lr/q;)Lr/q;

    move-result-object p1

    return-object p1
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lr/H0;->b:I

    return v0
.end method

.method public f(JLr/q;Lr/q;Lr/q;)Lr/q;
    .locals 6

    iget-object v0, p0, Lr/H0;->d:Lr/A0;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lr/A0;->f(JLr/q;Lr/q;Lr/q;)Lr/q;

    move-result-object p1

    return-object p1
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lr/H0;->a:I

    return v0
.end method
