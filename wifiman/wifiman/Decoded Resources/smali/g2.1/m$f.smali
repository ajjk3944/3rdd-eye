.class final Lg2/m$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m;->a(Lf2/w;Lf2/t;Landroidx/compose/ui/e;Lf0/c;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/z1;

.field final synthetic b:Lg2/e;


# direct methods
.method constructor <init>(LT/z1;Lg2/e;)V
    .locals 0

    iput-object p1, p0, Lg2/m$f;->a:LT/z1;

    iput-object p2, p0, Lg2/m$f;->b:Lg2/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 2

    iget-object p1, p0, Lg2/m$f;->a:LT/z1;

    iget-object v0, p0, Lg2/m$f;->b:Lg2/e;

    new-instance v1, Lg2/m$f$a;

    invoke-direct {v1, p1, v0}, Lg2/m$f$a;-><init>(LT/z1;Lg2/e;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Lg2/m$f;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
