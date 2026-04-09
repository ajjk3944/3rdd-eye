.class public abstract LHg/d;
.super Lgg/s;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    return-void
.end method


# virtual methods
.method public final i1()LHg/d;
    .locals 1

    instance-of v0, p0, LHg/c;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LHg/c;

    invoke-direct {v0, p0}, LHg/c;-><init>(LHg/d;)V

    return-object v0
.end method
