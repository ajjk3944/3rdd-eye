.class public abstract LFg/b;
.super Lgg/i;
.source "SourceFile"

# interfaces
.implements LDj/b;
.implements LDj/a;
.implements Lgg/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final h2()LFg/b;
    .locals 1

    instance-of v0, p0, LFg/d;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LFg/d;

    invoke-direct {v0, p0}, LFg/d;-><init>(LFg/b;)V

    return-object v0
.end method
