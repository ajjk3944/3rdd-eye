.class public LJ4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ4/a;


# instance fields
.field private final a:LD4/a;


# direct methods
.method public constructor <init>(LD4/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ4/e;->a:LD4/a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, LJ4/e;->a:LD4/a;

    const-string/jumbo v1, "clx"

    invoke-interface {v0, v1, p1, p2}, LD4/a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
