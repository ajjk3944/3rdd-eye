.class public final Lrg/x;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/x$a;
    }
.end annotation


# instance fields
.field final a:Lgg/r;


# direct methods
.method public constructor <init>(Lgg/r;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Lrg/x;->a:Lgg/r;

    return-void
.end method

.method public static i1(Lgg/x;)Lgg/p;
    .locals 1

    new-instance v0, Lrg/x$a;

    invoke-direct {v0, p0}, Lrg/x$a;-><init>(Lgg/x;)V

    return-object v0
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 1

    iget-object v0, p0, Lrg/x;->a:Lgg/r;

    invoke-static {p1}, Lrg/x;->i1(Lgg/x;)Lgg/p;

    move-result-object p1

    invoke-interface {v0, p1}, Lgg/r;->a(Lgg/p;)V

    return-void
.end method
