.class final LI/e1$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1;->q(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/e1;

.field final synthetic b:I


# direct methods
.method constructor <init>(LI/e1;I)V
    .locals 0

    iput-object p1, p0, LI/e1$f;->a:LI/e1;

    iput p2, p0, LI/e1$f;->b:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, LI/e1$f;->a:LI/e1;

    iget v1, p0, LI/e1$f;->b:I

    invoke-static {v0, v1}, LI/e1;->Q2(LI/e1;I)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI/e1$f;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
