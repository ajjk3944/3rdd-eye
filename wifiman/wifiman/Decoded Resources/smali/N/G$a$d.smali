.class final LN/G$a$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/G$a;->a(Lz/f;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/H;


# direct methods
.method constructor <init>(LN/H;)V
    .locals 0

    iput-object p1, p0, LN/G$a$d;->a:LN/H;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LY0/d;)J
    .locals 2

    iget-object p1, p0, LN/G$a$d;->a:LN/H;

    invoke-virtual {p1}, LN/H;->g()F

    move-result p1

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, LY0/o;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/d;

    invoke-virtual {p0, p1}, LN/G$a$d;->a(LY0/d;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->b(J)LY0/n;

    move-result-object p1

    return-object p1
.end method
