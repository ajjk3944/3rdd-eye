.class final Lg2/g$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/g;->a(Lg2/i;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg2/i;

.field final synthetic b:Lf2/k;


# direct methods
.method constructor <init>(Lg2/i;Lf2/k;)V
    .locals 0

    iput-object p1, p0, Lg2/g$a;->a:Lg2/i;

    iput-object p2, p0, Lg2/g$a;->b:Lf2/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lg2/g$a;->a:Lg2/i;

    iget-object v1, p0, Lg2/g$a;->b:Lf2/k;

    invoke-virtual {v0, v1}, Lg2/i;->m(Lf2/k;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg2/g$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
