.class public Lij/b$e;
.super Lij/b$d;
.source "SourceFile"

# interfaces
.implements Lgj/c;
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lij/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "e"
.end annotation


# direct methods
.method protected constructor <init>(Lij/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lij/b$d;-><init>(Lij/b;)V

    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lij/b$d;->a()Lij/b$c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lij/a$b;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getValue() can only be called after next() and before remove()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lij/b$d;->c()Lij/b$c;

    move-result-object v0

    invoke-virtual {v0}, Lij/a$b;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
