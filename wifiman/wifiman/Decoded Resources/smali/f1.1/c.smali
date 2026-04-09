.class public Lf1/c;
.super Landroidx/constraintlayout/core/parser/b;
.source "SourceFile"


# direct methods
.method public constructor <init>([C)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/constraintlayout/core/parser/b;-><init>([C)V

    return-void
.end method

.method public static x(Ljava/lang/String;)Lf1/c;
    .locals 3

    new-instance v0, Lf1/c;

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    invoke-direct {v0, v1}, Lf1/c;-><init>([C)V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/constraintlayout/core/parser/b;->w(J)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Landroidx/constraintlayout/core/parser/b;->u(J)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lf1/c;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lf1/c;

    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    invoke-super {p0, p1}, Landroidx/constraintlayout/core/parser/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Landroidx/constraintlayout/core/parser/b;->hashCode()I

    move-result v0

    return v0
.end method
