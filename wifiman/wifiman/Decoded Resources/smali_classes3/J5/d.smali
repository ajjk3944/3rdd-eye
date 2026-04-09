.class public abstract LJ5/d;
.super Lgg/s;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract accept(Ljava/lang/Object;)V
.end method

.method public abstract i1()Z
.end method

.method public final j1()LJ5/d;
    .locals 1

    instance-of v0, p0, LJ5/e;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LJ5/e;

    invoke-direct {v0, p0}, LJ5/e;-><init>(LJ5/d;)V

    return-object v0
.end method
