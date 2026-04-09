.class final LN/H$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/H$a;->a(Lmh/l;)Lc0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;)V
    .locals 0

    iput-object p1, p0, LN/H$a$b;->a:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LN/I;)LN/H;
    .locals 2

    new-instance v0, LN/H;

    iget-object v1, p0, LN/H$a$b;->a:Lmh/l;

    invoke-direct {v0, p1, v1}, LN/H;-><init>(LN/I;Lmh/l;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/I;

    invoke-virtual {p0, p1}, LN/H$a$b;->a(LN/I;)LN/H;

    move-result-object p1

    return-object p1
.end method
