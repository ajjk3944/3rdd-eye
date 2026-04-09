.class public Lij/b$a;
.super Lij/b$d;
.source "SourceFile"

# interfaces
.implements Lgj/b;
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lij/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "a"
.end annotation


# direct methods
.method protected constructor <init>(Lij/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lij/b$d;-><init>(Lij/b;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/util/Map$Entry;
    .locals 1

    invoke-super {p0}, Lij/b$d;->c()Lij/b$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lij/b$a;->d()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
