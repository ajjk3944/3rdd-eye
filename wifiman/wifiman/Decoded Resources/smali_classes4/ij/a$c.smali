.class public Lij/a$c;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lij/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "c"
.end annotation


# instance fields
.field private final a:Lij/a;


# direct methods
.method protected constructor <init>(Lij/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    iput-object p1, p0, Lij/a$c;->a:Lij/a;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Lij/a$c;->a:Lij/a;

    invoke-virtual {v0}, Lij/a;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lij/a$c;->a:Lij/a;

    invoke-virtual {v0, p1}, Lij/a;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lij/a$c;->a:Lij/a;

    invoke-virtual {v0}, Lij/a;->P()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lij/a$c;->a:Lij/a;

    invoke-virtual {v0, p1}, Lij/a;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lij/a$c;->a:Lij/a;

    invoke-virtual {v1, p1}, Lij/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lij/a$c;->a:Lij/a;

    invoke-virtual {v0}, Lij/a;->size()I

    move-result v0

    return v0
.end method
