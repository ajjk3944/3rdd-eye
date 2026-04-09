.class public final Lah/d$f;
.super Lah/d$d;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lah/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# direct methods
.method public constructor <init>(Lah/d;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lah/d$d;-><init>(Lah/d;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lah/d$d;->d()V

    invoke-virtual {p0}, Lah/d$d;->e()I

    move-result v0

    invoke-virtual {p0}, Lah/d$d;->g()Lah/d;

    move-result-object v1

    invoke-static {v1}, Lah/d;->j(Lah/d;)I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Lah/d$d;->e()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Lah/d$d;->i(I)V

    invoke-virtual {p0, v0}, Lah/d$d;->j(I)V

    invoke-virtual {p0}, Lah/d$d;->g()Lah/d;

    move-result-object v0

    invoke-static {v0}, Lah/d;->r(Lah/d;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lah/d$d;->f()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lah/d$d;->h()V

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
