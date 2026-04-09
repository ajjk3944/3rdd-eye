.class public Lij/b$f;
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
    name = "f"
.end annotation


# direct methods
.method protected constructor <init>(Lij/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lij/b$d;-><init>(Lij/b;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lij/b$d;->c()Lij/b$c;

    move-result-object v0

    invoke-virtual {v0}, Lij/a$b;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
