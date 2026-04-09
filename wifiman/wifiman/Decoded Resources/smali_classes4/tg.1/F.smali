.class public final Ltg/F;
.super Lgg/s;
.source "SourceFile"


# instance fields
.field final a:Lgg/v;


# direct methods
.method public constructor <init>(Lgg/v;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/F;->a:Lgg/v;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 1

    iget-object v0, p0, Ltg/F;->a:Lgg/v;

    invoke-interface {v0, p1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
