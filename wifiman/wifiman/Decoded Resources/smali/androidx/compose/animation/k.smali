.class public abstract Landroidx/compose/animation/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/k$a;
    }
.end annotation


# static fields
.field public static final a:Landroidx/compose/animation/k$a;

.field private static final b:Landroidx/compose/animation/k;

.field private static final c:Landroidx/compose/animation/k;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Landroidx/compose/animation/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/animation/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/animation/k;->a:Landroidx/compose/animation/k$a;

    new-instance v0, Landroidx/compose/animation/l;

    new-instance v10, Lq/A;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lq/A;-><init>(Lq/m;Lq/w;Lq/g;Lq/t;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/l;-><init>(Lq/A;)V

    sput-object v0, Landroidx/compose/animation/k;->b:Landroidx/compose/animation/k;

    new-instance v0, Landroidx/compose/animation/l;

    new-instance v10, Lq/A;

    const/16 v8, 0x2f

    const/4 v6, 0x1

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lq/A;-><init>(Lq/m;Lq/w;Lq/g;Lq/t;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/l;-><init>(Lq/A;)V

    sput-object v0, Landroidx/compose/animation/k;->c:Landroidx/compose/animation/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/animation/k;-><init>()V

    return-void
.end method

.method public static final synthetic a()Landroidx/compose/animation/k;
    .locals 1

    sget-object v0, Landroidx/compose/animation/k;->b:Landroidx/compose/animation/k;

    return-object v0
.end method


# virtual methods
.method public abstract b()Lq/A;
.end method

.method public final c(Landroidx/compose/animation/k;)Landroidx/compose/animation/k;
    .locals 9

    new-instance v0, Landroidx/compose/animation/l;

    new-instance v8, Lq/A;

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->c()Lq/m;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->c()Lq/m;

    move-result-object v1

    :cond_0
    move-object v2, v1

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->f()Lq/w;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->f()Lq/w;

    move-result-object v1

    :cond_1
    move-object v3, v1

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->a()Lq/g;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->a()Lq/g;

    move-result-object v1

    :cond_2
    move-object v4, v1

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->e()Lq/t;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->e()Lq/t;

    move-result-object v1

    :cond_3
    move-object v5, v1

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->d()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p0}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_0
    move v6, v1

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v1, 0x1

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->b()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->b()Ljava/util/Map;

    move-result-object p1

    invoke-static {v1, p1}, LZg/U;->n(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lq/A;-><init>(Lq/m;Lq/w;Lq/g;Lq/t;ZLjava/util/Map;)V

    invoke-direct {v0, v8}, Landroidx/compose/animation/l;-><init>(Lq/A;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Landroidx/compose/animation/k;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/animation/k;

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v0

    invoke-virtual {v0}, Lq/A;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    sget-object v0, Landroidx/compose/animation/k;->b:Landroidx/compose/animation/k;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ExitTransition.None"

    goto/16 :goto_3

    :cond_0
    sget-object v0, Landroidx/compose/animation/k;->c:Landroidx/compose/animation/k;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ExitTransition.KeepUntilTransitionsFinished"

    goto :goto_3

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ExitTransition: \nFade - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lq/A;->c()Lq/m;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lq/m;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nSlide - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lq/A;->f()Lq/w;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lq/w;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v3

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nShrink - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lq/A;->a()Lq/g;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lq/g;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_4
    move-object v2, v3

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nScale - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lq/A;->e()Lq/t;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lq/t;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_5
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nKeepUntilTransitionsFinished - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lq/A;->d()Z

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    return-object v0
.end method
