.class final LIi/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIi/u0;


# instance fields
.field private final a:LIi/I0;


# direct methods
.method public constructor <init>(LIi/I0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIi/t0;->a:LIi/I0;

    return-void
.end method


# virtual methods
.method public b()LIi/I0;
    .locals 1

    iget-object v0, p0, LIi/t0;->a:LIi/I0;

    return-object v0
.end method

.method public isActive()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
