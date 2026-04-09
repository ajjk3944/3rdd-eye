.class final LC/C$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/C;->m(IFLr/i;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/C;


# direct methods
.method constructor <init>(LC/C;)V
    .locals 0

    iput-object p1, p0, LC/C$b;->a:LC/C;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lw/v;I)V
    .locals 1

    iget-object v0, p0, LC/C$b;->a:LC/C;

    invoke-virtual {v0, p1, p2}, LC/C;->k0(Lw/v;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw/v;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LC/C$b;->a(Lw/v;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
