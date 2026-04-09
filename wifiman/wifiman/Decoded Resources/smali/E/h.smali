.class public abstract LE/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LE/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x32

    invoke-static {v0}, LE/h;->b(I)LE/g;

    move-result-object v0

    sput-object v0, LE/h;->a:LE/g;

    return-void
.end method

.method public static final a(F)LE/g;
    .locals 0

    invoke-static {p0}, LE/c;->a(F)LE/b;

    move-result-object p0

    invoke-static {p0}, LE/h;->c(LE/b;)LE/g;

    move-result-object p0

    return-object p0
.end method

.method public static final b(I)LE/g;
    .locals 0

    invoke-static {p0}, LE/c;->b(I)LE/b;

    move-result-object p0

    invoke-static {p0}, LE/h;->c(LE/b;)LE/g;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LE/b;)LE/g;
    .locals 1

    new-instance v0, LE/g;

    invoke-direct {v0, p0, p0, p0, p0}, LE/g;-><init>(LE/b;LE/b;LE/b;LE/b;)V

    return-object v0
.end method

.method public static final d(F)LE/g;
    .locals 0

    invoke-static {p0}, LE/c;->c(F)LE/b;

    move-result-object p0

    invoke-static {p0}, LE/h;->c(LE/b;)LE/g;

    move-result-object p0

    return-object p0
.end method

.method public static final e(FFFF)LE/g;
    .locals 1

    new-instance v0, LE/g;

    invoke-static {p0}, LE/c;->c(F)LE/b;

    move-result-object p0

    invoke-static {p1}, LE/c;->c(F)LE/b;

    move-result-object p1

    invoke-static {p2}, LE/c;->c(F)LE/b;

    move-result-object p2

    invoke-static {p3}, LE/c;->c(F)LE/b;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, LE/g;-><init>(LE/b;LE/b;LE/b;LE/b;)V

    return-object v0
.end method

.method public static synthetic f(FFFFILjava/lang/Object;)LE/g;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    int-to-float p0, v0

    invoke-static {p0}, LY0/h;->j(F)F

    move-result p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    int-to-float p1, v0

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    int-to-float p2, v0

    invoke-static {p2}, LY0/h;->j(F)F

    move-result p2

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    int-to-float p3, v0

    invoke-static {p3}, LY0/h;->j(F)F

    move-result p3

    :cond_3
    invoke-static {p0, p1, p2, p3}, LE/h;->e(FFFF)LE/g;

    move-result-object p0

    return-object p0
.end method

.method public static final g()LE/g;
    .locals 1

    sget-object v0, LE/h;->a:LE/g;

    return-object v0
.end method
