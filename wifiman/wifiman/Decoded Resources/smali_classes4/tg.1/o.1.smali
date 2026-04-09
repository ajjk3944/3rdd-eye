.class public final Ltg/o;
.super Ltg/a;
.source "SourceFile"


# instance fields
.field private final b:Lkg/f;

.field private final c:Lkg/a;


# direct methods
.method public constructor <init>(Lgg/s;Lkg/f;Lkg/a;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/o;->b:Lkg/f;

    iput-object p3, p0, Ltg/o;->c:Lkg/a;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 4

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v1, Log/h;

    iget-object v2, p0, Ltg/o;->b:Lkg/f;

    iget-object v3, p0, Ltg/o;->c:Lkg/a;

    invoke-direct {v1, p1, v2, v3}, Log/h;-><init>(Lgg/x;Lkg/f;Lkg/a;)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
