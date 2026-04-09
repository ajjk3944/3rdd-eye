.class public final Lug/z;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/z$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;


# direct methods
.method public constructor <init>(Lgg/D;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Lug/z;->a:Lgg/D;

    return-void
.end method

.method public static i1(Lgg/x;)Lgg/B;
    .locals 1

    new-instance v0, Lug/z$a;

    invoke-direct {v0, p0}, Lug/z$a;-><init>(Lgg/x;)V

    return-object v0
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 1

    iget-object v0, p0, Lug/z;->a:Lgg/D;

    invoke-static {p1}, Lug/z;->i1(Lgg/x;)Lgg/B;

    move-result-object p1

    invoke-interface {v0, p1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
