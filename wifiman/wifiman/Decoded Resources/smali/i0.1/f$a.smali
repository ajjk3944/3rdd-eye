.class final Li0/f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/f;->a(Lmh/l;Li0/g;)Li0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Li0/g;


# direct methods
.method constructor <init>(Lmh/l;Li0/g;)V
    .locals 0

    iput-object p1, p0, Li0/f$a;->a:Lmh/l;

    iput-object p2, p0, Li0/f$a;->b:Li0/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li0/b;)Li0/g;
    .locals 1

    iget-object v0, p0, Li0/f$a;->a:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Li0/f$a;->b:Li0/g;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li0/b;

    invoke-virtual {p0, p1}, Li0/f$a;->a(Li0/b;)Li0/g;

    move-result-object p1

    return-object p1
.end method
