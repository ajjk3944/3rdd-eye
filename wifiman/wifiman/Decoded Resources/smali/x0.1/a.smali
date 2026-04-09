.class public interface abstract Lx0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic B1(Lx0/a;JJLdh/e;)Ljava/lang/Object;
    .locals 0

    sget-object p0, LY0/y;->b:LY0/y$a;

    invoke-virtual {p0}, LY0/y$a;->a()J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/y;->b(J)LY0/y;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v0(Lx0/a;JLdh/e;)Ljava/lang/Object;
    .locals 0

    sget-object p0, LY0/y;->b:LY0/y$a;

    invoke-virtual {p0}, LY0/y$a;->a()J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/y;->b(J)LY0/y;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public L1(JJI)J
    .locals 0

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    return-wide p1
.end method

.method public R(JLdh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lx0/a;->v0(Lx0/a;JLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public V0(JI)J
    .locals 0

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    return-wide p1
.end method

.method public g1(JJLdh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, Lx0/a;->B1(Lx0/a;JJLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
