.class final Lf2/r$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/r;->I(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf2/r$e;->a:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lf2/p;
    .locals 2

    new-instance v0, Lf2/p$a;

    invoke-direct {v0}, Lf2/p$a;-><init>()V

    iget-object v1, p0, Lf2/r$e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lf2/p$a;->b(Ljava/lang/String;)Lf2/p$a;

    move-result-object v0

    invoke-virtual {v0}, Lf2/p$a;->a()Lf2/p;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf2/r$e;->a()Lf2/p;

    move-result-object v0

    return-object v0
.end method
