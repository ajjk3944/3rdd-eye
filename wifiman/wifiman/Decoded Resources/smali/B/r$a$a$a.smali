.class final LB/r$a$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/r$a$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/r$a;


# direct methods
.method constructor <init>(LB/r$a;)V
    .locals 0

    iput-object p1, p0, LB/r$a$a$a;->a:LB/r$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 1

    iget-object p1, p0, LB/r$a$a$a;->a:LB/r$a;

    new-instance v0, LB/r$a$a$a$a;

    invoke-direct {v0, p1}, LB/r$a$a$a$a;-><init>(LB/r$a;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, LB/r$a$a$a;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
