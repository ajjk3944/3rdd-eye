.class public final Ljj/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/b;


# static fields
.field public static final d:I


# instance fields
.field private final a:F

.field private final b:Lr/a;

.field private final c:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lr/a;->m:I

    sput v0, Ljj/j;->d:I

    return-void
.end method

.method public constructor <init>(F)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ljj/j;->a:F

    .line 2
    new-instance p1, Lr/a;

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->d(J)Ll0/g;

    move-result-object v1

    invoke-static {v0}, Lr/u0;->h(Ll0/g$a;)Lr/s0;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Ljj/j;->b:Lr/a;

    const/4 p1, 0x0

    const/4 v0, 0x2

    .line 3
    invoke-static {p1, p1, v0, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Ljj/j;->c:LT/q0;

    return-void
.end method

.method public synthetic constructor <init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/high16 p1, 0x43c80000    # 400.0f

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ljj/j;-><init>(F)V

    return-void
.end method

.method private c(Ljj/d;)V
    .locals 1

    iget-object v0, p0, Ljj/j;->c:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Ljj/j;->b:Lr/a;

    invoke-virtual {v0}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/g;

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public b(Ljj/d;JLdh/e;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p4, Ljj/j$a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ljj/j$a;

    iget v1, v0, Ljj/j$a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ljj/j$a;->d:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ljj/j$a;

    invoke-direct {v0, p0, p4}, Ljj/j$a;-><init>(Ljj/j;Ldh/e;)V

    goto :goto_0

    :goto_1
    iget-object p4, v6, Ljj/j$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, Ljj/j$a;->d:I

    const/4 v9, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Ljj/j$a;->a:Ljava/lang/Object;

    check-cast p1, Ljj/j;

    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Ljj/j$a;->a:Ljava/lang/Object;

    check-cast p1, Ljj/j;

    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Ljj/j;->c(Ljj/d;)V

    iget-object p1, p0, Ljj/j;->b:Lr/a;

    invoke-static {p2, p3}, Ll0/g;->d(J)Ll0/g;

    move-result-object p2

    iput-object p0, v6, Ljj/j$a;->a:Ljava/lang/Object;

    iput v3, v6, Ljj/j$a;->d:I

    invoke-virtual {p1, p2, v6}, Lr/a;->t(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-object p1, p0

    :goto_2
    iget-object v1, p1, Ljj/j;->b:Lr/a;

    sget-object p2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p2}, Ll0/g$a;->c()J

    move-result-wide p3

    invoke-static {p3, p4}, Ll0/g;->d(J)Ll0/g;

    move-result-object p3

    iget p4, p1, Ljj/j;->a:F

    invoke-static {p2}, Lr/I0;->e(Ll0/g$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/g;->d(J)Ll0/g;

    move-result-object p2

    const/4 v4, 0x0

    invoke-static {v4, p4, p2, v3, v9}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object v3

    iput-object p1, v6, Ljj/j$a;->a:Ljava/lang/Object;

    iput v2, v6, Ljj/j$a;->d:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    move-object v2, p3

    invoke-static/range {v1 .. v8}, Lr/a;->f(Lr/a;Ljava/lang/Object;Lr/i;Ljava/lang/Object;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    return-object v0

    :cond_5
    :goto_3
    invoke-direct {p1, v9}, Ljj/j;->c(Ljj/d;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public getPosition()Ljj/d;
    .locals 1

    iget-object v0, p0, Ljj/j;->c:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljj/d;

    return-object v0
.end method
