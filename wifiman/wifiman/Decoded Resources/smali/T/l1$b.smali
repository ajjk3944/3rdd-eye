.class final LT/l1$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/l1;->b()Lmh/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/l1;


# direct methods
.method constructor <init>(LT/l1;)V
    .locals 0

    iput-object p1, p0, LT/l1$b;->a:LT/l1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    iget-object v0, p0, LT/l1$b;->a:LT/l1;

    invoke-virtual {v0, p1, p2}, LT/l1;->m(J)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LT/l1$b;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
