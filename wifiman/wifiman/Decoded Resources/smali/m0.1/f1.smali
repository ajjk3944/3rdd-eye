.class public abstract Lm0/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;
    .locals 0

    invoke-static/range {p0 .. p6}, Lm0/Z;->a(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(JJLjava/util/List;Ljava/util/List;IILjava/lang/Object;)Landroid/graphics/Shader;
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    and-int/lit8 p5, p7, 0x10

    if-eqz p5, :cond_1

    sget-object p5, Lm0/m1;->a:Lm0/m1$a;

    invoke-virtual {p5}, Lm0/m1$a;->a()I

    move-result p6

    :cond_1
    move v6, p6

    move-wide v0, p0

    move-wide v2, p2

    move-object v4, p4

    invoke-static/range {v0 .. v6}, Lm0/f1;->a(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;

    move-result-object p0

    return-object p0
.end method

.method public static final c(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;
    .locals 0

    invoke-static/range {p0 .. p5}, Lm0/Z;->b(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;

    move-result-object p0

    return-object p0
.end method
