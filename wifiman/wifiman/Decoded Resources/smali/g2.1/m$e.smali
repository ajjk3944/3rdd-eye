.class final Lg2/m$e;
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
.field final synthetic a:Lf2/w;

.field final synthetic b:Landroidx/lifecycle/o;


# direct methods
.method constructor <init>(Lf2/w;Landroidx/lifecycle/o;)V
    .locals 0

    iput-object p1, p0, Lg2/m$e;->a:Lf2/w;

    iput-object p2, p0, Lg2/m$e;->b:Landroidx/lifecycle/o;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 1

    iget-object p1, p0, Lg2/m$e;->a:Lf2/w;

    iget-object v0, p0, Lg2/m$e;->b:Landroidx/lifecycle/o;

    invoke-virtual {p1, v0}, Lf2/w;->s0(Landroidx/lifecycle/o;)V

    new-instance p1, Lg2/m$e$a;

    invoke-direct {p1}, Lg2/m$e$a;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Lg2/m$e;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
