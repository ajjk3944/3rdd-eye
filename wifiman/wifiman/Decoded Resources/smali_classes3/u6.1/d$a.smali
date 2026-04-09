.class final Lu6/d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu6/d;->b(Lu6/c;Ljava/lang/Object;Lmh/a;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;

.field final synthetic b:Lu6/c;

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lmh/a;Lu6/c;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lu6/d$a;->a:Lmh/a;

    iput-object p2, p0, Lu6/d$a;->b:Lu6/c;

    iput-object p3, p0, Lu6/d$a;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lu6/d$a;->a:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lu6/d$a;->b:Lu6/c;

    iget-object v2, p0, Lu6/d$a;->c:Ljava/lang/Object;

    invoke-interface {v1, v2, v0}, Lu6/c;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
