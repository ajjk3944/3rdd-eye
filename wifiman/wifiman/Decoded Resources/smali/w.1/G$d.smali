.class final Lw/G$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/G;->h(Lmh/l;Lmh/a;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/G;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(Lw/G;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lw/G$d;->a:Lw/G;

    iput-object p2, p0, Lw/G$d;->b:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    iget-object p1, p0, Lw/G$d;->a:Lw/G;

    invoke-virtual {p1}, Lw/G;->i()F

    move-result p1

    iget-object p2, p0, Lw/G$d;->a:Lw/G;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lw/G;->j(F)V

    iget-object p2, p0, Lw/G$d;->b:Lmh/l;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lw/G$d;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
