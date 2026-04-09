.class public abstract LLg/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLg/m$b;,
        LLg/m$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/EventListener;

.field private final b:Z


# direct methods
.method public constructor <init>(Ljava/util/EventListener;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLg/m;->a:Ljava/util/EventListener;

    iput-boolean p2, p0, LLg/m;->b:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/util/EventListener;
    .locals 1

    iget-object v0, p0, LLg/m;->a:Ljava/util/EventListener;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LLg/m;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LLg/m;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLg/m;->a()Ljava/util/EventListener;

    move-result-object v0

    check-cast p1, LLg/m;

    invoke-virtual {p1}, LLg/m;->a()Ljava/util/EventListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

    invoke-virtual {p0}, LLg/m;->a()Ljava/util/EventListener;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
