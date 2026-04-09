.class public LK6/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG6/N$d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/s;
    .locals 1

    new-instance v0, LK6/V$a;

    invoke-direct {v0, p0}, LK6/V$a;-><init>(LK6/V;)V

    invoke-virtual {p1, v0}, Lgg/s;->Q(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lgg/s;)Lgg/v;
    .locals 0

    invoke-virtual {p0, p1}, LK6/V;->a(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
